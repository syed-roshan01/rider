package a4;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class i implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f1113a;

    public i(j jVar) {
        this.f1113a = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        j jVar = this.f1113a;
        jVar.f1117b.setAlpha(iFloatValue);
        jVar.f1118c.setAlpha(iFloatValue);
        jVar.f1129n.invalidate();
    }
}
