package w8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m9.l;
import m9.z;
import u8.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {
    private final j _context;
    private transient u8.e intercepted;

    public c(u8.e eVar, j jVar) {
        super(eVar);
        this._context = jVar;
    }

    @Override // u8.e
    public j getContext() {
        j jVar = this._context;
        d7.a.j(jVar);
        return jVar;
    }

    public final u8.e intercepted() {
        u8.e hVar = this.intercepted;
        if (hVar == null) {
            u8.g gVar = (u8.g) getContext().f(u8.f.f15436a);
            hVar = gVar != null ? new r9.h((z) gVar, this) : this;
            this.intercepted = hVar;
        }
        return hVar;
    }

    @Override // w8.a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u8.e eVar = this.intercepted;
        if (eVar != null && eVar != this) {
            u8.h hVarF = getContext().f(u8.f.f15436a);
            d7.a.j(hVarF);
            r9.h hVar = (r9.h) eVar;
            do {
                atomicReferenceFieldUpdater = r9.h.f13701o;
            } while (atomicReferenceFieldUpdater.get(hVar) == r9.a.f13691d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            l lVar = obj instanceof l ? (l) obj : null;
            if (lVar != null) {
                lVar.p();
            }
        }
        this.intercepted = b.f16256a;
    }

    public c(u8.e eVar) {
        this(eVar, eVar != null ? eVar.getContext() : null);
    }
}
