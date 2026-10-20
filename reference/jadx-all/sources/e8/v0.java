package e8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v0 f5378e = new v0(null, null, c2.f5216e, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f5379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f5380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f5381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5382d;

    public v0(x0 x0Var, n8.m mVar, c2 c2Var, boolean z10) {
        this.f5379a = x0Var;
        this.f5380b = mVar;
        y3.e.J(c2Var, "status");
        this.f5381c = c2Var;
        this.f5382d = z10;
    }

    public static v0 a(c2 c2Var) {
        y3.e.G("error status shouldn't be OK", !c2Var.e());
        return new v0(null, null, c2Var, false);
    }

    public static v0 b(x0 x0Var, n8.m mVar) {
        y3.e.J(x0Var, "subchannel");
        return new v0(x0Var, mVar, c2.f5216e, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return y3.e.f0(this.f5379a, v0Var.f5379a) && y3.e.f0(this.f5381c, v0Var.f5381c) && y3.e.f0(this.f5380b, v0Var.f5380b) && this.f5382d == v0Var.f5382d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5379a, this.f5381c, this.f5380b, Boolean.valueOf(this.f5382d)});
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f5379a, "subchannel");
        gVarJ0.a(this.f5380b, "streamTracerFactory");
        gVarJ0.a(this.f5381c, "status");
        gVarJ0.c("drop", this.f5382d);
        return gVarJ0.toString();
    }
}
