package g0;

import a2.c0;
import d7.t;
import m2.l;
import o1.s;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static b f6422h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f6423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f6424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2.b f6425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f2.d f6426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f6427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f6428f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f6429g = Float.NaN;

    public b(l lVar, c0 c0Var, m2.b bVar, f2.d dVar) {
        this.f6423a = lVar;
        this.f6424b = c0Var;
        this.f6425c = bVar;
        this.f6426d = dVar;
        this.f6427e = s.g0(c0Var, lVar);
    }

    public final long a(int i10, long j10) {
        int iJ;
        float f10 = this.f6429g;
        float f11 = this.f6428f;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            float fB = i1.b.d(c.f6430a, this.f6427e, s.b(0, 0, 15), this.f6425c, this.f6426d, null, 1, 96).b();
            float fB2 = i1.b.d(c.f6431b, this.f6427e, s.b(0, 0, 15), this.f6425c, this.f6426d, null, 2, 96).b() - fB;
            this.f6429g = fB;
            this.f6428f = fB2;
            f11 = fB2;
            f10 = fB;
        }
        if (i10 != 1) {
            int iP0 = t.p0((f11 * (i10 - 1)) + f10);
            iJ = iP0 >= 0 ? iP0 : 0;
            int iH = m2.a.h(j10);
            if (iJ > iH) {
                iJ = iH;
            }
        } else {
            iJ = m2.a.j(j10);
        }
        return s.a(m2.a.k(j10), m2.a.i(j10), iJ, m2.a.h(j10));
    }
}
