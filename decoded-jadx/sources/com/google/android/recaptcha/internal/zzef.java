package com.google.android.recaptcha.internal;

import b9.b;
import java.util.Iterator;
import java.util.List;
import r8.p;
import r8.r;

/* JADX INFO: loaded from: classes.dex */
public final class zzef {
    private List zza = r.f13661a;

    public final long zza(long[] jArr) {
        Iterator it = p.P0(b.W(jArr), this.zza).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = b.W(jArr);
    }
}
