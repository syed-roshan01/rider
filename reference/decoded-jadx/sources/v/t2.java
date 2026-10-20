package v;

/* JADX INFO: loaded from: classes.dex */
public final class t2 extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m9.d0 f15788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c9.f f15789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c9.c f15790f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l1 f15791n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(m9.d0 d0Var, c9.f fVar, c9.c cVar, l1 l1Var, u8.e eVar) {
        super(eVar);
        this.f15788d = d0Var;
        this.f15789e = fVar;
        this.f15790f = cVar;
        this.f15791n = l1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        t2 t2Var = new t2(this.f15788d, this.f15789e, this.f15790f, this.f15791n, eVar);
        t2Var.f15787c = obj;
        return t2Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t2) create((o1.h0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        o1.h0 h0Var;
        o1.u uVar;
        c9.c cVar;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15786b;
        m9.d0 d0Var = this.f15788d;
        l1 l1Var = this.f15791n;
        if (i10 != 0) {
            if (i10 == 1) {
                h0Var = (o1.h0) this.f15787c;
                d7.t.v0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(obj);
            }
            uVar = (o1.u) obj;
            if (uVar == null) {
                z6.a.Q(d0Var, null, 0, new r2(l1Var, null), 3);
            } else {
                uVar.a();
                z6.a.Q(d0Var, null, 0, new s2(l1Var, null), 3);
                cVar = this.f15790f;
                if (cVar != null) {
                    cVar.invoke(new d1.c(uVar.f12416c));
                }
            }
            return q8.l.f13235a;
        }
        d7.t.v0(obj);
        h0Var = (o1.h0) this.f15787c;
        z6.a.Q(d0Var, null, 0, new p2(l1Var, null), 3);
        this.f15787c = h0Var;
        this.f15786b = 1;
        obj = k3.b(h0Var, (2 & 1) != 0, (2 & 2) != 0 ? o1.l.f12401b : null, this);
        if (obj == aVar) {
            return aVar;
        }
        o1.u uVar2 = (o1.u) obj;
        uVar2.a();
        p0 p0Var = k3.f15663a;
        c9.f fVar = this.f15789e;
        if (fVar != p0Var) {
            z6.a.Q(d0Var, null, 0, new q2(fVar, l1Var, uVar2, null), 3);
        }
        this.f15787c = null;
        this.f15786b = 2;
        obj = k3.d(h0Var, o1.l.f12401b, this);
        if (obj == aVar) {
            return aVar;
        }
        uVar = (o1.u) obj;
        if (uVar == null) {
            z6.a.Q(d0Var, null, 0, new r2(l1Var, null), 3);
        } else {
            uVar.a();
            z6.a.Q(d0Var, null, 0, new s2(l1Var, null), 3);
            cVar = this.f15790f;
            if (cVar != null) {
                cVar.invoke(new d1.c(uVar.f12416c));
            }
        }
        return q8.l.f13235a;
    }
}
