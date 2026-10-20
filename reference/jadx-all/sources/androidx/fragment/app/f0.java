package androidx.fragment.app;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends m0 implements r2.n, r2.o, q2.o0, q2.p0, androidx.lifecycle.g1, androidx.activity.k0, d.j, b4.g, c1, b3.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f1906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var) {
        super(g0Var);
        this.f1906e = g0Var;
    }

    @Override // androidx.fragment.app.c1
    public final void a(d0 d0Var) {
        this.f1906e.onAttachFragment(d0Var);
    }

    @Override // b3.i
    public final void addMenuProvider(b3.o oVar) {
        this.f1906e.addMenuProvider(oVar);
    }

    @Override // r2.n
    public final void addOnConfigurationChangedListener(a3.a aVar) {
        this.f1906e.addOnConfigurationChangedListener(aVar);
    }

    @Override // q2.o0
    public final void addOnMultiWindowModeChangedListener(a3.a aVar) {
        this.f1906e.addOnMultiWindowModeChangedListener(aVar);
    }

    @Override // q2.p0
    public final void addOnPictureInPictureModeChangedListener(a3.a aVar) {
        this.f1906e.addOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // r2.o
    public final void addOnTrimMemoryListener(a3.a aVar) {
        this.f1906e.addOnTrimMemoryListener(aVar);
    }

    @Override // androidx.fragment.app.j0
    public final View b(int i10) {
        return this.f1906e.findViewById(i10);
    }

    @Override // androidx.fragment.app.j0
    public final boolean c() {
        Window window = this.f1906e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // d.j
    public final d.i getActivityResultRegistry() {
        return this.f1906e.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.w
    public final androidx.lifecycle.r getLifecycle() {
        return this.f1906e.mFragmentLifecycleRegistry;
    }

    @Override // androidx.activity.k0
    public final androidx.activity.i0 getOnBackPressedDispatcher() {
        return this.f1906e.getOnBackPressedDispatcher();
    }

    @Override // b4.g
    public final b4.e getSavedStateRegistry() {
        return this.f1906e.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.g1
    public final androidx.lifecycle.f1 getViewModelStore() {
        return this.f1906e.getViewModelStore();
    }

    @Override // b3.i
    public final void removeMenuProvider(b3.o oVar) {
        this.f1906e.removeMenuProvider(oVar);
    }

    @Override // r2.n
    public final void removeOnConfigurationChangedListener(a3.a aVar) {
        this.f1906e.removeOnConfigurationChangedListener(aVar);
    }

    @Override // q2.o0
    public final void removeOnMultiWindowModeChangedListener(a3.a aVar) {
        this.f1906e.removeOnMultiWindowModeChangedListener(aVar);
    }

    @Override // q2.p0
    public final void removeOnPictureInPictureModeChangedListener(a3.a aVar) {
        this.f1906e.removeOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // r2.o
    public final void removeOnTrimMemoryListener(a3.a aVar) {
        this.f1906e.removeOnTrimMemoryListener(aVar);
    }
}
