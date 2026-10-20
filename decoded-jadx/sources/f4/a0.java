package f4;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 extends x9.v {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f6144n = true;

    public a0() {
        super(25, (Object) null);
    }

    public float L(View view) {
        if (f6144n) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f6144n = false;
            }
        }
        return view.getAlpha();
    }

    public void M(View view, float f10) {
        if (f6144n) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f6144n = false;
            }
        }
        view.setAlpha(f10);
    }
}
