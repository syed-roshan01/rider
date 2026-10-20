package m9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends r9.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r9.j f11977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r9.j f11978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f11979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11980e;

    public n1(r9.j jVar, p1 p1Var, Object obj) {
        this.f11979d = p1Var;
        this.f11980e = obj;
        this.f11977b = jVar;
    }

    @Override // r9.b
    public final void b(Object obj, Object obj2) {
        r9.j jVar = (r9.j) obj;
        boolean z10 = obj2 == null;
        r9.j jVar2 = this.f11977b;
        r9.j jVar3 = z10 ? jVar2 : this.f11978c;
        if (jVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r9.j.f13712a;
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, this, jVar3)) {
                if (atomicReferenceFieldUpdater.get(jVar) != this) {
                    return;
                }
            }
            if (z10) {
                r9.j jVar4 = this.f11978c;
                d7.a.j(jVar4);
                jVar2.i(jVar4);
            }
        }
    }

    @Override // r9.b
    public final i3.u c(Object obj) {
        if (this.f11979d.N() == this.f11980e) {
            return null;
        }
        return r9.a.f13692e;
    }
}
