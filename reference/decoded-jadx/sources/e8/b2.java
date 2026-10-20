package e8;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b2 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f5205a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    @Override // e8.k1
    public final byte[] a(Serializable serializable) {
        byte[] bytes = ((String) serializable).getBytes(q6.d.f13204b);
        int i10 = 0;
        while (i10 < bytes.length) {
            byte b10 = bytes[i10];
            if (b10 < 32 || b10 >= 126 || b10 == 37) {
                byte[] bArr = new byte[((bytes.length - i10) * 3) + i10];
                if (i10 != 0) {
                    System.arraycopy(bytes, 0, bArr, 0, i10);
                }
                int i11 = i10;
                while (i10 < bytes.length) {
                    byte b11 = bytes[i10];
                    if (b11 < 32 || b11 >= 126 || b11 == 37) {
                        bArr[i11] = 37;
                        byte[] bArr2 = f5205a;
                        bArr[i11 + 1] = bArr2[(b11 >> 4) & 15];
                        bArr[i11 + 2] = bArr2[b11 & 15];
                        i11 += 3;
                    } else {
                        bArr[i11] = b11;
                        i11++;
                    }
                    i10++;
                }
                return Arrays.copyOf(bArr, i11);
            }
            i10++;
        }
        return bytes;
    }

    @Override // e8.k1
    public final Object b(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            if (b10 < 32 || b10 >= 126 || (b10 == 37 && i10 + 2 < bArr.length)) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
                int i11 = 0;
                while (i11 < bArr.length) {
                    if (bArr[i11] == 37 && i11 + 2 < bArr.length) {
                        try {
                            byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i11 + 1, 2, q6.d.f13203a), 16));
                            i11 += 3;
                        } catch (NumberFormatException unused) {
                            byteBufferAllocate.put(bArr[i11]);
                            i11++;
                        }
                    }
                    byteBufferAllocate.put(bArr[i11]);
                    i11++;
                }
                return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), q6.d.f13204b);
            }
        }
        return new String(bArr, 0);
    }
}
