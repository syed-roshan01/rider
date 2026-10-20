package g8;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class l4 implements e8.w1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f6953d = Logger.getLogger(l4.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k4 f6954e = new k4();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x9.v f6955f = new x9.v(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q6.m f6956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k4 f6957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f6958c;

    public l4() {
        String str = System.getenv("GRPC_PROXY_EXP");
        x9.v vVar = f6955f;
        vVar.getClass();
        this.f6956a = vVar;
        k4 k4Var = f6954e;
        k4Var.getClass();
        this.f6957b = k4Var;
        if (str == null) {
            this.f6958c = null;
            return;
        }
        String[] strArrSplit = str.split(":", 2);
        int i10 = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        f6953d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.f6958c = new InetSocketAddress(strArrSplit[0], i10);
    }

    @Override // e8.w1
    public final e8.k0 a(InetSocketAddress inetSocketAddress) {
        URL url;
        e8.k0 k0Var;
        if (!(inetSocketAddress instanceof InetSocketAddress)) {
            return null;
        }
        InetSocketAddress inetSocketAddress2 = this.f6958c;
        if (inetSocketAddress2 != null) {
            int i10 = e8.k0.f5293e;
            y3.e.J(inetSocketAddress, "targetAddress");
            return new e8.k0(inetSocketAddress2, inetSocketAddress, null, null);
        }
        Logger logger = f6953d;
        try {
            try {
                URI uri = new URI("https", null, s1.d(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = (ProxySelector) this.f6956a.get();
                if (proxySelector == null) {
                    logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> listSelect = proxySelector.select(uri);
                if (listSelect.size() > 1) {
                    logger.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = listSelect.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                String strD = s1.d(inetSocketAddress3);
                InetAddress address = inetSocketAddress3.getAddress();
                int port = inetSocketAddress3.getPort();
                this.f6957b.getClass();
                try {
                    url = new URL("https", strD, port, "");
                } catch (MalformedURLException unused) {
                    logger.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", strD});
                    url = null;
                }
                PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strD, address, port, "https", "", null, url, Authenticator.RequestorType.PROXY);
                if (inetSocketAddress3.isUnresolved()) {
                    inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                }
                int i11 = e8.k0.f5293e;
                if (passwordAuthenticationRequestPasswordAuthentication == null) {
                    k0Var = new e8.k0(inetSocketAddress3, inetSocketAddress, null, null);
                } else {
                    k0Var = new e8.k0(inetSocketAddress3, inetSocketAddress, passwordAuthenticationRequestPasswordAuthentication.getUserName(), passwordAuthenticationRequestPasswordAuthentication.getPassword() != null ? new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()) : null);
                }
                return k0Var;
            } catch (URISyntaxException e4) {
                logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e4);
                return null;
            }
        } catch (Throwable th) {
            logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }
}
