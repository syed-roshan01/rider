package h8;

import e8.l1;
import e8.p1;
import g8.e6;
import g8.y5;
import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public final class l extends g8.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ja.g f7663r = new ja.g();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p1 f7664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f7665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y5 f7666l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f7667m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f7668n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w4 f7669o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e8.c f7670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7671q;

    public l(p1 p1Var, l1 l1Var, e eVar, n nVar, y5.o oVar, Object obj, int i10, int i11, String str, String str2, y5 y5Var, e6 e6Var, e8.h hVar, boolean z10) {
        super(new a4.q(), y5Var, e6Var, l1Var, hVar, z10 && p1Var.f5340h);
        this.f7669o = new w4(this, 20);
        this.f7671q = false;
        this.f7666l = y5Var;
        this.f7664j = p1Var;
        this.f7667m = str;
        this.f7665k = str2;
        this.f7670p = nVar.f7692u;
        String str3 = p1Var.f5334b;
        this.f7668n = new k(this, i10, y5Var, obj, eVar, oVar, nVar, i11);
    }

    @Override // g8.h0
    public final void m(String str) {
        y3.e.J(str, "authority");
        this.f7667m = str;
    }

    @Override // g8.h0
    public final e8.c p() {
        return this.f7670p;
    }

    @Override // g8.l
    public final k y() {
        return this.f7668n;
    }
}
