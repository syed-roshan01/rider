package fa;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import x9.v;
import x9.x;

/* JADX INFO: loaded from: classes.dex */
public final class i extends m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v f6406h = new v(27, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f6407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f6408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f6409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f6410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f6411g;

    public i(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f6407c = method;
        this.f6408d = method2;
        this.f6409e = method3;
        this.f6410f = cls;
        this.f6411g = cls2;
    }

    @Override // fa.m
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f6409e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to remove ALPN", e4);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        }
    }

    @Override // fa.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        d7.a.m(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((x) obj) != x.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(f9.a.y0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x) it.next()).f16500a);
        }
        try {
            this.f6407c.invoke(null, sSLSocket, Proxy.newProxyInstance(m.class.getClassLoader(), new Class[]{this.f6410f, this.f6411g}, new h(arrayList2)));
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to set ALPN", e4);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        }
    }

    @Override // fa.m
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f6408d.invoke(null, sSLSocket));
            d7.a.k(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            h hVar = (h) invocationHandler;
            boolean z10 = hVar.f6404b;
            if (!z10 && hVar.f6405c == null) {
                m.i(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z10) {
                return null;
            }
            return hVar.f6405c;
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to get ALPN selected protocol", e4);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        }
    }
}
