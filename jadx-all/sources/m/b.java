package m;

import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static volatile b f11434y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f11435x = new e();

    public static b o0() {
        if (f11434y != null) {
            return f11434y;
        }
        synchronized (b.class) {
            try {
                if (f11434y == null) {
                    f11434y = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f11434y;
    }
}
