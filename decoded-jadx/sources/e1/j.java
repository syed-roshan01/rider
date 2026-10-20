package e1;

import android.graphics.PathMeasure;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f5035a;

    public j(PathMeasure pathMeasure) {
        this.f5035a = pathMeasure;
    }

    public final void a(float f10, float f11, d0 d0Var) {
        if (!(d0Var instanceof i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f5035a.getSegment(f10, f11, ((i) d0Var).f5014a, true);
    }
}
