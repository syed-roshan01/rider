package v;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class t extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d9.r f15777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t.o f15778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f15780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f15781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f15782f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(float f10, u uVar, r1 r1Var, u8.e eVar) {
        super(2, eVar);
        this.f15780d = f10;
        this.f15781e = uVar;
        this.f15782f = r1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new t(this.f15780d, this.f15781e, this.f15782f, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        float f10;
        d9.r rVar;
        t.o oVar;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15779c;
        if (i10 == 0) {
            d7.t.v0(obj);
            f10 = this.f15780d;
            if (Math.abs(f10) > 1.0f) {
                rVar = new d9.r();
                rVar.f4949a = f10;
                d9.r rVar2 = new d9.r();
                t.o oVarB = t.e.b(0.0f, f10);
                try {
                    u uVar = this.f15781e;
                    t.y yVar = uVar.f15792a;
                    t.a aVar2 = new t.a(rVar2, this.f15782f, rVar, uVar, 2);
                    this.f15777a = rVar;
                    this.f15778b = oVarB;
                    this.f15779c = 1;
                    if (t.e.e(oVarB, yVar, false, aVar2, this) == aVar) {
                        return aVar;
                    }
                } catch (CancellationException unused) {
                    oVar = oVarB;
                    rVar.f4949a = ((Number) oVar.b()).floatValue();
                }
                f10 = rVar.f4949a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.f15778b;
            rVar = this.f15777a;
            try {
                d7.t.v0(obj);
            } catch (CancellationException unused2) {
                rVar.f4949a = ((Number) oVar.b()).floatValue();
            }
            f10 = rVar.f4949a;
        }
        return new Float(f10);
    }
}
