package p9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends q9.b implements x, f, q9.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12872f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o9.a f12873n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object[] f12874o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f12875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f12876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12878s;

    public c0(int i10, int i11, o9.a aVar) {
        this.f12871e = i10;
        this.f12872f = i11;
        this.f12873n = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x00a1, B:43:0x00a2, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x00a1, B:43:0x00a2, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [p9.g] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [q9.b] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [p9.c0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [p9.g] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [q9.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [p9.e0] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [p9.e0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b0 -> B:16:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:56:0x0092
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static v8.a k(p9.c0 r8, p9.g r9, u8.e r10) {
        /*
            boolean r0 = r10 instanceof p9.b0
            if (r0 == 0) goto L13
            r0 = r10
            p9.b0 r0 = (p9.b0) r0
            int r1 = r0.f12868n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12868n = r1
            goto L18
        L13:
            p9.b0 r0 = new p9.b0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f12866e
            v8.a r1 = v8.a.f15963a
            int r2 = r0.f12868n
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            m9.f1 r8 = r0.f12865d
            p9.e0 r9 = r0.f12864c
            p9.g r2 = r0.f12863b
            p9.c0 r5 = r0.f12862a
            d7.t.v0(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L76
        L38:
            r8 = move-exception
            goto Lb6
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            m9.f1 r8 = r0.f12865d
            p9.e0 r9 = r0.f12864c
            p9.g r2 = r0.f12863b
            p9.c0 r5 = r0.f12862a
            d7.t.v0(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            p9.e0 r9 = r0.f12864c
            p9.g r8 = r0.f12863b
            p9.c0 r2 = r0.f12862a
            d7.t.v0(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb6
        L5e:
            d7.t.v0(r10)
            q9.d r10 = r8.c()
            p9.e0 r10 = (p9.e0) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            u8.j r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb3
            m9.a0 r5 = m9.a0.f11902b     // Catch: java.lang.Throwable -> Lb3
            u8.h r2 = r2.f(r5)     // Catch: java.lang.Throwable -> Lb3
            m9.f1 r2 = (m9.f1) r2     // Catch: java.lang.Throwable -> Lb3
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.s(r9)     // Catch: java.lang.Throwable -> L38
            i3.u r6 = p9.d0.f12882a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.f12862a = r5     // Catch: java.lang.Throwable -> L38
            r0.f12863b = r2     // Catch: java.lang.Throwable -> L38
            r0.f12864c = r9     // Catch: java.lang.Throwable -> L38
            r0.f12865d = r8     // Catch: java.lang.Throwable -> L38
            r0.f12868n = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.i(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            return r1
        L92:
            if (r8 == 0) goto La2
            boolean r6 = r8.b()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La2
        L9b:
            m9.p1 r8 = (m9.p1) r8     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.CancellationException r8 = r8.H()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La2:
            r0.f12862a = r5     // Catch: java.lang.Throwable -> L38
            r0.f12863b = r2     // Catch: java.lang.Throwable -> L38
            r0.f12864c = r9     // Catch: java.lang.Throwable -> L38
            r0.f12865d = r8     // Catch: java.lang.Throwable -> L38
            r0.f12868n = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
            return r1
        Lb3:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb6:
            r5.g(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.c0.k(p9.c0, p9.g, u8.e):v8.a");
    }

    @Override // p9.x
    public final void a() {
        synchronized (this) {
            t(o() + ((long) this.f12877r), this.f12876q, o() + ((long) this.f12877r), o() + ((long) this.f12877r) + ((long) this.f12878s));
        }
    }

    @Override // q9.q
    public final f b(u8.j jVar, int i10, o9.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == o9.a.f12668a) ? this : new q9.j(i10, jVar, aVar, this);
    }

    @Override // p9.f
    public final Object collect(g gVar, u8.e eVar) {
        return k(this, gVar, eVar);
    }

    @Override // q9.b
    public final q9.d d() {
        e0 e0Var = new e0();
        e0Var.f12888a = -1L;
        return e0Var;
    }

    @Override // q9.b
    public final q9.d[] e() {
        return new e0[2];
    }

    @Override // p9.g
    public final Object emit(Object obj, u8.e eVar) {
        u8.e[] eVarArrN;
        a0 a0Var;
        if (f(obj)) {
            return q8.l.f13235a;
        }
        m9.l lVar = new m9.l(1, d7.t.b0(eVar));
        lVar.t();
        u8.e[] eVarArrN2 = q9.c.f13246a;
        synchronized (this) {
            try {
                if (q(obj)) {
                    lVar.resumeWith(q8.l.f13235a);
                    eVarArrN = n(eVarArrN2);
                    a0Var = null;
                } else {
                    a0 a0Var2 = new a0(this, ((long) (this.f12877r + this.f12878s)) + o(), obj, lVar);
                    m(a0Var2);
                    this.f12878s++;
                    if (this.f12872f == 0) {
                        eVarArrN2 = n(eVarArrN2);
                    }
                    eVarArrN = eVarArrN2;
                    a0Var = a0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a0Var != null) {
            lVar.v(new m9.i(a0Var, 1));
        }
        for (u8.e eVar2 : eVarArrN) {
            if (eVar2 != null) {
                eVar2.resumeWith(q8.l.f13235a);
            }
        }
        Object objS = lVar.s();
        v8.a aVar = v8.a.f15963a;
        if (objS != aVar) {
            objS = q8.l.f13235a;
        }
        return objS == aVar ? objS : q8.l.f13235a;
    }

    @Override // p9.x
    public final boolean f(Object obj) {
        int i10;
        boolean z10;
        u8.e[] eVarArrN = q9.c.f13246a;
        synchronized (this) {
            if (q(obj)) {
                eVarArrN = n(eVarArrN);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (u8.e eVar : eVarArrN) {
            if (eVar != null) {
                eVar.resumeWith(q8.l.f13235a);
            }
        }
        return z10;
    }

    public final Object i(e0 e0Var, b0 b0Var) {
        m9.l lVar = new m9.l(1, d7.t.b0(b0Var));
        lVar.t();
        synchronized (this) {
            if (r(e0Var) < 0) {
                e0Var.f12889b = lVar;
            } else {
                lVar.resumeWith(q8.l.f13235a);
            }
        }
        Object objS = lVar.s();
        return objS == v8.a.f15963a ? objS : q8.l.f13235a;
    }

    public final void j() {
        if (this.f12872f != 0 || this.f12878s > 1) {
            Object[] objArr = this.f12874o;
            d7.a.j(objArr);
            while (this.f12878s > 0) {
                long jO = o();
                int i10 = this.f12877r;
                int i11 = this.f12878s;
                if (objArr[((int) ((jO + ((long) (i10 + i11))) - 1)) & (objArr.length - 1)] != d0.f12882a) {
                    return;
                }
                this.f12878s = i11 - 1;
                d0.b(objArr, o() + ((long) (this.f12877r + this.f12878s)), null);
            }
        }
    }

    public final void l() {
        q9.d[] dVarArr;
        Object[] objArr = this.f12874o;
        d7.a.j(objArr);
        d0.b(objArr, o(), null);
        this.f12877r--;
        long jO = o() + 1;
        if (this.f12875p < jO) {
            this.f12875p = jO;
        }
        if (this.f12876q < jO) {
            if (this.f13243b != 0 && (dVarArr = this.f13242a) != null) {
                for (q9.d dVar : dVarArr) {
                    if (dVar != null) {
                        e0 e0Var = (e0) dVar;
                        long j10 = e0Var.f12888a;
                        if (j10 >= 0 && j10 < jO) {
                            e0Var.f12888a = jO;
                        }
                    }
                }
            }
            this.f12876q = jO;
        }
    }

    public final void m(Object obj) {
        int i10 = this.f12877r + this.f12878s;
        Object[] objArrP = this.f12874o;
        if (objArrP == null) {
            objArrP = p(0, 2, null);
        } else if (i10 >= objArrP.length) {
            objArrP = p(i10, objArrP.length * 2, objArrP);
        }
        d0.b(objArrP, o() + ((long) i10), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [u8.e[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final u8.e[] n(u8.e[] eVarArr) {
        q9.d[] dVarArr;
        e0 e0Var;
        m9.l lVar;
        int length = eVarArr.length;
        if (this.f13243b != 0 && (dVarArr = this.f13242a) != null) {
            int length2 = dVarArr.length;
            int i10 = 0;
            while (i10 < length2) {
                q9.d dVar = dVarArr[i10];
                if (dVar == null || (lVar = (e0Var = (e0) dVar).f12889b) == null || r(e0Var) < 0) {
                    eVarArr = eVarArr;
                } else {
                    if (length >= eVarArr.length) {
                        eVarArr = eVarArr;
                        eVarArr = eVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) eVarArr, Math.max(2, eVarArr.length * 2));
                        d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
                        eVarArr = objArrCopyOf;
                    }
                    eVarArr = eVarArr;
                    eVarArr = eVarArr;
                    ((u8.e[]) eVarArr)[length] = lVar;
                    e0Var.f12889b = null;
                    length++;
                }
                i10++;
                eVarArr = eVarArr;
            }
            eVarArr = eVarArr;
        }
        return (u8.e[]) eVarArr;
    }

    public final long o() {
        return Math.min(this.f12876q, this.f12875p);
    }

    public final Object[] p(int i10, int i11, Object[] objArr) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i11];
        this.f12874o = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jO = o();
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = ((long) i12) + jO;
            d0.b(objArr2, j10, objArr[((int) j10) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i10 = this.f13243b;
        int i11 = this.f12871e;
        if (i10 == 0) {
            if (i11 != 0) {
                m(obj);
                int i12 = this.f12877r + 1;
                this.f12877r = i12;
                if (i12 > i11) {
                    l();
                }
                this.f12876q = o() + ((long) this.f12877r);
            }
            return true;
        }
        int i13 = this.f12877r;
        int i14 = this.f12872f;
        if (i13 >= i14 && this.f12876q <= this.f12875p) {
            int iOrdinal = this.f12873n.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 2) {
                return true;
            }
        }
        m(obj);
        int i15 = this.f12877r + 1;
        this.f12877r = i15;
        if (i15 > i14) {
            l();
        }
        long jO = o() + ((long) this.f12877r);
        long j10 = this.f12875p;
        if (((int) (jO - j10)) > i11) {
            t(j10 + 1, this.f12876q, o() + ((long) this.f12877r), o() + ((long) this.f12877r) + ((long) this.f12878s));
        }
        return true;
    }

    public final long r(e0 e0Var) {
        long j10 = e0Var.f12888a;
        if (j10 < o() + ((long) this.f12877r)) {
            return j10;
        }
        if (this.f12872f <= 0 && j10 <= o() && this.f12878s != 0) {
            return j10;
        }
        return -1L;
    }

    public final Object s(e0 e0Var) {
        Object obj;
        u8.e[] eVarArrU = q9.c.f13246a;
        synchronized (this) {
            long jR = r(e0Var);
            if (jR < 0) {
                obj = d0.f12882a;
            } else {
                long j10 = e0Var.f12888a;
                Object[] objArr = this.f12874o;
                d7.a.j(objArr);
                Object obj2 = objArr[((int) jR) & (objArr.length - 1)];
                if (obj2 instanceof a0) {
                    obj2 = ((a0) obj2).f12856c;
                }
                e0Var.f12888a = jR + 1;
                Object obj3 = obj2;
                eVarArrU = u(j10);
                obj = obj3;
            }
        }
        for (u8.e eVar : eVarArrU) {
            if (eVar != null) {
                eVar.resumeWith(q8.l.f13235a);
            }
        }
        return obj;
    }

    public final void t(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jO = o(); jO < jMin; jO++) {
            Object[] objArr = this.f12874o;
            d7.a.j(objArr);
            d0.b(objArr, jO, null);
        }
        this.f12875p = j10;
        this.f12876q = j11;
        this.f12877r = (int) (j12 - jMin);
        this.f12878s = (int) (j13 - j12);
    }

    public final u8.e[] u(long j10) {
        long j11;
        long j12;
        u8.e[] eVarArr;
        long j13;
        q9.d[] dVarArr;
        long j14 = this.f12876q;
        u8.e[] eVarArr2 = q9.c.f13246a;
        if (j10 > j14) {
            return eVarArr2;
        }
        long jO = o();
        long j15 = ((long) this.f12877r) + jO;
        int i10 = this.f12872f;
        if (i10 == 0 && this.f12878s > 0) {
            j15++;
        }
        if (this.f13243b != 0 && (dVarArr = this.f13242a) != null) {
            for (q9.d dVar : dVarArr) {
                if (dVar != null) {
                    long j16 = ((e0) dVar).f12888a;
                    if (j16 >= 0 && j16 < j15) {
                        j15 = j16;
                    }
                }
            }
        }
        if (j15 <= this.f12876q) {
            return eVarArr2;
        }
        long jO2 = o() + ((long) this.f12877r);
        int iMin = this.f13243b > 0 ? Math.min(this.f12878s, i10 - ((int) (jO2 - j15))) : this.f12878s;
        long j17 = ((long) this.f12878s) + jO2;
        i3.u uVar = d0.f12882a;
        if (iMin > 0) {
            u8.e[] eVarArr3 = new u8.e[iMin];
            Object[] objArr = this.f12874o;
            d7.a.j(objArr);
            long j18 = jO2;
            int i11 = 0;
            while (true) {
                if (jO2 >= j17) {
                    j11 = j15;
                    j12 = j17;
                    break;
                }
                j11 = j15;
                Object obj = objArr[((int) jO2) & (objArr.length - 1)];
                if (obj != uVar) {
                    d7.a.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a0 a0Var = (a0) obj;
                    int i12 = i11 + 1;
                    j12 = j17;
                    eVarArr3[i11] = a0Var.f12857d;
                    d0.b(objArr, jO2, uVar);
                    d0.b(objArr, j18, a0Var.f12856c);
                    j13 = 1;
                    j18++;
                    if (i12 >= iMin) {
                        break;
                    }
                    i11 = i12;
                } else {
                    j12 = j17;
                    j13 = 1;
                }
                jO2 += j13;
                j15 = j11;
                j17 = j12;
            }
            eVarArr = eVarArr3;
            jO2 = j18;
        } else {
            j11 = j15;
            j12 = j17;
            eVarArr = eVarArr2;
        }
        int i13 = (int) (jO2 - jO);
        long j19 = this.f13243b == 0 ? jO2 : j11;
        long jMax = Math.max(this.f12875p, jO2 - ((long) Math.min(this.f12871e, i13)));
        if (i10 == 0 && jMax < j12) {
            Object[] objArr2 = this.f12874o;
            d7.a.j(objArr2);
            if (d7.a.d(objArr2[((int) jMax) & (objArr2.length - 1)], uVar)) {
                jO2++;
                jMax++;
            }
        }
        t(jMax, j19, jO2, j12);
        j();
        return (eVarArr.length == 0) ^ true ? n(eVarArr) : eVarArr;
    }
}
