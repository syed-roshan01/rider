package androidx.compose.foundation;

import b1.c;
import e1.l0;
import e1.n;
import m2.e;
import t1.u0;
import u.v;

/* JADX INFO: loaded from: classes.dex */
public final class BorderModifierNodeElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f1601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0 f1602d;

    public BorderModifierNodeElement(float f10, n nVar, l0 l0Var) {
        this.f1600b = f10;
        this.f1601c = nVar;
        this.f1602d = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return e.a(this.f1600b, borderModifierNodeElement.f1600b) && d7.a.d(this.f1601c, borderModifierNodeElement.f1601c) && d7.a.d(this.f1602d, borderModifierNodeElement.f1602d);
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1602d.hashCode() + ((this.f1601c.hashCode() + (Float.hashCode(this.f1600b) * 31)) * 31);
    }

    @Override // t1.u0
    public final y0.n l() {
        return new v(this.f1600b, this.f1601c, this.f1602d);
    }

    @Override // t1.u0
    public final void m(y0.n nVar) {
        v vVar = (v) nVar;
        float f10 = vVar.f14961x;
        float f11 = this.f1600b;
        boolean zA = e.a(f10, f11);
        b1.b bVar = vVar.A;
        if (!zA) {
            vVar.f14961x = f11;
            ((c) bVar).G0();
        }
        n nVar2 = vVar.f14962y;
        n nVar3 = this.f1601c;
        if (!d7.a.d(nVar2, nVar3)) {
            vVar.f14962y = nVar3;
            ((c) bVar).G0();
        }
        l0 l0Var = vVar.f14963z;
        l0 l0Var2 = this.f1602d;
        if (d7.a.d(l0Var, l0Var2)) {
            return;
        }
        vVar.f14963z = l0Var2;
        ((c) bVar).G0();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) e.b(this.f1600b)) + ", brush=" + this.f1601c + ", shape=" + this.f1602d + ')';
    }
}
