package ea;

import ja.g0;
import ja.i0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class t implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja.i f5521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5526f;

    public t(ja.i iVar) {
        this.f5521a = iVar;
    }

    @Override // ja.g0
    public final long I(ja.g gVar, long j10) throws IOException {
        int i10;
        int i11;
        d7.a.m(gVar, "sink");
        do {
            int i12 = this.f5525e;
            ja.i iVar = this.f5521a;
            if (i12 != 0) {
                long jI = iVar.I(gVar, Math.min(j10, i12));
                if (jI == -1) {
                    return -1L;
                }
                this.f5525e -= (int) jI;
                return jI;
            }
            iVar.l(this.f5526f);
            this.f5526f = 0;
            if ((this.f5523c & 4) != 0) {
                return -1L;
            }
            i10 = this.f5524d;
            int iQ = y9.b.q(iVar);
            this.f5525e = iQ;
            this.f5522b = iQ;
            int i13 = iVar.readByte() & 255;
            this.f5523c = iVar.readByte() & 255;
            x9.v vVar = u.f5527e;
            if (vVar.v().isLoggable(Level.FINE)) {
                Logger loggerV = vVar.v();
                ja.j jVar = e.f5453a;
                loggerV.fine(e.a(this.f5524d, this.f5522b, i13, this.f5523c, true));
            }
            i11 = iVar.readInt() & Integer.MAX_VALUE;
            this.f5524d = i11;
            if (i13 != 9) {
                throw new IOException(i13 + " != TYPE_CONTINUATION");
            }
        } while (i11 == i10);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // ja.g0
    public final i0 c() {
        return this.f5521a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
