package t;

/* JADX INFO: loaded from: classes.dex */
public final class p1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14278b;

    public p1(Object obj, Object obj2) {
        this.f14277a = obj;
        this.f14278b = obj2;
    }

    @Override // t.o1
    public final Object a() {
        return this.f14277a;
    }

    @Override // t.o1
    public final Object c() {
        return this.f14278b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (d7.a.d(this.f14277a, o1Var.a())) {
                if (d7.a.d(this.f14278b, o1Var.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f14277a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f14278b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
