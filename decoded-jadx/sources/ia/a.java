package ia;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f6.a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final d f8191z;

    public a(d dVar) {
        d7.a.m(dVar, "trustRootIndex");
        this.f8191z = dVar;
    }

    @Override // f6.a
    public final List A(String str, List list) throws SSLPeerUnverifiedException {
        d7.a.m(list, "chain");
        d7.a.m(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        d7.a.l(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            d7.a.k(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateA = this.f8191z.a(x509Certificate);
            if (x509CertificateA != null) {
                if (arrayList.size() > 1 || !d7.a.d(x509Certificate, x509CertificateA)) {
                    arrayList.add(x509CertificateA);
                }
                if (d7.a.d(x509CertificateA.getIssuerDN(), x509CertificateA.getSubjectDN())) {
                    try {
                        x509CertificateA.verify(x509CertificateA.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                z10 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                d7.a.l(it, "queue.iterator()");
                while (true) {
                    if (!it.hasNext()) {
                        if (z10) {
                            return arrayList;
                        }
                        throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                    }
                    Object next = it.next();
                    d7.a.k(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (d7.a.d(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                            break;
                        } catch (GeneralSecurityException unused2) {
                            continue;
                        }
                    }
                }
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && d7.a.d(((a) obj).f8191z, this.f8191z);
    }

    public final int hashCode() {
        return this.f8191z.hashCode();
    }
}
