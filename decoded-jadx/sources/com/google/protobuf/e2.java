package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends d implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e2 f4102d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f4103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4104c;

    static {
        e2 e2Var = new e2(new Object[0], 0);
        f4102d = e2Var;
        e2Var.f4087a = false;
    }

    public e2(Object[] objArr, int i10) {
        this.f4103b = objArr;
        this.f4104c = i10;
    }

    @Override // com.google.protobuf.x0
    public final x0 a(int i10) {
        if (i10 >= this.f4104c) {
            return new e2(Arrays.copyOf(this.f4103b, i10), this.f4104c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i10 = this.f4104c;
        Object[] objArr = this.f4103b;
        if (i10 == objArr.length) {
            this.f4103b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f4103b;
        int i11 = this.f4104c;
        this.f4104c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return this.f4103b[i10];
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f4104c) {
            StringBuilder sbQ = a7.a.q("Index:", i10, ", Size:");
            sbQ.append(this.f4104c);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        e();
        i(i10);
        Object[] objArr = this.f4103b;
        Object obj = objArr[i10];
        int i11 = this.f4104c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f4104c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        e();
        i(i10);
        Object[] objArr = this.f4103b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4104c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        e();
        if (i10 >= 0 && i10 <= (i11 = this.f4104c)) {
            Object[] objArr = this.f4103b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[a7.a.h(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f4103b, i10, objArr2, i10 + 1, this.f4104c - i10);
                this.f4103b = objArr2;
            }
            this.f4103b[i10] = obj;
            this.f4104c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbQ = a7.a.q("Index:", i10, ", Size:");
        sbQ.append(this.f4104c);
        throw new IndexOutOfBoundsException(sbQ.toString());
    }
}
