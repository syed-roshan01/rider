package u;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f14871b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(q1 q1Var, int i10) {
        super(0);
        this.f14870a = i10;
        this.f14871b = q1Var;
    }

    @Override // c9.a
    public final Object invoke() {
        int i10 = this.f14870a;
        q1 q1Var = this.f14871b;
        switch (i10) {
            case 0:
                return new d1.c(q1Var.I);
            default:
                View view = q1Var.E;
                View view2 = (View) t1.g.p(q1Var, u1.y0.f15381f);
                q1Var.E = view2;
                m2.b bVar = q1Var.F;
                m2.b bVar2 = (m2.b) t1.g.p(q1Var, u1.s1.f15275e);
                q1Var.F = bVar2;
                if (q1Var.G == null || !d7.a.d(view2, view) || !d7.a.d(bVar2, bVar)) {
                    q1Var.G0();
                }
                q1Var.H0();
                return q8.l.f13235a;
        }
    }
}
