package b3;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static u1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        u1 u1VarC = u1.c(null, rootWindowInsets);
        r1 r1Var = u1VarC.f2683a;
        r1Var.r(u1VarC);
        r1Var.d(view.getRootView());
        return u1VarC;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i10) {
        view.setScrollIndicators(i10);
    }

    public static void d(View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }
}
