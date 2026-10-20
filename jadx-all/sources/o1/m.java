package o1;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class m extends CancellationException {
    public m(long j10) {
        super("Timed out waiting for " + j10 + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
