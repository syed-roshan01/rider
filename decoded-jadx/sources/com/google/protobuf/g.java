package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class g extends d implements q0, RandomAccess, c2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f4111d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f4112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4113c;

    static {
        g gVar = new g(new boolean[0], 0);
        f4111d = gVar;
        gVar.f4087a = false;
    }

    public g(boolean[] zArr, int i10) {
        this.f4112b = zArr;
        this.f4113c = i10;
    }

    @Override // com.google.protobuf.x0
    public final x0 a(int i10) {
        if (i10 >= this.f4113c) {
            return new g(Arrays.copyOf(this.f4112b, i10), this.f4113c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f4113c)) {
            StringBuilder sbQ = a7.a.q("Index:", i10, ", Size:");
            sbQ.append(this.f4113c);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        boolean[] zArr = this.f4112b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[a7.a.h(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f4112b, i10, zArr2, i10 + 1, this.f4113c - i10);
            this.f4112b = zArr2;
        }
        this.f4112b[i10] = zBooleanValue;
        this.f4113c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = y0.f4276a;
        collection.getClass();
        if (!(collection instanceof g)) {
            return super.addAll(collection);
        }
        g gVar = (g) collection;
        int i10 = gVar.f4113c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f4113c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f4112b;
        if (i12 > zArr.length) {
            this.f4112b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(gVar.f4112b, 0, this.f4112b, this.f4113c, gVar.f4113c);
        this.f4113c = i12;
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
        if (!(obj instanceof g)) {
            return super.equals(obj);
        }
        g gVar = (g) obj;
        if (this.f4113c != gVar.f4113c) {
            return false;
        }
        boolean[] zArr = gVar.f4112b;
        for (int i10 = 0; i10 < this.f4113c; i10++) {
            if (this.f4112b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        k(i10);
        return Boolean.valueOf(this.f4112b[i10]);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4113c; i11++) {
            int i12 = i10 * 31;
            boolean z10 = this.f4112b[i11];
            Charset charset = y0.f4276a;
            i10 = i12 + (z10 ? 1231 : 1237);
        }
        return i10;
    }

    public final void i(boolean z10) {
        e();
        int i10 = this.f4113c;
        boolean[] zArr = this.f4112b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[a7.a.h(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f4112b = zArr2;
        }
        boolean[] zArr3 = this.f4112b;
        int i11 = this.f4113c;
        this.f4113c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f4113c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f4112b[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f4113c) {
            StringBuilder sbQ = a7.a.q("Index:", i10, ", Size:");
            sbQ.append(this.f4113c);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        e();
        k(i10);
        boolean[] zArr = this.f4112b;
        boolean z10 = zArr[i10];
        int i11 = this.f4113c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f4113c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        e();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f4112b;
        System.arraycopy(zArr, i11, zArr, i10, this.f4113c - i11);
        this.f4113c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        e();
        k(i10);
        boolean[] zArr = this.f4112b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4113c;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i(((Boolean) obj).booleanValue());
        return true;
    }
}
