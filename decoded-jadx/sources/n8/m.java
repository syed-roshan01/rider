package n8;

import e8.l1;

/* JADX INFO: loaded from: classes.dex */
public final class m extends e8.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f12287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.n f12288b;

    public m(g gVar, e8.n nVar) {
        this.f12287a = gVar;
        this.f12288b = nVar;
    }

    @Override // e8.n
    public final e8.p a(e8.o oVar, l1 l1Var) {
        e8.n nVar = this.f12288b;
        return nVar != null ? new k(this, nVar.a(oVar, l1Var)) : new l(this);
    }
}
