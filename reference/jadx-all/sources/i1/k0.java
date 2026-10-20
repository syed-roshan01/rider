package i1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1.n f7857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e1.n f7859f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f7860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f7861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f7862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f7863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f7864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f7865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f7866t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f7867u;

    public k0(String str, List list, int i10, e1.n nVar, float f10, e1.n nVar2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        this.f7854a = str;
        this.f7855b = list;
        this.f7856c = i10;
        this.f7857d = nVar;
        this.f7858e = f10;
        this.f7859f = nVar2;
        this.f7860n = f11;
        this.f7861o = f12;
        this.f7862p = i11;
        this.f7863q = i12;
        this.f7864r = f13;
        this.f7865s = f14;
        this.f7866t = f15;
        this.f7867u = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            return d7.a.d(this.f7854a, k0Var.f7854a) && d7.a.d(this.f7857d, k0Var.f7857d) && this.f7858e == k0Var.f7858e && d7.a.d(this.f7859f, k0Var.f7859f) && this.f7860n == k0Var.f7860n && this.f7861o == k0Var.f7861o && e1.g0.f(this.f7862p, k0Var.f7862p) && e1.g0.g(this.f7863q, k0Var.f7863q) && this.f7864r == k0Var.f7864r && this.f7865s == k0Var.f7865s && this.f7866t == k0Var.f7866t && this.f7867u == k0Var.f7867u && this.f7856c == k0Var.f7856c && d7.a.d(this.f7855b, k0Var.f7855b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f7855b.hashCode() + (this.f7854a.hashCode() * 31)) * 31;
        e1.n nVar = this.f7857d;
        int iA = l.q.a(this.f7858e, (iHashCode + (nVar != null ? nVar.hashCode() : 0)) * 31, 31);
        e1.n nVar2 = this.f7859f;
        return Integer.hashCode(this.f7856c) + l.q.a(this.f7867u, l.q.a(this.f7866t, l.q.a(this.f7865s, l.q.a(this.f7864r, a7.a.u(this.f7863q, a7.a.u(this.f7862p, l.q.a(this.f7861o, l.q.a(this.f7860n, (iA + (nVar2 != null ? nVar2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
