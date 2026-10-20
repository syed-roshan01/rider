package g0;

import a2.a0;
import a2.c0;
import a2.z;
import java.util.List;
import m2.l;
import m9.e0;
import o1.s;
import r8.r;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a2.e f6432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0 f6433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f2.d f6434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f6439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f6440i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m2.b f6442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a2.k f6443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f6444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a0 f6445n;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f6441j = a.f6420a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6446o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6447p = -1;

    public d(a2.e eVar, c0 c0Var, f2.d dVar, int i10, boolean z10, int i11, int i12, List list) {
        this.f6432a = eVar;
        this.f6433b = c0Var;
        this.f6434c = dVar;
        this.f6435d = i10;
        this.f6436e = z10;
        this.f6437f = i11;
        this.f6438g = i12;
        this.f6439h = list;
    }

    public final int a(int i10, l lVar) {
        int i11 = this.f6446o;
        int i12 = this.f6447p;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int iN = d9.i.n(b(s.a(0, i10, 0, Integer.MAX_VALUE), lVar).f936e);
        this.f6446o = i10;
        this.f6447p = iN;
        return iN;
    }

    public final a2.i b(long j10, l lVar) {
        a2.k kVarD = d(lVar);
        long jW = e0.w(j10, this.f6436e, this.f6435d, kVarD.c());
        boolean z10 = this.f6436e;
        int i10 = this.f6435d;
        int i11 = this.f6437f;
        int i12 = 1;
        if (z10 || !h6.g.T(i10, 2)) {
            if (i11 < 1) {
                i11 = 1;
            }
            i12 = i11;
        }
        return new a2.i(kVarD, jW, i12, h6.g.T(this.f6435d, 2));
    }

    public final void c(m2.b bVar) {
        long jA;
        m2.b bVar2 = this.f6442k;
        if (bVar != null) {
            int i10 = a.f6421b;
            jA = a.a(bVar.c(), bVar.m());
        } else {
            jA = a.f6420a;
        }
        if (bVar2 == null) {
            this.f6442k = bVar;
            this.f6441j = jA;
        } else if (bVar == null || this.f6441j != jA) {
            this.f6442k = bVar;
            this.f6441j = jA;
            this.f6443l = null;
            this.f6445n = null;
            this.f6447p = -1;
            this.f6446o = -1;
        }
    }

    public final a2.k d(l lVar) {
        a2.k kVar = this.f6443l;
        if (kVar == null || lVar != this.f6444m || kVar.b()) {
            this.f6444m = lVar;
            a2.e eVar = this.f6432a;
            c0 c0VarG0 = s.g0(this.f6433b, lVar);
            m2.b bVar = this.f6442k;
            d7.a.j(bVar);
            f2.d dVar = this.f6434c;
            List list = this.f6439h;
            if (list == null) {
                list = r.f13661a;
            }
            kVar = new a2.k(eVar, c0VarG0, list, bVar, dVar);
        }
        this.f6443l = kVar;
        return kVar;
    }

    public final a0 e(l lVar, long j10, a2.i iVar) {
        float fMin = Math.min(iVar.f932a.c(), iVar.f935d);
        a2.e eVar = this.f6432a;
        c0 c0Var = this.f6433b;
        List list = this.f6439h;
        if (list == null) {
            list = r.f13661a;
        }
        int i10 = this.f6437f;
        boolean z10 = this.f6436e;
        int i11 = this.f6435d;
        m2.b bVar = this.f6442k;
        d7.a.j(bVar);
        return new a0(new z(eVar, c0Var, list, i10, z10, i11, bVar, lVar, this.f6434c, j10), iVar, s.o(j10, s.e(d9.i.n(fMin), d9.i.n(iVar.f936e))));
    }
}
