package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class w implements o.a, x2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2042a;

    public /* synthetic */ w(Object obj) {
        this.f2042a = obj;
    }

    @Override // o.a
    public final Object apply(Object obj) {
        d0 d0Var = (d0) this.f2042a;
        Object obj2 = d0Var.mHost;
        return obj2 instanceof d.j ? ((d.j) obj2).getActivityResultRegistry() : d0Var.requireActivity().getActivityResultRegistry();
    }

    @Override // x2.f
    public final void c() {
        ((s1) this.f2042a).a();
    }
}
