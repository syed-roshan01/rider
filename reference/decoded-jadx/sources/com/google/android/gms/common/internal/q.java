package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q f3374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f3375c = new r(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f3376a;

    public static synchronized q a() {
        try {
            if (f3374b == null) {
                f3374b = new q();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3374b;
    }
}
