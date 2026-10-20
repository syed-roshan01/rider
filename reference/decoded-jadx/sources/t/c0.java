package t;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f14095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f14096b;

    static {
        if (Float.isNaN(0.25f) || Float.isNaN(0.1f) || Float.isNaN(0.25f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.25, 0.1, 0.25, 1.0.".toString());
        }
        if (Float.isNaN(0.0f) || Float.isNaN(0.0f) || Float.isNaN(0.58f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.0, 0.0, 0.58, 1.0.".toString());
        }
        if (Float.isNaN(0.42f) || Float.isNaN(0.0f) || Float.isNaN(1.0f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.42, 0.0, 1.0, 1.0.".toString());
        }
        f14095a = new w(0.42f, 0.58f);
        if (Float.isNaN(0.12f) || Float.isNaN(0.0f) || Float.isNaN(0.39f) || Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.12, 0.0, 0.39, 0.0.".toString());
        }
        if (Float.isNaN(0.61f) || Float.isNaN(1.0f) || Float.isNaN(0.88f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.61, 1.0, 0.88, 1.0.".toString());
        }
        if (Float.isNaN(0.37f) || Float.isNaN(0.0f) || Float.isNaN(0.63f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.37, 0.0, 0.63, 1.0.".toString());
        }
        if (Float.isNaN(0.32f) || Float.isNaN(0.0f) || Float.isNaN(0.67f) || Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.32, 0.0, 0.67, 0.0.".toString());
        }
        if (Float.isNaN(0.33f) || Float.isNaN(1.0f) || Float.isNaN(0.68f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.33, 1.0, 0.68, 1.0.".toString());
        }
        f14096b = new w(0.65f, 0.35f);
        if (Float.isNaN(0.64f) || Float.isNaN(0.0f) || Float.isNaN(0.78f) || Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.64, 0.0, 0.78, 0.0.".toString());
        }
        if (Float.isNaN(0.22f) || Float.isNaN(1.0f) || Float.isNaN(0.36f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.22, 1.0, 0.36, 1.0.".toString());
        }
        if (Float.isNaN(0.83f) || Float.isNaN(0.0f) || Float.isNaN(0.17f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.83, 0.0, 0.17, 1.0.".toString());
        }
        if (Float.isNaN(0.55f) || Float.isNaN(0.0f) || Float.isNaN(1.0f) || Float.isNaN(0.45f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.55, 0.0, 1.0, 0.45.".toString());
        }
        if (Float.isNaN(0.0f) || Float.isNaN(0.55f) || Float.isNaN(0.45f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.0, 0.55, 0.45, 1.0.".toString());
        }
        if (Float.isNaN(0.85f) || Float.isNaN(0.0f) || Float.isNaN(0.15f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.85, 0.0, 0.15, 1.0.".toString());
        }
        if (Float.isNaN(0.11f) || Float.isNaN(0.0f) || Float.isNaN(0.5f) || Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.11, 0.0, 0.5, 0.0.".toString());
        }
        if (Float.isNaN(0.5f) || Float.isNaN(1.0f) || Float.isNaN(0.89f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.5, 1.0, 0.89, 1.0.".toString());
        }
        if (Float.isNaN(0.45f) || Float.isNaN(0.0f) || Float.isNaN(0.55f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.45, 0.0, 0.55, 1.0.".toString());
        }
        if (Float.isNaN(0.5f) || Float.isNaN(0.0f) || Float.isNaN(0.75f) || Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.5, 0.0, 0.75, 0.0.".toString());
        }
        if (Float.isNaN(0.25f) || Float.isNaN(1.0f) || Float.isNaN(0.5f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.25, 1.0, 0.5, 1.0.".toString());
        }
        if (Float.isNaN(0.76f) || Float.isNaN(0.0f) || Float.isNaN(0.24f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.76, 0.0, 0.24, 1.0.".toString());
        }
        if (Float.isNaN(0.7f) || Float.isNaN(0.0f) || Float.isNaN(0.84f) || Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.7, 0.0, 0.84, 0.0.".toString());
        }
        if (Float.isNaN(0.16f) || Float.isNaN(1.0f) || Float.isNaN(0.3f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.16, 1.0, 0.3, 1.0.".toString());
        }
        if (Float.isNaN(0.87f) || Float.isNaN(0.0f) || Float.isNaN(0.13f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.87, 0.0, 0.13, 1.0.".toString());
        }
        if (Float.isNaN(0.36f) || Float.isNaN(0.0f) || Float.isNaN(0.66f) || Float.isNaN(-0.56f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.36, 0.0, 0.66, -0.56.".toString());
        }
        if (Float.isNaN(0.34f) || Float.isNaN(1.56f) || Float.isNaN(0.64f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.34, 1.56, 0.64, 1.0.".toString());
        }
        if (Float.isNaN(0.68f) || Float.isNaN(-0.6f) || Float.isNaN(0.32f) || Float.isNaN(1.6f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.68, -0.6, 0.32, 1.6.".toString());
        }
    }
}
