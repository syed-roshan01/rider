package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import c6.a;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzao;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class zzacg extends AsyncTask<Void, Void, zzacj> {
    private static final a zza = new a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzaci> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final FirebaseApp zzg;

    public zzacg(String str, String str2, Intent intent, FirebaseApp firebaseApp, zzaci zzaciVar) {
        f6.a.u(str);
        this.zzb = str;
        if (firebaseApp == null) {
            throw new NullPointerException("null reference");
        }
        this.zzg = firebaseApp;
        f6.a.u(str2);
        f6.a.x(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        f6.a.u(stringExtra);
        Uri.Builder builderBuildUpon = Uri.parse(zzaciVar.zza(stringExtra)).buildUpon();
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        if (str2 == null) {
            throw new NullPointerException("null reference");
        }
        builderAppendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.zzc = builderBuildUpon.build().toString();
        this.zzd = new WeakReference<>(zzaciVar);
        this.zze = zzaciVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzacj doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzaci zzaciVar = this.zzd.get();
            HttpURLConnection httpURLConnectionZza = zzaciVar.zza(url);
            httpURLConnectionZza.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpURLConnectionZza.setConnectTimeout(60000);
            new zzacv(zzaciVar.zza(), this.zzg, zzact.zza().zzb()).zza(httpURLConnectionZza);
            int responseCode = httpURLConnectionZza.getResponseCode();
            if (responseCode != 200) {
                String strZza = zza(httpURLConnectionZza);
                zza.b(String.format("Error getting project config. Failed with %s %s", strZza, Integer.valueOf(responseCode)), new Object[0]);
                return zzacj.zzb(strZza);
            }
            zzafh zzafhVar = new zzafh();
            zzafhVar.zza(new String(zza(httpURLConnectionZza.getInputStream(), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzafhVar.zza().contains(this.zzf) ? zzacj.zzb("UNAUTHORIZED_DOMAIN") : zzacj.zza(this.zzf);
            }
            for (String str : zzafhVar.zza()) {
                if (zza(str)) {
                    return zzacj.zza(str);
                }
            }
            return null;
        } catch (zzaah e4) {
            zza.b(q.x("ConversionException encountered: ", e4.getMessage()), new Object[0]);
            return null;
        } catch (IOException e10) {
            zza.b(q.x("IOException occurred: ", e10.getMessage()), new Object[0]);
            return null;
        } catch (NullPointerException e11) {
            zza.b(q.x("Null pointer encountered: ", e11.getMessage()), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(zzacj zzacjVar) {
        onPostExecute((zzacj) null);
    }

    private static String zza(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            return errorStream == null ? "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again." : (String) zzaco.zza(new String(zza(errorStream, 128)), String.class);
        } catch (IOException e4) {
            zza.e("Error parsing error message from response body in getErrorMessageFromBody. ".concat(String.valueOf(e4)), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzacj zzacjVar) {
        String strZza;
        String strZzb;
        Uri.Builder builder;
        zzaci zzaciVar = this.zzd.get();
        if (zzacjVar != null) {
            strZza = zzacjVar.zza();
            strZzb = zzacjVar.zzb();
        } else {
            strZza = null;
            strZzb = null;
        }
        if (zzaciVar == null) {
            zza.b("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(strZza) && (builder = this.zze) != null) {
            builder.authority(strZza);
            zzaciVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).zzc());
        } else {
            zzaciVar.zza(this.zzb, zzao.zza(strZzb));
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            return host != null && (host.endsWith("firebaseapp.com") || host.endsWith("web.app"));
        } catch (URISyntaxException e4) {
            zza.b("Error parsing URL for auth domain check: " + str + ". " + e4.getMessage(), new Object[0]);
        }
    }

    private static byte[] zza(InputStream inputStream, int i10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i11);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }
}
