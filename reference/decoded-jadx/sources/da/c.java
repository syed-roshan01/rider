package da;

import ja.e0;
import ja.i0;
import ja.p;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f4959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f4961c;

    public c(h hVar) {
        this.f4961c = hVar;
        this.f4959a = new p(hVar.f4975d.c());
    }

    @Override // ja.e0
    public final void b0(ja.g gVar, long j10) {
        d7.a.m(gVar, "source");
        if (!(!this.f4960b)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j10 == 0) {
            return;
        }
        h hVar = this.f4961c;
        hVar.f4975d.h(j10);
        hVar.f4975d.V("\r\n");
        hVar.f4975d.b0(gVar, j10);
        hVar.f4975d.V("\r\n");
    }

    @Override // ja.e0
    public final i0 c() {
        return this.f4959a;
    }

    @Override // ja.e0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f4960b) {
            return;
        }
        this.f4960b = true;
        this.f4961c.f4975d.V("0\r\n\r\n");
        h hVar = this.f4961c;
        p pVar = this.f4959a;
        hVar.getClass();
        i0 i0Var = pVar.f8561e;
        pVar.f8561e = i0.f8535d;
        i0Var.a();
        i0Var.b();
        this.f4961c.f4976e = 3;
    }

    @Override // ja.e0, java.io.Flushable
    public final synchronized void flush() {
        if (this.f4960b) {
            return;
        }
        this.f4961c.f4975d.flush();
    }
}
