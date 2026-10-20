package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class u2 extends AbstractList implements e1, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f4247a;

    public u2(e1 e1Var) {
        this.f4247a = e1Var;
    }

    @Override // com.google.protobuf.e1
    public final e1 b() {
        return this;
    }

    @Override // com.google.protobuf.e1
    public final Object c(int i10) {
        return this.f4247a.c(i10);
    }

    @Override // com.google.protobuf.e1
    public final List d() {
        return this.f4247a.d();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f4247a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new k6.u(this);
    }

    @Override // com.google.protobuf.e1
    public final void j(n nVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new com.google.crypto.tink.shaded.protobuf.q1(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4247a.size();
    }
}
