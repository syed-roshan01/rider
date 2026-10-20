package u1;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class m1 implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f15162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f15163b = new int[2];

    public m1(float[] fArr) {
        this.f15162a = fArr;
    }

    @Override // u1.l1
    public final void a(View view, float[] fArr) {
        e1.a0.c(fArr);
        b(view, fArr);
    }

    public final void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z10 = parent instanceof View;
        float[] fArr2 = this.f15162a;
        if (z10) {
            b((View) parent, fArr);
            float f10 = -view.getScrollX();
            float f11 = -view.getScrollY();
            e1.a0.c(fArr2);
            e1.a0.e(fArr2, f10, f11);
            x1.s(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            e1.a0.c(fArr2);
            e1.a0.e(fArr2, left, top);
            x1.s(fArr, fArr2);
        } else {
            int[] iArr = this.f15163b;
            view.getLocationInWindow(iArr);
            float f12 = -view.getScrollX();
            float f13 = -view.getScrollY();
            e1.a0.c(fArr2);
            e1.a0.e(fArr2, f12, f13);
            x1.s(fArr, fArr2);
            float f14 = iArr[0];
            float f15 = iArr[1];
            e1.a0.c(fArr2);
            e1.a0.e(fArr2, f14, f15);
            x1.s(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        androidx.compose.ui.graphics.a.p(matrix, fArr2);
        x1.s(fArr, fArr2);
    }
}
