package u1;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f15115a;

    public i1(ViewConfiguration viewConfiguration) {
        this.f15115a = viewConfiguration;
    }

    @Override // u1.y2
    public final float a() {
        return this.f15115a.getScaledMaximumFlingVelocity();
    }

    @Override // u1.y2
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // u1.y2
    public final void c() {
    }

    @Override // u1.y2
    public final long d() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // u1.y2
    public final float e() {
        return this.f15115a.getScaledTouchSlop();
    }
}
