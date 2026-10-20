package b7;

import d7.h;
import d7.i;
import j0.b0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import v6.n;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public final class b implements v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f2735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f2736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f2737c;

    public b(b0 b0Var) {
        this.f2735a = b0Var;
        boolean z10 = !((g7.a) b0Var.f8252e).f6625a.isEmpty();
        v vVar = d7.a.f4882a;
        if (!z10) {
            this.f2736b = vVar;
            this.f2737c = vVar;
            return;
        }
        h hVar = (h) i.f4893b.f4895a.get();
        hVar = hVar == null ? i.f4894c : hVar;
        d7.a.v(b0Var);
        hVar.getClass();
        this.f2736b = vVar;
        this.f2737c = vVar;
    }

    @Override // v6.c
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        v vVar = this.f2736b;
        b0 b0Var = this.f2735a;
        try {
            byte[][] bArr3 = new byte[2][];
            byte[] bArr4 = ((n) b0Var.f8250c).f15924c;
            bArr3[0] = bArr4 == null ? null : Arrays.copyOf(bArr4, bArr4.length);
            bArr3[1] = ((v6.c) ((n) b0Var.f8250c).f15923b).a(bArr, bArr2);
            byte[] bArrU = z6.a.u(bArr3);
            int i10 = ((n) b0Var.f8250c).f15927f;
            int length = bArr.length;
            vVar.getClass();
            return bArrU;
        } catch (GeneralSecurityException e4) {
            vVar.getClass();
            throw e4;
        }
    }

    @Override // v6.c
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        b0 b0Var = this.f2735a;
        v vVar = this.f2737c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = b0Var.b(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrB = ((v6.c) ((n) it.next()).f15923b).b(bArrCopyOfRange, bArr2);
                    int length2 = bArrCopyOfRange.length;
                    vVar.getClass();
                    return bArrB;
                } catch (GeneralSecurityException e4) {
                    c.f2738a.info("ciphertext prefix matches a key, but cannot decrypt: " + e4);
                }
            }
        }
        Iterator it2 = b0Var.b(v6.b.f15905a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrB2 = ((v6.c) ((n) it2.next()).f15923b).b(bArr, bArr2);
                vVar.getClass();
                return bArrB2;
            } catch (GeneralSecurityException unused) {
            }
        }
        vVar.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
