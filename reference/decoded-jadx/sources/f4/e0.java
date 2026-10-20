package f4;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends d0 {
    @Override // f4.d0, x9.v
    public final void J(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // f4.a0
    public final float L(View view) {
        return view.getTransitionAlpha();
    }

    @Override // f4.a0
    public final void M(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // f4.b0
    public final void N(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // f4.b0
    public final void O(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // f4.c0
    public final void P(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }
}
