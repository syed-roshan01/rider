package u1;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m2.b f15121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15122b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Outline f15123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e1.l0 f15125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e1.i f15126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e1.d0 f15127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e1.d0 f15130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d1.e f15131k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f15132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f15133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f15134n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15135o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m2.l f15136p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e1.g0 f15137q;

    public j2(m2.b bVar) {
        this.f15121a = bVar;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f15123c = outline;
        long j10 = d1.f.f4344b;
        this.f15124d = j10;
        this.f15125e = e1.g0.f5008a;
        this.f15133m = d1.c.f4326b;
        this.f15134n = j10;
        this.f15136p = m2.l.f11815a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    public final void a(e1.p pVar) {
        e();
        e1.d0 d0Var = this.f15127g;
        if (d0Var != null) {
            pVar.t(d0Var, 1);
            return;
        }
        float f10 = this.f15132l;
        if (f10 <= 0.0f) {
            pVar.d(d1.c.d(this.f15133m), d1.c.e(this.f15133m), d1.c.d(this.f15133m) + d1.f.d(this.f15134n), d1.c.e(this.f15133m) + d1.f.b(this.f15134n), 1);
            return;
        }
        e1.d0 d0VarG = this.f15130j;
        d1.e eVar = this.f15131k;
        if (d0VarG != null) {
            long j10 = this.f15133m;
            long j11 = this.f15134n;
            if (eVar == null || !f6.a.Z(eVar)) {
                float fD = d1.c.d(this.f15133m);
                float fE = d1.c.e(this.f15133m);
                float fD2 = d1.f.d(this.f15134n) + d1.c.d(this.f15133m);
                float fB = d1.f.b(this.f15134n) + d1.c.e(this.f15133m);
                float f11 = this.f15132l;
                long jD = f6.a.d(f11, f11);
                long jD2 = f6.a.d(d1.a.b(jD), d1.a.c(jD));
                d1.e eVar2 = new d1.e(fD, fE, fD2, fB, jD2, jD2, jD2, jD2);
                if (d0VarG == null) {
                    d0VarG = androidx.compose.ui.graphics.a.g();
                } else {
                    ((e1.i) d0VarG).f5014a.reset();
                }
                ((e1.i) d0VarG).a(eVar2);
                this.f15131k = eVar2;
                this.f15130j = d0VarG;
            } else {
                if (eVar.f4336a == d1.c.d(j10)) {
                    if (eVar.f4337b == d1.c.e(j10)) {
                        if (eVar.f4338c == d1.f.d(j11) + d1.c.d(j10)) {
                            if (eVar.f4339d != d1.f.b(j11) + d1.c.e(j10) || d1.a.b(eVar.f4340e) != f10) {
                                float fD3 = d1.c.d(this.f15133m);
                                float fE2 = d1.c.e(this.f15133m);
                                float fD4 = d1.f.d(this.f15134n) + d1.c.d(this.f15133m);
                                float fB2 = d1.f.b(this.f15134n) + d1.c.e(this.f15133m);
                                float f12 = this.f15132l;
                                long jD3 = f6.a.d(f12, f12);
                                long jD4 = f6.a.d(d1.a.b(jD3), d1.a.c(jD3));
                                d1.e eVar3 = new d1.e(fD3, fE2, fD4, fB2, jD4, jD4, jD4, jD4);
                                if (d0VarG == null) {
                                    d0VarG = androidx.compose.ui.graphics.a.g();
                                } else {
                                    ((e1.i) d0VarG).f5014a.reset();
                                }
                                ((e1.i) d0VarG).a(eVar3);
                                this.f15131k = eVar3;
                                this.f15130j = d0VarG;
                            }
                        } else {
                            float fD5 = d1.c.d(this.f15133m);
                            float fE3 = d1.c.e(this.f15133m);
                            float fD6 = d1.f.d(this.f15134n) + d1.c.d(this.f15133m);
                            float fB3 = d1.f.b(this.f15134n) + d1.c.e(this.f15133m);
                            float f13 = this.f15132l;
                            long jD5 = f6.a.d(f13, f13);
                            long jD6 = f6.a.d(d1.a.b(jD5), d1.a.c(jD5));
                            d1.e eVar4 = new d1.e(fD5, fE3, fD6, fB3, jD6, jD6, jD6, jD6);
                            if (d0VarG == null) {
                                d0VarG = androidx.compose.ui.graphics.a.g();
                            } else {
                                ((e1.i) d0VarG).f5014a.reset();
                            }
                            ((e1.i) d0VarG).a(eVar4);
                            this.f15131k = eVar4;
                            this.f15130j = d0VarG;
                        }
                    } else {
                        float fD7 = d1.c.d(this.f15133m);
                        float fE4 = d1.c.e(this.f15133m);
                        float fD8 = d1.f.d(this.f15134n) + d1.c.d(this.f15133m);
                        float fB4 = d1.f.b(this.f15134n) + d1.c.e(this.f15133m);
                        float f14 = this.f15132l;
                        long jD7 = f6.a.d(f14, f14);
                        long jD8 = f6.a.d(d1.a.b(jD7), d1.a.c(jD7));
                        d1.e eVar5 = new d1.e(fD7, fE4, fD8, fB4, jD8, jD8, jD8, jD8);
                        if (d0VarG == null) {
                            d0VarG = androidx.compose.ui.graphics.a.g();
                        } else {
                            ((e1.i) d0VarG).f5014a.reset();
                        }
                        ((e1.i) d0VarG).a(eVar5);
                        this.f15131k = eVar5;
                        this.f15130j = d0VarG;
                    }
                } else {
                    float fD9 = d1.c.d(this.f15133m);
                    float fE5 = d1.c.e(this.f15133m);
                    float fD10 = d1.f.d(this.f15134n) + d1.c.d(this.f15133m);
                    float fB5 = d1.f.b(this.f15134n) + d1.c.e(this.f15133m);
                    float f15 = this.f15132l;
                    long jD9 = f6.a.d(f15, f15);
                    long jD10 = f6.a.d(d1.a.b(jD9), d1.a.c(jD9));
                    d1.e eVar6 = new d1.e(fD9, fE5, fD10, fB5, jD10, jD10, jD10, jD10);
                    if (d0VarG == null) {
                        d0VarG = androidx.compose.ui.graphics.a.g();
                    } else {
                        ((e1.i) d0VarG).f5014a.reset();
                    }
                    ((e1.i) d0VarG).a(eVar6);
                    this.f15131k = eVar6;
                    this.f15130j = d0VarG;
                }
            }
        } else {
            float fD11 = d1.c.d(this.f15133m);
            float fE6 = d1.c.e(this.f15133m);
            float fD12 = d1.f.d(this.f15134n) + d1.c.d(this.f15133m);
            float fB6 = d1.f.b(this.f15134n) + d1.c.e(this.f15133m);
            float f16 = this.f15132l;
            long jD11 = f6.a.d(f16, f16);
            long jD12 = f6.a.d(d1.a.b(jD11), d1.a.c(jD11));
            d1.e eVar7 = new d1.e(fD11, fE6, fD12, fB6, jD12, jD12, jD12, jD12);
            if (d0VarG == null) {
                d0VarG = androidx.compose.ui.graphics.a.g();
            } else {
                ((e1.i) d0VarG).f5014a.reset();
            }
            ((e1.i) d0VarG).a(eVar7);
            this.f15131k = eVar7;
            this.f15130j = d0VarG;
        }
        pVar.t(d0VarG, 1);
    }

    public final Outline b() {
        e();
        if (this.f15135o && this.f15122b) {
            return this.f15123c;
        }
        return null;
    }

    public final boolean c(long j10) {
        e1.g0 g0Var;
        float f10;
        boolean zU;
        if (!this.f15135o || (g0Var = this.f15137q) == null) {
            return true;
        }
        float fD = d1.c.d(j10);
        float fE = d1.c.e(j10);
        boolean z10 = false;
        if (g0Var instanceof e1.b0) {
            d1.d dVar = ((e1.b0) g0Var).f4990e;
            if (dVar.f4332a <= fD && fD < dVar.f4334c && dVar.f4333b <= fE && fE < dVar.f4335d) {
                return true;
            }
        } else {
            if (!(g0Var instanceof e1.c0)) {
                throw new androidx.fragment.app.a0();
            }
            d1.e eVar = ((e1.c0) g0Var).f4992e;
            if (fD >= eVar.f4336a) {
                float f11 = eVar.f4338c;
                if (fD < f11) {
                    float f12 = eVar.f4337b;
                    if (fE >= f12) {
                        float f13 = eVar.f4339d;
                        if (fE < f13) {
                            long j11 = eVar.f4340e;
                            float fB = d1.a.b(j11);
                            long j12 = eVar.f4341f;
                            if (d1.a.b(j12) + fB <= eVar.b()) {
                                long j13 = eVar.f4343h;
                                float fB2 = d1.a.b(j13);
                                f10 = fD;
                                long j14 = eVar.f4342g;
                                if (d1.a.b(j14) + fB2 <= eVar.b()) {
                                    if (d1.a.c(j13) + d1.a.c(j11) <= eVar.a()) {
                                        if (d1.a.c(j14) + d1.a.c(j12) <= eVar.a()) {
                                            float fB3 = d1.a.b(j11);
                                            float f14 = eVar.f4336a;
                                            float f15 = fB3 + f14;
                                            float fC = d1.a.c(j11) + f12;
                                            float fB4 = f11 - d1.a.b(j12);
                                            float fC2 = f12 + d1.a.c(j12);
                                            float fB5 = f11 - d1.a.b(j14);
                                            float fC3 = f13 - d1.a.c(j14);
                                            float fC4 = f13 - d1.a.c(j13);
                                            float fB6 = f14 + d1.a.b(j13);
                                            if (f10 < f15 && fE < fC) {
                                                zU = i1.b.u(f10, fE, f15, fC, eVar.f4340e);
                                            } else if (f10 < fB6 && fE > fC4) {
                                                zU = i1.b.u(f10, fE, fB6, fC4, eVar.f4343h);
                                            } else if (f10 <= fB4 || fE >= fC2) {
                                                zU = (f10 <= fB5 || fE <= fC3) ? true : i1.b.u(f10, fE, fB5, fC3, eVar.f4342g);
                                            } else {
                                                zU = i1.b.u(f10, fE, fB4, fC2, eVar.f4341f);
                                            }
                                            z10 = zU;
                                        }
                                    }
                                }
                            } else {
                                f10 = fD;
                            }
                            e1.i iVarG = androidx.compose.ui.graphics.a.g();
                            iVarG.a(eVar);
                            float f16 = f10 - 0.005f;
                            float f17 = fE - 0.005f;
                            float f18 = f10 + 0.005f;
                            float f19 = fE + 0.005f;
                            e1.i iVarG2 = androidx.compose.ui.graphics.a.g();
                            if (!(!Float.isNaN(f16))) {
                                throw new IllegalStateException("Rect.left is NaN".toString());
                            }
                            if (!(!Float.isNaN(f17))) {
                                throw new IllegalStateException("Rect.top is NaN".toString());
                            }
                            if (!(!Float.isNaN(f18))) {
                                throw new IllegalStateException("Rect.right is NaN".toString());
                            }
                            if (!(!Float.isNaN(f19))) {
                                throw new IllegalStateException("Rect.bottom is NaN".toString());
                            }
                            if (iVarG2.f5015b == null) {
                                iVarG2.f5015b = new RectF();
                            }
                            RectF rectF = iVarG2.f5015b;
                            d7.a.j(rectF);
                            rectF.set(f16, f17, f18, f19);
                            RectF rectF2 = iVarG2.f5015b;
                            d7.a.j(rectF2);
                            Path.Direction direction = Path.Direction.CCW;
                            Path path = iVarG2.f5014a;
                            path.addRect(rectF2, direction);
                            e1.i iVarG3 = androidx.compose.ui.graphics.a.g();
                            iVarG3.b(iVarG, iVarG2, 1);
                            Path path2 = iVarG3.f5014a;
                            boolean zIsEmpty = path2.isEmpty();
                            path2.reset();
                            path.reset();
                            z10 = !zIsEmpty;
                        }
                    }
                }
            }
        }
        return z10;
    }

    public final boolean d(e1.l0 l0Var, float f10, boolean z10, float f11, m2.l lVar, m2.b bVar) {
        this.f15123c.setAlpha(f10);
        boolean z11 = !d7.a.d(this.f15125e, l0Var);
        if (z11) {
            this.f15125e = l0Var;
            this.f15128h = true;
        }
        boolean z12 = z10 || f11 > 0.0f;
        if (this.f15135o != z12) {
            this.f15135o = z12;
            this.f15128h = true;
        }
        if (this.f15136p != lVar) {
            this.f15136p = lVar;
            this.f15128h = true;
        }
        if (!d7.a.d(this.f15121a, bVar)) {
            this.f15121a = bVar;
            this.f15128h = true;
        }
        return z11;
    }

    public final void e() {
        if (this.f15128h) {
            this.f15133m = d1.c.f4326b;
            long j10 = this.f15124d;
            this.f15134n = j10;
            this.f15132l = 0.0f;
            this.f15127g = null;
            this.f15128h = false;
            this.f15129i = false;
            boolean z10 = this.f15135o;
            Outline outline = this.f15123c;
            if (!z10 || d1.f.d(j10) <= 0.0f || d1.f.b(this.f15124d) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f15122b = true;
            e1.g0 g0VarD = this.f15125e.d(this.f15124d, this.f15136p, this.f15121a);
            this.f15137q = g0VarD;
            if (g0VarD instanceof e1.b0) {
                d1.d dVar = ((e1.b0) g0VarD).f4990e;
                float f10 = dVar.f4332a;
                float f11 = dVar.f4333b;
                this.f15133m = d9.i.f(f10, f11);
                this.f15134n = d7.t.j(dVar.c(), dVar.b());
                outline.setRect(d7.t.p0(dVar.f4332a), d7.t.p0(f11), d7.t.p0(dVar.f4334c), d7.t.p0(dVar.f4335d));
                return;
            }
            if (g0VarD instanceof e1.c0) {
                d1.e eVar = ((e1.c0) g0VarD).f4992e;
                float fB = d1.a.b(eVar.f4340e);
                float f12 = eVar.f4336a;
                float f13 = eVar.f4337b;
                this.f15133m = d9.i.f(f12, f13);
                this.f15134n = d7.t.j(eVar.b(), eVar.a());
                if (f6.a.Z(eVar)) {
                    this.f15123c.setRoundRect(d7.t.p0(f12), d7.t.p0(f13), d7.t.p0(eVar.f4338c), d7.t.p0(eVar.f4339d), fB);
                    this.f15132l = fB;
                    return;
                }
                e1.i iVarG = this.f15126f;
                if (iVarG == null) {
                    iVarG = androidx.compose.ui.graphics.a.g();
                    this.f15126f = iVarG;
                }
                Path path = iVarG.f5014a;
                path.reset();
                iVarG.a(eVar);
                if (Build.VERSION.SDK_INT > 28 || path.isConvex()) {
                    outline.setConvexPath(path);
                    this.f15129i = true ^ outline.canClip();
                } else {
                    this.f15122b = false;
                    outline.setEmpty();
                    this.f15129i = true;
                }
                this.f15127g = iVarG;
            }
        }
    }
}
