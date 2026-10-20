package b3;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class m1 extends r1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f2647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Method f2648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Class f2649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Field f2650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f2651l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f2652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u2.c[] f2653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u2.c f2654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u1 f2655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u2.c f2656g;

    public m1(u1 u1Var, WindowInsets windowInsets) {
        super(u1Var);
        this.f2654e = null;
        this.f2652c = windowInsets;
    }

    private u2.c t(int i10, boolean z10) {
        u2.c cVarA = u2.c.f15394e;
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                cVarA = u2.c.a(cVarA, u(i11, z10));
            }
        }
        return cVarA;
    }

    private u2.c v() {
        u1 u1Var = this.f2655f;
        return u1Var != null ? u1Var.f2683a.i() : u2.c.f15394e;
    }

    private u2.c w(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f2647h) {
            y();
        }
        Method method = f2648i;
        if (method != null && f2649j != null && f2650k != null) {
            try {
                Object objInvoke = method.invoke(view, new Object[0]);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f2650k.get(f2651l.get(objInvoke));
                if (rect != null) {
                    return u2.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e4) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
        }
        return null;
    }

    private static void y() {
        try {
            f2648i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f2649j = cls;
            f2650k = cls.getDeclaredField("mVisibleInsets");
            f2651l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f2650k.setAccessible(true);
            f2651l.setAccessible(true);
        } catch (ReflectiveOperationException e4) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
        }
        f2647h = true;
    }

    @Override // b3.r1
    public void d(View view) {
        u2.c cVarW = w(view);
        if (cVarW == null) {
            cVarW = u2.c.f15394e;
        }
        z(cVarW);
    }

    @Override // b3.r1
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f2656g, ((m1) obj).f2656g);
        }
        return false;
    }

    @Override // b3.r1
    public u2.c f(int i10) {
        return t(i10, false);
    }

    @Override // b3.r1
    public u2.c g(int i10) {
        return t(i10, true);
    }

    @Override // b3.r1
    public final u2.c k() {
        if (this.f2654e == null) {
            WindowInsets windowInsets = this.f2652c;
            this.f2654e = u2.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f2654e;
    }

    @Override // b3.r1
    public u1 m(int i10, int i11, int i12, int i13) {
        l1 j1Var;
        u1 u1VarC = u1.c(null, this.f2652c);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            j1Var = new k1(u1VarC);
        } else {
            j1Var = i14 >= 29 ? new j1(u1VarC) : new i1(u1VarC);
        }
        j1Var.g(u1.a(k(), i10, i11, i12, i13));
        j1Var.e(u1.a(i(), i10, i11, i12, i13));
        return j1Var.b();
    }

    @Override // b3.r1
    public boolean o() {
        return this.f2652c.isRound();
    }

    @Override // b3.r1
    public boolean p(int i10) {
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0 && !x(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // b3.r1
    public void q(u2.c[] cVarArr) {
        this.f2653d = cVarArr;
    }

    @Override // b3.r1
    public void r(u1 u1Var) {
        this.f2655f = u1Var;
    }

    public u2.c u(int i10, boolean z10) {
        u2.c cVarI;
        int i11;
        if (i10 == 1) {
            return z10 ? u2.c.b(0, Math.max(v().f15396b, k().f15396b), 0, 0) : u2.c.b(0, k().f15396b, 0, 0);
        }
        if (i10 == 2) {
            if (z10) {
                u2.c cVarV = v();
                u2.c cVarI2 = i();
                return u2.c.b(Math.max(cVarV.f15395a, cVarI2.f15395a), 0, Math.max(cVarV.f15397c, cVarI2.f15397c), Math.max(cVarV.f15398d, cVarI2.f15398d));
            }
            u2.c cVarK = k();
            u1 u1Var = this.f2655f;
            cVarI = u1Var != null ? u1Var.f2683a.i() : null;
            int iMin = cVarK.f15398d;
            if (cVarI != null) {
                iMin = Math.min(iMin, cVarI.f15398d);
            }
            return u2.c.b(cVarK.f15395a, 0, cVarK.f15397c, iMin);
        }
        u2.c cVar = u2.c.f15394e;
        if (i10 == 8) {
            u2.c[] cVarArr = this.f2653d;
            cVarI = cVarArr != null ? cVarArr[o1.s.T(8)] : null;
            if (cVarI != null) {
                return cVarI;
            }
            u2.c cVarK2 = k();
            u2.c cVarV2 = v();
            int i12 = cVarK2.f15398d;
            if (i12 > cVarV2.f15398d) {
                return u2.c.b(0, 0, 0, i12);
            }
            u2.c cVar2 = this.f2656g;
            return (cVar2 == null || cVar2.equals(cVar) || (i11 = this.f2656g.f15398d) <= cVarV2.f15398d) ? cVar : u2.c.b(0, 0, 0, i11);
        }
        if (i10 == 16) {
            return j();
        }
        if (i10 == 32) {
            return h();
        }
        if (i10 == 64) {
            return l();
        }
        if (i10 != 128) {
            return cVar;
        }
        u1 u1Var2 = this.f2655f;
        f fVarE = u1Var2 != null ? u1Var2.f2683a.e() : e();
        if (fVarE == null) {
            return cVar;
        }
        int i13 = Build.VERSION.SDK_INT;
        DisplayCutout displayCutout = fVarE.f2616a;
        return u2.c.b(i13 >= 28 ? d.d(displayCutout) : 0, i13 >= 28 ? d.f(displayCutout) : 0, i13 >= 28 ? d.e(displayCutout) : 0, i13 >= 28 ? d.c(displayCutout) : 0);
    }

    public boolean x(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 8 && i10 != 128) {
                return true;
            }
        }
        return !u(i10, false).equals(u2.c.f15394e);
    }

    public void z(u2.c cVar) {
        this.f2656g = cVar;
    }
}
