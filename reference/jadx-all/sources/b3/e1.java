package b3;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends f1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowInsetsAnimation f2615d;

    public e1(WindowInsetsAnimation windowInsetsAnimation) {
        super(null, 0L);
        this.f2615d = windowInsetsAnimation;
    }

    @Override // b3.f1
    public final long a() {
        return this.f2615d.getDurationMillis();
    }

    @Override // b3.f1
    public final float b() {
        return this.f2615d.getInterpolatedFraction();
    }

    @Override // b3.f1
    public final void c(float f10) {
        this.f2615d.setFraction(f10);
    }
}
