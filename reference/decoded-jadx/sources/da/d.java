package da;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import l9.i;
import x9.q;
import x9.s;
import x9.w;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f4962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4964f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f4965n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, s sVar) {
        super(hVar);
        d7.a.m(sVar, "url");
        this.f4965n = hVar;
        this.f4962d = sVar;
        this.f4963e = -1L;
        this.f4964f = true;
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
        if (!this.f4964f) {
            return -1L;
        }
        long j11 = this.f4963e;
        h hVar = this.f4965n;
        if (j11 == 0 || j11 == -1) {
            if (j11 != -1) {
                hVar.f4974c.w();
            }
            try {
                this.f4963e = hVar.f4974c.Y();
                String string = i.o1(hVar.f4974c.w()).toString();
                if (this.f4963e < 0 || (string.length() > 0 && !i.h1(string, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f4963e + string + '\"');
                }
                if (this.f4963e == 0) {
                    this.f4964f = false;
                    hVar.f4978g = hVar.f4977f.a();
                    w wVar = hVar.f4972a;
                    d7.a.j(wVar);
                    q qVar = hVar.f4978g;
                    d7.a.j(qVar);
                    ca.e.b(wVar.f16483q, this.f4962d, qVar);
                    a();
                }
                if (!this.f4964f) {
                    return -1L;
                }
            } catch (NumberFormatException e4) {
                throw new ProtocolException(e4.getMessage());
            }
        }
        long jI = super.I(gVar, Math.min(j10, this.f4963e));
        if (jI != -1) {
            this.f4963e -= jI;
            return jI;
        }
        hVar.f4973b.k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        a();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4957b) {
            return;
        }
        if (this.f4964f && !y9.b.f(this, TimeUnit.MILLISECONDS)) {
            this.f4965n.f4973b.k();
            a();
        }
        this.f4957b = true;
    }
}
