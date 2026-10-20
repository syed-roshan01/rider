package m9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f11922b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0[] f11923a;
    private volatile int notCompletedCount;

    public e(h0[] h0VarArr) {
        this.f11923a = h0VarArr;
        this.notCompletedCount = h0VarArr.length;
    }
}
