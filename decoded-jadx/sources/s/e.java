package s;

import k0.d5;
import y.i1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0.o f13769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q8.a f13773f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q8.a f13774n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f13775o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f13776p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f13777q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c9.e eVar, y0.o oVar, c9.e eVar2, c9.f fVar, i1 i1Var, d5 d5Var, int i10, int i11) {
        super(2);
        this.f13768a = 1;
        this.f13772e = eVar;
        this.f13769b = oVar;
        this.f13773f = eVar2;
        this.f13774n = fVar;
        this.f13775o = i1Var;
        this.f13776p = d5Var;
        this.f13777q = null;
        this.f13770c = i10;
        this.f13771d = i11;
    }

    public final void a(m0.m mVar, int i10) {
        int i11 = this.f13768a;
        int i12 = this.f13770c;
        Object obj = this.f13777q;
        Object obj2 = this.f13776p;
        Object obj3 = this.f13775o;
        q8.a aVar = this.f13774n;
        q8.a aVar2 = this.f13773f;
        switch (i11) {
            case 0:
                d9.i.a(this.f13772e, this.f13769b, (c9.c) aVar2, (y0.d) obj3, (String) obj2, (c9.c) aVar, (c9.g) obj, mVar, m0.s.m(i12 | 1), this.f13771d);
                break;
            default:
                a7.a.w(obj);
                k0.x.b((c9.e) this.f13772e, this.f13769b, (c9.e) aVar2, (c9.f) aVar, (i1) obj3, (d5) obj2, mVar, m0.s.m(i12 | 1), this.f13771d);
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f13768a) {
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
    public e(Object obj, y0.o oVar, c9.c cVar, y0.d dVar, String str, c9.c cVar2, c9.g gVar, int i10, int i11) {
        super(2);
        this.f13768a = 0;
        this.f13772e = obj;
        this.f13769b = oVar;
        this.f13773f = cVar;
        this.f13775o = dVar;
        this.f13776p = str;
        this.f13774n = cVar2;
        this.f13777q = gVar;
        this.f13770c = i10;
        this.f13771d = i11;
    }
}
