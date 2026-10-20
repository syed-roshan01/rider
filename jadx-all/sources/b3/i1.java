package b3;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends l1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f2628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f2629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Constructor f2630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f2631h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowInsets f2632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u2.c f2633d;

    public i1() {
        this.f2632c = i();
    }

    private static WindowInsets i() {
        if (!f2629f) {
            try {
                f2628e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
            }
            f2629f = true;
        }
        Field field = f2628e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
            }
        }
        if (!f2631h) {
            try {
                f2630g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            f2631h = true;
        }
        Constructor constructor = f2630g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
            }
        }
        return null;
    }

    @Override // b3.l1
    public u1 b() {
        a();
        u1 u1VarC = u1.c(null, this.f2632c);
        u2.c[] cVarArr = this.f2643b;
        r1 r1Var = u1VarC.f2683a;
        r1Var.q(cVarArr);
        r1Var.s(this.f2633d);
        return u1VarC;
    }

    @Override // b3.l1
    public void e(u2.c cVar) {
        this.f2633d = cVar;
    }

    @Override // b3.l1
    public void g(u2.c cVar) {
        WindowInsets windowInsets = this.f2632c;
        if (windowInsets != null) {
            this.f2632c = windowInsets.replaceSystemWindowInsets(cVar.f15395a, cVar.f15396b, cVar.f15397c, cVar.f15398d);
        }
    }

    public i1(u1 u1Var) {
        super(u1Var);
        this.f2632c = u1Var.b();
    }
}
