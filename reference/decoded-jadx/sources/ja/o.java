package ja;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class o implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f8560a;

    public o(g0 g0Var) {
        d7.a.m(g0Var, "delegate");
        this.f8560a = g0Var;
    }

    @Override // ja.g0
    public long I(g gVar, long j10) {
        d7.a.m(gVar, "sink");
        return this.f8560a.I(gVar, j10);
    }

    @Override // ja.g0
    public final i0 c() {
        return this.f8560a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f8560a.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f8560a + ')';
    }
}
