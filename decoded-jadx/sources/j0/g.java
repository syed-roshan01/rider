package j0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import m0.g1;
import m0.l3;
import u.i1;
import u.j1;
import u1.y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l3 f8270c;

    public g(boolean z10, float f10, g1 g1Var) {
        this.f8268a = z10;
        this.f8269b = f10;
        this.f8270c = g1Var;
    }

    @Override // u.i1
    public final j1 a(x.l lVar, m0.m mVar) {
        u uVar;
        m0.q qVar = (m0.q) mVar;
        qVar.Z(988743187);
        w wVar = (w) qVar.m(y.f8321a);
        qVar.Z(-1524341038);
        l3 l3Var = this.f8270c;
        long jB = ((e1.r) l3Var.getValue()).f5067a != e1.r.f5065g ? ((e1.r) l3Var.getValue()).f5067a : wVar.b(qVar);
        qVar.t(false);
        g1 g1VarM0 = d7.t.m0(new e1.r(jB), qVar);
        g1 g1VarM1 = d7.t.m0(wVar.a(qVar), qVar);
        boolean z10 = this.f8268a;
        float f10 = this.f8269b;
        e eVar = (e) this;
        qVar.Z(331259447);
        qVar.Z(-1737891121);
        Object objM = qVar.m(y0.f15381f);
        while (!(objM instanceof ViewGroup)) {
            ViewParent parent = ((View) objM).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + objM + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            objM = parent;
        }
        ViewGroup viewGroup = (ViewGroup) objM;
        qVar.t(false);
        qVar.Z(1643267293);
        boolean zIsInEditMode = viewGroup.isInEditMode();
        k0.y0 y0Var = m0.l.f11578a;
        if (zIsInEditMode) {
            qVar.Z(511388516);
            boolean zG = qVar.g(eVar) | qVar.g(lVar);
            Object objP = qVar.P();
            if (zG || objP == y0Var) {
                objP = new c(z10, f10, g1VarM0, g1VarM1);
                qVar.l0(objP);
            }
            qVar.t(false);
            uVar = (c) objP;
            qVar.t(false);
            qVar.t(false);
        } else {
            qVar.t(false);
            qVar.Z(1618982084);
            boolean zG2 = qVar.g(eVar) | qVar.g(lVar) | qVar.g(viewGroup);
            Object objP2 = qVar.P();
            if (zG2 || objP2 == y0Var) {
                objP2 = new a(z10, f10, g1VarM0, g1VarM1, viewGroup);
                qVar.l0(objP2);
            }
            qVar.t(false);
            uVar = (a) objP2;
            qVar.t(false);
        }
        m0.s.c(uVar, lVar, new f(lVar, uVar, null), qVar);
        qVar.t(false);
        return uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f8268a == gVar.f8268a && m2.e.a(this.f8269b, gVar.f8269b) && d7.a.d(this.f8270c, gVar.f8270c);
    }

    public final int hashCode() {
        return this.f8270c.hashCode() + l.q.a(this.f8269b, Boolean.hashCode(this.f8268a) * 31, 31);
    }
}
