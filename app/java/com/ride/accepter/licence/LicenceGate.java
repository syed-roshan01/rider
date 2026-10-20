package com.ride.accepter.licence;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;

import com.ride.accepter.activation.ActivationActivity;
import com.ride.accepter.activation.DeviceIdentity;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * The app-side licence gate: everything that decides whether this install may
 * run, and the only place allowed to talk to the licence server.
 *
 * Model (mirrors the server design in license/README.md):
 *   - The licence key is minted by the seller BOUND TO this phone's device
 *     code (the "machine id"), so it is useless anywhere else.
 *   - Activation returns a short-lived Ed25519-signed token bound to
 *     hashDeviceCode(thisDeviceCode). The token is verified OFFLINE on every
 *     check - a forged or copied token never passes.
 *   - /api/v1/refresh re-validates against the SERVER (the authoritative
 *     check: revocation, expiry, device binding) and rolls the token.
 *
 * The engine's per-event gate calls engineGateOk(Context) (wired in smali), so
 * a revoked or expired licence also stops the auto-accept engine itself.
 */
public final class LicenceGate {

    private static final String TAG = "AcceptPro-Licence";
    static final String PREFS = "ra_license";

    /** Reason codes shared with the UI. */
    public static final String OK = "OK";
    public static final String OFFLINE = "OFFLINE";
    public static final String SKIP = "SKIP";

    /** Don't hammer the server: re-validate at most this often. */
    private static final long REFRESH_THROTTLE_MS = 60 * 60 * 1000; // 1 h

    /** engineGateOk cache: full verification is tens of ms; events are fast. */
    private static volatile long gateCacheAt;
    private static volatile boolean gateCacheOk;

    private LicenceGate() {
    }

    /** Verification result. */
    public static final class Result {
        public final boolean ok;
        public final String reason; // LicenceCore code, or OK
        public final long licenceExpiresAt;

        Result(boolean ok, String reason, long licenceExpiresAt) {
            this.ok = ok;
            this.reason = reason;
            this.licenceExpiresAt = licenceExpiresAt;
        }
    }

    public interface RefreshCb {
        void onRefresh(String outcome, String detail);
    }

    // ------------------------------------------------------------------
    // identity + state
    // ------------------------------------------------------------------

    public static String deviceCode(Context ctx) {
        return DeviceIdentity.deviceCode(androidId(ctx), Build.BRAND, Build.MODEL);
    }

    private static String androidId(Context ctx) {
        try {
            String id = Settings.Secure.getString(ctx.getContentResolver(), Settings.Secure.ANDROID_ID);
            return id == null ? "" : id;
        } catch (Throwable t) {
            return "";
        }
    }

    private static SharedPreferences prefs(Context ctx) {
        return ctx.getApplicationContext().getSharedPreferences(PREFS, Context.MODE_PRIVATE);
    }

    public static boolean hasKey(Context ctx) {
        return !prefs(ctx).getString("token", "").isEmpty();
    }

    public static long licenceExpiry(Context ctx) {
        return prefs(ctx).getLong("licenceExpiry", 0);
    }

    public static String storedStatus(Context ctx) {
        return prefs(ctx).getString("status", "");
    }

    public static void clear(Context ctx) {
        prefs(ctx).edit().clear().apply();
        gateCacheAt = 0;
        gateCacheOk = false;
    }

    // ------------------------------------------------------------------
    // the local verification - used by the launcher screen, the dashboard
    // AND the engine gate (same rule everywhere)
    // ------------------------------------------------------------------

    /**
     * Full offline verification of the cached grant: Ed25519 signature over the
     * token (pinned public key), the machine binding (token.hw must equal this
     * phone's hashDeviceCode) and the entitlement rule. Cheap enough for launch
     * checks; engineGateOk() caches it for the per-event path.
     */
    public static Result fullVerify(Context ctx, long now) {
        SharedPreferences p = prefs(ctx);
        String token = p.getString("token", "");
        long licenceExpiresAt = p.getLong("licenceExpiry", 0);
        String status = p.getString("status", "");
        if (token.isEmpty()) {
            return new Result(false, LicenceCore.NOT_ACTIVATED, 0);
        }
        LicenceCore.Token tok;
        try {
            tok = LicenceCore.verifyToken(token, ActivationActivity.PINNED_PUBLIC_KEY, now);
        } catch (IllegalArgumentException e) {
            String msg = e.getMessage() == null ? "" : e.getMessage();
            String code = msg.contains("expired") ? LicenceCore.TOKEN_EXPIRED : LicenceCore.BAD_TOKEN;
            return new Result(false, code, licenceExpiresAt);
        }
        String hw = LicenceCore.hashDeviceCode(deviceCode(ctx));
        String decision = LicenceCore.evaluateLocal(status, licenceExpiresAt, tok, hw, now);
        return new Result(LicenceCore.OK.equals(decision), decision, licenceExpiresAt);
    }

    /**
     * The engine's per-event gate (called from smali with a 30 s result cache).
     * Fail-closed: no verified, machine-bound, unexpired grant -> no engine.
     */
    public static boolean engineGateOk(Context ctx) {
        long now = System.currentTimeMillis();
        if (now - gateCacheAt < 30_000) {
            return gateCacheOk;
        }
        boolean ok = fullVerify(ctx, now).ok;
        gateCacheAt = now;
        gateCacheOk = ok;
        Log.i(TAG, "engine gate: " + (ok ? "ALLOW" : "DENY"));
        return ok;
    }

    // ------------------------------------------------------------------
    // activation - the login: key in, machine-bound token out
    // ------------------------------------------------------------------

    /**
     * Activate {@code key} on THIS machine. The key must have been minted for
     * this phone's device code; anything else is refused server-side with
     * DEVICE_MISMATCH and the token that comes back is verified locally before
     * it is ever trusted (including the pinned public key).
     */
    public static Result activate(final Context ctx, String key) {
        try {
            LicenceCore.normalizeKey(key); // fail fast on typos, before the network
        } catch (IllegalArgumentException e) {
            return new Result(false, "BAD_FORMAT", 0);
        }
        try {
            String code = deviceCode(ctx);
            JSONObject body = new JSONObject();
            body.put("key", key);
            body.put("deviceCode", code);
            body.put("appVersion", 6);
            body.put("model", Build.MODEL);
            body.put("brand", Build.BRAND);
            body.put("integrity", "OK");
            JSONObject device = new JSONObject();
            device.put("androidId", androidId(ctx));
            device.put("model", Build.MODEL);
            device.put("brand", Build.BRAND);
            body.put("device", device);

            JSONObject r = postJson(ctx, "/api/v1/activate", body);
            if (r == null) {
                return new Result(false, OFFLINE, 0);
            }
            boolean ok = r.optBoolean("ok", false);
            if (!ok) {
                return new Result(false, r.optString("reason", "FAILED"), 0);
            }
            // refuse a server that presents any key other than the pinned one
            if (!ActivationActivity.PINNED_PUBLIC_KEY.equals(r.optString("publicKey", ""))) {
                Log.e(TAG, "activation refused: server key does not match the pin");
                return new Result(false, "BAD_TOKEN", 0);
            }
            String token = r.optString("token", "");
            long tokenExp = r.optLong("expiresAt", 0);
            long licenceExp = r.optJSONObject("license") == null ? 0
                    : r.getJSONObject("license").optLong("expiresAt", 0);
            String plan = r.optJSONObject("license") == null ? ""
                    : r.getJSONObject("license").optString("planType", "");

            SharedPreferences.Editor e = prefs(ctx).edit();
            e.putString("token", token);
            e.putLong("tokenExp", tokenExp);
            e.putLong("licenceExpiry", licenceExp);
            e.putString("status", "active");
            e.putString("plan", plan);
            e.putString("key", key);
            e.putLong("lastRefresh", System.currentTimeMillis());
            e.apply();
            gateCacheAt = 0;

            // never accept an unverified grant: run the same check as the gate
            Result v = fullVerify(ctx, System.currentTimeMillis());
            if (!v.ok) {
                clear(ctx);
                return v;
            }
            Log.i(TAG, "activated; machine binding ok");
            return v;
        } catch (Exception ex) {
            Log.e(TAG, "activate failed", ex);
            return new Result(false, OFFLINE, 0);
        }
    }

    // ------------------------------------------------------------------
    // refresh - the SERVER-side re-validation (revocation lives here)
    // ---------------------------------------------------------------------------

    /** Fire a throttled background re-validation. Safe to call from any screen. */
    public static void maybeRefreshAsync(final Context ctx, final RefreshCb cb) {
        final long now = System.currentTimeMillis();
        long last = prefs(ctx).getLong("lastRefresh", 0);
        if (now - last < REFRESH_THROTTLE_MS) {
            if (cb != null) {
                cb.onRefresh(SKIP, "");
            }
            return;
        }
        refreshAsync(ctx, cb);
    }

    /** Force a background re-validation now. */
    public static void refreshAsync(final Context ctx, final RefreshCb cb) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String outcome;
                String detail = "";
                try {
                    SharedPreferences p = prefs(ctx);
                    String token = p.getString("token", "");
                    String key = p.getString("key", "");
                    if (token.isEmpty() || key.isEmpty()) {
                        outcome = LicenceCore.NOT_ACTIVATED;
                    } else {
                        JSONObject body = new JSONObject();
                        body.put("key", key);
                        body.put("token", token);
                        body.put("deviceCode", deviceCode(ctx));
                        JSONObject r = postJson(ctx, "/api/v1/refresh", body);
                        if (r == null) {
                            outcome = OFFLINE; // offline: the local 72h grant keeps running
                        } else if (r.optBoolean("ok", false)) {
                            long remain = r.optLong("remainingMs", 0);
                            SharedPreferences.Editor e = p.edit();
                            e.putString("token", r.optString("token", token));
                            e.putLong("tokenExp", r.optLong("expiresAt", 0));
                            if (remain > 0) {
                                e.putLong("licenceExpiry", System.currentTimeMillis() + remain);
                            }
                            e.putLong("lastRefresh", System.currentTimeMillis());
                            e.apply();
                            gateCacheAt = 0;
                            Result v = fullVerify(ctx, System.currentTimeMillis());
                            outcome = v.ok ? OK : v.reason;
                            if (!v.ok) {
                                hardFail(ctx);
                                detail = "local re-verify failed: " + v.reason;
                            }
                        } else {
                            // the SERVER said no: revoked / expired / foreign device
                            outcome = r.optString("reason", "FAILED");
                            hardFail(ctx);
                            detail = "server refused: " + outcome;
                        }
                    }
                } catch (Throwable t) {
                    outcome = OFFLINE;
                }
                Log.i(TAG, "refresh -> " + outcome + (detail.isEmpty() ? "" : " (" + detail + ")"));
                if (cb != null) {
                    cb.onRefresh(outcome, detail);
                }
            }
        }).start();
    }

    /** Revoke local trust and stop the engine - the server has the final word. */
    private static void hardFail(Context ctx) {
        clear(ctx);
        stopEngine(ctx);
    }

    /** Stop the auto-accept engine (best effort - the smali gate also denies). */
    public static void stopEngine(Context ctx) {
        try {
            Class.forName("com.auto.accept.service.RideAcceptorService")
                    .getMethod("setServiceEnabled", boolean.class).invoke(null, false);
        } catch (Throwable ignored) {
        }
    }

    // ------------------------------------------------------------------
    // transport
    // ------------------------------------------------------------------

    private static JSONObject postJson(Context ctx, String path, JSONObject body) {
        HttpURLConnection c = null;
        try {
            c = (HttpURLConnection) new URL(ActivationActivity.SERVER + path).openConnection();
            c.setRequestMethod("POST");
            c.setRequestProperty("content-type", "application/json; charset=utf-8");
            c.setConnectTimeout(8000);
            c.setReadTimeout(12000);
            c.setDoOutput(true);
            OutputStream os = c.getOutputStream();
            os.write(body.toString().getBytes(StandardCharsets.UTF_8));
            os.close();

            int code = c.getResponseCode();
            InputStream in = code < 400 ? c.getInputStream() : c.getErrorStream();
            StringBuilder sb = new StringBuilder();
            if (in != null) {
                BufferedReader br = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }
                br.close();
            }
            String s = sb.toString().trim();
            Log.i(TAG, "POST " + path + " -> HTTP " + code);
            return s.isEmpty() ? null : new JSONObject(s);
        } catch (Exception e) {
            Log.w(TAG, "POST " + path + " failed: " + e);
            return null;
        } finally {
            if (c != null) {
                c.disconnect();
            }
        }
    }
}
