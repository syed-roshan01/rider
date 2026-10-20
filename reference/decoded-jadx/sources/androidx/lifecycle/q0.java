package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f2176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2177c;

    public q0(String str, p0 p0Var) {
        this.f2175a = str;
        this.f2176b = p0Var;
    }

    public final void a(r rVar, b4.e eVar) {
        d7.a.m(eVar, "registry");
        d7.a.m(rVar, "lifecycle");
        if (!(!this.f2177c)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f2177c = true;
        rVar.a(this);
        eVar.d(this.f2175a, this.f2176b.f2168e);
    }

    @Override // androidx.lifecycle.u
    public final void onStateChanged(w wVar, p pVar) {
        if (pVar == p.ON_DESTROY) {
            this.f2177c = false;
            wVar.getLifecycle().c(this);
        }
    }
}
