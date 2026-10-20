package b3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f2689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f2690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u1 f2691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f2693e;

    public y0(g1 g1Var, u1 u1Var, u1 u1Var2, int i10, View view) {
        this.f2689a = g1Var;
        this.f2690b = u1Var;
        this.f2691c = u1Var2;
        this.f2692d = i10;
        this.f2693e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        g1 g1Var = this.f2689a;
        g1Var.f2623a.c(animatedFraction);
        float fB = g1Var.f2623a.b();
        PathInterpolator pathInterpolator = c1.f2608d;
        int i10 = Build.VERSION.SDK_INT;
        u1 u1Var = this.f2690b;
        l1 k1Var = i10 >= 30 ? new k1(u1Var) : i10 >= 29 ? new j1(u1Var) : new i1(u1Var);
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((this.f2692d & i11) == 0) {
                k1Var.c(i11, u1Var.f2683a.f(i11));
            } else {
                u2.c cVarF = u1Var.f2683a.f(i11);
                u2.c cVarF2 = this.f2691c.f2683a.f(i11);
                float f10 = 1.0f - fB;
                k1Var.c(i11, u1.a(cVarF, (int) (((double) ((cVarF.f15395a - cVarF2.f15395a) * f10)) + 0.5d), (int) (((double) ((cVarF.f15396b - cVarF2.f15396b) * f10)) + 0.5d), (int) (((double) ((cVarF.f15397c - cVarF2.f15397c) * f10)) + 0.5d), (int) (((double) ((cVarF.f15398d - cVarF2.f15398d) * f10)) + 0.5d)));
            }
        }
        u1 u1VarB = k1Var.b();
        Collections.singletonList(g1Var);
        c1.f(this.f2693e, u1VarB);
    }
}
