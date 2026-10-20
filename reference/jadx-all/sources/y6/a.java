package y6;

import j7.q;
import j7.r;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import u1.c1;

/* JADX INFO: loaded from: classes.dex */
public final class a implements v6.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c1 f16987b = new c1(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f16988a;

    public a(byte[] bArr) throws InvalidAlgorithmParameterException {
        r.a(bArr.length);
        this.f16988a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(byte[] bArr, int i10) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i10);
        } catch (ClassNotFoundException unused) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                return new IvParameterSpec(bArr, 0, i10);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // v6.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrA = q.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArrA, bArrA.length);
        c1 c1Var = f16987b;
        ((Cipher) c1Var.get()).init(1, this.f16988a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) c1Var.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) c1Var.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
    }

    @Override // v6.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArr, 12);
        c1 c1Var = f16987b;
        ((Cipher) c1Var.get()).init(2, this.f16988a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) c1Var.get()).updateAAD(bArr2);
        }
        return ((Cipher) c1Var.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
