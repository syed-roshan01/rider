package w0;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m0.h3;
import m0.p3;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h3 f16108a = new h3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f16109b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static n f16110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f16111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f16112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f16113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static List f16114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static List f16115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicReference f16116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i f16117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m0.e f16118k;

    static {
        n nVar = n.f16100e;
        f16110c = nVar;
        f16111d = 1;
        l lVar = new l();
        lVar.f16083b = new int[16];
        lVar.f16084c = new int[16];
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        lVar.f16085d = iArr;
        f16112e = lVar;
        b0 b0Var = new b0();
        b0Var.f16033b = new int[16];
        b0Var.f16034c = new p3[16];
        f16113f = b0Var;
        r8.r rVar = r8.r.f13661a;
        f16114g = rVar;
        f16115h = rVar;
        int i12 = f16111d;
        f16111d = i12 + 1;
        b bVar = new b(i12, nVar);
        f16110c = f16110c.o(bVar.f16070b);
        AtomicReference atomicReference = new AtomicReference(bVar);
        f16116i = atomicReference;
        f16117j = (i) atomicReference.get();
        f16118k = new m0.e(0);
    }

    public static final c9.c a(c9.c cVar, c9.c cVar2) {
        if (cVar == null || cVar2 == null || d7.a.d(cVar, cVar2)) {
            return cVar == null ? cVar2 : cVar;
        }
        return new a(cVar, cVar2, 3);
    }

    public static final HashMap b(c cVar, c cVar2, n nVar) {
        i0 i0VarQ;
        o0.d dVarW = cVar2.w();
        int iD = cVar.d();
        if (dVarW == null) {
            return null;
        }
        n nVarN = cVar2.e().o(cVar2.d()).n(cVar2.f16041k);
        Object[] objArr = dVarW.f12333b;
        int i10 = dVarW.f12332a;
        HashMap map = null;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            d7.a.k(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            g0 g0Var = (g0) obj;
            i0 i0VarE = g0Var.e();
            i0 i0VarQ2 = q(i0VarE, iD, nVar);
            if (i0VarQ2 != null && (i0VarQ = q(i0VarE, iD, nVarN)) != null && !d7.a.d(i0VarQ2, i0VarQ)) {
                i0 i0VarQ3 = q(i0VarE, cVar2.d(), cVar2.e());
                if (i0VarQ3 == null) {
                    p();
                    throw null;
                }
                i0 i0VarI = g0Var.i(i0VarQ, i0VarQ2, i0VarQ3);
                if (i0VarI == null) {
                    return null;
                }
                if (map == null) {
                    map = new HashMap();
                }
                map.put(i0VarQ2, i0VarI);
                map = map;
            }
        }
        return map;
    }

    public static final void c(i iVar) {
        int i10;
        if (f16110c.k(iVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: id=");
        sb.append(iVar.d());
        sb.append(", disposed=");
        sb.append(iVar.f16071c);
        sb.append(", applied=");
        c cVar = iVar instanceof c ? (c) iVar : null;
        sb.append(cVar != null ? Boolean.valueOf(cVar.f16044n) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f16109b) {
            l lVar = f16112e;
            i10 = lVar.f16082a > 0 ? lVar.f16083b[0] : -1;
        }
        sb.append(i10);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final n d(int i10, int i11, n nVar) {
        while (i10 < i11) {
            nVar = nVar.o(i10);
            i10++;
        }
        return nVar;
    }

    public static final Object e(c9.c cVar) {
        Object obj;
        o0.d dVar;
        Object objT;
        i iVar = f16117j;
        d7.a.k(iVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (f16109b) {
            try {
                obj = f16116i.get();
                dVar = ((b) obj).f16039i;
                if (dVar != null) {
                    f16118k.addAndGet(1);
                }
                objT = t((i) obj, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dVar != null) {
            try {
                List list = f16114g;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((c9.e) list.get(i10)).invoke(dVar, obj);
                }
                f16118k.addAndGet(-1);
            } catch (Throwable th2) {
                f16118k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (f16109b) {
            f();
            if (dVar != null) {
                Object[] objArr = dVar.f12333b;
                int i11 = dVar.f12332a;
                for (int i12 = 0; i12 < i11; i12++) {
                    Object obj2 = objArr[i12];
                    d7.a.k(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    o((g0) obj2);
                }
            }
        }
        return objT;
    }

    public static final void f() {
        b0 b0Var = f16113f;
        int i10 = b0Var.f16032a;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            p3 p3Var = b0Var.f16034c[i11];
            Object obj = p3Var != null ? p3Var.get() : null;
            if (obj != null && !(!n((g0) obj))) {
                if (i12 != i11) {
                    b0Var.f16034c[i12] = p3Var;
                    int[] iArr = b0Var.f16033b;
                    iArr[i12] = iArr[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < i10; i13++) {
            b0Var.f16034c[i13] = null;
            b0Var.f16033b[i13] = 0;
        }
        if (i12 != i10) {
            b0Var.f16032a = i12;
        }
    }

    public static final i g(i iVar, c9.c cVar, boolean z10) {
        boolean z11 = iVar instanceof c;
        if (z11 || iVar == null) {
            return new l0(z11 ? (c) iVar : null, cVar, null, false, z10);
        }
        return new m0(iVar, cVar, z10);
    }

    public static final i0 h(i0 i0Var) {
        i0 i0VarQ;
        i iVarI = i();
        i0 i0VarQ2 = q(i0Var, iVarI.d(), iVarI.e());
        if (i0VarQ2 != null) {
            return i0VarQ2;
        }
        synchronized (f16109b) {
            i iVarI2 = i();
            i0VarQ = q(i0Var, iVarI2.d(), iVarI2.e());
        }
        if (i0VarQ != null) {
            return i0VarQ;
        }
        p();
        throw null;
    }

    public static final i i() {
        i iVar = (i) f16108a.a();
        return iVar == null ? (i) f16116i.get() : iVar;
    }

    public static final c9.c j(c9.c cVar, c9.c cVar2, boolean z10) {
        if (!z10) {
            cVar2 = null;
        }
        if (cVar == null || cVar2 == null || d7.a.d(cVar, cVar2)) {
            return cVar == null ? cVar2 : cVar;
        }
        return new a(cVar, cVar2, 2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052 A[EDGE_INSN: B:31:0x0052->B:33:0x0057 BREAK  A[LOOP:0: B:6:0x0015->B:32:0x0054]] */
    /* JADX WARN: Code duplicated, block: B:40:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final i0 k(i0 i0Var, g0 g0Var) {
        boolean z10;
        int i10 = f16111d;
        l lVar = f16112e;
        if (lVar.f16082a > 0) {
            i10 = lVar.f16083b[0];
        }
        int i11 = i10 - 1;
        i0 i0Var2 = null;
        i0 i0Var3 = null;
        for (i0 i0VarE = g0Var.e(); i0VarE != null; i0VarE = i0VarE.f16074b) {
            int i12 = i0VarE.f16073a;
            if (i12 != 0) {
                if (i12 != 0 && i12 <= i11) {
                    if ((r6 = i12 + 0) < 0) {
                        z10 = false;
                        if (z10) {
                            if (i0Var3 == null) {
                                if (i0VarE.f16073a < i0Var3.f16073a) {
                                    i0Var2 = i0Var3;
                                    break;
                                }
                                break;
                            }
                            i0Var3 = i0VarE;
                        } else {
                            continue;
                        }
                    } else {
                        z10 = false;
                        if (z10) {
                            if (i0Var3 == null) {
                                if (i0VarE.f16073a < i0Var3.f16073a) {
                                    i0Var2 = i0Var3;
                                    break;
                                }
                                break;
                            }
                            i0Var3 = i0VarE;
                        } else {
                            continue;
                        }
                    }
                }
            }
            i0Var2 = i0VarE;
            break;
        }
        if (i0Var2 != null) {
            i0Var2.f16073a = Integer.MAX_VALUE;
            return i0Var2;
        }
        i0 i0VarB = i0Var.b();
        i0VarB.f16073a = Integer.MAX_VALUE;
        i0VarB.f16074b = g0Var.e();
        g0Var.k(i0VarB);
        return i0VarB;
    }

    public static final void l(i iVar, g0 g0Var) {
        iVar.s(iVar.h() + 1);
        c9.c cVarI = iVar.i();
        if (cVarI != null) {
            cVarI.invoke(g0Var);
        }
    }

    public static final i0 m(i0 i0Var, g0 g0Var, i iVar, i0 i0Var2) {
        i0 i0VarK;
        if (iVar.g()) {
            iVar.n(g0Var);
        }
        int iD = iVar.d();
        if (i0Var2.f16073a == iD) {
            return i0Var2;
        }
        synchronized (f16109b) {
            i0VarK = k(i0Var, g0Var);
        }
        i0VarK.f16073a = iD;
        iVar.n(g0Var);
        return i0VarK;
    }

    public static final boolean n(g0 g0Var) {
        i0 i0Var;
        int i10 = f16111d;
        l lVar = f16112e;
        if (lVar.f16082a > 0) {
            i10 = lVar.f16083b[0];
        }
        i0 i0Var2 = null;
        i0 i0VarE = null;
        int i11 = 0;
        for (i0 i0VarE2 = g0Var.e(); i0VarE2 != null; i0VarE2 = i0VarE2.f16074b) {
            int i12 = i0VarE2.f16073a;
            if (i12 != 0) {
                if (i12 >= i10) {
                    i11++;
                } else if (i0Var2 == null) {
                    i11++;
                    i0Var2 = i0VarE2;
                } else {
                    if (i12 < i0Var2.f16073a) {
                        i0Var = i0Var2;
                        i0Var2 = i0VarE2;
                    } else {
                        i0Var = i0VarE2;
                    }
                    if (i0VarE == null) {
                        i0VarE = g0Var.e();
                        i0 i0Var3 = i0VarE;
                        while (true) {
                            if (i0VarE == null) {
                                i0VarE = i0Var3;
                                break;
                            }
                            int i13 = i0VarE.f16073a;
                            if (i13 >= i10) {
                                break;
                            }
                            if (i0Var3.f16073a < i13) {
                                i0Var3 = i0VarE;
                            }
                            i0VarE = i0VarE.f16074b;
                        }
                    }
                    i0Var2.f16073a = 0;
                    i0Var2.a(i0VarE);
                    i0Var2 = i0Var;
                }
            }
        }
        return i11 > 1;
    }

    public static final void o(g0 g0Var) {
        if (n(g0Var)) {
            b0 b0Var = f16113f;
            int i10 = b0Var.f16032a;
            int iIdentityHashCode = System.identityHashCode(g0Var);
            int i11 = -1;
            if (i10 > 0) {
                int i12 = b0Var.f16032a - 1;
                int i13 = 0;
                while (true) {
                    if (i13 <= i12) {
                        int i14 = (i13 + i12) >>> 1;
                        int i15 = b0Var.f16033b[i14];
                        if (i15 >= iIdentityHashCode) {
                            if (i15 <= iIdentityHashCode) {
                                p3 p3Var = b0Var.f16034c[i14];
                                if (g0Var != (p3Var != null ? p3Var.get() : null)) {
                                    int i16 = i14 - 1;
                                    while (true) {
                                        if (-1 >= i16 || b0Var.f16033b[i16] != iIdentityHashCode) {
                                            int i17 = b0Var.f16032a;
                                            i16 = i14 + 1;
                                            while (true) {
                                                if (i16 >= i17) {
                                                    i16 = -(b0Var.f16032a + 1);
                                                    break;
                                                } else {
                                                    if (b0Var.f16033b[i16] != iIdentityHashCode) {
                                                        i16 = -(i16 + 1);
                                                        break;
                                                    }
                                                    p3 p3Var2 = b0Var.f16034c[i16];
                                                    if ((p3Var2 != null ? p3Var2.get() : null) == g0Var) {
                                                        break;
                                                    } else {
                                                        i16++;
                                                    }
                                                }
                                            }
                                        } else {
                                            p3 p3Var3 = b0Var.f16034c[i16];
                                            if ((p3Var3 != null ? p3Var3.get() : null) == g0Var) {
                                                break;
                                            } else {
                                                i16--;
                                            }
                                        }
                                    }
                                    i11 = i16;
                                    break;
                                }
                                i11 = i14;
                                break;
                            }
                            i12 = i14 - 1;
                        } else {
                            i13 = i14 + 1;
                        }
                    } else {
                        i11 = -(i13 + 1);
                        break;
                    }
                }
                if (i11 >= 0) {
                    return;
                }
            }
            int i18 = -(i11 + 1);
            p3[] p3VarArr = b0Var.f16034c;
            int length = p3VarArr.length;
            if (i10 == length) {
                int i19 = length * 2;
                p3[] p3VarArr2 = new p3[i19];
                int[] iArr = new int[i19];
                int i20 = i18 + 1;
                b9.b.H(i20, i18, i10, p3VarArr, p3VarArr2);
                b9.b.L(b0Var.f16034c, p3VarArr2, 0, i18, 6);
                b9.b.G(i20, i18, i10, b0Var.f16033b, iArr);
                b9.b.K(b0Var.f16033b, iArr, i18, 6);
                b0Var.f16034c = p3VarArr2;
                b0Var.f16033b = iArr;
            } else {
                int i21 = i18 + 1;
                b9.b.H(i21, i18, i10, p3VarArr, p3VarArr);
                int[] iArr2 = b0Var.f16033b;
                b9.b.G(i21, i18, i10, iArr2, iArr2);
            }
            b0Var.f16034c[i18] = new p3(g0Var);
            b0Var.f16033b[i18] = iIdentityHashCode;
            b0Var.f16032a++;
        }
    }

    public static final void p() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final i0 q(i0 i0Var, int i10, n nVar) {
        i0 i0Var2 = null;
        while (i0Var != null) {
            int i11 = i0Var.f16073a;
            if (i11 != 0 && i11 <= i10 && !nVar.k(i11) && (i0Var2 == null || i0Var2.f16073a < i0Var.f16073a)) {
                i0Var2 = i0Var;
            }
            i0Var = i0Var.f16074b;
        }
        if (i0Var2 != null) {
            return i0Var2;
        }
        return null;
    }

    public static final i0 r(i0 i0Var, g0 g0Var) {
        i0 i0VarQ;
        i iVarI = i();
        c9.c cVarF = iVarI.f();
        if (cVarF != null) {
            cVarF.invoke(g0Var);
        }
        i0 i0VarQ2 = q(i0Var, iVarI.d(), iVarI.e());
        if (i0VarQ2 != null) {
            return i0VarQ2;
        }
        synchronized (f16109b) {
            i iVarI2 = i();
            i0 i0VarE = g0Var.e();
            d7.a.k(i0VarE, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            i0VarQ = q(i0VarE, iVarI2.d(), iVarI2.e());
            if (i0VarQ == null) {
                p();
                throw null;
            }
        }
        return i0VarQ;
    }

    public static final void s(int i10) {
        int i11;
        l lVar = f16112e;
        int i12 = lVar.f16085d[i10];
        lVar.b(i12, lVar.f16082a - 1);
        lVar.f16082a--;
        int[] iArr = lVar.f16083b;
        int i13 = iArr[i12];
        int i14 = i12;
        while (i14 > 0) {
            int i15 = ((i14 + 1) >> 1) - 1;
            if (iArr[i15] <= i13) {
                break;
            }
            lVar.b(i15, i14);
            i14 = i15;
        }
        int[] iArr2 = lVar.f16083b;
        int i16 = lVar.f16082a >> 1;
        while (i12 < i16) {
            int i17 = (i12 + 1) << 1;
            int i18 = i17 - 1;
            if (i17 < lVar.f16082a && (i11 = iArr2[i17]) < iArr2[i18]) {
                if (i11 >= iArr2[i12]) {
                    break;
                }
                lVar.b(i17, i12);
                i12 = i17;
            } else {
                if (iArr2[i18] >= iArr2[i12]) {
                    break;
                }
                lVar.b(i18, i12);
                i12 = i18;
            }
        }
        lVar.f16085d[i10] = lVar.f16086e;
        lVar.f16086e = i10;
    }

    public static final Object t(i iVar, c9.c cVar) {
        Object objInvoke = cVar.invoke(f16110c.i(iVar.d()));
        synchronized (f16109b) {
            int i10 = f16111d;
            f16111d = i10 + 1;
            n nVarI = f16110c.i(iVar.d());
            f16110c = nVarI;
            f16116i.set(new b(i10, nVarI));
            iVar.c();
            f16110c = f16110c.o(i10);
        }
        return objInvoke;
    }

    public static final i0 u(i0 i0Var, g0 g0Var, i iVar) {
        i0 i0VarK;
        if (iVar.g()) {
            iVar.n(g0Var);
        }
        i0 i0VarQ = q(i0Var, iVar.d(), iVar.e());
        if (i0VarQ == null) {
            p();
            throw null;
        }
        if (i0VarQ.f16073a == iVar.d()) {
            return i0VarQ;
        }
        synchronized (f16109b) {
            i0VarK = k(i0VarQ, g0Var);
            i0VarK.a(i0VarQ);
            i0VarK.f16073a = iVar.d();
        }
        iVar.n(g0Var);
        return i0VarK;
    }
}
