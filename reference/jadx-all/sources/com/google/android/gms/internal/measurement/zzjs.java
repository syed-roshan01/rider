package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class zzjs {
    private static final zzjs zza = new zzjr();
    private static final zzjs zzb = new zzjt();

    private zzjs() {
    }

    public static zzjs zza() {
        return zza;
    }

    public static zzjs zzb() {
        return zzb;
    }

    public abstract <L> List<L> zza(Object obj, long j10);

    public abstract <L> void zza(Object obj, Object obj2, long j10);

    public abstract void zzb(Object obj, long j10);
}
