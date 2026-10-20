package u;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends y0.n implements t1.p1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x.m f14755u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public x.h f14756v;

    @Override // y0.n
    public final void A0() {
        I0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G0(u8.e eVar) {
        z0 z0Var;
        d1 d1Var;
        x.h hVar;
        if (eVar instanceof z0) {
            z0Var = (z0) eVar;
            int i10 = z0Var.f14998e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                z0Var.f14998e = i10 - Integer.MIN_VALUE;
            } else {
                z0Var = new z0(this, eVar);
            }
        } else {
            z0Var = new z0(this, eVar);
        }
        Object obj = z0Var.f14996c;
        v8.a aVar = v8.a.f15963a;
        int i11 = z0Var.f14998e;
        if (i11 == 0) {
            d7.t.v0(obj);
            if (this.f14756v == null) {
                x.h hVar2 = new x.h();
                x.m mVar = this.f14755u;
                z0Var.f14994a = this;
                z0Var.f14995b = hVar2;
                z0Var.f14998e = 1;
                if (mVar.a(hVar2, z0Var) == aVar) {
                    return aVar;
                }
                d1Var = this;
                hVar = hVar2;
            }
            return q8.l.f13235a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hVar = z0Var.f14995b;
        d1Var = z0Var.f14994a;
        d7.t.v0(obj);
        d1Var.f14756v = hVar;
        return q8.l.f13235a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H0(u8.e eVar) {
        a1 a1Var;
        d1 d1Var;
        if (eVar instanceof a1) {
            a1Var = (a1) eVar;
            int i10 = a1Var.f14724d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a1Var.f14724d = i10 - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(this, eVar);
            }
        } else {
            a1Var = new a1(this, eVar);
        }
        Object obj = a1Var.f14722b;
        v8.a aVar = v8.a.f15963a;
        int i11 = a1Var.f14724d;
        if (i11 == 0) {
            d7.t.v0(obj);
            x.h hVar = this.f14756v;
            if (hVar != null) {
                x.i iVar = new x.i(hVar);
                x.m mVar = this.f14755u;
                a1Var.f14721a = this;
                a1Var.f14724d = 1;
                if (mVar.a(iVar, a1Var) == aVar) {
                    return aVar;
                }
                d1Var = this;
            }
            return q8.l.f13235a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d1Var = a1Var.f14721a;
        d7.t.v0(obj);
        d1Var.f14756v = null;
        return q8.l.f13235a;
    }

    public final void I0() {
        x.h hVar = this.f14756v;
        if (hVar != null) {
            this.f14755u.b(new x.i(hVar));
            this.f14756v = null;
        }
    }

    @Override // t1.p1
    public final void b0() {
        I0();
    }

    @Override // t1.p1
    public final void y(o1.k kVar, o1.l lVar, long j10) {
        if (lVar == o1.l.f12401b) {
            int i10 = kVar.f12399c;
            if (o1.s.t(i10, 4)) {
                z6.a.Q(v0(), null, 0, new b1(this, null), 3);
            } else if (o1.s.t(i10, 5)) {
                z6.a.Q(v0(), null, 0, new c1(this, null), 3);
            }
        }
    }
}
