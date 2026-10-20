package com.google.android.recaptcha.internal;

import b9.b;
import f9.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzct implements zzdd {
    public static final zzct zza = new zzct();

    private zzct() {
    }

    private static final boolean zzb(List list) {
        ArrayList arrayList = new ArrayList(a.y0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzpq) it.next()).zzN()));
        }
        return !arrayList.contains(Boolean.FALSE);
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        if (!zzb(b.X(zzpqVarArr))) {
            throw new zzae(4, 5, null);
        }
        for (zzpq zzpqVar : zzpqVarArr) {
            zzcjVar.zzc().zzb(zzpqVar.zzi());
        }
    }
}
