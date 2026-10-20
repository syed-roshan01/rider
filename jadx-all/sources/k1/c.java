package k1;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9711a;

    public c(View view) {
        this.f9711a = view;
    }

    public final void a(int i10) {
        boolean z10 = i10 == 0;
        View view = this.f9711a;
        if (z10) {
            view.performHapticFeedback(0);
        } else if (i10 == f6.a.f6375x) {
            view.performHapticFeedback(9);
        }
    }
}
