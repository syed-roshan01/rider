package s;

import t.o1;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f13823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f13824c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(q0 q0Var, r0 r0Var, int i10) {
        super(1);
        this.f13822a = i10;
        this.f13823b = q0Var;
        this.f13824c = r0Var;
    }

    public final Float a(j0 j0Var) {
        int i10 = this.f13822a;
        q0 q0Var = this.f13823b;
        r0 r0Var = this.f13824c;
        float f10 = 1.0f;
        switch (i10) {
            case 1:
                int iOrdinal = j0Var.ordinal();
                if (iOrdinal == 0) {
                    s0 s0Var = q0Var.f13858a.f13754a;
                    if (s0Var != null) {
                        f10 = s0Var.f13863a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new androidx.fragment.app.a0();
                    }
                    s0 s0Var2 = r0Var.f13861a.f13754a;
                    if (s0Var2 != null) {
                        f10 = s0Var2.f13863a;
                    }
                }
                return Float.valueOf(f10);
            default:
                int iOrdinal2 = j0Var.ordinal();
                if (iOrdinal2 == 0) {
                    w0 w0Var = q0Var.f13858a.f13755b;
                    if (w0Var != null) {
                        f10 = w0Var.f13884a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new androidx.fragment.app.a0();
                    }
                    w0 w0Var2 = r0Var.f13861a.f13755b;
                    if (w0Var2 != null) {
                        f10 = w0Var2.f13884a;
                    }
                }
                return Float.valueOf(f10);
        }
    }

    public final t.e0 b(o1 o1Var) {
        t.e0 e0Var;
        t.e0 e0Var2;
        t.e0 e0Var3;
        t.e0 e0Var4;
        j0 j0Var = j0.f13803c;
        j0 j0Var2 = j0.f13802b;
        j0 j0Var3 = j0.f13801a;
        int i10 = this.f13822a;
        r0 r0Var = this.f13824c;
        q0 q0Var = this.f13823b;
        switch (i10) {
            case 0:
                if (o1Var.b(j0Var3, j0Var2)) {
                    s0 s0Var = q0Var.f13858a.f13754a;
                    return (s0Var == null || (e0Var2 = s0Var.f13864b) == null) ? androidx.compose.animation.a.f1593b : e0Var2;
                }
                if (!o1Var.b(j0Var2, j0Var)) {
                    return androidx.compose.animation.a.f1593b;
                }
                s0 s0Var2 = r0Var.f13861a.f13754a;
                return (s0Var2 == null || (e0Var = s0Var2.f13864b) == null) ? androidx.compose.animation.a.f1593b : e0Var;
            default:
                if (o1Var.b(j0Var3, j0Var2)) {
                    w0 w0Var = q0Var.f13858a.f13755b;
                    return (w0Var == null || (e0Var4 = w0Var.f13886c) == null) ? androidx.compose.animation.a.f1593b : e0Var4;
                }
                if (!o1Var.b(j0Var2, j0Var)) {
                    return androidx.compose.animation.a.f1593b;
                }
                w0 w0Var2 = r0Var.f13861a.f13755b;
                return (w0Var2 == null || (e0Var3 = w0Var2.f13886c) == null) ? androidx.compose.animation.a.f1593b : e0Var3;
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f13822a) {
            case 0:
                return b((o1) obj);
            case 1:
                return a((j0) obj);
            case 2:
                return b((o1) obj);
            default:
                return a((j0) obj);
        }
    }
}
