package g8;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class n4 extends InputStream implements e8.t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m4 f7008a;

    @Override // java.io.InputStream
    public final int available() {
        return this.f7008a.j();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7008a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f7008a.k();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f7008a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        m4 m4Var = this.f7008a;
        if (m4Var.j() == 0) {
            return -1;
        }
        return m4Var.readUnsignedByte();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f7008a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        m4 m4Var = this.f7008a;
        int iMin = (int) Math.min(m4Var.j(), j10);
        m4Var.skipBytes(iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        m4 m4Var = this.f7008a;
        if (m4Var.j() == 0) {
            return -1;
        }
        int iMin = Math.min(m4Var.j(), i11);
        m4Var.Z(bArr, i10, iMin);
        return iMin;
    }
}
