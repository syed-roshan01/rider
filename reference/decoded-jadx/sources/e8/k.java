package e8;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public abstract void cancel(String str, Throwable th);

    public c getAttributes() {
        return c.f5206b;
    }

    public abstract void halfClose();

    public boolean isReady() {
        return true;
    }

    public abstract void request(int i10);

    public abstract void sendMessage(Object obj);

    public void setMessageCompression(boolean z10) {
    }

    public abstract void start(j jVar, l1 l1Var);
}
