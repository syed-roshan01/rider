package da;

import ja.e0;
import ja.i0;
import ja.p;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f4968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f4970c;

    public f(h hVar) {
        this.f4970c = hVar;
        this.f4968a = new p(hVar.f4975d.c());
    }

    @Override // ja.e0
    public final void b0(ja.g gVar, long j10) {
        d7.a.m(gVar, "source");
        if (!(!this.f4969b)) {
            throw new IllegalStateException("closed".toString());
        }
        long j11 = gVar.f8534b;
        byte[] bArr = y9.b.f17000a;
        if (j10 < 0 || 0 > j11 || j11 < j10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f4970c.f4975d.b0(gVar, j10);
    }

    @Override // ja.e0
    public final i0 c() {
        return this.f4968a;
    }

    @Override // ja.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4969b) {
            return;
        }
        this.f4969b = true;
        h hVar = this.f4970c;
        hVar.getClass();
        p pVar = this.f4968a;
        i0 i0Var = pVar.f8561e;
        pVar.f8561e = i0.f8535d;
        i0Var.a();
        i0Var.b();
        hVar.f4976e = 3;
    }

    @Override // ja.e0, java.io.Flushable
    public final void flush() {
        if (this.f4969b) {
            return;
        }
        this.f4970c.f4975d.flush();
    }
}
