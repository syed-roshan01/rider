package androidx.compose.ui.input.pointer;

import d7.a;
import d9.u;
import f0.y0;
import o1.o;
import o1.q;
import t1.g;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f1725b = y0.f6008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1726c;

    public PointerHoverIconModifierElement(boolean z10) {
        this.f1726c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return a.d(this.f1725b, pointerHoverIconModifierElement.f1725b) && this.f1726c == pointerHoverIconModifierElement.f1726c;
    }

    @Override // t1.u0
    public final int hashCode() {
        return Boolean.hashCode(this.f1726c) + (((o1.a) this.f1725b).f12345b * 31);
    }

    @Override // t1.u0
    public final n l() {
        return new o(this.f1725b, this.f1726c);
    }

    @Override // t1.u0
    public final void m(n nVar) {
        o oVar = (o) nVar;
        q qVar = oVar.f12406u;
        q qVar2 = this.f1725b;
        if (!a.d(qVar, qVar2)) {
            oVar.f12406u = qVar2;
            if (oVar.f12408w) {
                oVar.I0();
            }
        }
        boolean z10 = oVar.f12407v;
        boolean z11 = this.f1726c;
        if (z10 != z11) {
            oVar.f12407v = z11;
            if (z11) {
                if (oVar.f12408w) {
                    oVar.G0();
                    return;
                }
                return;
            }
            boolean z12 = oVar.f12408w;
            if (z12 && z12) {
                if (!z11) {
                    u uVar = new u();
                    g.D(oVar, new o1.n(1, uVar));
                    o oVar2 = (o) uVar.f4952a;
                    if (oVar2 != null) {
                        oVar = oVar2;
                    }
                }
                oVar.G0();
            }
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f1725b + ", overrideDescendants=" + this.f1726c + ')';
    }
}
