package ga;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public class f implements n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f7320f = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f7321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f7322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f7323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f7324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f7325e;

    public f(Class cls) throws NoSuchMethodException {
        this.f7321a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        d7.a.l(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f7322b = declaredMethod;
        this.f7323c = cls.getMethod("setHostname", String.class);
        this.f7324d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f7325e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // ga.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f7321a.isInstance(sSLSocket);
    }

    @Override // ga.n
    public final String b(SSLSocket sSLSocket) {
        if (!this.f7321a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f7324d.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, l9.a.f11393a);
            }
            return null;
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if ((cause instanceof NullPointerException) && d7.a.d(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e10);
        }
    }

    @Override // ga.n
    public final boolean c() {
        return fa.c.f6393e.C();
    }

    @Override // ga.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        d7.a.m(list, "protocols");
        if (this.f7321a.isInstance(sSLSocket)) {
            try {
                this.f7322b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f7323c.invoke(sSLSocket, str);
                }
                Method method = this.f7325e;
                fa.m mVar = fa.m.f6417a;
                method.invoke(sSLSocket, fa.l.f(list));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
    }
}
