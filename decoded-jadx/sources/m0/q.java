package m0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q implements m {
    public int A;
    public boolean B;
    public boolean E;
    public m2 F;
    public n2 G;
    public q2 H;
    public boolean I;
    public r1 J;
    public n0.a K;
    public final n0.b L;
    public c M;
    public n0.c N;
    public boolean O;
    public int P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f11630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f11631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2 f11632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f11633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0.a f11634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0.a f11635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0 f11636g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q1 f11638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11639j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11641l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f11643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q.o f11644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11646q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o0.e f11650u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11651v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11653x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f11655z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k3 f11637h = new k3();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t0 f11640k = new t0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t0 f11642m = new t0();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f11647r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t0 f11648s = new t0();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r1 f11649t = u0.e.f15008d;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t0 f11652w = new t0();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11654y = -1;
    public final p C = new p(this, 0);
    public final k3 D = new k3();

    public q(t1.w1 w1Var, u uVar, n2 n2Var, HashSet hashSet, n0.a aVar, n0.a aVar2, e0 e0Var) {
        this.f11630a = w1Var;
        this.f11631b = uVar;
        this.f11632c = n2Var;
        this.f11633d = hashSet;
        this.f11634e = aVar;
        this.f11635f = aVar2;
        this.f11636g = e0Var;
        m2 m2VarI = n2Var.i();
        m2VarI.c();
        this.F = m2VarI;
        n2 n2Var2 = new n2();
        this.G = n2Var2;
        q2 q2VarK = n2Var2.k();
        q2VarK.e();
        this.H = q2VarK;
        this.L = new n0.b(this, aVar);
        m2 m2VarI2 = this.G.i();
        try {
            c cVarA = m2VarI2.a(0);
            m2VarI2.c();
            this.M = cVarA;
            this.N = new n0.c();
        } catch (Throwable th) {
            m2VarI2.c();
            throw th;
        }
    }

    public static final int R(q qVar, int i10, boolean z10, int i11) {
        m2 m2Var = qVar.F;
        int[] iArr = m2Var.f11584b;
        int i12 = i10 * 5;
        if ((iArr[i12 + 1] & 134217728) != 0) {
            int i13 = iArr[i12];
            Object objJ = m2Var.j(iArr, i10);
            if (i13 != 206 || !d7.a.d(objJ, s.f11697e)) {
                if (d7.t.v(iArr, i10)) {
                    return 1;
                }
                return d7.t.x(iArr, i10);
            }
            Object objG = m2Var.g(i10, 0);
            n nVar = objG instanceof n ? (n) objG : null;
            if (nVar != null) {
                for (q qVar2 : nVar.f11595a.f11610e) {
                    qVar2.Q();
                    qVar.f11631b.m(qVar2.f11636g);
                }
            }
            return d7.t.x(iArr, i10);
        }
        if (!d7.t.q(iArr, i10)) {
            if (d7.t.v(iArr, i10)) {
                return 1;
            }
            return d7.t.x(iArr, i10);
        }
        int i14 = iArr[i12 + 3] + i10;
        int iR = 0;
        for (int i15 = i10 + 1; i15 < i14; i15 += iArr[(i15 * 5) + 3]) {
            boolean zV = d7.t.v(iArr, i15);
            n0.b bVar = qVar.L;
            if (zV) {
                bVar.g();
                bVar.f12051h.f11577a.add(m2Var.i(i15));
            }
            iR += R(qVar, i15, zV || z10, zV ? 0 : i11 + iR);
            if (zV) {
                bVar.g();
                bVar.e();
            }
        }
        if (d7.t.v(iArr, i10)) {
            return 1;
        }
        return iR;
    }

    public static final void b(q qVar, r1 r1Var, Object obj) {
        r1 r1Var2 = null;
        qVar.V(null, 126665345, 0, null);
        qVar.I();
        qVar.m0(obj);
        int i10 = qVar.P;
        try {
            qVar.P = 126665345;
            if (qVar.O) {
                q2.t(qVar.H);
            }
            boolean z10 = (qVar.O || d7.a.d(qVar.F.e(), r1Var)) ? false : true;
            if (z10) {
                qVar.N(r1Var);
            }
            qVar.V(s.f11695c, 202, 0, r1Var);
            qVar.J = null;
            boolean z11 = qVar.f11651v;
            qVar.f11651v = z10;
            d9.i.r(qVar, new u0.b(316014703, new v.n0(8, r1Var2, obj), true));
            qVar.f11651v = z11;
        } finally {
            qVar.t(false);
            qVar.J = null;
            qVar.P = i10;
            qVar.t(false);
        }
    }

    public final void A(boolean z10, q1 q1Var) {
        this.f11637h.f11577a.add(this.f11638i);
        this.f11638i = q1Var;
        this.f11640k.b(this.f11639j);
        if (z10) {
            this.f11639j = 0;
        }
        this.f11642m.b(this.f11641l);
        this.f11641l = 0;
    }

    public final d B() {
        return this.f11630a;
    }

    public final r1 C() {
        return p();
    }

    public final x1 D() {
        if (this.f11655z == 0) {
            k3 k3Var = this.D;
            if (!k3Var.f11577a.isEmpty()) {
                return (x1) a7.a.k(k3Var.f11577a, 1);
            }
        }
        return null;
    }

    public final boolean E() {
        x1 x1VarD;
        return (G() && !this.f11651v && ((x1VarD = D()) == null || (x1VarD.f11753a & 4) == 0)) ? false : true;
    }

    public final boolean F() {
        return this.O;
    }

    public final boolean G() {
        x1 x1VarD;
        return (this.O || this.f11653x || this.f11651v || (x1VarD = D()) == null || (x1VarD.f11753a & 8) != 0) ? false : true;
    }

    public final void H(ArrayList arrayList) {
        n0.a aVar = this.f11635f;
        n0.b bVar = this.L;
        n0.a aVar2 = bVar.f12045b;
        try {
            bVar.f12045b = aVar;
            aVar.getClass();
            aVar.f12042a.g(n0.y.f12098c);
            if (arrayList.size() > 0) {
                q8.f fVar = (q8.f) arrayList.get(0);
                c1 c1Var = (c1) fVar.f13225a;
                c1Var.getClass();
                c1Var.getClass();
                throw null;
            }
            n0.a aVar3 = bVar.f12045b;
            aVar3.getClass();
            aVar3.f12042a.g(n0.m.f12086c);
            bVar.f12049f = 0;
            bVar.f12045b = aVar2;
        } catch (Throwable th) {
            bVar.f12045b = aVar2;
            throw th;
        }
    }

    public final Object I() {
        boolean z10 = this.O;
        k0.y0 y0Var = l.f11578a;
        if (z10) {
            p0();
            return y0Var;
        }
        Object objH = this.F.h();
        return (!this.f11653x || (objH instanceof n)) ? objH : y0Var;
    }

    public final boolean J(o0.a aVar) {
        n0.a aVar2 = this.f11634e;
        if (!aVar2.f12042a.d()) {
            s.g("Expected applyChanges() to have been called".toString());
            throw null;
        }
        if (aVar.f12327c <= 0 && !(!this.f11647r.isEmpty())) {
            return false;
        }
        r(aVar, null);
        return aVar2.f12042a.e();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0076 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0008, B:6:0x0015, B:8:0x0027, B:10:0x002e, B:14:0x0040, B:13:0x003d, B:17:0x0047, B:19:0x004d, B:21:0x0052, B:24:0x005a, B:26:0x0064, B:28:0x006a, B:29:0x006f, B:30:0x0070, B:32:0x0076, B:25:0x0060), top: B:39:0x0008, inners: #0 }] */
    public final Object K(e0 e0Var, e0 e0Var2, Integer num, List list, c9.a aVar) {
        Object objInvoke;
        boolean z10 = this.E;
        int i10 = this.f11639j;
        try {
            this.E = true;
            this.f11639j = 0;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                q8.f fVar = (q8.f) list.get(i11);
                x1 x1Var = (x1) fVar.f13225a;
                o0.d dVar = (o0.d) fVar.f13226b;
                if (dVar != null) {
                    Object[] objArr = dVar.f12333b;
                    int i12 = dVar.f12332a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        Object obj = objArr[i13];
                        d7.a.k(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        e0(x1Var, obj);
                    }
                } else {
                    e0(x1Var, null);
                }
            }
            if (e0Var == null) {
                objInvoke = aVar.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                x xVar = (x) e0Var;
                if (e0Var2 == null || d7.a.d(e0Var2, xVar) || iIntValue < 0) {
                    objInvoke = aVar.invoke();
                } else {
                    xVar.f11744v = (x) e0Var2;
                    xVar.f11745w = iIntValue;
                    try {
                        objInvoke = aVar.invoke();
                        xVar.f11744v = null;
                        xVar.f11745w = 0;
                    } catch (Throwable th) {
                        xVar.f11744v = null;
                        xVar.f11745w = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = aVar.invoke();
                }
            }
            this.E = z10;
            this.f11639j = i10;
            return objInvoke;
        } catch (Throwable th2) {
            this.E = z10;
            this.f11639j = i10;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0211  */
    /* JADX WARN: Code duplicated, block: B:105:0x021a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0227  */
    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    /* JADX WARN: Code duplicated, block: B:128:0x022a A[SYNTHETIC] */
    public final void L() {
        u0 u0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        q.r rVar;
        int iJ;
        int i15;
        u0 u0Var2;
        q8.l lVar;
        boolean z12 = this.E;
        this.E = true;
        m2 m2Var = this.F;
        int i16 = m2Var.f11591i;
        int iS = d7.t.s(m2Var.f11584b, i16) + i16;
        int i17 = this.f11639j;
        int i18 = this.P;
        int i19 = this.f11641l;
        ArrayList arrayList = this.f11647r;
        int iJ2 = s.j(this.F.f11589g, arrayList);
        if (iJ2 < 0) {
            iJ2 = -(iJ2 + 1);
        }
        if (iJ2 < arrayList.size()) {
            u0Var = (u0) arrayList.get(iJ2);
            if (u0Var.f11710b >= iS) {
                u0Var = null;
            }
        } else {
            u0Var = null;
        }
        int i20 = i16;
        boolean z13 = false;
        while (u0Var != null) {
            int i21 = u0Var.f11710b;
            int iJ3 = s.j(i21, arrayList);
            if (iJ3 >= 0) {
            }
            o0.d dVar = u0Var.f11711c;
            x1 x1Var = u0Var.f11709a;
            if (dVar == null) {
                x1Var.getClass();
            } else {
                q.s sVar = x1Var.f11759g;
                if (sVar != null && dVar.k()) {
                    if (!dVar.isEmpty()) {
                        Iterator it = dVar.iterator();
                        while (true) {
                            o0.b bVar = (o0.b) it;
                            if (bVar.hasNext()) {
                                Object next = bVar.next();
                                if (next instanceof k0) {
                                    k0 k0Var = (k0) next;
                                    j0 j0Var = (j0) k0Var;
                                    Iterator it2 = it;
                                    z2 z2Var = j0Var.f11571c;
                                    if (z2Var == null) {
                                        z2Var = o3.f11621a;
                                    }
                                    if (z2Var.a(j0Var.f().f11562f, sVar.f(k0Var))) {
                                        it = it2;
                                    }
                                }
                            }
                        }
                    }
                    k3 k3Var = this.D;
                    k3Var.f11577a.add(x1Var);
                    y1 y1Var = x1Var.f11754b;
                    if (y1Var == null || (rVar = x1Var.f11758f) == null) {
                        i10 = iS;
                        i11 = i17;
                        i12 = i18;
                        i13 = i19;
                        z10 = z13;
                    } else {
                        x1Var.c(true);
                        try {
                            Object[] objArr = rVar.f13022b;
                            int[] iArr = rVar.f13023c;
                            long[] jArr = rVar.f13021a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                i11 = i17;
                                i12 = i18;
                                i13 = i19;
                                int i22 = 0;
                                while (true) {
                                    long j10 = jArr[i22];
                                    long[] jArr2 = jArr;
                                    z10 = z13;
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i23 = 8 - ((~(i22 - length)) >>> 31);
                                        int i24 = 0;
                                        while (i24 < i23) {
                                            if ((j10 & 255) < 128) {
                                                int i25 = (i22 << 3) + i24;
                                                Object obj = objArr[i25];
                                                int i26 = iArr[i25];
                                                y1Var.d(obj);
                                            }
                                            j10 >>= 8;
                                            i24++;
                                            iS = iS;
                                        }
                                        i10 = iS;
                                        if (i23 != 8) {
                                            break;
                                        }
                                    } else {
                                        i10 = iS;
                                    }
                                    if (i22 == length) {
                                        break;
                                    }
                                    i22++;
                                    z13 = z10;
                                    jArr = jArr2;
                                    iS = i10;
                                }
                            } else {
                                i10 = iS;
                                i11 = i17;
                                i12 = i18;
                                i13 = i19;
                                z10 = z13;
                            }
                            x1Var.c(false);
                        } catch (Throwable th) {
                            x1Var.c(false);
                            throw th;
                        }
                    }
                    ArrayList arrayList2 = k3Var.f11577a;
                    arrayList2.remove(arrayList2.size() - 1);
                    i14 = i12;
                    z13 = z10;
                    z11 = true;
                }
                iJ = s.j(this.F.f11589g, arrayList);
                if (iJ < 0) {
                    iJ = -(iJ + 1);
                }
                if (iJ < arrayList.size()) {
                    u0Var2 = (u0) arrayList.get(iJ);
                    i15 = i10;
                    if (u0Var2.f11710b < i15) {
                    }
                    i19 = i13;
                    i17 = i11;
                    i18 = i14;
                    iS = i15;
                    u0Var = u0Var2;
                    z12 = z12;
                } else {
                    i15 = i10;
                }
                u0Var2 = null;
                i19 = i13;
                i17 = i11;
                i18 = i14;
                iS = i15;
                u0Var = u0Var2;
                z12 = z12;
            }
            z12 = z12;
            i10 = iS;
            i11 = i17;
            int i27 = i18;
            i13 = i19;
            this.F.k(i21);
            int i28 = this.F.f11589g;
            O(i20, i28, i16);
            int iY = d7.t.y(this.F.f11584b, i28);
            while (iY != i16 && !d7.t.v(this.F.f11584b, iY)) {
                iY = d7.t.y(this.F.f11584b, iY);
            }
            int iN0 = d7.t.v(this.F.f11584b, iY) ? 0 : i11;
            if (iY != i28) {
                int iN1 = (n0(iY) - d7.t.x(this.F.f11584b, i28)) + iN0;
                while (iN0 < iN1 && iY != i21) {
                    iY++;
                    while (true) {
                        if (iY >= i21) {
                            break;
                        }
                        int iS2 = d7.t.s(this.F.f11584b, iY) + iY;
                        if (i21 >= iS2) {
                            iN0 += n0(iY);
                            iY = iS2;
                        }
                    }
                }
            }
            this.f11639j = iN0;
            i14 = i27;
            this.P = l(d7.t.y(this.F.f11584b, i28), i16, i14);
            this.J = null;
            c9.e eVar = x1Var.f11756d;
            z11 = true;
            if (eVar != null) {
                eVar.invoke(this, 1);
                lVar = q8.l.f13235a;
            } else {
                lVar = null;
            }
            if (lVar == null) {
                throw new IllegalStateException("Invalid restart scope".toString());
            }
            this.J = null;
            m2 m2Var2 = this.F;
            int iS3 = d7.t.s(m2Var2.f11584b, i16) + i16;
            int i29 = m2Var2.f11589g;
            if (i29 < i16 || i29 > iS3) {
                s.g(("Index " + i16 + " is not a parent of " + i29).toString());
                throw null;
            }
            m2Var2.f11591i = i16;
            m2Var2.f11590h = iS3;
            m2Var2.f11593k = 0;
            m2Var2.f11594l = 0;
            i20 = i28;
            z13 = true;
            iJ = s.j(this.F.f11589g, arrayList);
            if (iJ < 0) {
                iJ = -(iJ + 1);
            }
            if (iJ < arrayList.size()) {
                u0Var2 = (u0) arrayList.get(iJ);
                i15 = i10;
                if (u0Var2.f11710b < i15) {
                }
                i19 = i13;
                i17 = i11;
                i18 = i14;
                iS = i15;
                u0Var = u0Var2;
                z12 = z12;
            } else {
                i15 = i10;
            }
            u0Var2 = null;
            i19 = i13;
            i17 = i11;
            i18 = i14;
            iS = i15;
            u0Var = u0Var2;
            z12 = z12;
        }
        boolean z14 = z12;
        int i30 = i17;
        int i31 = i18;
        int i32 = i19;
        if (z13) {
            O(i20, i16, i16);
            this.F.m();
            int iN2 = n0(i16);
            this.f11639j = i30 + iN2;
            this.f11641l = i32 + iN2;
        } else {
            T();
        }
        this.P = i31;
        this.E = z14;
    }

    public final void M() {
        R(this, this.F.f11589g, false, 0);
        n0.b bVar = this.L;
        bVar.g();
        bVar.h(false);
        q qVar = bVar.f12044a;
        m2 m2Var = qVar.F;
        if (m2Var.f11585c > 0) {
            int i10 = m2Var.f11591i;
            t0 t0Var = bVar.f12047d;
            int i11 = t0Var.f11705b;
            if ((i11 > 0 ? t0Var.f11704a[i11 - 1] : -2) != i10) {
                if (!bVar.f12046c && bVar.f12048e) {
                    bVar.h(false);
                    n0.a aVar = bVar.f12045b;
                    aVar.getClass();
                    aVar.f12042a.g(n0.o.f12088c);
                    bVar.f12046c = true;
                }
                if (i10 > 0) {
                    c cVarA = m2Var.a(i10);
                    t0Var.b(i10);
                    bVar.h(false);
                    n0.a aVar2 = bVar.f12045b;
                    aVar2.getClass();
                    n0.n nVar = n0.n.f12087c;
                    n0.i0 i0Var = aVar2.f12042a;
                    i0Var.h(nVar);
                    f6.a.g0(i0Var, 0, cVarA);
                    int i12 = i0Var.f12081g;
                    int i13 = nVar.f12067a;
                    int iA = n0.i0.a(i0Var, i13);
                    int i14 = nVar.f12068b;
                    if (i12 != iA || i0Var.f12082h != n0.i0.a(i0Var, i14)) {
                        StringBuilder sb = new StringBuilder();
                        int i15 = 0;
                        for (int i16 = 0; i16 < i13; i16++) {
                            if (((1 << i16) & i0Var.f12081g) != 0) {
                                if (i15 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(nVar.b(i16));
                                i15++;
                            }
                        }
                        String string = sb.toString();
                        StringBuilder sbN = l.q.n(string, "StringBuilder().apply(builderAction).toString()");
                        int i17 = 0;
                        for (int i18 = 0; i18 < i14; i18++) {
                            if (((1 << i18) & i0Var.f12082h) != 0) {
                                if (i15 > 0) {
                                    sbN.append(", ");
                                }
                                sbN.append(nVar.c(i18));
                                i17++;
                            }
                        }
                        String string2 = sbN.toString();
                        d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
                        StringBuilder sb2 = new StringBuilder("Error while pushing ");
                        sb2.append(nVar);
                        sb2.append(". Not all arguments were provided. Missing ");
                        l.q.t(sb2, i15, " int arguments (", string, ") and ");
                        throw new IllegalStateException(l.q.m(sb2, i17, " object arguments (", string2, ").").toString());
                    }
                    bVar.f12046c = true;
                }
            }
        }
        n0.a aVar3 = bVar.f12045b;
        aVar3.getClass();
        aVar3.f12042a.g(n0.w.f12096c);
        int i19 = bVar.f12049f;
        m2 m2Var2 = qVar.F;
        bVar.f12049f = d7.t.s(m2Var2.f11584b, m2Var2.f11589g) + i19;
    }

    public final void N(r1 r1Var) {
        o0.e eVar = this.f11650u;
        if (eVar == null) {
            eVar = new o0.e();
            this.f11650u = eVar;
        }
        eVar.f12334a.put(this.F.f11589g, r1Var);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0004  */
    public final void O(int i10, int i11, int i12) {
        m2 m2Var = this.F;
        if (i10 == i11) {
            i12 = i10;
        } else if (i10 != i12 && i11 != i12) {
            if (d7.t.y(m2Var.f11584b, i10) == i11) {
                i12 = i11;
            } else {
                int[] iArr = m2Var.f11584b;
                if (d7.t.y(iArr, i11) == i10) {
                    i12 = i10;
                } else {
                    int i13 = iArr[(i10 * 5) + 2];
                    if (i13 == iArr[(i11 * 5) + 2]) {
                        i12 = i13;
                    } else {
                        int iY = i10;
                        int i14 = 0;
                        while (iY > 0 && iY != i12) {
                            iY = d7.t.y(iArr, iY);
                            i14++;
                        }
                        int iY2 = i11;
                        int i15 = 0;
                        while (iY2 > 0 && iY2 != i12) {
                            iY2 = d7.t.y(iArr, iY2);
                            i15++;
                        }
                        int i16 = i14 - i15;
                        int i17 = i10;
                        for (int i18 = 0; i18 < i16; i18++) {
                            i17 = iArr[(i17 * 5) + 2];
                        }
                        int i19 = i15 - i14;
                        int i20 = i11;
                        for (int i21 = 0; i21 < i19; i21++) {
                            i20 = iArr[(i20 * 5) + 2];
                        }
                        i12 = i17;
                        for (int i22 = i20; i12 != i22; i22 = iArr[(i22 * 5) + 2]) {
                            i12 = iArr[(i12 * 5) + 2];
                        }
                    }
                }
            }
        }
        while (i10 > 0 && i10 != i12) {
            if (d7.t.v(m2Var.f11584b, i10)) {
                this.L.e();
            }
            i10 = d7.t.y(m2Var.f11584b, i10);
        }
        s(i11, i12);
    }

    public final Object P() {
        boolean z10 = this.O;
        k0.y0 y0Var = l.f11578a;
        if (z10) {
            p0();
            return y0Var;
        }
        Object objH = this.F.h();
        if (!this.f11653x || (objH instanceof n)) {
            return objH instanceof j2 ? ((j2) objH).f11574a : objH;
        }
        return y0Var;
    }

    public final void Q() {
        n0.b bVar = this.L;
        n2 n2Var = this.f11632c;
        if (n2Var.f11597b <= 0 || !d7.t.q(n2Var.f11596a, 0)) {
            return;
        }
        n0.a aVar = new n0.a();
        this.K = aVar;
        m2 m2VarI = n2Var.i();
        try {
            this.F = m2VarI;
            n0.a aVar2 = bVar.f12045b;
            try {
                bVar.f12045b = aVar;
                R(this, 0, false, 0);
                bVar.g();
                bVar.f();
                if (bVar.f12046c) {
                    n0.a aVar3 = bVar.f12045b;
                    aVar3.getClass();
                    aVar3.f12042a.g(n0.a0.f12043c);
                    if (bVar.f12046c) {
                        bVar.h(false);
                        bVar.h(false);
                        n0.a aVar4 = bVar.f12045b;
                        aVar4.getClass();
                        aVar4.f12042a.g(n0.l.f12085c);
                        bVar.f12046c = false;
                    }
                }
                bVar.f12045b = aVar2;
                m2VarI.c();
            } catch (Throwable th) {
                bVar.f12045b = aVar2;
                throw th;
            }
        } catch (Throwable th2) {
            m2VarI.c();
            throw th2;
        }
    }

    public final void S() {
        if (this.f11647r.isEmpty()) {
            this.f11641l = this.F.l() + this.f11641l;
            return;
        }
        m2 m2Var = this.F;
        int iF = m2Var.f();
        int i10 = m2Var.f11589g;
        int i11 = m2Var.f11590h;
        int[] iArr = m2Var.f11584b;
        Object objJ = i10 < i11 ? m2Var.j(iArr, i10) : null;
        Object objE = m2Var.e();
        f0(iF, objJ, objE);
        Y(null, d7.t.v(iArr, m2Var.f11589g));
        L();
        m2Var.d();
        g0(iF, objJ, objE);
    }

    public final void T() {
        m2 m2Var = this.F;
        int i10 = m2Var.f11591i;
        this.f11641l = i10 >= 0 ? d7.t.x(m2Var.f11584b, i10) : 0;
        this.F.m();
    }

    public final void U() {
        if (this.f11641l != 0) {
            s.g("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw null;
        }
        x1 x1VarD = D();
        if (x1VarD != null) {
            x1VarD.f11753a |= 16;
        }
        if (this.f11647r.isEmpty()) {
            T();
        } else {
            L();
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
    public final void V(Object obj, int i10, int i11, Object obj2) {
        q1 q1Var;
        Object objG0;
        m2 m2Var;
        ArrayList arrayList;
        int i12;
        int[] iArr;
        int iX;
        this = this;
        Object obj3 = obj;
        p0();
        this.f0(i10, obj3, obj2);
        boolean z10 = i11 != 0;
        boolean z11 = this.O;
        k0.y0 y0Var = l.f11578a;
        if (z11) {
            this.F.f11592j++;
            q2 q2Var = this.H;
            int i13 = q2Var.f11682r;
            if (z10) {
                q2Var.J(i10, y0Var, y0Var, true);
            } else if (obj2 != null) {
                if (obj3 == null) {
                    obj3 = y0Var;
                }
                q2Var.J(i10, obj3, obj2, false);
            } else {
                if (obj3 == null) {
                    obj3 = y0Var;
                }
                q2Var.J(i10, obj3, y0Var, false);
            }
            q1 q1Var2 = this.f11638i;
            if (q1Var2 != null) {
                int i14 = (-2) - i13;
                w0 w0Var = new w0(-1, i10, i14, -1);
                q1Var2.f11663e.put(Integer.valueOf(i14), new q0(-1, this.f11639j - q1Var2.f11660b, 0));
                q1Var2.f11662d.add(w0Var);
            }
            this.A(z10, null);
            return;
        }
        boolean z12 = i11 == 1 && this.f11653x;
        if (this.f11638i == null) {
            int iF = this.F.f();
            if (z12 || iF != i10) {
                m2Var = this.F;
                m2Var.getClass();
                arrayList = new ArrayList();
                if (m2Var.f11592j <= 0) {
                    i12 = m2Var.f11589g;
                    while (i12 < m2Var.f11590h) {
                        int i15 = i12 * 5;
                        iArr = m2Var.f11584b;
                        int i16 = iArr[i15];
                        Object objJ = m2Var.j(iArr, i12);
                        if (d7.t.v(iArr, i12)) {
                            iX = 1;
                        } else {
                            iX = d7.t.x(iArr, i12);
                        }
                        arrayList.add(new w0(objJ, i16, i12, iX));
                        i12 += iArr[i15 + 3];
                    }
                }
                this.f11638i = new q1(this.f11639j, arrayList);
            } else {
                m2 m2Var2 = this.F;
                int i17 = m2Var2.f11589g;
                if (d7.a.d(obj3, i17 < m2Var2.f11590h ? m2Var2.j(m2Var2.f11584b, i17) : null)) {
                    this.Y(obj2, z10);
                } else {
                    m2Var = this.F;
                    m2Var.getClass();
                    arrayList = new ArrayList();
                    if (m2Var.f11592j <= 0) {
                        i12 = m2Var.f11589g;
                        while (i12 < m2Var.f11590h) {
                            int i18 = i12 * 5;
                            iArr = m2Var.f11584b;
                            int i19 = iArr[i18];
                            Object objJ2 = m2Var.j(iArr, i12);
                            if (d7.t.v(iArr, i12)) {
                                iX = 1;
                            } else {
                                iX = d7.t.x(iArr, i12);
                            }
                            arrayList.add(new w0(objJ2, i19, i12, iX));
                            i12 += iArr[i18 + 3];
                        }
                    }
                    this.f11638i = new q1(this.f11639j, arrayList);
                }
            }
        }
        q1 q1Var3 = this.f11638i;
        if (q1Var3 != null) {
            Object v0Var = obj3 != null ? new v0(Integer.valueOf(i10), obj3) : Integer.valueOf(i10);
            HashMap map = (HashMap) q1Var3.f11664f.getValue();
            LinkedHashSet linkedHashSet = (LinkedHashSet) map.get(v0Var);
            if (linkedHashSet == null || (objG0 = r8.p.G0(linkedHashSet)) == null) {
                objG0 = null;
            } else {
                LinkedHashSet linkedHashSet2 = (LinkedHashSet) map.get(v0Var);
                if (linkedHashSet2 != null) {
                    linkedHashSet2.remove(objG0);
                    if (linkedHashSet2.isEmpty()) {
                        map.remove(v0Var);
                    }
                }
            }
            w0 w0Var2 = (w0) objG0;
            HashMap map2 = q1Var3.f11663e;
            ArrayList arrayList2 = q1Var3.f11662d;
            int i20 = q1Var3.f11660b;
            if (z12 || w0Var2 == null) {
                z10 = z10;
                this.F.f11592j++;
                this.O = true;
                this.J = null;
                if (this.H.f11685u) {
                    q2 q2VarK = this.G.k();
                    this.H = q2VarK;
                    q2VarK.F();
                    this.I = false;
                    this.J = null;
                }
                this.H.d();
                q2 q2Var2 = this.H;
                int i21 = q2Var2.f11682r;
                if (z10) {
                    q2Var2.J(i10, y0Var, y0Var, true);
                } else if (obj2 != null) {
                    if (obj3 == null) {
                        obj3 = y0Var;
                    }
                    q2Var2.J(i10, obj3, obj2, false);
                } else {
                    if (obj3 == null) {
                        obj3 = y0Var;
                    }
                    q2Var2.J(i10, obj3, y0Var, false);
                }
                this.M = this.H.b(i21);
                int i22 = (-2) - i21;
                w0 w0Var3 = new w0(-1, i10, i22, -1);
                map2.put(Integer.valueOf(i22), new q0(-1, this.f11639j - i20, 0));
                arrayList2.add(w0Var3);
                q1Var = new q1(z10 ? 0 : this.f11639j, new ArrayList());
            } else {
                arrayList2.add(w0Var2);
                this.f11639j = q1Var3.a(w0Var2) + i20;
                int i23 = w0Var2.f11727c;
                q0 q0Var = (q0) map2.get(Integer.valueOf(i23));
                int i24 = q0Var != null ? q0Var.f11656a : -1;
                int i25 = q1Var3.f11661c;
                int i26 = i24 - i25;
                if (i24 > i25) {
                    for (q0 q0Var2 : map2.values()) {
                        int i27 = q0Var2.f11656a;
                        if (i27 == i24) {
                            q0Var2.f11656a = i25;
                        } else if (i25 <= i27 && i27 < i24) {
                            q0Var2.f11656a = i27 + 1;
                        }
                    }
                } else if (i25 > i24) {
                    for (q0 q0Var3 : map2.values()) {
                        int i28 = q0Var3.f11656a;
                        if (i28 == i24) {
                            q0Var3.f11656a = i25;
                        } else if (i24 + 1 <= i28 && i28 < i25) {
                            q0Var3.f11656a = i28 - 1;
                        }
                    }
                }
                n0.b bVar = this.L;
                int i29 = bVar.f12049f;
                q qVar = bVar.f12044a;
                bVar.f12049f = (i23 - qVar.F.f11589g) + i29;
                this.F.k(i23);
                if (i26 > 0) {
                    bVar.h(false);
                    m2 m2Var3 = qVar.F;
                    if (m2Var3.f11585c > 0) {
                        int i30 = m2Var3.f11591i;
                        t0 t0Var = bVar.f12047d;
                        int i31 = t0Var.f11705b;
                        if ((i31 > 0 ? t0Var.f11704a[i31 - 1] : -2) != i30) {
                            if (!bVar.f12046c && bVar.f12048e) {
                                bVar.h(false);
                                n0.a aVar = bVar.f12045b;
                                aVar.getClass();
                                aVar.f12042a.g(n0.o.f12088c);
                                bVar.f12046c = true;
                            }
                            if (i30 > 0) {
                                c cVarA = m2Var3.a(i30);
                                t0Var.b(i30);
                                bVar.h(false);
                                n0.a aVar2 = bVar.f12045b;
                                aVar2.getClass();
                                n0.n nVar = n0.n.f12087c;
                                n0.i0 i0Var = aVar2.f12042a;
                                i0Var.h(nVar);
                                f6.a.g0(i0Var, 0, cVarA);
                                int i32 = i0Var.f12081g;
                                int i33 = nVar.f12067a;
                                int iA = n0.i0.a(i0Var, i33);
                                int i34 = nVar.f12068b;
                                if (i32 != iA || i0Var.f12082h != n0.i0.a(i0Var, i34)) {
                                    int i35 = 1;
                                    StringBuilder sb = new StringBuilder();
                                    int i36 = 0;
                                    int i37 = 0;
                                    while (i36 < i33) {
                                        if (((i35 << i36) & i0Var.f12081g) != 0) {
                                            if (i37 > 0) {
                                                sb.append(", ");
                                            }
                                            sb.append(nVar.b(i36));
                                            i37++;
                                        }
                                        i36++;
                                        i35 = 1;
                                    }
                                    String string = sb.toString();
                                    StringBuilder sbN = l.q.n(string, "StringBuilder().apply(builderAction).toString()");
                                    int i38 = 0;
                                    int i39 = 0;
                                    while (i38 < i34) {
                                        int i40 = i34;
                                        if (((1 << i38) & i0Var.f12082h) != 0) {
                                            if (i37 > 0) {
                                                sbN.append(", ");
                                            }
                                            sbN.append(nVar.c(i38));
                                            i39++;
                                        }
                                        i38++;
                                        i34 = i40;
                                    }
                                    String string2 = sbN.toString();
                                    d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
                                    StringBuilder sb2 = new StringBuilder("Error while pushing ");
                                    sb2.append(nVar);
                                    sb2.append(". Not all arguments were provided. Missing ");
                                    l.q.t(sb2, i37, " int arguments (", string, ") and ");
                                    throw new IllegalStateException(l.q.m(sb2, i39, " object arguments (", string2, ").").toString());
                                }
                                bVar.f12046c = true;
                            }
                        }
                    }
                    n0.a aVar3 = bVar.f12045b;
                    aVar3.getClass();
                    n0.s sVar = n0.s.f12092c;
                    n0.i0 i0Var2 = aVar3.f12042a;
                    i0Var2.h(sVar);
                    f6.a.f0(i0Var2, 0, i26);
                    int i41 = i0Var2.f12081g;
                    int i42 = sVar.f12067a;
                    int iA2 = n0.i0.a(i0Var2, i42);
                    int i43 = sVar.f12068b;
                    if (i41 != iA2 || i0Var2.f12082h != n0.i0.a(i0Var2, i43)) {
                        StringBuilder sb3 = new StringBuilder();
                        int i44 = 0;
                        for (int i45 = 0; i45 < i42; i45++) {
                            if (((1 << i45) & i0Var2.f12081g) != 0) {
                                if (i44 > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(sVar.b(i45));
                                i44++;
                            }
                        }
                        String string3 = sb3.toString();
                        StringBuilder sbN2 = l.q.n(string3, "StringBuilder().apply(builderAction).toString()");
                        int i46 = 0;
                        int i47 = 0;
                        while (i46 < i43) {
                            int i48 = i43;
                            if (((1 << i46) & i0Var2.f12082h) != 0) {
                                if (i44 > 0) {
                                    sbN2.append(", ");
                                }
                                sbN2.append(sVar.c(i46));
                                i47++;
                            }
                            i46++;
                            i43 = i48;
                        }
                        String string4 = sbN2.toString();
                        d7.a.l(string4, "StringBuilder().apply(builderAction).toString()");
                        StringBuilder sb4 = new StringBuilder("Error while pushing ");
                        sb4.append(sVar);
                        sb4.append(". Not all arguments were provided. Missing ");
                        l.q.t(sb4, i44, " int arguments (", string3, ") and ");
                        throw new IllegalStateException(l.q.m(sb4, i47, " object arguments (", string4, ").").toString());
                    }
                }
                Y(obj2, z10);
            }
            this.A(z10, q1Var);
        }
        z10 = z10;
        q1Var = null;
        this.A(z10, q1Var);
    }

    public final void W() {
        V(null, -127, 0, null);
    }

    public final void X(int i10, j1 j1Var) {
        V(j1Var, i10, 0, null);
    }

    public final void Y(Object obj, boolean z10) {
        if (z10) {
            m2 m2Var = this.F;
            if (m2Var.f11592j <= 0) {
                if (!d7.t.v(m2Var.f11584b, m2Var.f11589g)) {
                    throw new IllegalArgumentException("Expected a node group".toString());
                }
                m2Var.n();
                return;
            }
            return;
        }
        if (obj != null && this.F.e() != obj) {
            n0.b bVar = this.L;
            bVar.getClass();
            bVar.h(false);
            n0.a aVar = bVar.f12045b;
            aVar.getClass();
            n0.b0 b0Var = n0.b0.f12056c;
            n0.i0 i0Var = aVar.f12042a;
            i0Var.h(b0Var);
            f6.a.g0(i0Var, 0, obj);
            int i10 = i0Var.f12081g;
            int i11 = b0Var.f12067a;
            int iA = n0.i0.a(i0Var, i11);
            int i12 = b0Var.f12068b;
            if (i10 != iA || i0Var.f12082h != n0.i0.a(i0Var, i12)) {
                StringBuilder sb = new StringBuilder();
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    if (((1 << i14) & i0Var.f12081g) != 0) {
                        if (i13 > 0) {
                            sb.append(", ");
                        }
                        sb.append(b0Var.b(i14));
                        i13++;
                    }
                }
                String string = sb.toString();
                StringBuilder sbN = l.q.n(string, "StringBuilder().apply(builderAction).toString()");
                int i15 = 0;
                for (int i16 = 0; i16 < i12; i16++) {
                    if (((1 << i16) & i0Var.f12082h) != 0) {
                        if (i13 > 0) {
                            sbN.append(", ");
                        }
                        sbN.append(b0Var.c(i16));
                        i15++;
                    }
                }
                String string2 = sbN.toString();
                d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb2 = new StringBuilder("Error while pushing ");
                sb2.append(b0Var);
                sb2.append(". Not all arguments were provided. Missing ");
                l.q.t(sb2, i13, " int arguments (", string, ") and ");
                throw new IllegalStateException(l.q.m(sb2, i15, " object arguments (", string2, ").").toString());
            }
        }
        this.F.n();
    }

    public final void Z(int i10) {
        V(null, i10, 0, null);
    }

    public final void a() {
        j();
        this.f11637h.f11577a.clear();
        this.f11640k.f11705b = 0;
        this.f11642m.f11705b = 0;
        this.f11648s.f11705b = 0;
        this.f11652w.f11705b = 0;
        this.f11650u = null;
        m2 m2Var = this.F;
        if (!m2Var.f11588f) {
            m2Var.c();
        }
        q2 q2Var = this.H;
        if (!q2Var.f11685u) {
            q2Var.e();
        }
        n0.c cVar = this.N;
        cVar.f12058b.b();
        cVar.f12057a.b();
        n();
        this.P = 0;
        this.f11655z = 0;
        this.f11646q = false;
        this.O = false;
        this.f11653x = false;
        this.E = false;
        this.f11654y = -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    public final q a0(int i10) {
        x1 x1Var;
        V(null, i10, 0, null);
        boolean z10 = this.O;
        k3 k3Var = this.D;
        e0 e0Var = this.f11636g;
        if (z10) {
            d7.a.k(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            x1 x1Var2 = new x1((x) e0Var);
            k3Var.f11577a.add(x1Var2);
            m0(x1Var2);
            x1Var2.f11757e = this.A;
            x1Var2.f11753a &= -17;
        } else {
            ArrayList arrayList = this.f11647r;
            int iJ = s.j(this.F.f11591i, arrayList);
            u0 u0Var = iJ >= 0 ? (u0) arrayList.remove(iJ) : null;
            Object objH = this.F.h();
            if (d7.a.d(objH, l.f11578a)) {
                d7.a.k(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                x1Var = new x1((x) e0Var);
                m0(x1Var);
            } else {
                d7.a.k(objH, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                x1Var = (x1) objH;
            }
            if (u0Var == null) {
                int i11 = x1Var.f11753a;
                boolean z11 = (i11 & 64) != 0;
                if (z11) {
                    x1Var.f11753a = i11 & (-65);
                }
                if (z11) {
                    x1Var.f11753a |= 8;
                } else {
                    x1Var.f11753a &= -9;
                }
            } else {
                x1Var.f11753a |= 8;
            }
            k3Var.f11577a.add(x1Var);
            x1Var.f11757e = this.A;
            x1Var.f11753a &= -17;
        }
        return this;
    }

    public final void b0(Object obj) {
        if (!this.O && this.F.f() == 207 && !d7.a.d(this.F.e(), obj) && this.f11654y < 0) {
            this.f11654y = this.F.f11589g;
            this.f11653x = true;
        }
        V(null, 207, 0, obj);
    }

    public final void c(Object obj, c9.e eVar) {
        int i10 = 0;
        if (this.O) {
            n0.c cVar = this.N;
            cVar.getClass();
            n0.c0 c0Var = n0.c0.f12059c;
            n0.i0 i0Var = cVar.f12057a;
            i0Var.h(c0Var);
            f6.a.g0(i0Var, 0, obj);
            d7.a.k(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            z6.a.f(2, eVar);
            f6.a.g0(i0Var, 1, eVar);
            int i11 = i0Var.f12081g;
            int i12 = c0Var.f12067a;
            int iA = n0.i0.a(i0Var, i12);
            int i13 = c0Var.f12068b;
            if (i11 == iA && i0Var.f12082h == n0.i0.a(i0Var, i13)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i14 = 0;
            while (i14 < i12) {
                int i15 = i12;
                if (((1 << i14) & i0Var.f12081g) != 0) {
                    if (i10 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c0Var.b(i14));
                    i10++;
                }
                i14++;
                i12 = i15;
            }
            String string = sb.toString();
            StringBuilder sbN = l.q.n(string, "StringBuilder().apply(builderAction).toString()");
            int i16 = 0;
            int i17 = 0;
            while (i17 < i13) {
                int i18 = i13;
                if (((1 << i17) & i0Var.f12082h) != 0) {
                    if (i10 > 0) {
                        sbN.append(", ");
                    }
                    sbN.append(c0Var.c(i17));
                    i16++;
                }
                i17++;
                i13 = i18;
            }
            String string2 = sbN.toString();
            d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(c0Var);
            sb2.append(". Not all arguments were provided. Missing ");
            l.q.t(sb2, i10, " int arguments (", string, ") and ");
            throw new IllegalStateException(l.q.m(sb2, i16, " object arguments (", string2, ").").toString());
        }
        n0.b bVar = this.L;
        bVar.f();
        n0.a aVar = bVar.f12045b;
        aVar.getClass();
        n0.c0 c0Var2 = n0.c0.f12059c;
        n0.i0 i0Var2 = aVar.f12042a;
        i0Var2.h(c0Var2);
        int i19 = 0;
        f6.a.g0(i0Var2, 0, obj);
        d7.a.k(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        z6.a.f(2, eVar);
        f6.a.g0(i0Var2, 1, eVar);
        int i20 = i0Var2.f12081g;
        int i21 = c0Var2.f12067a;
        int iA2 = n0.i0.a(i0Var2, i21);
        int i22 = c0Var2.f12068b;
        if (i20 == iA2 && i0Var2.f12082h == n0.i0.a(i0Var2, i22)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        for (int i23 = 0; i23 < i21; i23++) {
            if (((1 << i23) & i0Var2.f12081g) != 0) {
                if (i19 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c0Var2.b(i23));
                i19++;
            }
        }
        String string3 = sb3.toString();
        StringBuilder sbN2 = l.q.n(string3, "StringBuilder().apply(builderAction).toString()");
        int i24 = 0;
        int i25 = 0;
        while (i24 < i22) {
            int i26 = i22;
            if (((1 << i24) & i0Var2.f12082h) != 0) {
                if (i19 > 0) {
                    sbN2.append(", ");
                }
                sbN2.append(c0Var2.c(i24));
                i25++;
            }
            i24++;
            i22 = i26;
        }
        String string4 = sbN2.toString();
        d7.a.l(string4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(c0Var2);
        sb4.append(". Not all arguments were provided. Missing ");
        l.q.t(sb4, i19, " int arguments (", string3, ") and ");
        throw new IllegalStateException(l.q.m(sb4, i25, " object arguments (", string4, ").").toString());
    }

    public final void c0() {
        V(null, 125, 2, null);
        this.f11646q = true;
    }

    public final boolean d(float f10) {
        Object objI = I();
        if ((objI instanceof Float) && f10 == ((Number) objI).floatValue()) {
            return false;
        }
        m0(Float.valueOf(f10));
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d0() {
        n2 n2Var = this.f11632c;
        this.F = n2Var.i();
        V(null, 100, 0, null);
        u uVar = this.f11631b;
        uVar.n();
        this.f11649t = uVar.e();
        this.f11652w.b(this.f11651v ? 1 : 0);
        this.f11651v = g(this.f11649t);
        this.J = null;
        if (!this.f11645p) {
            this.f11645p = uVar.c();
        }
        if (!this.B) {
            this.B = uVar.d();
        }
        Set set = (Set) d7.t.k0(this.f11649t, x0.b.f16285a);
        if (set != null) {
            set.add(n2Var);
            uVar.k(set);
        }
        V(null, uVar.f(), 0, null);
    }

    public final boolean e(int i10) {
        Object objI = I();
        if ((objI instanceof Integer) && i10 == ((Number) objI).intValue()) {
            return false;
        }
        m0(Integer.valueOf(i10));
        return true;
    }

    public final boolean e0(x1 x1Var, Object obj) {
        c cVar = x1Var.f11755c;
        if (cVar == null) {
            return false;
        }
        int iE = this.F.f11583a.e(cVar);
        if (!this.E || iE < this.F.f11589g) {
            return false;
        }
        ArrayList arrayList = this.f11647r;
        int iJ = s.j(iE, arrayList);
        o0.d dVar = null;
        if (iJ < 0) {
            int i10 = -(iJ + 1);
            if (obj != null) {
                dVar = new o0.d();
                dVar.add(obj);
            }
            arrayList.add(i10, new u0(x1Var, iE, dVar));
        } else if (obj == null) {
            ((u0) arrayList.get(iJ)).f11711c = null;
        } else {
            o0.d dVar2 = ((u0) arrayList.get(iJ)).f11711c;
            if (dVar2 != null) {
                dVar2.add(obj);
            }
        }
        return true;
    }

    public final boolean f(long j10) {
        Object objI = I();
        if ((objI instanceof Long) && j10 == ((Number) objI).longValue()) {
            return false;
        }
        m0(Long.valueOf(j10));
        return true;
    }

    public final void f0(int i10, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                this.P = ((Enum) obj).ordinal() ^ Integer.rotateLeft(this.P, 3);
                return;
            } else {
                this.P = obj.hashCode() ^ Integer.rotateLeft(this.P, 3);
                return;
            }
        }
        if (obj2 == null || i10 != 207 || d7.a.d(obj2, l.f11578a)) {
            this.P = i10 ^ Integer.rotateLeft(this.P, 3);
        } else {
            this.P = obj2.hashCode() ^ Integer.rotateLeft(this.P, 3);
        }
    }

    public final boolean g(Object obj) {
        if (d7.a.d(I(), obj)) {
            return false;
        }
        m0(obj);
        return true;
    }

    public final void g0(int i10, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                h0(((Enum) obj).ordinal());
                return;
            } else {
                h0(obj.hashCode());
                return;
            }
        }
        if (obj2 == null || i10 != 207 || d7.a.d(obj2, l.f11578a)) {
            h0(i10);
        } else {
            h0(obj2.hashCode());
        }
    }

    public final boolean h(boolean z10) {
        Object objI = I();
        if ((objI instanceof Boolean) && z10 == ((Boolean) objI).booleanValue()) {
            return false;
        }
        m0(Boolean.valueOf(z10));
        return true;
    }

    public final void h0(int i10) {
        this.P = Integer.rotateRight(Integer.hashCode(i10) ^ this.P, 3);
    }

    public final boolean i(Object obj) {
        if (I() == obj) {
            return false;
        }
        m0(obj);
        return true;
    }

    public final void i0(int i10, int i11) {
        q.o oVar;
        int i12;
        int i13 = i10;
        if (n0(i10) != i11) {
            if (i13 >= 0) {
                int[] iArr = this.f11643n;
                if (iArr == null) {
                    int i14 = this.F.f11585c;
                    int[] iArr2 = new int[i14];
                    Arrays.fill(iArr2, 0, i14, -1);
                    this.f11643n = iArr2;
                    iArr = iArr2;
                }
                iArr[i10] = i11;
                return;
            }
            q.o oVar2 = this.f11644o;
            if (oVar2 == null) {
                oVar2 = new q.o();
                oVar2.f13004a = q.v.f13035a;
                int[] iArr3 = q.j.f12997a;
                oVar2.f13005b = iArr3;
                oVar2.f13006c = iArr3;
                oVar2.f(q.v.d(6));
                this.f11644o = oVar2;
            }
            int iHashCode = Integer.hashCode(i10) * (-862048943);
            int i15 = iHashCode ^ (iHashCode << 16);
            int i16 = i15 >>> 7;
            int i17 = i15 & 127;
            int i18 = oVar2.f13007d;
            int i19 = i16 & i18;
            int i20 = 0;
            loop0: while (true) {
                long[] jArr = oVar2.f13004a;
                int i21 = i19 >> 3;
                int i22 = (i19 & 7) << 3;
                q.o oVar3 = oVar2;
                long j10 = (((-i22) >> 63) & (jArr[i21 + 1] << (64 - i22))) | (jArr[i21] >>> i22);
                long j11 = i17;
                int i23 = i17;
                long j12 = j10 ^ (j11 * 72340172838076673L);
                long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
                while (j13 != 0) {
                    int iNumberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j13) >> 3)) & i18;
                    oVar = oVar3;
                    if (oVar.f13005b[iNumberOfTrailingZeros] == i13) {
                        i12 = iNumberOfTrailingZeros;
                        break loop0;
                    } else {
                        j13 &= j13 - 1;
                        oVar3 = oVar;
                    }
                }
                oVar = oVar3;
                if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                    int iB = oVar.b(i16);
                    if (oVar.f13009f == 0 && ((oVar.f13004a[iB >> 3] >> ((iB & 7) << 3)) & 255) != 254) {
                        int i24 = oVar.f13007d;
                        if (i24 <= 8 || Long.compareUnsigned(((long) oVar.f13008e) * 32, ((long) i24) * 25) > 0) {
                            oVar.g(q.v.b(oVar.f13007d));
                        } else {
                            oVar.g(q.v.b(oVar.f13007d));
                        }
                        iB = oVar.b(i16);
                    }
                    oVar.f13008e++;
                    int i25 = oVar.f13009f;
                    long[] jArr2 = oVar.f13004a;
                    int i26 = iB >> 3;
                    long j14 = jArr2[i26];
                    int i27 = (iB & 7) << 3;
                    oVar.f13009f = i25 - (((j14 >> i27) & 255) != 128 ? 0 : 1);
                    jArr2[i26] = ((~(255 << i27)) & j14) | (j11 << i27);
                    int i28 = oVar.f13007d;
                    int i29 = ((iB - 7) & i28) + (i28 & 7);
                    int i30 = i29 >> 3;
                    int i31 = (i29 & 7) << 3;
                    jArr2[i30] = (jArr2[i30] & (~(255 << i31))) | (j11 << i31);
                    i12 = ~iB;
                    break;
                }
                i20 += 8;
                i19 = (i19 + i20) & i18;
                i13 = i10;
                oVar2 = oVar;
                i17 = i23;
            }
            if (i12 < 0) {
                i12 = ~i12;
            }
            oVar.f13005b[i12] = i10;
            oVar.f13006c[i12] = i11;
        }
    }

    public final void j() {
        this.f11638i = null;
        this.f11639j = 0;
        this.f11641l = 0;
        this.P = 0;
        this.f11646q = false;
        n0.b bVar = this.L;
        bVar.f12046c = false;
        bVar.f12047d.f11705b = 0;
        bVar.f12049f = 0;
        this.D.f11577a.clear();
        this.f11643n = null;
        this.f11644o = null;
    }

    public final void j0(int i10, int i11) {
        int iN0 = n0(i10);
        if (iN0 != i11) {
            int i12 = i11 - iN0;
            k3 k3Var = this.f11637h;
            int size = k3Var.f11577a.size() - 1;
            while (i10 != -1) {
                int iN1 = n0(i10) + i12;
                i0(i10, iN1);
                for (int i13 = size; -1 < i13; i13--) {
                    q1 q1Var = (q1) k3Var.f11577a.get(i13);
                    if (q1Var != null && q1Var.b(i10, iN1)) {
                        size = i13 - 1;
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.F.f11591i;
                } else if (d7.t.v(this.F.f11584b, i10)) {
                    return;
                } else {
                    i10 = d7.t.y(this.F.f11584b, i10);
                }
            }
        }
    }

    public final void k(o0.a aVar, u0.b bVar) {
        if (this.f11634e.f12042a.d()) {
            r(aVar, bVar);
        } else {
            s.g("Expected applyChanges() to have been called".toString());
            throw null;
        }
    }

    public final u0.e k0(r1 r1Var, u0.e eVar) {
        u0.e eVar2 = (u0.e) r1Var;
        eVar2.getClass();
        u0.d dVar = new u0.d(eVar2);
        dVar.f15007n = eVar2;
        dVar.putAll(eVar);
        u0.e eVarC = dVar.build();
        X(204, s.f11696d);
        I();
        m0(eVarC);
        I();
        m0(eVar);
        t(false);
        return eVarC;
    }

    public final int l(int i10, int i11, int i12) {
        int iOrdinal;
        Object objB;
        if (i10 == i11) {
            return i12;
        }
        m2 m2Var = this.F;
        boolean zU = d7.t.u(m2Var.f11584b, i10);
        int[] iArr = m2Var.f11584b;
        if (zU) {
            Object objJ = m2Var.j(iArr, i10);
            if (objJ != null) {
                iOrdinal = objJ instanceof Enum ? ((Enum) objJ).ordinal() : objJ.hashCode();
            } else {
                iOrdinal = 0;
            }
        } else {
            int iHashCode = iArr[i10 * 5];
            if (iHashCode == 207 && (objB = m2Var.b(iArr, i10)) != null && !d7.a.d(objB, l.f11578a)) {
                iHashCode = objB.hashCode();
            }
            iOrdinal = iHashCode;
        }
        return iOrdinal == 126665345 ? iOrdinal : Integer.rotateLeft(l(d7.t.y(this.F.f11584b, i10), i11, i12), 3) ^ iOrdinal;
    }

    public final void l0(Object obj) {
        if (obj instanceof i2) {
            if (this.O) {
                n0.a aVar = this.L.f12045b;
                aVar.getClass();
                n0.v vVar = n0.v.f12095c;
                n0.i0 i0Var = aVar.f12042a;
                i0Var.h(vVar);
                f6.a.g0(i0Var, 0, (i2) obj);
                int i10 = i0Var.f12081g;
                int i11 = vVar.f12067a;
                int iA = n0.i0.a(i0Var, i11);
                int i12 = vVar.f12068b;
                if (i10 != iA || i0Var.f12082h != n0.i0.a(i0Var, i12)) {
                    StringBuilder sb = new StringBuilder();
                    int i13 = 0;
                    for (int i14 = 0; i14 < i11; i14++) {
                        if (((1 << i14) & i0Var.f12081g) != 0) {
                            if (i13 > 0) {
                                sb.append(", ");
                            }
                            sb.append(vVar.b(i14));
                            i13++;
                        }
                    }
                    String string = sb.toString();
                    StringBuilder sbN = l.q.n(string, "StringBuilder().apply(builderAction).toString()");
                    int i15 = 0;
                    for (int i16 = 0; i16 < i12; i16++) {
                        if (((1 << i16) & i0Var.f12082h) != 0) {
                            if (i13 > 0) {
                                sbN.append(", ");
                            }
                            sbN.append(vVar.c(i16));
                            i15++;
                        }
                    }
                    String string2 = sbN.toString();
                    d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb2 = new StringBuilder("Error while pushing ");
                    sb2.append(vVar);
                    sb2.append(". Not all arguments were provided. Missing ");
                    l.q.t(sb2, i13, " int arguments (", string, ") and ");
                    throw new IllegalStateException(l.q.m(sb2, i15, " object arguments (", string2, ").").toString());
                }
            }
            this.f11633d.add(obj);
            j2 j2Var = new j2();
            j2Var.f11574a = (i2) obj;
            obj = j2Var;
        }
        m0(obj);
    }

    public final Object m(u1 u1Var) {
        return d7.t.k0(p(), u1Var);
    }

    public final void m0(Object obj) {
        if (this.O) {
            this.H.L(obj);
            return;
        }
        m2 m2Var = this.F;
        int iZ = m2Var.f11593k - d7.t.z(m2Var.f11584b, m2Var.f11591i);
        int i10 = 1;
        n0.b bVar = this.L;
        bVar.h(true);
        n0.a aVar = bVar.f12045b;
        n0.d0 d0Var = n0.d0.f12061c;
        n0.i0 i0Var = aVar.f12042a;
        i0Var.h(d0Var);
        f6.a.g0(i0Var, 0, obj);
        f6.a.f0(i0Var, 0, iZ - 1);
        if (i0Var.f12081g == n0.i0.a(i0Var, 1) && i0Var.f12082h == n0.i0.a(i0Var, 1)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i11 = 0;
        for (int i12 = 0; i12 < 1; i12++) {
            if (((1 << i12) & i0Var.f12081g) != 0) {
                if (i11 > 0) {
                    sb.append(", ");
                }
                sb.append(d0Var.b(i12));
                i11++;
            }
        }
        String string = sb.toString();
        StringBuilder sbN = l.q.n(string, "StringBuilder().apply(builderAction).toString()");
        if ((i0Var.f12082h & 1) != 0) {
            if (i11 > 0) {
                sbN.append(", ");
            }
            sbN.append(d0Var.c(0));
        } else {
            i10 = 0;
        }
        String string2 = sbN.toString();
        d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(d0Var);
        sb2.append(". Not all arguments were provided. Missing ");
        l.q.t(sb2, i11, " int arguments (", string, ") and ");
        throw new IllegalStateException(l.q.m(sb2, i10, " object arguments (", string2, ").").toString());
    }

    public final void n() {
        s.l(this.H.f11685u);
        n2 n2Var = new n2();
        this.G = n2Var;
        q2 q2VarK = n2Var.k();
        q2VarK.e();
        this.H = q2VarK;
    }

    public final int n0(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f11643n;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? d7.t.x(this.F.f11584b, i10) : i11;
        }
        q.o oVar = this.f11644o;
        if (oVar == null || oVar.c(i10) < 0) {
            return 0;
        }
        return oVar.d(i10);
    }

    public final void o(c9.a aVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!this.f11646q) {
            s.g("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw null;
        }
        this.f11646q = false;
        if (!this.O) {
            s.g("createNode() can only be called when inserting".toString());
            throw null;
        }
        t0 t0Var = this.f11640k;
        int i14 = t0Var.f11704a[t0Var.f11705b - 1];
        q2 q2Var = this.H;
        c cVarB = q2Var.b(q2Var.f11684t);
        this.f11641l++;
        n0.c cVar = this.N;
        n0.p pVar = n0.p.f12089c;
        n0.i0 i0Var = cVar.f12057a;
        i0Var.h(pVar);
        f6.a.g0(i0Var, 0, aVar);
        f6.a.f0(i0Var, 0, i14);
        f6.a.g0(i0Var, 1, cVarB);
        if (i0Var.f12081g != n0.i0.a(i0Var, 1) || i0Var.f12082h != n0.i0.a(i0Var, 2)) {
            StringBuilder sb = new StringBuilder();
            int i15 = 1;
            if ((i0Var.f12081g & 1) != 0) {
                i10 = 0;
                sb.append(pVar.b(0));
                i11 = 1;
            } else {
                i10 = 0;
                i11 = 0;
            }
            String string = sb.toString();
            StringBuilder sbN = l.q.n(string, "StringBuilder().apply(builderAction).toString()");
            int i16 = i10;
            while (i10 < 2) {
                if (((i15 << i10) & i0Var.f12082h) != 0) {
                    if (i11 > 0) {
                        sbN.append(", ");
                    }
                    sbN.append(pVar.c(i10));
                    i16++;
                }
                i10++;
                i15 = 1;
            }
            String string2 = sbN.toString();
            d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(pVar);
            sb2.append(". Not all arguments were provided. Missing ");
            l.q.t(sb2, i11, " int arguments (", string, ") and ");
            throw new IllegalStateException(l.q.m(sb2, i16, " object arguments (", string2, ").").toString());
        }
        n0.u uVar = n0.u.f12094c;
        n0.i0 i0Var2 = cVar.f12058b;
        i0Var2.h(uVar);
        f6.a.f0(i0Var2, 0, i14);
        f6.a.g0(i0Var2, 0, cVarB);
        if (i0Var2.f12081g == n0.i0.a(i0Var2, 1) && i0Var2.f12082h == n0.i0.a(i0Var2, 1)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        if ((i0Var2.f12081g & 1) != 0) {
            sb3.append(uVar.b(0));
            i12 = 1;
        } else {
            i12 = 0;
        }
        String string3 = sb3.toString();
        StringBuilder sbN2 = l.q.n(string3, "StringBuilder().apply(builderAction).toString()");
        if ((i0Var2.f12082h & 1) != 0) {
            if (i12 > 0) {
                sbN2.append(", ");
            }
            sbN2.append(uVar.c(0));
            i13 = 1;
        } else {
            i13 = 0;
        }
        String string4 = sbN2.toString();
        d7.a.l(string4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(uVar);
        sb4.append(". Not all arguments were provided. Missing ");
        l.q.t(sb4, i12, " int arguments (", string3, ") and ");
        throw new IllegalStateException(l.q.m(sb4, i13, " object arguments (", string4, ").").toString());
    }

    public final void o0() {
        boolean z10;
        if (!this.f11646q) {
            s.g("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw null;
        }
        this.f11646q = false;
        if (!(!this.O)) {
            s.g("useNode() called while inserting".toString());
            throw null;
        }
        m2 m2Var = this.F;
        Object objI = m2Var.i(m2Var.f11591i);
        n0.b bVar = this.L;
        bVar.f12051h.f11577a.add(objI);
        if (this.f11653x && ((z10 = objI instanceof j))) {
            bVar.f();
            n0.a aVar = bVar.f12045b;
            aVar.getClass();
            if (z10) {
                aVar.f12042a.g(n0.f0.f12065c);
            }
        }
    }

    public final r1 p() {
        r1 r1Var;
        r1 r1Var2;
        Object obj;
        Object obj2;
        r1 r1Var3 = this.J;
        if (r1Var3 != null) {
            return r1Var3;
        }
        int iY = this.F.f11591i;
        boolean z10 = this.O;
        j1 j1Var = s.f11695c;
        if (z10 && this.I) {
            int iY2 = this.H.f11684t;
            while (iY2 > 0) {
                q2 q2Var = this.H;
                if (q2Var.f11666b[q2Var.o(iY2) * 5] == 202) {
                    q2 q2Var2 = this.H;
                    int iO = q2Var2.o(iY2);
                    if (d7.t.u(q2Var2.f11666b, iO)) {
                        Object[] objArr = q2Var2.f11667c;
                        int[] iArr = q2Var2.f11666b;
                        int i10 = iO * 5;
                        obj = objArr[d7.t.L(iArr[i10 + 1] >> 30) + iArr[i10 + 4]];
                    } else {
                        obj = null;
                    }
                    if (d7.a.d(obj, j1Var)) {
                        q2 q2Var3 = this.H;
                        int iO2 = q2Var3.o(iY2);
                        if (d7.t.t(q2Var3.f11666b, iO2)) {
                            Object[] objArr2 = q2Var3.f11667c;
                            int[] iArr2 = q2Var3.f11666b;
                            obj2 = objArr2[d7.t.L(iArr2[(iO2 * 5) + 1] >> 29) + q2Var3.f(iArr2, iO2)];
                        } else {
                            obj2 = l.f11578a;
                        }
                        d7.a.k(obj2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        r1 r1Var4 = (r1) obj2;
                        this.J = r1Var4;
                        return r1Var4;
                    }
                }
                q2 q2Var4 = this.H;
                iY2 = q2Var4.y(q2Var4.f11666b, iY2);
            }
        }
        if (this.F.f11585c > 0) {
            while (iY > 0) {
                m2 m2Var = this.F;
                int[] iArr3 = m2Var.f11584b;
                if (iArr3[iY * 5] == 202 && d7.a.d(m2Var.j(iArr3, iY), j1Var)) {
                    o0.e eVar = this.f11650u;
                    if (eVar == null || (r1Var2 = (r1) eVar.f12334a.get(iY)) == null) {
                        m2 m2Var2 = this.F;
                        Object objB = m2Var2.b(m2Var2.f11584b, iY);
                        d7.a.k(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        r1Var = (r1) objB;
                    } else {
                        r1Var = r1Var2;
                    }
                    this.J = r1Var;
                    return r1Var;
                }
                iY = d7.t.y(this.F.f11584b, iY);
            }
        }
        r1 r1Var5 = this.f11649t;
        this.J = r1Var5;
        return r1Var5;
    }

    public final void p0() {
        if (!this.f11646q) {
            return;
        }
        s.g("A call to createNode(), emitNode() or useNode() expected".toString());
        throw null;
    }

    public final void q(boolean z10) {
        if (!(this.f11641l == 0)) {
            s.g("No nodes can be emitted before calling dactivateToEndGroup".toString());
            throw null;
        }
        if (this.O) {
            return;
        }
        if (!z10) {
            T();
            return;
        }
        m2 m2Var = this.F;
        int i10 = m2Var.f11589g;
        int i11 = m2Var.f11590h;
        n0.b bVar = this.L;
        bVar.getClass();
        bVar.h(false);
        n0.a aVar = bVar.f12045b;
        aVar.getClass();
        aVar.f12042a.g(n0.h.f12069c);
        s.e(i10, i11, this.f11647r);
        this.F.m();
    }

    public final void r(o0.a aVar, u0.b bVar) {
        if (!(!this.E)) {
            s.g("Reentrant composition is not supported".toString());
            throw null;
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.A = w0.p.i().d();
            this.f11650u = null;
            int i10 = aVar.f12327c;
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f11647r;
                if (i11 >= i10) {
                    r8.m.z0(arrayList, s.f11698f);
                    this.f11639j = 0;
                    this.E = true;
                    try {
                        d0();
                        Object objI = I();
                        if (objI != bVar && bVar != null) {
                            m0(bVar);
                        }
                        p pVar = this.C;
                        o0.i iVarQ = d7.t.Q();
                        try {
                            iVarQ.c(pVar);
                            j1 j1Var = s.f11693a;
                            if (bVar != null) {
                                X(200, j1Var);
                                d9.i.r(this, bVar);
                                t(false);
                            } else if (!this.f11651v || objI == null || d7.a.d(objI, l.f11578a)) {
                                S();
                            } else {
                                X(200, j1Var);
                                z6.a.f(2, objI);
                                d9.i.r(this, (c9.e) objI);
                                t(false);
                            }
                            iVarQ.n(iVarQ.f12343c - 1);
                            z();
                            this.E = false;
                            arrayList.clear();
                            n();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            iVarQ.n(iVarQ.f12343c - 1);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        this.E = false;
                        arrayList.clear();
                        a();
                        n();
                        throw th2;
                    }
                }
                Object obj = aVar.f12325a[i11];
                d7.a.k(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                o0.d dVar = (o0.d) aVar.f12326b[i11];
                x1 x1Var = (x1) obj;
                c cVar = x1Var.f11755c;
                if (cVar == null) {
                    Trace.endSection();
                    return;
                } else {
                    arrayList.add(new u0(x1Var, cVar.f11464a, dVar));
                    i11++;
                }
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public final void s(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        s(d7.t.y(this.F.f11584b, i10), i11);
        if (d7.t.v(this.F.f11584b, i10)) {
            this.L.f12051h.f11577a.add(this.F.i(i10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0435  */
    /* JADX WARN: Code duplicated, block: B:169:0x043e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x0440  */
    /* JADX WARN: Code duplicated, block: B:175:0x045b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0467 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x0469  */
    /* JADX WARN: Code duplicated, block: B:219:0x0590  */
    /* JADX WARN: Code duplicated, block: B:315:0x044c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0231  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v8, types: [m0.q] */
    /* JADX WARN: Type inference failed for: r6v22, types: [m0.q] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r6v71 */
    public final void t(boolean z10) {
        ArrayList arrayList;
        ?? r10;
        int i10;
        int i11;
        n0.c cVar;
        ?? r11;
        ?? r12;
        n0.q qVar;
        n0.i0 i0Var;
        int i12;
        int i13;
        int iA;
        int i14;
        StringBuilder sb;
        int i15;
        int i16;
        StringBuilder sbN;
        int i17;
        int i18;
        ?? r13;
        int i19;
        int i20;
        int i21;
        HashSet hashSet;
        q1 q1Var;
        ArrayList arrayList2;
        LinkedHashSet linkedHashSet;
        int i22;
        int i23;
        Object obj;
        Object obj2;
        q qVar2 = this;
        if (qVar2.O) {
            q2 q2Var = qVar2.H;
            int i24 = q2Var.f11684t;
            int i25 = q2Var.f11666b[q2Var.o(i24) * 5];
            q2 q2Var2 = qVar2.H;
            int iO = q2Var2.o(i24);
            if (d7.t.u(q2Var2.f11666b, iO)) {
                Object[] objArr = q2Var2.f11667c;
                int[] iArr = q2Var2.f11666b;
                int i26 = iO * 5;
                obj = objArr[d7.t.L(iArr[i26 + 1] >> 30) + iArr[i26 + 4]];
            } else {
                obj = null;
            }
            q2 q2Var3 = qVar2.H;
            int iO2 = q2Var3.o(i24);
            if (d7.t.t(q2Var3.f11666b, iO2)) {
                Object[] objArr2 = q2Var3.f11667c;
                int[] iArr2 = q2Var3.f11666b;
                obj2 = objArr2[d7.t.L(iArr2[(iO2 * 5) + 1] >> 29) + q2Var3.f(iArr2, iO2)];
            } else {
                obj2 = l.f11578a;
            }
            qVar2.g0(i25, obj, obj2);
        } else {
            m2 m2Var = qVar2.F;
            int i27 = m2Var.f11591i;
            int[] iArr3 = m2Var.f11584b;
            int i28 = iArr3[i27 * 5];
            Object objJ = m2Var.j(iArr3, i27);
            m2 m2Var2 = qVar2.F;
            qVar2.g0(i28, objJ, m2Var2.b(m2Var2.f11584b, i27));
        }
        int i29 = qVar2.f11641l;
        q1 q1Var2 = qVar2.f11638i;
        ArrayList arrayList3 = qVar2.f11647r;
        n0.b bVar = qVar2.L;
        if (q1Var2 != null) {
            List list = q1Var2.f11659a;
            if (list.size() > 0) {
                ArrayList arrayList4 = q1Var2.f11662d;
                HashSet hashSet2 = new HashSet(arrayList4.size());
                int size = arrayList4.size();
                for (int i30 = 0; i30 < size; i30++) {
                    hashSet2.add(arrayList4.get(i30));
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList4.size();
                int size3 = list.size();
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                while (i32 < size3) {
                    w0 w0Var = (w0) list.get(i32);
                    boolean zContains = hashSet2.contains(w0Var);
                    int i34 = q1Var2.f11660b;
                    if (zContains) {
                        hashSet = hashSet2;
                        if (!linkedHashSet2.contains(w0Var)) {
                            if (i33 < size2) {
                                w0 w0Var2 = (w0) arrayList4.get(i33);
                                ArrayList arrayList5 = arrayList4;
                                HashMap map = q1Var2.f11663e;
                                if (w0Var2 != w0Var) {
                                    int iA2 = q1Var2.a(w0Var2);
                                    linkedHashSet2.add(w0Var2);
                                    q1Var = q1Var2;
                                    if (iA2 != i31) {
                                        q0 q0Var = (q0) map.get(Integer.valueOf(w0Var2.f11727c));
                                        int i35 = q0Var != null ? q0Var.f11658c : w0Var2.f11728d;
                                        linkedHashSet = linkedHashSet2;
                                        int i36 = iA2 + i34;
                                        int i37 = i34 + i31;
                                        if (i35 > 0) {
                                            i22 = size2;
                                            int i38 = bVar.f12055l;
                                            if (i38 > 0) {
                                                i23 = size3;
                                                arrayList2 = arrayList3;
                                                if (bVar.f12053j == i36 - i38 && bVar.f12054k == i37 - i38) {
                                                    bVar.f12055l = i38 + i35;
                                                }
                                            } else {
                                                arrayList2 = arrayList3;
                                                i23 = size3;
                                            }
                                            bVar.g();
                                            bVar.f12053j = i36;
                                            bVar.f12054k = i37;
                                            bVar.f12055l = i35;
                                        } else {
                                            arrayList2 = arrayList3;
                                            i22 = size2;
                                            i23 = size3;
                                            bVar.getClass();
                                        }
                                        if (iA2 > i31) {
                                            for (q0 q0Var2 : map.values()) {
                                                int i39 = q0Var2.f11657b;
                                                if (iA2 <= i39 && i39 < iA2 + i35) {
                                                    q0Var2.f11657b = (i39 - iA2) + i31;
                                                } else if (i31 <= i39 && i39 < iA2) {
                                                    q0Var2.f11657b = i39 + i35;
                                                }
                                            }
                                        } else if (i31 > iA2) {
                                            for (q0 q0Var3 : map.values()) {
                                                int i40 = q0Var3.f11657b;
                                                if (iA2 <= i40 && i40 < iA2 + i35) {
                                                    q0Var3.f11657b = (i40 - iA2) + i31;
                                                } else if (iA2 + 1 <= i40 && i40 < i31) {
                                                    q0Var3.f11657b = i40 - i35;
                                                }
                                            }
                                        }
                                    } else {
                                        arrayList2 = arrayList3;
                                        linkedHashSet = linkedHashSet2;
                                        i22 = size2;
                                        i23 = size3;
                                    }
                                } else {
                                    q1Var = q1Var2;
                                    arrayList2 = arrayList3;
                                    linkedHashSet = linkedHashSet2;
                                    i22 = size2;
                                    i23 = size3;
                                    i32++;
                                }
                                i33++;
                                q0 q0Var4 = (q0) map.get(Integer.valueOf(w0Var2.f11727c));
                                i31 += q0Var4 != null ? q0Var4.f11658c : w0Var2.f11728d;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList5;
                                q1Var2 = q1Var;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i22;
                                size3 = i23;
                                arrayList3 = arrayList2;
                            } else {
                                hashSet2 = hashSet;
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        bVar.i(q1Var2.a(w0Var) + i34, w0Var.f11728d);
                        int i41 = w0Var.f11727c;
                        q1Var2.b(i41, 0);
                        bVar.f12049f = (i41 - bVar.f12044a.F.f11589g) + bVar.f12049f;
                        qVar2.F.k(i41);
                        M();
                        qVar2.F.l();
                        s.e(i41, d7.t.s(qVar2.F.f11584b, i41) + i41, arrayList3);
                    }
                    i32++;
                    hashSet2 = hashSet;
                }
                arrayList = arrayList3;
                bVar.g();
                if (list.size() > 0) {
                    m2 m2Var3 = qVar2.F;
                    bVar.f12049f = (m2Var3.f11590h - bVar.f12044a.F.f11589g) + bVar.f12049f;
                    m2Var3.m();
                }
            } else {
                arrayList = arrayList3;
            }
        } else {
            arrayList = arrayList3;
        }
        int i42 = qVar2.f11639j;
        while (true) {
            m2 m2Var4 = qVar2.F;
            if (m2Var4.f11592j > 0 || (i21 = m2Var4.f11589g) == m2Var4.f11590h) {
                break;
            }
            q qVar3 = qVar2;
            M();
            bVar.i(i42, qVar3.F.l());
            ArrayList arrayList6 = arrayList;
            s.e(i21, qVar3.F.f11589g, arrayList6);
            qVar2 = qVar3;
            arrayList = arrayList6;
        }
        boolean z11 = qVar2.O;
        if (z11) {
            if (z10) {
                n0.c cVar2 = qVar2.N;
                n0.i0 i0Var2 = cVar2.f12058b;
                if (!i0Var2.e()) {
                    s.g("Cannot end node insertion, there are no pending operations that can be realized.".toString());
                    throw null;
                }
                if (i0Var2.d()) {
                    throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
                }
                n0.g0[] g0VarArr = i0Var2.f12075a;
                int i43 = i0Var2.f12076b - 1;
                i0Var2.f12076b = i43;
                n0.g0 g0Var = g0VarArr[i43];
                d7.a.j(g0Var);
                i0Var2.f12075a[i0Var2.f12076b] = null;
                n0.i0 i0Var3 = cVar2.f12057a;
                i0Var3.h(g0Var);
                int i44 = i0Var2.f12080f;
                int i45 = i0Var3.f12080f;
                int i46 = 0;
                while (true) {
                    i19 = g0Var.f12068b;
                    if (i46 >= i19) {
                        break;
                    }
                    i45--;
                    i44--;
                    Object[] objArr3 = i0Var3.f12079e;
                    Object[] objArr4 = i0Var2.f12079e;
                    objArr3[i45] = objArr4[i44];
                    objArr4[i44] = null;
                    i46++;
                }
                int i47 = i0Var2.f12078d;
                int i48 = i0Var3.f12078d;
                int i49 = 0;
                while (true) {
                    i20 = g0Var.f12067a;
                    if (i49 >= i20) {
                        break;
                    }
                    i48--;
                    i47--;
                    int[] iArr4 = i0Var3.f12077c;
                    int[] iArr5 = i0Var2.f12077c;
                    iArr4[i48] = iArr5[i47];
                    iArr5[i47] = 0;
                    i49++;
                }
                i0Var2.f12080f -= i19;
                i0Var2.f12078d -= i20;
                i29 = 1;
            }
            m2 m2Var5 = qVar2.F;
            int i50 = m2Var5.f11592j;
            if (i50 <= 0) {
                throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
            }
            m2Var5.f11592j = i50 - 1;
            q2 q2Var4 = qVar2.H;
            int i51 = q2Var4.f11684t;
            q2Var4.i();
            if (qVar2.F.f11592j > 0) {
                r13 = qVar2;
                z11 = z11;
            } else {
                int i52 = (-2) - i51;
                qVar2.H.j();
                qVar2.H.e();
                c cVar3 = qVar2.M;
                if (qVar2.N.f12057a.d()) {
                    n2 n2Var = qVar2.G;
                    bVar.f();
                    bVar.h(false);
                    m2 m2Var6 = bVar.f12044a.F;
                    if (m2Var6.f11585c > 0) {
                        int i53 = m2Var6.f11591i;
                        i10 = i29;
                        t0 t0Var = bVar.f12047d;
                        i11 = i52;
                        int i54 = t0Var.f11705b;
                        if ((i54 > 0 ? t0Var.f11704a[i54 - 1] : -2) != i53) {
                            if (!bVar.f12046c && bVar.f12048e) {
                                bVar.h(false);
                                n0.a aVar = bVar.f12045b;
                                aVar.getClass();
                                aVar.f12042a.g(n0.o.f12088c);
                                bVar.f12046c = true;
                            }
                            if (i53 > 0) {
                                c cVarA = m2Var6.a(i53);
                                t0Var.b(i53);
                                bVar.h(false);
                                n0.a aVar2 = bVar.f12045b;
                                aVar2.getClass();
                                n0.n nVar = n0.n.f12087c;
                                n0.i0 i0Var4 = aVar2.f12042a;
                                i0Var4.h(nVar);
                                f6.a.g0(i0Var4, 0, cVarA);
                                int i55 = i0Var4.f12081g;
                                int i56 = nVar.f12067a;
                                int iA3 = n0.i0.a(i0Var4, i56);
                                int i57 = nVar.f12068b;
                                if (i55 != iA3 || i0Var4.f12082h != n0.i0.a(i0Var4, i57)) {
                                    int i58 = 1;
                                    StringBuilder sb2 = new StringBuilder();
                                    int i59 = 0;
                                    int i60 = 0;
                                    while (i59 < i56) {
                                        if (((i58 << i59) & i0Var4.f12081g) != 0) {
                                            if (i60 > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(nVar.b(i59));
                                            i60++;
                                        }
                                        i59++;
                                        i58 = 1;
                                    }
                                    String string = sb2.toString();
                                    StringBuilder sbN2 = l.q.n(string, "StringBuilder().apply(builderAction).toString()");
                                    int i61 = 0;
                                    int i62 = 0;
                                    while (i61 < i57) {
                                        int i63 = i57;
                                        if (((1 << i61) & i0Var4.f12082h) != 0) {
                                            if (i60 > 0) {
                                                sbN2.append(", ");
                                            }
                                            sbN2.append(nVar.c(i61));
                                            i62++;
                                        }
                                        i61++;
                                        i57 = i63;
                                    }
                                    String string2 = sbN2.toString();
                                    d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
                                    StringBuilder sb3 = new StringBuilder("Error while pushing ");
                                    sb3.append(nVar);
                                    sb3.append(". Not all arguments were provided. Missing ");
                                    l.q.t(sb3, i60, " int arguments (", string, ") and ");
                                    throw new IllegalStateException(l.q.m(sb3, i62, " object arguments (", string2, ").").toString());
                                }
                                bVar.f12046c = true;
                            }
                        }
                        n0.a aVar3 = bVar.f12045b;
                        aVar3.getClass();
                        qVar = n0.q.f12090c;
                        i0Var = aVar3.f12042a;
                        i0Var.h(qVar);
                        f6.a.g0(i0Var, 0, cVar3);
                        f6.a.g0(i0Var, 1, n2Var);
                        i12 = i0Var.f12081g;
                        i13 = qVar.f12067a;
                        iA = n0.i0.a(i0Var, i13);
                        i14 = qVar.f12068b;
                        if (i12 == iA || i0Var.f12082h != n0.i0.a(i0Var, i14)) {
                            sb = new StringBuilder();
                            i16 = 0;
                            for (i15 = 0; i15 < i13; i15++) {
                                if (((1 << i15) & i0Var.f12081g) == 0) {
                                    if (i16 > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(qVar.b(i15));
                                    i16++;
                                }
                            }
                            String string3 = sb.toString();
                            sbN = l.q.n(string3, "StringBuilder().apply(builderAction).toString()");
                            i17 = 0;
                            i18 = 0;
                            while (i17 < i14) {
                                int i64 = i14;
                                if (((1 << i17) & i0Var.f12082h) == 0) {
                                    if (i16 > 0) {
                                        sbN.append(", ");
                                    }
                                    sbN.append(qVar.c(i17));
                                    i18++;
                                }
                                i17++;
                                i14 = i64;
                            }
                            String string4 = sbN.toString();
                            d7.a.l(string4, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb4 = new StringBuilder("Error while pushing ");
                            sb4.append(qVar);
                            sb4.append(". Not all arguments were provided. Missing ");
                            l.q.t(sb4, i16, " int arguments (", string3, ") and ");
                            throw new IllegalStateException(l.q.m(sb4, i18, " object arguments (", string4, ").").toString());
                        }
                        r11 = 0;
                        r12 = this;
                    } else {
                        i10 = i29;
                        i11 = i52;
                    }
                    n0.a aVar4 = bVar.f12045b;
                    aVar4.getClass();
                    qVar = n0.q.f12090c;
                    i0Var = aVar4.f12042a;
                    i0Var.h(qVar);
                    f6.a.g0(i0Var, 0, cVar3);
                    f6.a.g0(i0Var, 1, n2Var);
                    i12 = i0Var.f12081g;
                    i13 = qVar.f12067a;
                    iA = n0.i0.a(i0Var, i13);
                    i14 = qVar.f12068b;
                    if (i12 == iA) {
                    }
                    sb = new StringBuilder();
                    i16 = 0;
                    while (i15 < i13) {
                        if (((1 << i15) & i0Var.f12081g) == 0) {
                            if (i16 > 0) {
                                sb.append(", ");
                            }
                            sb.append(qVar.b(i15));
                            i16++;
                        }
                    }
                    String string5 = sb.toString();
                    sbN = l.q.n(string5, "StringBuilder().apply(builderAction).toString()");
                    i17 = 0;
                    i18 = 0;
                    while (i17 < i14) {
                        int i65 = i14;
                        if (((1 << i17) & i0Var.f12082h) == 0) {
                            if (i16 > 0) {
                                sbN.append(", ");
                            }
                            sbN.append(qVar.c(i17));
                            i18++;
                        }
                        i17++;
                        i14 = i65;
                    }
                    String string6 = sbN.toString();
                    d7.a.l(string6, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb5 = new StringBuilder("Error while pushing ");
                    sb5.append(qVar);
                    sb5.append(". Not all arguments were provided. Missing ");
                    l.q.t(sb5, i16, " int arguments (", string5, ") and ");
                    throw new IllegalStateException(l.q.m(sb5, i18, " object arguments (", string6, ").").toString());
                }
                i10 = i29;
                i11 = i52;
                n2 n2Var2 = qVar2.G;
                n0.c cVar4 = qVar2.N;
                bVar.f();
                bVar.h(false);
                m2 m2Var7 = bVar.f12044a.F;
                if (m2Var7.f11585c > 0) {
                    int i66 = m2Var7.f11591i;
                    t0 t0Var2 = bVar.f12047d;
                    int i67 = t0Var2.f11705b;
                    cVar = cVar4;
                    if ((i67 > 0 ? t0Var2.f11704a[i67 - 1] : -2) != i66) {
                        if (!bVar.f12046c && bVar.f12048e) {
                            bVar.h(false);
                            n0.a aVar5 = bVar.f12045b;
                            aVar5.getClass();
                            aVar5.f12042a.g(n0.o.f12088c);
                            bVar.f12046c = true;
                        }
                        if (i66 > 0) {
                            c cVarA2 = m2Var7.a(i66);
                            t0Var2.b(i66);
                            bVar.h(false);
                            n0.a aVar6 = bVar.f12045b;
                            aVar6.getClass();
                            n0.n nVar2 = n0.n.f12087c;
                            n0.i0 i0Var5 = aVar6.f12042a;
                            i0Var5.h(nVar2);
                            f6.a.g0(i0Var5, 0, cVarA2);
                            int i68 = i0Var5.f12081g;
                            int i69 = nVar2.f12067a;
                            int iA4 = n0.i0.a(i0Var5, i69);
                            int i70 = nVar2.f12068b;
                            if (i68 != iA4 || i0Var5.f12082h != n0.i0.a(i0Var5, i70)) {
                                int i71 = 1;
                                StringBuilder sb6 = new StringBuilder();
                                int i72 = 0;
                                int i73 = 0;
                                while (i72 < i69) {
                                    if (((i71 << i72) & i0Var5.f12081g) != 0) {
                                        if (i73 > 0) {
                                            sb6.append(", ");
                                        }
                                        sb6.append(nVar2.b(i72));
                                        i73++;
                                    }
                                    i72++;
                                    i71 = 1;
                                }
                                String string7 = sb6.toString();
                                StringBuilder sbN3 = l.q.n(string7, "StringBuilder().apply(builderAction).toString()");
                                int i74 = 0;
                                int i75 = 0;
                                while (i75 < i70) {
                                    int i76 = i70;
                                    if (((1 << i75) & i0Var5.f12082h) != 0) {
                                        if (i73 > 0) {
                                            sbN3.append(", ");
                                        }
                                        sbN3.append(nVar2.c(i75));
                                        i74++;
                                    }
                                    i75++;
                                    i70 = i76;
                                }
                                String string8 = sbN3.toString();
                                d7.a.l(string8, "StringBuilder().apply(builderAction).toString()");
                                StringBuilder sb7 = new StringBuilder("Error while pushing ");
                                sb7.append(nVar2);
                                sb7.append(". Not all arguments were provided. Missing ");
                                l.q.t(sb7, i73, " int arguments (", string7, ") and ");
                                throw new IllegalStateException(l.q.m(sb7, i74, " object arguments (", string8, ").").toString());
                            }
                            bVar.f12046c = true;
                        }
                    }
                } else {
                    cVar = cVar4;
                }
                n0.a aVar7 = bVar.f12045b;
                aVar7.getClass();
                n0.r rVar = n0.r.f12091c;
                n0.i0 i0Var6 = aVar7.f12042a;
                i0Var6.h(rVar);
                f6.a.g0(i0Var6, 0, cVar3);
                f6.a.g0(i0Var6, 1, n2Var2);
                f6.a.g0(i0Var6, 2, cVar);
                int i77 = i0Var6.f12081g;
                int i78 = rVar.f12067a;
                int iA5 = n0.i0.a(i0Var6, i78);
                int i79 = rVar.f12068b;
                if (i77 != iA5 || i0Var6.f12082h != n0.i0.a(i0Var6, i79)) {
                    StringBuilder sb8 = new StringBuilder();
                    int i80 = 0;
                    int i81 = 0;
                    while (i80 < i78) {
                        int i82 = i78;
                        if (((1 << i80) & i0Var6.f12081g) != 0) {
                            if (i81 > 0) {
                                sb8.append(", ");
                            }
                            sb8.append(rVar.b(i80));
                            i81++;
                        }
                        i80++;
                        i78 = i82;
                    }
                    String string9 = sb8.toString();
                    StringBuilder sbN4 = l.q.n(string9, "StringBuilder().apply(builderAction).toString()");
                    int i83 = 0;
                    int i84 = 0;
                    while (i83 < i79) {
                        int i85 = i79;
                        if (((1 << i83) & i0Var6.f12082h) != 0) {
                            if (i81 > 0) {
                                sbN4.append(", ");
                            }
                            sbN4.append(rVar.c(i83));
                            i84++;
                        }
                        i83++;
                        i79 = i85;
                    }
                    String string10 = sbN4.toString();
                    d7.a.l(string10, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb9 = new StringBuilder("Error while pushing ");
                    sb9.append(rVar);
                    sb9.append(". Not all arguments were provided. Missing ");
                    l.q.t(sb9, i81, " int arguments (", string9, ") and ");
                    throw new IllegalStateException(l.q.m(sb9, i84, " object arguments (", string10, ").").toString());
                }
                q qVar4 = this;
                qVar4.N = new n0.c();
                r11 = 0;
                r12 = qVar4;
                r12.O = r11;
                if (r12.f11632c.f11597b == 0) {
                    i29 = i10;
                    r13 = r12;
                } else {
                    int i86 = i11;
                    r12.i0(i86, r11);
                    i29 = i10;
                    r12.j0(i86, i29);
                    r13 = r12;
                }
            }
            r10 = r13;
        } else {
            z11 = z11;
            if (z10) {
                bVar.e();
            }
            int i87 = bVar.f12044a.F.f11591i;
            t0 t0Var3 = bVar.f12047d;
            int i88 = t0Var3.f11705b;
            if ((i88 > 0 ? t0Var3.f11704a[i88 - 1] : -1) > i87) {
                s.g("Missed recording an endGroup".toString());
                throw null;
            }
            if ((i88 > 0 ? t0Var3.f11704a[i88 - 1] : -1) == i87) {
                bVar.h(false);
                t0Var3.a();
                n0.a aVar8 = bVar.f12045b;
                aVar8.getClass();
                aVar8.f12042a.g(n0.l.f12085c);
            }
            q qVar5 = this;
            int i89 = qVar5.F.f11591i;
            if (i29 != qVar5.n0(i89)) {
                qVar5.j0(i89, i29);
            }
            if (z10) {
                i29 = 1;
            }
            qVar5.F.d();
            bVar.g();
            r10 = qVar5;
        }
        ArrayList arrayList7 = r10.f11637h.f11577a;
        q1 q1Var3 = (q1) arrayList7.remove(arrayList7.size() - 1);
        if (q1Var3 != null && !z11) {
            q1Var3.f11661c++;
        }
        r10.f11638i = q1Var3;
        r10.f11639j = r10.f11640k.a() + i29;
        r10.f11641l = r10.f11642m.a() + i29;
    }

    public final void u() {
        t(false);
        x1 x1VarD = D();
        if (x1VarD != null) {
            int i10 = x1VarD.f11753a;
            if ((i10 & 1) != 0) {
                x1VarD.f11753a = i10 | 2;
            }
        }
    }

    public final void v() {
        t(true);
    }

    public final void w() {
        t(false);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[LOOP:0: B:18:0x0041->B:30:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0086 A[EDGE_INSN: B:31:0x0086->B:32:0x0087 BREAK  A[LOOP:0: B:18:0x0041->B:30:0x0082]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0167  */
    /* JADX WARN: Code duplicated, block: B:79:0x0086 A[SYNTHETIC] */
    public final x1 x() {
        x1 x1Var;
        boolean z10;
        x1 x1Var2;
        c cVarA;
        u.q2 q2Var;
        k3 k3Var = this.D;
        if (!k3Var.f11577a.isEmpty()) {
            ArrayList arrayList = k3Var.f11577a;
            x1Var = (x1) arrayList.remove(arrayList.size() - 1);
        } else {
            x1Var = null;
        }
        if (x1Var != null) {
            x1Var.f11753a &= -9;
        }
        if (x1Var != null) {
            int i10 = this.A;
            q.r rVar = x1Var.f11758f;
            if (rVar == null || (x1Var.f11753a & 16) != 0) {
                q2Var = null;
                break;
            }
            Object[] objArr = rVar.f13022b;
            int[] iArr = rVar.f13023c;
            long[] jArr = rVar.f13021a;
            int i11 = 2;
            int length = jArr.length - 2;
            if (length < 0) {
                q2Var = null;
                break;
            }
            int i12 = 0;
            loop0: while (true) {
                long j10 = jArr[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j10 & 255) < 128) {
                            int i15 = (i12 << 3) + i14;
                            Object obj = objArr[i15];
                            if (iArr[i15] != i10) {
                                q2Var = new u.q2(x1Var, i10, rVar, i11);
                                break loop0;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i13 == 8) {
                        if (i12 == length) {
                            i12++;
                        }
                    }
                    q2Var = null;
                    break;
                }
                if (i12 == length) {
                    q2Var = null;
                    break;
                }
                i12++;
            }
            if (q2Var != null) {
                n0.a aVar = this.L.f12045b;
                aVar.getClass();
                n0.k kVar = n0.k.f12084c;
                n0.i0 i0Var = aVar.f12042a;
                i0Var.h(kVar);
                f6.a.g0(i0Var, 0, q2Var);
                f6.a.g0(i0Var, 1, this.f11636g);
                int i16 = i0Var.f12081g;
                int i17 = kVar.f12067a;
                int iA = n0.i0.a(i0Var, i17);
                int i18 = kVar.f12068b;
                if (i16 != iA || i0Var.f12082h != n0.i0.a(i0Var, i18)) {
                    StringBuilder sb = new StringBuilder();
                    int i19 = 0;
                    for (int i20 = 0; i20 < i17; i20++) {
                        if ((i0Var.f12081g & (1 << i20)) != 0) {
                            if (i19 > 0) {
                                sb.append(", ");
                            }
                            sb.append(kVar.b(i20));
                            i19++;
                        }
                    }
                    String string = sb.toString();
                    StringBuilder sbN = l.q.n(string, "StringBuilder().apply(builderAction).toString()");
                    int i21 = 0;
                    for (int i22 = 0; i22 < i18; i22++) {
                        if ((i0Var.f12082h & (1 << i22)) != 0) {
                            if (i19 > 0) {
                                sbN.append(", ");
                            }
                            sbN.append(kVar.c(i22));
                            i21++;
                        }
                    }
                    String string2 = sbN.toString();
                    d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb2 = new StringBuilder("Error while pushing ");
                    sb2.append(kVar);
                    sb2.append(". Not all arguments were provided. Missing ");
                    l.q.t(sb2, i19, " int arguments (", string, ") and ");
                    throw new IllegalStateException(l.q.m(sb2, i21, " object arguments (", string2, ").").toString());
                }
            }
        }
        if (x1Var != null) {
            int i23 = x1Var.f11753a;
            if ((i23 & 16) == 0 && ((i23 & 1) != 0 || this.f11645p)) {
                if (x1Var.f11755c == null) {
                    if (this.O) {
                        q2 q2Var2 = this.H;
                        cVarA = q2Var2.b(q2Var2.f11684t);
                    } else {
                        m2 m2Var = this.F;
                        cVarA = m2Var.a(m2Var.f11591i);
                    }
                    x1Var.f11755c = cVarA;
                }
                x1Var.f11753a &= -5;
                x1Var2 = x1Var;
                z10 = false;
            } else {
                z10 = false;
                x1Var2 = null;
            }
        } else {
            z10 = false;
            x1Var2 = null;
        }
        t(z10);
        return x1Var2;
    }

    public final void y() {
        if (this.f11653x && this.F.f11591i == this.f11654y) {
            this.f11654y = -1;
            this.f11653x = false;
        }
        t(false);
    }

    public final void z() {
        t(false);
        this.f11631b.b();
        t(false);
        n0.b bVar = this.L;
        if (bVar.f12046c) {
            bVar.h(false);
            bVar.h(false);
            n0.a aVar = bVar.f12045b;
            aVar.getClass();
            aVar.f12042a.g(n0.l.f12085c);
            bVar.f12046c = false;
        }
        bVar.f();
        if (!(bVar.f12047d.f11705b == 0)) {
            s.g("Missed recording an endGroup()".toString());
            throw null;
        }
        if (!this.f11637h.f11577a.isEmpty()) {
            s.g("Start/end imbalance".toString());
            throw null;
        }
        j();
        this.F.c();
    }
}
