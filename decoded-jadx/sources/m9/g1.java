package m9;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient f1 f11947a;

    public g1(String str, Throwable th, f1 f1Var) {
        super(str);
        this.f11947a = f1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof g1) {
                g1 g1Var = (g1) obj;
                if (!d7.a.d(g1Var.getMessage(), getMessage()) || !d7.a.d(g1Var.f11947a, this.f11947a) || !d7.a.d(g1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        d7.a.j(message);
        int iHashCode = (this.f11947a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f11947a;
    }
}
