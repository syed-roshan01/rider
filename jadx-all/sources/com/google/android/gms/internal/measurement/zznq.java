package com.google.android.gms.internal.measurement;

import q6.m;
import q6.p;

/* JADX INFO: loaded from: classes.dex */
public final class zznq implements m {
    private static zznq zza = new zznq();
    private final m zzb = new p(new zzns());

    public static boolean zza() {
        return ((zznt) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zznt) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zznt) zza.get()).zzc();
    }

    @Override // q6.m
    public final /* synthetic */ Object get() {
        return (zznt) this.zzb.get();
    }
}
