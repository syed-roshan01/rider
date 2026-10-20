package p9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends q9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12951a = AtomicReferenceFieldUpdater.newUpdater(r0.class, Object.class, "_state");
    private volatile Object _state;

    @Override // q9.d
    public final boolean a(q9.b bVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12951a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, d0.f12883b);
        return true;
    }

    @Override // q9.d
    public final u8.e[] b(q9.b bVar) {
        f12951a.set(this, null);
        return q9.c.f13246a;
    }
}
