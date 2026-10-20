package da;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4971d;

    @Override // da.b, ja.g0
    public final long I(ja.g gVar, long j10) throws IOException {
        d7.a.m(gVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(a7.a.l("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f4957b)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f4971d) {
            return -1L;
        }
        long jI = super.I(gVar, j10);
        if (jI != -1) {
            return jI;
        }
        this.f4971d = true;
        a();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4957b) {
            return;
        }
        if (!this.f4971d) {
            a();
        }
        this.f4957b = true;
    }
}
