package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends d implements w0, RandomAccess, c2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i1 f4137d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f4138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4139c;

    static {
        i1 i1Var = new i1(new long[0], 0);
        f4137d = i1Var;
        i1Var.f4087a = false;
    }

    public i1(long[] jArr, int i10) {
        this.f4138b = jArr;
        this.f4139c = i10;
    }

    @Override // com.google.protobuf.x0
    public final x0 a(int i10) {
        if (i10 >= this.f4139c) {
            return new i1(Arrays.copyOf(this.f4138b, i10), this.f4139c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f4139c)) {
            StringBuilder sbQ = a7.a.q("Index:", i10, ", Size:");
            sbQ.append(this.f4139c);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        long[] jArr = this.f4138b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[a7.a.h(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f4138b, i10, jArr2, i10 + 1, this.f4139c - i10);
            this.f4138b = jArr2;
        }
        this.f4138b[i10] = jLongValue;
        this.f4139c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = y0.f4276a;
        collection.getClass();
        if (!(collection instanceof i1)) {
            return super.addAll(collection);
        }
        i1 i1Var = (i1) collection;
        int i10 = i1Var.f4139c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f4139c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f4138b;
        if (i12 > jArr.length) {
            this.f4138b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(i1Var.f4138b, 0, this.f4138b, this.f4139c, i1Var.f4139c);
        this.f4139c = i12;
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
        if (!(obj instanceof i1)) {
            return super.equals(obj);
        }
        i1 i1Var = (i1) obj;
        if (this.f4139c != i1Var.f4139c) {
            return false;
        }
        long[] jArr = i1Var.f4138b;
        for (int i10 = 0; i10 < this.f4139c; i10++) {
            if (this.f4138b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        k(i10);
        return Long.valueOf(this.f4138b[i10]);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i10 = 0; i10 < this.f4139c; i10++) {
            iA = (iA * 31) + y0.a(this.f4138b[i10]);
        }
        return iA;
    }

    public final void i(long j10) {
        e();
        int i10 = this.f4139c;
        long[] jArr = this.f4138b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[a7.a.h(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f4138b = jArr2;
        }
        long[] jArr3 = this.f4138b;
        int i11 = this.f4139c;
        this.f4139c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f4139c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f4138b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f4139c) {
            StringBuilder sbQ = a7.a.q("Index:", i10, ", Size:");
            sbQ.append(this.f4139c);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        e();
        k(i10);
        long[] jArr = this.f4138b;
        long j10 = jArr[i10];
        int i11 = this.f4139c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f4139c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        e();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f4138b;
        System.arraycopy(jArr, i11, jArr, i10, this.f4139c - i11);
        this.f4139c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        e();
        k(i10);
        long[] jArr = this.f4138b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4139c;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i(((Long) obj).longValue());
        return true;
    }
}
