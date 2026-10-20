package u9;

import d7.t;
import i3.u;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m9.e0;
import q8.l;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15447h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner = z10 ? null : e.f15448a;
    }

    public final Object c(Object obj, u8.e eVar) throws IllegalAccessException, InvocationTargetException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        int i11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        char c10;
        char c11;
        while (true) {
            atomicIntegerFieldUpdater = i.f15455g;
            int i12 = atomicIntegerFieldUpdater.get(this);
            i10 = this.f15456a;
            if (i12 > i10) {
                do {
                    i11 = atomicIntegerFieldUpdater.get(this);
                    if (i11 <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, i10));
            } else {
                atomicReferenceFieldUpdater = f15447h;
                if (i12 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                                c11 = 0;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != e.f15448a) {
                                if (obj2 != obj) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 1;
                                break;
                            }
                        }
                        if (c11 == 1) {
                            c10 = 2;
                            break;
                        }
                        if (c11 != 2) {
                        }
                    }
                    c10 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i12, i12 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c10 = 0;
                    break;
                }
            }
        }
        l lVar = l.f13235a;
        if (c10 == 0) {
            return lVar;
        }
        if (c10 != 1) {
            if (c10 != 2) {
                throw new IllegalStateException("unexpected".toString());
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        m9.l lVarW = d7.a.w(t.b0(eVar));
        try {
            c cVar = new c(this, lVarW, obj);
            while (true) {
                int andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
                if (andDecrement <= i10) {
                    if (andDecrement > 0) {
                        Object obj3 = cVar.f15445b;
                        d dVar = cVar.f15446c;
                        atomicReferenceFieldUpdater.set(dVar, obj3);
                        cVar.f15444a.o(new b(dVar, cVar, 0), lVar);
                        break;
                    }
                    if (a(cVar)) {
                        break;
                    }
                }
            }
            Object objS = lVarW.s();
            v8.a aVar = v8.a.f15963a;
            if (objS != aVar) {
                objS = lVar;
            }
            return objS == aVar ? objS : lVar;
        } catch (Throwable th) {
            lVarW.C();
            throw th;
        }
    }

    public final void d(Object obj) {
        while (Math.max(i.f15455g.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15447h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            u uVar = e.f15448a;
            if (obj2 != uVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, uVar)) {
                        b();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(e0.z(this));
        sb.append("[isLocked=");
        sb.append(Math.max(i.f15455g.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f15447h.get(this));
        sb.append(']');
        return sb.toString();
    }
}
