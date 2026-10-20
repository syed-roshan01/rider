package k4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f9764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9765b = 1073741824;

    public j(InputStream inputStream) {
        this.f9764a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f9765b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9764a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i10 = this.f9764a.read();
        if (i10 == -1) {
            this.f9765b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        return this.f9764a.skip(j10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i10 = this.f9764a.read(bArr);
        if (i10 == -1) {
            this.f9765b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f9764a.read(bArr, i10, i11);
        if (i12 == -1) {
            this.f9765b = 0;
        }
        return i12;
    }
}
