package e8;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {
    public final g0 a() {
        List listB = b();
        y3.e.M(listB, "%s does not have exactly one group", listB.size() == 1);
        return (g0) listB.get(0);
    }

    public abstract List b();

    public abstract c c();

    public abstract i d();

    public abstract Object e();

    public abstract void f();

    public abstract void g();

    public abstract void h(y0 y0Var);

    public abstract void i(List list);
}
