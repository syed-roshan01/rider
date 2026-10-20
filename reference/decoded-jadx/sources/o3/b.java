package o3;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f12519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12520b;

    public b(float[] fArr) {
        this.f12519a = fArr;
        this.f12520b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f12519a;
        int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f12520b;
        float f12 = (f10 - (iMin * f11)) / f11;
        float f13 = fArr[iMin];
        return ((fArr[iMin + 1] - f13) * f12) + f13;
    }
}
