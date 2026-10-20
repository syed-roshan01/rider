package com.google.android.gms.internal.measurement;

import java.util.Collection;
import java.util.Map;
import o7.d0;
import q6.m;
import r6.f0;
import r6.i;
import r6.j;
import r6.q;
import r6.r;
import r6.t;
import r6.u;

/* JADX INFO: loaded from: classes.dex */
public final class zzha {
    public static final m zza = d0.S(new m() { // from class: com.google.android.gms.internal.measurement.zzhc
        @Override // q6.m
        public final Object get() {
            return zzha.zza();
        }
    });

    public static u zza() {
        Collection<Map.Entry> collectionEntrySet = i.a().entrySet();
        if (collectionEntrySet.isEmpty()) {
            return j.f13565b;
        }
        r rVar = new r(collectionEntrySet.size());
        for (Map.Entry entry : collectionEntrySet) {
            Object key = entry.getKey();
            t tVarQ = t.q((Collection) entry.getValue());
            if (!tVarQ.isEmpty()) {
                rVar.a(key, tVarQ);
                tVarQ.size();
            }
        }
        q qVar = rVar.f13578c;
        if (qVar != null) {
            throw qVar.a();
        }
        f0 f0VarB = f0.b(rVar.f13577b, rVar.f13576a, rVar);
        q qVar2 = rVar.f13578c;
        if (qVar2 == null) {
            return new u(f0VarB, null);
        }
        throw qVar2.a();
    }
}
