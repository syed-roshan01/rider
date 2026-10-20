package ba;

import d7.t;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import k6.w4;
import r8.r;
import x9.s;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x9.a f2832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4 f2833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x9.e f2834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x9.n f2835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f2836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f2838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f2839h;

    public n(x9.a aVar, w4 w4Var, i iVar, x9.n nVar) {
        List listJ;
        d7.a.m(aVar, "address");
        d7.a.m(w4Var, "routeDatabase");
        d7.a.m(iVar, "call");
        d7.a.m(nVar, "eventListener");
        this.f2832a = aVar;
        this.f2833b = w4Var;
        this.f2834c = iVar;
        this.f2835d = nVar;
        r rVar = r.f13661a;
        this.f2836e = rVar;
        this.f2838g = rVar;
        this.f2839h = new ArrayList();
        s sVar = aVar.f16327i;
        d7.a.m(sVar, "url");
        Proxy proxy = aVar.f16325g;
        if (proxy != null) {
            listJ = t.d0(proxy);
        } else {
            URI uriG = sVar.g();
            if (uriG.getHost() == null) {
                listJ = y9.b.j(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = aVar.f16326h.select(uriG);
                List<Proxy> list = listSelect;
                if (list == null || list.isEmpty()) {
                    listJ = y9.b.j(Proxy.NO_PROXY);
                } else {
                    d7.a.l(listSelect, "proxiesOrNull");
                    listJ = y9.b.u(listSelect);
                }
            }
        }
        this.f2836e = listJ;
        this.f2837f = 0;
    }

    public final boolean a() {
        return (this.f2837f < this.f2836e.size()) || (this.f2839h.isEmpty() ^ true);
    }
}
