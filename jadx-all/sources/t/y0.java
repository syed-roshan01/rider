package t;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14354a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i10, int i11) {
        super("Mutation interrupted");
        this.f14354a = i10;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f14354a) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 1:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 2:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 3:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 4:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(new StackTraceElement[0]);
                break;
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(int i10) {
        super("The coroutine scope left the composition");
        this.f14354a = i10;
        if (i10 == 3) {
            super("The Modifier.Node was detached");
            return;
        }
        if (i10 == 4) {
            super("Pointer input was reset");
        } else if (i10 != 5) {
        } else {
            super("Child of the scoped flow was cancelled");
        }
    }
}
