package q9;

/* JADX INFO: loaded from: classes.dex */
public final class y implements u8.e, w8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u8.e f13293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u8.j f13294b;

    public y(u8.e eVar, u8.j jVar) {
        this.f13293a = eVar;
        this.f13294b = jVar;
    }

    @Override // w8.d
    public final w8.d getCallerFrame() {
        u8.e eVar = this.f13293a;
        if (eVar instanceof w8.d) {
            return (w8.d) eVar;
        }
        return null;
    }

    @Override // u8.e
    public final u8.j getContext() {
        return this.f13294b;
    }

    @Override // u8.e
    public final void resumeWith(Object obj) {
        this.f13293a.resumeWith(obj);
    }
}
