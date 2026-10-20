package ja;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8514a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8516c;

    public c(InputStream inputStream, i0 i0Var) {
        d7.a.m(inputStream, "input");
        this.f8515b = inputStream;
        this.f8516c = i0Var;
    }

    @Override // ja.g0
    public final long I(g gVar, long j10) {
        int i10 = this.f8514a;
        Object obj = this.f8515b;
        Object obj2 = this.f8516c;
        switch (i10) {
            case 0:
                d7.a.m(gVar, "sink");
                d dVar = (d) obj;
                g0 g0Var = (g0) obj2;
                dVar.h();
                try {
                    try {
                        long jI = g0Var.I(gVar, j10);
                        if (dVar.i()) {
                            throw dVar.j(null);
                        }
                        return jI;
                    } catch (Throwable th) {
                        dVar.i();
                        throw th;
                    }
                } catch (IOException e4) {
                    if (dVar.i()) {
                        throw dVar.j(e4);
                    }
                    throw e4;
                }
            default:
                d7.a.m(gVar, "sink");
                if (j10 == 0) {
                    return 0L;
                }
                if (j10 < 0) {
                    throw new IllegalArgumentException(a7.a.l("byteCount < 0: ", j10).toString());
                }
                try {
                    ((i0) obj2).f();
                    b0 b0VarD0 = gVar.d0(1);
                    int i11 = ((InputStream) obj).read(b0VarD0.f8507a, b0VarD0.f8509c, (int) Math.min(j10, 8192 - b0VarD0.f8509c));
                    if (i11 == -1) {
                        if (b0VarD0.f8508b == b0VarD0.f8509c) {
                            gVar.f8533a = b0VarD0.a();
                            c0.a(b0VarD0);
                        }
                        return -1L;
                    }
                    b0VarD0.f8509c += i11;
                    long j11 = i11;
                    gVar.f8534b += j11;
                    return j11;
                } catch (AssertionError e10) {
                    if (r9.a.g(e10)) {
                        throw new IOException(e10);
                    }
                    throw e10;
                }
        }
    }

    @Override // ja.g0
    public final i0 c() {
        switch (this.f8514a) {
            case 0:
                return (d) this.f8515b;
            default:
                return (i0) this.f8516c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i10 = this.f8514a;
        Object obj = this.f8515b;
        switch (i10) {
            case 0:
                d dVar = (d) obj;
                g0 g0Var = (g0) this.f8516c;
                dVar.h();
                try {
                    try {
                        g0Var.close();
                        if (dVar.i()) {
                            throw dVar.j(null);
                        }
                        return;
                    } catch (IOException e4) {
                        if (!dVar.i()) {
                            throw e4;
                        }
                        throw dVar.j(e4);
                    }
                } catch (Throwable th) {
                    dVar.i();
                    throw th;
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f8514a) {
            case 0:
                return "AsyncTimeout.source(" + ((g0) this.f8516c) + ')';
            default:
                return "source(" + ((InputStream) this.f8515b) + ')';
        }
    }

    public c(f0 f0Var, c cVar) {
        this.f8515b = f0Var;
        this.f8516c = cVar;
    }
}
