package ja;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f8559a;

    public n(e0 e0Var) {
        d7.a.m(e0Var, "delegate");
        this.f8559a = e0Var;
    }

    @Override // ja.e0
    public void b0(g gVar, long j10) {
        d7.a.m(gVar, "source");
        this.f8559a.b0(gVar, j10);
    }

    @Override // ja.e0
    public final i0 c() {
        return this.f8559a.c();
    }

    @Override // ja.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8559a.close();
    }

    @Override // ja.e0, java.io.Flushable
    public void flush() {
        this.f8559a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f8559a + ')';
    }
}
