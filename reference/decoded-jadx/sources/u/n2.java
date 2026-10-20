package u;

import androidx.compose.foundation.ScrollingLayoutElement;

/* JADX INFO: loaded from: classes.dex */
public final class n2 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14859a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2 f14861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f14862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v.y0 f14863e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(p2 p2Var, v.y0 y0Var, boolean z10, boolean z11) {
        super(3);
        this.f14860b = z10;
        this.f14861c = p2Var;
        this.f14862d = z11;
        this.f14863e = y0Var;
    }

    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        m0.q qVar = (m0.q) ((m0.m) obj2);
        qVar.Z(1478351300);
        b2 b2VarD = v.t0.d(qVar);
        qVar.Z(773894976);
        qVar.Z(-492369756);
        Object objP = qVar.P();
        if (objP == m0.l.f11578a) {
            m0.d0 d0Var = new m0.d0(m0.s.h(qVar));
            qVar.l0(d0Var);
            objP = d0Var;
        }
        qVar.t(false);
        m9.d0 d0Var2 = ((m0.d0) objP).f11474a;
        qVar.t(false);
        y0.l lVar = y0.l.f16729b;
        y0.o oVarA = y1.l.a(lVar, false, new j2(this.f14860b, this.f14859a, this.f14862d, this.f14861c, d0Var2));
        v.h1 h1Var = v.h1.f15593a;
        boolean z10 = this.f14859a;
        v.h1 h1Var2 = z10 ? h1Var : v.h1.f15594b;
        m2.l lVar2 = (m2.l) qVar.m(u1.s1.f15281k);
        boolean z11 = this.f14860b;
        boolean z12 = (lVar2 != m2.l.f11816b || h1Var2 == h1Var) ? !z11 : z11;
        p2 p2Var = this.f14861c;
        y0.o oVarJ = oVarA.j(h1Var2 == h1Var ? i0.f14802c : i0.f14801b).j(b2VarD.c()).j(androidx.compose.foundation.gestures.a.c(lVar, p2Var, h1Var2, b2VarD, this.f14862d, z12, this.f14863e, p2Var.f14886c)).j(new ScrollingLayoutElement(p2Var, z11, z10));
        qVar.t(false);
        return oVarJ;
    }
}
