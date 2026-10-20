package fa;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import ga.n;
import ga.o;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public final class c extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f6393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f6394f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f6395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ga.i f6396d;

    static {
        boolean z10 = false;
        z10 = false;
        f6393e = new v(25, z10 ? 1 : 0);
        if (d7.a.d("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f6394f = z10;
    }

    public c() throws NoSuchMethodException {
        o oVar;
        ga.l lVar;
        ga.l lVar2;
        Method method;
        Method method2;
        n[] nVarArr = new n[4];
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e4) {
            m.f6417a.getClass();
            m.i(5, "unable to load android socket classes", e4);
            oVar = null;
        }
        nVarArr[0] = oVar;
        nVarArr[1] = new ga.m(ga.f.f7320f);
        switch (ga.k.f7331a.f6416a) {
            case 4:
                lVar = ga.h.f7327b;
                break;
            default:
                lVar = ga.k.f7332b;
                break;
        }
        nVarArr[2] = new ga.m(lVar);
        switch (ga.h.f7326a.f6416a) {
            case 4:
                lVar2 = ga.h.f7327b;
                break;
            default:
                lVar2 = ga.k.f7332b;
                break;
        }
        nVarArr[3] = new ga.m(lVar2);
        ArrayList arrayListR = b9.b.R(nVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListR) {
            if (((n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f6395c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f6396d = new ga.i(method3, method2, method);
    }

    @Override // fa.m
    public final f6.a b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        ga.b bVar = x509TrustManagerExtensions != null ? new ga.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new ia.a(c(x509TrustManager));
    }

    @Override // fa.m
    public final ia.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // fa.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        d7.a.m(list, "protocols");
        Iterator it = this.f6395c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((n) next).a(sSLSocket));
        n nVar = (n) next;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // fa.m
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        d7.a.m(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e4;
            }
            throw new IOException("Exception in connect", e4);
        }
    }

    @Override // fa.m
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f6395c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((n) next).a(sSLSocket));
        n nVar = (n) next;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // fa.m
    public final Object g() {
        ga.i iVar = this.f6396d;
        iVar.getClass();
        Method method = iVar.f7328a;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, new Object[0]);
            Method method2 = iVar.f7329b;
            d7.a.j(method2);
            method2.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // fa.m
    public final boolean h(String str) {
        d7.a.m(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // fa.m
    public final void j(Object obj, String str) {
        d7.a.m(str, "message");
        ga.i iVar = this.f6396d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f7330c;
                d7.a.j(method);
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        m.i(5, str, null);
    }
}
