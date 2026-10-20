package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class t extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f2031a;

    public t(d0 d0Var) {
        this.f2031a = d0Var;
    }

    @Override // androidx.fragment.app.b0
    public final void a() {
        d0 d0Var = this.f2031a;
        d0Var.mSavedStateRegistryController.a();
        androidx.lifecycle.s0.c(d0Var);
    }
}
