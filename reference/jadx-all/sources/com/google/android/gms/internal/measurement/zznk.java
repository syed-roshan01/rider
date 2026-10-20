package com.google.android.gms.internal.measurement;

import q6.m;
import q6.p;

/* JADX INFO: loaded from: classes.dex */
public final class zznk implements m {
    private static zznk zza = new zznk();
    private final m zzb = new p(new zznm());

    public static boolean zza() {
        return ((zznn) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zznn) zza.get()).zzb();
    }

    @Override // q6.m
    public final /* synthetic */ Object get() {
        return (zznn) this.zzb.get();
    }
}
