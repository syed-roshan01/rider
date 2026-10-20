package b3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y.g0 f2603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u1 f2604b;

    public b1(View view, y.g0 g0Var) {
        u1 u1VarB;
        this.f2603a = g0Var;
        Field field = q0.f2670a;
        u1 u1VarA = i0.a(view);
        if (u1VarA != null) {
            int i10 = Build.VERSION.SDK_INT;
            u1VarB = (i10 >= 30 ? new k1(u1VarA) : i10 >= 29 ? new j1(u1VarA) : new i1(u1VarA)).b();
        } else {
            u1VarB = null;
        }
        this.f2604b = u1VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        r1 r1Var;
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f2604b = u1.c(view, windowInsets);
            return c1.h(view, windowInsets);
        }
        u1 u1VarC = u1.c(view, windowInsets);
        if (this.f2604b == null) {
            Field field = q0.f2670a;
            this.f2604b = i0.a(view);
        }
        if (this.f2604b == null) {
            this.f2604b = u1VarC;
            return c1.h(view, windowInsets);
        }
        y.g0 g0VarI = c1.i(view);
        if (g0VarI != null && Objects.equals(g0VarI.f16544a, windowInsets)) {
            return c1.h(view, windowInsets);
        }
        u1 u1Var = this.f2604b;
        int i10 = 1;
        int i11 = 0;
        while (true) {
            r1Var = u1VarC.f2683a;
            if (i10 > 256) {
                break;
            }
            if (!r1Var.f(i10).equals(u1Var.f2683a.f(i10))) {
                i11 |= i10;
            }
            i10 <<= 1;
        }
        if (i11 == 0) {
            return c1.h(view, windowInsets);
        }
        u1 u1Var2 = this.f2604b;
        if ((i11 & 8) != 0) {
            interpolator = r1Var.f(8).f15398d > u1Var2.f2683a.f(8).f15398d ? c1.f2608d : c1.f2609e;
        } else {
            interpolator = c1.f2610f;
        }
        g1 g1Var = new g1(i11, interpolator, 160L);
        g1Var.f2623a.c(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(g1Var.f2623a.a());
        u2.c cVarF = r1Var.f(i11);
        u2.c cVarF2 = u1Var2.f2683a.f(i11);
        int iMin = Math.min(cVarF.f15395a, cVarF2.f15395a);
        int i12 = cVarF.f15396b;
        int i13 = cVarF2.f15396b;
        int iMin2 = Math.min(i12, i13);
        int i14 = cVarF.f15397c;
        int i15 = cVarF2.f15397c;
        int iMin3 = Math.min(i14, i15);
        int i16 = cVarF.f15398d;
        int i17 = i11;
        int i18 = cVarF2.f15398d;
        l.t tVar = new l.t(8, u2.c.b(iMin, iMin2, iMin3, Math.min(i16, i18)), u2.c.b(Math.max(cVarF.f15395a, cVarF2.f15395a), Math.max(i12, i13), Math.max(i14, i15), Math.max(i16, i18)));
        c1.e(view, windowInsets, false);
        duration.addUpdateListener(new y0(g1Var, u1VarC, u1Var2, i17, view));
        duration.addListener(new z0(g1Var, view));
        u.a(view, new a1(this, view, g1Var, tVar, duration, 0));
        this.f2604b = u1VarC;
        return c1.h(view, windowInsets);
    }
}
