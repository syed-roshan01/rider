package i8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import l.z2;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f8155b = Logger.getLogger(k.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f8156c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f8157d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f8158a;

    static {
        Logger logger;
        Object obj;
        Provider provider;
        k kVar;
        k hVar;
        int i10;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i11 = 0;
        loop0: while (true) {
            logger = f8155b;
            obj = null;
            if (i11 >= length) {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider2 = providers[i11];
            for (String str : f8156c) {
                if (str.equals(provider2.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i11++;
        }
        if (provider != null) {
            int i12 = 23;
            z2 z2Var = new z2(obj, "setUseSessionTickets", new Class[]{Boolean.TYPE}, i12);
            z2 z2Var2 = new z2(obj, "setHostname", new Class[]{String.class}, i12);
            z2 z2Var3 = new z2(byte[].class, "getAlpnSelectedProtocol", new Class[0], i12);
            z2 z2Var4 = new z2(obj, "setAlpnProtocols", new Class[]{byte[].class}, i12);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    k.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e4) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e4);
                    try {
                        k.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        i10 = 2;
                    } catch (ClassNotFoundException e10) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e10);
                        i10 = 3;
                    }
                }
            }
            i10 = 1;
            hVar = new g(z2Var, z2Var2, z2Var3, z2Var4, provider, i10);
        } else {
            try {
                Provider provider3 = SSLContext.getDefault().getProvider();
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                    sSLContext.init(null, null, null);
                    ((Method) AccessController.doPrivileged(new f(0))).invoke(sSLContext.createSSLEngine(), new Object[0]);
                    hVar = new h(provider3, (Method) AccessController.doPrivileged(new f(1)), (Method) AccessController.doPrivileged(new f(2)));
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused2) {
                    try {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        kVar = new i(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
                    } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                        kVar = new k(provider3);
                    }
                    hVar = kVar;
                }
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(e11);
            }
        }
        f8157d = hVar;
    }

    public k(Provider provider) {
        this.f8158a = provider;
    }

    public static byte[] b(List list) {
        ja.g gVar = new ja.g();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = (l) list.get(i10);
            if (lVar != l.HTTP_1_0) {
                gVar.h0(lVar.f8164a.length());
                gVar.n0(lVar.f8164a);
            }
        }
        return gVar.M(gVar.f8534b);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }

    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public int e() {
        return 3;
    }
}
