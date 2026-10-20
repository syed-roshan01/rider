package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzajs extends zzajt {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private static <E> List<E> zzc(Object obj, long j10) {
        return (List) zzamh.zze(obj, j10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajt
    public final <L> List<L> zza(Object obj, long j10) {
        return zza(obj, j10, 10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajt
    public final void zzb(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) zzamh.zze(obj, j10);
        if (list instanceof zzajq) {
            objUnmodifiableList = ((zzajq) list).a_();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzakw) && (list instanceof zzajg)) {
                zzajg zzajgVar = (zzajg) list;
                if (zzajgVar.zzc()) {
                    zzajgVar.b_();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzamh.zza(obj, j10, objUnmodifiableList);
    }

    private zzajs() {
        super();
    }

    private static <L> List<L> zza(Object obj, long j10, int i10) {
        Object obj2;
        List<L> listZza;
        List<L> listZzc = zzc(obj, j10);
        if (listZzc.isEmpty()) {
            if (listZzc instanceof zzajq) {
                listZza = new zzajr(i10);
            } else {
                listZza = ((listZzc instanceof zzakw) && (listZzc instanceof zzajg)) ? ((zzajg) listZzc).zza(i10) : new ArrayList<>(i10);
            }
            zzamh.zza(obj, j10, listZza);
            return listZza;
        }
        if (zza.isAssignableFrom(listZzc.getClass())) {
            ArrayList arrayList = new ArrayList(listZzc.size() + i10);
            arrayList.addAll(listZzc);
            zzamh.zza(obj, j10, arrayList);
            obj2 = arrayList;
        } else {
            if (!(listZzc instanceof zzamg)) {
                if (!(listZzc instanceof zzakw) || !(listZzc instanceof zzajg)) {
                    return listZzc;
                }
                zzajg zzajgVar = (zzajg) listZzc;
                if (zzajgVar.zzc()) {
                    return listZzc;
                }
                zzajg zzajgVarZza = zzajgVar.zza(listZzc.size() + i10);
                zzamh.zza(obj, j10, zzajgVarZza);
                return zzajgVarZza;
            }
            zzajr zzajrVar = new zzajr(listZzc.size() + i10);
            zzajrVar.addAll((zzamg) listZzc);
            zzamh.zza(obj, j10, zzajrVar);
            obj2 = zzajrVar;
        }
        return (List<L>) obj2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajt
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
        zzamh.zza(obj, j10, listZzc);
    }
}
