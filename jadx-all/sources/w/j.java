package w;

import d9.r;
import m0.n1;
import t.m;
import v.r1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f16008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f16009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r1 f16010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c9.c f16011e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(float f10, r rVar, r1 r1Var, c cVar, int i10) {
        super(1);
        this.f16007a = i10;
        this.f16008b = f10;
        this.f16009c = rVar;
        this.f16010d = r1Var;
        this.f16011e = cVar;
    }

    public final void a(m mVar) {
        int i10 = this.f16007a;
        c9.c cVar = this.f16011e;
        r1 r1Var = this.f16010d;
        r rVar = this.f16009c;
        float f10 = this.f16008b;
        switch (i10) {
            case 0:
                float fAbs = Math.abs(((Number) mVar.f14245e.getValue()).floatValue());
                float fAbs2 = Math.abs(f10);
                c9.a aVar = mVar.f14244d;
                n1 n1Var = mVar.f14249i;
                n1 n1Var2 = mVar.f14245e;
                if (fAbs < fAbs2) {
                    float fFloatValue = ((Number) n1Var2.getValue()).floatValue() - rVar.f4949a;
                    float fA = r1Var.a(fFloatValue);
                    cVar.invoke(Float.valueOf(fA));
                    if (Math.abs(fFloatValue - fA) > 0.5f) {
                        n1Var.setValue(Boolean.FALSE);
                        aVar.invoke();
                    }
                    rVar.f4949a = ((Number) n1Var2.getValue()).floatValue();
                } else {
                    float fC = l.c(((Number) n1Var2.getValue()).floatValue(), f10);
                    float f11 = fC - rVar.f4949a;
                    float fA2 = r1Var.a(f11);
                    cVar.invoke(Float.valueOf(fA2));
                    if (Math.abs(f11 - fA2) > 0.5f) {
                        n1Var.setValue(Boolean.FALSE);
                        aVar.invoke();
                    }
                    n1Var.setValue(Boolean.FALSE);
                    aVar.invoke();
                    rVar.f4949a = fC;
                }
                break;
            default:
                float fC2 = l.c(((Number) mVar.f14245e.getValue()).floatValue(), f10);
                float f12 = fC2 - rVar.f4949a;
                float fA3 = r1Var.a(f12);
                cVar.invoke(Float.valueOf(fA3));
                if (Math.abs(f12 - fA3) > 0.5f || fC2 != ((Number) mVar.f14245e.getValue()).floatValue()) {
                    mVar.f14249i.setValue(Boolean.FALSE);
                    mVar.f14244d.invoke();
                }
                rVar.f4949a += fA3;
                break;
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f16007a) {
            case 0:
                a((m) obj);
                break;
            default:
                a((m) obj);
                break;
        }
        return lVar;
    }
}
