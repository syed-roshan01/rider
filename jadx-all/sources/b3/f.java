package b3;

import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f2616a;

    public f(DisplayCutout displayCutout) {
        this.f2616a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return a3.b.a(this.f2616a, ((f) obj).f2616a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f2616a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2616a + "}";
    }
}
