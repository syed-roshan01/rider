package w0;

import java.util.List;
import t.k1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    /* JADX WARN: Illegal instructions before constructor call */
    public b(int i10, n nVar) {
        c9.c xVar;
        synchronized (p.f16109b) {
            List list = p.f16115h;
            d7.a.m(list, "<this>");
            xVar = (c9.c) (list.size() == 1 ? list.get(0) : null);
            xVar = xVar == null ? new s.x(2, list) : xVar;
        }
        super(i10, nVar, null, xVar);
    }

    @Override // w0.c
    public final c A(c9.c cVar, c9.c cVar2) {
        return (c) ((i) p.e(new k1(5, new a(cVar, cVar2, 0))));
    }

    @Override // w0.c, w0.i
    public final void c() {
        synchronized (p.f16109b) {
            int i10 = this.f16072d;
            if (i10 >= 0) {
                p.s(i10);
                this.f16072d = -1;
            }
        }
    }

    @Override // w0.c, w0.i
    public final void k() {
        y.a();
        throw null;
    }

    @Override // w0.c, w0.i
    public final void l() {
        y.a();
        throw null;
    }

    @Override // w0.c, w0.i
    public final void m() {
        p.e(o.f16105b);
    }

    @Override // w0.c, w0.i
    public final i t(c9.c cVar) {
        return (i) p.e(new k1(5, new k1(4, cVar)));
    }

    @Override // w0.c
    public final y.a0 v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }
}
