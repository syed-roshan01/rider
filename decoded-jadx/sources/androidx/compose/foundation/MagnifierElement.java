package androidx.compose.foundation;

import a0.j0;
import c9.c;
import l.q;
import m2.e;
import m2.g;
import t1.u0;
import u.d2;
import u.q1;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class MagnifierElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f1611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f1612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f1615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f1618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d2 f1619k;

    public MagnifierElement(j0 j0Var, c cVar, c cVar2, float f10, boolean z10, long j10, float f11, float f12, boolean z11, d2 d2Var) {
        this.f1610b = j0Var;
        this.f1611c = cVar;
        this.f1612d = cVar2;
        this.f1613e = f10;
        this.f1614f = z10;
        this.f1615g = j10;
        this.f1616h = f11;
        this.f1617i = f12;
        this.f1618j = z11;
        this.f1619k = d2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        if (!d7.a.d(this.f1610b, magnifierElement.f1610b) || !d7.a.d(this.f1611c, magnifierElement.f1611c) || this.f1613e != magnifierElement.f1613e || this.f1614f != magnifierElement.f1614f) {
            return false;
        }
        int i10 = g.f11804d;
        return this.f1615g == magnifierElement.f1615g && e.a(this.f1616h, magnifierElement.f1616h) && e.a(this.f1617i, magnifierElement.f1617i) && this.f1618j == magnifierElement.f1618j && d7.a.d(this.f1612d, magnifierElement.f1612d) && d7.a.d(this.f1619k, magnifierElement.f1619k);
    }

    @Override // t1.u0
    public final int hashCode() {
        int iHashCode = this.f1610b.hashCode() * 31;
        c cVar = this.f1611c;
        int iC = q.c(this.f1614f, q.a(this.f1613e, (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31, 31), 31);
        int i10 = g.f11804d;
        int iC2 = q.c(this.f1618j, q.a(this.f1617i, q.a(this.f1616h, q.b(this.f1615g, iC, 31), 31), 31), 31);
        c cVar2 = this.f1612d;
        return this.f1619k.hashCode() + ((iC2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31);
    }

    @Override // t1.u0
    public final n l() {
        return new q1(this.f1610b, this.f1611c, this.f1612d, this.f1613e, this.f1614f, this.f1615g, this.f1616h, this.f1617i, this.f1618j, this.f1619k);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0063  */
    @Override // t1.u0
    public final void m(n nVar) {
        q1 q1Var = (q1) nVar;
        float f10 = q1Var.f14903x;
        long j10 = q1Var.f14905z;
        float f11 = q1Var.A;
        float f12 = q1Var.B;
        boolean z10 = q1Var.C;
        d2 d2Var = q1Var.D;
        q1Var.f14900u = this.f1610b;
        q1Var.f14901v = this.f1611c;
        float f13 = this.f1613e;
        q1Var.f14903x = f13;
        q1Var.f14904y = this.f1614f;
        long j11 = this.f1615g;
        q1Var.f14905z = j11;
        float f14 = this.f1616h;
        q1Var.A = f14;
        float f15 = this.f1617i;
        q1Var.B = f15;
        boolean z11 = this.f1618j;
        q1Var.C = z11;
        q1Var.f14902w = this.f1612d;
        d2 d2Var2 = this.f1619k;
        q1Var.D = d2Var2;
        if (q1Var.G == null || !(f13 == f10 || d2Var2.a())) {
            q1Var.G0();
        } else {
            int i10 = g.f11804d;
            if (j11 != j10 || !e.a(f14, f11) || !e.a(f15, f12) || z11 != z10 || !d7.a.d(d2Var2, d2Var)) {
                q1Var.G0();
            }
        }
        q1Var.H0();
    }
}
