package com.google.android.gms.internal.measurement;

import q6.m;
import q6.p;

/* JADX INFO: loaded from: classes.dex */
public final class zzqd implements m {
    private static zzqd zza = new zzqd();
    private final m zzb = new p(new zzqf());

    public static boolean zza() {
        return ((zzqc) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzqc) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzqc) zza.get()).zzc();
    }

    @Override // q6.m
    public final /* synthetic */ Object get() {
        return (zzqc) this.zzb.get();
    }
}
