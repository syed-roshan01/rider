package i1;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c9.c f7751a;

    public abstract void a(g1.g gVar);

    public c9.c b() {
        return this.f7751a;
    }

    public final void c() {
        c9.c cVarB = b();
        if (cVarB != null) {
            cVarB.invoke(this);
        }
    }

    public void d(h1.b bVar) {
        this.f7751a = bVar;
    }
}
