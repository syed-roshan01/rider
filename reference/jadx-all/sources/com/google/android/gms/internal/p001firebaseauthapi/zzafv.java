package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import e6.e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzafv implements zzacq<zzafv> {
    private static final String zza = "zzafv";
    private String zzb;
    private String zzc;
    private String zzd;
    private zzafq zze;

    public final zzafq zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final boolean zze() {
        return this.zzb != null;
    }

    public final boolean zzf() {
        return this.zze != null;
    }

    public final boolean zzg() {
        return this.zzc != null;
    }

    public final boolean zzh() {
        return this.zzd != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacq
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzafv zza(String str) throws zzaah {
        String str2;
        byte b10;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = e.a(jSONObject.optString("email"));
            this.zzc = e.a(jSONObject.optString("newEmail"));
            int iOptInt = jSONObject.optInt("reqType");
            if (iOptInt != 1) {
                switch (iOptInt) {
                    case 4:
                        str2 = "VERIFY_EMAIL";
                        break;
                    case 5:
                        str2 = "RECOVER_EMAIL";
                        break;
                    case 6:
                        str2 = "EMAIL_SIGNIN";
                        break;
                    case 7:
                        str2 = "VERIFY_AND_CHANGE_EMAIL";
                        break;
                    case 8:
                        str2 = "REVERT_SECOND_FACTOR_ADDITION";
                        break;
                    default:
                        str2 = null;
                        break;
                }
            } else {
                str2 = "PASSWORD_RESET";
            }
            this.zzd = str2;
            if (TextUtils.isEmpty(str2)) {
                String strOptString = jSONObject.optString("requestType");
                switch (strOptString.hashCode()) {
                    case -1874510116:
                        if (!strOptString.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                            b10 = -1;
                        } else {
                            b10 = 5;
                        }
                        break;
                    case -1452371317:
                        if (!strOptString.equals("PASSWORD_RESET")) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    case -1341836234:
                        if (!strOptString.equals("VERIFY_EMAIL")) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case -1099157829:
                        if (!strOptString.equals("VERIFY_AND_CHANGE_EMAIL")) {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    case 870738373:
                        if (!strOptString.equals("EMAIL_SIGNIN")) {
                            b10 = -1;
                        } else {
                            b10 = 2;
                        }
                        break;
                    case 970484929:
                        if (!strOptString.equals("RECOVER_EMAIL")) {
                            b10 = -1;
                        } else {
                            b10 = 4;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                this.zzd = (b10 == 0 || b10 == 1 || b10 == 2 || b10 == 3 || b10 == 4 || b10 == 5) ? strOptString : null;
            }
            if (jSONObject.has("mfaInfo")) {
                this.zze = zzafq.zza(jSONObject.optJSONObject("mfaInfo"));
            }
            return this;
        } catch (NullPointerException e4) {
            e = e4;
            throw zzahb.zza(e, zza, str);
        } catch (JSONException e10) {
            e = e10;
            throw zzahb.zza(e, zza, str);
        }
    }
}
