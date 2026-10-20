package e0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4986a;

    public c(float f10) {
        this.f4986a = f10;
    }

    @Override // e0.b
    public final float a(long j10, m2.b bVar) {
        return bVar.v(this.f4986a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && m2.e.a(this.f4986a, ((c) obj).f4986a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f4986a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f4986a + ".dp)";
    }
}
