package o2;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f12489c;

    public o(boolean z10, boolean z11, int i10) {
        z10 = (i10 & 1) != 0 ? true : z10;
        z11 = (i10 & 2) != 0 ? true : z11;
        v vVar = (i10 & 4) != 0 ? v.f12516a : null;
        this.f12487a = z10;
        this.f12488b = z11;
        this.f12489c = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f12487a == oVar.f12487a && this.f12488b == oVar.f12488b && this.f12489c == oVar.f12489c;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + l.q.c(true, (this.f12489c.hashCode() + l.q.c(this.f12488b, Boolean.hashCode(this.f12487a) * 31, 31)) * 31, 31);
    }
}
