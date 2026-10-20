package u1;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class g1 implements m0.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Choreographer f15096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f15097b;

    public g1(Choreographer choreographer, e1 e1Var) {
        this.f15096a = choreographer;
        this.f15097b = e1Var;
    }

    @Override // u8.j
    public final u8.j O(u8.j jVar) {
        d7.a.m(jVar, "context");
        return d7.a.A(this, jVar);
    }

    @Override // m0.a1
    public final Object T(c9.c cVar, u8.e eVar) {
        e1 e1Var = this.f15097b;
        if (e1Var == null) {
            u8.h hVarF = eVar.getContext().f(u8.f.f15436a);
            e1Var = hVarF instanceof e1 ? (e1) hVarF : null;
        }
        m9.l lVar = new m9.l(1, d7.t.b0(eVar));
        lVar.t();
        f1 f1Var = new f1(lVar, this, cVar);
        if (e1Var == null || !d7.a.d(e1Var.f15074c, this.f15096a)) {
            this.f15096a.postFrameCallback(f1Var);
            lVar.v(new u.s(22, this, f1Var));
        } else {
            synchronized (e1Var.f15076e) {
                e1Var.f15078n.add(f1Var);
                if (!e1Var.f15081q) {
                    e1Var.f15081q = true;
                    e1Var.f15074c.postFrameCallback(e1Var.f15082r);
                }
            }
            lVar.v(new u.s(21, e1Var, f1Var));
        }
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
