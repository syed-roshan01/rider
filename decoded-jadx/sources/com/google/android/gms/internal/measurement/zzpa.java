package com.google.android.gms.internal.measurement;

import q6.m;
import q6.p;

/* JADX INFO: loaded from: classes.dex */
public final class zzpa implements m {
    private static zzpa zza = new zzpa();
    private final m zzb = new p(new zzpc());

    public static double zza() {
        return ((zzpd) zza.get()).zza();
    }

    public static long zzb() {
        return ((zzpd) zza.get()).zzb();
    }

    public static long zzc() {
        return ((zzpd) zza.get()).zzc();
    }

    public static String zzd() {
        return ((zzpd) zza.get()).zzd();
    }

    public static boolean zze() {
        return ((zzpd) zza.get()).zze();
    }

    @Override // q6.m
    public final /* synthetic */ Object get() {
        return (zzpd) this.zzb.get();
    }
}
