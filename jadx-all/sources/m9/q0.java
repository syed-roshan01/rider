package m9;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11991a;

    public q0(boolean z10) {
        this.f11991a = z10;
    }

    @Override // m9.b1
    public final boolean b() {
        return this.f11991a;
    }

    @Override // m9.b1
    public final t1 f() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f11991a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
