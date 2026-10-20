package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h1 f3543d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f3544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3545c;

    static {
        h1 h1Var = new h1(new Object[0], 0);
        f3543d = h1Var;
        h1Var.f3525a = false;
    }

    public h1(Object[] objArr, int i10) {
        this.f3544b = objArr;
        this.f3545c = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public final e0 a(int i10) {
        if (i10 >= this.f3545c) {
            return new h1(Arrays.copyOf(this.f3544b, i10), this.f3545c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i10 = this.f3545c;
        Object[] objArr = this.f3544b;
        if (i10 == objArr.length) {
            this.f3544b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f3544b;
        int i11 = this.f3545c;
        this.f3545c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return this.f3544b[i10];
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f3545c) {
            StringBuilder sbQ = a7.a.q("Index:", i10, ", Size:");
            sbQ.append(this.f3545c);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        e();
        i(i10);
        Object[] objArr = this.f3544b;
        Object obj = objArr[i10];
        int i11 = this.f3545c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f3545c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        e();
        i(i10);
        Object[] objArr = this.f3544b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3545c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        e();
        if (i10 >= 0 && i10 <= (i11 = this.f3545c)) {
            Object[] objArr = this.f3544b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[a7.a.h(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f3544b, i10, objArr2, i10 + 1, this.f3545c - i10);
                this.f3544b = objArr2;
            }
            this.f3544b[i10] = obj;
            this.f3545c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbQ = a7.a.q("Index:", i10, ", Size:");
        sbQ.append(this.f3545c);
        throw new IndexOutOfBoundsException(sbQ.toString());
    }
}
