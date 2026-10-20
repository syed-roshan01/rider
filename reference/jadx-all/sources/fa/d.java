package fa;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public final class d extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f6397d = new v(26, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f6398e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f6399c = new BouncyCastleJsseProvider();

    static {
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, v.class.getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f6398e = z10;
    }

    @Override // fa.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        d7.a.m(list, "protocols");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            super.d(sSLSocket, str, list);
            return;
        }
        BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
        BCSSLParameters parameters = bCSSLSocket.getParameters();
        parameters.setApplicationProtocols((String[]) l.c(list).toArray(new String[0]));
        bCSSLSocket.setParameters(parameters);
    }

    @Override // fa.m
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        if (!(sSLSocket instanceof BCSSLSocket) || (applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol()) == null || d7.a.d(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // fa.m
    public final SSLContext k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f6399c);
        d7.a.l(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // fa.m
    public final X509TrustManager m() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        d7.a.j(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                d7.a.k(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        d7.a.l(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }
}
