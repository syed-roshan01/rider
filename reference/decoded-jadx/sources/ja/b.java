package ja;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8504a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8506c;

    public b(OutputStream outputStream, i0 i0Var) {
        this.f8505b = outputStream;
        this.f8506c = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0098 A[LOOP:1: B:12:0x0062->B:25:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x009a A[SYNTHETIC] */
    @Override // ja.e0
    public final void b0(g gVar, long j10) throws IOException {
        d dVar;
        int i10 = this.f8504a;
        Object obj = this.f8505b;
        Object obj2 = this.f8506c;
        switch (i10) {
            case 0:
                d7.a.m(gVar, "source");
                o7.d0.m(gVar.f8534b, 0L, j10);
                while (j10 > 0) {
                    b0 b0Var = gVar.f8533a;
                    d7.a.j(b0Var);
                    long j11 = 0;
                    try {
                        try {
                            while (j11 < 65536) {
                                j11 += (long) (b0Var.f8509c - b0Var.f8508b);
                                if (j11 >= j10) {
                                    j11 = j10;
                                    dVar = (d) obj;
                                    e0 e0Var = (e0) obj2;
                                    dVar.h();
                                    e0Var.b0(gVar, j11);
                                    if (!dVar.i()) {
                                        throw dVar.j(null);
                                    }
                                    j10 -= j11;
                                } else {
                                    b0Var = b0Var.f8512f;
                                    d7.a.j(b0Var);
                                }
                            }
                            e0Var.b0(gVar, j11);
                            if (!dVar.i()) {
                                throw dVar.j(null);
                            }
                            j10 -= j11;
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
                    dVar = (d) obj;
                    e0 e0Var2 = (e0) obj2;
                    dVar.h();
                }
                return;
            default:
                d7.a.m(gVar, "source");
                o7.d0.m(gVar.f8534b, 0L, j10);
                while (j10 > 0) {
                    ((i0) obj2).f();
                    b0 b0Var2 = gVar.f8533a;
                    d7.a.j(b0Var2);
                    int iMin = (int) Math.min(j10, b0Var2.f8509c - b0Var2.f8508b);
                    ((OutputStream) obj).write(b0Var2.f8507a, b0Var2.f8508b, iMin);
                    int i11 = b0Var2.f8508b + iMin;
                    b0Var2.f8508b = i11;
                    long j12 = iMin;
                    j10 -= j12;
                    gVar.f8534b -= j12;
                    if (i11 == b0Var2.f8509c) {
                        gVar.f8533a = b0Var2.a();
                        c0.a(b0Var2);
                    }
                }
                return;
        }
    }

    @Override // ja.e0
    public final i0 c() {
        switch (this.f8504a) {
            case 0:
                return (d) this.f8505b;
            default:
                return (i0) this.f8506c;
        }
    }

    @Override // ja.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i10 = this.f8504a;
        Object obj = this.f8505b;
        switch (i10) {
            case 0:
                d dVar = (d) obj;
                e0 e0Var = (e0) this.f8506c;
                dVar.h();
                try {
                    try {
                        e0Var.close();
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
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // ja.e0, java.io.Flushable
    public final void flush() throws IOException {
        int i10 = this.f8504a;
        Object obj = this.f8505b;
        switch (i10) {
            case 0:
                d dVar = (d) obj;
                e0 e0Var = (e0) this.f8506c;
                dVar.h();
                try {
                    try {
                        e0Var.flush();
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
                ((OutputStream) obj).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f8504a) {
            case 0:
                return "AsyncTimeout.sink(" + ((e0) this.f8506c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f8505b) + ')';
        }
    }

    public b(f0 f0Var, b bVar) {
        this.f8505b = f0Var;
        this.f8506c = bVar;
    }
}
