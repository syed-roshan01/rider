package g2;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f6583f = new o(false, 0, true, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6588e;

    public o(boolean z10, int i10, boolean z11, int i11, int i12) {
        this.f6584a = z10;
        this.f6585b = i10;
        this.f6586c = z11;
        this.f6587d = i11;
        this.f6588e = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f6584a != oVar.f6584a || !z6.a.z(this.f6585b, oVar.f6585b) || this.f6586c != oVar.f6586c || !f6.a.D(this.f6587d, oVar.f6587d) || !n.a(this.f6588e, oVar.f6588e)) {
            return false;
        }
        oVar.getClass();
        return d7.a.d(null, null);
    }

    public final int hashCode() {
        return a7.a.u(this.f6588e, a7.a.u(this.f6587d, l.q.c(this.f6586c, a7.a.u(this.f6585b, Boolean.hashCode(this.f6584a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f6584a + ", capitalization=" + ((Object) z6.a.p0(this.f6585b)) + ", autoCorrect=" + this.f6586c + ", keyboardType=" + ((Object) f6.a.i0(this.f6587d)) + ", imeAction=" + ((Object) n.b(this.f6588e)) + ", platformImeOptions=null)";
    }
}
