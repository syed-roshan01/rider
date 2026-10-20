package t1;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements r1.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f14525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c9.c f14526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q0 f14527e;

    public p0(int i10, int i11, Map map, c9.c cVar, q0 q0Var) {
        this.f14523a = i10;
        this.f14524b = i11;
        this.f14525c = map;
        this.f14526d = cVar;
        this.f14527e = q0Var;
    }

    @Override // r1.k0
    public final int a() {
        return this.f14524b;
    }

    @Override // r1.k0
    public final int b() {
        return this.f14523a;
    }

    @Override // r1.k0
    public final Map d() {
        return this.f14525c;
    }

    @Override // r1.k0
    public final void e() {
        this.f14526d.invoke(this.f14527e.f14533o);
    }
}
