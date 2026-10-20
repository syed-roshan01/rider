package m0;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends w0.h0 implements k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.a f11570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z2 f11571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i0 f11572d = new i0();

    public j0(z2 z2Var, c9.a aVar) {
        this.f11570b = aVar;
        this.f11571c = z2Var;
    }

    public final i0 d(i0 i0Var, w0.i iVar, boolean z10, c9.a aVar) {
        int i10;
        z2 z2Var;
        long[] jArr;
        int i11;
        i0 i0Var2 = i0Var;
        if (!i0Var2.c(this, iVar)) {
            q.r rVar = new q.r();
            h3 h3Var = a3.f11454a;
            u0.c cVar = (u0.c) h3Var.a();
            if (cVar == null) {
                i10 = 0;
                cVar = new u0.c(0);
                h3Var.b(cVar);
            } else {
                i10 = 0;
            }
            u0.c cVar2 = cVar;
            int i12 = cVar2.f15006a;
            o0.i iVarQ = d7.t.Q();
            int i13 = iVarQ.f12343c;
            if (i13 > 0) {
                Object[] objArr = iVarQ.f12341a;
                int i14 = i10;
                do {
                    ((p) ((l0) objArr[i14])).b();
                    i14++;
                } while (i14 < i13);
            }
            try {
                cVar2.f15006a = i12 + 1;
                Object objE = k0.y0.e(new f0.r0(i12, 2, this, cVar2, rVar), aVar);
                cVar2.f15006a = i12;
                int i15 = iVarQ.f12343c;
                if (i15 > 0) {
                    Object[] objArr2 = iVarQ.f12341a;
                    do {
                        ((p) ((l0) objArr2[i10])).a();
                        i10++;
                    } while (i10 < i15);
                }
                Object obj = w0.p.f16109b;
                synchronized (obj) {
                    try {
                        w0.i iVarI = w0.p.i();
                        Object obj2 = i0Var2.f11562f;
                        if (obj2 == i0.f11558h || (z2Var = this.f11571c) == null || !z2Var.a(objE, obj2)) {
                            i0 i0Var3 = this.f11572d;
                            synchronized (obj) {
                                w0.i0 i0VarK = w0.p.k(i0Var3, this);
                                i0VarK.a(i0Var3);
                                i0VarK.f16073a = iVarI.d();
                                i0Var2 = (i0) i0VarK;
                                i0Var2.f11561e = rVar;
                                i0Var2.f11563g = i0Var2.d(this, iVarI);
                                i0Var2.f11559c = iVar.d();
                                i0Var2.f11560d = iVar.h();
                                i0Var2.f11562f = objE;
                            }
                        } else {
                            i0Var2.f11561e = rVar;
                            i0Var2.f11563g = i0Var2.d(this, iVarI);
                            i0Var2.f11559c = iVar.d();
                            i0Var2.f11560d = iVar.h();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                u0.c cVar3 = (u0.c) a3.f11454a.a();
                if (cVar3 != null && cVar3.f15006a == 0) {
                    w0.p.i().m();
                }
                return i0Var2;
            } catch (Throwable th2) {
                int i16 = iVarQ.f12343c;
                if (i16 > 0) {
                    Object[] objArr3 = iVarQ.f12341a;
                    do {
                        ((p) ((l0) objArr3[i10])).a();
                        i10++;
                    } while (i10 < i16);
                }
                throw th2;
            }
        }
        if (z10) {
            o0.i iVarQ2 = d7.t.Q();
            int i17 = iVarQ2.f12343c;
            if (i17 > 0) {
                Object[] objArr4 = iVarQ2.f12341a;
                int i18 = 0;
                do {
                    ((p) ((l0) objArr4[i18])).b();
                    i18++;
                } while (i18 < i17);
            }
            try {
                q.r rVar2 = i0Var2.f11561e;
                h3 h3Var2 = a3.f11454a;
                u0.c cVar4 = (u0.c) h3Var2.a();
                if (cVar4 == null) {
                    cVar4 = new u0.c(0);
                    h3Var2.b(cVar4);
                }
                int i19 = cVar4.f15006a;
                Object[] objArr5 = rVar2.f13022b;
                int[] iArr = rVar2.f13023c;
                long[] jArr2 = rVar2.f13021a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i20 = 0;
                    while (true) {
                        long j10 = jArr2[i20];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i21 = 8;
                            int i22 = 8 - ((~(i20 - length)) >>> 31);
                            int i23 = 0;
                            while (i23 < i22) {
                                if ((j10 & 255) < 128) {
                                    int i24 = (i20 << 3) + i23;
                                    w0.g0 g0Var = (w0.g0) objArr5[i24];
                                    cVar4.f15006a = i19 + iArr[i24];
                                    c9.c cVarF = iVar.f();
                                    if (cVarF != null) {
                                        cVarF.invoke(g0Var);
                                    }
                                    i11 = 8;
                                } else {
                                    i11 = i21;
                                }
                                j10 >>= i11;
                                i23++;
                                i21 = i11;
                                jArr2 = jArr2;
                            }
                            jArr = jArr2;
                            if (i22 != i21) {
                                break;
                            }
                        } else {
                            jArr = jArr2;
                        }
                        if (i20 == length) {
                            break;
                        }
                        i20++;
                        jArr2 = jArr;
                    }
                }
                cVar4.f15006a = i19;
                int i25 = iVarQ2.f12343c;
                if (i25 > 0) {
                    Object[] objArr6 = iVarQ2.f12341a;
                    int i26 = 0;
                    do {
                        ((p) ((l0) objArr6[i26])).a();
                        i26++;
                    } while (i26 < i25);
                }
            } catch (Throwable th3) {
                int i27 = iVarQ2.f12343c;
                if (i27 > 0) {
                    Object[] objArr7 = iVarQ2.f12341a;
                    int i28 = 0;
                    do {
                        ((p) ((l0) objArr7[i28])).a();
                        i28++;
                    } while (i28 < i27);
                }
                throw th3;
            }
        }
        return i0Var2;
    }

    @Override // w0.g0
    public final w0.i0 e() {
        return this.f11572d;
    }

    public final i0 f() {
        return d((i0) w0.p.h(this.f11572d), w0.p.i(), false, this.f11570b);
    }

    @Override // m0.l3
    public final Object getValue() {
        c9.c cVarF = w0.p.i().f();
        if (cVarF != null) {
            cVarF.invoke(this);
        }
        return d((i0) w0.p.h(this.f11572d), w0.p.i(), true, this.f11570b).f11562f;
    }

    @Override // w0.g0
    public final void k(w0.i0 i0Var) {
        this.f11572d = (i0) i0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        i0 i0Var = (i0) w0.p.h(this.f11572d);
        sb.append(i0Var.c(this, w0.p.i()) ? String.valueOf(i0Var.f11562f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
