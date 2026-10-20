package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzaju extends zzajt {
    private static <E> zzajg<E> zzc(Object obj, long j10) {
        return (zzajg) zzamh.zze(obj, j10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajt
    public final <L> List<L> zza(Object obj, long j10) {
        zzajg zzajgVarZzc = zzc(obj, j10);
        if (zzajgVarZzc.zzc()) {
            return zzajgVarZzc;
        }
        int size = zzajgVarZzc.size();
        zzajg zzajgVarZza = zzajgVarZzc.zza(size == 0 ? 10 : size << 1);
        zzamh.zza(obj, j10, zzajgVarZza);
        return zzajgVarZza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajt
    public final void zzb(Object obj, long j10) {
        zzc(obj, j10).b_();
    }

    private zzaju() {
        super();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajt
    public final <E> void zza(Object obj, Object obj2, long j10) {
        zzajg zzajgVarZzc = zzc(obj, j10);
        zzajg zzajgVarZzc2 = zzc(obj2, j10);
        int size = zzajgVarZzc.size();
        int size2 = zzajgVarZzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzajgVarZzc.zzc()) {
                zzajgVarZzc = zzajgVarZzc.zza(size2 + size);
            }
            zzajgVarZzc.addAll(zzajgVarZzc2);
        }
        if (size > 0) {
            zzajgVarZzc2 = zzajgVarZzc;
        }
        zzamh.zza(obj, j10, zzajgVarZzc2);
    }
}
