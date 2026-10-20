package e7;

import i7.t1;
import j0.b0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public final class q implements v6.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f5189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f5190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f5191c;

    public q(b0 b0Var) {
        this.f5189a = b0Var;
        boolean z10 = !((g7.a) b0Var.f8252e).f6625a.isEmpty();
        v vVar = d7.a.f4882a;
        if (!z10) {
            this.f5190b = vVar;
            this.f5191c = vVar;
            return;
        }
        d7.h hVar = (d7.h) d7.i.f4893b.f4895a.get();
        hVar = hVar == null ? d7.i.f4894c : hVar;
        d7.a.v(b0Var);
        hVar.getClass();
        this.f5190b = vVar;
        this.f5191c = vVar;
    }

    @Override // v6.m
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        v vVar = this.f5191c;
        if (length <= 5) {
            vVar.getClass();
            throw new GeneralSecurityException("tag too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        b0 b0Var = this.f5189a;
        for (v6.n nVar : b0Var.b(bArrCopyOf)) {
            byte[] bArrU = nVar.f15926e.equals(t1.LEGACY) ? z6.a.u(bArr2, r.f5193b) : bArr2;
            try {
                ((v6.m) nVar.f15923b).a(bArrCopyOfRange, bArrU);
                int length2 = bArrU.length;
                vVar.getClass();
                return;
            } catch (GeneralSecurityException e4) {
                r.f5192a.info("tag prefix matches a key, but cannot verify: " + e4);
            }
        }
        Iterator it = b0Var.b(v6.b.f15905a).iterator();
        while (it.hasNext()) {
            try {
                ((v6.m) ((v6.n) it.next()).f15923b).a(bArr, bArr2);
                int length3 = bArr2.length;
                vVar.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        vVar.getClass();
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // v6.m
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        v vVar = this.f5190b;
        b0 b0Var = this.f5189a;
        if (((v6.n) b0Var.f8250c).f15926e.equals(t1.LEGACY)) {
            bArr = z6.a.u(bArr, r.f5193b);
        }
        try {
            byte[][] bArr2 = new byte[2][];
            byte[] bArr3 = ((v6.n) b0Var.f8250c).f15924c;
            bArr2[0] = bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length);
            bArr2[1] = ((v6.m) ((v6.n) b0Var.f8250c).f15923b).b(bArr);
            byte[] bArrU = z6.a.u(bArr2);
            int i10 = ((v6.n) b0Var.f8250c).f15927f;
            int length = bArr.length;
            vVar.getClass();
            return bArrU;
        } catch (GeneralSecurityException e4) {
            vVar.getClass();
            throw e4;
        }
    }
}
