package l;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.google.firebase.remoteconfig.internal.Code;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f10949a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f10950b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f10951c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f10949a);
        } else {
            drawable.setState(f10950b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        Object obj;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            Insets insetsA = u0.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        if (drawable instanceof v2.g) {
            obj = drawable;
            ((v2.h) ((v2.g) drawable)).getClass();
            obj = null;
        }
        if (i10 >= 29) {
            boolean z10 = t0.f10930a;
        } else if (t0.f10930a) {
            try {
                Object objInvoke = t0.f10931b.invoke(obj, new Object[0]);
                if (objInvoke != null) {
                    return new Rect(t0.f10932c.getInt(objInvoke), t0.f10933d.getInt(objInvoke), t0.f10934e.getInt(objInvoke), t0.f10935f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f10951c;
    }

    public static PorterDuff.Mode c(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case Code.UNAVAILABLE /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case Code.UNAUTHENTICATED /* 16 */:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
