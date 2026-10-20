package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzcs implements zzdd {
    public static final zzcs zza = new zzcs();

    private zzcs() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        boolean z10 = true;
        if (zzpqVarArr.length != 1) {
            throw new zzae(4, 3, null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzae(4, 5, null);
        }
        try {
            try {
                if (objZza instanceof String) {
                    objZza = zzcjVar.zzh().zza((String) objZza);
                }
                zzck zzckVarZzc = zzcjVar.zzc();
                try {
                    zzci.zza(objZza);
                } catch (zzae e4) {
                    if (e4.zzb() == 8 || e4.zzb() == 6) {
                        z10 = false;
                    } else if (e4.zzb() != 47) {
                        throw e4;
                    }
                }
                zzckVarZzc.zzf(i10, Boolean.valueOf(z10));
            } catch (Exception e10) {
                throw new zzae(6, 8, e10);
            }
        } catch (zzae e11) {
            throw e11;
        }
    }
}
