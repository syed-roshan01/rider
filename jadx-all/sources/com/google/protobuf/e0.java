package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends d implements u0, RandomAccess, c2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f4099d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f4100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4101c;

    static {
        e0 e0Var = new e0(0, new float[0]);
        f4099d = e0Var;
        e0Var.f4087a = false;
    }

    public e0(int i10, float[] fArr) {
        this.f4100b = fArr;
        this.f4101c = i10;
    }

    @Override // com.google.protobuf.x0
    public final x0 a(int i10) {
        if (i10 < this.f4101c) {
            throw new IllegalArgumentException();
        }
        return new e0(this.f4101c, Arrays.copyOf(this.f4100b, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f4101c)) {
            StringBuilder sbQ = a7.a.q("Index:", i10, ", Size:");
            sbQ.append(this.f4101c);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        float[] fArr = this.f4100b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[a7.a.h(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f4100b, i10, fArr2, i10 + 1, this.f4101c - i10);
            this.f4100b = fArr2;
        }
        this.f4100b[i10] = fFloatValue;
        this.f4101c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = y0.f4276a;
        collection.getClass();
        if (!(collection instanceof e0)) {
            return super.addAll(collection);
        }
        e0 e0Var = (e0) collection;
        int i10 = e0Var.f4101c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f4101c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f4100b;
        if (i12 > fArr.length) {
            this.f4100b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(e0Var.f4100b, 0, this.f4100b, this.f4101c, e0Var.f4101c);
        this.f4101c = i12;
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
        if (!(obj instanceof e0)) {
            return super.equals(obj);
        }
        e0 e0Var = (e0) obj;
        if (this.f4101c != e0Var.f4101c) {
            return false;
        }
        float[] fArr = e0Var.f4100b;
        for (int i10 = 0; i10 < this.f4101c; i10++) {
            if (Float.floatToIntBits(this.f4100b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        k(i10);
        return Float.valueOf(this.f4100b[i10]);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f4101c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f4100b[i10]);
        }
        return iFloatToIntBits;
    }

    public final void i(float f10) {
        e();
        int i10 = this.f4101c;
        float[] fArr = this.f4100b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[a7.a.h(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f4100b = fArr2;
        }
        float[] fArr3 = this.f4100b;
        int i11 = this.f4101c;
        this.f4101c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f4101c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f4100b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f4101c) {
            StringBuilder sbQ = a7.a.q("Index:", i10, ", Size:");
            sbQ.append(this.f4101c);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        e();
        k(i10);
        float[] fArr = this.f4100b;
        float f10 = fArr[i10];
        int i11 = this.f4101c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f4101c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        e();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f4100b;
        System.arraycopy(fArr, i11, fArr, i10, this.f4101c - i11);
        this.f4101c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        e();
        k(i10);
        float[] fArr = this.f4100b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4101c;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i(((Float) obj).floatValue());
        return true;
    }
}
