package a4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1110a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1111b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1112c;

    public h(View view) {
        this.f1112c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f1110a) {
            case 0:
                this.f1111b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f1110a;
        Object obj = this.f1112c;
        switch (i10) {
            case 0:
                if (!this.f1111b) {
                    j jVar = (j) obj;
                    if (((Float) jVar.f1136u.getAnimatedValue()).floatValue() != 0.0f) {
                        jVar.f1137v = 2;
                        jVar.f1129n.invalidate();
                    } else {
                        jVar.f1137v = 0;
                        jVar.e(0);
                    }
                } else {
                    this.f1111b = false;
                }
                break;
            default:
                View view = (View) obj;
                f4.z.f6227a.M(view, 1.0f);
                if (this.f1111b) {
                    view.setLayerType(0, null);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f1110a) {
            case 1:
                View view = (View) this.f1112c;
                Field field = b3.q0.f2670a;
                if (b3.b0.h(view) && view.getLayerType() == 0) {
                    this.f1111b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public h(j jVar) {
        this.f1112c = jVar;
    }
}
