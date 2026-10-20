package g8;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class w3 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y5 f7196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7199e;

    public w3(InputStream inputStream, int i10, y5 y5Var) {
        super(inputStream);
        this.f7199e = -1L;
        this.f7195a = i10;
        this.f7196b = y5Var;
    }

    public final void a() {
        long j10 = this.f7198d;
        long j11 = this.f7197c;
        if (j10 > j11) {
            long j12 = j10 - j11;
            for (o7.d0 d0Var : this.f7196b.f7292a) {
                d0Var.K(j12);
            }
            this.f7197c = this.f7198d;
        }
    }

    public final void b() {
        long j10 = this.f7198d;
        int i10 = this.f7195a;
        if (j10 <= i10) {
            return;
        }
        throw new e8.e2(e8.c2.f5222k.g("Decompressed gRPC message exceeds maximum size " + i10));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f7199e = this.f7198d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.f7198d++;
        }
        b();
        a();
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f7199e == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f7198d = this.f7199e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j10);
        this.f7198d += jSkip;
        b();
        a();
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f7198d += (long) i12;
        }
        b();
        a();
        return i12;
    }
}
