package g8;

/* JADX INFO: loaded from: classes.dex */
public final class m5 extends o1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e8.b f6964d = new e8.b("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j5 f6965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e8.h2 f6966c;

    public m5(e8.j0 j0Var, t tVar, e8.h2 h2Var) {
        super(j0Var);
        this.f6965b = tVar;
        this.f6966c = h2Var;
    }

    @Override // g8.o1, e8.j0
    public final void p() {
        super.p();
        t tVar = (t) this.f6965b;
        e8.h2 h2Var = tVar.f7120b;
        h2Var.d();
        h2Var.execute(new androidx.activity.d(tVar, 14));
    }

    @Override // g8.o1, e8.j0
    public final void q(e8.i iVar) {
        super.q(new l5(this, iVar));
    }
}
