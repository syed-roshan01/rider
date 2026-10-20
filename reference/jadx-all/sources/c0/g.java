package c0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f f2854w;

    public g(f fVar) {
        this.f2854w = fVar;
    }

    @Override // y0.n
    public final void A0() {
        f fVar = this.f2854w;
        if (fVar instanceof f) {
            d7.a.k(fVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            fVar.f2853a.m(this);
        }
    }

    @Override // y0.n
    public final void z0() {
        f fVar = this.f2854w;
        if (fVar instanceof f) {
            d7.a.k(fVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            fVar.f2853a.m(this);
        }
        if (fVar instanceof f) {
            fVar.f2853a.c(this);
        }
        this.f2854w = fVar;
    }
}
