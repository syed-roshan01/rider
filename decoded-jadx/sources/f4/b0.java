package f4;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends a0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f6146o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f6147p = true;

    public void N(View view, Matrix matrix) {
        if (f6146o) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f6146o = false;
            }
        }
    }

    public void O(View view, Matrix matrix) {
        if (f6147p) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f6147p = false;
            }
        }
    }
}
