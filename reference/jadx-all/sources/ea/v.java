package ea;

import ja.e0;
import ja.i0;

/* JADX INFO: loaded from: classes.dex */
public final class v implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ja.g f5534b = new ja.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f5536d;

    public v(y yVar, boolean z10) {
        this.f5536d = yVar;
        this.f5533a = z10;
    }

    public final void a(boolean z10) {
        long jMin;
        boolean z11;
        y yVar = this.f5536d;
        synchronized (yVar) {
            yVar.f5555l.h();
            while (yVar.f5548e >= yVar.f5549f && !this.f5533a && !this.f5535c) {
                try {
                    synchronized (yVar) {
                        b bVar = yVar.f5556m;
                        if (bVar != null) {
                            break;
                        } else {
                            yVar.k();
                        }
                    }
                } catch (Throwable th) {
                    yVar.f5555l.l();
                    throw th;
                }
            }
            yVar.f5555l.l();
            yVar.b();
            jMin = Math.min(yVar.f5549f - yVar.f5548e, this.f5534b.f8534b);
            yVar.f5548e += jMin;
            z11 = z10 && jMin == this.f5534b.f8534b;
        }
        this.f5536d.f5555l.h();
        try {
            y yVar2 = this.f5536d;
            yVar2.f5545b.q(yVar2.f5544a, z11, this.f5534b, jMin);
        } finally {
            this.f5536d.f5555l.l();
        }
    }

    @Override // ja.e0
    public final void b0(ja.g gVar, long j10) {
        d7.a.m(gVar, "source");
        byte[] bArr = y9.b.f17000a;
        ja.g gVar2 = this.f5534b;
        gVar2.b0(gVar, j10);
        while (gVar2.f8534b >= 16384) {
            a(false);
        }
    }

    @Override // ja.e0
    public final i0 c() {
        return this.f5536d.f5555l;
    }

    @Override // ja.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z10;
        y yVar = this.f5536d;
        byte[] bArr = y9.b.f17000a;
        synchronized (yVar) {
            if (this.f5535c) {
                return;
            }
            synchronized (yVar) {
                z10 = yVar.f5556m == null;
            }
            y yVar2 = this.f5536d;
            if (!yVar2.f5553j.f5533a) {
                if (this.f5534b.f8534b > 0) {
                    while (this.f5534b.f8534b > 0) {
                        a(true);
                    }
                } else if (z10) {
                    yVar2.f5545b.q(yVar2.f5544a, true, null, 0L);
                }
            }
            synchronized (this.f5536d) {
                this.f5535c = true;
            }
            this.f5536d.f5545b.F.flush();
            this.f5536d.a();
        }
    }

    @Override // ja.e0, java.io.Flushable
    public final void flush() {
        y yVar = this.f5536d;
        byte[] bArr = y9.b.f17000a;
        synchronized (yVar) {
            yVar.b();
        }
        while (this.f5534b.f8534b > 0) {
            a(false);
            this.f5536d.f5545b.F.flush();
        }
    }
}
