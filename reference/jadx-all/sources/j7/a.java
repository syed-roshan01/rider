package j7;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import u1.c1;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c1 f8392d = new c1(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f8393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8395c;

    public a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!a7.a.f(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        r.a(bArr.length);
        this.f8393a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f8392d.get()).getBlockSize();
        this.f8395c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f8394b = i10;
    }

    public final void a(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f8392d.get();
        byte[] bArr4 = new byte[this.f8395c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f8394b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f8393a;
        if (z10) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
