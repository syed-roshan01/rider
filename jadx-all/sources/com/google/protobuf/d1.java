package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends d implements e1, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4093b;

    static {
        new d1(10).f4087a = false;
    }

    public d1(int i10) {
        this(new ArrayList(i10));
    }

    @Override // com.google.protobuf.x0
    public final x0 a(int i10) {
        ArrayList arrayList = this.f4093b;
        if (i10 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i10);
        arrayList2.addAll(arrayList);
        return new d1(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        e();
        this.f4093b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f4093b.size(), collection);
    }

    @Override // com.google.protobuf.e1
    public final e1 b() {
        return this.f4087a ? new u2(this) : this;
    }

    @Override // com.google.protobuf.e1
    public final Object c(int i10) {
        return this.f4093b.get(i10);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.f4093b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.e1
    public final List d() {
        return Collections.unmodifiableList(this.f4093b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f4093b;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            str = nVar.B();
            if (nVar.t()) {
                arrayList.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, y0.f4276a);
            if (c3.f4086a.W(0, bArr, 0, bArr.length) == 0) {
                arrayList.set(i10, str);
            }
        }
        return str;
    }

    @Override // com.google.protobuf.e1
    public final void j(n nVar) {
        e();
        this.f4093b.add(nVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        e();
        Object objRemove = this.f4093b.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        return objRemove instanceof n ? ((n) objRemove).B() : new String((byte[]) objRemove, y0.f4276a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        e();
        Object obj2 = this.f4093b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return obj2 instanceof n ? ((n) obj2).B() : new String((byte[]) obj2, y0.f4276a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4093b.size();
    }

    public d1(ArrayList arrayList) {
        this.f4093b = arrayList;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        e();
        if (collection instanceof e1) {
            collection = ((e1) collection).d();
        }
        boolean zAddAll = this.f4093b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
