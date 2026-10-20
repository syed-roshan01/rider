package fa;

import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import x9.w;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile m f6417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f6418b;

    /* JADX WARN: Code duplicated, block: B:27:0x0092 A[PHI: r1
  0x0092: PHI (r1v18 fa.m) = (r1v16 fa.m), (r1v21 fa.m) binds: [B:34:0x00b6, B:26:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    static {
        j jVar;
        m mVarH;
        m dVar;
        if (d7.a.d("Dalvik", System.getProperty("java.vm.name"))) {
            for (Map.Entry entry : ga.c.f7317b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (ga.c.f7316a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(ga.d.f7318a);
                }
            }
            mVarH = a.f6388d.h();
            if (mVarH == null) {
                mVarH = c.f6393e.h();
                d7.a.j(mVarH);
            }
        } else if (d7.a.d("Conscrypt", Security.getProviders()[0].getName())) {
            dVar = g.f6401d ? new g() : null;
            if (dVar != null) {
                mVarH = dVar;
            } else {
                if (d7.a.d("BC", Security.getProviders()[0].getName())) {
                    if (d.f6397d.C()) {
                        dVar = new d();
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        mVarH = dVar;
                    }
                }
                if (d7.a.d("OpenJSSE", Security.getProviders()[0].getName())) {
                    if (k.f6413d.C()) {
                        mVarH = new k();
                    } else {
                        mVarH = null;
                    }
                    if (mVarH == null) {
                        if (j.f6412c) {
                        }
                        if (jVar != null) {
                            mVarH = jVar;
                        } else {
                            mVarH = i.f6406h.h();
                            if (mVarH == null) {
                                mVarH = new m();
                            }
                        }
                    }
                } else {
                    if (j.f6412c) {
                    }
                    if (jVar != null) {
                        mVarH = jVar;
                    } else {
                        mVarH = i.f6406h.h();
                        if (mVarH == null) {
                            mVarH = new m();
                        }
                    }
                }
            }
        } else {
            if (d7.a.d("BC", Security.getProviders()[0].getName())) {
                if (d.f6397d.C()) {
                    dVar = new d();
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    mVarH = dVar;
                }
            }
            if (d7.a.d("OpenJSSE", Security.getProviders()[0].getName())) {
                jVar = j.f6412c ? new j() : null;
                if (jVar != null) {
                    mVarH = jVar;
                } else {
                    mVarH = i.f6406h.h();
                    if (mVarH == null) {
                        mVarH = new m();
                    }
                }
            } else {
                if (k.f6413d.C()) {
                    mVarH = new k();
                } else {
                    mVarH = null;
                }
                if (mVarH == null) {
                    if (j.f6412c) {
                    }
                    if (jVar != null) {
                        mVarH = jVar;
                    } else {
                        mVarH = i.f6406h.h();
                        if (mVarH == null) {
                            mVarH = new m();
                        }
                    }
                }
            }
        }
        f6417a = mVarH;
        f6418b = Logger.getLogger(w.class.getName());
    }

    public static void i(int i10, String str, Throwable th) {
        d7.a.m(str, "message");
        f6418b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public f6.a b(X509TrustManager x509TrustManager) {
        return new ia.a(c(x509TrustManager));
    }

    public ia.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        d7.a.l(acceptedIssuers, "trustManager.acceptedIssuers");
        return new ia.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        d7.a.m(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        d7.a.m(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f6418b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        d7.a.m(str, "hostname");
        return true;
    }

    public void j(Object obj, String str) {
        d7.a.m(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        d7.a.l(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextK = k();
            sSLContextK.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
            d7.a.l(socketFactory, "newSSLContext().apply {\n\u2026ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e4) {
            throw new AssertionError("No System TLS: " + e4, e4);
        }
    }

    public X509TrustManager m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }
}
