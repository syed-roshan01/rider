package t;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14271c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(int i10, b0.h0 h0Var) {
        super(2);
        this.f14269a = 7;
        this.f14270b = i10;
        this.f14271c = h0Var;
    }

    public final void a(m0.m mVar, int i10) {
        i1.f fVarB;
        int i11 = this.f14269a;
        int i12 = this.f14270b;
        Object obj = this.f14271c;
        switch (i11) {
            case 0:
                ((p0) obj).a(mVar, m0.s.m(i12 | 1));
                break;
            case 1:
                if ((i10 & 11) == 2) {
                    m0.q qVar = (m0.q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                    }
                }
                z.m mVar2 = (z.m) obj;
                a0.e eVarC = mVar2.f17092b.f17043u.c(i12);
                ((z.f) eVarC.f784c).f17040c.g(mVar2.f17093c, Integer.valueOf(i12 - eVarC.f782a), mVar, 0);
                break;
            case 2:
                if ((i10 & 11) == 2) {
                    m0.q qVar2 = (m0.q) mVar;
                    if (qVar2.G()) {
                        qVar2.U();
                    }
                }
                a0.e eVarC2 = ((b0.t) obj).f2466b.f0().c(i12);
                ((b0.n) eVarC2.f784c).f2430b.g(b0.z.f2508a, Integer.valueOf(i12 - eVarC2.f782a), mVar, 0);
                break;
            case 3:
                d7.t.l((h0.v0) obj, mVar, m0.s.m(i12 | 1));
                break;
            case 4:
                ((u1.r1) obj).a(mVar, m0.s.m(i12 | 1));
                break;
            case 5:
                ((o2.n) obj).a(mVar, m0.s.m(i12 | 1));
                break;
            case 6:
                ((o2.r) obj).a(mVar, m0.s.m(i12 | 1));
                break;
            case 7:
                if ((i10 & 11) == 2) {
                    m0.q qVar3 = (m0.q) mVar;
                    if (qVar3.G()) {
                        qVar3.U();
                    }
                }
                if (i12 == 0) {
                    fVarB = o7.d0.f12583l;
                    if (fVarB == null) {
                        i1.e eVar = new i1.e("Filled.Dashboard", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i13 = i1.h0.f7832a;
                        e1.n0 n0Var = new e1.n0(e1.r.f5060b);
                        k.f fVar = new k.f(7);
                        fVar.D(3.0f, 13.0f);
                        fVar.A(8.0f);
                        fVar.B(11.0f, 3.0f);
                        fVar.B(3.0f, 3.0f);
                        fVar.K(10.0f);
                        fVar.p();
                        fVar.D(3.0f, 21.0f);
                        fVar.A(8.0f);
                        fVar.K(-6.0f);
                        fVar.B(3.0f, 15.0f);
                        fVar.K(6.0f);
                        fVar.p();
                        fVar.D(13.0f, 21.0f);
                        fVar.A(8.0f);
                        fVar.B(21.0f, 11.0f);
                        fVar.A(-8.0f);
                        fVar.K(10.0f);
                        fVar.p();
                        fVar.D(13.0f, 3.0f);
                        fVar.K(6.0f);
                        fVar.A(8.0f);
                        fVar.B(21.0f, 3.0f);
                        fVar.A(-8.0f);
                        fVar.p();
                        i1.e.a(eVar, (ArrayList) fVar.f8599b, n0Var);
                        fVarB = eVar.b();
                        o7.d0.f12583l = fVarB;
                    }
                } else if (i12 == 1) {
                    fVarB = z6.a.f17306g;
                    if (fVarB == null) {
                        i1.e eVar2 = new i1.e("Filled.FilterList", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i14 = i1.h0.f7832a;
                        e1.n0 n0Var2 = new e1.n0(e1.r.f5060b);
                        k.f fVar2 = new k.f(7);
                        fVar2.D(10.0f, 18.0f);
                        fVar2.A(4.0f);
                        fVar2.K(-2.0f);
                        fVar2.A(-4.0f);
                        fVar2.K(2.0f);
                        fVar2.p();
                        fVar2.D(3.0f, 6.0f);
                        fVar2.K(2.0f);
                        fVar2.A(18.0f);
                        fVar2.B(21.0f, 6.0f);
                        fVar2.B(3.0f, 6.0f);
                        fVar2.p();
                        fVar2.D(6.0f, 13.0f);
                        fVar2.A(12.0f);
                        fVar2.K(-2.0f);
                        fVar2.B(6.0f, 11.0f);
                        fVar2.K(2.0f);
                        fVar2.p();
                        i1.e.a(eVar2, (ArrayList) fVar2.f8599b, n0Var2);
                        fVarB = eVar2.b();
                        z6.a.f17306g = fVarB;
                    }
                } else if (i12 == 2) {
                    fVarB = f6.a.f6359h;
                    if (fVarB == null) {
                        i1.e eVar3 = new i1.e("Filled.Apps", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i15 = i1.h0.f7832a;
                        e1.n0 n0Var3 = new e1.n0(e1.r.f5060b);
                        k.f fVar3 = new k.f(7);
                        fVar3.D(4.0f, 8.0f);
                        fVar3.A(4.0f);
                        fVar3.B(8.0f, 4.0f);
                        fVar3.B(4.0f, 4.0f);
                        fVar3.K(4.0f);
                        fVar3.p();
                        fVar3.D(10.0f, 20.0f);
                        fVar3.A(4.0f);
                        fVar3.K(-4.0f);
                        fVar3.A(-4.0f);
                        fVar3.K(4.0f);
                        fVar3.p();
                        fVar3.D(4.0f, 20.0f);
                        fVar3.A(4.0f);
                        fVar3.K(-4.0f);
                        fVar3.B(4.0f, 16.0f);
                        fVar3.K(4.0f);
                        fVar3.p();
                        fVar3.D(4.0f, 14.0f);
                        fVar3.A(4.0f);
                        fVar3.K(-4.0f);
                        fVar3.B(4.0f, 10.0f);
                        fVar3.K(4.0f);
                        fVar3.p();
                        fVar3.D(10.0f, 14.0f);
                        fVar3.A(4.0f);
                        fVar3.K(-4.0f);
                        fVar3.A(-4.0f);
                        fVar3.K(4.0f);
                        fVar3.p();
                        fVar3.D(16.0f, 4.0f);
                        fVar3.K(4.0f);
                        fVar3.A(4.0f);
                        fVar3.B(20.0f, 4.0f);
                        fVar3.A(-4.0f);
                        fVar3.p();
                        fVar3.D(10.0f, 8.0f);
                        fVar3.A(4.0f);
                        fVar3.B(14.0f, 4.0f);
                        fVar3.A(-4.0f);
                        fVar3.K(4.0f);
                        fVar3.p();
                        fVar3.D(16.0f, 14.0f);
                        fVar3.A(4.0f);
                        fVar3.K(-4.0f);
                        fVar3.A(-4.0f);
                        fVar3.K(4.0f);
                        fVar3.p();
                        fVar3.D(16.0f, 20.0f);
                        fVar3.A(4.0f);
                        fVar3.K(-4.0f);
                        fVar3.A(-4.0f);
                        fVar3.K(4.0f);
                        fVar3.p();
                        i1.e.a(eVar3, (ArrayList) fVar3.f8599b, n0Var3);
                        fVarB = eVar3.b();
                        f6.a.f6359h = fVarB;
                    }
                } else if (i12 != 3) {
                    i1.f fVarB2 = f6.a.f6371t;
                    if (fVarB2 == null) {
                        i1.e eVar4 = new i1.e("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i16 = i1.h0.f7832a;
                        e1.n0 n0Var4 = new e1.n0(e1.r.f5060b);
                        k.f fVarC = k.c(7, 19.14f, 12.94f);
                        fVarC.v(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
                        fVarC.v(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
                        fVarC.C(2.03f, -1.58f);
                        fVarC.v(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
                        fVarC.C(-1.92f, -3.32f);
                        fVarC.v(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
                        fVarC.C(-2.39f, 0.96f);
                        fVarC.v(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
                        fVarC.B(14.4f, 2.81f);
                        fVarC.v(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
                        fVarC.A(-3.84f);
                        fVarC.v(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
                        fVarC.B(9.25f, 5.35f);
                        fVarC.u(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
                        fVarC.B(5.24f, 5.33f);
                        fVarC.v(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
                        fVarC.B(2.74f, 8.87f);
                        fVarC.u(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
                        fVarC.C(2.03f, 1.58f);
                        fVarC.u(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
                        fVarC.H(0.02f, 0.64f, 0.07f, 0.94f);
                        fVarC.C(-2.03f, 1.58f);
                        fVarC.v(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
                        fVarC.C(1.92f, 3.32f);
                        fVarC.v(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
                        fVarC.C(2.39f, -0.96f);
                        fVarC.v(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
                        fVarC.C(0.36f, 2.54f);
                        fVarC.v(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
                        fVarC.A(3.84f);
                        fVarC.v(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
                        fVarC.C(0.36f, -2.54f);
                        fVarC.v(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
                        fVarC.C(2.39f, 0.96f);
                        fVarC.v(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
                        fVarC.C(1.92f, -3.32f);
                        fVarC.v(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
                        fVarC.B(19.14f, 12.94f);
                        fVarC.p();
                        fVarC.D(12.0f, 15.6f);
                        fVarC.v(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
                        fVarC.H(1.62f, -3.6f, 3.6f, -3.6f);
                        fVarC.H(3.6f, 1.62f, 3.6f, 3.6f);
                        fVarC.G(13.98f, 15.6f, 12.0f, 15.6f);
                        fVarC.p();
                        i1.e.a(eVar4, (ArrayList) fVarC.f8599b, n0Var4);
                        fVarB2 = eVar4.b();
                        f6.a.f6371t = fVarB2;
                    }
                    fVarB = fVarB2;
                } else {
                    fVarB = f6.a.O();
                }
                k0.e1.b(fVarB, null, androidx.compose.foundation.layout.c.h(y0.l.f16729b, 20), ((b0.h0) obj).f2397e.f2318b.d() == i12 ? e5.a.f5125a : e5.a.f5137m, mVar, 432, 0);
                break;
            case 8:
                d5.o1.j(m0.s.m(i12 | 1), mVar, (String) obj);
                break;
            case 9:
                y3.e.B((z4.f) obj, mVar, m0.s.m(i12 | 1));
                break;
            default:
                e5.b.a((c9.e) obj, mVar, m0.s.m(i12 | 1));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f14269a) {
            case 0:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 1:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 2:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 3:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 4:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 5:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 6:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 7:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 8:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 9:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            default:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
        }
        return lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Object obj, int i10, int i11) {
        super(2);
        this.f14269a = i11;
        this.f14271c = obj;
        this.f14270b = i10;
    }
}
