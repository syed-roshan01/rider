package g8;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class i3 extends e8.j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6851b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3 f6853d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f6850a = new AtomicReference(l3.f6925h0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3 f6852c = new e3(this);

    public i3(l3 l3Var, String str) {
        this.f6853d = l3Var;
        y3.e.J(str, "authority");
        this.f6851b = str;
    }

    @Override // e8.j0
    public final String g() {
        return this.f6851b;
    }

    @Override // e8.j0
    public final e8.k m(e8.p1 p1Var, e8.h hVar) {
        AtomicReference atomicReference = this.f6850a;
        Object obj = atomicReference.get();
        t2 t2Var = l3.f6925h0;
        if (obj != t2Var) {
            return s(p1Var, hVar);
        }
        l3 l3Var = this.f6853d;
        l3Var.f6939m.execute(new f3(this, 2));
        if (atomicReference.get() != t2Var) {
            return s(p1Var, hVar);
        }
        if (l3Var.F.get()) {
            return new g3();
        }
        h3 h3Var = new h3(this, e8.b0.b(), p1Var, hVar);
        l3Var.f6939m.execute(new x1(22, this, h3Var));
        return h3Var;
    }

    public final e8.k s(e8.p1 p1Var, e8.h hVar) {
        e8.o0 o0Var = (e8.o0) this.f6850a.get();
        e3 e3Var = this.f6852c;
        if (o0Var == null) {
            return e3Var.m(p1Var, hVar);
        }
        if (!(o0Var instanceof r3)) {
            return new z2(o0Var, e3Var, this.f6853d.f6934h, p1Var, hVar);
        }
        s3 s3Var = ((r3) o0Var).f7074b;
        s3Var.getClass();
        q3 q3Var = (q3) s3Var.f7104b.get(p1Var.f5334b);
        if (q3Var == null) {
            q3Var = (q3) s3Var.f7105c.get(p1Var.f5335c);
        }
        if (q3Var == null) {
            q3Var = s3Var.f7103a;
        }
        if (q3Var != null) {
            hVar = hVar.c(q3.f7054g, q3Var);
        }
        return e3Var.m(p1Var, hVar);
    }

    public final void t(e8.o0 o0Var) {
        Collection collection;
        AtomicReference atomicReference = this.f6850a;
        e8.o0 o0Var2 = (e8.o0) atomicReference.get();
        atomicReference.set(o0Var);
        if (o0Var2 != l3.f6925h0 || (collection = this.f6853d.A) == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((h3) it.next()).d();
        }
    }
}
