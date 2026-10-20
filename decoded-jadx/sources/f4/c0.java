package f4;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends b0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f6148q = true;

    public void P(View view, int i10, int i11, int i12, int i13) {
        if (f6148q) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f6148q = false;
            }
        }
    }
}
