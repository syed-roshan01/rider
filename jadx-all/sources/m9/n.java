package m9;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class n extends h1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f11975e;

    public n(l lVar) {
        this.f11975e = lVar;
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        n((Throwable) obj);
        return q8.l.f13235a;
    }

    @Override // m9.j1
    public final void n(Throwable th) throws IllegalAccessException, InvocationTargetException {
        p1 p1VarM = m();
        l lVar = this.f11975e;
        Throwable thR = lVar.r(p1VarM);
        if (lVar.z()) {
            u8.e eVar = lVar.f11961d;
            d7.a.k(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            r9.h hVar = (r9.h) eVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r9.h.f13701o;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                i3.u uVar = r9.a.f13691d;
                if (d7.a.d(obj, uVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, uVar, thR)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != uVar) {
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(hVar) == obj);
                }
            }
        }
        lVar.l(thR);
        if (lVar.z()) {
            return;
        }
        lVar.p();
    }
}
