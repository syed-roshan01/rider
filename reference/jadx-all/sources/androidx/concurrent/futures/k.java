package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f1783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f1784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1785d;

    public final void finalize() {
        o oVar;
        m mVar = this.f1783b;
        if (mVar != null) {
            l lVar = mVar.f1788b;
            if (!lVar.isDone()) {
                lVar.setException(new c("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f1782a, 1));
            }
        }
        if (this.f1785d || (oVar = this.f1784c) == null) {
            return;
        }
        oVar.set(null);
    }
}
