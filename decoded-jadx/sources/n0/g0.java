package n0;

import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12068b;

    public g0(int i10, int i11) {
        this.f12067a = i10;
        this.f12068b = i11;
    }

    public abstract void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar);

    public String b(int i10) {
        return "IntParameter(" + i10 + ')';
    }

    public String c(int i10) {
        return "ObjectParameter(" + i10 + ')';
    }

    public final String toString() {
        String strB = d9.v.a(getClass()).b();
        return strB == null ? "" : strB;
    }

    public /* synthetic */ g0(int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
