package com.google.android.gms.internal.measurement;

import q6.m;
import q6.p;

/* JADX INFO: loaded from: classes.dex */
public final class zznv implements m {
    private static zznv zza = new zznv();
    private final m zzb = new p(new zznx());

    public static boolean zza() {
        return ((zznu) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zznu) zza.get()).zzb();
    }

    @Override // q6.m
    public final /* synthetic */ Object get() {
        return (zznu) this.zzb.get();
    }
}
