package a0;

import m0.l1;
import m0.n1;
import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1 f877c = o7.d0.Z(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1 f878d = o7.d0.Z(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n1 f879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f880f;

    public z(Object obj, a0 a0Var) {
        this.f875a = obj;
        this.f876b = a0Var;
        o3 o3Var = o3.f11621a;
        this.f879e = d7.t.g0(null, o3Var);
        this.f880f = d7.t.g0(null, o3Var);
    }

    public final z a() {
        l1 l1Var = this.f878d;
        if (l1Var.d() == 0) {
            this.f876b.f775a.add(this);
            z zVar = (z) this.f880f.getValue();
            if (zVar != null) {
                zVar.a();
            } else {
                zVar = null;
            }
            this.f879e.setValue(zVar);
        }
        l1Var.f(l1Var.d() + 1);
        return this;
    }

    public final void b() {
        l1 l1Var = this.f878d;
        if (l1Var.d() <= 0) {
            throw new IllegalStateException("Release should only be called once".toString());
        }
        l1Var.f(l1Var.d() - 1);
        if (l1Var.d() == 0) {
            this.f876b.f775a.remove(this);
            n1 n1Var = this.f879e;
            z zVar = (z) n1Var.getValue();
            if (zVar != null) {
                zVar.b();
            }
            n1Var.setValue(null);
        }
    }
}
