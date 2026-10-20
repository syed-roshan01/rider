package o9;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import m9.g1;
import m9.m1;

/* JADX INFO: loaded from: classes.dex */
public final class q extends m9.a implements r, g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f12722d;

    public q(u8.j jVar, c cVar) {
        super(jVar, true);
        this.f12722d = cVar;
    }

    @Override // m9.p1
    public final void A(CancellationException cancellationException) {
        this.f12722d.a(cancellationException);
        z(cancellationException);
    }

    @Override // m9.p1, m9.f1
    public final void a(CancellationException cancellationException) {
        Object objN = N();
        if (objN instanceof m9.u) {
            return;
        }
        if ((objN instanceof m1) && ((m1) objN).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new g1(C(), null, this);
        }
        A(cancellationException);
    }

    @Override // m9.a, m9.p1, m9.f1
    public final boolean b() {
        return super.b();
    }

    @Override // o9.t
    public final void c(h1.b bVar) {
        this.f12722d.c(bVar);
    }

    @Override // o9.t
    public final Object h(Object obj, u8.e eVar) {
        return this.f12722d.h(obj, eVar);
    }

    @Override // o9.s
    public final Object i(w8.i iVar) {
        return this.f12722d.i(iVar);
    }

    @Override // m9.a
    public final void i0(Throwable th, boolean z10) throws IllegalAccessException, InvocationTargetException {
        if (this.f12722d.j(th) || z10) {
            return;
        }
        h6.g.n0(this.f11900c, th);
    }

    @Override // o9.s
    public final b iterator() {
        return this.f12722d.iterator();
    }

    @Override // o9.t
    public final boolean j(Throwable th) {
        return this.f12722d.j(th);
    }

    @Override // m9.a
    public final void j0(Object obj) {
        this.f12722d.j(null);
    }

    @Override // o9.s
    public final Object m() {
        return this.f12722d.m();
    }

    @Override // o9.t
    public final Object n(Object obj) {
        return this.f12722d.n(obj);
    }

    @Override // o9.t
    public final boolean r() {
        return this.f12722d.r();
    }
}
