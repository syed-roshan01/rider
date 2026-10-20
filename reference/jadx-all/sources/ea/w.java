package ea;

import ja.g0;
import ja.i0;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class w implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ja.g f5539c = new ja.g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ja.g f5540d = new ja.g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f5542f;

    public w(y yVar, long j10, boolean z10) {
        this.f5542f = yVar;
        this.f5537a = j10;
        this.f5538b = z10;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008a A[LOOP:0: B:4:0x0010->B:45:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:73:0x008d A[SYNTHETIC] */
    @Override // ja.g0
    public final long I(ja.g gVar, long j10) throws Throwable {
        b bVar;
        Throwable d0Var;
        boolean z10;
        long jI;
        d7.a.m(gVar, "sink");
        long j11 = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(a7.a.l("byteCount < 0: ", j10).toString());
        }
        while (true) {
            y yVar = this.f5542f;
            synchronized (yVar) {
                yVar.f5554k.h();
                try {
                    synchronized (yVar) {
                        bVar = yVar.f5556m;
                    }
                    if (z10) {
                        if (jI != -1) {
                            return jI;
                        }
                        if (d0Var == null) {
                            return -1L;
                        }
                        throw d0Var;
                    }
                    j11 = 0;
                } catch (Throwable th) {
                    yVar.f5554k.l();
                    throw th;
                }
            }
            if (bVar == null || this.f5538b) {
                d0Var = null;
            } else {
                d0Var = yVar.f5557n;
                if (d0Var == null) {
                    synchronized (yVar) {
                        b bVar2 = yVar.f5556m;
                        d7.a.j(bVar2);
                        d0Var = new d0(bVar2);
                    }
                }
            }
            if (this.f5541e) {
                throw new IOException("stream closed");
            }
            ja.g gVar2 = this.f5540d;
            long j12 = gVar2.f8534b;
            z10 = false;
            if (j12 > j11) {
                jI = gVar2.I(gVar, Math.min(j10, j12));
                long j13 = yVar.f5546c + jI;
                yVar.f5546c = j13;
                long j14 = j13 - yVar.f5547d;
                if (d0Var == null && j14 >= yVar.f5545b.f5511y.a() / 2) {
                    yVar.f5545b.M(yVar.f5544a, j14);
                    yVar.f5547d = yVar.f5546c;
                }
            } else {
                if (!this.f5538b && d0Var == null) {
                    yVar.k();
                    z10 = true;
                }
                jI = -1;
            }
            yVar.f5554k.l();
            if (z10) {
                if (jI != -1) {
                    return jI;
                }
                if (d0Var == null) {
                    return -1L;
                }
                throw d0Var;
            }
            j11 = 0;
        }
    }

    @Override // ja.g0
    public final i0 c() {
        return this.f5542f.f5554k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j10;
        y yVar = this.f5542f;
        synchronized (yVar) {
            this.f5541e = true;
            ja.g gVar = this.f5540d;
            j10 = gVar.f8534b;
            gVar.a();
            yVar.notifyAll();
        }
        if (j10 > 0) {
            byte[] bArr = y9.b.f17000a;
            this.f5542f.f5545b.p(j10);
        }
        this.f5542f.a();
    }
}
