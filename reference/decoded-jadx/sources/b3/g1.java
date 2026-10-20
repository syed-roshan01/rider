package b3;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f1 f2623a;

    public g1(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2623a = new e1(b2.t.h(i10, interpolator, j10));
        } else {
            this.f2623a = new c1(interpolator, j10);
        }
    }
}
