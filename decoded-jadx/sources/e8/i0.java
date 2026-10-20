package e8;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends k {
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(delegate(), "delegate");
        return gVarJ0.toString();
    }

    @Override // e8.k
    public void cancel(String str, Throwable th) {
        delegate().cancel(str, th);
    }

    public abstract k delegate();

    @Override // e8.k
    public c getAttributes() {
        return delegate().getAttributes();
    }

    @Override // e8.k
    public void halfClose() {
        delegate().halfClose();
    }

    @Override // e8.k
    public boolean isReady() {
        return delegate().isReady();
    }

    @Override // e8.k
    public void request(int i10) {
        delegate().request(i10);
    }

    @Override // e8.k
    public void sendMessage(Object obj) {
        delegate().sendMessage(obj);
    }

    @Override // e8.k
    public void setMessageCompression(boolean z10) {
        delegate().setMessageCompression(z10);
    }

    @Override // e8.k
    public void start(j jVar, l1 l1Var) {
        delegate().start(jVar, l1Var);
    }
}
