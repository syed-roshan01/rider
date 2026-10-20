package j7;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class p implements v6.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h7.a f8429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8430b;

    public p(h7.a aVar, int i10) throws InvalidAlgorithmParameterException {
        this.f8429a = aVar;
        this.f8430b = i10;
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(i10, new byte[0]);
    }

    @Override // v6.m
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // v6.m
    public final byte[] b(byte[] bArr) {
        return this.f8429a.a(this.f8430b, bArr);
    }
}
