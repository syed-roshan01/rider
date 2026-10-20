package w6;

import com.google.crypto.tink.shaded.protobuf.h0;
import i7.d1;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class z implements v6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f16253c = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f16254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v6.a f16255b;

    public z(d1 d1Var, c7.c cVar) {
        this.f16254a = d1Var;
        this.f16255b = cVar;
    }

    @Override // v6.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        com.google.crypto.tink.shaded.protobuf.b0 b0VarB;
        d1 d1Var = this.f16254a;
        AtomicReference atomicReference = v6.q.f15931a;
        synchronized (v6.q.class) {
            try {
                d7.f fVar = ((v6.f) v6.q.f15931a.get()).a(d1Var.C()).f15909a;
                Class cls = fVar.f4892c;
                if (!fVar.f4891b.keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", fVar.toString(), cls.getName()));
                }
                if (!((Boolean) v6.q.f15933c.get(d1Var.C())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + d1Var.C());
                }
                com.google.crypto.tink.shaded.protobuf.l lVarD = d1Var.D();
                try {
                    g gVarD = fVar.d();
                    com.google.crypto.tink.shaded.protobuf.b0 b0VarE = gVarD.e(lVarD);
                    gVarD.g(b0VarE);
                    b0VarB = gVarD.b(b0VarE);
                } catch (h0 e4) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) fVar.d().f6226a).getName()), e4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] bArrD = b0VarB.d();
        byte[] bArrA = this.f16255b.a(bArrD, f16253c);
        byte[] bArrA2 = ((v6.a) v6.q.d(this.f16254a.C(), bArrD)).a(bArr, bArr2);
        return ByteBuffer.allocate(bArrA.length + 4 + bArrA2.length).putInt(bArrA.length).put(bArrA).put(bArrA2).array();
    }

    @Override // v6.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            byteBufferWrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((v6.a) v6.q.d(this.f16254a.C(), this.f16255b.b(bArr3, f16253c))).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
