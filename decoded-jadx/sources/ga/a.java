package ga;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {
    @Override // ga.n
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // ga.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || d7.a.d(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // ga.n
    public final boolean c() {
        fa.m mVar = fa.m.f6417a;
        return d7.a.d("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29;
    }

    @Override // ga.n
    public final void d(SSLSocket sSLSocket, String str, List list) throws IOException {
        d7.a.m(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            fa.m mVar = fa.m.f6417a;
            sSLParameters.setApplicationProtocols((String[]) fa.l.c(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e4) {
            throw new IOException("Android internal error", e4);
        }
    }
}
