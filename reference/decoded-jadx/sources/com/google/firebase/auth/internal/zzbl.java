package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzach;
import com.google.android.gms.internal.p001firebaseauthapi.zzags;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import f6.a;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzbl {
    private static long zza = 3600000;
    private static final com.google.android.gms.internal.p001firebaseauthapi.zzaq<String> zzb = com.google.android.gms.internal.p001firebaseauthapi.zzaq.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");
    private static final zzbl zzc = new zzbl();
    private Task<AuthResult> zzd;
    private Task<String> zze;
    private long zzf = 0;

    private zzbl() {
    }

    public static zzbl zzc() {
        return zzc;
    }

    public final Task<AuthResult> zza() {
        if (System.currentTimeMillis() - this.zzf < zza) {
            return this.zzd;
        }
        return null;
    }

    public final Task<String> zzb() {
        if (System.currentTimeMillis() - this.zzf < zza) {
            return this.zze;
        }
        return null;
    }

    private static void zza(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        com.google.android.gms.internal.p001firebaseauthapi.zzaq<String> zzaqVar = zzb;
        int size = zzaqVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str = zzaqVar.get(i10);
            i10++;
            editorEdit.remove(str);
        }
        editorEdit.commit();
    }

    public final void zza(Context context) {
        a.x(context);
        zza(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.zzd = null;
        this.zzf = 0L;
    }

    public final void zza(FirebaseAuth firebaseAuth) {
        a.x(firebaseAuth);
        byte b10 = 0;
        SharedPreferences sharedPreferences = firebaseAuth.getApp().getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        if (firebaseAuth.getApp().getName().equals(sharedPreferences.getString("firebaseAppName", ""))) {
            if (sharedPreferences.contains("verifyAssertionRequest")) {
                String string = sharedPreferences.getString("verifyAssertionRequest", "");
                zzags zzagsVar = (zzags) e.c0(string == null ? null : Base64.decode(string, 10), zzags.CREATOR);
                String string2 = sharedPreferences.getString("operation", "");
                String string3 = sharedPreferences.getString("tenantId", null);
                String string4 = sharedPreferences.getString("firebaseUserUid", "");
                this.zzf = sharedPreferences.getLong("timestamp", 0L);
                if (string3 != null) {
                    firebaseAuth.setTenantId(string3);
                    zzagsVar.zzb(string3);
                }
                string2.getClass();
                switch (string2.hashCode()) {
                    case -98509410:
                        if (!string2.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE")) {
                            b10 = -1;
                        }
                        break;
                    case 175006864:
                        b10 = !string2.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK") ? (byte) -1 : (byte) 1;
                        break;
                    case 1450464913:
                        b10 = !string2.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN") ? (byte) -1 : (byte) 2;
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                        if (!firebaseAuth.getCurrentUser().getUid().equals(string4)) {
                            this.zzd = null;
                        } else {
                            this.zzd = firebaseAuth.zzc(firebaseAuth.getCurrentUser(), com.google.firebase.auth.zzd.zza(zzagsVar));
                        }
                        break;
                    case 1:
                        if (!firebaseAuth.getCurrentUser().getUid().equals(string4)) {
                            this.zzd = null;
                        } else {
                            this.zzd = firebaseAuth.zza(firebaseAuth.getCurrentUser(), com.google.firebase.auth.zzd.zza(zzagsVar));
                        }
                        break;
                    case 2:
                        this.zzd = firebaseAuth.signInWithCredential(com.google.firebase.auth.zzd.zza(zzagsVar));
                        break;
                    default:
                        this.zzd = null;
                        break;
                }
                zza(sharedPreferences);
                return;
            }
            if (sharedPreferences.contains("recaptchaToken")) {
                String string5 = sharedPreferences.getString("recaptchaToken", "");
                String string6 = sharedPreferences.getString("operation", "");
                this.zzf = sharedPreferences.getLong("timestamp", 0L);
                string6.getClass();
                if (string6.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) {
                    this.zze = Tasks.forResult(string5);
                } else {
                    this.zze = null;
                }
                zza(sharedPreferences);
                return;
            }
            if (sharedPreferences.contains("statusCode")) {
                Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""));
                this.zzf = sharedPreferences.getLong("timestamp", 0L);
                zza(sharedPreferences);
                this.zzd = Tasks.forException(zzach.zza(status));
            }
        }
    }

    public static void zza(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.f3150b);
        editorEdit.putString("statusMessage", status.f3151c);
        editorEdit.putLong("timestamp", System.currentTimeMillis());
        editorEdit.commit();
    }

    public static void zza(Context context, FirebaseAuth firebaseAuth) {
        a.x(context);
        a.x(firebaseAuth);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("firebaseAppName", firebaseAuth.getApp().getName());
        editorEdit.commit();
    }

    public static void zza(Context context, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        a.x(context);
        a.x(firebaseAuth);
        a.x(firebaseUser);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("firebaseAppName", firebaseAuth.getApp().getName());
        editorEdit.putString("firebaseUserUid", firebaseUser.getUid());
        editorEdit.commit();
    }

    public static void zza(Context context, zzags zzagsVar, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        Parcel parcelObtain = Parcel.obtain();
        zzagsVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        editorEdit.putString("verifyAssertionRequest", bArrMarshall == null ? null : Base64.encodeToString(bArrMarshall, 10));
        editorEdit.putString("operation", str);
        editorEdit.putString("tenantId", str2);
        editorEdit.putLong("timestamp", System.currentTimeMillis());
        editorEdit.commit();
    }

    public static void zza(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("recaptchaToken", str);
        editorEdit.putString("operation", str2);
        editorEdit.putLong("timestamp", System.currentTimeMillis());
        editorEdit.commit();
    }
}
