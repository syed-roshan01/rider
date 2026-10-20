package e8;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class a1 extends i {
    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract String f();

    public abstract int g();

    public abstract boolean h();

    public final int hashCode() {
        return super.hashCode();
    }

    public abstract r1 i(Map map);

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(f(), "policy");
        gVarJ0.d(String.valueOf(g()), "priority");
        gVarJ0.c("available", h());
        return gVarJ0.toString();
    }
}
