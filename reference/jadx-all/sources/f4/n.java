package f4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q.f f6189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f6190b;

    public n(q qVar, q.f fVar) {
        this.f6190b = qVar;
        this.f6189a = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f6189a.remove(animator);
        this.f6190b.f6208t.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f6190b.f6208t.add(animator);
    }
}
