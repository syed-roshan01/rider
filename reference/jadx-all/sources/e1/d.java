package e1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f4994a = e.f4997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f4995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f4996c;

    @Override // e1.p
    public final void a(y yVar, long j10, long j11, long j12, long j13, g gVar) {
        if (this.f4995b == null) {
            this.f4995b = new Rect();
            this.f4996c = new Rect();
        }
        Canvas canvas = this.f4994a;
        Bitmap bitmapI = androidx.compose.ui.graphics.a.i(yVar);
        Rect rect = this.f4995b;
        d7.a.j(rect);
        int i10 = m2.i.f11808c;
        int i11 = (int) (j10 >> 32);
        rect.left = i11;
        int i12 = (int) (j10 & 4294967295L);
        rect.top = i12;
        rect.right = i11 + ((int) (j11 >> 32));
        rect.bottom = i12 + ((int) (j11 & 4294967295L));
        Rect rect2 = this.f4996c;
        d7.a.j(rect2);
        int i13 = (int) (j12 >> 32);
        rect2.left = i13;
        int i14 = (int) (j12 & 4294967295L);
        rect2.top = i14;
        rect2.right = i13 + ((int) (j13 >> 32));
        rect2.bottom = i14 + ((int) (j13 & 4294967295L));
        canvas.drawBitmap(bitmapI, rect, rect2, gVar.f5004a);
    }

    @Override // e1.p
    public final void b(float f10, float f11) {
        this.f4994a.scale(f10, f11);
    }

    @Override // e1.p
    public final void d(float f10, float f11, float f12, float f13, int i10) {
        this.f4994a.clipRect(f10, f11, f12, f13, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // e1.p
    public final void e(float f10, float f11) {
        this.f4994a.translate(f10, f11);
    }

    @Override // e1.p
    public final void f() {
        this.f4994a.rotate(45.0f);
    }

    @Override // e1.p
    public final void g(long j10, long j11, g gVar) {
        this.f4994a.drawLine(d1.c.d(j10), d1.c.e(j10), d1.c.d(j11), d1.c.e(j11), gVar.f5004a);
    }

    @Override // e1.p
    public final void h() {
        this.f4994a.restore();
    }

    @Override // e1.p
    public final void i(d1.d dVar, g gVar) {
        this.f4994a.saveLayer(dVar.f4332a, dVar.f4333b, dVar.f4334c, dVar.f4335d, gVar.f5004a, 31);
    }

    @Override // e1.p
    public final void j() {
        this.f4994a.save();
    }

    @Override // e1.p
    public final void k(d0 d0Var, g gVar) {
        Canvas canvas = this.f4994a;
        if (!(d0Var instanceof i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((i) d0Var).f5014a, gVar.f5004a);
    }

    @Override // e1.p
    public final void l(float f10, float f11, float f12, float f13, float f14, float f15, g gVar) {
        this.f4994a.drawRoundRect(f10, f11, f12, f13, f14, f15, gVar.f5004a);
    }

    @Override // e1.p
    public final void m() {
        g0.a(this.f4994a, false);
    }

    @Override // e1.p
    public final void n(float f10, float f11, float f12, float f13, float f14, float f15, g gVar) {
        this.f4994a.drawArc(f10, f11, f12, f13, f14, f15, false, gVar.f5004a);
    }

    @Override // e1.p
    public final void p(float f10, long j10, g gVar) {
        this.f4994a.drawCircle(d1.c.d(j10), d1.c.e(j10), f10, gVar.f5004a);
    }

    @Override // e1.p
    public final void q(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                if (fArr[(i10 * 4) + i11] != (i10 == i11 ? 1.0f : 0.0f)) {
                    Matrix matrix = new Matrix();
                    androidx.compose.ui.graphics.a.o(matrix, fArr);
                    this.f4994a.concat(matrix);
                    return;
                }
                i11++;
            }
            i10++;
        }
    }

    @Override // e1.p
    public final void r() {
        g0.a(this.f4994a, true);
    }

    @Override // e1.p
    public final void s(float f10, float f11, float f12, float f13, g gVar) {
        this.f4994a.drawRect(f10, f11, f12, f13, gVar.f5004a);
    }

    @Override // e1.p
    public final void t(d0 d0Var, int i10) {
        Canvas canvas = this.f4994a;
        if (!(d0Var instanceof i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((i) d0Var).f5014a, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // e1.p
    public final void u(y yVar, long j10, g gVar) {
        this.f4994a.drawBitmap(androidx.compose.ui.graphics.a.i(yVar), d1.c.d(j10), d1.c.e(j10), gVar.f5004a);
    }

    public final Canvas v() {
        return this.f4994a;
    }

    public final void w(Canvas canvas) {
        this.f4994a = canvas;
    }
}
