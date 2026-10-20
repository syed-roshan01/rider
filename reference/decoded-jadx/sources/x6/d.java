package x6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f16314b;

    public final ByteBuffer a(int i10, byte[] bArr) {
        int[] iArr;
        int[] iArrC = a.c(bArr);
        c cVar = (c) this;
        int i11 = 24;
        int i12 = cVar.f16312c;
        switch (i12) {
            case 0:
                int length = iArrC.length;
                switch (i12) {
                    case 0:
                        i11 = 12;
                        break;
                }
                if (length != i11 / 4) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArrC.length * 32)));
                }
                iArr = new int[16];
                int[] iArr2 = (int[]) cVar.f16314b;
                int[] iArr3 = a.f16308a;
                System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
                System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
                iArr[12] = i10;
                System.arraycopy(iArrC, 0, iArr, 13, iArrC.length);
                break;
                break;
            default:
                int length2 = iArrC.length;
                switch (i12) {
                    case 0:
                        i11 = 12;
                        break;
                }
                if (length2 != i11 / 4) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArrC.length * 32)));
                }
                iArr = new int[16];
                int[] iArr4 = (int[]) cVar.f16314b;
                int[] iArr5 = new int[16];
                int[] iArr6 = a.f16308a;
                System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
                System.arraycopy(iArr4, 0, iArr5, iArr6.length, 8);
                iArr5[12] = iArrC[0];
                iArr5[13] = iArrC[1];
                iArr5[14] = iArrC[2];
                iArr5[15] = iArrC[3];
                a.b(iArr5);
                iArr5[4] = iArr5[12];
                iArr5[5] = iArr5[13];
                iArr5[6] = iArr5[14];
                iArr5[7] = iArr5[15];
                int[] iArrCopyOf = Arrays.copyOf(iArr5, 8);
                System.arraycopy(iArr6, 0, iArr, 0, iArr6.length);
                System.arraycopy(iArrCopyOf, 0, iArr, iArr6.length, 8);
                iArr[12] = i10;
                iArr[13] = 0;
                iArr[14] = iArrC[4];
                iArr[15] = iArrC[5];
                break;
                break;
        }
        int[] iArr7 = (int[]) iArr.clone();
        a.b(iArr7);
        for (int i13 = 0; i13 < iArr.length; i13++) {
            iArr[i13] = iArr[i13] + iArr7[i13];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArr, 0, 16);
        return byteBufferOrder;
    }

    public final void b(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        int i10;
        int length = bArr.length;
        int i11 = 12;
        int i12 = ((c) this).f16312c;
        switch (i12) {
            case 0:
                i10 = 12;
                break;
            default:
                i10 = 24;
                break;
        }
        if (length != i10) {
            StringBuilder sb = new StringBuilder("The nonce length (in bytes) must be ");
            switch (i12) {
                case 0:
                    break;
                default:
                    i11 = 24;
                    break;
            }
            sb.append(i11);
            throw new GeneralSecurityException(sb.toString());
        }
        int iRemaining = byteBuffer2.remaining();
        int i13 = iRemaining / 64;
        int i14 = i13 + 1;
        for (int i15 = 0; i15 < i14; i15++) {
            ByteBuffer byteBufferA = a(this.f16313a + i15, bArr);
            if (i15 == i13) {
                z6.a.y0(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                z6.a.y0(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }
}
