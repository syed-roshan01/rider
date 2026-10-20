package b0;

import r1.a1;
import v.r1;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f2390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f2391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, float f10, int i10, u8.e eVar) {
        super(2, eVar);
        this.f2390b = h0Var;
        this.f2391c = f10;
        this.f2392d = i10;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new g0(this.f2390b, this.f2391c, this.f2392d, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((r1) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f2389a;
        q8.l lVar = q8.l.f13235a;
        h0 h0Var = this.f2390b;
        if (i10 == 0) {
            d7.t.v0(obj);
            this.f2389a = 1;
            Object objL = h0Var.f2415w.l(this);
            if (objL != aVar) {
                objL = lVar;
            }
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7.t.v0(obj);
        }
        float f10 = this.f2391c;
        double d10 = f10;
        if (-0.5d > d10 || d10 > 0.5d) {
            throw new IllegalArgumentException(("pageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5").toString());
        }
        int i11 = h0Var.i(this.f2392d);
        a0 a0Var = h0Var.f2397e;
        a0Var.f2318b.f(i11);
        a0Var.f2322f.b(i11);
        if (Math.abs(f10) == 0.0f) {
            f10 = 0.0f;
        }
        a0Var.f2319c.f(f10);
        a0Var.f2321e = null;
        a1 a1Var = (a1) h0Var.f2416x.getValue();
        if (a1Var != null) {
            ((androidx.compose.ui.node.a) a1Var).j();
        }
        return lVar;
    }
}
