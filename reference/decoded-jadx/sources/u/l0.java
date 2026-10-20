package u;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends u1.x1 implements b1.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f14842c;

    public l0(j jVar) {
        this.f14842c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        return d7.a.d(this.f14842c, ((l0) obj).f14842c);
    }

    public final int hashCode() {
        return this.f14842c.hashCode();
    }

    @Override // b1.f
    public final void i(g1.e eVar) {
        boolean zG;
        t1.i0 i0Var = (t1.i0) eVar;
        i0Var.a();
        j jVar = this.f14842c;
        if (d1.f.e(jVar.f14819p)) {
            return;
        }
        e1.p pVarA = i0Var.f14447a.f6497b.a();
        jVar.f14815l = jVar.f14816m.d();
        Canvas canvasA = e1.e.a(pVarA);
        EdgeEffect edgeEffect = jVar.f14813j;
        if (f6.a.L(edgeEffect) != 0.0f) {
            jVar.h(i0Var, edgeEffect, canvasA);
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = jVar.f14808e;
        if (edgeEffect2.isFinished()) {
            zG = false;
        } else {
            zG = jVar.g(i0Var, edgeEffect2, canvasA);
            f6.a.e0(edgeEffect, f6.a.L(edgeEffect2));
        }
        EdgeEffect edgeEffect3 = jVar.f14811h;
        if (f6.a.L(edgeEffect3) != 0.0f) {
            jVar.f(i0Var, edgeEffect3, canvasA);
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = jVar.f14806c;
        boolean zIsFinished = edgeEffect4.isFinished();
        z1 z1Var = jVar.f14804a;
        if (!zIsFinished) {
            int iSave = canvasA.save();
            canvasA.translate(0.0f, i0Var.v(z1Var.f15000b.d()));
            boolean zDraw = edgeEffect4.draw(canvasA);
            canvasA.restoreToCount(iSave);
            zG = zDraw || zG;
            f6.a.e0(edgeEffect3, f6.a.L(edgeEffect4));
        }
        EdgeEffect edgeEffect5 = jVar.f14814k;
        if (f6.a.L(edgeEffect5) != 0.0f) {
            jVar.g(i0Var, edgeEffect5, canvasA);
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = jVar.f14809f;
        if (!edgeEffect6.isFinished()) {
            zG = jVar.h(i0Var, edgeEffect6, canvasA) || zG;
            f6.a.e0(edgeEffect5, f6.a.L(edgeEffect6));
        }
        EdgeEffect edgeEffect7 = jVar.f14812i;
        if (f6.a.L(edgeEffect7) != 0.0f) {
            int iSave2 = canvasA.save();
            canvasA.translate(0.0f, i0Var.v(z1Var.f15000b.d()));
            edgeEffect7.draw(canvasA);
            canvasA.restoreToCount(iSave2);
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = jVar.f14807d;
        if (!edgeEffect8.isFinished()) {
            boolean z10 = jVar.f(i0Var, edgeEffect8, canvasA) || zG;
            f6.a.e0(edgeEffect7, f6.a.L(edgeEffect8));
            zG = z10;
        }
        if (zG) {
            jVar.i();
        }
    }

    public final String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f14842c + ')';
    }
}
