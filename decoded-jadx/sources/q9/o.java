package q9;

/* JADX INFO: loaded from: classes.dex */
public final class o extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.f f13279e;

    public o(c9.f fVar, p9.f fVar2, u8.j jVar, int i10, o9.a aVar) {
        super(i10, jVar, aVar, fVar2);
        this.f13279e = fVar;
    }

    @Override // q9.g
    public final g d(u8.j jVar, int i10, o9.a aVar) {
        return new o(this.f13279e, this.f13261d, jVar, i10, aVar);
    }

    @Override // q9.i
    public final Object g(p9.g gVar, u8.e eVar) {
        Object objQ = d7.a.q(new n(this, gVar, null), eVar);
        return objQ == v8.a.f15963a ? objQ : q8.l.f13235a;
    }
}
