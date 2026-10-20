package t2;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o f14625k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f14631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f14632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f14633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f14634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f14635j;

    static {
        float[] fArr = b.f14602c;
        float f10 = (float) ((((double) b.f()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f14600a;
        float f11 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f12 = fArr3[0] * f11;
        float f13 = fArr[1];
        float f14 = (fArr3[1] * f13) + f12;
        float f15 = fArr[2];
        float f16 = (fArr3[2] * f15) + f14;
        float[] fArr4 = fArr2[1];
        float f17 = (fArr4[2] * f15) + (fArr4[1] * f13) + (fArr4[0] * f11);
        float[] fArr5 = fArr2[2];
        float f18 = (f15 * fArr5[2]) + (f13 * fArr5[1]) + (f11 * fArr5[0]);
        float f19 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-f10) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = fExp;
        if (d10 > 1.0d) {
            fExp = 1.0f;
        } else if (d10 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp, (((100.0f / f18) * fExp) + 1.0f) - fExp};
        float f20 = 1.0f / ((5.0f * f10) + 1.0f);
        float f21 = f20 * f20 * f20 * f20;
        float f22 = 1.0f - f21;
        float fCbrt = (0.1f * f22 * f22 * ((float) Math.cbrt(((double) f10) * 5.0d))) + (f21 * f10);
        float f23 = b.f() / fArr[1];
        double d11 = f23;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float fPow2 = (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f18)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f16)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f17)) / 100.0d, 0.42d), fPow2};
        float f24 = fArr7[0];
        float f25 = fArr7[1];
        f14625k = new o(f23, ((((400.0f * fPow2) / (fPow2 + 27.13f)) * 0.05f) + (((f24 * 400.0f) / (f24 + 27.13f)) * 2.0f) + ((f25 * 400.0f) / (f25 + 27.13f))) * fPow, fPow, fPow, f19, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public o(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f14631f = f10;
        this.f14626a = f11;
        this.f14627b = f12;
        this.f14628c = f13;
        this.f14629d = f14;
        this.f14630e = f15;
        this.f14632g = fArr;
        this.f14633h = f16;
        this.f14634i = f17;
        this.f14635j = f18;
    }
}
