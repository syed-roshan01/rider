package ga;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fa.l f7326a = new fa.l(4, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f7327b = new g();

    @Override // ga.n
    public final boolean a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // ga.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || d7.a.d(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // ga.n
    public final boolean c() {
        return fa.d.f6397d.C();
    }

    @Override // ga.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        d7.a.m(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            fa.m mVar = fa.m.f6417a;
            parameters.setApplicationProtocols((String[]) fa.l.c(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
