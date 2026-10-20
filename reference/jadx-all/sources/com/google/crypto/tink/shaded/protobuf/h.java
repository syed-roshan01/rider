package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        g gVar = (g) this;
        int i10 = gVar.f3536a;
        if (i10 >= gVar.f3537b) {
            throw new NoSuchElementException();
        }
        gVar.f3536a = i10 + 1;
        return Byte.valueOf(gVar.f3538c.n(i10));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
