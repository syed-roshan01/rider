package h8;

import g8.m4;
import ja.b0;
import ja.c0;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends g8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja.g f7716a;

    public r(ja.g gVar) {
        this.f7716a = gVar;
    }

    @Override // g8.m4
    public final void H(OutputStream outputStream, int i10) throws IOException {
        long j10 = i10;
        ja.g gVar = this.f7716a;
        gVar.getClass();
        d7.a.m(outputStream, "out");
        d0.m(gVar.f8534b, 0L, j10);
        b0 b0Var = gVar.f8533a;
        while (j10 > 0) {
            d7.a.j(b0Var);
            int iMin = (int) Math.min(j10, b0Var.f8509c - b0Var.f8508b);
            outputStream.write(b0Var.f8507a, b0Var.f8508b, iMin);
            int i11 = b0Var.f8508b + iMin;
            b0Var.f8508b = i11;
            long j11 = iMin;
            gVar.f8534b -= j11;
            j10 -= j11;
            if (i11 == b0Var.f8509c) {
                b0 b0VarA = b0Var.a();
                gVar.f8533a = b0VarA;
                c0.a(b0Var);
                b0Var = b0VarA;
            }
        }
    }

    @Override // g8.m4
    public final void U(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // g8.m4
    public final void Z(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            int iU = this.f7716a.u(bArr, i10, i11);
            if (iU == -1) {
                throw new IndexOutOfBoundsException(l.q.h("EOF trying to read ", i11, " bytes"));
            }
            i11 -= iU;
            i10 += iU;
        }
    }

    @Override // g8.d, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7716a.a();
    }

    @Override // g8.m4
    public final int j() {
        return (int) this.f7716a.f8534b;
    }

    @Override // g8.m4
    public final int readUnsignedByte() {
        try {
            return this.f7716a.readByte() & 255;
        } catch (EOFException e4) {
            throw new IndexOutOfBoundsException(e4.getMessage());
        }
    }

    @Override // g8.m4
    public final void skipBytes(int i10) {
        try {
            this.f7716a.l(i10);
        } catch (EOFException e4) {
            throw new IndexOutOfBoundsException(e4.getMessage());
        }
    }

    @Override // g8.m4
    public final m4 t(int i10) {
        ja.g gVar = new ja.g();
        gVar.b0(this.f7716a, i10);
        return new r(gVar);
    }
}
