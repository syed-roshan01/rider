package com.google.android.gms.internal.measurement;

import q6.m;
import q6.p;

/* JADX INFO: loaded from: classes.dex */
public final class zzqe implements m {
    private static zzqe zza = new zzqe();
    private final m zzb = new p(new zzqg());

    public static boolean zza() {
        return ((zzqh) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzqh) zza.get()).zzb();
    }

    @Override // q6.m
    public final /* synthetic */ Object get() {
        return (zzqh) this.zzb.get();
    }
}
