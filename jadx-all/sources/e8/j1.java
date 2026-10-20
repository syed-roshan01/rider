package e8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends i1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f5289e;

    public j1(String str, boolean z10, k1 k1Var) {
        super(str, z10, k1Var);
        if (!(!str.endsWith("-bin"))) {
            throw new IllegalArgumentException(f6.a.c0("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        this.f5289e = k1Var;
    }

    @Override // e8.i1
    public final Object a(byte[] bArr) {
        return this.f5289e.b(bArr);
    }

    @Override // e8.i1
    public final byte[] b(Serializable serializable) {
        byte[] bArrA = this.f5289e.a(serializable);
        y3.e.J(bArrA, "null marshaller.toAsciiString()");
        return bArrA;
    }
}
