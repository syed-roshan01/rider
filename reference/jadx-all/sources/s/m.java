package s;

import t.u1;

/* JADX INFO: loaded from: classes.dex */
public final class m extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13825a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0.o f13826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13830f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f13831n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f13832o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q8.a f13833p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u1 u1Var, y0.o oVar, c9.c cVar, y0.d dVar, c9.c cVar2, c9.g gVar, int i10, int i11) {
        super(2);
        this.f13829e = u1Var;
        this.f13826b = oVar;
        this.f13830f = cVar;
        this.f13832o = dVar;
        this.f13831n = cVar2;
        this.f13833p = gVar;
        this.f13827c = i10;
        this.f13828d = i11;
    }

    public final void a(m0.m mVar, int i10) {
        int i11 = this.f13825a;
        int i12 = this.f13827c;
        q8.a aVar = this.f13833p;
        Object obj = this.f13832o;
        Object obj2 = this.f13831n;
        Object obj3 = this.f13830f;
        Object obj4 = this.f13829e;
        switch (i11) {
            case 0:
                d9.i.b((u1) obj4, this.f13826b, (c9.c) obj3, (y0.d) obj, (c9.c) obj2, (c9.g) aVar, mVar, m0.s.m(i12 | 1), this.f13828d);
                break;
            default:
                f6.a.a(this.f13826b, (e1.l0) obj4, (k0.g0) obj3, (k0.h0) obj2, (u.w) obj, (c9.f) aVar, mVar, m0.s.m(i12 | 1), this.f13828d);
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f13825a) {
            case 0:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            default:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
        }
        return lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(y0.o oVar, e1.l0 l0Var, k0.g0 g0Var, k0.h0 h0Var, u.w wVar, c9.f fVar, int i10, int i11) {
        super(2);
        this.f13826b = oVar;
        this.f13829e = l0Var;
        this.f13830f = g0Var;
        this.f13831n = h0Var;
        this.f13832o = wVar;
        this.f13833p = fVar;
        this.f13827c = i10;
        this.f13828d = i11;
    }
}
