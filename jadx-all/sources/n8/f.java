package n8;

import e8.j0;
import e8.x;
import e8.z0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g8.p f12257l = new g8.p(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f12258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0 f12259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e8.i f12260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z0 f12261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e8.i f12262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z0 f12263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x f12264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z6.a f12265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12266k;

    public f(e eVar) {
        d dVar = new d(this);
        this.f12258c = dVar;
        this.f12261f = dVar;
        this.f12263h = dVar;
        this.f12259d = eVar;
    }

    @Override // e8.z0
    public final void f() {
        this.f12263h.f();
        this.f12261f.f();
    }

    @Override // n8.a
    public final z0 g() {
        z0 z0Var = this.f12263h;
        return z0Var == this.f12258c ? this.f12261f : z0Var;
    }

    public final void h() {
        this.f12259d.r(this.f12264i, this.f12265j);
        this.f12261f.f();
        this.f12261f = this.f12263h;
        this.f12260e = this.f12262g;
        this.f12263h = this.f12258c;
        this.f12262g = null;
    }
}
