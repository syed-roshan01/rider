package com.google.firebase.firestore.index;

import com.google.protobuf.n;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class OrderedCodeWriter {
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    public static final long DOUBLE_ALL_BITS = -1;
    public static final long DOUBLE_SIGN_MASK = Long.MIN_VALUE;
    public static final byte ESCAPE1 = 0;
    public static final byte ESCAPE2 = -1;
    public static final byte FF_BYTE = 0;
    public static final byte INFINITY = -1;
    private static final byte[][] LENGTH_TO_HEADER_BITS = {new byte[]{0, 0}, new byte[]{-128, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, -128}, new byte[]{-1, -64}};
    public static final byte NULL_BYTE = -1;
    public static final byte SEPARATOR = 1;
    private int position = 0;
    private byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];

    private void ensureAvailable(int i10) {
        int i11 = i10 + this.position;
        byte[] bArr = this.buffer;
        if (i11 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i11) {
            i11 = length;
        }
        this.buffer = Arrays.copyOf(bArr, i11);
    }

    private int signedNumLength(long j10) {
        if (j10 < 0) {
            j10 = ~j10;
        }
        return IntMath.divide(65 - Long.numberOfLeadingZeros(j10), 7, RoundingMode.UP);
    }

    private int unsignedNumLength(long j10) {
        return IntMath.divide(64 - Long.numberOfLeadingZeros(j10), 8, RoundingMode.UP);
    }

    private void writeByteAscending(byte b10) {
        if (b10 == 0) {
            writeEscapedByteAscending((byte) 0);
            writeEscapedByteAscending((byte) -1);
        } else if (b10 != -1) {
            writeEscapedByteAscending(b10);
        } else {
            writeEscapedByteAscending((byte) -1);
            writeEscapedByteAscending((byte) 0);
        }
    }

    private void writeByteDescending(byte b10) {
        if (b10 == 0) {
            writeEscapedByteDescending((byte) 0);
            writeEscapedByteDescending((byte) -1);
        } else if (b10 != -1) {
            writeEscapedByteDescending(b10);
        } else {
            writeEscapedByteDescending((byte) -1);
            writeEscapedByteDescending((byte) 0);
        }
    }

    private void writeEscapedByteAscending(byte b10) {
        ensureAvailable(1);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        bArr[i10] = b10;
    }

    private void writeEscapedByteDescending(byte b10) {
        ensureAvailable(1);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        bArr[i10] = (byte) (~b10);
    }

    private void writeSeparatorAscending() {
        writeEscapedByteAscending((byte) 0);
        writeEscapedByteAscending((byte) 1);
    }

    private void writeSeparatorDescending() {
        writeEscapedByteDescending((byte) 0);
        writeEscapedByteDescending((byte) 1);
    }

    public byte[] encodedBytes() {
        return Arrays.copyOf(this.buffer, this.position);
    }

    public void reset() {
        this.position = 0;
    }

    public void seed(byte[] bArr) {
        ensureAvailable(bArr.length);
        for (byte b10 : bArr) {
            byte[] bArr2 = this.buffer;
            int i10 = this.position;
            this.position = i10 + 1;
            bArr2[i10] = b10;
        }
    }

    public void writeBytesAscending(n nVar) {
        for (int i10 = 0; i10 < nVar.size(); i10++) {
            writeByteAscending(nVar.i(i10));
        }
        writeSeparatorAscending();
    }

    public void writeBytesDescending(n nVar) {
        for (int i10 = 0; i10 < nVar.size(); i10++) {
            writeByteDescending(nVar.i(i10));
        }
        writeSeparatorDescending();
    }

    public void writeDoubleAscending(double d10) {
        long jDoubleToLongBits = Double.doubleToLongBits(d10);
        writeUnsignedLongAscending(jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    public void writeDoubleDescending(double d10) {
        long jDoubleToLongBits = Double.doubleToLongBits(d10);
        writeUnsignedLongDescending(jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    public void writeInfinityAscending() {
        writeEscapedByteAscending((byte) -1);
        writeEscapedByteAscending((byte) -1);
    }

    public void writeInfinityDescending() {
        writeEscapedByteDescending((byte) -1);
        writeEscapedByteDescending((byte) -1);
    }

    public void writeSignedLongAscending(long j10) {
        int i10;
        long j11 = j10 < 0 ? ~j10 : j10;
        if (j11 < 64) {
            ensureAvailable(1);
            byte[] bArr = this.buffer;
            int i11 = this.position;
            this.position = i11 + 1;
            bArr[i11] = (byte) (j10 ^ ((long) LENGTH_TO_HEADER_BITS[1][0]));
            return;
        }
        int iSignedNumLength = signedNumLength(j11);
        ensureAvailable(iSignedNumLength);
        if (iSignedNumLength < 2) {
            throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(iSignedNumLength)));
        }
        byte b10 = j10 < 0 ? (byte) -1 : (byte) 0;
        int i12 = this.position;
        if (iSignedNumLength == 10) {
            i10 = i12 + 2;
            byte[] bArr2 = this.buffer;
            bArr2[i12] = b10;
            bArr2[i12 + 1] = b10;
        } else if (iSignedNumLength == 9) {
            i10 = i12 + 1;
            this.buffer[i12] = b10;
        } else {
            i10 = i12;
        }
        for (int i13 = (iSignedNumLength - 1) + i12; i13 >= i10; i13--) {
            this.buffer[i13] = (byte) (255 & j10);
            j10 >>= 8;
        }
        byte[] bArr3 = this.buffer;
        int i14 = this.position;
        byte b11 = bArr3[i14];
        byte[] bArr4 = LENGTH_TO_HEADER_BITS[iSignedNumLength];
        bArr3[i14] = (byte) (b11 ^ bArr4[0]);
        int i15 = i14 + 1;
        bArr3[i15] = (byte) (bArr4[1] ^ bArr3[i15]);
        this.position = i14 + iSignedNumLength;
    }

    public void writeSignedLongDescending(long j10) {
        writeSignedLongAscending(~j10);
    }

    public void writeUnsignedLongAscending(long j10) {
        int iUnsignedNumLength = unsignedNumLength(j10);
        ensureAvailable(iUnsignedNumLength + 1);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        bArr[i10] = (byte) iUnsignedNumLength;
        int i12 = i11 + iUnsignedNumLength;
        while (true) {
            i12--;
            int i13 = this.position;
            if (i12 < i13) {
                this.position = i13 + iUnsignedNumLength;
                return;
            } else {
                this.buffer[i12] = (byte) (255 & j10);
                j10 >>>= 8;
            }
        }
    }

    public void writeUnsignedLongDescending(long j10) {
        int iUnsignedNumLength = unsignedNumLength(j10);
        ensureAvailable(iUnsignedNumLength + 1);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        bArr[i10] = (byte) (~iUnsignedNumLength);
        int i12 = i11 + iUnsignedNumLength;
        while (true) {
            i12--;
            int i13 = this.position;
            if (i12 < i13) {
                this.position = i13 + iUnsignedNumLength;
                return;
            } else {
                this.buffer[i12] = (byte) (~(255 & j10));
                j10 >>>= 8;
            }
        }
    }

    public void writeUtf8Ascending(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt < 128) {
                writeByteAscending((byte) cCharAt);
            } else if (cCharAt < 2048) {
                writeByteAscending((byte) ((cCharAt >>> 6) | 960));
                writeByteAscending((byte) ((cCharAt & '?') | 128));
            } else if (cCharAt < 55296 || 57343 < cCharAt) {
                writeByteAscending((byte) ((cCharAt >>> '\f') | 480));
                writeByteAscending((byte) (((cCharAt >>> 6) & 63) | 128));
                writeByteAscending((byte) ((cCharAt & '?') | 128));
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i10);
                i10++;
                writeByteAscending((byte) ((iCodePointAt >>> 18) | 240));
                writeByteAscending((byte) (((iCodePointAt >>> 12) & 63) | 128));
                writeByteAscending((byte) (((iCodePointAt >>> 6) & 63) | 128));
                writeByteAscending((byte) ((iCodePointAt & 63) | 128));
            }
            i10++;
        }
        writeSeparatorAscending();
    }

    public void writeUtf8Descending(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt < 128) {
                writeByteDescending((byte) cCharAt);
            } else if (cCharAt < 2048) {
                writeByteDescending((byte) ((cCharAt >>> 6) | 960));
                writeByteDescending((byte) ((cCharAt & '?') | 128));
            } else if (cCharAt < 55296 || 57343 < cCharAt) {
                writeByteDescending((byte) ((cCharAt >>> '\f') | 480));
                writeByteDescending((byte) (((cCharAt >>> 6) & 63) | 128));
                writeByteDescending((byte) ((cCharAt & '?') | 128));
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i10);
                i10++;
                writeByteDescending((byte) ((iCodePointAt >>> 18) | 240));
                writeByteDescending((byte) (((iCodePointAt >>> 12) & 63) | 128));
                writeByteDescending((byte) (((iCodePointAt >>> 6) & 63) | 128));
                writeByteDescending((byte) ((iCodePointAt & 63) | 128));
            }
            i10++;
        }
        writeSeparatorDescending();
    }
}
