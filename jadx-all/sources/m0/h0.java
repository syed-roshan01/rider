package m0;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Choreographer f11551a;

    static {
        t9.d dVar = m9.m0.f11969a;
        f11551a = (Choreographer) z6.a.d0(((n9.d) r9.o.f13724a).f12323f, new f0(2, null));
    }

    @Override // u8.j
    public final u8.j O(u8.j jVar) {
        d7.a.m(jVar, "context");
        return d7.a.A(this, jVar);
    }

    @Override // m0.a1
    public final Object T(c9.c cVar, u8.e eVar) {
        m9.l lVar = new m9.l(1, d7.t.b0(eVar));
        lVar.t();
        g0 g0Var = new g0(lVar, cVar);
        f11551a.postFrameCallback(g0Var);
        lVar.v(new q.w(g0Var, 23));
        Object objS = lVar.s();
        v8.a aVar = v8.a.f15963a;
        return objS;
    }

    @Override // u8.j
    public final Object e(Object obj, c9.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // u8.j
    public final u8.h f(u8.i iVar) {
        return z6.a.D(this, iVar);
    }

    @Override // u8.j
    public final u8.j u(u8.i iVar) {
        return z6.a.V(this, iVar);
    }
}
