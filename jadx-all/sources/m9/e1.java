package m9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends h1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f11934f = AtomicIntegerFieldUpdater.newUpdater(e1.class, "_invoked");
    private volatile int _invoked;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.c f11935e;

    public e1(c9.c cVar) {
        this.f11935e = cVar;
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        n((Throwable) obj);
        return q8.l.f13235a;
    }

    @Override // m9.j1
    public final void n(Throwable th) {
        if (f11934f.compareAndSet(this, 0, 1)) {
            this.f11935e.invoke(th);
        }
    }
}
