package s;

import m0.l3;
import t.o1;

/* JADX INFO: loaded from: classes.dex */
public final class u extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i10, Object obj, Object obj2) {
        super(1);
        this.f13871a = i10;
        this.f13872b = obj;
        this.f13873c = obj2;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10 = this.f13871a;
        Object obj2 = this.f13873c;
        Object obj3 = this.f13872b;
        switch (i10) {
            case 0:
                o1 o1Var = (o1) obj;
                w wVar = (w) obj3;
                l3 l3Var = (l3) wVar.f13883d.get(o1Var.a());
                long j10 = l3Var != null ? ((m2.k) l3Var.getValue()).f11814a : 0L;
                l3 l3Var2 = (l3) wVar.f13883d.get(o1Var.c());
                long j11 = l3Var2 != null ? ((m2.k) l3Var2.getValue()).f11814a : 0L;
                y0 y0Var = (y0) ((v) obj2).f13877c.getValue();
                if (y0Var != null) {
                    t.e0 e0Var = (t.e0) y0Var.f13892b.invoke(new m2.k(j10), new m2.k(j11));
                    if (e0Var != null) {
                        return e0Var;
                    }
                }
                return t.e.r(0.0f, null, 7);
            default:
                float fD = ((i0) obj2).f13795c.d();
                ((r1.w0) obj).getClass();
                r1.w0.c((r1.x0) obj3, 0, 0, fD);
                return q8.l.f13235a;
        }
    }
}
