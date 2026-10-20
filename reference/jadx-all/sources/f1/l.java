package f1;

import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f6064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f6065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f6066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f6067g;

    static {
        float[] fArrT = d0.T(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d0.n(b.f6018b.f6019a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f6064d = fArrT;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f6065e = fArr;
        f6066f = d0.O(fArrT);
        f6067g = d0.O(fArr);
    }

    @Override // f1.d
    public final float a(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // f1.d
    public final float b(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
    }

    @Override // f1.d
    public final long d(float f10, float f11, float f12) {
        float fQ = z6.a.q(f10, 0.0f, 1.0f);
        float fQ2 = z6.a.q(f11, -0.5f, 0.5f);
        float fQ3 = z6.a.q(f12, -0.5f, 0.5f);
        float[] fArr = f6067g;
        float fW = d0.W(fArr, fQ, fQ2, fQ3);
        float fX = d0.X(fArr, fQ, fQ2, fQ3);
        float fY = d0.Y(fArr, fQ, fQ2, fQ3);
        float f13 = fW * fW * fW;
        float f14 = fX * fX * fX;
        float f15 = fY * fY * fY;
        float[] fArr2 = f6066f;
        float fW2 = d0.W(fArr2, f13, f14, f15);
        float fX2 = d0.X(fArr2, f13, f14, f15);
        return (((long) Float.floatToRawIntBits(fW2)) << 32) | (((long) Float.floatToRawIntBits(fX2)) & 4294967295L);
    }

    @Override // f1.d
    public final float e(float f10, float f11, float f12) {
        float fQ = z6.a.q(f10, 0.0f, 1.0f);
        float fQ2 = z6.a.q(f11, -0.5f, 0.5f);
        float fQ3 = z6.a.q(f12, -0.5f, 0.5f);
        float[] fArr = f6067g;
        float fW = d0.W(fArr, fQ, fQ2, fQ3);
        float fX = d0.X(fArr, fQ, fQ2, fQ3);
        float fY = d0.Y(fArr, fQ, fQ2, fQ3);
        float f13 = fY * fY * fY;
        return d0.Y(f6066f, fW * fW * fW, fX * fX * fX, f13);
    }

    @Override // f1.d
    public final long f(float f10, float f11, float f12, float f13, d dVar) {
        float[] fArr = f6064d;
        float fW = d0.W(fArr, f10, f11, f12);
        float fX = d0.X(fArr, f10, f11, f12);
        float fY = d0.Y(fArr, f10, f11, f12);
        double d10 = 0.33333334f;
        float fSignum = Math.signum(fW) * ((float) Math.pow(Math.abs(fW), d10));
        float fSignum2 = Math.signum(fX) * ((float) Math.pow(Math.abs(fX), d10));
        float fSignum3 = Math.signum(fY) * ((float) Math.pow(Math.abs(fY), d10));
        float[] fArr2 = f6065e;
        return androidx.compose.ui.graphics.a.a(d0.W(fArr2, fSignum, fSignum2, fSignum3), d0.X(fArr2, fSignum, fSignum2, fSignum3), d0.Y(fArr2, fSignum, fSignum2, fSignum3), f13, dVar);
    }
}
