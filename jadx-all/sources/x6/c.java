package x6;

import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16312c;

    public c(byte[] bArr, int i10, int i11) throws InvalidKeyException {
        this.f16312c = i11;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f16314b = a.c(bArr);
        this.f16313a = i10;
    }
}
