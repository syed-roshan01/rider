package g8;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* JADX INFO: loaded from: classes.dex */
public final class o4 extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f7025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7026d = -1;

    public o4(byte[] bArr, int i10, int i11) {
        y3.e.G("offset must be >= 0", i10 >= 0);
        y3.e.G("length must be >= 0", i11 >= 0);
        int i12 = i11 + i10;
        y3.e.G("offset + length exceeds array boundary", i12 <= bArr.length);
        this.f7025c = bArr;
        this.f7023a = i10;
        this.f7024b = i12;
    }

    @Override // g8.m4
    public final void H(OutputStream outputStream, int i10) throws IOException {
        a(i10);
        outputStream.write(this.f7025c, this.f7023a, i10);
        this.f7023a += i10;
    }

    @Override // g8.m4
    public final void U(ByteBuffer byteBuffer) {
        y3.e.J(byteBuffer, "dest");
        int iRemaining = byteBuffer.remaining();
        a(iRemaining);
        byteBuffer.put(this.f7025c, this.f7023a, iRemaining);
        this.f7023a += iRemaining;
    }

    @Override // g8.m4
    public final void Z(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f7025c, this.f7023a, bArr, i10, i11);
        this.f7023a += i11;
    }

    @Override // g8.m4
    public final int j() {
        return this.f7024b - this.f7023a;
    }

    @Override // g8.d, g8.m4
    public final void k() {
        this.f7026d = this.f7023a;
    }

    @Override // g8.m4
    public final int readUnsignedByte() {
        a(1);
        int i10 = this.f7023a;
        this.f7023a = i10 + 1;
        return this.f7025c[i10] & 255;
    }

    @Override // g8.d, g8.m4
    public final void reset() {
        int i10 = this.f7026d;
        if (i10 == -1) {
            throw new InvalidMarkException();
        }
        this.f7023a = i10;
    }

    @Override // g8.m4
    public final void skipBytes(int i10) {
        a(i10);
        this.f7023a += i10;
    }

    @Override // g8.m4
    public final m4 t(int i10) {
        a(i10);
        int i11 = this.f7023a;
        this.f7023a = i11 + i10;
        return new o4(this.f7025c, i11, i10);
    }
}
