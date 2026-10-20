package com.google.android.gms.internal.measurement;

import q6.m;
import q6.p;

/* JADX INFO: loaded from: classes.dex */
public final class zzoh implements m {
    private static zzoh zza = new zzoh();
    private final m zzb = new p(new zzoj());

    public static boolean zza() {
        return ((zzog) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzog) zza.get()).zzb();
    }

    @Override // q6.m
    public final /* synthetic */ Object get() {
        return (zzog) this.zzb.get();
    }
}
