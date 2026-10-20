package b;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d.d f2288a;

    public final void a(Object obj) {
        q8.l lVar;
        d.d dVar = this.f2288a;
        if (dVar != null) {
            dVar.a(obj);
            lVar = q8.l.f13235a;
        } else {
            lVar = null;
        }
        if (lVar == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }
}
