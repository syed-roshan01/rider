package x9;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import u.e1;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f16440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f16441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f16442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q8.i f16443d;

    public o(e0 e0Var, g gVar, List list, c9.a aVar) {
        d7.a.m(e0Var, "tlsVersion");
        d7.a.m(gVar, "cipherSuite");
        d7.a.m(list, "localCertificates");
        this.f16440a = e0Var;
        this.f16441b = gVar;
        this.f16442c = list;
        this.f16443d = new q8.i(new e1(aVar, 10));
    }

    public final List a() {
        return (List) this.f16443d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (oVar.f16440a == this.f16440a && d7.a.d(oVar.f16441b, this.f16441b) && d7.a.d(oVar.a(), a()) && d7.a.d(oVar.f16442c, this.f16442c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16442c.hashCode() + ((a().hashCode() + ((this.f16441b.hashCode() + ((this.f16440a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(f9.a.y0(listA));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                d7.a.l(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f16440a);
        sb.append(" cipherSuite=");
        sb.append(this.f16441b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f16442c;
        ArrayList arrayList2 = new ArrayList(f9.a.y0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                d7.a.l(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
