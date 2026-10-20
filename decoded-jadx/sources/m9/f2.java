package m9;

/* JADX INFO: loaded from: classes.dex */
public final class f2 extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11943c = 0;

    static {
        new f2();
    }

    @Override // m9.z
    public final void c0(u8.j jVar, Runnable runnable) {
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // m9.z
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
