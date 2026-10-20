package g8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class k3 extends e8.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.u0 f6899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.q0 f6900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f6901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f6902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f6903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j2 f6904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v6.d f6907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l3 f6908j;

    public k3(l3 l3Var, e8.u0 u0Var) {
        this.f6908j = l3Var;
        this.f6903e = u0Var.f5372b;
        Logger logger = l3.f6919b0;
        l3Var.getClass();
        this.f6899a = u0Var;
        e8.q0 q0Var = new e8.q0("Subchannel", l3Var.f6946t.g(), e8.q0.f5342d.incrementAndGet());
        this.f6900b = q0Var;
        c6 c6Var = l3Var.f6938l;
        b0 b0Var = new b0(q0Var, ((k4) c6Var).a(), "Subchannel for " + u0Var.f5372b);
        this.f6902d = b0Var;
        this.f6901c = new z(b0Var, c6Var);
    }

    @Override // e8.x0
    public final List b() {
        this.f6908j.f6939m.d();
        y3.e.N("not started", this.f6905g);
        return this.f6903e;
    }

    @Override // e8.x0
    public final e8.c c() {
        return this.f6899a.f5373c;
    }

    @Override // e8.x0
    public final e8.i d() {
        return this.f6901c;
    }

    @Override // e8.x0
    public final Object e() {
        y3.e.N("Subchannel is not started", this.f6905g);
        return this.f6904f;
    }

    @Override // e8.x0
    public final void f() {
        this.f6908j.f6939m.d();
        y3.e.N("not started", this.f6905g);
        j2 j2Var = this.f6904f;
        if (j2Var.f6886v != null) {
            return;
        }
        j2Var.f6875k.execute(new a2(j2Var, 1));
    }

    @Override // e8.x0
    public final void g() {
        v6.d dVar;
        l3 l3Var = this.f6908j;
        l3Var.f6939m.d();
        if (this.f6904f == null) {
            this.f6906h = true;
            return;
        }
        if (!this.f6906h) {
            this.f6906h = true;
        } else {
            if (!l3Var.H || (dVar = this.f6907i) == null) {
                return;
            }
            dVar.c();
            this.f6907i = null;
        }
        if (!l3Var.H) {
            this.f6907i = l3Var.f6939m.c(new r2(new t0(this, 7)), 5L, TimeUnit.SECONDS, l3Var.f6932f.f7206a.L());
            return;
        }
        j2 j2Var = this.f6904f;
        e8.c2 c2Var = l3.f6922e0;
        j2Var.getClass();
        j2Var.f6875k.execute(new b2(j2Var, c2Var, 0));
    }

    @Override // e8.x0
    public final void h(e8.y0 y0Var) {
        l3 l3Var = this.f6908j;
        l3Var.f6939m.d();
        y3.e.N("already started", !this.f6905g);
        y3.e.N("already shutdown", !this.f6906h);
        y3.e.N("Channel is being terminated", !l3Var.H);
        this.f6905g = true;
        List list = this.f6899a.f5372b;
        String strG = l3Var.f6946t.g();
        r7.e eVar = l3Var.f6945s;
        x xVar = l3Var.f6932f;
        j2 j2Var = new j2(list, strG, eVar, xVar, xVar.f7206a.L(), l3Var.f6942p, l3Var.f6939m, new v2(this, y0Var), l3Var.O, new y((c6) l3Var.K.f7175a), this.f6902d, this.f6900b, this.f6901c);
        e8.l0 l0Var = e8.l0.f5298a;
        Long lValueOf = Long.valueOf(((k4) l3Var.f6938l).a());
        y3.e.J(lValueOf, "timestampNanos");
        l3Var.M.b(new e8.m0("Child Subchannel started", l0Var, lValueOf.longValue(), null, j2Var));
        this.f6904f = j2Var;
        l3Var.f6952z.add(j2Var);
    }

    @Override // e8.x0
    public final void i(List list) {
        this.f6908j.f6939m.d();
        this.f6903e = list;
        j2 j2Var = this.f6904f;
        j2Var.getClass();
        y3.e.J(list, "newAddressGroups");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y3.e.J(it.next(), "newAddressGroups contains null entry");
        }
        y3.e.G("newAddressGroups is empty", !list.isEmpty());
        j2Var.f6875k.execute(new x1(18, j2Var, Collections.unmodifiableList(new ArrayList(list))));
    }

    public final String toString() {
        return this.f6900b.toString();
    }
}
