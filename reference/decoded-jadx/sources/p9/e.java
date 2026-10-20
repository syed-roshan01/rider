package p9;

/* JADX INFO: loaded from: classes.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f12885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.c f12886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f12887c;

    public e(f fVar) {
        j jVar = j.f12904a;
        i iVar = i.f12902a;
        this.f12885a = fVar;
        this.f12886b = jVar;
        this.f12887c = iVar;
    }

    @Override // p9.f
    public final Object collect(g gVar, u8.e eVar) {
        d9.u uVar = new d9.u();
        uVar.f4952a = q9.c.f13247b;
        Object objCollect = this.f12885a.collect(new s.c0(this, uVar, gVar, 1), eVar);
        return objCollect == v8.a.f15963a ? objCollect : q8.l.f13235a;
    }
}
