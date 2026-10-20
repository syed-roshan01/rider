package r1;

/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f13383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f0 f13384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f13385c = new g1(this, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f13386d = new g1(this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g1 f13387e = new g1(this, 1);

    public h1(k1 k1Var) {
        this.f13383a = k1Var;
    }

    public final f0 a() {
        f0 f0Var = this.f13384b;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }
}
