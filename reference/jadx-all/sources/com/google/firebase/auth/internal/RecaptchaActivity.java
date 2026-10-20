package com.google.firebase.auth.internal;

import a7.a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.g0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzacg;
import com.google.android.gms.internal.p001firebaseauthapi.zzaci;
import com.google.android.gms.internal.p001firebaseauthapi.zzacl;
import com.google.android.gms.internal.p001firebaseauthapi.zzacu;
import com.google.android.gms.internal.p001firebaseauthapi.zzaec;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.inject.Provider;
import e6.d;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import l.t;
import p.b;
import r2.k;
import s3.c;

/* JADX INFO: loaded from: classes.dex */
public class RecaptchaActivity extends g0 implements zzaci {
    private static final String zzb = "RecaptchaActivity";
    private static long zzc;
    private static final zzce zzd = zzce.zzc();
    private boolean zze = false;

    private final void zzb() {
        zzc = 0L;
        this.zze = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        zza(intent);
        zzd.zza(this);
        finish();
    }

    @Override // androidx.fragment.app.g0, androidx.activity.p, q2.m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            a.t("Could not do operation - unknown action: ", action, zzb);
            zzb();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - zzc < 30000) {
            Log.e(zzb, "Could not start operation - already in progress");
            return;
        }
        zzc = jCurrentTimeMillis;
        if (bundle != null) {
            this.zze = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.g0, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.zze) {
                zzb();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = d.a(d.c(this, packageName)).toLowerCase(Locale.US);
                FirebaseApp firebaseApp = FirebaseApp.getInstance(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(firebaseApp);
                if (zzaec.zza(firebaseApp)) {
                    zza(zza(Uri.parse(zzaec.zza(firebaseApp.getOptions().getApiKey())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.zzc());
                } else {
                    new zzacg(packageName, lowerCase, intent, firebaseApp, this).executeOnExecutor(firebaseAuth.zze(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e(zzb, "Could not get package signature: " + packageName + " " + String.valueOf(e4));
                zzacl.zzb(this, packageName);
            }
            this.zze = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            zza(zzcf.zza(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            zzb();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        String strZzb = zzo.zza().zzb(getApplicationContext(), getPackageName(), intent2.getStringExtra("eventId"));
        if (TextUtils.isEmpty(strZzb)) {
            Log.e(zzb, "Failed to find registration for this event - failing to prevent session injection.");
            zza(zzao.zza("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = zzq.zza(getApplicationContext(), FirebaseApp.getInstance(strZzb).getPersistenceKey()).zza(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        zzc = 0L;
        this.zze = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (zza(intent3)) {
            zzd.zza(this);
        } else {
            zzbl.zza(getApplicationContext(), queryParameter, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        }
        finish();
    }

    @Override // androidx.activity.p, q2.m, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.zze);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaci
    public final Context zza() {
        return getApplicationContext();
    }

    private final Uri.Builder zza(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String string = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        FirebaseApp firebaseApp = FirebaseApp.getInstance(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(firebaseApp);
        zzo.zza().zza(getApplicationContext(), str, string, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String strZza = zzq.zza(getApplicationContext(), firebaseApp.getPersistenceKey()).zza();
        if (TextUtils.isEmpty(strZza)) {
            Log.e(zzb, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            zza(zzao.zza("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", !TextUtils.isEmpty(firebaseAuth.getLanguageCode()) ? firebaseAuth.getLanguageCode() : zzacu.zza()).appendQueryParameter("eventId", string).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strZza);
        return builder;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaci
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return zza(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    public static /* synthetic */ Uri zza(Uri uri, Task task) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            AppCheckTokenResult appCheckTokenResult = (AppCheckTokenResult) task.getResult();
            if (appCheckTokenResult.getError() != null) {
                Log.w(zzb, "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(appCheckTokenResult.getError())));
            }
            builderBuildUpon.fragment("fac=" + appCheckTokenResult.getToken());
        } else {
            a.t("Unexpected error getting App Check token: ", task.getException().getMessage(), zzb);
        }
        return builderBuildUpon.build();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaci
    public final String zza(String str) {
        return zzaec.zzb(str);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaci
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) com.google.android.gms.internal.p001firebaseauthapi.zzb.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzaci.zza.b("Error generating connection", new Object[0]);
            return null;
        }
    }

    private final void zza(Status status) {
        zzc = 0L;
        this.zze = false;
        Intent intent = new Intent();
        zzcf.zza(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        zza(intent);
        zzd.zza(this);
        finish();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaci
    public final void zza(String str, Status status) {
        if (status == null) {
            zzb();
        } else {
            zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaci
    public final void zza(final Uri uri, final String str, Provider<InteropAppCheckTokenProvider> provider) {
        Task taskForResult;
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = provider.get();
        if (interopAppCheckTokenProvider != null) {
            taskForResult = interopAppCheckTokenProvider.getToken(false).continueWith(new Continuation() { // from class: com.google.firebase.auth.internal.zzbp
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return RecaptchaActivity.zza(uri, task);
                }
            });
        } else {
            taskForResult = Tasks.forResult(uri);
        }
        taskForResult.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.auth.internal.zzbn
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zza(str, task);
            }
        });
    }

    public final void zza(String str, Task task) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> listQueryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
                t tVarA = new b().a();
                ((Intent) tVarA.f10928b).addFlags(1073741824);
                ((Intent) tVarA.f10928b).addFlags(268435456);
                ((Intent) tVarA.f10928b).setData((Uri) task.getResult());
                k.startActivity(this, (Intent) tVarA.f10928b, (Bundle) tVarA.f10929c);
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent.putExtra("com.android.browser.application_id", str);
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            startActivity(intent);
            return;
        }
        Log.e(zzb, "Device cannot resolve intent for: android.intent.action.VIEW");
        zzacl.zzb(this, str);
    }

    private final boolean zza(Intent intent) {
        return c.a(this).b(intent);
    }
}
