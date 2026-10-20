package g1;

import e1.p;
import m2.l;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m2.b f6490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f6491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f6492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6493d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return d7.a.d(this.f6490a, aVar.f6490a) && this.f6491b == aVar.f6491b && d7.a.d(this.f6492c, aVar.f6492c) && d1.f.a(this.f6493d, aVar.f6493d);
    }

    public final int hashCode() {
        int iHashCode = (this.f6492c.hashCode() + ((this.f6491b.hashCode() + (this.f6490a.hashCode() * 31)) * 31)) * 31;
        long j10 = this.f6493d;
        int i10 = d1.f.f4346d;
        return Long.hashCode(j10) + iHashCode;
    }

    public final String toString() {
        return "DrawParams(density=" + this.f6490a + ", layoutDirection=" + this.f6491b + ", canvas=" + this.f6492c + ", size=" + ((Object) d1.f.f(this.f6493d)) + ')';
    }
}
