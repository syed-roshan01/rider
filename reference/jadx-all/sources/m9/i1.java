package m9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class i1 extends p1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11953c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(f1 f1Var) {
        super(true);
        boolean z10 = true;
        S(f1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p1.f11990b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        p pVar = oVar instanceof p ? (p) oVar : null;
        if (pVar == null) {
            z10 = false;
            break;
        }
        p1 p1VarM = pVar.m();
        while (!p1VarM.K()) {
            o oVar2 = (o) atomicReferenceFieldUpdater.get(p1VarM);
            p pVar2 = oVar2 instanceof p ? (p) oVar2 : null;
            if (pVar2 == null) {
                z10 = false;
                break;
            }
            p1VarM = pVar2.m();
        }
        this.f11953c = z10;
    }

    @Override // m9.p1
    public final boolean K() {
        return this.f11953c;
    }

    @Override // m9.p1
    public final boolean L() {
        return true;
    }
}
