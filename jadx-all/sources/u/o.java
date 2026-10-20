package u;

import k0.r3;
import v.m3;

/* JADX INFO: loaded from: classes.dex */
public final class o extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f14865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(float f10, e1.y yVar, e1.l lVar) {
        super(1);
        this.f14864a = 2;
        this.f14865b = f10;
        this.f14866c = yVar;
        this.f14867d = lVar;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        long jRound;
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f14864a;
        Object obj2 = this.f14867d;
        float f10 = this.f14865b;
        Object obj3 = this.f14866c;
        switch (i10) {
            case 1:
                long jLongValue = ((Number) obj).longValue();
                m3 m3Var = (m3) obj3;
                if (m3Var.f15705b == Long.MIN_VALUE) {
                    m3Var.f15705b = jLongValue;
                }
                float f11 = m3Var.f15708e;
                t.p pVar = new t.p(f11);
                t.p pVar2 = m3.f15703f;
                if (f10 == 0.0f) {
                    jRound = m3Var.f15704a.b(new t.p(f11), pVar2, m3Var.f15706c);
                } else {
                    double d10 = (jLongValue - m3Var.f15705b) / f10;
                    if (Double.isNaN(d10)) {
                        throw new IllegalArgumentException("Cannot round NaN value.");
                    }
                    jRound = Math.round(d10);
                }
                long j10 = jRound;
                float f12 = ((t.p) m3Var.f15704a.d(j10, pVar, pVar2, m3Var.f15706c)).f14272a;
                m3Var.f15706c = (t.p) m3Var.f15704a.c(j10, pVar, pVar2, m3Var.f15706c);
                m3Var.f15705b = jLongValue;
                float f13 = m3Var.f15708e - f12;
                m3Var.f15708e = f12;
                ((c9.c) obj2).invoke(Float.valueOf(f13));
                return lVar;
            case 2:
                t1.i0 i0Var = (t1.i0) ((g1.e) obj);
                i0Var.a();
                g1.b bVar = i0Var.f14447a.f6497b;
                long jB = bVar.b();
                bVar.a().j();
                g1.d dVar = bVar.f6494a;
                dVar.f6500a.a().e(f10, 0.0f);
                long j11 = d1.c.f4326b;
                e1.p pVarA = dVar.f6500a.a();
                pVarA.e(d1.c.d(j11), d1.c.e(j11));
                pVarA.f();
                pVarA.e(-d1.c.d(j11), -d1.c.e(j11));
                g1.g.l0(i0Var, (e1.y) obj3, (e1.l) obj2);
                bVar.a().h();
                bVar.c(jB);
                return lVar;
            default:
                t.d dVar2 = (t.d) obj3;
                if (((Number) dVar2.f14112e.getValue()).floatValue() != f10) {
                    z6.a.Q((m9.d0) obj2, null, 0, new r3(dVar2, f10, null), 3);
                }
                return new f0.q();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, float f10, Object obj2, int i10) {
        super(1);
        this.f14864a = i10;
        this.f14866c = obj;
        this.f14865b = f10;
        this.f14867d = obj2;
    }
}
