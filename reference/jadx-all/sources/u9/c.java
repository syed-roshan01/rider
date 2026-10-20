package u9;

import i3.u;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m9.i2;
import m9.l;
import m9.z;
import r9.t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements m9.k, i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f15444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f15446c;

    public c(d dVar, l lVar, Object obj) {
        this.f15446c = dVar;
        this.f15444a = lVar;
        this.f15445b = obj;
    }

    @Override // m9.i2
    public final void a(t tVar, int i10) throws IllegalAccessException, InvocationTargetException {
        this.f15444a.a(tVar, i10);
    }

    @Override // m9.k
    public final boolean b() {
        return this.f15444a.b();
    }

    @Override // m9.k
    public final void d(z zVar) throws IllegalAccessException, InvocationTargetException {
        this.f15444a.d(zVar);
    }

    @Override // u8.e
    public final u8.j getContext() {
        return this.f15444a.f11962e;
    }

    @Override // m9.k
    public final u k(Object obj, c9.c cVar) {
        d dVar = this.f15446c;
        b bVar = new b(dVar, this, 1);
        u uVarF = this.f15444a.F((q8.l) obj, bVar);
        if (uVarF != null) {
            d.f15447h.set(dVar, this.f15445b);
        }
        return uVarF;
    }

    @Override // m9.k
    public final boolean l(Throwable th) {
        return this.f15444a.l(th);
    }

    @Override // m9.k
    public final void o(c9.c cVar, Object obj) throws IllegalAccessException, InvocationTargetException {
        q8.l lVar = q8.l.f13235a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f15447h;
        Object obj2 = this.f15445b;
        d dVar = this.f15446c;
        atomicReferenceFieldUpdater.set(dVar, obj2);
        this.f15444a.o(new b(dVar, this, 0), lVar);
    }

    @Override // u8.e
    public final void resumeWith(Object obj) throws IllegalAccessException, InvocationTargetException {
        this.f15444a.resumeWith(obj);
    }

    @Override // m9.k
    public final u w(Throwable th) {
        return this.f15444a.w(th);
    }

    @Override // m9.k
    public final void x(Object obj) {
        this.f15444a.x(obj);
    }
}
