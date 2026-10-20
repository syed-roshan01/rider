package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class l extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f1786a;

    public l(m mVar) {
        this.f1786a = mVar;
    }

    @Override // androidx.concurrent.futures.j
    public final String pendingToString() {
        k kVar = (k) this.f1786a.f1787a.get();
        if (kVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + kVar.f1782a + "]";
    }
}
