package h8;

import g8.s1;
import java.net.URI;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f7713b = Logger.getLogger(q.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f7714c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8.k f7715a;

    static {
        q qVar;
        i8.k kVar = i8.k.f8157d;
        ClassLoader classLoader = q.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e4) {
            Level level = Level.FINE;
            Logger logger = f7713b;
            logger.log(level, "Unable to find Conscrypt. Skipping", (Throwable) e4);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e10) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e10);
                qVar = new q(kVar);
            }
        }
        qVar = new p(kVar);
        f7714c = qVar;
    }

    public q(i8.k kVar) {
        y3.e.J(kVar, "platform");
        this.f7715a = kVar;
    }

    public static boolean c(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            URI uriA = s1.a(str);
            y3.e.E(str, "No host in authority '%s'", uriA.getHost() != null);
            y3.e.E(str, "Userinfo must not be present on authority: '%s'", uriA.getUserInfo() == null);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
        this.f7715a.c(sSLSocket, str, list);
    }

    public String b(SSLSocket sSLSocket) {
        return this.f7715a.d(sSLSocket);
    }

    public String d(SSLSocket sSLSocket, String str, List list) {
        i8.k kVar = this.f7715a;
        if (list != null) {
            a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strB = b(sSLSocket);
            if (strB != null) {
                kVar.a(sSLSocket);
                return strB;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } catch (Throwable th) {
            kVar.a(sSLSocket);
            throw th;
        }
    }
}
