package r9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f13694a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f13688a;

    @Override // r9.p
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13694a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        i3.u uVar = a.f13688a;
        if (obj2 == uVar) {
            i3.u uVarC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == uVar) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarC)) {
                    if (atomicReferenceFieldUpdater.get(this) != uVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                    }
                }
                obj2 = uVarC;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract i3.u c(Object obj);
}
