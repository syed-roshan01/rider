package ga;

import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7319a = "com.google.android.gms.org.conscrypt";

    @Override // ga.l
    public final boolean a(SSLSocket sSLSocket) {
        return l9.i.h1(sSLSocket.getClass().getName(), this.f7319a + '.', false);
    }

    @Override // ga.l
    public final n b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!d7.a.d(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new f(superclass);
    }
}
