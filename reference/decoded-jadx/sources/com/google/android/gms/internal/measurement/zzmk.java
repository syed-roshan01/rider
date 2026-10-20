package com.google.android.gms.internal.measurement;

import l.q;

/* JADX INFO: loaded from: classes.dex */
final class zzmk extends IllegalArgumentException {
    public zzmk(int i10, int i11) {
        super(q.i("Unpaired surrogate at index ", i10, " of ", i11));
    }
}
