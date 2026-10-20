package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class w extends d implements r0, RandomAccess, c2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f4252d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f4253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4254c;

    static {
        w wVar = new w(new double[0], 0);
        f4252d = wVar;
        wVar.f4087a = false;
    }

    public w(double[] dArr, int i10) {
        this.f4253b = dArr;
        this.f4254c = i10;
    }

    @Override // com.google.protobuf.x0
    public final x0 a(int i10) {
        if (i10 >= this.f4254c) {
            return new w(Arrays.copyOf(this.f4253b, i10), this.f4254c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f4254c)) {
            StringBuilder sbQ = a7.a.q("Index:", i10, ", Size:");
            sbQ.append(this.f4254c);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        double[] dArr = this.f4253b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[a7.a.h(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f4253b, i10, dArr2, i10 + 1, this.f4254c - i10);
            this.f4253b = dArr2;
        }
        this.f4253b[i10] = dDoubleValue;
        this.f4254c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = y0.f4276a;
        collection.getClass();
        if (!(collection instanceof w)) {
            return super.addAll(collection);
        }
        w wVar = (w) collection;
        int i10 = wVar.f4254c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f4254c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f4253b;
        if (i12 > dArr.length) {
            this.f4253b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(wVar.f4253b, 0, this.f4253b, this.f4254c, wVar.f4254c);
        this.f4254c = i12;
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
        if (!(obj instanceof w)) {
            return super.equals(obj);
        }
        w wVar = (w) obj;
        if (this.f4254c != wVar.f4254c) {
            return false;
        }
        double[] dArr = wVar.f4253b;
        for (int i10 = 0; i10 < this.f4254c; i10++) {
            if (Double.doubleToLongBits(this.f4253b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        k(i10);
        return Double.valueOf(this.f4253b[i10]);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i10 = 0; i10 < this.f4254c; i10++) {
            iA = (iA * 31) + y0.a(Double.doubleToLongBits(this.f4253b[i10]));
        }
        return iA;
    }

    public final void i(double d10) {
        e();
        int i10 = this.f4254c;
        double[] dArr = this.f4253b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[a7.a.h(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f4253b = dArr2;
        }
        double[] dArr3 = this.f4253b;
        int i11 = this.f4254c;
        this.f4254c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f4254c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f4253b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f4254c) {
            StringBuilder sbQ = a7.a.q("Index:", i10, ", Size:");
            sbQ.append(this.f4254c);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        e();
        k(i10);
        double[] dArr = this.f4253b;
        double d10 = dArr[i10];
        int i11 = this.f4254c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f4254c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        e();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f4253b;
        System.arraycopy(dArr, i11, dArr, i10, this.f4254c - i11);
        this.f4254c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        e();
        k(i10);
        double[] dArr = this.f4253b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4254c;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i(((Double) obj).doubleValue());
        return true;
    }
}
