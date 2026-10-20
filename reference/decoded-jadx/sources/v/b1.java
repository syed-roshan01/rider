package v;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends y0.n implements s1.f {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15485u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s1.j f15486v;

    public b1(boolean z10) {
        this.f15485u = z10;
        s1.i iVar = androidx.compose.foundation.gestures.a.f1634c;
        Boolean bool = Boolean.TRUE;
        s1.j jVar = new s1.j(iVar);
        jVar.A.setValue(bool);
        this.f15486v = jVar;
    }

    @Override // s1.f
    public final f6.a j() {
        return this.f15485u ? this.f15486v : s1.b.f13906z;
    }
}
