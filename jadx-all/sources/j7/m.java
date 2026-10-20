package j7;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class m implements h7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f8421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f8423c;

    public m(byte[] bArr) throws GeneralSecurityException {
        r.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f8421a = secretKeySpec;
        if (!a7.a.e(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) j.f8418b.a("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bArrR = d7.a.r(cipher.doFinal(new byte[16]));
        this.f8422b = bArrR;
        this.f8423c = d7.a.r(bArrR);
    }

    @Override // h7.a
    public final byte[] a(int i10, byte[] bArr) {
        byte[] bArrA0;
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!a7.a.e(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) j.f8418b.a("AES/ECB/NoPadding");
        cipher.init(1, this.f8421a);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrA0 = z6.a.z0(bArr, (iMax - 1) * 16, this.f8422b, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrA0 = z6.a.A0(bArrCopyOf, this.f8423c);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i11 = 0; i11 < iMax - 1; i11++) {
            bArrDoFinal = cipher.doFinal(z6.a.z0(bArrDoFinal, 0, bArr, i11 * 16, 16));
        }
        return Arrays.copyOf(cipher.doFinal(z6.a.A0(bArrA0, bArrDoFinal)), i10);
    }
}
