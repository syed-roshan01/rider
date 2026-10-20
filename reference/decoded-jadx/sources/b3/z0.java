package b3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f2697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2698b;

    public z0(g1 g1Var, View view) {
        this.f2697a = g1Var;
        this.f2698b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g1 g1Var = this.f2697a;
        g1Var.f2623a.c(1.0f);
        c1.d(this.f2698b, g1Var);
    }
}
