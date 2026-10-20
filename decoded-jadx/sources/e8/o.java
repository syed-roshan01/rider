package e8;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5323a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5326d;

    public o(h hVar, int i10, boolean z10) {
        y3.e.J(hVar, "callOptions");
        this.f5324b = hVar;
        this.f5325c = i10;
        this.f5326d = z10;
    }

    public final String toString() {
        switch (this.f5323a) {
            case 1:
                q6.g gVarJ0 = f6.a.j0(this);
                gVarJ0.a((h) this.f5324b, "callOptions");
                gVarJ0.d(String.valueOf(this.f5325c), "previousAttempts");
                gVarJ0.c("isTransparentRetry", this.f5326d);
                return gVarJ0.toString();
            default:
                return super.toString();
        }
    }
}
