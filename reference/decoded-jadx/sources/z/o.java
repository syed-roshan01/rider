package z;

import h0.k0;
import m0.l3;

/* JADX INFO: loaded from: classes.dex */
public final class o extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3 f17097b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(l3 l3Var, int i10) {
        super(0);
        this.f17096a = i10;
        this.f17097b = l3Var;
    }

    @Override // c9.a
    public final Object invoke() {
        long j10;
        long j11;
        int i10 = this.f17096a;
        l3 l3Var = this.f17097b;
        switch (i10) {
            case 0:
                return new g((c9.c) l3Var.getValue());
            case 1:
                return (a0.s) ((c9.a) l3Var.getValue()).invoke();
            case 2:
                return Boolean.valueOf(((Boolean) l3Var.getValue()).booleanValue());
            case 3:
                switch (i10) {
                    case 3:
                        j10 = ((d1.c) l3Var.getValue()).f4330a;
                        break;
                    default:
                        t.q qVar = k0.f7420a;
                        j10 = ((d1.c) l3Var.getValue()).f4330a;
                        break;
                }
                return new d1.c(j10);
            default:
                switch (i10) {
                    case 3:
                        j11 = ((d1.c) l3Var.getValue()).f4330a;
                        break;
                    default:
                        t.q qVar2 = k0.f7420a;
                        j11 = ((d1.c) l3Var.getValue()).f4330a;
                        break;
                }
                return new d1.c(j11);
        }
    }
}
