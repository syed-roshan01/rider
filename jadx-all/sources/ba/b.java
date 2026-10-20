package ba;

import ja.e0;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ja.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f2761f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, e0 e0Var, long j10) {
        super(e0Var);
        d7.a.m(e0Var, "delegate");
        this.f2761f = dVar;
        this.f2757b = j10;
    }

    public final IOException a(IOException iOException) {
        if (this.f2758c) {
            return iOException;
        }
        this.f2758c = true;
        return this.f2761f.a(false, true, iOException);
    }

    @Override // ja.n, ja.e0
    public final void b0(ja.g gVar, long j10) throws IOException {
        d7.a.m(gVar, "source");
        if (!(!this.f2760e)) {
            throw new IllegalStateException("closed".toString());
        }
        long j11 = this.f2757b;
        if (j11 == -1 || this.f2759d + j10 <= j11) {
            try {
                super.b0(gVar, j10);
                this.f2759d += j10;
                return;
            } catch (IOException e4) {
                throw a(e4);
            }
        }
        throw new ProtocolException("expected " + j11 + " bytes but received " + (this.f2759d + j10));
    }

    @Override // ja.n, ja.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f2760e) {
            return;
        }
        this.f2760e = true;
        long j10 = this.f2757b;
        if (j10 != -1 && this.f2759d != j10) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e4) {
            throw a(e4);
        }
    }

    @Override // ja.n, ja.e0, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e4) {
            throw a(e4);
        }
    }
}
