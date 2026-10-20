package b3;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends w1 {
    @Override // l2.l
    public final void h(boolean z10) {
        Window window = this.f2685a;
        if (!z10) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
