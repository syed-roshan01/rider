package m9;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f11993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0 f11994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(v0 v0Var, long j10, l lVar) {
        super(j10);
        this.f11994d = v0Var;
        this.f11993c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11993c.d(this.f11994d);
    }

    @Override // m9.t0
    public final String toString() {
        return super.toString() + this.f11993c;
    }
}
