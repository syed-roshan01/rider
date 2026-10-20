package j8;

import ja.a0;
import ja.g0;
import ja.i0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class g implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja.i f8476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f8478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public short f8481f;

    public g(a0 a0Var) {
        this.f8476a = a0Var;
    }

    @Override // ja.g0
    public final long I(ja.g gVar, long j10) throws IOException {
        int i10;
        int i11;
        do {
            int i12 = this.f8480e;
            ja.i iVar = this.f8476a;
            if (i12 != 0) {
                long jI = iVar.I(gVar, Math.min(j10, i12));
                if (jI == -1) {
                    return -1L;
                }
                this.f8480e -= (int) jI;
                return jI;
            }
            iVar.l(this.f8481f);
            this.f8481f = (short) 0;
            if ((this.f8478c & 4) != 0) {
                return -1L;
            }
            i10 = this.f8479d;
            int iA = k.a(iVar);
            this.f8480e = iA;
            this.f8477b = iA;
            byte b10 = (byte) (iVar.readByte() & 255);
            this.f8478c = (byte) (iVar.readByte() & 255);
            Logger logger = k.f8494a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(h.a(true, this.f8479d, this.f8477b, b10, this.f8478c));
            }
            i11 = iVar.readInt() & Integer.MAX_VALUE;
            this.f8479d = i11;
            if (b10 != 9) {
                k.c("%s != TYPE_CONTINUATION", Byte.valueOf(b10));
                throw null;
            }
        } while (i11 == i10);
        k.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // ja.g0
    public final i0 c() {
        return this.f8476a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
