package m9;

/* JADX INFO: loaded from: classes.dex */
public final class h2 implements u8.h, u8.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h2 f11950a = new h2();

    @Override // u8.j
    public final u8.j O(u8.j jVar) {
        d7.a.m(jVar, "context");
        return d7.a.A(this, jVar);
    }

    @Override // u8.j
    public final Object e(Object obj, c9.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // u8.j
    public final u8.h f(u8.i iVar) {
        return z6.a.D(this, iVar);
    }

    @Override // u8.h
    public final u8.i getKey() {
        return this;
    }

    @Override // u8.j
    public final u8.j u(u8.i iVar) {
        return z6.a.V(this, iVar);
    }
}
