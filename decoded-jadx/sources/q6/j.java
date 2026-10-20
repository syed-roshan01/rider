package q6;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13210a;

    public j(Object obj) {
        this.f13210a = obj;
    }

    @Override // q6.h
    public final Object a() {
        return this.f13210a;
    }

    @Override // q6.h
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f13210a.equals(((j) obj).f13210a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13210a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f13210a + ")";
    }
}
