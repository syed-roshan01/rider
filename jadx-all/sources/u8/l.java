package u8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class l implements e, w8.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15439b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f15440a;
    private volatile Object result;

    public l(v8.a aVar, e eVar) {
        this.f15440a = eVar;
        this.result = aVar;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        v8.a aVar = v8.a.f15964b;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15439b;
            v8.a aVar2 = v8.a.f15963a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return v8.a.f15963a;
        }
        if (obj == v8.a.f15965c) {
            return v8.a.f15963a;
        }
        if (obj instanceof q8.g) {
            throw ((q8.g) obj).f13227a;
        }
        return obj;
    }

    @Override // w8.d
    public final w8.d getCallerFrame() {
        e eVar = this.f15440a;
        if (eVar instanceof w8.d) {
            return (w8.d) eVar;
        }
        return null;
    }

    @Override // u8.e
    public final j getContext() {
        return this.f15440a.getContext();
    }

    @Override // u8.e
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            v8.a aVar = v8.a.f15964b;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15439b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    }
                }
                return;
            }
            v8.a aVar2 = v8.a.f15963a;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15439b;
            v8.a aVar3 = v8.a.f15965c;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    this.f15440a.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == aVar2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f15440a;
    }
}
