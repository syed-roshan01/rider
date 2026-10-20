package fa;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ia.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f6391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f6392b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f6391a = x509TrustManager;
        this.f6392b = method;
    }

    @Override // ia.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.f6392b.invoke(this.f6391a, x509Certificate);
            d7.a.k(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e4) {
            throw new AssertionError("unable to get issues and signature", e4);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return d7.a.d(this.f6391a, bVar.f6391a) && d7.a.d(this.f6392b, bVar.f6392b);
    }

    public final int hashCode() {
        return this.f6392b.hashCode() + (this.f6391a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f6391a + ", findByIssuerAndSignatureMethod=" + this.f6392b + ')';
    }
}
