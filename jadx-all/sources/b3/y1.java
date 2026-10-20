package b3;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class y1 extends l2.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInsetsController f2694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window f2695b;

    public y1(Window window) {
        this.f2694a = window.getInsetsController();
        this.f2695b = window;
    }

    @Override // l2.l
    public final void h(boolean z10) {
        Window window = this.f2695b;
        WindowInsetsController windowInsetsController = this.f2694a;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    @Override // l2.l
    public final void i(boolean z10) {
        Window window = this.f2695b;
        WindowInsetsController windowInsetsController = this.f2694a;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }
}
