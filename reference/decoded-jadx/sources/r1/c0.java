package r1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends t1.f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f13349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.e f13350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, c9.e eVar, String str) {
        super(str);
        this.f13349b = f0Var;
        this.f13350c = eVar;
    }

    @Override // r1.j0
    public final k0 e(l0 l0Var, List list, long j10) {
        f0 f0Var = this.f13349b;
        f0Var.f13366o.f13338a = l0Var.getLayoutDirection();
        float fC = l0Var.c();
        a0 a0Var = f0Var.f13366o;
        a0Var.f13339b = fC;
        a0Var.f13340c = l0Var.m();
        boolean zQ = l0Var.q();
        c9.e eVar = this.f13350c;
        if (zQ || f0Var.f13359a.f1738c == null) {
            f0Var.f13362d = 0;
            k0 k0Var = (k0) eVar.invoke(a0Var, new m2.a(j10));
            return new b0(k0Var, f0Var, f0Var.f13362d, k0Var, 1);
        }
        f0Var.f13363e = 0;
        k0 k0Var2 = (k0) eVar.invoke(f0Var.f13367p, new m2.a(j10));
        return new b0(k0Var2, f0Var, f0Var.f13363e, k0Var2, 0);
    }
}
