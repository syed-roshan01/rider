package com.google.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements Iterator {
    public abstract byte a();

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
