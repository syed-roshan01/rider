package e8;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f5215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c2 f5216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c2 f5217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c2 f5218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c2 f5219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c2 f5220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c2 f5221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c2 f5222k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c2 f5223l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c2 f5224m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j1 f5225n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j1 f5226o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f5227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f5229c;

    static {
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        TreeMap treeMap = new TreeMap();
        for (z1 z1Var : z1.values()) {
            c2 c2Var = (c2) treeMap.put(Integer.valueOf(z1Var.f5425a), new c2(z1Var, null, null));
            if (c2Var != null) {
                throw new IllegalStateException("Code value duplication between " + c2Var.f5227a.name() + " & " + z1Var.name());
            }
        }
        f5215d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        f5216e = z1.OK.a();
        f5217f = z1.CANCELLED.a();
        f5218g = z1.UNKNOWN.a();
        z1.INVALID_ARGUMENT.a();
        f5219h = z1.DEADLINE_EXCEEDED.a();
        z1.NOT_FOUND.a();
        z1.ALREADY_EXISTS.a();
        f5220i = z1.PERMISSION_DENIED.a();
        f5221j = z1.UNAUTHENTICATED.a();
        f5222k = z1.RESOURCE_EXHAUSTED.a();
        z1.FAILED_PRECONDITION.a();
        z1.ABORTED.a();
        z1.OUT_OF_RANGE.a();
        z1.UNIMPLEMENTED.a();
        f5223l = z1.INTERNAL.a();
        f5224m = z1.UNAVAILABLE.a();
        z1.DATA_LOSS.a();
        f5225n = new j1("grpc-status", false, new a2());
        f5226o = new j1("grpc-message", false, new b2());
    }

    public c2(z1 z1Var, String str, Throwable th) {
        y3.e.J(z1Var, "code");
        this.f5227a = z1Var;
        this.f5228b = str;
        this.f5229c = th;
    }

    public static String b(c2 c2Var) {
        String str = c2Var.f5228b;
        z1 z1Var = c2Var.f5227a;
        if (str == null) {
            return z1Var.toString();
        }
        return z1Var + ": " + c2Var.f5228b;
    }

    public static c2 c(int i10) {
        if (i10 >= 0) {
            List list = f5215d;
            if (i10 < list.size()) {
                return (c2) list.get(i10);
            }
        }
        return f5218g.g("Unknown code " + i10);
    }

    public static c2 d(Throwable th) {
        y3.e.J(th, "t");
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof d2) {
                return ((d2) cause).f5232a;
            }
            if (cause instanceof e2) {
                return ((e2) cause).f5238a;
            }
        }
        return f5218g.f(th);
    }

    public final c2 a(String str) {
        if (str == null) {
            return this;
        }
        Throwable th = this.f5229c;
        z1 z1Var = this.f5227a;
        String str2 = this.f5228b;
        if (str2 == null) {
            return new c2(z1Var, str, th);
        }
        return new c2(z1Var, str2 + "\n" + str, th);
    }

    public final boolean e() {
        return z1.OK == this.f5227a;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final c2 f(Throwable th) {
        return y3.e.f0(this.f5229c, th) ? this : new c2(this.f5227a, this.f5228b, th);
    }

    public final c2 g(String str) {
        return y3.e.f0(this.f5228b, str) ? this : new c2(this.f5227a, str, this.f5229c);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f5227a.name(), "code");
        gVarJ0.a(this.f5228b, "description");
        Throwable th = this.f5229c;
        Object string = th;
        if (th != null) {
            Object obj = q6.q.f13221a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        gVarJ0.a(string, "cause");
        return gVarJ0.toString();
    }
}
