package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends d implements v0, RandomAccess, c2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p0 f4209d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f4210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4211c;

    static {
        p0 p0Var = new p0(new int[0], 0);
        f4209d = p0Var;
        p0Var.f4087a = false;
    }

    public p0(int[] iArr, int i10) {
        this.f4210b = iArr;
        this.f4211c = i10;
    }

    @Override // com.google.protobuf.x0
    public final x0 a(int i10) {
        if (i10 >= this.f4211c) {
            return new p0(Arrays.copyOf(this.f4210b, i10), this.f4211c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f4211c)) {
            StringBuilder sbQ = a7.a.q("Index:", i10, ", Size:");
            sbQ.append(this.f4211c);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        int[] iArr = this.f4210b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[a7.a.h(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f4210b, i10, iArr2, i10 + 1, this.f4211c - i10);
            this.f4210b = iArr2;
        }
        this.f4210b[i10] = iIntValue;
        this.f4211c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = y0.f4276a;
        collection.getClass();
        if (!(collection instanceof p0)) {
            return super.addAll(collection);
        }
        p0 p0Var = (p0) collection;
        int i10 = p0Var.f4211c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f4211c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f4210b;
        if (i12 > iArr.length) {
            this.f4210b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(p0Var.f4210b, 0, this.f4210b, this.f4211c, p0Var.f4211c);
        this.f4211c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return super.equals(obj);
        }
        p0 p0Var = (p0) obj;
        if (this.f4211c != p0Var.f4211c) {
            return false;
        }
        int[] iArr = p0Var.f4210b;
        for (int i10 = 0; i10 < this.f4211c; i10++) {
            if (this.f4210b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        k(i10);
        return Integer.valueOf(this.f4210b[i10]);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4211c; i11++) {
            i10 = (i10 * 31) + this.f4210b[i11];
        }
        return i10;
    }

    public final void i(int i10) {
        e();
        int i11 = this.f4211c;
        int[] iArr = this.f4210b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[a7.a.h(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f4210b = iArr2;
        }
        int[] iArr3 = this.f4210b;
        int i12 = this.f4211c;
        this.f4211c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f4211c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f4210b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f4211c) {
            StringBuilder sbQ = a7.a.q("Index:", i10, ", Size:");
            sbQ.append(this.f4211c);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        e();
        k(i10);
        int[] iArr = this.f4210b;
        int i11 = iArr[i10];
        int i12 = this.f4211c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f4211c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        e();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f4210b;
        System.arraycopy(iArr, i11, iArr, i10, this.f4211c - i11);
        this.f4211c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        e();
        k(i10);
        int[] iArr = this.f4210b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4211c;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
