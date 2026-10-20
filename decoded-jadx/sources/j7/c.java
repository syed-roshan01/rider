package j7;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import u1.c1;

/* JADX INFO: loaded from: classes.dex */
public final class c implements v6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x6.b f8402a;

    public c(byte[] bArr) throws GeneralSecurityException {
        if (!a7.a.f(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f8402a = new x6.b(bArr);
    }

    @Override // v6.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrA = q.a(12);
        x6.b bVar = this.f8402a;
        bVar.getClass();
        if (bArrA.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z10 = bVar.f16311b;
        byte[] bArr3 = new byte[z10 ? bArr.length + 28 : bArr.length + 16];
        if (z10) {
            System.arraycopy(bArrA, 0, bArr3, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpecA = x6.b.a(bArrA);
        c1 c1Var = x6.b.f16309c;
        ((Cipher) c1Var.get()).init(1, bVar.f16310a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) c1Var.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) c1Var.get()).doFinal(bArr, 0, bArr.length, bArr3, z10 ? 12 : 0);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
    }

    @Override // v6.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        x6.b bVar = this.f8402a;
        bVar.getClass();
        if (bArrCopyOf.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        boolean z10 = bVar.f16311b;
        if (bArr.length < (z10 ? 28 : 16)) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (z10 && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = x6.b.a(bArrCopyOf);
        c1 c1Var = x6.b.f16309c;
        ((Cipher) c1Var.get()).init(2, bVar.f16310a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) c1Var.get()).updateAAD(bArr2);
        }
        int i10 = z10 ? 12 : 0;
        int length = bArr.length;
        if (z10) {
            length -= 12;
        }
        return ((Cipher) c1Var.get()).doFinal(bArr, i10, length);
    }
}
