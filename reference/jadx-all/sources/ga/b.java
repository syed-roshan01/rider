package ga;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f6.a {
    public final X509TrustManagerExtensions A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final X509TrustManager f7315z;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f7315z = x509TrustManager;
        this.A = x509TrustManagerExtensions;
    }

    @Override // f6.a
    public final List A(String str, List list) throws SSLPeerUnverifiedException {
        d7.a.m(list, "chain");
        d7.a.m(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.A.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            d7.a.l(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e4) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e4.getMessage());
            sSLPeerUnverifiedException.initCause(e4);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f7315z == this.f7315z;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f7315z);
    }
}
