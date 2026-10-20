package h0;

import f0.d2;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g2.a0 f7454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d2 f7455i;

    public r0(g2.a0 a0Var, g2.s sVar, d2 d2Var, a1 a1Var) {
        super(a0Var.f6509a, a0Var.f6510b, d2Var != null ? d2Var.f5667a : null, sVar, a1Var);
        this.f7454h = a0Var;
        this.f7455i = d2Var;
    }

    public final List n(f0.j jVar) {
        if (!a2.b0.b(this.f7397f)) {
            return d7.t.e0(new g2.a("", 0), new g2.z(a2.b0.e(this.f7397f), a2.b0.e(this.f7397f)));
        }
        g2.i iVar = (g2.i) jVar.invoke(this);
        if (iVar != null) {
            return d7.t.d0(iVar);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public final int o(d2 d2Var, int i10) {
        d1.d dVarB;
        r1.s sVar = d2Var.f5668b;
        if (sVar == null) {
            dVarB = d1.d.f4331e;
        } else {
            r1.s sVar2 = d2Var.f5669c;
            dVarB = sVar2 != null ? sVar2.b(sVar, true) : null;
            if (dVarB == null) {
                dVarB = d1.d.f4331e;
            }
        }
        long j10 = this.f7454h.f6510b;
        int i11 = a2.b0.f904c;
        g2.s sVar3 = this.f7395d;
        int iB = sVar3.b((int) (j10 & 4294967295L));
        a2.a0 a0Var = d2Var.f5667a;
        d1.d dVarC = a0Var.c(iB);
        return sVar3.a(a0Var.l(d9.i.f(dVarC.f4332a, (d1.f.b(d7.t.j(dVarB.c(), dVarB.b())) * i10) + dVarC.f4333b)));
    }
}
