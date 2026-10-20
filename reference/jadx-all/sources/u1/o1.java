package u1;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class o1 implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f15178a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f15179b = new int[2];

    @Override // u1.l1
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f15178a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f15179b;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
        androidx.compose.ui.graphics.a.p(matrix, fArr);
    }
}
