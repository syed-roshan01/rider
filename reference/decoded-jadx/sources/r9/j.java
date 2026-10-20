package r9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m9.e0;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f13712a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f13713b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f13714c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public final j h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f13713b;
            j jVar = (j) atomicReferenceFieldUpdater2.get(this);
            j jVar2 = jVar;
            while (true) {
                j jVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f13712a;
                    obj = atomicReferenceFieldUpdater.get(jVar2);
                    if (obj == this) {
                        if (jVar == jVar2) {
                            return jVar2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, jVar, jVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != jVar) {
                                break;
                            }
                        }
                        return jVar2;
                    }
                    if (l()) {
                        return null;
                    }
                    if (obj == null) {
                        return jVar2;
                    }
                    if (obj instanceof p) {
                        ((p) obj).a(jVar2);
                        break;
                    }
                    if (!(obj instanceof q)) {
                        d7.a.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        jVar3 = jVar2;
                        jVar2 = (j) obj;
                    } else {
                        if (jVar3 != null) {
                            break;
                        }
                        jVar2 = (j) atomicReferenceFieldUpdater2.get(jVar2);
                    }
                }
                j jVar4 = ((q) obj).f13725a;
                while (!atomicReferenceFieldUpdater.compareAndSet(jVar3, jVar2, jVar4)) {
                    if (atomicReferenceFieldUpdater.get(jVar3) != jVar2) {
                        break;
                    }
                }
                jVar2 = jVar3;
            }
        }
    }

    public final void i(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13713b;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (j() != jVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                    if (l()) {
                        jVar.h();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(jVar) == jVar2);
        }
    }

    public final Object j() {
        while (true) {
            Object obj = f13712a.get(this);
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final j k() {
        j jVar;
        Object objJ = j();
        q qVar = objJ instanceof q ? (q) objJ : null;
        if (qVar != null && (jVar = qVar.f13725a) != null) {
            return jVar;
        }
        d7.a.k(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (j) objJ;
    }

    public boolean l() {
        return j() instanceof q;
    }

    public String toString() {
        return new z.n(this, 2) + '@' + e0.z(this);
    }
}
