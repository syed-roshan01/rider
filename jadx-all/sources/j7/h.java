package j7;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h implements v6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f8413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v6.m f8414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8415c;

    public h(l lVar, v6.m mVar, int i10) {
        this.f8413a = lVar;
        this.f8414b = mVar;
        this.f8415c = i10;
    }

    @Override // v6.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        a aVar = (a) this.f8413a;
        aVar.getClass();
        int length = bArr.length;
        int i10 = aVar.f8394b;
        int i11 = Integer.MAX_VALUE - i10;
        if (length > i11) {
            throw new GeneralSecurityException(l.q.g("plaintext length can not exceed ", i11));
        }
        byte[] bArr3 = new byte[bArr.length + i10];
        byte[] bArrA = q.a(i10);
        System.arraycopy(bArrA, 0, bArr3, 0, i10);
        aVar.a(bArr, 0, bArr.length, bArr3, aVar.f8394b, bArrA, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return z6.a.u(bArr3, this.f8414b.b(z6.a.u(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // v6.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f8415c;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i10, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f8414b.a(bArrCopyOfRange2, z6.a.u(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        a aVar = (a) this.f8413a;
        aVar.getClass();
        int length2 = bArrCopyOfRange.length;
        int i11 = aVar.f8394b;
        if (length2 < i11) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i11);
        int length3 = bArrCopyOfRange.length;
        int i12 = aVar.f8394b;
        byte[] bArr4 = new byte[length3 - i12];
        aVar.a(bArrCopyOfRange, i12, bArrCopyOfRange.length - i12, bArr4, 0, bArr3, false);
        return bArr4;
    }
}
