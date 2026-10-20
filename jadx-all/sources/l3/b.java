package l3;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteOrder f11231e = ByteOrder.LITTLE_ENDIAN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ByteOrder f11232f = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataInputStream f11233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteOrder f11234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f11236d;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public final void a(int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            DataInputStream dataInputStream = this.f11233a;
            int i12 = i10 - i11;
            int iSkip = (int) dataInputStream.skip(i12);
            if (iSkip <= 0) {
                if (this.f11236d == null) {
                    this.f11236d = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f11236d, 0, Math.min(8192, i12));
                if (iSkip == -1) {
                    throw new EOFException(q.h("Reached EOF while skipping ", i10, " bytes."));
                }
            }
            i11 += iSkip;
        }
        this.f11235c += i11;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f11233a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f11235c++;
        return this.f11233a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f11235c++;
        return this.f11233a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f11235c++;
        int i10 = this.f11233a.read();
        if (i10 >= 0) {
            return (byte) i10;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f11235c += 2;
        return this.f11233a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f11235c += i11;
        this.f11233a.readFully(bArr, i10, i11);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f11235c += 4;
        DataInputStream dataInputStream = this.f11233a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f11234b;
        if (byteOrder == f11231e) {
            return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
        }
        if (byteOrder == f11232f) {
            return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
        }
        throw new IOException("Invalid byte order: " + this.f11234b);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.f11235c += 8;
        DataInputStream dataInputStream = this.f11233a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        int i17 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f11234b;
        if (byteOrder == f11231e) {
            return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
        }
        if (byteOrder == f11232f) {
            return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
        }
        throw new IOException("Invalid byte order: " + this.f11234b);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f11235c += 2;
        DataInputStream dataInputStream = this.f11233a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f11234b;
        if (byteOrder == f11231e) {
            return (short) ((i11 << 8) + i10);
        }
        if (byteOrder == f11232f) {
            return (short) ((i10 << 8) + i11);
        }
        throw new IOException("Invalid byte order: " + this.f11234b);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f11235c += 2;
        return this.f11233a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f11235c++;
        return this.f11233a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f11235c += 2;
        DataInputStream dataInputStream = this.f11233a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f11234b;
        if (byteOrder == f11231e) {
            return (i11 << 8) + i10;
        }
        if (byteOrder == f11232f) {
            return (i10 << 8) + i11;
        }
        throw new IOException("Invalid byte order: " + this.f11234b);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i10) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f11233a.read(bArr, i10, i11);
        this.f11235c += i12;
        return i12;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f11235c += bArr.length;
        this.f11233a.readFully(bArr);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        this.f11234b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f11233a = dataInputStream;
        dataInputStream.mark(0);
        this.f11235c = 0;
        this.f11234b = byteOrder;
    }
}
