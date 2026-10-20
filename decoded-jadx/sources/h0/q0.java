package h0;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f7448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f7449c;

    public q0(boolean z10, p pVar, n nVar) {
        this.f7447a = z10;
        this.f7448b = pVar;
        this.f7449c = nVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleSelectionLayout(isStartHandle=");
        sb.append(this.f7447a);
        sb.append(", crossed=");
        n nVar = this.f7449c;
        sb.append(a7.a.E(nVar.b()));
        sb.append(", info=\n\t");
        sb.append(nVar);
        sb.append(')');
        return sb.toString();
    }
}
