package com.google.android.gms.internal.p001firebaseauthapi;

import c6.a;
import com.google.firebase.auth.ActionCodeUrl;
import com.google.firebase.auth.EmailAuthCredential;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzaeo implements zzacr {
    private static final String zza = "zzaeo";
    private static final a zzb = new a(zza, new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzaeo(EmailAuthCredential emailAuthCredential, String str, String str2) {
        String strZzc = emailAuthCredential.zzc();
        f6.a.u(strZzc);
        this.zzc = strZzc;
        String strZze = emailAuthCredential.zze();
        f6.a.u(strZze);
        this.zzd = strZze;
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        ActionCodeUrl link = ActionCodeUrl.parseLink(this.zzd);
        String code = link != null ? link.getCode() : null;
        String strZza = link != null ? link.zza() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzc);
        if (code != null) {
            jSONObject.put("oobCode", code);
        }
        if (strZza != null) {
            jSONObject.put("tenantId", strZza);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            zzahb.zza(jSONObject, "captchaResp", str2);
        } else {
            zzahb.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
