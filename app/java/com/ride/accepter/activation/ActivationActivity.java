package com.ride.accepter.activation;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.InputFilter;
import android.text.InputType;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.ride.accepter.ui.Ui;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * The only entry point of the app. No email/password, no Firebase login:
 * it shows this phone's Device ID, takes the licence key the seller issued
 * against that ID, activates it, and only then hands over to MainActivity.
 *
 * Built from plain Android Views (not Compose) and compiled to classes2.dex so
 * the obfuscated classes.dex is never touched.
 */
public class ActivationActivity extends Activity {

    /** Change this to your real endpoint; production must be HTTPS. */
    public static final String SERVER = "https://ckyfcwbnakbaitzurnze.supabase.co/functions/v1";

    /**
     * Ed25519 public key, pinned at build time. The activation response must
     * match this exactly or we refuse to activate.
     *
     * Without the pin the app used to cache whatever "publicKey" the server
     * returned. That is a substitution hole: anyone who intercepts first
     * contact can hand over their own key and then sign forged tokens that the
     * app will accept offline forever. Pinning makes the key a property of the
     * build, not of the network.
     */
    public static final String PINNED_PUBLIC_KEY =
            "MCowBQYDK2VwAyEAkG6Qwwc6G90nANvj3FdwjUqSC5xyBRYT7frebqjkM04=";

    /** Last transport error, surfaced in the UI so failures are diagnosable. */
    private volatile String lastError;

    private static final String PREFS = "ra_license";
    private Ui ui;

    private EditText keyInput;
    private TextView activateBtn;
    private TextView status;
    private ProgressBar spinner;
    private String code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        code = DeviceIdentity.deviceCode(androidId(), Build.BRAND, Build.MODEL);

        // Already licensed? Straight through, no ceremony.
        if (isLicensed()) {
            goMain();
            return;
        }
        // paint the window before the view tree exists so there is no white flash
        ui = new Ui(this, getSharedPreferences("ra_state", MODE_PRIVATE)
                .getBoolean("ui_dark", true));
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(ui.bg));
        buildUi();
    }

    private boolean isLicensed() {
        // Real offline verification: Ed25519 signature over the cached token
        // (pinned key), the machine binding (token.hw == this phone's
        // hashDeviceCode) and the entitlement rule - the same check the engine
        // gate applies. A forged prefs edit or a token copied from another
        // phone can never pass this.
        com.ride.accepter.licence.LicenceGate.Result r =
                com.ride.accepter.licence.LicenceGate.fullVerify(this, System.currentTimeMillis());
        if (!r.ok) {
            android.util.Log.i("AcceptPro-Licence", "launch check: " + r.reason);
        }
        return r.ok;
    }

    // ---------------------------------------------------------------- UI

    private void buildUi() {
        android.widget.ScrollView scroll = new android.widget.ScrollView(this);
        scroll.setFillViewport(true);
        scroll.setVerticalScrollBarEnabled(false);

        LinearLayout root = ui.col();
        root.setGravity(Gravity.CENTER_HORIZONTAL);
        root.setPadding(dp(24), dp(36), dp(24), dp(28));

        // ---- brand block (design system, screen 01)
        android.widget.ImageView logo = new android.widget.ImageView(this);
        int logoId = getResources().getIdentifier("logo", "drawable", getPackageName());
        if (logoId != 0) {
            logo.setImageResource(logoId);
        }
        LinearLayout.LayoutParams lg = new LinearLayout.LayoutParams(dp(64), dp(64));
        lg.gravity = Gravity.CENTER_HORIZONTAL;
        root.addView(logo, lg);

        LinearLayout wm = ui.row();
        wm.setGravity(Gravity.CENTER);
        wm.addView(ui.text("Accept", Ui.H1, ui.ink, true));
        wm.addView(ui.text("Pro", Ui.H1, ui.primary, true));
        LinearLayout.LayoutParams wl = ui.wrap();
        wl.gravity = Gravity.CENTER_HORIZONTAL;
        wl.topMargin = dp(12);
        root.addView(wm, wl);

        TextView tag = ui.body("Auto-accept for gig drivers");
        tag.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams tl = ui.matchWrap();
        tl.topMargin = dp(4);
        root.addView(tag, tl);

        root.addView(ui.spacer(dp(28)));

        // ---- device id (copyable)
        root.addView(ui.label("Your device id"));
        root.addView(ui.spacer(dp(8)));
        LinearLayout codeRow = ui.row();
        codeRow.setGravity(Gravity.CENTER_VERTICAL);
        codeRow.setPadding(dp(14), dp(2), dp(2), dp(2));
        codeRow.setBackground(ui.shape(ui.surfaceHigh, 12, true));
        TextView codeView = ui.text(code, Ui.ROW, ui.ink, true);
        codeView.setTypeface(Typeface.MONOSPACE, Typeface.BOLD);
        codeView.setSingleLine(true);
        codeView.setLetterSpacing(0.06f);
        codeRow.addView(codeView, new LinearLayout.LayoutParams(0,
                ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        View copy = ui.icon("copy", ui.primary, 22);
        copy.setPadding(dp(14), dp(14), dp(14), dp(14));
        copy.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                if (cm != null) {
                    cm.setPrimaryClip(ClipData.newPlainText("Device ID", code));
                }
                Toast.makeText(ActivationActivity.this, "Device ID copied", Toast.LENGTH_SHORT).show();
            }
        });
        codeRow.addView(copy);
        root.addView(codeRow, ui.matchWrap());

        root.addView(ui.spacer(dp(8)));
        root.addView(ui.caption("Send this ID to your seller to get your licence key."));

        root.addView(ui.spacer(dp(20)));
        root.addView(ui.label("Enter licence key"));
        root.addView(ui.spacer(dp(8)));
        keyInput = ui.field("RA-XXXXX-XXXXX-XXXXX-XXXXX-XXXXX", true);
        keyInput.setFilters(new InputFilter[]{new InputFilter.LengthFilter(40)});
        root.addView(keyInput, ui.matchWrap());

        root.addView(ui.spacer(dp(16)));
        activateBtn = ui.button("Activate", Ui.PRIMARY, new View.OnClickListener() {
            @Override public void onClick(View v) {
                activate();
            }
        });
        root.addView(activateBtn, ui.matchWrap());

        TextView how = ui.button("How to get a key?", Ui.LINK, new View.OnClickListener() {
            @Override public void onClick(View v) {
                openSite();
            }
        });
        LinearLayout.LayoutParams hl = ui.matchWrap();
        hl.topMargin = dp(4);
        root.addView(how, hl);

        spinner = new ProgressBar(this);
        LinearLayout.LayoutParams spn = new LinearLayout.LayoutParams(dp(28), dp(28));
        spn.gravity = Gravity.CENTER_HORIZONTAL;
        spn.topMargin = dp(14);
        spinner.setLayoutParams(spn);
        spinner.setVisibility(View.GONE);
        root.addView(spinner);

        status = ui.text("", Ui.BODY, ui.inkSoft, false);
        status.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams st = ui.matchWrap();
        st.topMargin = dp(12);
        status.setLayoutParams(st);
        root.addView(status);

        // ---- trust list (design system, screen 01)
        root.addView(ui.spacer(dp(28)));
        String[][] trust = {
                { "shield", "Secure & device bound" },
                { "lock", "One device per key" },
                { "check", "Direct from authorised seller" },
        };
        for (int i = 0; i < trust.length; i++) {
            LinearLayout r = ui.row();
            r.setGravity(Gravity.CENTER_VERTICAL);
            r.addView(ui.iconTile(trust[i][0], ui.surfaceHigh, ui.inkSoft));
            TextView tx = ui.body(trust[i][1]);
            LinearLayout.LayoutParams tp = new LinearLayout.LayoutParams(0,
                    ViewGroup.LayoutParams.WRAP_CONTENT, 1f);
            tp.leftMargin = dp(12);
            r.addView(tx, tp);
            LinearLayout.LayoutParams rp = ui.matchWrap();
            rp.topMargin = i == 0 ? 0 : dp(12);
            root.addView(r, rp);
        }

        // ---- footer
        root.addView(ui.spacer(dp(24)));
        LinearLayout foot = ui.row();
        foot.addView(ui.caption("Need help?"));
        foot.addView(ui.hspace(dp(6)));
        TextView support = ui.button("Contact support", Ui.LINK, new View.OnClickListener() {
            @Override public void onClick(View v) {
                openSite();
            }
        });
        support.setMinHeight(0);
        support.setPadding(0, 0, 0, 0);
        foot.addView(support);
        LinearLayout.LayoutParams fp = ui.wrap();
        fp.gravity = Gravity.CENTER_HORIZONTAL;
        fp.topMargin = dp(4);
        root.addView(foot, fp);

        scroll.addView(root, ui.matchWrap());
        setContentView(scroll);
    }

    private void openSite() {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    android.net.Uri.parse("https://rider-theta.vercel.app/")));
        } catch (Exception ignored) {
        }
    }

    // ------------------------------------------------------- activation

    private void activate() {
        final String key = keyInput.getText().toString().trim();
        if (key.isEmpty()) {
            fail("Enter the licence key your seller gave you.");
            return;
        }
        busy(true);
        status.setText("Contacting licence server…");
        status.setTextColor(ui.inkSoft);

        new Thread(new Runnable() {
            @Override
            public void run() {
                // LicenceGate does the whole flow: local key-format check,
                // server activation (the key must be minted for THIS machine),
                // pinned-key refusal and local token verification.
                final com.ride.accepter.licence.LicenceGate.Result r =
                        com.ride.accepter.licence.LicenceGate.activate(ActivationActivity.this, key);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (r.ok) {
                            status.setText("Activated. Starting…");
                            status.setTextColor(ui.success);
                            goMain();
                        } else {
                            busy(false);
                            fail(humanise(r.reason));
                        }
                    }
                });
            }
        }).start();
    }

    private String humanise(String reason) {
        if ("UNKNOWN_KEY".equals(reason)) return "That key does not exist. Check for typos and try again.";
        if ("BAD_FORMAT".equals(reason)) return "That key is not valid. Check for typos and try again.";
        if ("DEVICE_MISMATCH".equals(reason)) return "That key was issued for a different device. Send your seller this Device ID.";
        if ("DEVICE_LIMIT".equals(reason)) return "This key already has its device slots full.";
        if ("REVOKED".equals(reason)) return "That key has been revoked. Contact your seller.";
        if ("EXPIRED".equals(reason)) return "That key has expired. Ask your seller to extend it.";
        if ("NOT_ACTIVATED".equals(reason)) return "This key has not been activated yet.";
        if ("TOKEN_EXPIRED".equals(reason)) return "Your licence session expired. Connect to the internet and reopen the app.";
        if ("BAD_TOKEN".equals(reason)) return "The licence could not be verified on this device. Activate again with your key.";
        if ("OFFLINE".equals(reason) || "SERVER_UNREACHABLE".equals(reason)) return "Could not reach the licence server. Check your connection.";
        return "Activation failed: " + reason;
    }

    private JSONObject post(String path, JSONObject body) {
        HttpURLConnection c = null;
        try {
            c = (HttpURLConnection) new URL(SERVER + path).openConnection();
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
            lastError = "HTTP " + code + (s.isEmpty() ? " (empty body)" : " " + s);
            return s.isEmpty() ? null : new JSONObject(s);
        } catch (Exception e) {
            lastError = e.getClass().getSimpleName() + ": " + e.getMessage();
            android.util.Log.e("RideAcceptor", "post() failed: " + SERVER + path, e);
            return null;
        } finally {
            if (c != null) {
                c.disconnect();
            }
        }
    }

    // ------------------------------------------------------------ utils

    private String androidId() {
        try {
            String id = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
            return id == null ? "" : id;
        } catch (Throwable t) {
            return "";
        }
    }

    private void busy(boolean b) {
        activateBtn.setEnabled(!b);
        keyInput.setEnabled(!b);
        spinner.setVisibility(b ? View.VISIBLE : View.GONE);
    }

    private void fail(String msg) {
        status.setText(msg);
        status.setTextColor(ui.error);
        status.setBackground(ui.shape(ui.errorTint, 12, false));
    }

    private void goMain() {
        try {
            Intent i = new Intent();
            // the real UI of this build is the AcceptPro dashboard, not the
            // vendor's MainActivity
            i.setClassName(getPackageName(), "com.ride.accepter.ui.DashboardActivity");
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(i);
        } catch (Throwable t) {
            fail("Installed build is missing DashboardActivity: " + t.getMessage());
            return;
        }
        // opportunistic server-side re-validation (rolling token; revocation
        // and device binding are re-checked by the server)
        com.ride.accepter.licence.LicenceGate.maybeRefreshAsync(this, null);
        finish();
    }

    private int dp(int v) {
        return Math.round(TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, v, getResources().getDisplayMetrics()));
    }
}
