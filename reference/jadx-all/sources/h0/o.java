package h0;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2.h f7432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7434c;

    public o(l2.h hVar, int i10, long j10) {
        this.f7432a = hVar;
        this.f7433b = i10;
        this.f7434c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f7432a == oVar.f7432a && this.f7433b == oVar.f7433b && this.f7434c == oVar.f7434c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7434c) + a7.a.u(this.f7433b, this.f7432a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f7432a + ", offset=" + this.f7433b + ", selectableId=" + this.f7434c + ')';
    }
}
