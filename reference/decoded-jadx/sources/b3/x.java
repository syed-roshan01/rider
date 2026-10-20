package b3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class x extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f2687b;

    /* JADX WARN: Type inference failed for: r4v0, types: [b3.w] */
    @Override // b3.v, l2.l
    public final void g() {
        View view = this.f2687b;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.g();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r10 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: b3.w
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                atomicBoolean.set((i10 & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r10);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r10);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    @Override // b3.v, l2.l
    public final void j() {
        View view = this.f2687b;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        } else {
            super.j();
        }
    }
}
