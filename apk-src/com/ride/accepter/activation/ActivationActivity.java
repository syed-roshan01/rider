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
    public static final String SERVER = "http://192.168.0.185:8787";

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
        SharedPreferences p = getSharedPreferences(PREFS, MODE_PRIVATE);
        long exp = p.getLong("expiresAt", 0);
        String token = p.getString("token", "");
        // Local, offline check only. The server re-validates on every refresh;
        // this just avoids a round trip on a normal launch.
        return !token.isEmpty() && exp > System.currentTimeMillis();
    }

    // ---------------------------------------------------------------- UI

    private void buildUi() {
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(BG);
        root.setGravity(Gravity.CENTER_HORIZONTAL);
        root.setPadding(dp(28), dp(48), dp(28), dp(32));

        root.addView(label("RIDE ACCEPTER", 22, TEXT, true));
        root.addView(label("Device activation", 13, MUTED, false));
        root.addView(gap(dp(34)));

        root.addView(label("YOUR DEVICE ID", 11, MUTED, true));
        root.addView(gap(dp(8)));

        LinearLayout codeRow = new LinearLayout(this);
        codeRow.setOrientation(LinearLayout.HORIZONTAL);
        codeRow.setBackgroundColor(PANEL);
        codeRow.setGravity(Gravity.CENTER_VERTICAL);
        codeRow.setPadding(dp(16), dp(16), dp(10), dp(16));

        TextView codeView = new TextView(this);
        codeView.setText(code);
        codeView.setTextColor(TEXT);
        codeView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 19);
        codeView.setTypeface(Typeface.MONOSPACE, Typeface.BOLD);
        codeView.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f);
        codeView.setLayoutParams(lp);
        codeRow.addView(codeView);

        Button copy = new Button(this);
        copy.setText("COPY");
        copy.setTextColor(ACCENT);
        copy.setBackgroundColor(Color.TRANSPARENT);
        copy.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
        copy.setAllCaps(true);
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

        root.addView(label("LICENSE KEY", 11, MUTED, true));
        root.addView(gap(dp(8)));

        keyInput = new EditText(this);
        keyInput.setHint("RA-XXXXX-XXXXX-XXXXX-XXXXX-XXXXX");
        keyInput.setHintTextColor(0xFF5A6880);
        keyInput.setTextColor(TEXT);
        keyInput.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
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
        activateBtn.setText("ACTIVATE");
        activateBtn.setTextColor(Color.WHITE);
        activateBtn.setBackgroundColor(ACCENT);
        activateBtn.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        activateBtn.setAllCaps(true);
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
                try {
                    JSONObject body = new JSONObject();
                    body.put("key", key);
                    body.put("deviceCode", code);
                    body.put("appVersion", 6);
                    body.put("model", Build.MODEL);
                    body.put("brand", Build.BRAND);
                    JSONObject device = new JSONObject();
                    device.put("androidId", androidId());
                    device.put("model", Build.MODEL);
                    device.put("brand", Build.BRAND);
                    body.put("device", device);

                    JSONObject r = post("/api/v1/activate", body);

                    if (r != null && r.optBoolean("ok", false)) {
                        final String token = r.getString("token");
                        final long expiresAt = r.optLong("expiresAt", 0);
                        final String pub = r.optString("publicKey", "");
                        getSharedPreferences(PREFS, MODE_PRIVATE).edit()
                                .putString("token", token)
                                .putLong("expiresAt", expiresAt)
                                .putString("publicKey", pub)
                                .putString("key", key)
                                .apply();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                status.setText("Activated. Starting…");
                                status.setTextColor(0xFF29C07A);
                                goMain();
                            }
                        });
                    } else {
                        final String reason = r == null ? "SERVER_UNREACHABLE" : r.optString("reason", "FAILED");
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                busy(false);
                                fail(humanise(reason));
                            }
                        });
                    }
                } catch (Exception e) {
                    final String msg = e.getMessage() == null ? e.getClass().getSimpleName() : e.getMessage();
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            busy(false);
                            fail("Could not reach the licence server. Check your connection. (" + msg + ")");
                        }
                    });
                }
            }
        }).start();
    }

    private String humanise(String reason) {
        if ("UNKNOWN_KEY".equals(reason)) return "That key does not exist. Check for typos and try again.";
        if ("DEVICE_MISMATCH".equals(reason)) return "That key was issued for a different device. Send your seller this Device ID.";
        if ("DEVICE_LIMIT".equals(reason)) return "This key already has its device slots full.";
        if ("REVOKED".equals(reason)) return "That key has been revoked. Contact your seller.";
        if ("EXPIRED".equals(reason)) return "That key has expired. Ask your seller to extend it.";
        if ("SERVER_UNREACHABLE".equals(reason)) return "Could not reach the licence server. Check your connection.";
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
            if (in == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();
            String s = sb.toString().trim();
            return s.isEmpty() ? null : new JSONObject(s);
        } catch (Exception e) {
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
            i.setClassName(getPackageName(), "com.auto.accept.ui.MainActivity");
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(i);
        } catch (Throwable t) {
            fail("Installed build is missing MainActivity: " + t.getMessage());
            return;
        }
        finish();
    }

    private TextView label(String text, int sp, int color, boolean bold) {
        TextView t = new TextView(this);
        t.setText(text);
        t.setTextColor(color);
        t.setTextSize(TypedValue.COMPLEX_UNIT_SP, sp);
        t.setLetterSpacing(bold ? 0.12f : 0f);
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
