package com.google.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends n2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f4248d = Logger.getLogger(v.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f4249e = z2.f4288e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w4 f4250c;

    public static int T(int i10) {
        return k0(i10) + 1;
    }

    public static int U(int i10, n nVar) {
        int iK0 = k0(i10);
        int size = nVar.size();
        return m0(size) + size + iK0;
    }

    public static int V(int i10) {
        return k0(i10) + 8;
    }

    public static int W(int i10, int i11) {
        return c0(i11) + k0(i10);
    }

    public static int X(int i10) {
        return k0(i10) + 4;
    }

    public static int Y(int i10) {
        return k0(i10) + 8;
    }

    public static int Z(int i10) {
        return k0(i10) + 4;
    }

    public static int a0(int i10, t1 t1Var, i2 i2Var) {
        return ((c) t1Var).getSerializedSize(i2Var) + (k0(i10) * 2);
    }

    public static int b0(int i10, int i11) {
        return c0(i11) + k0(i10);
    }

    public static int c0(int i10) {
        if (i10 >= 0) {
            return m0(i10);
        }
        return 10;
    }

    public static int d0(int i10, long j10) {
        return o0(j10) + k0(i10);
    }

    public static int e0(int i10) {
        return k0(i10) + 4;
    }

    public static int f0(int i10) {
        return k0(i10) + 8;
    }

    public static int g0(int i10, int i11) {
        return m0((i11 >> 31) ^ (i11 << 1)) + k0(i10);
    }

    public static int h0(int i10, long j10) {
        return o0((j10 >> 63) ^ (j10 << 1)) + k0(i10);
    }

    public static int i0(int i10, String str) {
        return j0(str) + k0(i10);
    }

    public static int j0(String str) {
        int length;
        try {
            length = c3.c(str);
        } catch (b3 unused) {
            length = str.getBytes(y0.f4276a).length;
        }
        return m0(length) + length;
    }

    public static int k0(int i10) {
        return m0(i10 << 3);
    }

    public static int l0(int i10, int i11) {
        return m0(i11) + k0(i10);
    }

    public static int m0(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int n0(int i10, long j10) {
        return o0(j10) + k0(i10);
    }

    public static int o0(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public abstract void A0(int i10, int i11);

    public abstract void B0(int i10);

    public abstract void C0(int i10, t1 t1Var, i2 i2Var);

    public abstract void D0(t1 t1Var);

    public abstract void E0(int i10, String str);

    public abstract void F0(String str);

    public abstract void G0(int i10, int i11);

    public abstract void H0(int i10, int i11);

    public abstract void I0(int i10);

    public abstract void J0(int i10, long j10);

    public abstract void K0(long j10);

    public final void p0(String str, b3 b3Var) throws com.google.crypto.tink.shaded.protobuf.q {
        f4248d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) b3Var);
        byte[] bytes = str.getBytes(y0.f4276a);
        try {
            I0(bytes.length);
            S(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e4) {
            throw new com.google.crypto.tink.shaded.protobuf.q(e4);
        }
    }

    public abstract int q0();

    public abstract void r0(byte b10);

    public abstract void s0(int i10, boolean z10);

    public abstract void t0(byte[] bArr, int i10);

    public abstract void u0(int i10, n nVar);

    public abstract void v0(n nVar);

    public abstract void w0(int i10, int i11);

    public abstract void x0(int i10);

    public abstract void y0(int i10, long j10);

    public abstract void z0(long j10);
}
