package b3;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f2617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Interpolator f2618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2619c;

    public f1(Interpolator interpolator, long j10) {
        this.f2618b = interpolator;
        this.f2619c = j10;
    }

    public long a() {
        return this.f2619c;
    }

    public float b() {
        Interpolator interpolator = this.f2618b;
        return interpolator != null ? interpolator.getInterpolation(this.f2617a) : this.f2617a;
    }

    public void c(float f10) {
        this.f2617a = f10;
    }
}
