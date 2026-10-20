package m0;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends w0.i0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f11558h = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q.r f11561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f11562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11563g;

    public i0() {
        q.r rVar = q.u.f13034a;
        d7.a.k(rVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f11561e = rVar;
        this.f11562f = f11558h;
    }

    @Override // w0.i0
    public final void a(w0.i0 i0Var) {
        d7.a.k(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        i0 i0Var2 = (i0) i0Var;
        this.f11561e = i0Var2.f11561e;
        this.f11562f = i0Var2.f11562f;
        this.f11563g = i0Var2.f11563g;
    }

    @Override // w0.i0
    public final w0.i0 b() {
        return new i0();
    }

    public final boolean c(k0 k0Var, w0.i iVar) {
        boolean z10;
        boolean z11;
        Object obj = w0.p.f16109b;
        synchronized (obj) {
            z10 = true;
            z11 = (this.f11559c == iVar.d() && this.f11560d == iVar.h()) ? false : true;
        }
        if (this.f11562f == f11558h || (z11 && this.f11563g != d(k0Var, iVar))) {
            z10 = false;
        }
        if (z10 && z11) {
            synchronized (obj) {
                this.f11559c = iVar.d();
                this.f11560d = iVar.h();
            }
        }
        return z10;
    }

    public final int d(k0 k0Var, w0.i iVar) throws Throwable {
        q.r rVar;
        int i10;
        int i11;
        int i12;
        int i13;
        w0.i0 i0VarQ;
        synchronized (w0.p.f16109b) {
            rVar = this.f11561e;
        }
        char c10 = 7;
        if (rVar.f13025e == 0) {
            return 7;
        }
        o0.i iVarQ = d7.t.Q();
        int i14 = iVarQ.f12343c;
        int i15 = 1;
        if (i14 > 0) {
            Object[] objArr = iVarQ.f12341a;
            int i16 = 0;
            do {
                ((p) ((l0) objArr[i16])).b();
                i16++;
            } while (i16 < i14);
        }
        try {
            Object[] objArr2 = rVar.f13022b;
            int[] iArr = rVar.f13023c;
            long[] jArr = rVar.f13021a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int iIdentityHashCode = 7;
                int i17 = 0;
                while (true) {
                    long j10 = jArr[i17];
                    if ((((~j10) << c10) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8;
                        int i19 = 8 - ((~(i17 - length)) >>> 31);
                        int i20 = 0;
                        while (i20 < i19) {
                            if ((j10 & 255) < 128) {
                                int i21 = (i17 << 3) + i20;
                                w0.g0 g0Var = (w0.g0) objArr2[i21];
                                if (iArr[i21] == i15) {
                                    if (g0Var instanceof j0) {
                                        j0 j0Var = (j0) g0Var;
                                        w0.i0 i0VarQ2 = w0.p.q(j0Var.f11572d, iVar.d(), iVar.e());
                                        if (i0VarQ2 == null) {
                                            w0.p.p();
                                            throw null;
                                        }
                                        i10 = 0;
                                        try {
                                            i0VarQ = j0Var.d((i0) i0VarQ2, iVar, false, j0Var.f11570b);
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                        int i22 = iVarQ.f12343c;
                                        if (i22 > 0) {
                                            Object[] objArr3 = iVarQ.f12341a;
                                            int i23 = i10;
                                            do {
                                                ((p) ((l0) objArr3[i23])).a();
                                                i23++;
                                            } while (i23 < i22);
                                        }
                                        throw th;
                                    }
                                    i0VarQ = w0.p.q(g0Var.e(), iVar.d(), iVar.e());
                                    if (i0VarQ == null) {
                                        w0.p.p();
                                        throw null;
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(i0VarQ)) * 31) + i0VarQ.f16073a;
                                }
                                i13 = 8;
                            } else {
                                i13 = i18;
                            }
                            j10 >>= i13;
                            i20++;
                            i18 = i13;
                            i15 = 1;
                        }
                        i11 = 0;
                        if (i19 != i18) {
                            break;
                        }
                    } else {
                        i11 = 0;
                    }
                    if (i17 == length) {
                        break;
                    }
                    i17++;
                    c10 = 7;
                    i15 = 1;
                }
                i12 = iIdentityHashCode;
            } else {
                i11 = 0;
                i12 = 7;
            }
            int i24 = iVarQ.f12343c;
            if (i24 <= 0) {
                return i12;
            }
            Object[] objArr4 = iVarQ.f12341a;
            int i25 = i11;
            do {
                ((p) ((l0) objArr4[i25])).a();
                i25++;
            } while (i25 < i24);
            return i12;
        } catch (Throwable th2) {
            th = th2;
            i10 = 0;
        }
    }
}
