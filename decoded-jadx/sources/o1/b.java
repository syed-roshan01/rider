package o1;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f12347a = new b();

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
