package b3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u1 f2682b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f2683a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2682b = q1.f2673q;
        } else {
            f2682b = r1.f2674b;
        }
    }

    public u1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f2683a = new q1(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f2683a = new p1(this, windowInsets);
        } else if (i10 >= 28) {
            this.f2683a = new o1(this, windowInsets);
        } else {
            this.f2683a = new n1(this, windowInsets);
        }
    }

    public static u2.c a(u2.c cVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, cVar.f15395a - i10);
        int iMax2 = Math.max(0, cVar.f15396b - i11);
        int iMax3 = Math.max(0, cVar.f15397c - i12);
        int iMax4 = Math.max(0, cVar.f15398d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? cVar : u2.c.b(iMax, iMax2, iMax3, iMax4);
    }

    public static u1 c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        u1 u1Var = new u1(windowInsets);
        if (view != null) {
            Field field = q0.f2670a;
            if (e0.b(view)) {
                u1 u1VarA = i0.a(view);
                r1 r1Var = u1Var.f2683a;
                r1Var.r(u1VarA);
                r1Var.d(view.getRootView());
            }
        }
        return u1Var;
    }

    public final WindowInsets b() {
        r1 r1Var = this.f2683a;
        if (r1Var instanceof m1) {
            return ((m1) r1Var).f2652c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        return a3.b.a(this.f2683a, ((u1) obj).f2683a);
    }

    public final int hashCode() {
        r1 r1Var = this.f2683a;
        if (r1Var == null) {
            return 0;
        }
        return r1Var.hashCode();
    }

    public u1() {
        this.f2683a = new r1(this);
    }
}
