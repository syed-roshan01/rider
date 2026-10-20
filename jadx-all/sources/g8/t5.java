package g8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.a1 f7144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7145b;

    public t5(e8.a1 a1Var, Object obj) {
        this.f7144a = a1Var;
        this.f7145b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t5.class != obj.getClass()) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return y3.e.f0(this.f7144a, t5Var.f7144a) && y3.e.f0(this.f7145b, t5Var.f7145b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7144a, this.f7145b});
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f7144a, "provider");
        gVarJ0.a(this.f7145b, "config");
        return gVarJ0.toString();
    }
}
