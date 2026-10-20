package i8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class i extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f8147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Method f8148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Method f8149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f8150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class f8151i;

    public i(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.f8147e = method;
        this.f8148f = method2;
        this.f8149g = method3;
        this.f8150h = cls;
        this.f8151i = cls2;
    }

    @Override // i8.k
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f8149g.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException e4) {
            k.f8155b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e4);
        }
    }

    @Override // i8.k
    public final void c(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = (l) list.get(i10);
            if (lVar != l.HTTP_1_0) {
                arrayList.add(lVar.f8164a);
            }
        }
        try {
            this.f8147e.invoke(null, sSLSocket, Proxy.newProxyInstance(k.class.getClassLoader(), new Class[]{this.f8150h, this.f8151i}, new j(arrayList)));
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        } catch (InvocationTargetException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // i8.k
    public final String d(SSLSocket sSLSocket) {
        try {
            j jVar = (j) Proxy.getInvocationHandler(this.f8148f.invoke(null, sSLSocket));
            boolean z10 = jVar.f8153b;
            if (!z10 && jVar.f8154c == null) {
                k.f8155b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (z10) {
                return null;
            }
            return jVar.f8154c;
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // i8.k
    public final int e() {
        return 1;
    }
}
