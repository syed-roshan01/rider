package m9;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends r9.s implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11936e;

    public e2(long j10, w8.c cVar) {
        super(cVar, cVar.getContext());
        this.f11936e = j10;
    }

    @Override // m9.a, m9.p1
    public final String Z() {
        return super.Z() + "(timeMillis=" + this.f11936e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        d7.t.W(this.f11900c);
        z(new d2("Timed out waiting for " + this.f11936e + " ms", this));
    }
}
