package u1;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class m3 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f15165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0.g2 f15166b;

    public m3(View view, m0.g2 g2Var) {
        this.f15165a = view;
        this.f15166b = g2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f15165a.removeOnAttachStateChangeListener(this);
        this.f15166b.t();
    }
}
