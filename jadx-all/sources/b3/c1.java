package b3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends f1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PathInterpolator f2608d = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o3.a f2609e = new o3.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DecelerateInterpolator f2610f = new DecelerateInterpolator();

    public static void d(View view, g1 g1Var) {
        y.g0 g0VarI = i(view);
        if (g0VarI != null) {
            g0VarI.b(g1Var);
            if (g0VarI.f16545b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                d(viewGroup.getChildAt(i10), g1Var);
            }
        }
    }

    public static void e(View view, WindowInsets windowInsets, boolean z10) {
        y.g0 g0VarI = i(view);
        if (g0VarI != null) {
            g0VarI.f16544a = windowInsets;
            if (!z10) {
                z10 = true;
                g0VarI.f16547d = true;
                g0VarI.f16548e = true;
                if (g0VarI.f16545b != 0) {
                    z10 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), windowInsets, z10);
            }
        }
    }

    public static void f(View view, u1 u1Var) {
        y.g0 g0VarI = i(view);
        if (g0VarI != null) {
            y.j1 j1Var = g0VarI.f16546c;
            y.j1.a(j1Var, u1Var);
            if (j1Var.f16602r) {
                u1Var = u1.f2682b;
            }
            if (g0VarI.f16545b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), u1Var);
            }
        }
    }

    public static void g(View view) {
        y.g0 g0VarI = i(view);
        if (g0VarI != null) {
            g0VarI.f16547d = false;
            if (g0VarI.f16545b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10));
            }
        }
    }

    public static WindowInsets h(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static y.g0 i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof b1) {
            return ((b1) tag).f2603a;
        }
        return null;
    }
}
