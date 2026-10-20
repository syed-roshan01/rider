package com.google.android.gms.internal.measurement;

import q6.m;
import q6.p;

/* JADX INFO: loaded from: classes.dex */
public final class zzoo implements m {
    private static zzoo zza = new zzoo();
    private final m zzb = new p(new zzoq());

    public static boolean zza() {
        return ((zzor) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzor) zza.get()).zzb();
    }

    @Override // q6.m
    public final /* synthetic */ Object get() {
        return (zzor) this.zzb.get();
    }
}
