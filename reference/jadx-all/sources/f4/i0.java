package f4;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowId f6178a;

    public i0(View view) {
        this.f6178a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i0) && ((i0) obj).f6178a.equals(this.f6178a);
    }

    public final int hashCode() {
        return this.f6178a.hashCode();
    }
}
