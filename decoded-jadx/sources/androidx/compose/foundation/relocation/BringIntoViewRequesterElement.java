package androidx.compose.foundation.relocation;

import c0.f;
import c0.g;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class BringIntoViewRequesterElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f1673b;

    public BringIntoViewRequesterElement(f fVar) {
        this.f1673b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewRequesterElement) {
                if (d7.a.d(this.f1673b, ((BringIntoViewRequesterElement) obj).f1673b)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1673b.hashCode();
    }

    @Override // t1.u0
    public final n l() {
        return new g(this.f1673b);
    }

    @Override // t1.u0
    public final void m(n nVar) {
        g gVar = (g) nVar;
        f fVar = gVar.f2854w;
        if (fVar instanceof f) {
            d7.a.k(fVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            fVar.f2853a.m(gVar);
        }
        f fVar2 = this.f1673b;
        if (fVar2 instanceof f) {
            fVar2.f2853a.c(gVar);
        }
        gVar.f2854w = fVar2;
    }
}
