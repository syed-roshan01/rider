package com.ride.accepter.activation;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.InputFilter;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ActivationActivity extends Activity {
    private static final int ACCENT = -11563777;
    private static final int BG = -15855338;
    private static final int MUTED = -7628621;
    private static final int PANEL = -15065040;
    public static final String PINNED_PUBLIC_KEY = "MCowBQYDK2VwAyEAkG6Qwwc6G90nANvj3FdwjUqSC5xyBRYT7frebqjkM04=";
    private static final String PREFS = "ra_license";
    public static final String SERVER = "https://ckyfcwbnakbaitzurnze.supabase.co/functions/v1";
    private static final int TEXT = -1643273;
    private Button activateBtn;
    private String code;
    private EditText keyInput;
    private volatile String lastError;
    private ProgressBar spinner;
    private TextView status;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.code = DeviceIdentity.deviceCode(androidId(), Build.BRAND, Build.MODEL);
        if (isLicensed()) {
            goMain();
        } else {
            getWindow().setBackgroundDrawable(new ColorDrawable(BG));
            buildUi();
        }
    }

    private boolean isLicensed() {
        SharedPreferences sharedPreferences = getSharedPreferences(PREFS, 0);
        return !sharedPreferences.getString("token", "").isEmpty() && sharedPreferences.getLong("expiresAt", 0L) > System.currentTimeMillis();
    }

    private void buildUi() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(BG);
        linearLayout.setGravity(1);
        linearLayout.setPadding(dp(28), dp(48), dp(28), dp(32));
        linearLayout.addView(label("RIDE ACCEPTER", 22, TEXT, true));
        linearLayout.addView(label("Device activation", 13, MUTED, false));
        linearLayout.addView(gap(dp(34)));
        linearLayout.addView(label("YOUR DEVICE ID", 11, MUTED, true));
        linearLayout.addView(gap(dp(8)));
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setBackgroundColor(PANEL);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(dp(16), dp(16), dp(10), dp(16));
        TextView textView = new TextView(this);
        textView.setText(this.code);
        textView.setTextColor(TEXT);
        textView.setTextSize(2, 19.0f);
        textView.setTypeface(Typeface.MONOSPACE, 1);
        textView.setGravity(17);
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.addView(textView);
        Button button = new Button(this);
        button.setText("COPY");
        button.setTextColor(ACCENT);
        button.setBackgroundColor(0);
        button.setTextSize(2, 12.0f);
        button.setAllCaps(true);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.ride.accepter.activation.ActivationActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) ActivationActivity.this.getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("Device ID", ActivationActivity.this.code));
                }
                Toast.makeText(ActivationActivity.this, "Device ID copied", 0).show();
            }
        });
        linearLayout2.addView(button);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(gap(dp(10)));
        linearLayout.addView(label("Send this ID to your seller. The licence key they give you\nwill work only on this phone.", 12, MUTED, false));
        linearLayout.addView(gap(dp(34)));
        linearLayout.addView(label("LICENSE KEY", 11, MUTED, true));
        linearLayout.addView(gap(dp(8)));
        this.keyInput = new EditText(this);
        this.keyInput.setHint("RA-XXXXX-XXXXX-XXXXX-XXXXX-XXXXX");
        this.keyInput.setHintTextColor(-10852224);
        this.keyInput.setTextColor(TEXT);
        this.keyInput.setTextSize(2, 15.0f);
        this.keyInput.setTypeface(Typeface.MONOSPACE);
        this.keyInput.setBackgroundColor(PANEL);
        this.keyInput.setPadding(dp(16), dp(16), dp(16), dp(16));
        this.keyInput.setInputType(655505);
        this.keyInput.setFilters(new InputFilter[]{new InputFilter.LengthFilter(40)});
        this.keyInput.setSingleLine(false);
        this.keyInput.setMaxLines(2);
        linearLayout.addView(this.keyInput);
        linearLayout.addView(gap(dp(16)));
        this.activateBtn = new Button(this);
        this.activateBtn.setText("ACTIVATE");
        this.activateBtn.setTextColor(-1);
        this.activateBtn.setBackgroundColor(ACCENT);
        this.activateBtn.setTextSize(2, 15.0f);
        this.activateBtn.setAllCaps(true);
        this.activateBtn.setTypeface(Typeface.DEFAULT, 1);
        this.activateBtn.setPadding(dp(16), dp(18), dp(16), dp(18));
        this.activateBtn.setOnClickListener(new View.OnClickListener() { // from class: com.ride.accepter.activation.ActivationActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ActivationActivity.this.activate();
            }
        });
        linearLayout.addView(this.activateBtn);
        this.spinner = new ProgressBar(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dp(28), dp(28));
        layoutParams.gravity = 1;
        layoutParams.topMargin = dp(14);
        this.spinner.setLayoutParams(layoutParams);
        this.spinner.setVisibility(8);
        linearLayout.addView(this.spinner);
        this.status = label("", 12, MUTED, false);
        this.status.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dp(10);
        this.status.setLayoutParams(layoutParams2);
        linearLayout.addView(this.status);
        setContentView(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void activate() {
        final String strTrim = this.keyInput.getText().toString().trim();
        if (strTrim.isEmpty()) {
            fail("Enter the licence key your seller gave you.");
            return;
        }
        busy(true);
        this.status.setText("Contacting licence server…");
        this.status.setTextColor(MUTED);
        new Thread(new Runnable(this) { // from class: com.ride.accepter.activation.ActivationActivity.3
            final /* synthetic */ ActivationActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", strTrim);
                    jSONObject.put("deviceCode", this.this$0.code);
                    jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, 6);
                    jSONObject.put("model", Build.MODEL);
                    jSONObject.put("brand", Build.BRAND);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("androidId", this.this$0.androidId());
                    jSONObject2.put("model", Build.MODEL);
                    jSONObject2.put("brand", Build.BRAND);
                    jSONObject.put("device", jSONObject2);
                    JSONObject jSONObjectPost = this.this$0.post("/api/v1/activate", jSONObject);
                    if (jSONObjectPost != null && jSONObjectPost.optBoolean("ok", false) && !ActivationActivity.PINNED_PUBLIC_KEY.equals(jSONObjectPost.optString("publicKey", ""))) {
                        this.this$0.runOnUiThread(new Runnable() { // from class: com.ride.accepter.activation.ActivationActivity.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass3.this.this$0.busy(false);
                                AnonymousClass3.this.this$0.fail("Server key does not match this app build. Activation refused.");
                            }
                        });
                        return;
                    }
                    if (jSONObjectPost != null && jSONObjectPost.optBoolean("ok", false)) {
                        String string = jSONObjectPost.getString("token");
                        this.this$0.getSharedPreferences(ActivationActivity.PREFS, 0).edit().putString("token", string).putLong("expiresAt", jSONObjectPost.optLong("expiresAt", 0L)).putString("publicKey", jSONObjectPost.optString("publicKey", "")).putString("key", strTrim).apply();
                        this.this$0.runOnUiThread(new Runnable() { // from class: com.ride.accepter.activation.ActivationActivity.3.2
                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass3.this.this$0.status.setText("Activated. Starting…");
                                AnonymousClass3.this.this$0.status.setTextColor(-14040966);
                                AnonymousClass3.this.this$0.goMain();
                            }
                        });
                        return;
                    }
                    final String strOptString = jSONObjectPost == null ? "SERVER_UNREACHABLE" : jSONObjectPost.optString("reason", "FAILED");
                    this.this$0.runOnUiThread(new Runnable(this) { // from class: com.ride.accepter.activation.ActivationActivity.3.3
                        final /* synthetic */ AnonymousClass3 this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            this.this$1.this$0.busy(false);
                            this.this$1.this$0.fail(this.this$1.this$0.humanise(strOptString) + (this.this$1.this$0.lastError == null ? "" : "  [" + this.this$1.this$0.lastError + "]"));
                        }
                    });
                } catch (Exception e4) {
                    final String simpleName = e4.getMessage() == null ? e4.getClass().getSimpleName() : e4.getMessage();
                    this.this$0.runOnUiThread(new Runnable(this) { // from class: com.ride.accepter.activation.ActivationActivity.3.4
                        final /* synthetic */ AnonymousClass3 this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            this.this$1.this$0.busy(false);
                            this.this$1.this$0.fail("Could not reach the licence server. Check your connection. (" + simpleName + ")");
                        }
                    });
                }
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String humanise(String str) {
        if ("UNKNOWN_KEY".equals(str)) {
            return "That key does not exist. Check for typos and try again.";
        }
        if ("DEVICE_MISMATCH".equals(str)) {
            return "That key was issued for a different device. Send your seller this Device ID.";
        }
        if ("DEVICE_LIMIT".equals(str)) {
            return "This key already has its device slots full.";
        }
        if ("REVOKED".equals(str)) {
            return "That key has been revoked. Contact your seller.";
        }
        if ("EXPIRED".equals(str)) {
            return "That key has expired. Ask your seller to extend it.";
        }
        return "SERVER_UNREACHABLE".equals(str) ? "Could not reach the licence server. Check your connection." : "Activation failed: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x011d  */
    public JSONObject post(String str, JSONObject jSONObject) throws Throwable {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        JSONObject jSONObject2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(SERVER + str).openConnection();
            try {
                try {
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("content-type", "application/json; charset=utf-8");
                    httpURLConnection.setConnectTimeout(8000);
                    httpURLConnection.setReadTimeout(12000);
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
                    outputStream.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    InputStream inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    StringBuilder sb = new StringBuilder();
                    if (inputStream != null) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        }
                        bufferedReader.close();
                    }
                    String strTrim = sb.toString().trim();
                    this.lastError = "HTTP " + responseCode + (strTrim.isEmpty() ? " (empty body)" : " " + strTrim);
                    if (!strTrim.isEmpty()) {
                        jSONObject2 = new JSONObject(strTrim);
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return jSONObject2;
                } catch (Exception e4) {
                    e = e4;
                    this.lastError = e.getClass().getSimpleName() + ": " + e.getMessage();
                    Log.e("RideAcceptor", "post() failed: https://ckyfcwbnakbaitzurnze.supabase.co/functions/v1" + str, e);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String androidId() {
        try {
            String string = Settings.Secure.getString(getContentResolver(), "android_id");
            return string == null ? "" : string;
        } catch (Throwable th) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void busy(boolean z10) {
        this.activateBtn.setEnabled(!z10);
        this.keyInput.setEnabled(!z10);
        this.spinner.setVisibility(z10 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fail(String str) {
        this.status.setText(str);
        this.status.setTextColor(-1750963);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goMain() {
        try {
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), "com.auto.accept.ui.MainActivity");
            intent.addFlags(268468224);
            startActivity(intent);
            finish();
        } catch (Throwable th) {
            fail("Installed build is missing MainActivity: " + th.getMessage());
        }
    }

    private TextView label(String str, int i10, int i11, boolean z10) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextColor(i11);
        textView.setTextSize(2, i10);
        textView.setLetterSpacing(z10 ? 0.12f : 0.0f);
        if (z10) {
            textView.setTypeface(Typeface.DEFAULT, 1);
        }
        return textView;
    }

    private View gap(int i10) {
        View view = new View(this);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
        return view;
    }

    private int dp(int i10) {
        return Math.round(TypedValue.applyDimension(1, i10, getResources().getDisplayMetrics()));
    }
}
