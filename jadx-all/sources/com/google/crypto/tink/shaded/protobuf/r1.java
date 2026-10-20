package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends AbstractList implements k0, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f3614a;

    public r1(k0 k0Var) {
        this.f3614a = k0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final k0 b() {
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final Object c(int i10) {
        return this.f3614a.c(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final List d() {
        return this.f3614a.d();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f3614a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new k6.u(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final void l(l lVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new q1(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3614a.size();
    }
}
