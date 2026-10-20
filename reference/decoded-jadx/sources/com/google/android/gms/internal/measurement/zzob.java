package com.google.android.gms.internal.measurement;

import q6.m;
import q6.p;

/* JADX INFO: loaded from: classes.dex */
public final class zzob implements m {
    private static zzob zza = new zzob();
    private final m zzb = new p(new zzod());

    public static boolean zza() {
        return ((zzoa) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzoa) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzoa) zza.get()).zzc();
    }

    public static boolean zzd() {
        return ((zzoa) zza.get()).zzd();
    }

    @Override // q6.m
    public final /* synthetic */ Object get() {
        return (zzoa) this.zzb.get();
    }
}
