package b0;

import java.util.List;
import r1.x0;
import v.h1;

/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0.b f2380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0.c f2381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m2.l f2382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f2386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2388n;

    public g(int i10, int i11, List list, long j10, Object obj, h1 h1Var, y0.b bVar, y0.c cVar, m2.l lVar, boolean z10) {
        this.f2375a = i10;
        this.f2376b = i11;
        this.f2377c = list;
        this.f2378d = j10;
        this.f2379e = obj;
        this.f2380f = bVar;
        this.f2381g = cVar;
        this.f2382h = lVar;
        this.f2383i = z10;
        this.f2384j = h1Var == h1.f15593a;
        int size = list.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            x0 x0Var = (x0) list.get(i12);
            iMax = Math.max(iMax, !this.f2384j ? x0Var.f13424b : x0Var.f13423a);
        }
        this.f2385k = iMax;
        this.f2386l = new int[this.f2377c.size() * 2];
        this.f2388n = Integer.MIN_VALUE;
    }

    public final void a(int i10, int i11, int i12) {
        int i13;
        this.f2387m = i10;
        boolean z10 = this.f2384j;
        this.f2388n = z10 ? i12 : i11;
        List list = this.f2377c;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            x0 x0Var = (x0) list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f2386l;
            if (z10) {
                y0.b bVar = this.f2380f;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment".toString());
                }
                iArr[i15] = ((y0.e) bVar).a(x0Var.f13423a, i11, this.f2382h);
                iArr[i15 + 1] = i10;
                i13 = x0Var.f13424b;
            } else {
                iArr[i15] = i10;
                int i16 = i15 + 1;
                y0.c cVar = this.f2381g;
                if (cVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment".toString());
                }
                iArr[i16] = ((y0.f) cVar).a(x0Var.f13424b, i12);
                i13 = x0Var.f13423a;
            }
            i10 += i13;
        }
    }
}
