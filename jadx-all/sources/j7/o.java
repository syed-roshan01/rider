package j7;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class o implements h7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f8425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Key f8427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8428d;

    public o(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        n nVar = new n(this);
        this.f8425a = nVar;
        if (!a7.a.f(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f8426b = str;
        this.f8427c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                this.f8428d = 20;
                break;
            case "HMACSHA224":
                this.f8428d = 28;
                break;
            case "HMACSHA256":
                this.f8428d = 32;
                break;
            case "HMACSHA384":
                this.f8428d = 48;
                break;
            case "HMACSHA512":
                this.f8428d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        nVar.get();
    }

    @Override // h7.a
    public final byte[] a(int i10, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (i10 > this.f8428d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        n nVar = this.f8425a;
        ((Mac) nVar.get()).update(bArr);
        return Arrays.copyOf(((Mac) nVar.get()).doFinal(), i10);
    }
}
