package g2;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.e f6567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f6568b;

    public i0(a2.e eVar, s sVar) {
        this.f6567a = eVar;
        this.f6568b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return d7.a.d(this.f6567a, i0Var.f6567a) && d7.a.d(this.f6568b, i0Var.f6568b);
    }

    public final int hashCode() {
        return this.f6568b.hashCode() + (this.f6567a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f6567a) + ", offsetMapping=" + this.f6568b + ')';
    }
}
