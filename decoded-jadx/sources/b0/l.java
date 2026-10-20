package b0;

import t.d1;

/* JADX INFO: loaded from: classes.dex */
public final class l implements v.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f2425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1 f2426c = t.e.r(0.0f, null, 7);

    public l(h0 h0Var) {
        this.f2425b = h0Var;
    }

    @Override // v.o
    public final float a(float f10, float f11, float f12) {
        if (f10 >= f12 || f10 < 0.0f) {
            return f10;
        }
        if ((f11 > f12 || f11 + f10 <= f12) && Math.abs(this.f2425b.f2397e.f2319c.d()) == 0.0f) {
            return 0.0f;
        }
        return f10;
    }

    @Override // v.o
    public final t.n b() {
        return this.f2426c;
    }
}
