package x9;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f16377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f16378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f16379c;

    public d0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        d7.a.m(aVar, "address");
        d7.a.m(inetSocketAddress, "socketAddress");
        this.f16377a = aVar;
        this.f16378b = proxy;
        this.f16379c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (d7.a.d(d0Var.f16377a, this.f16377a) && d7.a.d(d0Var.f16378b, this.f16378b) && d7.a.d(d0Var.f16379c, this.f16379c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16379c.hashCode() + ((this.f16378b.hashCode() + ((this.f16377a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f16379c + '}';
    }
}
