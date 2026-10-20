package y1;

import t1.r1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends y0.n implements r1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16749u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f16750v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c9.c f16751w;

    public c(boolean z10, boolean z11, c9.c cVar) {
        this.f16749u = z10;
        this.f16750v = z11;
        this.f16751w = cVar;
    }

    @Override // t1.r1
    public final void Q(j jVar) {
        this.f16751w.invoke(jVar);
    }

    @Override // t1.r1
    public final boolean c0() {
        return this.f16750v;
    }

    @Override // t1.r1
    public final boolean d0() {
        return this.f16749u;
    }
}
