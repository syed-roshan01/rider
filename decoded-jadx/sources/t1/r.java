package t1;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f14534a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f14535b = new q();

    public final void a(androidx.compose.ui.node.a aVar, boolean z10) {
        q qVar = this.f14534a;
        if (z10) {
            qVar.a(aVar);
        } else {
            if (qVar.b(aVar)) {
                return;
            }
            this.f14535b.a(aVar);
        }
    }

    public final boolean b() {
        return !(this.f14535b.f14530c.isEmpty() && this.f14534a.f14530c.isEmpty());
    }
}
