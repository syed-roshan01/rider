package com.google.firebase.auth.internal;

import com.google.android.gms.internal.p001firebaseauthapi.zzafv;
import com.google.firebase.auth.ActionCodeInfo;
import com.google.firebase.auth.ActionCodeResult;

/* JADX INFO: loaded from: classes.dex */
public final class zzu implements ActionCodeResult {
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final ActionCodeInfo zzd;

    public zzu(zzafv zzafvVar) {
        this.zzb = zzafvVar.zzg() ? zzafvVar.zzc() : zzafvVar.zzb();
        this.zzc = zzafvVar.zzb();
        ActionCodeInfo zzsVar = null;
        if (!zzafvVar.zzh()) {
            this.zza = 3;
            this.zzd = null;
            return;
        }
        String strZzd = zzafvVar.zzd();
        strZzd.getClass();
        int i10 = 5;
        switch (strZzd) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i10 = 6;
                break;
            case "PASSWORD_RESET":
                i10 = 0;
                break;
            case "VERIFY_EMAIL":
                i10 = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i10 = 4;
                break;
            case "RECOVER_EMAIL":
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        this.zza = i10;
        if (i10 == 4 || i10 == 3) {
            this.zzd = null;
            return;
        }
        if (zzafvVar.zzf()) {
            zzsVar = new zzv(zzafvVar.zzb(), zzbk.zza(zzafvVar.zza()));
        } else if (zzafvVar.zzg()) {
            zzsVar = new zzt(zzafvVar.zzc(), zzafvVar.zzb());
        } else if (zzafvVar.zze()) {
            zzsVar = new zzs(zzafvVar.zzb());
        }
        this.zzd = zzsVar;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    public final String getData(int i10) {
        if (this.zza == 4) {
            return null;
        }
        if (i10 == 0) {
            return this.zzb;
        }
        if (i10 != 1) {
            return null;
        }
        return this.zzc;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    public final ActionCodeInfo getInfo() {
        return this.zzd;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    public final int getOperation() {
        return this.zza;
    }
}
