package e1;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f5004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5005b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Shader f5006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f5007d;

    public g(Paint paint) {
        this.f5004a = paint;
    }

    public final int a() {
        Paint.Cap strokeCap = this.f5004a.getStrokeCap();
        int i10 = strokeCap == null ? -1 : h.f5012a[strokeCap.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int b() {
        Paint.Join strokeJoin = this.f5004a.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : h.f5013b[strokeJoin.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void c(float f10) {
        this.f5004a.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public final void d(int i10) {
        if (g0.b(this.f5005b, i10)) {
            return;
        }
        this.f5005b = i10;
        int i11 = Build.VERSION.SDK_INT;
        Paint paint = this.f5004a;
        if (i11 >= 29) {
            q0.f5059a.a(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.a.u(i10)));
        }
    }

    public final void e(long j10) {
        this.f5004a.setColor(androidx.compose.ui.graphics.a.s(j10));
    }

    public final void f(l lVar) {
        this.f5007d = lVar;
        this.f5004a.setColorFilter(lVar != null ? lVar.f5042a : null);
    }

    public final void g(int i10) {
        this.f5004a.setFilterBitmap(!g0.d(i10, 0));
    }

    public final void h(Shader shader) {
        this.f5006c = shader;
        this.f5004a.setShader(shader);
    }

    public final void i(int i10) {
        Paint.Cap cap;
        if (g0.f(i10, 2)) {
            cap = Paint.Cap.SQUARE;
        } else if (g0.f(i10, 1)) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = g0.f(i10, 0) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        this.f5004a.setStrokeCap(cap);
    }

    public final void j(int i10) {
        Paint.Join join;
        if (g0.g(i10, 0)) {
            join = Paint.Join.MITER;
        } else if (g0.g(i10, 2)) {
            join = Paint.Join.BEVEL;
        } else {
            join = g0.g(i10, 1) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        this.f5004a.setStrokeJoin(join);
    }

    public final void k(float f10) {
        this.f5004a.setStrokeWidth(f10);
    }

    public final void l(int i10) {
        this.f5004a.setStyle(i10 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
