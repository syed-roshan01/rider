package m0;

/* JADX INFO: loaded from: classes.dex */
public final class t1 implements g1, m9.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u8.j f11706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f11707b;

    public t1(g1 g1Var, u8.j jVar) {
        this.f11706a = jVar;
        this.f11707b = g1Var;
    }

    @Override // m0.l3
    public final Object getValue() {
        return this.f11707b.getValue();
    }

    @Override // m9.d0
    public final u8.j q() {
        return this.f11706a;
    }

    @Override // m0.g1
    public final void setValue(Object obj) {
        this.f11707b.setValue(obj);
    }
}
