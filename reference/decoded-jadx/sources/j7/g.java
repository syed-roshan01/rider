package j7;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g implements v6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x6.e f8412b;

    public g(byte[] bArr, int i10) {
        this.f8411a = i10;
        if (i10 != 1) {
            this.f8412b = new x6.e(bArr, 0);
        } else {
            this.f8412b = new x6.e(bArr, 1);
        }
    }

    @Override // v6.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i10 = this.f8411a;
        x6.e eVar = this.f8412b;
        switch (i10) {
            case 0:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrA = q.a(12);
                byteBufferAllocate.put(bArrA);
                eVar.b(byteBufferAllocate, bArrA, bArr, bArr2);
                return byteBufferAllocate.array();
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrA2 = q.a(24);
                byteBufferAllocate2.put(bArrA2);
                eVar.b(byteBufferAllocate2, bArrA2, bArr, bArr2);
                return byteBufferAllocate2.array();
        }
    }

    @Override // v6.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i10 = this.f8411a;
        x6.e eVar = this.f8412b;
        switch (i10) {
            case 0:
                if (bArr.length < 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return eVar.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
            default:
                if (bArr.length < 40) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return eVar.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
        }
    }
}
