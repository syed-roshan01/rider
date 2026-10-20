package ba;

import ja.g0;
import ja.o;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2766f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f2767n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, g0 g0Var, long j10) {
        super(g0Var);
        d7.a.m(g0Var, "delegate");
        this.f2767n = dVar;
        this.f2762b = j10;
        this.f2764d = true;
        if (j10 == 0) {
            a(null);
        }
    }

    @Override // ja.o, ja.g0
    public final long I(ja.g gVar, long j10) throws IOException {
        d7.a.m(gVar, "sink");
        if (!(!this.f2766f)) {
            throw new IllegalStateException("closed".toString());
        }
        try {
            long jI = this.f8560a.I(gVar, j10);
            if (this.f2764d) {
                this.f2764d = false;
                d dVar = this.f2767n;
                x9.n nVar = dVar.f2769b;
                i iVar = dVar.f2768a;
                nVar.getClass();
                d7.a.m(iVar, "call");
            }
            if (jI == -1) {
                a(null);
                return -1L;
            }
            long j11 = this.f2763c + jI;
            long j12 = this.f2762b;
            if (j12 == -1 || j11 <= j12) {
                this.f2763c = j11;
                if (j11 == j12) {
                    a(null);
                }
                return jI;
            }
            throw new ProtocolException("expected " + j12 + " bytes but received " + j11);
        } catch (IOException e4) {
            throw a(e4);
        }
    }

    public final IOException a(IOException iOException) {
        if (this.f2765e) {
            return iOException;
        }
        this.f2765e = true;
        d dVar = this.f2767n;
        if (iOException == null && this.f2764d) {
            this.f2764d = false;
            dVar.f2769b.getClass();
            d7.a.m(dVar.f2768a, "call");
        }
        return dVar.a(true, false, iOException);
    }

    @Override // ja.o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f2766f) {
            return;
        }
        this.f2766f = true;
        try {
            super.close();
            a(null);
        } catch (IOException e4) {
            throw a(e4);
        }
    }
}
