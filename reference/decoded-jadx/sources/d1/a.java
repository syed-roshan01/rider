package d1;

import d7.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f4320a = f6.a.d(0.0f, 0.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4321b = 0;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static String d(long j10) {
        if (b(j10) == c(j10)) {
            return "CornerRadius.circular(" + t.w0(b(j10)) + ')';
        }
        return "CornerRadius.elliptical(" + t.w0(b(j10)) + ", " + t.w0(c(j10)) + ')';
    }
}
