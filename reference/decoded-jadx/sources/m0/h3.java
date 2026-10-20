package m0;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f11554a = new AtomicReference(u0.g.f15012a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11555b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11556c;

    public final Object a() {
        if (Thread.currentThread().getId() == b.f11456a) {
            return this.f11556c;
        }
        u0.f fVar = (u0.f) this.f11554a.get();
        int iA = fVar.a(Thread.currentThread().getId());
        if (iA >= 0) {
            return fVar.f15011c[iA];
        }
        return null;
    }

    public final void b(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == b.f11456a) {
            this.f11556c = obj;
            return;
        }
        synchronized (this.f11555b) {
            u0.f fVar = (u0.f) this.f11554a.get();
            int iA = fVar.a(id);
            if (iA < 0) {
                this.f11554a.set(fVar.b(obj, id));
            } else {
                fVar.f15011c[iA] = obj;
            }
        }
    }
}
