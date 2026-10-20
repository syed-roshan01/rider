package t;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f14120a = new w(0.4f, 0.2f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f14121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f14122c;

    /* JADX WARN: Type inference failed for: r0v6, types: [t.b0] */
    static {
        if (Float.isNaN(0.0f) || Float.isNaN(0.0f) || Float.isNaN(0.2f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.0, 0.0, 0.2, 1.0.".toString());
        }
        f14121b = new w(0.4f, 1.0f);
        final int i10 = 6;
        f14122c = new a0() { // from class: t.b0
            @Override // t.a0
            public final float a(float f10) {
                float f11;
                float f12;
                switch (i10) {
                    case 3:
                        if (f10 < 0.36363637f) {
                            return 7.5625f * f10 * f10;
                        }
                        if (f10 < 0.72727275f) {
                            float f13 = f10 - 0.54545456f;
                            f11 = 7.5625f * f13 * f13;
                            f12 = 0.75f;
                        } else if (f10 < 0.90909094f) {
                            float f14 = f10 - 0.8181818f;
                            f11 = 7.5625f * f14 * f14;
                            f12 = 0.9375f;
                        } else {
                            float f15 = f10 - 0.95454544f;
                            f11 = 7.5625f * f15 * f15;
                            f12 = 0.984375f;
                        }
                        return f11 + f12;
                    default:
                        w wVar = d0.f14120a;
                        return f10;
                }
            }
        };
    }
}
