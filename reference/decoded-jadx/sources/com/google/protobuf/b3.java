package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class b3 extends IllegalArgumentException {
    public b3(int i10, int i11) {
        super(l.q.i("Unpaired surrogate at index ", i10, " of ", i11));
    }
}
