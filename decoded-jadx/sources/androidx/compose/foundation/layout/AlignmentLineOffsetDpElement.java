package androidx.compose.foundation.layout;

import l.q;
import m2.e;
import r1.o;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class AlignmentLineOffsetDpElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1.a f1637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1639d;

    public AlignmentLineOffsetDpElement(o oVar, float f10, float f11) {
        this.f1637b = oVar;
        this.f1638c = f10;
        this.f1639d = f11;
        if ((f10 < 0.0f && !e.a(f10, Float.NaN)) || (f11 < 0.0f && !e.a(f11, Float.NaN))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        return d7.a.d(this.f1637b, alignmentLineOffsetDpElement.f1637b) && e.a(this.f1638c, alignmentLineOffsetDpElement.f1638c) && e.a(this.f1639d, alignmentLineOffsetDpElement.f1639d);
    }

    @Override // t1.u0
    public final int hashCode() {
        return Float.hashCode(this.f1639d) + q.a(this.f1638c, this.f1637b.hashCode() * 31, 31);
    }

    @Override // t1.u0
    public final n l() {
        y.b bVar = new y.b();
        bVar.f16513u = this.f1637b;
        bVar.f16514v = this.f1638c;
        bVar.f16515w = this.f1639d;
        return bVar;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        y.b bVar = (y.b) nVar;
        bVar.f16513u = this.f1637b;
        bVar.f16514v = this.f1638c;
        bVar.f16515w = this.f1639d;
    }
}
