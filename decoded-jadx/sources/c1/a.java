package c1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends y0.n implements c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c9.c f2873u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n f2874v;

    @Override // c1.c
    public final void a0(o oVar) {
        if (d7.a.d(this.f2874v, oVar)) {
            return;
        }
        this.f2874v = oVar;
        this.f2873u.invoke(oVar);
    }
}
