package h8;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class e implements j8.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f7616d = Logger.getLogger(n.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f7617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8.b f7618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v6.d f7619c = new v6.d(Level.FINE);

    public e(d dVar, b bVar) {
        y3.e.J(dVar, "transportExceptionHandler");
        this.f7617a = dVar;
        this.f7618b = bVar;
    }

    @Override // j8.b
    public final void D(a4.k kVar) {
        v6.d dVar = this.f7619c;
        if (dVar.f()) {
            ((Logger) dVar.f15907b).log((Level) dVar.f15908c, a7.a.H(2).concat(" SETTINGS: ack=true"));
        }
        try {
            this.f7618b.D(kVar);
        } catch (IOException e4) {
            ((n) this.f7617a).p(e4);
        }
    }

    @Override // j8.b
    public final void E() {
        try {
            this.f7618b.E();
        } catch (IOException e4) {
            ((n) this.f7617a).p(e4);
        }
    }

    @Override // j8.b
    public final void G(boolean z10, int i10, List list) {
        try {
            this.f7618b.G(z10, i10, list);
        } catch (IOException e4) {
            ((n) this.f7617a).p(e4);
        }
    }

    @Override // j8.b
    public final void N(int i10, long j10) {
        this.f7619c.l(2, i10, j10);
        try {
            this.f7618b.N(i10, j10);
        } catch (IOException e4) {
            ((n) this.f7617a).p(e4);
        }
    }

    @Override // j8.b
    public final int R() {
        return this.f7618b.R();
    }

    @Override // j8.b
    public final void X(int i10, boolean z10, int i11) {
        v6.d dVar = this.f7619c;
        if (z10) {
            long j10 = (4294967295L & ((long) i11)) | (((long) i10) << 32);
            if (dVar.f()) {
                ((Logger) dVar.f15907b).log((Level) dVar.f15908c, a7.a.H(2) + " PING: ack=true bytes=" + j10);
            }
        } else {
            dVar.i(2, (4294967295L & ((long) i11)) | (((long) i10) << 32));
        }
        try {
            this.f7618b.X(i10, z10, i11);
        } catch (IOException e4) {
            ((n) this.f7617a).p(e4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f7618b.close();
        } catch (IOException e4) {
            f7616d.log(e4.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e4);
        }
    }

    @Override // j8.b
    public final void d(j8.a aVar, byte[] bArr) {
        j8.b bVar = this.f7618b;
        this.f7619c.h(2, 0, aVar, ja.j.l(bArr));
        try {
            bVar.d(aVar, bArr);
            bVar.flush();
        } catch (IOException e4) {
            ((n) this.f7617a).p(e4);
        }
    }

    @Override // j8.b
    public final void flush() {
        try {
            this.f7618b.flush();
        } catch (IOException e4) {
            ((n) this.f7617a).p(e4);
        }
    }

    @Override // j8.b
    public final void o(int i10, j8.a aVar) {
        this.f7619c.j(2, i10, aVar);
        try {
            this.f7618b.o(i10, aVar);
        } catch (IOException e4) {
            ((n) this.f7617a).p(e4);
        }
    }

    @Override // j8.b
    public final void r(int i10, int i11, ja.g gVar, boolean z10) {
        v6.d dVar = this.f7619c;
        gVar.getClass();
        dVar.g(2, i10, gVar, i11, z10);
        try {
            this.f7618b.r(i10, i11, gVar, z10);
        } catch (IOException e4) {
            ((n) this.f7617a).p(e4);
        }
    }

    @Override // j8.b
    public final void v(a4.k kVar) {
        this.f7619c.k(2, kVar);
        try {
            this.f7618b.v(kVar);
        } catch (IOException e4) {
            ((n) this.f7617a).p(e4);
        }
    }
}
