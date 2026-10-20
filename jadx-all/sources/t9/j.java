package t9;

import java.util.concurrent.TimeUnit;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f14699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f14701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f14702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f14703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f14704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v f14705h;

    static {
        String property;
        int i10 = r9.v.f13730a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f14698a = property;
        f14699b = r9.a.q("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = r9.v.f13730a;
        if (i11 < 2) {
            i11 = 2;
        }
        f14700c = r9.a.r("kotlinx.coroutines.scheduler.core.pool.size", i11, 1, 0, 8);
        f14701d = r9.a.r("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f14702e = TimeUnit.SECONDS.toNanos(r9.a.q("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f14703f = f.f14693s;
        f14704g = new v(0);
        f14705h = new v(1);
    }
}
