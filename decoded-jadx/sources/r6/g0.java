package r6;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object[] f13544p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final g0 f13545q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f13546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f13547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f13548f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient int f13549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient int f13550o;

    static {
        Object[] objArr = new Object[0];
        f13545q = new g0(0, 0, 0, objArr, objArr);
    }

    public g0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f13546d = objArr;
        this.f13547e = i10;
        this.f13548f = objArr2;
        this.f13549n = i11;
        this.f13550o = i12;
    }

    @Override // r6.l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f13548f;
            if (objArr.length != 0) {
                int iI0 = z6.a.i0(obj);
                while (true) {
                    int i10 = iI0 & this.f13549n;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iI0 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // r6.l
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f13546d;
        int i10 = this.f13550o;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // r6.l
    public final Object[] g() {
        return this.f13546d;
    }

    @Override // r6.t, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13547e;
    }

    @Override // r6.l
    public final int i() {
        return this.f13550o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        p pVarR = this.f13583b;
        if (pVarR == null) {
            pVarR = r();
            this.f13583b = pVarR;
        }
        return pVarR.listIterator(0);
    }

    @Override // r6.l
    public final int k() {
        return 0;
    }

    @Override // r6.l
    public final boolean n() {
        return false;
    }

    public final p r() {
        return p.o(this.f13550o, this.f13546d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13550o;
    }
}
