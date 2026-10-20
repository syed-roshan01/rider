package x2;

import android.os.OutcomeReceiver;
import d7.t;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u8.e f16295a;

    public i(m9.l lVar) {
        super(false);
        this.f16295a = lVar;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f16295a.resumeWith(t.N(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f16295a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
