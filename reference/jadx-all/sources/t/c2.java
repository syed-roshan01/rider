package t;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c2 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f14104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f14105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f14106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f14107d;

    public c2(a4.c0 c0Var) {
        this.f14104a = c0Var;
    }

    @Override // t.z1
    public final long b(t tVar, t tVar2, t tVar3) {
        Iterator it = z6.a.s0(0, tVar.b()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iB = ((i9.f) it).b();
            jMax = Math.max(jMax, ((a4.c0) this.f14104a).g(iB).d(tVar.a(iB), tVar2.a(iB), tVar3.a(iB)));
        }
        return jMax;
    }

    @Override // t.z1
    public final t c(long j10, t tVar, t tVar2, t tVar3) {
        if (this.f14106c == null) {
            t tVarC = tVar3.c();
            d7.a.k(tVarC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f14106c = tVarC;
        }
        t tVar4 = this.f14106c;
        if (tVar4 == null) {
            d7.a.D("velocityVector");
            throw null;
        }
        int iB = tVar4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            t tVar5 = this.f14106c;
            if (tVar5 == null) {
                d7.a.D("velocityVector");
                throw null;
            }
            tVar5.e(i10, ((a4.c0) this.f14104a).g(i10).c(j10, tVar.a(i10), tVar2.a(i10), tVar3.a(i10)));
        }
        t tVar6 = this.f14106c;
        if (tVar6 != null) {
            return tVar6;
        }
        d7.a.D("velocityVector");
        throw null;
    }

    @Override // t.z1
    public final t d(long j10, t tVar, t tVar2, t tVar3) {
        if (this.f14105b == null) {
            t tVarC = tVar.c();
            d7.a.k(tVarC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f14105b = tVarC;
        }
        t tVar4 = this.f14105b;
        if (tVar4 == null) {
            d7.a.D("valueVector");
            throw null;
        }
        int iB = tVar4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            t tVar5 = this.f14105b;
            if (tVar5 == null) {
                d7.a.D("valueVector");
                throw null;
            }
            tVar5.e(i10, ((a4.c0) this.f14104a).g(i10).b(j10, tVar.a(i10), tVar2.a(i10), tVar3.a(i10)));
        }
        t tVar6 = this.f14105b;
        if (tVar6 != null) {
            return tVar6;
        }
        d7.a.D("valueVector");
        throw null;
    }

    @Override // t.z1
    public final t g(t tVar, t tVar2, t tVar3) {
        if (this.f14107d == null) {
            t tVarC = tVar3.c();
            d7.a.k(tVarC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f14107d = tVarC;
        }
        t tVar4 = this.f14107d;
        if (tVar4 == null) {
            d7.a.D("endVelocityVector");
            throw null;
        }
        int iB = tVar4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            t tVar5 = this.f14107d;
            if (tVar5 == null) {
                d7.a.D("endVelocityVector");
                throw null;
            }
            tVar5.e(i10, ((a4.c0) this.f14104a).g(i10).e(tVar.a(i10), tVar2.a(i10), tVar3.a(i10)));
        }
        t tVar6 = this.f14107d;
        if (tVar6 != null) {
            return tVar6;
        }
        d7.a.D("endVelocityVector");
        throw null;
    }

    public c2(f0 f0Var) {
        this(new a4.c0(f0Var));
    }
}
