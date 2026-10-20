package m9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class j1 extends r9.j implements o0, b1, c9.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p1 f11954d;

    @Override // m9.o0
    public final void a() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        p1 p1VarM = m();
        while (true) {
            Object objN = p1VarM.N();
            if (objN instanceof j1) {
                if (objN != this) {
                    return;
                }
                q0 q0Var = e0.f11933j;
                do {
                    atomicReferenceFieldUpdater2 = p1.f11989a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(p1VarM, objN, q0Var)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(p1VarM) == objN);
            } else {
                if (!(objN instanceof b1) || ((b1) objN).f() == null) {
                    return;
                }
                while (true) {
                    Object objJ = j();
                    if (objJ instanceof r9.q) {
                        r9.j jVar = ((r9.q) objJ).f13725a;
                        return;
                    }
                    if (objJ == this) {
                        return;
                    }
                    d7.a.k(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    r9.j jVar2 = (r9.j) objJ;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = r9.j.f13714c;
                    r9.q qVar = (r9.q) atomicReferenceFieldUpdater3.get(jVar2);
                    if (qVar == null) {
                        qVar = new r9.q(jVar2);
                        atomicReferenceFieldUpdater3.lazySet(jVar2, qVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = r9.j.f13712a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, objJ, qVar)) {
                            jVar2.h();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == objJ);
                }
            }
        }
    }

    @Override // m9.b1
    public final boolean b() {
        return true;
    }

    @Override // m9.b1
    public final t1 f() {
        return null;
    }

    public f1 getParent() {
        return m();
    }

    public final p1 m() {
        p1 p1Var = this.f11954d;
        if (p1Var != null) {
            return p1Var;
        }
        d7.a.D("job");
        throw null;
    }

    public abstract void n(Throwable th);

    @Override // r9.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + e0.z(this) + "[job@" + e0.z(m()) + ']';
    }
}
