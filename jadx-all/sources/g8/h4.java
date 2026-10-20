package g8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class h4 extends e8.z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e8.j0 f6831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e8.x0 f6832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e8.x f6833e = e8.x.f5397d;

    public h4(e8.j0 j0Var) {
        y3.e.J(j0Var, "helper");
        this.f6831c = j0Var;
    }

    @Override // e8.z0
    public final boolean a(e8.w0 w0Var) {
        Boolean bool;
        List list = w0Var.f5391a;
        int i10 = 0;
        if (list.isEmpty()) {
            c(e8.c2.f5224m.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + w0Var.f5392b));
            return false;
        }
        Object obj = w0Var.f5393c;
        if ((obj instanceof f4) && (bool = ((f4) obj).f6763a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        e8.x0 x0Var = this.f6832d;
        if (x0Var == null) {
            e8.c cVar = e8.c.f5206b;
            Object[][] objArr = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
            y3.e.G("addrs is empty", !list.isEmpty());
            e8.u0 u0Var = new e8.u0(Collections.unmodifiableList(new ArrayList(list)), cVar, objArr, i10);
            e8.j0 j0Var = this.f6831c;
            e8.x0 x0VarH = j0Var.h(u0Var);
            x0VarH.h(new v2(this, x0VarH));
            this.f6832d = x0VarH;
            e8.x xVar = e8.x.f5394a;
            g4 g4Var = new g4(e8.v0.b(x0VarH, null));
            this.f6833e = xVar;
            j0Var.r(xVar, g4Var);
            x0VarH.f();
        } else {
            x0Var.i(list);
        }
        return true;
    }

    @Override // e8.z0
    public final void c(e8.c2 c2Var) {
        e8.x0 x0Var = this.f6832d;
        if (x0Var != null) {
            x0Var.g();
            this.f6832d = null;
        }
        e8.x xVar = e8.x.f5396c;
        g4 g4Var = new g4(e8.v0.a(c2Var));
        this.f6833e = xVar;
        this.f6831c.r(xVar, g4Var);
    }

    @Override // e8.z0
    public final void e() {
        e8.x0 x0Var = this.f6832d;
        if (x0Var != null) {
            x0Var.f();
        }
    }

    @Override // e8.z0
    public final void f() {
        e8.x0 x0Var = this.f6832d;
        if (x0Var != null) {
            x0Var.g();
        }
    }
}
