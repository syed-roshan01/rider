package ja;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Socket f8532m;

    public f0(Socket socket) {
        this.f8532m = socket;
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
        Socket socket = this.f8532m;
        try {
            socket.close();
        } catch (AssertionError e4) {
            if (!r9.a.g(e4)) {
                throw e4;
            }
            v.f8575a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e4);
        } catch (Exception e10) {
            v.f8575a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        }
    }
}
