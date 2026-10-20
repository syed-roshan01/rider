package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import b3.x1;
import b3.y1;

/* JADX INFO: loaded from: classes.dex */
public final class v implements w {
    @Override // androidx.activity.w
    public void a(m0 m0Var, m0 m0Var2, Window window, View view, boolean z10, boolean z11) {
        d7.a.m(m0Var, "statusBarStyle");
        d7.a.m(m0Var2, "navigationBarStyle");
        d7.a.m(window, "window");
        d7.a.m(view, "view");
        o1.s.k0(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        new k.f(view, 11);
        l2.l y1Var = Build.VERSION.SDK_INT >= 30 ? new y1(window) : new x1(window);
        y1Var.i(!z10);
        y1Var.h(!z11);
    }
}
