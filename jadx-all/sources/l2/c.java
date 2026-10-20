package l2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11197a;

    public c(long j10) {
        this.f11197a = j10;
        if (j10 == e1.r.f5065g) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }

    @Override // l2.o
    public final float c() {
        return e1.r.d(this.f11197a);
    }

    @Override // l2.o
    public final long d() {
        return this.f11197a;
    }

    @Override // l2.o
    public final e1.n e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && e1.r.c(this.f11197a, ((c) obj).f11197a);
    }

    public final int hashCode() {
        int i10 = e1.r.f5066h;
        return Long.hashCode(this.f11197a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) e1.r.i(this.f11197a)) + ')';
    }
}
