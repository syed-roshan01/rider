package x9;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f16319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f16320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f16321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f16322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f16323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f16324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Proxy f16325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProxySelector f16326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f16327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f16328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f16329k;

    public a(String str, int i10, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, ia.c cVar, f fVar, n nVar2, List list, List list2, ProxySelector proxySelector) {
        d7.a.m(str, "uriHost");
        d7.a.m(nVar, "dns");
        d7.a.m(socketFactory, "socketFactory");
        d7.a.m(nVar2, "proxyAuthenticator");
        d7.a.m(list, "protocols");
        d7.a.m(list2, "connectionSpecs");
        d7.a.m(proxySelector, "proxySelector");
        this.f16319a = nVar;
        this.f16320b = socketFactory;
        this.f16321c = sSLSocketFactory;
        this.f16322d = cVar;
        this.f16323e = fVar;
        this.f16324f = nVar2;
        this.f16325g = null;
        this.f16326h = proxySelector;
        r rVar = new r();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (l9.i.K0(str2, "http")) {
            rVar.f16446a = "http";
        } else {
            if (!l9.i.K0(str2, "https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            rVar.f16446a = "https";
        }
        String strX0 = h6.g.x0(q8.k.n(str, 0, 0, false, 7));
        if (strX0 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        rVar.f16449d = strX0;
        if (1 > i10 || i10 >= 65536) {
            throw new IllegalArgumentException(l.q.g("unexpected port: ", i10).toString());
        }
        rVar.f16450e = i10;
        this.f16327i = rVar.a();
        this.f16328j = y9.b.u(list);
        this.f16329k = y9.b.u(list2);
    }

    public final boolean a(a aVar) {
        d7.a.m(aVar, "that");
        return d7.a.d(this.f16319a, aVar.f16319a) && d7.a.d(this.f16324f, aVar.f16324f) && d7.a.d(this.f16328j, aVar.f16328j) && d7.a.d(this.f16329k, aVar.f16329k) && d7.a.d(this.f16326h, aVar.f16326h) && d7.a.d(this.f16325g, aVar.f16325g) && d7.a.d(this.f16321c, aVar.f16321c) && d7.a.d(this.f16322d, aVar.f16322d) && d7.a.d(this.f16323e, aVar.f16323e) && this.f16327i.f16459e == aVar.f16327i.f16459e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (d7.a.d(this.f16327i, aVar.f16327i) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f16323e) + ((Objects.hashCode(this.f16322d) + ((Objects.hashCode(this.f16321c) + ((Objects.hashCode(this.f16325g) + ((this.f16326h.hashCode() + ((this.f16329k.hashCode() + ((this.f16328j.hashCode() + ((this.f16324f.hashCode() + ((this.f16319a.hashCode() + a7.a.i(this.f16327i.f16463i, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        s sVar = this.f16327i;
        sb.append(sVar.f16458d);
        sb.append(':');
        sb.append(sVar.f16459e);
        sb.append(", ");
        Proxy proxy = this.f16325g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f16326h;
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
