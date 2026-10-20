package g8;

/* JADX INFO: loaded from: classes.dex */
public final class g4 extends z6.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6815s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f6816t;

    public g4(e8.v0 v0Var) {
        y3.e.J(v0Var, "result");
        this.f6816t = v0Var;
    }

    @Override // z6.a
    public final e8.v0 Y(j4 j4Var) {
        int i10 = this.f6815s;
        Object obj = this.f6816t;
        switch (i10) {
            case 0:
                return (e8.v0) obj;
            default:
                return e8.v0.a((e8.c2) obj);
        }
    }

    public final String toString() {
        switch (this.f6815s) {
            case 0:
                q6.g gVar = new q6.g(g4.class.getSimpleName());
                gVar.a((e8.v0) this.f6816t, "result");
                return gVar.toString();
            default:
                return super.toString();
        }
    }

    public g4(e8.c2 c2Var) {
        this.f6816t = c2Var;
    }
}
