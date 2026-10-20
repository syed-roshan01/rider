package h0;

import k0.m1;
import k0.m4;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7346a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x.l lVar, m4 m4Var, boolean z10, boolean z11) {
        super(2);
        this.f7347b = z10;
        this.f7348c = z11;
        this.f7349d = lVar;
        this.f7350e = m4Var;
    }

    public final void a(m0.m mVar, int i10) {
        int i11 = this.f7346a;
        Object obj = this.f7350e;
        Object obj2 = this.f7349d;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    m0.q qVar = (m0.q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                    }
                }
                m mVar2 = (m) obj;
                boolean z10 = this.f7348c;
                boolean z11 = this.f7347b;
                d7.t.i(y1.l.a((y0.o) obj2, false, new a(mVar2, z10, z11)), new t.l0(mVar2, 13), z11, mVar, 0);
                break;
            default:
                if ((i10 & 3) == 2) {
                    m0.q qVar2 = (m0.q) mVar;
                    if (qVar2.G()) {
                        qVar2.U();
                    }
                }
                m1.f9202a.a(this.f7347b, this.f7348c, (x.l) obj2, (m4) obj, null, 0.0f, 0.0f, mVar, 12582912, 112);
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f7346a) {
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
    public b(y0.o oVar, boolean z10, m mVar, boolean z11) {
        super(2);
        this.f7349d = oVar;
        this.f7347b = z10;
        this.f7350e = mVar;
        this.f7348c = z11;
    }
}
