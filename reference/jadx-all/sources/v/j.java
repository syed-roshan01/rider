package v;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends t1.o implements t1.p1, t1.m {
    public c9.f A;
    public c9.f B;
    public boolean C;
    public final a D = new a(this, 0);
    public final t.l0 E = new t.l0(this, 3);
    public final p1.d F = new p1.d();
    public boolean G;
    public final o1.d0 H;
    public final o9.c I;
    public x.b J;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c9.c f15634w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15635x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x.m f15636y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c9.a f15637z;

    public j(q0 q0Var, boolean z10, x.m mVar, c9.a aVar, c9.f fVar, c9.f fVar2, boolean z11) {
        this.f15634w = q0Var;
        this.f15635x = z10;
        this.f15636y = mVar;
        this.f15637z = aVar;
        this.A = fVar;
        this.B = fVar2;
        this.C = z11;
        d dVar = new d(this, null);
        o1.k kVar = o1.c0.f12350a;
        o1.j0 j0Var = new o1.j0(dVar);
        G0(j0Var);
        this.H = j0Var;
        this.I = z6.a.a(Integer.MAX_VALUE, null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object H0(j jVar, u8.e eVar, m9.d0 d0Var) {
        e eVar2;
        c9.f fVar;
        m2.p pVar;
        jVar.getClass();
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i10 = eVar2.f15521e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar2.f15521e = i10 - Integer.MIN_VALUE;
            } else {
                eVar2 = new e(jVar, eVar);
            }
        } else {
            eVar2 = new e(jVar, eVar);
        }
        Object obj = eVar2.f15519c;
        v8.a aVar = v8.a.f15963a;
        int i11 = eVar2.f15521e;
        if (i11 != 0) {
            if (i11 == 1) {
                d0Var = eVar2.f15518b;
                jVar = eVar2.f15517a;
                d7.t.v0(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(obj);
            }
            return q8.l.f13235a;
        }
        d7.t.v0(obj);
        x.b bVar = jVar.J;
        if (bVar != null) {
            x.m mVar = jVar.f15636y;
            if (mVar != null) {
                x.a aVar2 = new x.a(bVar);
                eVar2.f15517a = jVar;
                eVar2.f15518b = d0Var;
                eVar2.f15521e = 1;
                if (mVar.a(aVar2, eVar2) == aVar) {
                    return aVar;
                }
            }
        }
        fVar = jVar.B;
        pVar = new m2.p(m2.p.f11823b);
        eVar2.f15517a = null;
        eVar2.f15518b = null;
        eVar2.f15521e = 2;
        if (fVar.e(d0Var, pVar, eVar2) == aVar) {
            return aVar;
        }
        return q8.l.f13235a;
        jVar.J = null;
        fVar = jVar.B;
        pVar = new m2.p(m2.p.f11823b);
        eVar2.f15517a = null;
        eVar2.f15518b = null;
        eVar2.f15521e = 2;
        if (fVar.e(d0Var, pVar, eVar2) == aVar) {
            return aVar;
        }
        return q8.l.f13235a;
    }

    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object I0(j jVar, m9.d0 d0Var, b0 b0Var, u8.e eVar) {
        f fVar;
        x.m mVar;
        x.b bVar;
        j jVar2;
        x.b bVar2;
        m9.d0 d0Var2;
        b0 b0Var2;
        c9.f fVar2;
        d1.c cVar;
        jVar.getClass();
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i10 = fVar.f15540n;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f15540n = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(jVar, eVar);
            }
        } else {
            fVar = new f(jVar, eVar);
        }
        Object obj = fVar.f15538e;
        v8.a aVar = v8.a.f15963a;
        int i11 = fVar.f15540n;
        if (i11 != 0) {
            if (i11 == 1) {
                b0Var = fVar.f15536c;
                d0Var = fVar.f15535b;
                jVar = fVar.f15534a;
                d7.t.v0(obj);
            } else if (i11 == 2) {
                bVar2 = fVar.f15537d;
                b0Var2 = fVar.f15536c;
                d0Var2 = fVar.f15535b;
                jVar2 = fVar.f15534a;
                d7.t.v0(obj);
                bVar = bVar2;
                jVar = jVar2;
                m9.d0 d0Var3 = d0Var2;
                b0Var = b0Var2;
                d0Var = d0Var3;
                jVar.J = bVar;
                fVar2 = jVar.A;
                cVar = new d1.c(b0Var.f15484b);
                fVar.f15534a = null;
                fVar.f15535b = null;
                fVar.f15536c = null;
                fVar.f15537d = null;
                fVar.f15540n = 3;
                if (fVar2.e(d0Var, cVar, fVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(obj);
            }
            return q8.l.f13235a;
        }
        d7.t.v0(obj);
        x.b bVar3 = jVar.J;
        if (bVar3 != null && (mVar = jVar.f15636y) != null) {
            x.a aVar2 = new x.a(bVar3);
            fVar.f15534a = jVar;
            fVar.f15535b = d0Var;
            fVar.f15536c = b0Var;
            fVar.f15540n = 1;
            if (mVar.a(aVar2, fVar) == aVar) {
                return aVar;
            }
        }
        bVar = new x.b();
        x.m mVar2 = jVar.f15636y;
        if (mVar2 != null) {
            fVar.f15534a = jVar;
            fVar.f15535b = d0Var;
            fVar.f15536c = b0Var;
            fVar.f15537d = bVar;
            fVar.f15540n = 2;
            if (mVar2.a(bVar, fVar) == aVar) {
                return aVar;
            }
            jVar2 = jVar;
            bVar2 = bVar;
            b0 b0Var3 = b0Var;
            d0Var2 = d0Var;
            b0Var2 = b0Var3;
            bVar = bVar2;
            jVar = jVar2;
            m9.d0 d0Var4 = d0Var2;
            b0Var = b0Var2;
            d0Var = d0Var4;
        }
        jVar.J = bVar;
        fVar2 = jVar.A;
        cVar = new d1.c(b0Var.f15484b);
        fVar.f15534a = null;
        fVar.f15535b = null;
        fVar.f15536c = null;
        fVar.f15537d = null;
        fVar.f15540n = 3;
        if (fVar2.e(d0Var, cVar, fVar) == aVar) {
            return aVar;
        }
        return q8.l.f13235a;
    }

    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object J0(j jVar, m9.d0 d0Var, c0 c0Var, u8.e eVar) {
        g gVar;
        c9.f fVar;
        m2.p pVar;
        jVar.getClass();
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i10 = gVar.f15554f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f15554f = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(jVar, eVar);
            }
        } else {
            gVar = new g(jVar, eVar);
        }
        Object obj = gVar.f15552d;
        v8.a aVar = v8.a.f15963a;
        int i11 = gVar.f15554f;
        if (i11 != 0) {
            if (i11 == 1) {
                c0Var = gVar.f15551c;
                d0Var = gVar.f15550b;
                jVar = gVar.f15549a;
                d7.t.v0(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(obj);
            }
            return q8.l.f13235a;
        }
        d7.t.v0(obj);
        x.b bVar = jVar.J;
        if (bVar != null) {
            x.m mVar = jVar.f15636y;
            if (mVar != null) {
                x.c cVar = new x.c(bVar);
                gVar.f15549a = jVar;
                gVar.f15550b = d0Var;
                gVar.f15551c = c0Var;
                gVar.f15554f = 1;
                if (mVar.a(cVar, gVar) == aVar) {
                    return aVar;
                }
            }
        }
        fVar = jVar.B;
        pVar = new m2.p(c0Var.f15494b);
        gVar.f15549a = null;
        gVar.f15550b = null;
        gVar.f15551c = null;
        gVar.f15554f = 2;
        if (fVar.e(d0Var, pVar, gVar) == aVar) {
            return aVar;
        }
        return q8.l.f13235a;
        jVar.J = null;
        fVar = jVar.B;
        pVar = new m2.p(c0Var.f15494b);
        gVar.f15549a = null;
        gVar.f15550b = null;
        gVar.f15551c = null;
        gVar.f15554f = 2;
        if (fVar.e(d0Var, pVar, gVar) == aVar) {
            return aVar;
        }
        return q8.l.f13235a;
    }

    @Override // y0.n
    public final void A0() {
        this.G = false;
        K0();
    }

    public final void K0() {
        x.b bVar = this.J;
        if (bVar != null) {
            x.m mVar = this.f15636y;
            if (mVar != null) {
                mVar.b(new x.a(bVar));
            }
            this.J = null;
        }
    }

    @Override // t1.p1
    public final void b0() {
        ((o1.j0) this.H).b0();
    }

    @Override // t1.p1
    public final void y(o1.k kVar, o1.l lVar, long j10) {
        ((o1.j0) this.H).y(kVar, lVar, j10);
    }
}
