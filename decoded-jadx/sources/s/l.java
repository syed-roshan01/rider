package s;

import m0.n1;
import t.u1;

/* JADX INFO: loaded from: classes.dex */
public final class l extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u1 f13816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.c f13818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f13819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0.u f13820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c9.g f13821f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u1 u1Var, Object obj, c9.c cVar, w wVar, w0.u uVar, c9.g gVar) {
        super(2);
        this.f13816a = u1Var;
        this.f13817b = obj;
        this.f13818c = cVar;
        this.f13819d = wVar;
        this.f13820e = uVar;
        this.f13821f = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    /* JADX WARN: Code duplicated, block: B:14:0x006c  */
    /* JADX WARN: Code duplicated, block: B:16:0x007a  */
    /* JADX WARN: Code duplicated, block: B:18:0x007e  */
    /* JADX WARN: Code duplicated, block: B:22:0x009b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        m0.q qVar;
        Object objP;
        k0.y0 y0Var;
        w wVar;
        c9.c cVar;
        u1 u1Var;
        Object obj3;
        boolean zG;
        Object objP2;
        r0 r0Var;
        r0 r0Var2;
        Object objP3;
        n1 n1Var;
        Object obj4;
        boolean zG2;
        Object objP4;
        m0.m mVar = (m0.m) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            m0.q qVar2 = (m0.q) mVar;
            if (qVar2.G()) {
                qVar2.U();
            } else {
                qVar = (m0.q) mVar;
                qVar.Z(-492369756);
                objP = qVar.P();
                y0Var = m0.l.f11578a;
                wVar = this.f13819d;
                cVar = this.f13818c;
                if (objP == y0Var) {
                    objP = (i0) cVar.invoke(wVar);
                    qVar.l0(objP);
                }
                int i10 = 0;
                qVar.t(false);
                i0 i0Var = (i0) objP;
                u1Var = this.f13816a;
                Object objC = u1Var.c().c();
                obj3 = this.f13817b;
                Boolean boolValueOf = Boolean.valueOf(d7.a.d(objC, obj3));
                qVar.Z(1157296644);
                zG = qVar.g(boolValueOf);
                objP2 = qVar.P();
                if (zG || objP2 == y0Var) {
                    if (d7.a.d(u1Var.c().c(), obj3)) {
                        r0Var = r0.f13859b;
                    } else {
                        r0Var = ((i0) cVar.invoke(wVar)).f13794b;
                    }
                    objP2 = r0Var;
                    qVar.l0(objP2);
                }
                qVar.t(false);
                r0Var2 = (r0) objP2;
                qVar.Z(-492369756);
                objP3 = qVar.P();
                n1Var = u1Var.f14321c;
                obj4 = objP3;
                if (objP3 == y0Var) {
                    boolean zD = d7.a.d(obj3, n1Var.getValue());
                    s sVar = new s();
                    sVar.f13862b = zD;
                    qVar.l0(sVar);
                    obj4 = sVar;
                }
                qVar.t(false);
                s sVar2 = (s) obj4;
                q0 q0Var = i0Var.f13793a;
                y0.o oVarG = androidx.compose.ui.layout.a.g(y0.l.f16729b, new h(i0Var, i10));
                sVar2.f13862b = d7.a.d(obj3, n1Var.getValue());
                y0.o oVarJ = oVarG.j(sVar2);
                u1 u1Var2 = this.f13816a;
                q.w wVar2 = new q.w(obj3, 1);
                qVar.Z(664245165);
                zG2 = qVar.g(r0Var2);
                objP4 = qVar.P();
                if (zG2 || objP4 == y0Var) {
                    objP4 = new i(r0Var2, 0);
                    qVar.l0(objP4);
                }
                qVar.t(false);
                m9.e0.a(u1Var2, wVar2, oVarJ, q0Var, r0Var2, (c9.e) objP4, d7.t.K(qVar, -616195562, new k(this.f13819d, this.f13817b, this.f13820e, this.f13821f, 0)), qVar, 12582912, 64);
            }
        } else {
            qVar = (m0.q) mVar;
            qVar.Z(-492369756);
            objP = qVar.P();
            y0Var = m0.l.f11578a;
            wVar = this.f13819d;
            cVar = this.f13818c;
            if (objP == y0Var) {
                objP = (i0) cVar.invoke(wVar);
                qVar.l0(objP);
            }
            int i11 = 0;
            qVar.t(false);
            i0 i0Var2 = (i0) objP;
            u1Var = this.f13816a;
            Object objC2 = u1Var.c().c();
            obj3 = this.f13817b;
            Boolean boolValueOf2 = Boolean.valueOf(d7.a.d(objC2, obj3));
            qVar.Z(1157296644);
            zG = qVar.g(boolValueOf2);
            objP2 = qVar.P();
            if (zG) {
                if (d7.a.d(u1Var.c().c(), obj3)) {
                    r0Var = r0.f13859b;
                } else {
                    r0Var = ((i0) cVar.invoke(wVar)).f13794b;
                }
                objP2 = r0Var;
                qVar.l0(objP2);
            } else {
                if (d7.a.d(u1Var.c().c(), obj3)) {
                    r0Var = r0.f13859b;
                } else {
                    r0Var = ((i0) cVar.invoke(wVar)).f13794b;
                }
                objP2 = r0Var;
                qVar.l0(objP2);
            }
            qVar.t(false);
            r0Var2 = (r0) objP2;
            qVar.Z(-492369756);
            objP3 = qVar.P();
            n1Var = u1Var.f14321c;
            obj4 = objP3;
            if (objP3 == y0Var) {
                boolean zD2 = d7.a.d(obj3, n1Var.getValue());
                s sVar3 = new s();
                sVar3.f13862b = zD2;
                qVar.l0(sVar3);
                obj4 = sVar3;
            }
            qVar.t(false);
            s sVar4 = (s) obj4;
            q0 q0Var2 = i0Var2.f13793a;
            y0.o oVarG2 = androidx.compose.ui.layout.a.g(y0.l.f16729b, new h(i0Var2, i11));
            sVar4.f13862b = d7.a.d(obj3, n1Var.getValue());
            y0.o oVarJ2 = oVarG2.j(sVar4);
            u1 u1Var3 = this.f13816a;
            q.w wVar3 = new q.w(obj3, 1);
            qVar.Z(664245165);
            zG2 = qVar.g(r0Var2);
            objP4 = qVar.P();
            if (zG2) {
                objP4 = new i(r0Var2, 0);
                qVar.l0(objP4);
            } else {
                objP4 = new i(r0Var2, 0);
                qVar.l0(objP4);
            }
            qVar.t(false);
            m9.e0.a(u1Var3, wVar3, oVarJ2, q0Var2, r0Var2, (c9.e) objP4, d7.t.K(qVar, -616195562, new k(this.f13819d, this.f13817b, this.f13820e, this.f13821f, 0)), qVar, 12582912, 64);
        }
        return q8.l.f13235a;
    }
}
