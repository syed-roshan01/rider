package m9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class m extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f11968c = AtomicIntegerFieldUpdater.newUpdater(m.class, "_resumed");
    private volatile int _resumed;

    public m(u8.e eVar, Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + eVar + " was cancelled normally");
        }
        super(th, z10);
        this._resumed = 0;
    }
}
