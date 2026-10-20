package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f1878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f1879e;

    public d(ViewGroup viewGroup, View view, boolean z10, s1 s1Var, k kVar) {
        this.f1875a = viewGroup;
        this.f1876b = view;
        this.f1877c = z10;
        this.f1878d = s1Var;
        this.f1879e = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1875a;
        View view = this.f1876b;
        viewGroup.endViewTransition(view);
        boolean z10 = this.f1877c;
        s1 s1Var = this.f1878d;
        if (z10) {
            a7.a.a(s1Var.f2023a, view);
        }
        this.f1879e.a();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + s1Var + " has ended.");
        }
    }
}
