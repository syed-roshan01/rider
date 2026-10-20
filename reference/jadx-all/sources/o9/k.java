package o9;

import androidx.fragment.app.a0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import m9.i2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends r9.t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f12712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f12713f;

    public k(long j10, k kVar, c cVar, int i10) {
        super(j10, kVar, i10);
        this.f12712e = cVar;
        this.f12713f = new AtomicReferenceArray(e.f12688b * 2);
    }

    @Override // r9.t
    public final int f() {
        return e.f12688b;
    }

    @Override // r9.t
    public final void g(int i10, u8.j jVar) throws IllegalAccessException, InvocationTargetException {
        c cVar;
        a0 a0VarG;
        a0 a0VarG2;
        int i11 = e.f12688b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        Object obj = this.f12713f.get(i10 * 2);
        while (true) {
            Object objK = k(i10);
            boolean z11 = objK instanceof i2;
            cVar = this.f12712e;
            if (z11 || (objK instanceof u)) {
                if (j(i10, objK, z10 ? e.f12696j : e.f12697k)) {
                    m(i10, null);
                    l(i10, !z10);
                    if (z10) {
                        d7.a.j(cVar);
                        c9.c cVar2 = cVar.f12685b;
                        if (cVar2 == null || (a0VarG = d7.a.g(cVar2, obj, null)) == null) {
                            return;
                        }
                        h6.g.n0(jVar, a0VarG);
                        return;
                    }
                    return;
                }
            } else {
                if (objK == e.f12696j || objK == e.f12697k) {
                    break;
                }
                if (objK != e.f12693g && objK != e.f12692f) {
                    if (objK == e.f12695i || objK == e.f12690d || objK == e.f12698l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objK).toString());
                }
            }
        }
        m(i10, null);
        if (z10) {
            d7.a.j(cVar);
            c9.c cVar3 = cVar.f12685b;
            if (cVar3 == null || (a0VarG2 = d7.a.g(cVar3, obj, null)) == null) {
                return;
            }
            h6.g.n0(jVar, a0VarG2);
        }
    }

    public final boolean j(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f12713f;
        int i11 = (i10 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
            if (atomicReferenceArray.get(i11) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i10) {
        return this.f12713f.get((i10 * 2) + 1);
    }

    public final void l(int i10, boolean z10) {
        if (z10) {
            c cVar = this.f12712e;
            d7.a.j(cVar);
            cVar.G((this.f13728c * ((long) e.f12688b)) + ((long) i10));
        }
        h();
    }

    public final void m(int i10, Object obj) {
        this.f12713f.lazySet(i10 * 2, obj);
    }

    public final void n(int i10, i3.u uVar) {
        this.f12713f.set((i10 * 2) + 1, uVar);
    }
}
