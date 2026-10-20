package androidx.concurrent.futures;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f1768d = new e(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f1769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f1770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f1771c;

    public e(Runnable runnable, Executor executor) {
        this.f1769a = runnable;
        this.f1770b = executor;
    }
}
