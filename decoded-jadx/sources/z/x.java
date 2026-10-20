package z;

import java.util.List;
import r1.w0;
import r1.x0;

/* JADX INFO: loaded from: classes.dex */
public final class x implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0.b f17164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0.c f17165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m2.l f17166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f17169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f17170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f17171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f17172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f17174n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f17175o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f17176p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17177q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17178r = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f17179s;

    public x(int i10, List list, boolean z10, y0.b bVar, y0.c cVar, m2.l lVar, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, j jVar) {
        this.f17161a = i10;
        this.f17162b = list;
        this.f17163c = z10;
        this.f17164d = bVar;
        this.f17165e = cVar;
        this.f17166f = lVar;
        this.f17167g = z11;
        this.f17168h = i13;
        this.f17169i = j10;
        this.f17170j = obj;
        this.f17171k = obj2;
        this.f17172l = jVar;
        int size = list.size();
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            x0 x0Var = (x0) list.get(i15);
            boolean z12 = this.f17163c;
            i14 += z12 ? x0Var.f13424b : x0Var.f13423a;
            iMax = Math.max(iMax, !z12 ? x0Var.f13424b : x0Var.f13423a);
        }
        this.f17174n = i14;
        int i16 = i14 + this.f17168h;
        this.f17175o = i16 >= 0 ? i16 : 0;
        this.f17176p = iMax;
        this.f17179s = new int[this.f17162b.size() * 2];
    }

    public final long a(int i10) {
        int i11 = i10 * 2;
        int[] iArr = this.f17179s;
        return i1.b.c(iArr[i11], iArr[i11 + 1]);
    }

    public final void b(w0 w0Var) {
        if (this.f17178r == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        List list = this.f17162b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            x0 x0Var = (x0) list.get(i10);
            boolean z10 = this.f17163c;
            if (z10) {
                int i11 = x0Var.f13424b;
            } else {
                int i12 = x0Var.f13423a;
            }
            long jA = a(i10);
            a0.g gVar = a0.h.f808a;
            if (this.f17167g) {
                int i13 = m2.i.f11808c;
                jA = i1.b.c(z10 ? (int) (jA >> 32) : (this.f17178r - ((int) (jA >> 32))) - (z10 ? x0Var.f13424b : x0Var.f13423a), z10 ? (this.f17178r - ((int) (jA & 4294967295L))) - (z10 ? x0Var.f13424b : x0Var.f13423a) : (int) (jA & 4294967295L));
            }
            int i14 = m2.i.f11808c;
            long j10 = this.f17169i;
            long jC = i1.b.c(((int) (jA >> 32)) + ((int) (j10 >> 32)), ((int) (jA & 4294967295L)) + ((int) (4294967295L & j10)));
            if (z10) {
                w0.m(w0Var, x0Var, jC, gVar, 2);
            } else {
                w0.i(w0Var, x0Var, jC, gVar, 2);
            }
        }
    }

    public final void c(int i10, int i11, int i12) {
        int i13;
        this.f17173m = i10;
        boolean z10 = this.f17163c;
        this.f17178r = z10 ? i12 : i11;
        List list = this.f17162b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            x0 x0Var = (x0) list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f17179s;
            if (z10) {
                y0.b bVar = this.f17164d;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true".toString());
                }
                iArr[i15] = ((y0.e) bVar).a(x0Var.f13423a, i11, this.f17166f);
                iArr[i15 + 1] = i10;
                i13 = x0Var.f13424b;
            } else {
                iArr[i15] = i10;
                int i16 = i15 + 1;
                y0.c cVar = this.f17165e;
                if (cVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false".toString());
                }
                iArr[i16] = ((y0.f) cVar).a(x0Var.f13424b, i12);
                i13 = x0Var.f13423a;
            }
            i10 += i13;
        }
    }
}
