package q0;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f13051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f13052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13054d;

    public e(int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f13051a = objArr;
        this.f13052b = objArr2;
        this.f13053c = i10;
        this.f13054d = i11;
        if (e() > 32) {
            int length = objArr2.length;
        } else {
            throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + e()).toString());
        }
    }

    public static Object[] k(Object[] objArr, int i10, int i11, Object obj, e.a aVar) {
        Object[] objArrCopyOf;
        int iQ = d9.i.q(i11, i10);
        if (i10 == 0) {
            if (iQ == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
            }
            b9.b.H(iQ + 1, iQ, 31, objArr, objArrCopyOf);
            aVar.f4980a = objArr[31];
            objArrCopyOf[iQ] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        d7.a.l(objArrCopyOf2, "copyOf(this, newSize)");
        int i12 = i10 - 5;
        Object obj2 = objArr[iQ];
        d7.a.k(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iQ] = k((Object[]) obj2, i12, i11, obj, aVar);
        while (true) {
            iQ++;
            if (iQ >= 32 || objArrCopyOf2[iQ] == null) {
                break;
            }
            Object obj3 = objArr[iQ];
            d7.a.k(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iQ] = k((Object[]) obj3, i12, 0, aVar.f4980a, aVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] o(Object[] objArr, int i10, int i11, e.a aVar) {
        Object[] objArrO;
        int iQ = d9.i.q(i11, i10);
        if (i10 == 5) {
            aVar.f4980a = objArr[iQ];
            objArrO = null;
        } else {
            Object obj = objArr[iQ];
            d7.a.k(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrO = o((Object[]) obj, i10 - 5, i11, aVar);
        }
        if (objArrO == null && iQ == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[iQ] = objArrO;
        return objArrCopyOf;
    }

    public static Object[] u(int i10, int i11, Object obj, Object[] objArr) {
        int iQ = d9.i.q(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
        if (i10 == 0) {
            objArrCopyOf[iQ] = obj;
        } else {
            Object obj2 = objArrCopyOf[iQ];
            d7.a.k(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf[iQ] = u(i10 - 5, i11, obj, (Object[]) obj2);
        }
        return objArrCopyOf;
    }

    @Override // java.util.Collection, java.util.List, p0.d
    public final p0.d add(Object obj) {
        int iT = t();
        int i10 = this.f13053c;
        int i11 = i10 - iT;
        Object[] objArr = this.f13051a;
        Object[] objArr2 = this.f13052b;
        if (i11 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return p(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i11] = obj;
        return new e(i10 + 1, this.f13054d, objArr, objArrCopyOf);
    }

    @Override // r8.a
    public final int e() {
        return this.f13053c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        z6.a.h(i10, e());
        if (t() <= i10) {
            objArr = this.f13052b;
        } else {
            objArr = this.f13051a;
            for (int i11 = this.f13054d; i11 > 0; i11 -= 5) {
                Object obj = objArr[d9.i.q(i10, i11)];
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // p0.d
    public final p0.d h(b bVar) {
        f fVarBuilder = builder();
        fVarBuilder.I(bVar);
        return fVarBuilder.k();
    }

    @Override // p0.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final f builder() {
        return new f(this, this.f13051a, this.f13052b, this.f13054d);
    }

    @Override // r8.d, java.util.List
    public final ListIterator listIterator(int i10) {
        z6.a.k(i10, e());
        return new g(i10, e(), (this.f13054d / 5) + 1, this.f13051a, this.f13052b);
    }

    @Override // p0.d
    public final p0.d m(int i10) {
        z6.a.h(i10, this.f13053c);
        int iT = t();
        Object[] objArr = this.f13051a;
        int i11 = this.f13054d;
        return i10 >= iT ? s(objArr, iT, i11, i10 - iT) : s(r(objArr, i11, i10, new e.a(this.f13052b[0])), iT, i11, 0);
    }

    public final e n(Object obj, Object[] objArr, int i10) {
        int iT = t();
        int i11 = this.f13053c;
        int i12 = i11 - iT;
        Object[] objArr2 = this.f13052b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
        if (i12 < 32) {
            b9.b.H(i10 + 1, i10, i12, objArr2, objArrCopyOf);
            objArrCopyOf[i10] = obj;
            return new e(i11 + 1, this.f13054d, objArr, objArrCopyOf);
        }
        Object obj2 = objArr2[31];
        b9.b.H(i10 + 1, i10, i12 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return p(objArr, objArrCopyOf, objArr3);
    }

    public final e p(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f13053c;
        int i11 = i10 >> 5;
        int i12 = this.f13054d;
        if (i11 <= (1 << i12)) {
            return new e(i10 + 1, i12, q(i12, objArr, objArr2), objArr3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i13 = i12 + 5;
        return new e(i10 + 1, i13, q(i13, objArr4, objArr2), objArr3);
    }

    public final Object[] q(int i10, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iQ = d9.i.q(e() - 1, i10);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i10 == 5) {
            objArrCopyOf[iQ] = objArr2;
        } else {
            objArrCopyOf[iQ] = q(i10 - 5, (Object[]) objArrCopyOf[iQ], objArr2);
        }
        return objArrCopyOf;
    }

    public final Object[] r(Object[] objArr, int i10, int i11, e.a aVar) {
        Object[] objArrCopyOf;
        int iQ = d9.i.q(i11, i10);
        if (i10 == 0) {
            if (iQ == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
            }
            b9.b.H(iQ, iQ + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = aVar.f4980a;
            aVar.f4980a = objArr[iQ];
            return objArrCopyOf;
        }
        int iQ2 = objArr[31] == null ? d9.i.q(t() - 1, i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        d7.a.l(objArrCopyOf2, "copyOf(this, newSize)");
        int i12 = i10 - 5;
        int i13 = iQ + 1;
        if (i13 <= iQ2) {
            while (true) {
                Object obj = objArrCopyOf2[iQ2];
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iQ2] = r((Object[]) obj, i12, 0, aVar);
                if (iQ2 == i13) {
                    break;
                }
                iQ2--;
            }
        }
        Object obj2 = objArrCopyOf2[iQ];
        d7.a.k(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iQ] = r((Object[]) obj2, i12, i11, aVar);
        return objArrCopyOf2;
    }

    public final c s(Object[] objArr, int i10, int i11, int i12) {
        e eVar;
        int i13 = this.f13053c - i10;
        if (i13 != 1) {
            Object[] objArr2 = this.f13052b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
            int i14 = i13 - 1;
            if (i12 < i14) {
                b9.b.H(i12, i12 + 1, i13, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i14] = null;
            return new e((i10 + i13) - 1, i11, objArr, objArrCopyOf);
        }
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                d7.a.l(objArr, "copyOf(this, newSize)");
            }
            return new j(objArr);
        }
        e.a aVar = new e.a(null);
        Object[] objArrO = o(objArr, i11, i10 - 1, aVar);
        d7.a.j(objArrO);
        Object obj = aVar.f4980a;
        d7.a.k(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrO[1] == null) {
            Object obj2 = objArrO[0];
            d7.a.k(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            eVar = new e(i10, i11 - 5, (Object[]) obj2, objArr3);
        } else {
            eVar = new e(i10, i11, objArrO, objArr3);
        }
        return eVar;
    }

    @Override // r8.d, java.util.List, p0.d
    public final p0.d set(int i10, Object obj) {
        int i11 = this.f13053c;
        z6.a.h(i10, i11);
        int iT = t();
        Object[] objArr = this.f13051a;
        Object[] objArr2 = this.f13052b;
        int i12 = this.f13054d;
        if (iT > i10) {
            return new e(i11, i12, u(i12, i10, obj, objArr), objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i10 & 31] = obj;
        return new e(i11, i12, objArr, objArrCopyOf);
    }

    public final int t() {
        return (this.f13053c - 1) & (-32);
    }

    @Override // java.util.List, p0.d
    public final p0.d add(int i10, Object obj) {
        int i11 = this.f13053c;
        z6.a.k(i10, i11);
        if (i10 == i11) {
            return add(obj);
        }
        int iT = t();
        Object[] objArr = this.f13051a;
        if (i10 >= iT) {
            return n(obj, objArr, i10 - iT);
        }
        e.a aVar = new e.a(null);
        return n(aVar.f4980a, k(objArr, this.f13054d, i10, obj, aVar), 0);
    }
}
