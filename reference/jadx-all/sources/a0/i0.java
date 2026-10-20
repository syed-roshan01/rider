package a0;

import v.f2;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f812b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(h0 h0Var, int i10) {
        super(0);
        this.f811a = i10;
        this.f812b = h0Var;
    }

    public final Float a() {
        boolean zD;
        int i10 = this.f811a;
        h0 h0Var = this.f812b;
        switch (i10) {
            case 0:
                return Float.valueOf(h0Var.a());
            default:
                h0Var.getClass();
                z.d dVar = (z.d) h0Var;
                int i11 = dVar.f17028a;
                f2 f2Var = dVar.f17030c;
                switch (i11) {
                    case 0:
                        zD = ((z.g0) f2Var).d();
                        break;
                    default:
                        zD = ((b0.h0) f2Var).d();
                        break;
                }
                return Float.valueOf(zD ? h0Var.a() + 100 : h0Var.a());
        }
    }

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f811a) {
            case 0:
                break;
        }
        return a();
    }
}
