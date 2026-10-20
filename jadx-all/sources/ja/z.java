package ja;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class z implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f8585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f8586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8587c;

    public z(e0 e0Var) {
        d7.a.m(e0Var, "sink");
        this.f8585a = e0Var;
        this.f8586b = new g();
    }

    @Override // ja.h
    public final h C(int i10) {
        if (!(!this.f8587c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8586b.h0(i10);
        a();
        return this;
    }

    @Override // ja.h
    public final h F(byte[] bArr) {
        d7.a.m(bArr, "source");
        if (!(!this.f8587c)) {
            throw new IllegalStateException("closed".toString());
        }
        g gVar = this.f8586b;
        gVar.getClass();
        gVar.f0(bArr, 0, bArr.length);
        a();
        return this;
    }

    @Override // ja.h
    public final h V(String str) {
        d7.a.m(str, "string");
        if (!(!this.f8587c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8586b.n0(str);
        a();
        return this;
    }

    @Override // ja.h
    public final h W(long j10) {
        if (!(!this.f8587c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8586b.i0(j10);
        a();
        return this;
    }

    public final h a() {
        if (!(!this.f8587c)) {
            throw new IllegalStateException("closed".toString());
        }
        g gVar = this.f8586b;
        long jB = gVar.b();
        if (jB > 0) {
            this.f8585a.b0(gVar, jB);
        }
        return this;
    }

    public final h b(byte[] bArr, int i10, int i11) {
        d7.a.m(bArr, "source");
        if (!(!this.f8587c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8586b.f0(bArr, i10, i11);
        a();
        return this;
    }

    @Override // ja.e0
    public final void b0(g gVar, long j10) {
        d7.a.m(gVar, "source");
        if (!(!this.f8587c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8586b.b0(gVar, j10);
        a();
    }

    @Override // ja.e0
    public final i0 c() {
        return this.f8585a.c();
    }

    @Override // ja.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        e0 e0Var = this.f8585a;
        if (this.f8587c) {
            return;
        }
        g gVar = this.f8586b;
        long j10 = gVar.f8534b;
        if (j10 > 0) {
            e0Var.b0(gVar, j10);
        }
        th = null;
        try {
            e0Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f8587c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // ja.h, ja.e0, java.io.Flushable
    public final void flush() {
        if (!(!this.f8587c)) {
            throw new IllegalStateException("closed".toString());
        }
        g gVar = this.f8586b;
        long j10 = gVar.f8534b;
        e0 e0Var = this.f8585a;
        if (j10 > 0) {
            e0Var.b0(gVar, j10);
        }
        e0Var.flush();
    }

    @Override // ja.h
    public final h h(long j10) {
        if (!(!this.f8587c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8586b.j0(j10);
        a();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f8587c;
    }

    @Override // ja.h
    public final h m(int i10) {
        if (!(!this.f8587c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8586b.l0(i10);
        a();
        return this;
    }

    @Override // ja.h
    public final h s(int i10) {
        if (!(!this.f8587c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8586b.k0(i10);
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f8585a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        d7.a.m(byteBuffer, "source");
        if (!(!this.f8587c)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f8586b.write(byteBuffer);
        a();
        return iWrite;
    }

    @Override // ja.h
    public final h z(j jVar) {
        d7.a.m(jVar, "byteString");
        if (!(!this.f8587c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8586b.e0(jVar);
        a();
        return this;
    }
}
