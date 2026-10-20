package l4;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f11317a;

    public l(e eVar) {
        this.f11317a = eVar;
    }

    public final m a() {
        g gVarF;
        e eVar = this.f11317a;
        j jVar = (j) eVar.f11283d;
        synchronized (jVar) {
            eVar.d(true);
            gVarF = jVar.f(((f) eVar.f11281b).f11284a);
        }
        if (gVarF != null) {
            return new m(gVarF);
        }
        return null;
    }
}
