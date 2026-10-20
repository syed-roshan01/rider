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
    private static final int BG = 0xFF0E1116;
    private static final int PANEL = 0xFF1A2030;
    private static final int ACCENT = 0xFF4F8CFF;
    private static final int TEXT = 0xFFE6ECF7;
    private static final int MUTED = 0xFF8B98B3;

    private EditText keyInput;
    private Button activateBtn;
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
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(BG));
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
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(BG);
        root.setGravity(Gravity.CENTER_HORIZONTAL);
        root.setPadding(dp(28), dp(48), dp(28), dp(32));

        root.addView(label("AcceptPro", 22, TEXT, true));
        root.addView(label("Device activation", 13, MUTED, false));
        root.addView(gap(dp(34)));

        root.addView(label("Your device id", 11, MUTED, true));
        root.addView(gap(dp(8)));

        LinearLayout codeRow = new LinearLayout(this);
        codeRow.setOrientation(LinearLayout.HORIZONTAL);
        codeRow.setBackgroundColor(PANEL);
        codeRow.setGravity(Gravity.CENTER_VERTICAL);
        codeRow.setPadding(dp(16), dp(16), dp(10), dp(16));

        TextView codeView = new TextView(this);
        codeView.setText(code);
        codeView.setTextColor(TEXT);
        codeView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 17);
        codeView.setTypeface(Typeface.MONOSPACE, Typeface.BOLD);
        codeView.setGravity(Gravity.CENTER);
        codeView.setSingleLine(true);
        codeView.setLetterSpacing(0.06f);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f);
        codeView.setLayoutParams(lp);
        codeRow.addView(codeView);

        Button copy = new Button(this);
        copy.setText("Copy");
        copy.setTextColor(ACCENT);
        copy.setBackgroundColor(Color.TRANSPARENT);
        copy.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
        copy.setAllCaps(false);
        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                if (cm != null) {
                    cm.setPrimaryClip(ClipData.newPlainText("Device ID", code));
                }
                Toast.makeText(ActivationActivity.this, "Device ID copied", Toast.LENGTH_SHORT).show();
            }
        });
        codeRow.addView(copy);
        root.addView(codeRow);

        root.addView(gap(dp(10)));
        root.addView(label("Send this ID to your seller. The licence key they give you\nwill work only on this phone.", 12, MUTED, false));
        root.addView(gap(dp(34)));

        root.addView(label("Licence key", 11, MUTED, true));
        root.addView(gap(dp(8)));

        keyInput = new EditText(this);
        keyInput.setHint("RA-XXXXX-XXXXX-XXXXX-XXXXX-XXXXX");
        keyInput.setHintTextColor(0xFF5A6880);
        keyInput.setTextColor(TEXT);
        keyInput.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        keyInput.setTypeface(Typeface.MONOSPACE);
        keyInput.setBackgroundColor(PANEL);
        keyInput.setPadding(dp(16), dp(16), dp(16), dp(16));
        keyInput.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_MULTI_LINE
                | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        keyInput.setFilters(new InputFilter[]{new InputFilter.LengthFilter(40)});
        keyInput.setSingleLine(false);
        keyInput.setMaxLines(2);
        root.addView(keyInput);

        root.addView(gap(dp(16)));

        activateBtn = new Button(this);
        activateBtn.setText("Activate");
        activateBtn.setTextColor(Color.WHITE);
        activateBtn.setBackgroundColor(ACCENT);
        activateBtn.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        activateBtn.setAllCaps(false);
        activateBtn.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        activateBtn.setPadding(dp(16), dp(18), dp(16), dp(18));
        activateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activate();
            }
        });
        root.addView(activateBtn);

        spinner = new ProgressBar(this);
        LinearLayout.LayoutParams sp = new LinearLayout.LayoutParams(dp(28), dp(28));
        sp.gravity = Gravity.CENTER_HORIZONTAL;
        sp.topMargin = dp(14);
        spinner.setLayoutParams(sp);
        spinner.setVisibility(View.GONE);
        root.addView(spinner);

        status = label("", 12, MUTED, false);
        status.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams st = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        st.topMargin = dp(10);
        status.setLayoutParams(st);
        root.addView(status);

        setContentView(root);
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
        status.setTextColor(MUTED);

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
                            status.setTextColor(0xFF29C07A);
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
        status.setTextColor(0xFFE5484D);
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

    private TextView label(String text, int sp, int color, boolean bold) {
        TextView t = new TextView(this);
        t.setText(text);
        t.setTextColor(color);
        t.setTextSize(TypedValue.COMPLEX_UNIT_SP, sp);
        t.setLetterSpacing(bold ? 0.04f : 0f);
        if (bold) {
            t.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        }
        return t;
    }

    private View gap(int h) {
        View v = new View(this);
        v.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, h));
        return v;
    }

    private int dp(int v) {
        return Math.round(TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, v, getResources().getDisplayMetrics()));
    }
}
