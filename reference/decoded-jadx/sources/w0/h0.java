package w0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0.e f16067a = new m0.e(0);

    public final boolean b(int i10) {
        return (i10 & this.f16067a.get()) != 0;
    }

    public final void c(int i10) {
        m0.e eVar;
        int i11;
        do {
            eVar = this.f16067a;
            i11 = eVar.get();
            if ((i11 & i10) != 0) {
                return;
            }
        } while (!eVar.compareAndSet(i11, i11 | i10));
    }
}
