package f1;

/* JADX INFO: loaded from: classes.dex */
public final class t extends d {
    public static float g(float f10) {
        return z6.a.q(f10, -2.0f, 2.0f);
    }

    @Override // f1.d
    public final float a(int i10) {
        return 2.0f;
    }

    @Override // f1.d
    public final float b(int i10) {
        return -2.0f;
    }

    @Override // f1.d
    public final long d(float f10, float f11, float f12) {
        float fG = g(f10);
        return (((long) Float.floatToRawIntBits(g(f11))) & 4294967295L) | (Float.floatToRawIntBits(fG) << 32);
    }

    @Override // f1.d
    public final float e(float f10, float f11, float f12) {
        return g(f12);
    }

    @Override // f1.d
    public final long f(float f10, float f11, float f12, float f13, d dVar) {
        return androidx.compose.ui.graphics.a.a(g(f10), g(f11), g(f12), f13, dVar);
    }
}
