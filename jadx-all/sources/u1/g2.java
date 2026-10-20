package u1;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.e f15098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Matrix f15099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Matrix f15100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f15101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f15102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15103f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15104g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15105h = true;

    public g2(o0 o0Var) {
        this.f15098a = o0Var;
    }

    public final float[] a(Object obj) {
        float[] fArr = this.f15102e;
        if (fArr == null) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
            this.f15102e = fArr;
        }
        if (this.f15104g) {
            this.f15105h = o1.s.U(b(obj), fArr);
            this.f15104g = false;
        }
        if (this.f15105h) {
            return fArr;
        }
        return null;
    }

    public final float[] b(Object obj) {
        float[] fArr = this.f15101d;
        if (fArr == null) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
            this.f15101d = fArr;
        }
        if (!this.f15103f) {
            return fArr;
        }
        Matrix matrix = this.f15099b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f15099b = matrix;
        }
        this.f15098a.invoke(obj, matrix);
        Matrix matrix2 = this.f15100c;
        if (matrix2 == null || !d7.a.d(matrix, matrix2)) {
            androidx.compose.ui.graphics.a.p(matrix, fArr);
            this.f15099b = matrix2;
            this.f15100c = matrix;
        }
        this.f15103f = false;
        return fArr;
    }

    public final void c() {
        this.f15103f = true;
        this.f15104g = true;
    }
}
