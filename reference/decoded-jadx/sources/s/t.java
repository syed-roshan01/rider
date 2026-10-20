package s;

import k0.r1;
import k0.s1;

/* JADX INFO: loaded from: classes.dex */
public final class t extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13865a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(long j10, y.t0 t0Var) {
        super(1);
        this.f13866b = j10;
        this.f13867c = t0Var;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f13865a;
        long j10 = this.f13866b;
        Object obj2 = this.f13867c;
        switch (i10) {
            case 0:
                r1.w0.f((r1.w0) obj, (r1.x0) obj2, j10);
                break;
            default:
                g1.e eVar = (g1.e) obj;
                float fD = d1.f.d(j10);
                if (fD <= 0.0f) {
                    ((t1.i0) eVar).a();
                } else {
                    t1.i0 i0Var = (t1.i0) eVar;
                    float fV = i0Var.v(s1.f9445a);
                    float fV2 = i0Var.v(((y.t0) obj2).a(i0Var.getLayoutDirection())) - fV;
                    float f10 = 2;
                    float fD2 = (fV * f10) + fD + fV2;
                    m2.l layoutDirection = i0Var.getLayoutDirection();
                    int[] iArr = r1.f9418a;
                    int i11 = iArr[layoutDirection.ordinal()];
                    g1.c cVar = i0Var.f14447a;
                    float fD3 = i11 == 1 ? d1.f.d(cVar.e()) - fD2 : z6.a.m(fV2, 0.0f);
                    if (iArr[i0Var.getLayoutDirection().ordinal()] == 1) {
                        fD2 = d1.f.d(cVar.e()) - z6.a.m(fV2, 0.0f);
                    }
                    float fB = d1.f.b(j10);
                    float f11 = (-fB) / f10;
                    float f12 = fB / f10;
                    g1.b bVar = cVar.f6497b;
                    long jB = bVar.b();
                    bVar.a().j();
                    bVar.f6494a.f6500a.a().d(fD3, f11, fD2, f12, 0);
                    i0Var.a();
                    bVar.a().h();
                    bVar.c(jB);
                }
                break;
        }
        return lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(r1.x0 x0Var, long j10) {
        super(1);
        this.f13867c = x0Var;
        this.f13866b = j10;
    }
}
