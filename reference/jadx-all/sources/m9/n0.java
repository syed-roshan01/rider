package m9;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Future f11976a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f11976a = scheduledFuture;
    }

    @Override // m9.o0
    public final void a() {
        this.f11976a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f11976a + ']';
    }
}
