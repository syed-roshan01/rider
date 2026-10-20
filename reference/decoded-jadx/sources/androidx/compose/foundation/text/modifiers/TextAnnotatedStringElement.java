package androidx.compose.foundation.text.modifiers;

import a2.c0;
import a2.e;
import c9.c;
import d7.a;
import f2.d;
import g0.h;
import h6.g;
import java.util.List;
import l.q;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class TextAnnotatedStringElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f1674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f1675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f1676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f1677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f1682j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f1683k = null;

    public TextAnnotatedStringElement(e eVar, c0 c0Var, d dVar, c cVar, int i10, boolean z10, int i11, int i12) {
        this.f1674b = eVar;
        this.f1675c = c0Var;
        this.f1676d = dVar;
        this.f1677e = cVar;
        this.f1678f = i10;
        this.f1679g = z10;
        this.f1680h = i11;
        this.f1681i = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        textAnnotatedStringElement.getClass();
        return a.d(null, null) && a.d(this.f1674b, textAnnotatedStringElement.f1674b) && a.d(this.f1675c, textAnnotatedStringElement.f1675c) && a.d(this.f1682j, textAnnotatedStringElement.f1682j) && a.d(this.f1676d, textAnnotatedStringElement.f1676d) && a.d(this.f1677e, textAnnotatedStringElement.f1677e) && g.T(this.f1678f, textAnnotatedStringElement.f1678f) && this.f1679g == textAnnotatedStringElement.f1679g && this.f1680h == textAnnotatedStringElement.f1680h && this.f1681i == textAnnotatedStringElement.f1681i && a.d(this.f1683k, textAnnotatedStringElement.f1683k) && a.d(null, null);
    }

    @Override // t1.u0
    public final int hashCode() {
        int iHashCode = (this.f1676d.hashCode() + ((this.f1675c.hashCode() + (this.f1674b.hashCode() * 31)) * 31)) * 31;
        c cVar = this.f1677e;
        int iC = (((q.c(this.f1679g, a7.a.u(this.f1678f, (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31, 31), 31) + this.f1680h) * 31) + this.f1681i) * 31;
        List list = this.f1682j;
        int iHashCode2 = (iC + (list != null ? list.hashCode() : 0)) * 31;
        c cVar2 = this.f1683k;
        return (iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 961;
    }

    @Override // t1.u0
    public final n l() {
        return new h(this.f1674b, this.f1675c, this.f1676d, this.f1677e, this.f1678f, this.f1679g, this.f1680h, this.f1681i, this.f1682j, this.f1683k);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // t1.u0
    public final void m(n nVar) {
        boolean z10;
        boolean z11;
        h hVar = (h) nVar;
        hVar.getClass();
        if (!a.d(null, null)) {
            z10 = true;
        } else {
            c0 c0Var = hVar.f6473v;
            c0 c0Var2 = this.f1675c;
            if (c0Var2 == c0Var) {
                c0Var2.getClass();
            } else if (!c0Var2.f911a.b(c0Var.f911a)) {
                z10 = true;
            }
            z10 = false;
        }
        e eVar = hVar.f6472u;
        e eVar2 = this.f1674b;
        if (a.d(eVar, eVar2)) {
            z11 = false;
        } else {
            hVar.f6472u = eVar2;
            hVar.H.setValue(null);
            z11 = true;
        }
        hVar.G0(z10, z11, hVar.L0(this.f1675c, this.f1682j, this.f1681i, this.f1680h, this.f1679g, this.f1676d, this.f1678f), hVar.K0(this.f1677e, this.f1683k));
    }
}
