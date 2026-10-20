package g0;

import a2.c0;
import a2.o;
import m2.l;
import m9.e0;
import o1.s;
import r8.r;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0 f6449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f2.d f6450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6454g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m2.b f6456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a2.a f6457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6458k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f6460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o f6461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f6462o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f6455h = a.f6420a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6459l = s.e(0, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f6463p = l2.l.d(0, 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6464q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6465r = -1;

    public e(String str, c0 c0Var, f2.d dVar, int i10, boolean z10, int i11, int i12) {
        this.f6448a = str;
        this.f6449b = c0Var;
        this.f6450c = dVar;
        this.f6451d = i10;
        this.f6452e = z10;
        this.f6453f = i11;
        this.f6454g = i12;
    }

    public final int a(int i10, l lVar) {
        int i11 = this.f6464q;
        int i12 = this.f6465r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int iN = d9.i.n(b(s.a(0, i10, 0, Integer.MAX_VALUE), lVar).b());
        this.f6464q = i10;
        this.f6465r = iN;
        return iN;
    }

    public final a2.a b(long j10, l lVar) {
        int i10;
        o oVarD = d(lVar);
        long jW = e0.w(j10, this.f6452e, this.f6451d, oVarD.c());
        boolean z10 = this.f6452e;
        int i11 = this.f6451d;
        int i12 = this.f6453f;
        if (z10 || !h6.g.T(i11, 2)) {
            if (i12 < 1) {
                i12 = 1;
            }
            i10 = i12;
        } else {
            i10 = 1;
        }
        return new a2.a((i2.d) oVarD, i10, h6.g.T(this.f6451d, 2), jW);
    }

    public final void c(m2.b bVar) {
        long jA;
        m2.b bVar2 = this.f6456i;
        if (bVar != null) {
            int i10 = a.f6421b;
            jA = a.a(bVar.c(), bVar.m());
        } else {
            jA = a.f6420a;
        }
        if (bVar2 == null) {
            this.f6456i = bVar;
            this.f6455h = jA;
            return;
        }
        if (bVar == null || this.f6455h != jA) {
            this.f6456i = bVar;
            this.f6455h = jA;
            this.f6457j = null;
            this.f6461n = null;
            this.f6462o = null;
            this.f6464q = -1;
            this.f6465r = -1;
            this.f6463p = l2.l.d(0, 0);
            this.f6459l = s.e(0, 0);
            this.f6458k = false;
        }
    }

    public final o d(l lVar) {
        o dVar = this.f6461n;
        if (dVar == null || lVar != this.f6462o || dVar.b()) {
            this.f6462o = lVar;
            String str = this.f6448a;
            c0 c0VarG0 = s.g0(this.f6449b, lVar);
            m2.b bVar = this.f6456i;
            d7.a.j(bVar);
            f2.d dVar2 = this.f6450c;
            r rVar = r.f13661a;
            dVar = new i2.d(c0VarG0, dVar2, bVar, str, rVar, rVar);
        }
        this.f6461n = dVar;
        return dVar;
    }
}
