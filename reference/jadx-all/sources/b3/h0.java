package b3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static u1 b(View view, u1 u1Var, Rect rect) {
        WindowInsets windowInsetsB = u1Var.b();
        if (windowInsetsB != null) {
            return u1.c(view, view.computeSystemWindowInsets(windowInsetsB, rect));
        }
        rect.setEmpty();
        return u1Var;
    }

    public static boolean c(View view, float f10, float f11, boolean z10) {
        return view.dispatchNestedFling(f10, f11, z10);
    }

    public static boolean d(View view, float f10, float f11) {
        return view.dispatchNestedPreFling(f10, f11);
    }

    public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static u1 j(View view) {
        l1 j1Var;
        if (!h1.f2627d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = h1.f2624a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) h1.f2625b.get(obj);
            Rect rect2 = (Rect) h1.f2626c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                j1Var = new k1();
            } else {
                j1Var = i10 >= 29 ? new j1() : new i1();
            }
            j1Var.e(u2.c.b(rect.left, rect.top, rect.right, rect.bottom));
            j1Var.g(u2.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            u1 u1VarB = j1Var.b();
            u1VarB.f2683a.r(u1VarB);
            u1VarB.f2683a.d(view.getRootView());
            return u1VarB;
        } catch (IllegalAccessException e4) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e4.getMessage(), e4);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f10) {
        view.setElevation(f10);
    }

    public static void t(View view, boolean z10) {
        view.setNestedScrollingEnabled(z10);
    }

    public static void u(View view, t tVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, tVar);
        }
        if (tVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new g0(view, tVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f10) {
        view.setTranslationZ(f10);
    }

    public static void x(View view, float f10) {
        view.setZ(f10);
    }

    public static boolean y(View view, int i10) {
        return view.startNestedScroll(i10);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
