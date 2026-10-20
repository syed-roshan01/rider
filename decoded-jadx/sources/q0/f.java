package q0;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class f extends r8.g implements Collection, e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p0.d f13055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f13056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f13057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t0.b f13059e = new t0.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f13060f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object[] f13061n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13062o;

    public f(p0.d dVar, Object[] objArr, Object[] objArr2, int i10) {
        this.f13055a = dVar;
        this.f13056b = objArr;
        this.f13057c = objArr2;
        this.f13058d = i10;
        this.f13060f = objArr;
        this.f13061n = objArr2;
        this.f13062o = dVar.size();
    }

    public static void n(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    public final void A(int i10, int i11, Object[] objArr) {
        if (i11 == 0) {
            this.f13060f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f13061n = objArr;
            this.f13062o = i10;
            this.f13058d = i11;
            return;
        }
        e.a aVar = new e.a(null);
        d7.a.j(objArr);
        Object[] objArrZ = z(objArr, i11, i10, aVar);
        d7.a.j(objArrZ);
        Object obj = aVar.f4980a;
        d7.a.k(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f13061n = (Object[]) obj;
        this.f13062o = i10;
        if (objArrZ[1] == null) {
            this.f13060f = (Object[]) objArrZ[0];
            this.f13058d = i11 - 5;
        } else {
            this.f13060f = objArrZ;
            this.f13058d = i11;
        }
    }

    public final Object[] B(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            throw new IllegalArgumentException("invalid buffersIterator".toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("negative shift".toString());
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrU = u(objArr);
        int iQ = d9.i.q(i10, i11);
        int i12 = i11 - 5;
        objArrU[iQ] = B((Object[]) objArrU[iQ], i10, i12, it);
        while (true) {
            iQ++;
            if (iQ >= 32 || !it.hasNext()) {
                break;
            }
            objArrU[iQ] = B((Object[]) objArrU[iQ], 0, i12, it);
        }
        return objArrU;
    }

    public final Object[] C(Object[] objArr, int i10, Object[][] objArr2) {
        o0.b bVar = new o0.b(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f13058d;
        Object[] objArrB = i11 < (1 << i12) ? B(objArr, i10, i12, bVar) : u(objArr);
        while (bVar.hasNext()) {
            this.f13058d += 5;
            objArrB = x(objArrB);
            int i13 = this.f13058d;
            B(objArrB, 1 << i13, i13, bVar);
        }
        return objArrB;
    }

    public final void D(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f13062o;
        int i11 = i10 >> 5;
        int i12 = this.f13058d;
        if (i11 > (1 << i12)) {
            this.f13060f = E(this.f13058d + 5, x(objArr), objArr2);
            this.f13061n = objArr3;
            this.f13058d += 5;
            this.f13062o++;
            return;
        }
        if (objArr == null) {
            this.f13060f = objArr2;
            this.f13061n = objArr3;
            this.f13062o = i10 + 1;
        } else {
            this.f13060f = E(i12, objArr, objArr2);
            this.f13061n = objArr3;
            this.f13062o++;
        }
    }

    public final Object[] E(int i10, Object[] objArr, Object[] objArr2) {
        int iQ = d9.i.q(e() - 1, i10);
        Object[] objArrU = u(objArr);
        if (i10 == 5) {
            objArrU[iQ] = objArr2;
        } else {
            objArrU[iQ] = E(i10 - 5, (Object[]) objArrU[iQ], objArr2);
        }
        return objArrU;
    }

    public final int F(b bVar, Object[] objArr, int i10, int i11, e.a aVar, ArrayList arrayList, ArrayList arrayList2) {
        if (s(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = aVar.f4980a;
        d7.a.k(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrW = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) bVar.invoke(obj2)).booleanValue()) {
                if (i11 == 32) {
                    objArrW = arrayList.isEmpty() ^ true ? (Object[]) arrayList.remove(arrayList.size() - 1) : w();
                    i11 = 0;
                }
                objArrW[i11] = obj2;
                i11++;
            }
        }
        aVar.f4980a = objArrW;
        if (objArr2 != objArrW) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    public final int G(b bVar, Object[] objArr, int i10, e.a aVar) {
        Object[] objArrU = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArrU = u(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrU[i11] = obj;
                i11++;
            }
        }
        aVar.f4980a = objArrU;
        return i11;
    }

    public final int H(b bVar, int i10, e.a aVar) {
        int iG = G(bVar, this.f13061n, i10, aVar);
        if (iG == i10) {
            return i10;
        }
        Object obj = aVar.f4980a;
        d7.a.k(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iG, i10, (Object) null);
        this.f13061n = objArr;
        this.f13062o -= i10 - iG;
        return iG;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    public final boolean I(b bVar) {
        Object[] objArrB;
        int i10;
        int iO = O();
        Object[] objArrY = null;
        e.a aVar = new e.a(null);
        boolean z10 = false;
        if (this.f13060f != null) {
            a aVarT = t(0);
            int i11 = 32;
            int iG = 32;
            while (iG == 32 && aVarT.hasNext()) {
                iG = G(bVar, (Object[]) aVarT.next(), 32, aVar);
            }
            if (iG == 32) {
                int iH = H(bVar, iO, aVar);
                if (iH == 0) {
                    A(this.f13062o, this.f13058d, this.f13060f);
                }
                if (iH != iO) {
                    z10 = true;
                }
            } else {
                int i12 = (aVarT.f13046a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iF = iG;
                while (aVarT.hasNext()) {
                    iF = F(bVar, (Object[]) aVarT.next(), 32, iF, aVar, arrayList2, arrayList);
                    i12 = i12;
                    i11 = i11;
                }
                int i13 = i12;
                int iF2 = F(bVar, this.f13061n, iO, iF, aVar, arrayList2, arrayList);
                Object obj = aVar.f4980a;
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iF2, i11, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrB = this.f13060f;
                    d7.a.j(objArrB);
                } else {
                    objArrB = B(this.f13060f, i13, this.f13058d, arrayList.iterator());
                }
                int size = i13 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    throw new IllegalArgumentException("invalid size".toString());
                }
                if (size == 0) {
                    this.f13058d = 0;
                } else {
                    int i14 = size - 1;
                    while (true) {
                        i10 = this.f13058d;
                        if ((i14 >> i10) != 0) {
                            break;
                        }
                        this.f13058d = i10 - 5;
                        Object[] objArr2 = objArrB[0];
                        d7.a.k(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrB = objArr2;
                    }
                    objArrY = y(i14, i10, objArrB);
                }
                this.f13060f = objArrY;
                this.f13061n = objArr;
                this.f13062o = size + iF2;
                z10 = true;
            }
        } else if (H(bVar, iO, aVar) != iO) {
            z10 = true;
        }
        if (z10) {
            ((AbstractList) this).modCount++;
        }
        return z10;
    }

    public final Object[] J(Object[] objArr, int i10, int i11, e.a aVar) {
        int iQ = d9.i.q(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iQ];
            Object[] objArrU = u(objArr);
            b9.b.H(iQ, iQ + 1, 32, objArr, objArrU);
            objArrU[31] = aVar.f4980a;
            aVar.f4980a = obj;
            return objArrU;
        }
        int iQ2 = objArr[31] == null ? d9.i.q(L() - 1, i10) : 31;
        Object[] objArrU2 = u(objArr);
        int i12 = i10 - 5;
        int i13 = iQ + 1;
        if (i13 <= iQ2) {
            while (true) {
                Object obj2 = objArrU2[iQ2];
                d7.a.k(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrU2[iQ2] = J((Object[]) obj2, i12, 0, aVar);
                if (iQ2 == i13) {
                    break;
                }
                iQ2--;
            }
        }
        Object obj3 = objArrU2[iQ];
        d7.a.k(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrU2[iQ] = J((Object[]) obj3, i12, i11, aVar);
        return objArrU2;
    }

    public final Object K(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f13062o - i10;
        if (i13 == 1) {
            Object obj = this.f13061n[0];
            A(i10, i11, objArr);
            return obj;
        }
        Object[] objArr2 = this.f13061n;
        Object obj2 = objArr2[i12];
        Object[] objArrU = u(objArr2);
        b9.b.H(i12, i12 + 1, i13, objArr2, objArrU);
        objArrU[i13 - 1] = null;
        this.f13060f = objArr;
        this.f13061n = objArrU;
        this.f13062o = (i10 + i13) - 1;
        this.f13058d = i11;
        return obj2;
    }

    public final int L() {
        int i10 = this.f13062o;
        if (i10 <= 32) {
            return 0;
        }
        return (i10 - 1) & (-32);
    }

    public final Object[] M(Object[] objArr, int i10, int i11, Object obj, e.a aVar) {
        int iQ = d9.i.q(i11, i10);
        Object[] objArrU = u(objArr);
        if (i10 != 0) {
            Object obj2 = objArrU[iQ];
            d7.a.k(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrU[iQ] = M((Object[]) obj2, i10 - 5, i11, obj, aVar);
            return objArrU;
        }
        if (objArrU != objArr) {
            ((AbstractList) this).modCount++;
        }
        aVar.f4980a = objArrU[iQ];
        objArrU[iQ] = obj;
        return objArrU;
    }

    public final void N(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrW;
        if (i12 < 1) {
            throw new IllegalArgumentException("requires at least one nullBuffer".toString());
        }
        Object[] objArrU = u(objArr);
        objArr2[0] = objArrU;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            b9.b.H(size + 1, i13, i11, objArrU, objArr3);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrW = objArrU;
            } else {
                objArrW = w();
                i12--;
                objArr2[i12] = objArrW;
            }
            int i16 = i11 - i15;
            b9.b.H(0, i16, i11, objArrU, objArr3);
            b9.b.H(size + 1, i13, i16, objArrU, objArrW);
            objArr3 = objArrW;
        }
        Iterator it = collection.iterator();
        n(objArrU, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] objArrW2 = w();
            n(objArrW2, 0, it);
            objArr2[i17] = objArrW2;
        }
        n(objArr3, 0, it);
    }

    public final int O() {
        int i10 = this.f13062o;
        return i10 <= 32 ? i10 : i10 - ((i10 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        z6.a.k(i10, e());
        if (i10 == e()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iL = L();
        if (i10 >= iL) {
            r(obj, this.f13060f, i10 - iL);
            return;
        }
        e.a aVar = new e.a(null);
        Object[] objArr = this.f13060f;
        d7.a.j(objArr);
        r(aVar.f4980a, q(objArr, this.f13058d, i10, obj, aVar), 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iO = O();
        Iterator it = collection.iterator();
        if (32 - iO >= collection.size()) {
            Object[] objArrU = u(this.f13061n);
            n(objArrU, iO, it);
            this.f13061n = objArrU;
            this.f13062o = collection.size() + this.f13062o;
        } else {
            int size = ((collection.size() + iO) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] objArrU2 = u(this.f13061n);
            n(objArrU2, iO, it);
            objArr[0] = objArrU2;
            for (int i10 = 1; i10 < size; i10++) {
                Object[] objArrW = w();
                n(objArrW, 0, it);
                objArr[i10] = objArrW;
            }
            this.f13060f = C(this.f13060f, L(), objArr);
            Object[] objArrW2 = w();
            n(objArrW2, 0, it);
            this.f13061n = objArrW2;
            this.f13062o = collection.size() + this.f13062o;
        }
        return true;
    }

    @Override // r8.g
    public final int e() {
        return this.f13062o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        z6.a.h(i10, e());
        if (L() <= i10) {
            objArr = this.f13061n;
        } else {
            objArr = this.f13060f;
            d7.a.j(objArr);
            for (int i11 = this.f13058d; i11 > 0; i11 -= 5) {
                Object obj = objArr[d9.i.q(i10, i11)];
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // r8.g
    public final Object i(int i10) {
        z6.a.h(i10, e());
        ((AbstractList) this).modCount++;
        int iL = L();
        if (i10 >= iL) {
            return K(this.f13060f, iL, this.f13058d, i10 - iL);
        }
        e.a aVar = new e.a(this.f13061n[0]);
        Object[] objArr = this.f13060f;
        d7.a.j(objArr);
        K(J(objArr, this.f13058d, i10, aVar), iL, this.f13058d, 0);
        return aVar.f4980a;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final p0.d k() {
        p0.d eVar;
        Object[] objArr = this.f13060f;
        if (objArr == this.f13056b && this.f13061n == this.f13057c) {
            eVar = this.f13055a;
        } else {
            this.f13059e = new t0.b();
            this.f13056b = objArr;
            Object[] objArr2 = this.f13061n;
            this.f13057c = objArr2;
            if (objArr != null) {
                d7.a.j(objArr);
                eVar = new e(e(), this.f13058d, objArr, this.f13061n);
            } else if (objArr2.length == 0) {
                eVar = j.f13070b;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.f13061n, e());
                d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
                eVar = new j(objArrCopyOf);
            }
        }
        this.f13055a = eVar;
        return eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        z6.a.k(i10, e());
        return new h(this, i10);
    }

    public final int o() {
        return ((AbstractList) this).modCount;
    }

    public final void p(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f13060f == null) {
            throw new IllegalStateException("root is null".toString());
        }
        int i13 = i10 >> 5;
        a aVarT = t(L() >> 5);
        int i14 = i12;
        Object[] objArrV = objArr2;
        while (aVarT.f13046a - 1 != i13) {
            Object[] objArr3 = (Object[]) aVarT.previous();
            b9.b.H(0, 32 - i11, 32, objArr3, objArrV);
            objArrV = v(i11, objArr3);
            i14--;
            objArr[i14] = objArrV;
        }
        Object[] objArr4 = (Object[]) aVarT.previous();
        int iL = i12 - (((L() >> 5) - 1) - i13);
        if (iL < i12) {
            objArr2 = objArr[iL];
            d7.a.j(objArr2);
        }
        N(collection, i10, objArr4, 32, objArr, iL, objArr2);
    }

    public final Object[] q(Object[] objArr, int i10, int i11, Object obj, e.a aVar) {
        Object obj2;
        int iQ = d9.i.q(i11, i10);
        if (i10 == 0) {
            aVar.f4980a = objArr[31];
            Object[] objArrU = u(objArr);
            b9.b.H(iQ + 1, iQ, 31, objArr, objArrU);
            objArrU[iQ] = obj;
            return objArrU;
        }
        Object[] objArrU2 = u(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrU2[iQ];
        d7.a.k(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrU2[iQ] = q((Object[]) obj3, i12, i11, obj, aVar);
        while (true) {
            iQ++;
            if (iQ >= 32 || (obj2 = objArrU2[iQ]) == null) {
                break;
            }
            objArrU2[iQ] = q((Object[]) obj2, i12, 0, aVar.f4980a, aVar);
        }
        return objArrU2;
    }

    public final void r(Object obj, Object[] objArr, int i10) {
        int iO = O();
        Object[] objArrU = u(this.f13061n);
        if (iO >= 32) {
            Object[] objArr2 = this.f13061n;
            Object obj2 = objArr2[31];
            b9.b.H(i10 + 1, i10, 31, objArr2, objArrU);
            objArrU[i10] = obj;
            D(objArr, objArrU, x(obj2));
            return;
        }
        b9.b.H(i10 + 1, i10, iO, this.f13061n, objArrU);
        objArrU[i10] = obj;
        this.f13060f = objArr;
        this.f13061n = objArrU;
        this.f13062o++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return I(new b(1, collection));
    }

    public final boolean s(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f13059e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        z6.a.h(i10, e());
        if (L() > i10) {
            e.a aVar = new e.a(null);
            Object[] objArr = this.f13060f;
            d7.a.j(objArr);
            this.f13060f = M(objArr, this.f13058d, i10, obj, aVar);
            return aVar.f4980a;
        }
        Object[] objArrU = u(this.f13061n);
        if (objArrU != this.f13061n) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = objArrU[i11];
        objArrU[i11] = obj;
        this.f13061n = objArrU;
        return obj2;
    }

    public final a t(int i10) {
        Object[] objArr = this.f13060f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root".toString());
        }
        int iL = L() >> 5;
        z6.a.k(i10, iL);
        int i11 = this.f13058d;
        return i11 == 0 ? new i(objArr, i10) : new k(objArr, i10, iL, i11 / 5);
    }

    public final Object[] u(Object[] objArr) {
        if (objArr == null) {
            return w();
        }
        if (s(objArr)) {
            return objArr;
        }
        Object[] objArrW = w();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        b9.b.L(objArr, objArrW, 0, length, 6);
        return objArrW;
    }

    public final Object[] v(int i10, Object[] objArr) {
        if (s(objArr)) {
            b9.b.H(i10, 0, 32 - i10, objArr, objArr);
            return objArr;
        }
        Object[] objArrW = w();
        b9.b.H(i10, 0, 32 - i10, objArr, objArrW);
        return objArrW;
    }

    public final Object[] w() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f13059e;
        return objArr;
    }

    public final Object[] x(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f13059e;
        return objArr;
    }

    public final Object[] y(int i10, int i11, Object[] objArr) {
        if (i11 < 0) {
            throw new IllegalArgumentException("shift should be positive".toString());
        }
        if (i11 == 0) {
            return objArr;
        }
        int iQ = d9.i.q(i10, i11);
        Object obj = objArr[iQ];
        d7.a.k(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objY = y(i10, i11 - 5, (Object[]) obj);
        if (iQ < 31) {
            int i12 = iQ + 1;
            if (objArr[i12] != null) {
                if (s(objArr)) {
                    Arrays.fill(objArr, i12, 32, (Object) null);
                }
                Object[] objArrW = w();
                b9.b.H(0, 0, i12, objArr, objArrW);
                objArr = objArrW;
            }
        }
        if (objY == objArr[iQ]) {
            return objArr;
        }
        Object[] objArrU = u(objArr);
        objArrU[iQ] = objY;
        return objArrU;
    }

    public final Object[] z(Object[] objArr, int i10, int i11, e.a aVar) {
        Object[] objArrZ;
        int iQ = d9.i.q(i11 - 1, i10);
        if (i10 == 5) {
            aVar.f4980a = objArr[iQ];
            objArrZ = null;
        } else {
            Object obj = objArr[iQ];
            d7.a.k(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrZ = z((Object[]) obj, i10 - 5, i11, aVar);
        }
        if (objArrZ == null && iQ == 0) {
            return null;
        }
        Object[] objArrU = u(objArr);
        objArrU[iQ] = objArrZ;
        return objArrU;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iO = O();
        if (iO < 32) {
            Object[] objArrU = u(this.f13061n);
            objArrU[iO] = obj;
            this.f13061n = objArrU;
            this.f13062o = e() + 1;
        } else {
            D(this.f13060f, this.f13061n, x(obj));
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        Object[] objArrW;
        z6.a.k(i10, this.f13062o);
        if (i10 == this.f13062o) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (this.f13062o - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            int size2 = ((collection.size() + i10) - 1) & 31;
            Object[] objArr = this.f13061n;
            Object[] objArrU = u(objArr);
            b9.b.H(size2 + 1, i12, O(), objArr, objArrU);
            n(objArrU, i12, collection.iterator());
            this.f13061n = objArrU;
            this.f13062o = collection.size() + this.f13062o;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iO = O();
        int size3 = collection.size() + this.f13062o;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i10 >= L()) {
            objArrW = w();
            N(collection, i10, this.f13061n, iO, objArr2, size, objArrW);
        } else if (size3 > iO) {
            int i13 = size3 - iO;
            objArrW = v(i13, this.f13061n);
            p(collection, i10, i13, objArr2, size, objArrW);
        } else {
            Object[] objArr3 = this.f13061n;
            objArrW = w();
            int i14 = iO - size3;
            b9.b.H(0, i14, iO, objArr3, objArrW);
            int i15 = 32 - i14;
            Object[] objArrV = v(i15, this.f13061n);
            int i16 = size - 1;
            objArr2[i16] = objArrV;
            p(collection, i10, i15, objArr2, i16, objArrV);
        }
        this.f13060f = C(this.f13060f, i11, objArr2);
        this.f13061n = objArrW;
        this.f13062o = collection.size() + this.f13062o;
        return true;
    }
}
