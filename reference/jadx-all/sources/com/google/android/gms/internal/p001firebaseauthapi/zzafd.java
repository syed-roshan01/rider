package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.ActionCodeSettings;
import f6.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzafd implements zzacr {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private ActionCodeSettings zze;
    private String zzf;
    private String zzg;

    public zzafd(int i10) {
        this.zza = zza(i10);
    }

    public final zzafd zza(String str) {
        this.zzg = str;
        return this;
    }

    public final ActionCodeSettings zzb() {
        return this.zze;
    }

    public final zzafd zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzafd zzd(String str) {
        a.u(str);
        this.zzd = str;
        return this;
    }

    private static String zza(int i10) {
        if (i10 == 1) {
            return "PASSWORD_RESET";
        }
        if (i10 == 4) {
            return "VERIFY_EMAIL";
        }
        if (i10 != 6) {
            return i10 != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL";
        }
        return "EMAIL_SIGNIN";
    }

    public final zzafd zzb(String str) {
        a.u(str);
        this.zzb = str;
        return this;
    }

    private zzafd(int i10, ActionCodeSettings actionCodeSettings, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        if (actionCodeSettings == null) {
            throw new NullPointerException("null reference");
        }
        this.zze = actionCodeSettings;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public final zzafd zza(ActionCodeSettings actionCodeSettings) {
        if (actionCodeSettings == null) {
            throw new NullPointerException("null reference");
        }
        this.zze = actionCodeSettings;
        return this;
    }

    public static zzafd zza(ActionCodeSettings actionCodeSettings, String str, String str2) {
        a.u(str);
        a.u(str2);
        a.x(actionCodeSettings);
        return new zzafd(7, actionCodeSettings, null, str2, str, null, null);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.getClass();
        int i10 = 1;
        switch (str) {
            case "PASSWORD_RESET":
                break;
            case "VERIFY_EMAIL":
                i10 = 4;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                i10 = 7;
                break;
            case "EMAIL_SIGNIN":
                i10 = 6;
                break;
            default:
                i10 = 0;
                break;
        }
        jSONObject.put("requestType", i10);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        ActionCodeSettings actionCodeSettings = this.zze;
        if (actionCodeSettings != null) {
            jSONObject.put("androidInstallApp", actionCodeSettings.getAndroidInstallApp());
            jSONObject.put("canHandleCodeInApp", this.zze.canHandleCodeInApp());
            if (this.zze.getUrl() != null) {
                jSONObject.put("continueUrl", this.zze.getUrl());
            }
            if (this.zze.getIOSBundle() != null) {
                jSONObject.put("iosBundleId", this.zze.getIOSBundle());
            }
            if (this.zze.zzd() != null) {
                jSONObject.put("iosAppStoreId", this.zze.zzd());
            }
            if (this.zze.getAndroidPackageName() != null) {
                jSONObject.put("androidPackageName", this.zze.getAndroidPackageName());
            }
            if (this.zze.getAndroidMinimumVersion() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.getAndroidMinimumVersion());
            }
            if (this.zze.zzc() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.zzc());
            }
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.zzg;
        if (str6 != null) {
            zzahb.zza(jSONObject, "captchaResp", str6);
        } else {
            zzahb.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
