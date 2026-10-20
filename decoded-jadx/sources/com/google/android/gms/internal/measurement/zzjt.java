package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzjt extends zzjs {
    private static <E> zzjf<E> zzc(Object obj, long j10) {
        return (zzjf) zzmg.zze(obj, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final <L> List<L> zza(Object obj, long j10) {
        zzjf zzjfVarZzc = zzc(obj, j10);
        if (zzjfVarZzc.zzc()) {
            return zzjfVarZzc;
        }
        int size = zzjfVarZzc.size();
        zzjf zzjfVarZza = zzjfVarZzc.zza(size == 0 ? 10 : size << 1);
        zzmg.zza(obj, j10, zzjfVarZza);
        return zzjfVarZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final void zzb(Object obj, long j10) {
        zzc(obj, j10).i_();
    }

    private zzjt() {
        super();
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final <E> void zza(Object obj, Object obj2, long j10) {
        zzjf zzjfVarZzc = zzc(obj, j10);
        zzjf zzjfVarZzc2 = zzc(obj2, j10);
        int size = zzjfVarZzc.size();
        int size2 = zzjfVarZzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzjfVarZzc.zzc()) {
                zzjfVarZzc = zzjfVarZzc.zza(size2 + size);
            }
            zzjfVarZzc.addAll(zzjfVarZzc2);
        }
        if (size > 0) {
            zzjfVarZzc2 = zzjfVarZzc;
        }
        zzmg.zza(obj, j10, zzjfVarZzc2);
    }
}
