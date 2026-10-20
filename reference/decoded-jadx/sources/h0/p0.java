package h0;

import r1.e1;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0.o f7440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.e f7441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7443e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(y0.o oVar, c9.e eVar, int i10, int i11, int i12) {
        super(2);
        this.f7439a = i12;
        this.f7440b = oVar;
        this.f7441c = eVar;
        this.f7442d = i10;
        this.f7443e = i11;
    }

    public final void a(m0.m mVar, int i10) {
        int i11 = this.f7439a;
        c9.e eVar = this.f7441c;
        y0.o oVar = this.f7440b;
        int i12 = this.f7443e;
        int i13 = this.f7442d;
        switch (i11) {
            case 0:
                f6.a.j(oVar, eVar, mVar, m0.s.m(i13 | 1), i12);
                break;
            case 1:
                e1.b(oVar, eVar, mVar, m0.s.m(i13 | 1), i12);
                break;
            default:
                o1.s.h(oVar, eVar, mVar, m0.s.m(i13 | 1), i12);
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f7439a) {
            case 0:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 1:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            default:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
        }
        return lVar;
    }
}
