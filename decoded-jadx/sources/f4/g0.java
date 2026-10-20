package f4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends AnimatorListenerAdapter implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f6166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f6168c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6171f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6169d = true;

    public g0(View view, int i10) {
        this.f6166a = view;
        this.f6167b = i10;
        this.f6168c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // f4.p
    public final void a(q qVar) {
    }

    @Override // f4.p
    public final void b() {
        f(false);
    }

    @Override // f4.p
    public final void c(q qVar) {
        if (!this.f6171f) {
            z.f6227a.J(this.f6166a, this.f6167b);
            ViewGroup viewGroup = this.f6168c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        qVar.w(this);
    }

    @Override // f4.p
    public final void d() {
        f(true);
    }

    @Override // f4.p
    public final void e() {
    }

    public final void f(boolean z10) {
        ViewGroup viewGroup;
        if (!this.f6169d || this.f6170e == z10 || (viewGroup = this.f6168c) == null) {
            return;
        }
        this.f6170e = z10;
        o7.d0.k0(viewGroup, z10);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f6171f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f6171f) {
            z.f6227a.J(this.f6166a, this.f6167b);
            ViewGroup viewGroup = this.f6168c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f6171f) {
            return;
        }
        z.f6227a.J(this.f6166a, this.f6167b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f6171f) {
            return;
        }
        z.f6227a.J(this.f6166a, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
