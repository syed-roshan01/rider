package f1;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f6020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f6021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f6022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f6023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f6024e = 0;

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f6020a = (((long) 0) & 4294967295L) | j11;
        f6021b = (((long) 1) & 4294967295L) | j11;
        f6022c = j11 | (((long) 2) & 4294967295L);
        f6023d = (j10 & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        if (a(j10, f6020a)) {
            return "Rgb";
        }
        if (a(j10, f6021b)) {
            return "Xyz";
        }
        if (a(j10, f6022c)) {
            return "Lab";
        }
        return a(j10, f6023d) ? "Cmyk" : "Unknown";
    }
}
