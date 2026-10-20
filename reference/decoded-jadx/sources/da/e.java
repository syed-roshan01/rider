package da;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f4967e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, long j10) {
        super(hVar);
        this.f4967e = hVar;
        this.f4966d = j10;
        if (j10 == 0) {
            a();
        }
    }

    @Override // da.b, ja.g0
    public final long I(ja.g gVar, long j10) throws IOException {
        d7.a.m(gVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(a7.a.l("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f4957b)) {
            throw new IllegalStateException("closed".toString());
        }
        long j11 = this.f4966d;
        if (j11 == 0) {
            return -1L;
        }
        long jI = super.I(gVar, Math.min(j11, j10));
        if (jI == -1) {
            this.f4967e.f4973b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j12 = this.f4966d - jI;
        this.f4966d = j12;
        if (j12 == 0) {
            a();
        }
        return jI;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4957b) {
            return;
        }
        if (this.f4966d != 0 && !y9.b.f(this, TimeUnit.MILLISECONDS)) {
            this.f4967e.f4973b.k();
            a();
        }
        this.f4957b = true;
    }
}
