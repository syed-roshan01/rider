package androidx.compose.ui.draw;

import b1.j;
import d1.f;
import h1.c;
import l.q;
import r1.l;
import t1.g;
import t1.u0;
import y0.d;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class PainterElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f1697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f1698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1.l f1700g;

    public PainterElement(c cVar, boolean z10, d dVar, l lVar, float f10, e1.l lVar2) {
        this.f1695b = cVar;
        this.f1696c = z10;
        this.f1697d = dVar;
        this.f1698e = lVar;
        this.f1699f = f10;
        this.f1700g = lVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return d7.a.d(this.f1695b, painterElement.f1695b) && this.f1696c == painterElement.f1696c && d7.a.d(this.f1697d, painterElement.f1697d) && d7.a.d(this.f1698e, painterElement.f1698e) && Float.compare(this.f1699f, painterElement.f1699f) == 0 && d7.a.d(this.f1700g, painterElement.f1700g);
    }

    @Override // t1.u0
    public final int hashCode() {
        int iA = q.a(this.f1699f, (this.f1698e.hashCode() + ((this.f1697d.hashCode() + q.c(this.f1696c, this.f1695b.hashCode() * 31, 31)) * 31)) * 31, 31);
        e1.l lVar = this.f1700g;
        return iA + (lVar == null ? 0 : lVar.hashCode());
    }

    @Override // t1.u0
    public final n l() {
        j jVar = new j();
        jVar.f2521u = this.f1695b;
        jVar.f2522v = this.f1696c;
        jVar.f2523w = this.f1697d;
        jVar.f2524x = this.f1698e;
        jVar.f2525y = this.f1699f;
        jVar.f2526z = this.f1700g;
        return jVar;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        j jVar = (j) nVar;
        boolean z10 = jVar.f2522v;
        c cVar = this.f1695b;
        boolean z11 = this.f1696c;
        boolean z12 = z10 != z11 || (z11 && !f.a(jVar.f2521u.h(), cVar.h()));
        jVar.f2521u = cVar;
        jVar.f2522v = z11;
        jVar.f2523w = this.f1697d;
        jVar.f2524x = this.f1698e;
        jVar.f2525y = this.f1699f;
        jVar.f2526z = this.f1700g;
        if (z12) {
            g.t(jVar);
        }
        g.s(jVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f1695b + ", sizeToIntrinsics=" + this.f1696c + ", alignment=" + this.f1697d + ", contentScale=" + this.f1698e + ", alpha=" + this.f1699f + ", colorFilter=" + this.f1700g + ')';
    }
}
