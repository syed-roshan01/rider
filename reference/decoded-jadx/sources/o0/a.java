package o0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f12325a = new Object[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f12326b = new Object[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12327c;

    public final int a(Object obj) {
        int iIdentityHashCode = System.identityHashCode(obj);
        int i10 = this.f12327c - 1;
        Object[] objArr = this.f12325a;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = objArr[i12];
            int iIdentityHashCode2 = System.identityHashCode(obj2);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i11 = i12 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    if (obj == obj2) {
                        return i12;
                    }
                    Object[] objArr2 = this.f12325a;
                    int i13 = this.f12327c;
                    for (int i14 = i12 - 1; -1 < i14; i14--) {
                        Object obj3 = objArr2[i14];
                        if (obj3 == obj) {
                            return i14;
                        }
                        if (System.identityHashCode(obj3) != iIdentityHashCode) {
                            break;
                        }
                    }
                    for (int i15 = i12 + 1; i15 < i13; i15++) {
                        Object obj4 = objArr2[i15];
                        if (obj4 == obj) {
                            return i15;
                        }
                        if (System.identityHashCode(obj4) != iIdentityHashCode) {
                            return -(i15 + 1);
                        }
                    }
                    return -(i13 + 1);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public final Object b(Object obj) {
        int iA = a(obj);
        if (iA >= 0) {
            return this.f12326b[iA];
        }
        return null;
    }

    public final void c(Object obj, d dVar) {
        Object[] objArr = this.f12325a;
        Object[] objArr2 = this.f12326b;
        int i10 = this.f12327c;
        int iA = a(obj);
        if (iA >= 0) {
            objArr2[iA] = dVar;
            return;
        }
        int i11 = -(iA + 1);
        boolean z10 = i10 == objArr.length;
        Object[] objArr3 = z10 ? new Object[i10 * 2] : objArr;
        int i12 = i11 + 1;
        b9.b.H(i12, i11, i10, objArr, objArr3);
        if (z10) {
            b9.b.L(objArr, objArr3, 0, i11, 6);
        }
        objArr3[i11] = obj;
        this.f12325a = objArr3;
        Object[] objArr4 = z10 ? new Object[i10 * 2] : objArr2;
        b9.b.H(i12, i11, i10, objArr2, objArr4);
        if (z10) {
            b9.b.L(objArr2, objArr4, 0, i11, 6);
        }
        objArr4[i11] = dVar;
        this.f12326b = objArr4;
        this.f12327c++;
    }
}
