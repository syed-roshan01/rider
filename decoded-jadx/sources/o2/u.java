package o2;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f12513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12515f;

    public u(boolean z10, int i10) {
        boolean z11 = (i10 & 2) != 0;
        boolean z12 = (i10 & 4) != 0;
        v vVar = (i10 & 8) != 0 ? v.f12516a : null;
        z10 = (i10 & 16) != 0 ? true : z10;
        boolean z13 = (i10 & 32) != 0;
        this.f12510a = false;
        this.f12511b = z11;
        this.f12512c = z12;
        this.f12513d = vVar;
        this.f12514e = z10;
        this.f12515f = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f12510a == uVar.f12510a && this.f12511b == uVar.f12511b && this.f12512c == uVar.f12512c && this.f12513d == uVar.f12513d && this.f12514e == uVar.f12514e && this.f12515f == uVar.f12515f;
    }

    public final int hashCode() {
        boolean z10 = this.f12511b;
        return Boolean.hashCode(false) + l.q.c(this.f12515f, l.q.c(this.f12514e, (this.f12513d.hashCode() + l.q.c(this.f12512c, l.q.c(z10, l.q.c(this.f12510a, Boolean.hashCode(z10) * 31, 31), 31), 31)) * 31, 31), 31);
    }
}
