package l2;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11203c;

    static {
        a(0.0f);
        a(0.5f);
        f11201a = 0.5f;
        a(-1.0f);
        f11202b = -1.0f;
        a(1.0f);
        f11203c = 1.0f;
    }

    public static void a(float f10) {
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }
}
