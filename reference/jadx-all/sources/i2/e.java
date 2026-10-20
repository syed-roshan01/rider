package i2;

import android.text.TextPaint;
import e1.j0;
import e1.k0;
import e1.n;
import e1.n0;
import e1.r;

/* JADX INFO: loaded from: classes.dex */
public final class e extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1.g f7927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l2.j f7928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k0 f7929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g1.h f7930d;

    public e(float f10) {
        super(1);
        ((TextPaint) this).density = f10;
        this.f7927a = new e1.g(this);
        this.f7928b = l2.j.f11211b;
        this.f7929c = k0.f5038d;
    }

    public final void a(n nVar, long j10, float f10) {
        boolean z10 = nVar instanceof n0;
        e1.g gVar = this.f7927a;
        if ((z10 && ((n0) nVar).f5052a != r.f5065g) || ((nVar instanceof j0) && j10 != d1.f.f4345c)) {
            nVar.a(Float.isNaN(f10) ? gVar.f5004a.getAlpha() / 255.0f : z6.a.q(f10, 0.0f, 1.0f), j10, gVar);
        } else if (nVar == null) {
            gVar.h(null);
        }
    }

    public final void b(g1.h hVar) {
        if (hVar == null || d7.a.d(this.f7930d, hVar)) {
            return;
        }
        this.f7930d = hVar;
        boolean zD = d7.a.d(hVar, g1.j.f6502a);
        e1.g gVar = this.f7927a;
        if (zD) {
            gVar.l(0);
            return;
        }
        if (hVar instanceof g1.k) {
            gVar.l(1);
            g1.k kVar = (g1.k) hVar;
            gVar.k(kVar.f6503a);
            gVar.f5004a.setStrokeMiter(kVar.f6504b);
            gVar.j(kVar.f6506d);
            gVar.i(kVar.f6505c);
            gVar.f5004a.setPathEffect(null);
        }
    }

    public final void c(k0 k0Var) {
        if (k0Var == null || d7.a.d(this.f7929c, k0Var)) {
            return;
        }
        this.f7929c = k0Var;
        if (d7.a.d(k0Var, k0.f5038d)) {
            clearShadowLayer();
            return;
        }
        k0 k0Var2 = this.f7929c;
        float f10 = k0Var2.f5041c;
        if (f10 == 0.0f) {
            f10 = Float.MIN_VALUE;
        }
        setShadowLayer(f10, d1.c.d(k0Var2.f5040b), d1.c.e(this.f7929c.f5040b), androidx.compose.ui.graphics.a.s(this.f7929c.f5039a));
    }

    public final void d(l2.j jVar) {
        if (jVar == null || d7.a.d(this.f7928b, jVar)) {
            return;
        }
        this.f7928b = jVar;
        int i10 = jVar.f11214a;
        setUnderlineText((i10 | 1) == i10);
        l2.j jVar2 = this.f7928b;
        jVar2.getClass();
        int i11 = jVar2.f11214a;
        setStrikeThruText((i11 | 2) == i11);
    }
}
