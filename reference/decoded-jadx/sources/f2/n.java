package f2;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x9.v f6125a;

    public n() {
        this.f6125a = Build.VERSION.SDK_INT >= 28 ? new x9.v(0) : new x9.v(1);
    }
}
