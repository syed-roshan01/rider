package r1;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f13435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f13436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0 f13437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c9.c f13438f;

    public z(int i10, int i11, Map map, a0 a0Var, f0 f0Var, c9.c cVar) {
        this.f13433a = i10;
        this.f13434b = i11;
        this.f13435c = map;
        this.f13436d = a0Var;
        this.f13437e = f0Var;
        this.f13438f = cVar;
    }

    @Override // r1.k0
    public final int a() {
        return this.f13434b;
    }

    @Override // r1.k0
    public final int b() {
        return this.f13433a;
    }

    @Override // r1.k0
    public final Map d() {
        return this.f13435c;
    }

    @Override // r1.k0
    public final void e() {
        t1.r0 r0Var;
        boolean zQ = this.f13436d.q();
        c9.c cVar = this.f13438f;
        f0 f0Var = this.f13437e;
        if (!zQ || (r0Var = f0Var.f13359a.C.f14576b.O) == null) {
            cVar.invoke(f0Var.f13359a.C.f14576b.f14533o);
        } else {
            cVar.invoke(r0Var.f14533o);
        }
    }
}
