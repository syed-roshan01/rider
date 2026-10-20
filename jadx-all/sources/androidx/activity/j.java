package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class j implements androidx.lifecycle.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f1402b;

    public /* synthetic */ j(p pVar, int i10) {
        this.f1401a = i10;
        this.f1402b = pVar;
    }

    @Override // androidx.lifecycle.u
    public final void onStateChanged(androidx.lifecycle.w wVar, androidx.lifecycle.p pVar) {
        switch (this.f1401a) {
            case 0:
                if (pVar == androidx.lifecycle.p.ON_DESTROY) {
                    this.f1402b.mContextAwareHelper.f2841b = null;
                    if (!this.f1402b.isChangingConfigurations()) {
                        this.f1402b.getViewModelStore().a();
                    }
                    ((o) this.f1402b.mReportFullyDrawnExecutor).a();
                }
                break;
            case 1:
                if (pVar == androidx.lifecycle.p.ON_STOP) {
                    Window window = this.f1402b.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
                break;
            case 2:
                p pVar2 = this.f1402b;
                pVar2.ensureViewModelStore();
                pVar2.getLifecycle().c(this);
                break;
            default:
                if (pVar == androidx.lifecycle.p.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    i0 i0Var = this.f1402b.mOnBackPressedDispatcher;
                    OnBackInvokedDispatcher onBackInvokedDispatcherA = l.a((p) wVar);
                    i0Var.getClass();
                    d7.a.m(onBackInvokedDispatcherA, "invoker");
                    i0Var.f1398e = onBackInvokedDispatcherA;
                    i0Var.c(i0Var.f1400g);
                    break;
                }
                break;
        }
    }
}
