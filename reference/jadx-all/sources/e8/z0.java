package e8;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f5406b = new b("internal:health-checking-config");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5407a;

    public boolean a(w0 w0Var) {
        List list = w0Var.f5391a;
        if (!list.isEmpty() || b()) {
            int i10 = this.f5407a;
            this.f5407a = i10 + 1;
            if (i10 == 0) {
                d(w0Var);
            }
            this.f5407a = 0;
            return true;
        }
        c(c2.f5224m.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + w0Var.f5392b));
        return false;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(c2 c2Var);

    public void d(w0 w0Var) {
        int i10 = this.f5407a;
        this.f5407a = i10 + 1;
        if (i10 == 0) {
            a(w0Var);
        }
        this.f5407a = 0;
    }

    public void e() {
    }

    public abstract void f();
}
