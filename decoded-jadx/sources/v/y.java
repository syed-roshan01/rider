package v;

import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class y implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.c f15826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f15827b = new x(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u.v1 f15828c = new u.v1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.n1 f15829d = d7.t.g0(Boolean.FALSE, o3.f11621a);

    public y(c9.c cVar) {
        this.f15826a = cVar;
    }

    @Override // v.f2
    public final boolean b() {
        return ((Boolean) this.f15829d.getValue()).booleanValue();
    }

    @Override // v.f2
    public final Object c(u.s1 s1Var, c9.e eVar, u8.e eVar2) {
        Object objQ = d7.a.q(new w(this, s1Var, eVar, null), eVar2);
        return objQ == v8.a.f15963a ? objQ : q8.l.f13235a;
    }

    @Override // v.f2
    public final float e(float f10) {
        return ((Number) this.f15826a.invoke(Float.valueOf(f10))).floatValue();
    }
}
