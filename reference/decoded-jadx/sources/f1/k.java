package f1;

/* JADX INFO: loaded from: classes.dex */
public final class k extends d {
    @Override // f1.d
    public final float a(int i10) {
        return i10 == 0 ? 100.0f : 128.0f;
    }

    @Override // f1.d
    public final float b(int i10) {
        return i10 == 0 ? 0.0f : -128.0f;
    }

    @Override // f1.d
    public final long d(float f10, float f11, float f12) {
        float fQ = (z6.a.q(f10, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float fQ2 = (z6.a.q(f11, -128.0f, 128.0f) * 0.002f) + fQ;
        float f13 = fQ2 > 0.20689656f ? fQ2 * fQ2 * fQ2 : (fQ2 - 0.13793103f) * 0.12841855f;
        float f14 = fQ > 0.20689656f ? fQ * fQ * fQ : (fQ - 0.13793103f) * 0.12841855f;
        float[] fArr = j.f6063e;
        float f15 = f13 * fArr[0];
        return (((long) Float.floatToRawIntBits(f14 * fArr[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f15)) << 32);
    }

    @Override // f1.d
    public final float e(float f10, float f11, float f12) {
        float fQ = ((z6.a.q(f10, 0.0f, 100.0f) + 16.0f) / 116.0f) - (z6.a.q(f12, -128.0f, 128.0f) * 0.005f);
        return (fQ > 0.20689656f ? fQ * fQ * fQ : 0.12841855f * (fQ - 0.13793103f)) * j.f6063e[2];
    }

    @Override // f1.d
    public final long f(float f10, float f11, float f12, float f13, d dVar) {
        float[] fArr = j.f6063e;
        float f14 = f10 / fArr[0];
        float f15 = f11 / fArr[1];
        float f16 = f12 / fArr[2];
        float fPow = f14 > 0.008856452f ? (float) Math.pow(f14, 0.33333334f) : (f14 * 7.787037f) + 0.13793103f;
        float fPow2 = f15 > 0.008856452f ? (float) Math.pow(f15, 0.33333334f) : (f15 * 7.787037f) + 0.13793103f;
        return androidx.compose.ui.graphics.a.a(z6.a.q((116.0f * fPow2) - 16.0f, 0.0f, 100.0f), z6.a.q((fPow - fPow2) * 500.0f, -128.0f, 128.0f), z6.a.q((fPow2 - (f16 > 0.008856452f ? (float) Math.pow(f16, 0.33333334f) : (f16 * 7.787037f) + 0.13793103f)) * 200.0f, -128.0f, 128.0f), f13, dVar);
    }
}
