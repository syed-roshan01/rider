package n8;

import e8.c2;
import e8.g0;
import e8.x;
import e8.x0;
import e8.y;
import e8.y0;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f12289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f12290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f12292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y0 f12293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e8.i f12294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f12295g;

    public n(p pVar, x0 x0Var) {
        this.f12295g = pVar;
        this.f12289a = x0Var;
        this.f12294f = x0Var.d();
    }

    @Override // e8.x0
    public final List b() {
        return this.f12289a.b();
    }

    @Override // e8.x0
    public final e8.c c() {
        g gVar = this.f12290b;
        x0 x0Var = this.f12289a;
        if (gVar == null) {
            return x0Var.c();
        }
        e8.c cVarC = x0Var.c();
        cVarC.getClass();
        e8.b bVar = p.f12296k;
        g gVar2 = this.f12290b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(bVar, gVar2);
        for (Map.Entry entry : cVarC.f5207a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((e8.b) entry.getKey(), entry.getValue());
            }
        }
        return new e8.c(identityHashMap);
    }

    @Override // e8.x0
    public final e8.i d() {
        return this.f12289a.d();
    }

    @Override // e8.x0
    public final Object e() {
        return this.f12289a.e();
    }

    @Override // e8.x0
    public final void f() {
        this.f12289a.f();
    }

    @Override // e8.x0
    public final void g() {
        this.f12289a.g();
    }

    @Override // e8.x0
    public final void h(y0 y0Var) {
        this.f12293e = y0Var;
        this.f12289a.h(new v6.d(this, y0Var, 16));
    }

    @Override // e8.x0
    public final void i(List list) {
        x0 x0Var = this.f12289a;
        boolean zG = p.g(x0Var.b());
        p pVar = this.f12295g;
        if (zG && p.g(list)) {
            if (pVar.f12297c.containsValue(this.f12290b)) {
                g gVar = this.f12290b;
                gVar.getClass();
                this.f12290b = null;
                gVar.f12272f.remove(this);
            }
            SocketAddress socketAddress = (SocketAddress) ((g0) list.get(0)).f5259a.get(0);
            if (pVar.f12297c.containsKey(socketAddress)) {
                ((g) pVar.f12297c.get(socketAddress)).a(this);
            }
        } else if (!p.g(x0Var.b()) || p.g(list)) {
            if (!p.g(x0Var.b()) && p.g(list)) {
                SocketAddress socketAddress2 = (SocketAddress) ((g0) list.get(0)).f5259a.get(0);
                if (pVar.f12297c.containsKey(socketAddress2)) {
                    ((g) pVar.f12297c.get(socketAddress2)).a(this);
                }
            }
        } else if (pVar.f12297c.containsKey(a().f5259a.get(0))) {
            g gVar2 = (g) pVar.f12297c.get(a().f5259a.get(0));
            gVar2.getClass();
            this.f12290b = null;
            gVar2.f12272f.remove(this);
            gVar2.f12268b.n();
            gVar2.f12269c.n();
        }
        x0Var.i(list);
    }

    public final void j() {
        this.f12291c = true;
        y0 y0Var = this.f12293e;
        c2 c2Var = c2.f5224m;
        y3.e.G("The error status must not be OK", true ^ c2Var.e());
        y0Var.a(new y(x.f5396c, c2Var));
        this.f12294f.b(2, "Subchannel ejected: {0}", this);
    }

    public final String toString() {
        return "OutlierDetectionSubchannel{addresses=" + this.f12289a.b() + '}';
    }
}
