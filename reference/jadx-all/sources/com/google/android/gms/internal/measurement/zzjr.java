package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzjr extends zzjs {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private static <E> List<E> zzc(Object obj, long j10) {
        return (List) zzmg.zze(obj, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final <L> List<L> zza(Object obj, long j10) {
        return zza(obj, j10, 10);
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final void zzb(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) zzmg.zze(obj, j10);
        if (list instanceof zzjp) {
            objUnmodifiableList = ((zzjp) list).h_();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzkv) && (list instanceof zzjf)) {
                zzjf zzjfVar = (zzjf) list;
                if (zzjfVar.zzc()) {
                    zzjfVar.i_();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzmg.zza(obj, j10, objUnmodifiableList);
    }

    private zzjr() {
        super();
    }

    private static <L> List<L> zza(Object obj, long j10, int i10) {
        Object obj2;
        List<L> listZza;
        List<L> listZzc = zzc(obj, j10);
        if (listZzc.isEmpty()) {
            if (listZzc instanceof zzjp) {
                listZza = new zzjq(i10);
            } else {
                listZza = ((listZzc instanceof zzkv) && (listZzc instanceof zzjf)) ? ((zzjf) listZzc).zza(i10) : new ArrayList<>(i10);
            }
            zzmg.zza(obj, j10, listZza);
            return listZza;
        }
        if (zza.isAssignableFrom(listZzc.getClass())) {
            ArrayList arrayList = new ArrayList(listZzc.size() + i10);
            arrayList.addAll(listZzc);
            zzmg.zza(obj, j10, arrayList);
            obj2 = arrayList;
        } else {
            if (!(listZzc instanceof zzmb)) {
                if (!(listZzc instanceof zzkv) || !(listZzc instanceof zzjf)) {
                    return listZzc;
                }
                zzjf zzjfVar = (zzjf) listZzc;
                if (zzjfVar.zzc()) {
                    return listZzc;
                }
                zzjf zzjfVarZza = zzjfVar.zza(listZzc.size() + i10);
                zzmg.zza(obj, j10, zzjfVarZza);
                return zzjfVarZza;
            }
            zzjq zzjqVar = new zzjq(listZzc.size() + i10);
            zzjqVar.addAll((zzmb) listZzc);
            zzmg.zza(obj, j10, zzjqVar);
            obj2 = zzjqVar;
        }
        return (List<L>) obj2;
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final <E> void zza(Object obj, Object obj2, long j10) {
        List listZzc = zzc(obj2, j10);
        List listZza = zza(obj, j10, listZzc.size());
        int size = listZza.size();
        int size2 = listZzc.size();
        if (size > 0 && size2 > 0) {
            listZza.addAll(listZzc);
        }
        if (size > 0) {
            listZzc = listZza;
        }
        zzmg.zza(obj, j10, listZzc);
    }
}
