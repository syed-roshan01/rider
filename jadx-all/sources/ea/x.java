package ea;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class x extends ja.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f5543m;

    public x(y yVar) {
        this.f5543m = yVar;
    }

    @Override // ja.d
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // ja.d
    public final void k() {
        this.f5543m.e(b.CANCEL);
        r rVar = this.f5543m.f5545b;
        synchronized (rVar) {
            long j10 = rVar.f5509w;
            long j11 = rVar.f5508v;
            if (j10 < j11) {
                return;
            }
            rVar.f5508v = j11 + 1;
            rVar.f5510x = System.nanoTime() + ((long) 1000000000);
            rVar.f5502p.c(new aa.b(2, rVar, a7.a.p(new StringBuilder(), rVar.f5497d, " ping")), 0L);
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
