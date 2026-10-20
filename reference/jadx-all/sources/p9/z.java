package p9;

/* JADX INFO: loaded from: classes.dex */
public final class z implements o0, f, q9.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f12972a;

    public z(q0 q0Var) {
        this.f12972a = q0Var;
    }

    @Override // q9.q
    public final f b(u8.j jVar, int i10, o9.a aVar) {
        return ((((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != o9.a.f12669b) && !((i10 == 0 || i10 == -3) && aVar == o9.a.f12668a)) ? new q9.j(i10, jVar, aVar, this) : this;
    }

    @Override // p9.f
    public final Object collect(g gVar, u8.e eVar) {
        return this.f12972a.collect(gVar, eVar);
    }

    @Override // p9.o0
    public final Object getValue() {
        return this.f12972a.getValue();
    }
}
