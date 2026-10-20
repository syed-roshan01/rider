package t1;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 extends r1.x0 implements r1.l0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14531f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r1.g0 f14533o = new r1.g0(this, 0);

    public static void w0(c1 c1Var) {
        h0 h0Var;
        c1 c1Var2 = c1Var.f14396q;
        androidx.compose.ui.node.a aVar = c1Var2 != null ? c1Var2.f14395p : null;
        androidx.compose.ui.node.a aVar2 = c1Var.f14395p;
        if (!d7.a.d(aVar, aVar2)) {
            aVar2.D.f14508o.A.g();
            return;
        }
        b bVarY = aVar2.D.f14508o.y();
        if (bVarY == null || (h0Var = ((l0) bVarY).A) == null) {
            return;
        }
        h0Var.g();
    }

    @Override // r1.l0
    public final r1.k0 N(int i10, int i11, Map map, c9.c cVar) {
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new p0(i10, i11, map, cVar, this);
        }
        throw new IllegalStateException(("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    public abstract int j0(r1.a aVar);

    public abstract q0 m0();

    @Override // r1.m0
    public final int p(r1.a aVar) {
        int iJ0;
        if (!r0() || (iJ0 = j0(aVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        long j10 = this.f13427e;
        int i10 = m2.i.f11808c;
        return iJ0 + ((int) (j10 & 4294967295L));
    }

    @Override // r1.q
    public boolean q() {
        return false;
    }

    public abstract boolean r0();

    public abstract r1.k0 s0();

    public abstract long v0();

    public abstract void x0();
}
