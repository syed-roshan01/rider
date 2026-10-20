package w0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class u implements g0, List, RandomAccess, e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f16124a = new t(q0.j.f13070b);

    /* JADX WARN: Bottom block not found for handler: all -> 0x0056 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean add(Object obj) {
        int i10;
        p0.d dVar;
        boolean z10;
        i iVarI;
        do {
            Object obj2 = v.f16125a;
            synchronized (obj2) {
                t tVar = this.f16124a;
                d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) p.h(tVar);
                i10 = tVar2.f16122d;
                dVar = tVar2.f16121c;
            }
            d7.a.j(dVar);
            p0.d dVarAdd = dVar.add(obj);
            z10 = false;
            if (d7.a.d(dVarAdd, dVar)) {
                return false;
            }
            t tVar3 = this.f16124a;
            d7.a.k(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                t tVar4 = (t) p.u(tVar3, this, iVarI);
                synchronized (obj2) {
                    try {
                        int i11 = tVar4.f16122d;
                        if (i11 == i10) {
                            tVar4.f16121c = dVarAdd;
                            tVar4.f16123e++;
                            tVar4.f16122d = i11 + 1;
                            z10 = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            p.l(iVarI, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return p(new u.k(i10, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        i iVarI;
        t tVar = this.f16124a;
        d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (p.f16109b) {
            iVarI = p.i();
            t tVar2 = (t) p.u(tVar, this, iVarI);
            synchronized (v.f16125a) {
                tVar2.f16121c = q0.j.f13070b;
                tVar2.f16122d++;
                tVar2.f16123e++;
            }
        }
        p.l(iVarI, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return n().f16121c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return n().f16121c.containsAll(collection);
    }

    @Override // w0.g0
    public final i0 e() {
        return this.f16124a;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return n().f16121c.get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return n().f16121c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return n().f16121c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // w0.g0
    public final void k(i0 i0Var) {
        i0Var.f16074b = this.f16124a;
        this.f16124a = (t) i0Var;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return n().f16121c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c0(this, 0);
    }

    public final t n() {
        t tVar = this.f16124a;
        d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (t) p.r(tVar, this);
    }

    public final int o() {
        t tVar = this.f16124a;
        d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((t) p.h(tVar)).f16123e;
    }

    public final boolean p(c9.c cVar) {
        int i10;
        p0.d dVar;
        Object objInvoke;
        i iVarI;
        boolean z10;
        do {
            Object obj = v.f16125a;
            synchronized (obj) {
                t tVar = this.f16124a;
                d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) p.h(tVar);
                i10 = tVar2.f16122d;
                dVar = tVar2.f16121c;
            }
            d7.a.j(dVar);
            q0.f fVarBuilder = dVar.builder();
            objInvoke = cVar.invoke(fVarBuilder);
            p0.d dVarK = fVarBuilder.k();
            if (d7.a.d(dVarK, dVar)) {
                break;
            }
            t tVar3 = this.f16124a;
            d7.a.k(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                t tVar4 = (t) p.u(tVar3, this, iVarI);
                synchronized (obj) {
                    int i11 = tVar4.f16122d;
                    if (i11 == i10) {
                        tVar4.f16121c = dVarK;
                        tVar4.f16122d = i11 + 1;
                        z10 = true;
                        tVar4.f16123e++;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.l(iVarI, this);
        } while (!z10);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        p0.d dVar;
        i iVarI;
        boolean z10;
        Object obj = get(i10);
        do {
            Object obj2 = v.f16125a;
            synchronized (obj2) {
                t tVar = this.f16124a;
                d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) p.h(tVar);
                i11 = tVar2.f16122d;
                dVar = tVar2.f16121c;
            }
            d7.a.j(dVar);
            p0.d dVarM = dVar.m(i10);
            if (d7.a.d(dVarM, dVar)) {
                break;
            }
            t tVar3 = this.f16124a;
            d7.a.k(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                t tVar4 = (t) p.u(tVar3, this, iVarI);
                synchronized (obj2) {
                    int i12 = tVar4.f16122d;
                    if (i12 == i11) {
                        tVar4.f16121c = dVarM;
                        z10 = true;
                        tVar4.f16123e++;
                        tVar4.f16122d = i12 + 1;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.l(iVarI, this);
        } while (!z10);
        return obj;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005e */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i10;
        p0.d dVar;
        boolean z10;
        i iVarI;
        do {
            Object obj = v.f16125a;
            synchronized (obj) {
                t tVar = this.f16124a;
                d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) p.h(tVar);
                i10 = tVar2.f16122d;
                dVar = tVar2.f16121c;
            }
            d7.a.j(dVar);
            z10 = false;
            p0.d dVarH = ((q0.c) dVar).h(new q0.b(0, collection));
            if (d7.a.d(dVarH, dVar)) {
                return false;
            }
            t tVar3 = this.f16124a;
            d7.a.k(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                t tVar4 = (t) p.u(tVar3, this, iVarI);
                synchronized (obj) {
                    try {
                        int i11 = tVar4.f16122d;
                        if (i11 == i10) {
                            tVar4.f16121c = dVarH;
                            tVar4.f16123e++;
                            tVar4.f16122d = i11 + 1;
                            z10 = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            p.l(iVarI, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return p(new q0.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        int i11;
        p0.d dVar;
        i iVarI;
        boolean z10;
        Object obj2 = get(i10);
        do {
            Object obj3 = v.f16125a;
            synchronized (obj3) {
                t tVar = this.f16124a;
                d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) p.h(tVar);
                i11 = tVar2.f16122d;
                dVar = tVar2.f16121c;
            }
            d7.a.j(dVar);
            p0.d dVar2 = dVar.set(i10, obj);
            if (d7.a.d(dVar2, dVar)) {
                break;
            }
            t tVar3 = this.f16124a;
            d7.a.k(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                t tVar4 = (t) p.u(tVar3, this, iVarI);
                synchronized (obj3) {
                    int i12 = tVar4.f16122d;
                    if (i12 == i11) {
                        tVar4.f16121c = dVar2;
                        tVar4.f16122d = i12 + 1;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.l(iVarI, this);
        } while (!z10);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return n().f16121c.size();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > size()) {
            throw new IllegalArgumentException("fromIndex or toIndex are out of bounds".toString());
        }
        return new k0(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return d9.i.v(this);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0056 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean addAll(Collection collection) {
        int i10;
        p0.d dVar;
        boolean z10;
        i iVarI;
        do {
            Object obj = v.f16125a;
            synchronized (obj) {
                t tVar = this.f16124a;
                d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) p.h(tVar);
                i10 = tVar2.f16122d;
                dVar = tVar2.f16121c;
            }
            d7.a.j(dVar);
            p0.d dVarAddAll = dVar.addAll(collection);
            z10 = false;
            if (d7.a.d(dVarAddAll, dVar)) {
                return false;
            }
            t tVar3 = this.f16124a;
            d7.a.k(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                t tVar4 = (t) p.u(tVar3, this, iVarI);
                synchronized (obj) {
                    try {
                        int i11 = tVar4.f16122d;
                        if (i11 == i10) {
                            tVar4.f16121c = dVarAddAll;
                            tVar4.f16123e++;
                            tVar4.f16122d = i11 + 1;
                            z10 = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            p.l(iVarI, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new c0(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d9.i.w(this, objArr);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0054 */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void add(int i10, Object obj) {
        int i11;
        p0.d dVar;
        i iVarI;
        boolean z10;
        do {
            Object obj2 = v.f16125a;
            synchronized (obj2) {
                t tVar = this.f16124a;
                d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) p.h(tVar);
                i11 = tVar2.f16122d;
                dVar = tVar2.f16121c;
            }
            d7.a.j(dVar);
            p0.d dVarAdd = dVar.add(i10, obj);
            if (d7.a.d(dVarAdd, dVar)) {
                return;
            }
            t tVar3 = this.f16124a;
            d7.a.k(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                t tVar4 = (t) p.u(tVar3, this, iVarI);
                synchronized (obj2) {
                    try {
                        int i12 = tVar4.f16122d;
                        if (i12 == i11) {
                            tVar4.f16121c = dVarAdd;
                            z10 = true;
                            tVar4.f16123e++;
                            tVar4.f16122d = i12 + 1;
                        } else {
                            z10 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            p.l(iVarI, this);
        } while (!z10);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0060 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        int i10;
        p0.d dVar;
        boolean z10;
        i iVarI;
        do {
            Object obj2 = v.f16125a;
            synchronized (obj2) {
                t tVar = this.f16124a;
                d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) p.h(tVar);
                i10 = tVar2.f16122d;
                dVar = tVar2.f16121c;
            }
            d7.a.j(dVar);
            q0.c cVar = (q0.c) dVar;
            int iIndexOf = cVar.indexOf(obj);
            q0.c cVarM = cVar;
            if (iIndexOf != -1) {
                cVarM = cVar.m(iIndexOf);
            }
            z10 = false;
            if (d7.a.d(cVarM, dVar)) {
                return false;
            }
            t tVar3 = this.f16124a;
            d7.a.k(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                t tVar4 = (t) p.u(tVar3, this, iVarI);
                synchronized (obj2) {
                    try {
                        int i11 = tVar4.f16122d;
                        if (i11 == i10) {
                            tVar4.f16121c = cVarM;
                            tVar4.f16123e++;
                            tVar4.f16122d = i11 + 1;
                            z10 = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            p.l(iVarI, this);
        } while (!z10);
        return true;
    }
}
