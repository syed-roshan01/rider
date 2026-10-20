package androidx.compose.foundation.layout;

import l.q;
import m2.e;
import t1.u0;
import y.c1;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class SizeElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1658f;

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, int i10) {
        this((i10 & 1) != 0 ? Float.NaN : f10, (i10 & 2) != 0 ? Float.NaN : f11, (i10 & 4) != 0 ? Float.NaN : f12, (i10 & 8) != 0 ? Float.NaN : f13, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return e.a(this.f1654b, sizeElement.f1654b) && e.a(this.f1655c, sizeElement.f1655c) && e.a(this.f1656d, sizeElement.f1656d) && e.a(this.f1657e, sizeElement.f1657e) && this.f1658f == sizeElement.f1658f;
    }

    @Override // t1.u0
    public final int hashCode() {
        return Boolean.hashCode(this.f1658f) + q.a(this.f1657e, q.a(this.f1656d, q.a(this.f1655c, Float.hashCode(this.f1654b) * 31, 31), 31), 31);
    }

    @Override // t1.u0
    public final n l() {
        c1 c1Var = new c1();
        c1Var.f16523u = this.f1654b;
        c1Var.f16524v = this.f1655c;
        c1Var.f16525w = this.f1656d;
        c1Var.f16526x = this.f1657e;
        c1Var.f16527y = this.f1658f;
        return c1Var;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        c1 c1Var = (c1) nVar;
        c1Var.f16523u = this.f1654b;
        c1Var.f16524v = this.f1655c;
        c1Var.f16525w = this.f1656d;
        c1Var.f16526x = this.f1657e;
        c1Var.f16527y = this.f1658f;
    }

    public SizeElement(float f10, float f11, float f12, float f13, boolean z10) {
        this.f1654b = f10;
        this.f1655c = f11;
        this.f1656d = f12;
        this.f1657e = f13;
        this.f1658f = z10;
    }
}
