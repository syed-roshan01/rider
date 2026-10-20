package x9;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f16358n = new c(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f16359o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f16367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f16369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f16370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f16371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f16372m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d7.a.m(timeUnit, "timeUnit");
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        f16359o = new c(false, false, -1, -1, false, false, false, seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds, -1, true, false, false, null);
    }

    public c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f16360a = z10;
        this.f16361b = z11;
        this.f16362c = i10;
        this.f16363d = i11;
        this.f16364e = z12;
        this.f16365f = z13;
        this.f16366g = z14;
        this.f16367h = i12;
        this.f16368i = i13;
        this.f16369j = z15;
        this.f16370k = z16;
        this.f16371l = z17;
        this.f16372m = str;
    }

    public final String toString() {
        String str = this.f16372m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f16360a) {
            sb.append("no-cache, ");
        }
        if (this.f16361b) {
            sb.append("no-store, ");
        }
        int i10 = this.f16362c;
        if (i10 != -1) {
            sb.append("max-age=");
            sb.append(i10);
            sb.append(", ");
        }
        int i11 = this.f16363d;
        if (i11 != -1) {
            sb.append("s-maxage=");
            sb.append(i11);
            sb.append(", ");
        }
        if (this.f16364e) {
            sb.append("private, ");
        }
        if (this.f16365f) {
            sb.append("public, ");
        }
        if (this.f16366g) {
            sb.append("must-revalidate, ");
        }
        int i12 = this.f16367h;
        if (i12 != -1) {
            sb.append("max-stale=");
            sb.append(i12);
            sb.append(", ");
        }
        int i13 = this.f16368i;
        if (i13 != -1) {
            sb.append("min-fresh=");
            sb.append(i13);
            sb.append(", ");
        }
        if (this.f16369j) {
            sb.append("only-if-cached, ");
        }
        if (this.f16370k) {
            sb.append("no-transform, ");
        }
        if (this.f16371l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        d7.a.l(string, "StringBuilder().apply(builderAction).toString()");
        this.f16372m = string;
        return string;
    }
}
