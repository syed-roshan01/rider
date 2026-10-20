package m0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class x implements e0, k2, y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f11730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f11731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f11732c = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11733d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f11734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n2 f11735f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o0.j f11736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashSet f11737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0.j f11738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n0.a f11739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n0.a f11740r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o0.j f11741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o0.a f11742t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11743u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public x f11744v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11745w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c0 f11746x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q f11747y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11748z;

    public x(u uVar, t1.w1 w1Var) {
        this.f11730a = uVar;
        this.f11731b = w1Var;
        HashSet hashSet = new HashSet();
        this.f11734e = hashSet;
        n2 n2Var = new n2();
        this.f11735f = n2Var;
        this.f11736n = new o0.j();
        this.f11737o = new HashSet();
        this.f11738p = new o0.j();
        n0.a aVar = new n0.a();
        this.f11739q = aVar;
        n0.a aVar2 = new n0.a();
        this.f11740r = aVar2;
        this.f11741s = new o0.j();
        this.f11742t = new o0.a();
        c0 c0Var = new c0();
        c0Var.f11465a = false;
        this.f11746x = c0Var;
        q qVar = new q(w1Var, uVar, n2Var, hashSet, aVar, aVar2, this);
        uVar.l(qVar);
        this.f11747y = qVar;
        boolean z10 = uVar instanceof g2;
        int i10 = i.f11557a;
    }

    @Override // m0.t
    public final void a() {
        synchronized (this.f11733d) {
            try {
                q qVar = this.f11747y;
                if (!(!qVar.E)) {
                    throw new IllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.".toString());
                }
                if (!this.f11748z) {
                    this.f11748z = true;
                    int i10 = i.f11557a;
                    n0.a aVar = qVar.K;
                    if (aVar != null) {
                        j(aVar);
                    }
                    boolean z10 = this.f11735f.f11597b > 0;
                    if (z10 || (!this.f11734e.isEmpty())) {
                        w wVar = new w(this.f11734e);
                        if (z10) {
                            this.f11731b.getClass();
                            q2 q2VarK = this.f11735f.k();
                            try {
                                s.k(q2VarK, wVar);
                                q2VarK.e();
                                this.f11731b.clear();
                                this.f11731b.d();
                                wVar.b();
                            } catch (Throwable th) {
                                q2VarK.e();
                                throw th;
                            }
                        }
                        wVar.a();
                    }
                    q qVar2 = this.f11747y;
                    qVar2.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        qVar2.f11631b.o(qVar2);
                        qVar2.D.f11577a.clear();
                        qVar2.f11647r.clear();
                        qVar2.f11634e.f12042a.b();
                        qVar2.f11650u = null;
                        qVar2.f11630a.clear();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f11730a.p(this);
    }

    @Override // m0.y1
    public final void b() {
        this.f11743u = true;
    }

    @Override // m0.y1
    public final int c(x1 x1Var, Object obj) {
        x xVar;
        int i10 = x1Var.f11753a;
        if ((i10 & 2) != 0) {
            x1Var.f11753a = i10 | 4;
        }
        c cVar = x1Var.f11755c;
        if (cVar != null && cVar.a()) {
            if (!this.f11735f.n(cVar)) {
                synchronized (this.f11733d) {
                    xVar = this.f11744v;
                }
                if (xVar != null) {
                    q qVar = xVar.f11747y;
                    if (qVar.E && qVar.e0(x1Var, obj)) {
                        return 4;
                    }
                }
                return 1;
            }
            if (x1Var.f11756d != null) {
                return u(x1Var, cVar, obj);
            }
        }
        return 1;
    }

    @Override // m0.y1
    public final void d(Object obj) {
        x1 x1VarD;
        int i10;
        q qVar = this.f11747y;
        if (qVar.f11655z > 0 || (x1VarD = qVar.D()) == null) {
            return;
        }
        int i11 = x1VarD.f11753a | 1;
        x1VarD.f11753a = i11;
        if ((i11 & 32) == 0) {
            q.r rVar = x1VarD.f11758f;
            if (rVar == null) {
                rVar = new q.r();
                x1VarD.f11758f = rVar;
            }
            int i12 = x1VarD.f11757e;
            int iC = rVar.c(obj);
            if (iC < 0) {
                iC = ~iC;
                i10 = -1;
            } else {
                i10 = rVar.f13023c[iC];
            }
            rVar.f13022b[iC] = obj;
            rVar.f13023c[iC] = i12;
            if (i10 == x1VarD.f11757e) {
                return;
            }
            if (obj instanceof k0) {
                q.s sVar = x1VarD.f11759g;
                if (sVar == null) {
                    sVar = new q.s();
                    x1VarD.f11759g = sVar;
                }
                sVar.l(obj, ((j0) ((k0) obj)).f().f11562f);
            }
        }
        if (obj instanceof w0.h0) {
            ((w0.h0) obj).c(1);
        }
        this.f11736n.a(obj, x1VarD);
        if (!(obj instanceof k0)) {
            return;
        }
        o0.j jVar = this.f11738p;
        jVar.c(obj);
        q.r rVar2 = ((j0) ((k0) obj)).f().f11561e;
        Object[] objArr = rVar2.f13022b;
        long[] jArr = rVar2.f13021a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j10 = jArr[i13];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j10) < 128) {
                        w0.g0 g0Var = (w0.g0) objArr[(i13 << 3) + i15];
                        if (g0Var instanceof w0.h0) {
                            ((w0.h0) g0Var).c(1);
                        }
                        jVar.a(g0Var, obj);
                    }
                    j10 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    @Override // m0.t
    public final void e(c9.e eVar) {
        o((u0.b) eVar);
    }

    public final void f() {
        this.f11732c.set(null);
        this.f11739q.f12042a.b();
        this.f11740r.f12042a.b();
        this.f11734e.clear();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0081 A[DONT_INVERT, PHI: r9
  0x0081: PHI (r9v3 java.util.HashSet) = (r9v2 java.util.HashSet), (r9v4 java.util.HashSet) binds: [B:10:0x0033, B:30:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[LOOP:0: B:9:0x0025->B:32:0x0083, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0086 A[EDGE_INSN: B:49:0x0086->B:33:0x0086 BREAK  A[LOOP:0: B:9:0x0025->B:32:0x0083], SYNTHETIC] */
    public final HashSet g(HashSet hashSet, Object obj, boolean z10) {
        int i10;
        Object objF = this.f11736n.f12344a.f(obj);
        if (objF != null) {
            boolean z11 = objF instanceof q.t;
            HashSet hashSet2 = this.f11737o;
            o0.j jVar = this.f11741s;
            if (z11) {
                q.t tVar = (q.t) objF;
                Object[] objArr = tVar.f13039b;
                long[] jArr = tVar.f13038a;
                int length = jArr.length - 2;
                HashSet hashSet3 = hashSet;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j10 = jArr[i11];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i11 != length) {
                                break;
                                break;
                            }
                            i11++;
                        } else {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j10 & 255) < 128) {
                                    x1 x1Var = (x1) objArr[(i11 << 3) + i14];
                                    if (!jVar.b(obj, x1Var) && x1Var.b(obj) != 1) {
                                        if (x1Var.f11759g == null || z10) {
                                            if (hashSet3 == null) {
                                                hashSet3 = new HashSet();
                                            }
                                            hashSet3.add(x1Var);
                                        } else {
                                            hashSet2.add(x1Var);
                                        }
                                    }
                                    i10 = 8;
                                } else {
                                    i10 = i12;
                                }
                                j10 >>= i10;
                                i14++;
                                i12 = i10;
                            }
                            if (i13 != i12) {
                                break;
                            }
                            if (i11 != length) {
                                break;
                            }
                            i11++;
                        }
                    }
                }
                return hashSet3;
            }
            x1 x1Var2 = (x1) objF;
            if (!jVar.b(obj, x1Var2) && x1Var2.b(obj) != 1) {
                if (x1Var2.f11759g == null || z10) {
                    HashSet hashSet4 = hashSet == null ? new HashSet() : hashSet;
                    hashSet4.add(x1Var2);
                    return hashSet4;
                }
                hashSet2.add(x1Var2);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x022e A[PHI: r23 r25 r26 r27 r30 r32
  0x022e: PHI (r23v18 long[]) = (r23v16 long[]), (r23v20 long[]) binds: [B:106:0x0245, B:103:0x022c] A[DONT_GENERATE, DONT_INLINE]
  0x022e: PHI (r25v12 int) = (r25v10 int), (r25v14 int) binds: [B:106:0x0245, B:103:0x022c] A[DONT_GENERATE, DONT_INLINE]
  0x022e: PHI (r26v5 int) = (r26v3 int), (r26v7 int) binds: [B:106:0x0245, B:103:0x022c] A[DONT_GENERATE, DONT_INLINE]
  0x022e: PHI (r27v17 java.lang.String) = (r27v15 java.lang.String), (r27v19 java.lang.String) binds: [B:106:0x0245, B:103:0x022c] A[DONT_GENERATE, DONT_INLINE]
  0x022e: PHI (r30v6 int) = (r30v4 int), (r30v8 int) binds: [B:106:0x0245, B:103:0x022c] A[DONT_GENERATE, DONT_INLINE]
  0x022e: PHI (r32v5 long) = (r32v3 long), (r32v7 long) binds: [B:106:0x0245, B:103:0x022c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:177:0x008f A[EDGE_INSN: B:177:0x008f->B:29:0x008f BREAK  A[LOOP:1: B:16:0x0048->B:28:0x008a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x011c A[EDGE_INSN: B:204:0x011c->B:57:0x011c BREAK  A[LOOP:12: B:45:0x00d6->B:56:0x0118], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0086 A[PHI: r6
  0x0086: PHI (r6v32 java.util.HashSet) = (r6v31 java.util.HashSet), (r6v33 java.util.HashSet) binds: [B:17:0x0056, B:25:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x008a A[LOOP:1: B:16:0x0048->B:28:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0116 A[DONT_INVERT, PHI: r6
  0x0116: PHI (r6v3 java.util.HashSet) = (r6v2 java.util.HashSet), (r6v4 java.util.HashSet) binds: [B:46:0x00e4, B:54:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0118 A[LOOP:12: B:45:0x00d6->B:56:0x0118, LOOP_END] */
    public final void h(Set set, boolean z10) {
        HashSet hashSetG;
        long[] jArr;
        String str;
        long j10;
        String str2;
        boolean zContains;
        Object[] objArr;
        String str3;
        Object[] objArr2;
        String str4;
        long[] jArr2;
        boolean z11;
        int i10;
        String str5;
        long[] jArr3;
        int i11;
        int i12;
        int i13;
        long j11;
        Object[] objArr3;
        Object[] objArr4;
        int i14;
        long j12;
        int i15;
        boolean z12 = set instanceof o0.d;
        o0.j jVar = this.f11738p;
        char c10 = 7;
        Object obj = null;
        if (z12) {
            o0.d dVar = (o0.d) set;
            Object[] objArr5 = dVar.f12333b;
            int i16 = dVar.f12332a;
            hashSetG = null;
            int i17 = 0;
            while (i17 < i16) {
                Object obj2 = objArr5[i17];
                d7.a.k(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (obj2 instanceof x1) {
                    ((x1) obj2).b(obj);
                } else {
                    HashSet hashSetG2 = g(hashSetG, obj2, z10);
                    Object objF = jVar.f12344a.f(obj2);
                    if (objF == null) {
                        hashSetG = hashSetG2;
                    } else if (objF instanceof q.t) {
                        q.t tVar = (q.t) objF;
                        Object[] objArr6 = tVar.f13039b;
                        long[] jArr4 = tVar.f13038a;
                        int length = jArr4.length - 2;
                        if (length >= 0) {
                            int i18 = length;
                            int i19 = 0;
                            while (true) {
                                long j13 = jArr4[i19];
                                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    i15 = i18;
                                    if (i19 != i15) {
                                        break;
                                        break;
                                    } else {
                                        i19++;
                                        i18 = i15;
                                    }
                                } else {
                                    int i20 = 8 - ((~(i19 - i18)) >>> 31);
                                    for (int i21 = 0; i21 < i20; i21++) {
                                        if ((j13 & 255) < 128) {
                                            hashSetG2 = g(hashSetG2, (k0) objArr6[(i19 << 3) + i21], z10);
                                        }
                                        j13 >>= 8;
                                    }
                                    if (i20 != 8) {
                                        break;
                                    }
                                    i15 = i18;
                                    if (i19 != i15) {
                                        break;
                                    }
                                    i19++;
                                    i18 = i15;
                                }
                            }
                        }
                        hashSetG = hashSetG2;
                    } else {
                        hashSetG = g(hashSetG2, (k0) objF, z10);
                    }
                }
                i17++;
                obj = null;
            }
        } else {
            hashSetG = null;
            for (Object obj3 : set) {
                if (obj3 instanceof x1) {
                    ((x1) obj3).b(null);
                } else {
                    HashSet hashSetG3 = g(hashSetG, obj3, z10);
                    Object objF2 = jVar.f12344a.f(obj3);
                    if (objF2 != null) {
                        if (objF2 instanceof q.t) {
                            q.t tVar2 = (q.t) objF2;
                            Object[] objArr7 = tVar2.f13039b;
                            long[] jArr5 = tVar2.f13038a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i22 = 0;
                                while (true) {
                                    long j14 = jArr5[i22];
                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i22 != length2) {
                                            break;
                                            break;
                                        }
                                        i22++;
                                    } else {
                                        int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                        for (int i24 = 0; i24 < i23; i24++) {
                                            if ((j14 & 255) < 128) {
                                                hashSetG3 = g(hashSetG3, (k0) objArr7[(i22 << 3) + i24], z10);
                                            }
                                            j14 >>= 8;
                                        }
                                        if (i23 != 8) {
                                            break;
                                        } else if (i22 != length2) {
                                            break;
                                        } else {
                                            i22++;
                                        }
                                    }
                                }
                            }
                        } else {
                            hashSetG = g(hashSetG3, (k0) objF2, z10);
                        }
                    }
                    hashSetG = hashSetG3;
                }
            }
        }
        String str6 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>";
        o0.j jVar2 = this.f11736n;
        if (z10) {
            HashSet hashSet = this.f11737o;
            if (!hashSet.isEmpty()) {
                q.s sVar = jVar2.f12344a;
                long[] jArr6 = sVar.f13027a;
                int length3 = jArr6.length - 2;
                if (length3 >= 0) {
                    int i25 = 0;
                    while (true) {
                        long j15 = jArr6[i25];
                        length3 = length3;
                        if ((((~j15) << c10) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i26 = 8 - ((~(i25 - length3)) >>> 31);
                            int i27 = 0;
                            while (i27 < i26) {
                                if ((j15 & 255) < 128) {
                                    int i28 = (i25 << 3) + i27;
                                    Object obj4 = sVar.f13028b[i28];
                                    Object obj5 = sVar.f13029c[i28];
                                    if (obj5 instanceof q.t) {
                                        d7.a.k(obj5, str6);
                                        q.t tVar3 = (q.t) obj5;
                                        Object[] objArr8 = tVar3.f13039b;
                                        long[] jArr7 = tVar3.f13038a;
                                        int length4 = jArr7.length - 2;
                                        if (length4 >= 0) {
                                            jArr3 = jArr6;
                                            i11 = i26;
                                            i12 = i27;
                                            int i29 = 0;
                                            while (true) {
                                                long j16 = jArr7[i29];
                                                Object[] objArr9 = objArr8;
                                                long[] jArr8 = jArr7;
                                                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i30 = 8 - ((~(i29 - length4)) >>> 31);
                                                    Object[] objArr10 = objArr9;
                                                    str5 = str6;
                                                    int i31 = 0;
                                                    while (i31 < i30) {
                                                        if ((j16 & 255) < 128) {
                                                            i14 = i25;
                                                            int i32 = (i29 << 3) + i31;
                                                            objArr4 = objArr10;
                                                            x1 x1Var = (x1) objArr10[i32];
                                                            if (hashSet.contains(x1Var)) {
                                                                j12 = j15;
                                                            } else {
                                                                if (hashSetG != null) {
                                                                    j12 = j15;
                                                                    if (hashSetG.contains(x1Var)) {
                                                                    }
                                                                }
                                                                j16 >>= 8;
                                                                i31++;
                                                                i25 = i14;
                                                                objArr10 = objArr4;
                                                                j15 = j12;
                                                            }
                                                            tVar3.h(i32);
                                                            j16 >>= 8;
                                                            i31++;
                                                            i25 = i14;
                                                            objArr10 = objArr4;
                                                            j15 = j12;
                                                        } else {
                                                            objArr4 = objArr10;
                                                            i14 = i25;
                                                        }
                                                        j12 = j15;
                                                        j16 >>= 8;
                                                        i31++;
                                                        i25 = i14;
                                                        objArr10 = objArr4;
                                                        j15 = j12;
                                                    }
                                                    objArr3 = objArr10;
                                                    i13 = i25;
                                                    j11 = j15;
                                                    if (i30 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    i13 = i25;
                                                    j11 = j15;
                                                    objArr3 = objArr9;
                                                    str5 = str6;
                                                }
                                                if (i29 == length4) {
                                                    break;
                                                }
                                                i29++;
                                                str6 = str5;
                                                jArr7 = jArr8;
                                                i25 = i13;
                                                objArr8 = objArr3;
                                                j15 = j11;
                                            }
                                        } else {
                                            str5 = str6;
                                            jArr3 = jArr6;
                                            i11 = i26;
                                            i12 = i27;
                                            i13 = i25;
                                            j11 = j15;
                                        }
                                        if (tVar3.b()) {
                                            sVar.j(i28);
                                        }
                                    } else {
                                        str5 = str6;
                                        jArr3 = jArr6;
                                        i11 = i26;
                                        i12 = i27;
                                        i13 = i25;
                                        j11 = j15;
                                        d7.a.k(obj5, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                        x1 x1Var2 = (x1) obj5;
                                        if (!hashSet.contains(x1Var2)) {
                                            if (hashSetG != null) {
                                                if (hashSetG.contains(x1Var2)) {
                                                }
                                            }
                                        }
                                        sVar.j(i28);
                                    }
                                    j15 = j11 >> 8;
                                    i27 = i12 + 1;
                                    jArr6 = jArr3;
                                    i26 = i11;
                                    str6 = str5;
                                    i25 = i13;
                                } else {
                                    str5 = str6;
                                    jArr3 = jArr6;
                                    i11 = i26;
                                    i12 = i27;
                                    i13 = i25;
                                    j11 = j15;
                                }
                                j15 = j11 >> 8;
                                i27 = i12 + 1;
                                jArr6 = jArr3;
                                i26 = i11;
                                str6 = str5;
                                i25 = i13;
                            }
                            str4 = str6;
                            jArr2 = jArr6;
                            int i33 = i25;
                            z11 = true;
                            if (i26 != 8) {
                                break;
                            } else {
                                i10 = i33;
                            }
                        } else {
                            str4 = str6;
                            jArr2 = jArr6;
                            z11 = true;
                            i10 = i25;
                        }
                        if (i10 == length3) {
                            break;
                        }
                        i25 = i10 + 1;
                        c10 = 7;
                        jArr6 = jArr2;
                        str6 = str4;
                    }
                }
                hashSet.clear();
                m();
                return;
            }
        }
        String str7 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>";
        if (hashSetG != null) {
            q.s sVar2 = jVar2.f12344a;
            long[] jArr9 = sVar2.f13027a;
            int length5 = jArr9.length - 2;
            if (length5 >= 0) {
                int i34 = 0;
                while (true) {
                    long j17 = jArr9[i34];
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i35 = 8 - ((~(i34 - length5)) >>> 31);
                        int i36 = 0;
                        while (i36 < i35) {
                            if ((j17 & 255) < 128) {
                                int i37 = (i34 << 3) + i36;
                                Object obj6 = sVar2.f13028b[i37];
                                Object obj7 = sVar2.f13029c[i37];
                                if (obj7 instanceof q.t) {
                                    String str8 = str7;
                                    d7.a.k(obj7, str8);
                                    q.t tVar4 = (q.t) obj7;
                                    Object[] objArr11 = tVar4.f13039b;
                                    long[] jArr10 = tVar4.f13038a;
                                    int length6 = jArr10.length - 2;
                                    if (length6 >= 0) {
                                        int i38 = 0;
                                        while (true) {
                                            long j18 = jArr10[i38];
                                            j10 = j17;
                                            if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i39 = 8 - ((~(i38 - length6)) >>> 31);
                                                int i40 = 0;
                                                while (i40 < i39) {
                                                    if ((j18 & 255) < 128) {
                                                        str3 = str8;
                                                        int i41 = (i38 << 3) + i40;
                                                        objArr2 = objArr11;
                                                        if (hashSetG.contains((x1) objArr11[i41])) {
                                                            tVar4.h(i41);
                                                        }
                                                    } else {
                                                        str3 = str8;
                                                        objArr2 = objArr11;
                                                    }
                                                    j18 >>= 8;
                                                    i40++;
                                                    str8 = str3;
                                                    objArr11 = objArr2;
                                                }
                                                str2 = str8;
                                                objArr = objArr11;
                                                if (i39 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str8;
                                                objArr = objArr11;
                                            }
                                            if (i38 == length6) {
                                                break;
                                            }
                                            i38++;
                                            length6 = length6;
                                            j17 = j10;
                                            str8 = str2;
                                            objArr11 = objArr;
                                        }
                                    } else {
                                        j10 = j17;
                                        str2 = str8;
                                    }
                                    zContains = tVar4.b();
                                } else {
                                    j10 = j17;
                                    str2 = str7;
                                    d7.a.k(obj7, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                    zContains = hashSetG.contains((x1) obj7);
                                }
                                if (zContains) {
                                    sVar2.j(i37);
                                }
                            } else {
                                jArr9 = jArr9;
                                length5 = length5;
                                i34 = i34;
                                j10 = j17;
                                str2 = str7;
                            }
                            j17 = j10 >> 8;
                            i36++;
                            length5 = length5;
                            i34 = i34;
                            jArr9 = jArr9;
                            str7 = str2;
                        }
                        jArr = jArr9;
                        int i42 = length5;
                        int i43 = i34;
                        str = str7;
                        if (i35 != 8) {
                            break;
                        }
                        length5 = i42;
                        i34 = i43;
                    } else {
                        jArr = jArr9;
                        str = str7;
                    }
                    if (i34 == length5) {
                        break;
                    }
                    i34++;
                    jArr9 = jArr;
                    str7 = str;
                }
            }
            m();
        }
    }

    public final void i() {
        synchronized (this.f11733d) {
            try {
                j(this.f11739q);
                r();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f11734e.isEmpty()) {
                            HashSet hashSet = this.f11734e;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!hashSet.isEmpty()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        i2 i2Var = (i2) it.next();
                                        it.remove();
                                        i2Var.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e4) {
                        f();
                        throw e4;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01f1  */
    public final void j(n0.a aVar) throws Throwable {
        n0.a aVar2;
        n0.a aVar3;
        long[] jArr;
        int i10;
        long[] jArr2;
        n0.a aVar4;
        int i11;
        int i12;
        char c10;
        long j10;
        int i13;
        long[] jArr3;
        long[] jArr4;
        d dVar = this.f11731b;
        n0.a aVar5 = this.f11740r;
        w wVar = new w(this.f11734e);
        try {
            if (aVar.f12042a.d()) {
                if (aVar5.f12042a.d()) {
                    wVar.a();
                    return;
                }
                return;
            }
            Trace.beginSection("Compose:applyChanges");
            dVar.getClass();
            q2 q2VarK = this.f11735f.k();
            try {
                aVar.a(dVar, q2VarK, wVar);
                q2VarK.e();
                dVar.d();
                Trace.endSection();
                wVar.b();
                ArrayList arrayList = wVar.f11723d;
                int i14 = 0;
                if (!arrayList.isEmpty()) {
                    Trace.beginSection("Compose:sideeffects");
                    try {
                        int size = arrayList.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            ((c9.a) arrayList.get(i15)).invoke();
                        }
                        arrayList.clear();
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                if (this.f11743u) {
                    try {
                        try {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f11743u = false;
                                q.s sVar = this.f11736n.f12344a;
                                long[] jArr5 = sVar.f13027a;
                                int length = jArr5.length - 2;
                                if (length >= 0) {
                                    int i16 = 0;
                                    while (true) {
                                        long j11 = jArr5[i16];
                                        char c11 = 7;
                                        long j12 = -9187201950435737472L;
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i17 = 8;
                                            int i18 = 8 - ((~(i16 - length)) >>> 31);
                                            int i19 = i14;
                                            while (i19 < i18) {
                                                if ((j11 & 255) < 128) {
                                                    int i20 = (i16 << 3) + i19;
                                                    Object obj = sVar.f13028b[i20];
                                                    Object obj2 = sVar.f13029c[i20];
                                                    if (obj2 instanceof q.t) {
                                                        d7.a.k(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                                        q.t tVar = (q.t) obj2;
                                                        Object[] objArr = tVar.f13039b;
                                                        long[] jArr6 = tVar.f13038a;
                                                        int length2 = jArr6.length - 2;
                                                        jArr2 = jArr5;
                                                        aVar4 = aVar5;
                                                        if (length2 >= 0) {
                                                            int i21 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j13 = jArr6[i21];
                                                                    i11 = length;
                                                                    i12 = i16;
                                                                    c10 = 7;
                                                                    j10 = -9187201950435737472L;
                                                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                                        int i23 = 0;
                                                                        while (i23 < i22) {
                                                                            if ((j13 & 255) < 128) {
                                                                                jArr4 = jArr6;
                                                                                int i24 = (i21 << 3) + i23;
                                                                                if (!((x1) objArr[i24]).a()) {
                                                                                    tVar.h(i24);
                                                                                }
                                                                            } else {
                                                                                jArr4 = jArr6;
                                                                            }
                                                                            j13 >>= 8;
                                                                            i23++;
                                                                            jArr6 = jArr4;
                                                                        }
                                                                        jArr3 = jArr6;
                                                                        if (i22 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr3 = jArr6;
                                                                    }
                                                                    if (i21 == length2) {
                                                                        break;
                                                                    }
                                                                    i21++;
                                                                    length = i11;
                                                                    i16 = i12;
                                                                    jArr6 = jArr3;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            i11 = length;
                                                            i12 = i16;
                                                            c10 = 7;
                                                            j10 = -9187201950435737472L;
                                                        }
                                                        if (tVar.b()) {
                                                            sVar.j(i20);
                                                        }
                                                    } else {
                                                        jArr2 = jArr5;
                                                        aVar4 = aVar5;
                                                        i11 = length;
                                                        i12 = i16;
                                                        c10 = c11;
                                                        j10 = -9187201950435737472L;
                                                        d7.a.k(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                                        if (!((x1) obj2).a()) {
                                                            sVar.j(i20);
                                                        }
                                                    }
                                                    i13 = 8;
                                                } else {
                                                    jArr2 = jArr5;
                                                    aVar4 = aVar5;
                                                    i11 = length;
                                                    i12 = i16;
                                                    c10 = c11;
                                                    j10 = j12;
                                                    i13 = i17;
                                                }
                                                j11 >>= i13;
                                                i19++;
                                                i17 = i13;
                                                c11 = c10;
                                                j12 = j10;
                                                aVar5 = aVar4;
                                                jArr5 = jArr2;
                                                length = i11;
                                                i16 = i12;
                                            }
                                            jArr = jArr5;
                                            aVar2 = aVar5;
                                            int i25 = length;
                                            int i26 = i16;
                                            if (i18 != i17) {
                                                break;
                                            }
                                            length = i25;
                                            i10 = i26;
                                        } else {
                                            jArr = jArr5;
                                            aVar2 = aVar5;
                                            i10 = i16;
                                        }
                                        if (i10 == length) {
                                            break;
                                        }
                                        i16 = i10 + 1;
                                        aVar5 = aVar2;
                                        jArr5 = jArr;
                                        i14 = 0;
                                    }
                                } else {
                                    aVar2 = aVar5;
                                }
                                m();
                                Trace.endSection();
                                aVar3 = aVar2;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            aVar5 = aVar5;
                            if (aVar5.f12042a.d()) {
                                wVar.a();
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        aVar5 = aVar5;
                        if (aVar5.f12042a.d()) {
                            wVar.a();
                        }
                        throw th;
                    }
                } else {
                    aVar3 = aVar5;
                }
                if (aVar3.f12042a.d()) {
                    wVar.a();
                    return;
                }
                return;
            } catch (Throwable th6) {
                try {
                    q2VarK.e();
                    throw th6;
                } catch (Throwable th7) {
                    th = th7;
                    try {
                        Trace.endSection();
                        throw th;
                    } catch (Throwable th8) {
                        th = th8;
                    }
                }
            }
        } catch (Throwable th9) {
            th = th9;
            aVar5 = aVar5;
        }
        if (aVar5.f12042a.d()) {
            wVar.a();
        }
        throw th;
    }

    public final void k() {
        synchronized (this.f11733d) {
            try {
                if (this.f11740r.f12042a.e()) {
                    j(this.f11740r);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f11734e.isEmpty()) {
                            HashSet hashSet = this.f11734e;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!hashSet.isEmpty()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        i2 i2Var = (i2) it.next();
                                        it.remove();
                                        i2Var.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                } catch (Exception e4) {
                    f();
                    throw e4;
                }
            }
        }
    }

    public final void l() {
        synchronized (this.f11733d) {
            try {
                this.f11747y.f11650u = null;
                if (!this.f11734e.isEmpty()) {
                    HashSet hashSet = this.f11734e;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                i2 i2Var = (i2) it.next();
                                it.remove();
                                i2Var.b();
                            }
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f11734e.isEmpty()) {
                            HashSet hashSet2 = this.f11734e;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!hashSet2.isEmpty()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it2 = hashSet2.iterator();
                                    while (it2.hasNext()) {
                                        i2 i2Var2 = (i2) it2.next();
                                        it2.remove();
                                        i2Var2.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e4) {
                        f();
                        throw e4;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f7 A[PHI: r23 r26 r27 r28 r29
  0x00f7: PHI (r23v3 long) = (r23v2 long), (r23v6 long) binds: [B:39:0x00f5, B:36:0x00db] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r26v6 long[]) = (r26v5 long[]), (r26v8 long[]) binds: [B:39:0x00f5, B:36:0x00db] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r27v4 int) = (r27v3 int), (r27v6 int) binds: [B:39:0x00f5, B:36:0x00db] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r28v4 int) = (r28v3 int), (r28v7 int) binds: [B:39:0x00f5, B:36:0x00db] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r29v3 long) = (r29v2 long), (r29v6 long) binds: [B:39:0x00f5, B:36:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    public final void m() {
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        int i12;
        long j10;
        long j11;
        int i13;
        long[] jArr3;
        Object[] objArr;
        long[] jArr4;
        Object[] objArr2;
        q.s sVar = this.f11738p.f12344a;
        long[] jArr5 = sVar.f13027a;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j12 = jArr5[i14];
                long j13 = -9187201950435737472L;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j12 & 255) < 128) {
                            int i18 = (i14 << 3) + i17;
                            Object obj = sVar.f13028b[i18];
                            Object obj2 = sVar.f13029c[i18];
                            boolean z10 = obj2 instanceof q.t;
                            o0.j jVar = this.f11736n;
                            if (z10) {
                                d7.a.k(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                q.t tVar = (q.t) obj2;
                                Object[] objArr3 = tVar.f13039b;
                                long[] jArr6 = tVar.f13038a;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i11 = length;
                                if (length2 >= 0) {
                                    int i19 = 0;
                                    while (true) {
                                        long j14 = jArr6[i19];
                                        i12 = i14;
                                        j10 = j12;
                                        j11 = -9187201950435737472L;
                                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                if ((j14 & 255) < 128) {
                                                    int i22 = (i19 << 3) + i21;
                                                    jArr4 = jArr6;
                                                    objArr2 = objArr3;
                                                    if (!jVar.f12344a.b((k0) objArr3[i22])) {
                                                        tVar.h(i22);
                                                    }
                                                } else {
                                                    jArr4 = jArr6;
                                                    objArr2 = objArr3;
                                                }
                                                j14 >>= 8;
                                                i21++;
                                                objArr3 = objArr2;
                                                jArr6 = jArr4;
                                            }
                                            jArr3 = jArr6;
                                            objArr = objArr3;
                                            if (i20 != 8) {
                                                break;
                                            }
                                        } else {
                                            jArr3 = jArr6;
                                            objArr = objArr3;
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        objArr3 = objArr;
                                        i14 = i12;
                                        j12 = j10;
                                        jArr6 = jArr3;
                                    }
                                } else {
                                    i12 = i14;
                                    j10 = j12;
                                    j11 = -9187201950435737472L;
                                }
                                if (tVar.b()) {
                                    sVar.j(i18);
                                }
                            } else {
                                jArr2 = jArr5;
                                i11 = length;
                                i12 = i14;
                                j10 = j12;
                                j11 = j13;
                                d7.a.k(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                if (!jVar.f12344a.b((k0) obj2)) {
                                    sVar.j(i18);
                                }
                            }
                            i13 = 8;
                        } else {
                            jArr2 = jArr5;
                            i11 = length;
                            i12 = i14;
                            j10 = j12;
                            j11 = j13;
                            i13 = i15;
                        }
                        j12 = j10 >> i13;
                        i17++;
                        i15 = i13;
                        j13 = j11;
                        jArr5 = jArr2;
                        length = i11;
                        i14 = i12;
                    }
                    jArr = jArr5;
                    int i23 = length;
                    int i24 = i14;
                    if (i16 != i15) {
                        break;
                    }
                    length = i23;
                    i10 = i24;
                } else {
                    jArr = jArr5;
                    i10 = i14;
                }
                if (i10 == length) {
                    break;
                }
                i14 = i10 + 1;
                jArr5 = jArr;
            }
        }
        HashSet hashSet = this.f11737o;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (!(((x1) it.next()).f11759g != null)) {
                    it.remove();
                }
            }
        }
    }

    public final void n(u0.b bVar) throws Exception {
        try {
            synchronized (this.f11733d) {
                q();
                o0.a aVar = this.f11742t;
                this.f11742t = new o0.a();
                try {
                    if (!this.f11746x.f11465a) {
                        this.f11730a.h();
                        d7.a.d(null, null);
                    }
                    this.f11747y.k(aVar, bVar);
                } catch (Exception e4) {
                    this.f11742t = aVar;
                    throw e4;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f11734e.isEmpty()) {
                    HashSet hashSet = this.f11734e;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                i2 i2Var = (i2) it.next();
                                it.remove();
                                i2Var.b();
                            }
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
                throw th;
            } catch (Exception e10) {
                f();
                throw e10;
            }
        }
    }

    public final void o(u0.b bVar) {
        if (!(!this.f11748z)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.f11730a.a(this, bVar);
    }

    public final void p() {
        d dVar = this.f11731b;
        n2 n2Var = this.f11735f;
        boolean z10 = n2Var.f11597b > 0;
        HashSet hashSet = this.f11734e;
        if (z10 || (true ^ hashSet.isEmpty())) {
            Trace.beginSection("Compose:deactivate");
            try {
                w wVar = new w(hashSet);
                if (z10) {
                    dVar.getClass();
                    q2 q2VarK = n2Var.k();
                    try {
                        s.i(q2VarK, wVar);
                        q2VarK.e();
                        dVar.d();
                        wVar.b();
                    } catch (Throwable th) {
                        q2VarK.e();
                        throw th;
                    }
                }
                wVar.a();
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        this.f11736n.f12344a.a();
        this.f11738p.f12344a.a();
        o0.a aVar = this.f11742t;
        aVar.f12327c = 0;
        b9.b.Q(aVar.f12325a);
        b9.b.Q(aVar.f12326b);
        this.f11739q.f12042a.b();
        q qVar = this.f11747y;
        qVar.D.f11577a.clear();
        qVar.f11647r.clear();
        qVar.f11634e.f12042a.b();
        qVar.f11650u = null;
    }

    public final void q() {
        AtomicReference atomicReference = this.f11732c;
        Object obj = y.f11761a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (d7.a.d(andSet, obj)) {
                s.g("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                h((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                s.g("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            for (Set set : (Set[]) andSet) {
                h(set, true);
            }
        }
    }

    public final void r() {
        AtomicReference atomicReference = this.f11732c;
        Object andSet = atomicReference.getAndSet(null);
        if (d7.a.d(andSet, y.f11761a)) {
            return;
        }
        if (andSet instanceof Set) {
            h((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                h(set, false);
            }
            return;
        }
        if (andSet == null) {
            s.g("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        }
        s.g("corrupt pendingModifications drain: " + atomicReference);
        throw null;
    }

    public final void s(ArrayList arrayList) throws Exception {
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            }
            ((c1) ((q8.f) arrayList.get(i10)).f13225a).getClass();
            if (!d7.a.d(null, this)) {
                break;
            } else {
                i10++;
            }
        }
        s.l(z10);
        try {
            q qVar = this.f11747y;
            qVar.getClass();
            try {
                qVar.H(arrayList);
                qVar.j();
            } catch (Throwable th) {
                qVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            HashSet hashSet = this.f11734e;
            try {
                if (!hashSet.isEmpty()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                i2 i2Var = (i2) it.next();
                                it.remove();
                                i2Var.b();
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e4) {
                f();
                throw e4;
            }
        }
    }

    public final void t() {
        y1 y1Var;
        synchronized (this.f11733d) {
            try {
                for (Object obj : this.f11735f.f11598c) {
                    x1 x1Var = obj instanceof x1 ? (x1) obj : null;
                    if (x1Var != null && (y1Var = x1Var.f11754b) != null) {
                        y1Var.c(x1Var, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    public final int u(x1 x1Var, c cVar, Object obj) {
        synchronized (this.f11733d) {
            try {
                x xVar = this.f11744v;
                if (xVar != null) {
                    n2 n2Var = this.f11735f;
                    int i10 = this.f11745w;
                    if (!(!n2Var.f11601f)) {
                        s.g("Writer is active".toString());
                        throw null;
                    }
                    if (i10 < 0 || i10 >= n2Var.f11597b) {
                        s.g("Invalid group index".toString());
                        throw null;
                    }
                    if (n2Var.n(cVar)) {
                        int iS = d7.t.s(n2Var.f11596a, i10) + i10;
                        int i11 = cVar.f11464a;
                        if (i10 > i11 || i11 >= iS) {
                            xVar = null;
                        }
                    } else {
                        xVar = null;
                    }
                } else {
                    xVar = null;
                }
                if (xVar == null) {
                    q qVar = this.f11747y;
                    if (qVar.E && qVar.e0(x1Var, obj)) {
                        return 4;
                    }
                    if (obj == null) {
                        this.f11742t.c(x1Var, null);
                    } else {
                        o0.a aVar = this.f11742t;
                        if (aVar.a(x1Var) >= 0) {
                            o0.d dVar = (o0.d) aVar.b(x1Var);
                            if (dVar != null) {
                                dVar.add(obj);
                            }
                        } else {
                            o0.d dVar2 = new o0.d();
                            dVar2.add(obj);
                            aVar.c(x1Var, dVar2);
                        }
                    }
                }
                if (xVar != null) {
                    return xVar.u(x1Var, cVar, obj);
                }
                this.f11730a.i(this);
                return this.f11747y.E ? 3 : 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(Object obj) {
        Object objF = this.f11736n.f12344a.f(obj);
        if (objF == null) {
            return;
        }
        boolean z10 = objF instanceof q.t;
        o0.j jVar = this.f11741s;
        if (!z10) {
            x1 x1Var = (x1) objF;
            if (x1Var.b(obj) == 4) {
                jVar.a(obj, x1Var);
                return;
            }
            return;
        }
        q.t tVar = (q.t) objF;
        Object[] objArr = tVar.f13039b;
        long[] jArr = tVar.f13038a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        x1 x1Var2 = (x1) objArr[(i10 << 3) + i12];
                        if (x1Var2.b(obj) == 4) {
                            jVar.a(obj, x1Var2);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final boolean w(o0.d dVar) {
        Object[] objArr = dVar.f12333b;
        int i10 = dVar.f12332a;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            d7.a.k(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (this.f11736n.f12344a.b(obj) || this.f11738p.f12344a.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean x() {
        boolean zJ;
        synchronized (this.f11733d) {
            try {
                q();
                try {
                    o0.a aVar = this.f11742t;
                    this.f11742t = new o0.a();
                    try {
                        if (!this.f11746x.f11465a) {
                            this.f11730a.h();
                            d7.a.d(null, null);
                        }
                        zJ = this.f11747y.J(aVar);
                        if (!zJ) {
                            r();
                        }
                    } catch (Exception e4) {
                        this.f11742t = aVar;
                        throw e4;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.f11734e.isEmpty()) {
                            HashSet hashSet = this.f11734e;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!hashSet.isEmpty()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        i2 i2Var = (i2) it.next();
                                        it.remove();
                                        i2Var.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e10) {
                        f();
                        throw e10;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(o0.d dVar) {
        Object obj;
        while (true) {
            Object obj2 = this.f11732c.get();
            if (obj2 == null || d7.a.d(obj2, y.f11761a)) {
                obj = dVar;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, dVar};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f11732c).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = dVar;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f11732c;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.f11733d) {
                            r();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005b A[Catch: all -> 0x0051, LOOP:0: B:11:0x0021->B:23:0x005b, LOOP_END, TryCatch #0 {all -> 0x0051, blocks: (B:4:0x0003, B:6:0x0010, B:8:0x0014, B:11:0x0021, B:13:0x0031, B:15:0x003d, B:17:0x0046, B:20:0x0053, B:23:0x005b, B:24:0x005e), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063 A[EDGE_INSN: B:31:0x0063->B:25:0x0063 BREAK  A[LOOP:0: B:11:0x0021->B:23:0x005b], SYNTHETIC] */
    public final void z(Object obj) {
        synchronized (this.f11733d) {
            try {
                v(obj);
                Object objF = this.f11738p.f12344a.f(obj);
                if (objF != null) {
                    if (objF instanceof q.t) {
                        q.t tVar = (q.t) objF;
                        Object[] objArr = tVar.f13039b;
                        long[] jArr = tVar.f13038a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j10 = jArr[i10];
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i10 != length) {
                                        break;
                                        break;
                                    }
                                    i10++;
                                } else {
                                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        if ((255 & j10) < 128) {
                                            v((k0) objArr[(i10 << 3) + i12]);
                                        }
                                        j10 >>= 8;
                                    }
                                    if (i11 != 8) {
                                        break;
                                    } else if (i10 != length) {
                                        break;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                    } else {
                        v((k0) objF);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
