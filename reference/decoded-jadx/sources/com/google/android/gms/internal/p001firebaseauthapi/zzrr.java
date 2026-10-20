package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class zzrr {
    private ArrayList<zzru> zza = new ArrayList<>();
    private zzrl zzb = zzrl.zza;
    private Integer zzc = null;

    public final zzrr zza(zzbw zzbwVar, int i10, String str, String str2) {
        ArrayList<zzru> arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zzru(zzbwVar, i10, str, str2));
        return this;
    }

    public final zzrr zza(zzrl zzrlVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzrlVar;
        return this;
    }

    public final zzrr zza(int i10) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i10);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zzrs zza() throws GeneralSecurityException {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int iIntValue = num.intValue();
                ArrayList<zzru> arrayList = this.zza;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    zzru zzruVar = arrayList.get(i10);
                    i10++;
                    if (zzruVar.zza() == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zzrs zzrsVar = new zzrs(this.zzb, Collections.unmodifiableList(this.zza), this.zzc);
            this.zza = null;
            return zzrsVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
