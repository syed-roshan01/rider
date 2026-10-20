package androidx.fragment.app;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class u extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f2038a;

    public u(d0 d0Var) {
        this.f2038a = d0Var;
    }

    @Override // androidx.fragment.app.j0
    public final View b(int i10) {
        d0 d0Var = this.f2038a;
        View view = d0Var.mView;
        if (view != null) {
            return view.findViewById(i10);
        }
        throw new IllegalStateException(a7.a.m("Fragment ", d0Var, " does not have a view"));
    }

    @Override // androidx.fragment.app.j0
    public final boolean c() {
        return this.f2038a.mView != null;
    }
}
