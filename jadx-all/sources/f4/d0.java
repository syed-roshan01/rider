package f4;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends c0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f6151r = true;

    @Override // x9.v
    public void J(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.J(view, i10);
        } else if (f6151r) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f6151r = false;
            }
        }
    }
}
