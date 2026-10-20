package ja;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class r implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f8567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Inflater f8568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8570d;

    public r(a0 a0Var, Inflater inflater) {
        this.f8567a = a0Var;
        this.f8568b = inflater;
    }

    @Override // ja.g0
    public final long I(g gVar, long j10) throws IOException {
        long j11;
        d7.a.m(gVar, "sink");
        while (j10 >= 0) {
            if (!(!this.f8570d)) {
                throw new IllegalStateException("closed".toString());
            }
            i iVar = this.f8567a;
            Inflater inflater = this.f8568b;
            if (j10 == 0) {
                j11 = 0;
            } else {
                try {
                    b0 b0VarD0 = gVar.d0(1);
                    int iMin = (int) Math.min(j10, 8192 - b0VarD0.f8509c);
                    if (inflater.needsInput() && !iVar.B()) {
                        b0 b0Var = iVar.A().f8533a;
                        d7.a.j(b0Var);
                        int i10 = b0Var.f8509c;
                        int i11 = b0Var.f8508b;
                        int i12 = i10 - i11;
                        this.f8569c = i12;
                        inflater.setInput(b0Var.f8507a, i11, i12);
                    }
                    int iInflate = inflater.inflate(b0VarD0.f8507a, b0VarD0.f8509c, iMin);
                    int i13 = this.f8569c;
                    if (i13 != 0) {
                        int remaining = i13 - inflater.getRemaining();
                        this.f8569c -= remaining;
                        iVar.l(remaining);
                    }
                    if (iInflate > 0) {
                        b0VarD0.f8509c += iInflate;
                        j11 = iInflate;
                        gVar.f8534b += j11;
                    } else {
                        if (b0VarD0.f8508b == b0VarD0.f8509c) {
                            gVar.f8533a = b0VarD0.a();
                            c0.a(b0VarD0);
                        }
                        j11 = 0;
                    }
                } catch (DataFormatException e4) {
                    throw new IOException(e4);
                }
            }
            if (j11 > 0) {
                return j11;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (iVar.B()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(a7.a.l("byteCount < 0: ", j10).toString());
    }

    @Override // ja.g0
    public final i0 c() {
        return this.f8567a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f8570d) {
            return;
        }
        this.f8568b.end();
        this.f8570d = true;
        this.f8567a.close();
    }
}
