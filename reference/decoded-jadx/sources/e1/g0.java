package e1;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f5008a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f5009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f5010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f5011d;

    public static void a(Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            q.f5058a.a(canvas, z10);
            return;
        }
        if (!f5011d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f5009b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f5010c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f5009b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f5010c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f5009b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f5010c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f5011d = true;
        }
        if (z10) {
            try {
                Method method4 = f5009b;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f5010c) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }

    public static final boolean b(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean c(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static String i(int i10) {
        if (h(i10, 0)) {
            return "Clamp";
        }
        if (h(i10, 1)) {
            return "Repeated";
        }
        if (h(i10, 2)) {
            return "Mirror";
        }
        return h(i10, 3) ? "Decal" : "Unknown";
    }
}
