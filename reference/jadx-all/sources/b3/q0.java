package b3;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.ride.accepter.R;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f2670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f2671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f2672c;

    static {
        new AtomicInteger(1);
        f2671b = false;
        f2672c = new z();
    }

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m0.a(view);
        }
        if (f2671b) {
            return null;
        }
        if (f2670a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2670a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2671b = true;
                return null;
            }
        }
        try {
            Object obj = f2670a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2671b = true;
            return null;
        }
    }

    public static void b(View view, int i10) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i11 = Build.VERSION.SDK_INT;
            Object objB = null;
            if (i11 >= 28) {
                tag = l0.b(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z10 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (e0.a(view) != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                e0.g(accessibilityEventObtain, i10);
                if (z10) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i11 >= 28) {
                        objB = l0.b(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            objB = tag2;
                        }
                    }
                    text.add((CharSequence) objB);
                    if (b0.c(view) == 0) {
                        b0.s(view, 1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        e0.e(view.getParent(), view, view, i10);
                        return;
                    } catch (AbstractMethodError e4) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e4);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            e0.g(accessibilityEventObtain2, i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i11 >= 28) {
                objB = l0.b(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    objB = tag3;
                }
            }
            text2.add((CharSequence) objB);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            m0.d(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void d(View view, c cVar) {
        if (cVar == null && (a(view) instanceof a)) {
            cVar = new c();
        }
        if (b0.c(view) == 0) {
            b0.s(view, 1);
        }
        view.setAccessibilityDelegate(cVar == null ? null : cVar.f2607b);
    }

    public static void e(View view, CharSequence charSequence) {
        new y(R.id.tag_accessibility_pane_title, 8, 28, 1 == true ? 1 : 0).b(view, charSequence);
        z zVar = f2672c;
        if (charSequence == null) {
            zVar.f2696a.remove(view);
            view.removeOnAttachStateChangeListener(zVar);
            b0.o(view.getViewTreeObserver(), zVar);
        } else {
            zVar.f2696a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(zVar);
            if (e0.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(zVar);
            }
        }
    }

    public static void f(View view, y.g0 g0Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(g0Var != null ? new d1(g0Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = c1.f2608d;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (g0Var == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener b1Var = new b1(view, g0Var);
        view.setTag(R.id.tag_window_insets_animation_callback, b1Var);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(b1Var);
        }
    }
}
