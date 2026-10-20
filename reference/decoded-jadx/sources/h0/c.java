package h0;

import k0.m1;
import k0.m4;
import m0.v1;
import u1.s1;
import u1.y2;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7356a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7361f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y2 y2Var, y0.o oVar, boolean z10, m mVar, boolean z11) {
        super(2);
        this.f7359d = y2Var;
        this.f7360e = oVar;
        this.f7357b = z10;
        this.f7361f = mVar;
        this.f7358c = z11;
    }

    public final void a(m0.m mVar, int i10) {
        int i11 = this.f7356a;
        Object obj = this.f7361f;
        Object obj2 = this.f7360e;
        Object obj3 = this.f7359d;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    m0.q qVar = (m0.q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                    }
                }
                v1 v1VarB = s1.f15286p.b((y2) obj3);
                boolean z10 = this.f7358c;
                f6.a.b(v1VarB, d7.t.K(mVar, -1338858912, new b((y0.o) obj2, this.f7357b, (m) obj, z10)), mVar, 56);
                break;
            default:
                if ((i10 & 3) == 2) {
                    m0.q qVar2 = (m0.q) mVar;
                    if (qVar2.G()) {
                        qVar2.U();
                    }
                }
                m1.f9202a.a(this.f7357b, this.f7358c, (x.m) obj3, (m4) obj2, (e1.l0) obj, 0.0f, 0.0f, mVar, 12582912, 96);
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f7356a) {
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
    public c(boolean z10, boolean z11, x.m mVar, m4 m4Var, e1.l0 l0Var) {
        super(2);
        this.f7357b = z10;
        this.f7358c = z11;
        this.f7359d = mVar;
        this.f7360e = m4Var;
        this.f7361f = l0Var;
    }
}
