package s;

import t.d1;
import t.o1;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f13849b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(p0 p0Var, int i10) {
        super(1);
        this.f13848a = i10;
        this.f13849b = p0Var;
    }

    public final t.e0 a(o1 o1Var) {
        j0 j0Var = j0.f13803c;
        j0 j0Var2 = j0.f13802b;
        j0 j0Var3 = j0.f13801a;
        int i10 = this.f13848a;
        p0 p0Var = this.f13849b;
        switch (i10) {
            case 0:
                d1 d1Var = null;
                if (o1Var.b(j0Var3, j0Var2)) {
                    p0Var.f13855y.f13858a.getClass();
                } else if (o1Var.b(j0Var2, j0Var)) {
                    p0Var.f13856z.f13861a.getClass();
                } else {
                    d1Var = androidx.compose.animation.a.f1595d;
                }
                return d1Var == null ? androidx.compose.animation.a.f1595d : d1Var;
            default:
                if (o1Var.b(j0Var3, j0Var2)) {
                    p0Var.f13855y.f13858a.getClass();
                    return androidx.compose.animation.a.f1594c;
                }
                if (!o1Var.b(j0Var2, j0Var)) {
                    return androidx.compose.animation.a.f1594c;
                }
                p0Var.f13856z.f13861a.getClass();
                return androidx.compose.animation.a.f1594c;
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f13848a) {
            case 0:
                break;
        }
        return a((o1) obj);
    }
}
