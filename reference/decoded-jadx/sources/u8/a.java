package u8;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f15428a;

    public a(i iVar) {
        this.f15428a = iVar;
    }

    @Override // u8.j
    public final j O(j jVar) {
        d7.a.m(jVar, "context");
        return d7.a.A(this, jVar);
    }

    @Override // u8.j
    public final Object e(Object obj, c9.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // u8.j
    public h f(i iVar) {
        return z6.a.D(this, iVar);
    }

    @Override // u8.h
    public final i getKey() {
        return this.f15428a;
    }

    @Override // u8.j
    public j u(i iVar) {
        return z6.a.V(this, iVar);
    }
}
