package p9;

/* JADX INFO: loaded from: classes.dex */
public final class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9.e f12909b;

    public k(q9.o oVar, m0 m0Var) {
        this.f12908a = oVar;
        this.f12909b = m0Var;
    }

    @Override // p9.f
    public final Object collect(g gVar, u8.e eVar) {
        Object objCollect = this.f12908a.collect(new m(new d9.q(), gVar, this.f12909b), eVar);
        return objCollect == v8.a.f15963a ? objCollect : q8.l.f13235a;
    }
}
