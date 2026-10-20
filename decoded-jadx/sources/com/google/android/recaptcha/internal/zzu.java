package com.google.android.recaptcha.internal;

import d7.t;
import l9.i;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
public final class zzu implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String strV0 = i.V0(String.valueOf(this.zzb / ((long) this.zza)), 10);
        String strV1 = i.V0(String.valueOf(this.zzc), 10);
        String strV2 = i.V0(String.valueOf(this.zzb), 10);
        String strV3 = i.V0(String.valueOf(this.zza), 5);
        StringBuilder sbC = k1.c("avgExecutionTime: ", strV0, " us| maxExecutionTime: ", strV1, " us| totalTime: ");
        sbC.append(strV2);
        sbC.append(" us| #Usages: ");
        sbC.append(strV3);
        return sbC.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzu zzuVar) {
        return t.J(Long.valueOf(this.zzb), Long.valueOf(zzuVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j10) {
        this.zzc = j10;
    }

    public final void zzf(long j10) {
        this.zzb = j10;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
