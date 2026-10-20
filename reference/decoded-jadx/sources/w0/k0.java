package w0;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements List, e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f16078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16081d;

    public k0(u uVar, int i10, int i11) {
        this.f16078a = uVar;
        this.f16079b = i10;
        this.f16080c = uVar.o();
        this.f16081d = i11 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        e();
        int i10 = this.f16079b + this.f16081d;
        u uVar = this.f16078a;
        uVar.add(i10, obj);
        this.f16081d++;
        this.f16080c = uVar.o();
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        e();
        int i11 = i10 + this.f16079b;
        u uVar = this.f16078a;
        boolean zAddAll = uVar.addAll(i11, collection);
        if (zAddAll) {
            this.f16081d = collection.size() + this.f16081d;
            this.f16080c = uVar.o();
        }
        return zAddAll;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0070 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void clear() {
        int i10;
        p0.d dVar;
        i iVarI;
        boolean z10;
        if (this.f16081d > 0) {
            e();
            u uVar = this.f16078a;
            int i11 = this.f16079b;
            int i12 = this.f16081d + i11;
            uVar.getClass();
            do {
                Object obj = v.f16125a;
                synchronized (obj) {
                    t tVar = uVar.f16124a;
                    d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    t tVar2 = (t) p.h(tVar);
                    i10 = tVar2.f16122d;
                    dVar = tVar2.f16121c;
                }
                d7.a.j(dVar);
                q0.f fVarBuilder = dVar.builder();
                fVarBuilder.subList(i11, i12).clear();
                p0.d dVarK = fVarBuilder.k();
                if (d7.a.d(dVarK, dVar)) {
                    break;
                }
                t tVar3 = uVar.f16124a;
                d7.a.k(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (p.f16109b) {
                    iVarI = p.i();
                    t tVar4 = (t) p.u(tVar3, uVar, iVarI);
                    synchronized (obj) {
                        try {
                            int i13 = tVar4.f16122d;
                            if (i13 == i10) {
                                tVar4.f16121c = dVarK;
                                tVar4.f16122d = i13 + 1;
                                z10 = true;
                                tVar4.f16123e++;
                            } else {
                                z10 = false;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                p.l(iVarI, uVar);
            } while (!z10);
            this.f16081d = 0;
            this.f16080c = this.f16078a.o();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e() {
        if (this.f16078a.o() != this.f16080c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        e();
        v.a(i10, this.f16081d);
        return this.f16078a.get(this.f16079b + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        e();
        int i10 = this.f16081d;
        int i11 = this.f16079b;
        Iterator it = z6.a.s0(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int iB = ((i9.f) it).b();
            if (d7.a.d(obj, this.f16078a.get(iB))) {
                return iB - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f16081d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e();
        int i10 = this.f16081d;
        int i11 = this.f16079b;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (d7.a.d(obj, this.f16078a.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x006e */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean retainAll(Collection collection) {
        int i10;
        p0.d dVar;
        i iVarI;
        boolean z10;
        e();
        u uVar = this.f16078a;
        int i11 = this.f16079b;
        int i12 = this.f16081d + i11;
        int size = uVar.size();
        do {
            Object obj = v.f16125a;
            synchronized (obj) {
                t tVar = uVar.f16124a;
                d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) p.h(tVar);
                i10 = tVar2.f16122d;
                dVar = tVar2.f16121c;
            }
            d7.a.j(dVar);
            q0.f fVarBuilder = dVar.builder();
            fVarBuilder.subList(i11, i12).retainAll(collection);
            p0.d dVarK = fVarBuilder.k();
            if (d7.a.d(dVarK, dVar)) {
                break;
            }
            t tVar3 = uVar.f16124a;
            d7.a.k(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                t tVar4 = (t) p.u(tVar3, uVar, iVarI);
                synchronized (obj) {
                    try {
                        int i13 = tVar4.f16122d;
                        if (i13 == i10) {
                            tVar4.f16121c = dVarK;
                            tVar4.f16122d = i13 + 1;
                            tVar4.f16123e++;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            p.l(iVarI, uVar);
        } while (!z10);
        int size2 = size - uVar.size();
        if (size2 > 0) {
            this.f16080c = this.f16078a.o();
            this.f16081d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        v.a(i10, this.f16081d);
        e();
        int i11 = i10 + this.f16079b;
        u uVar = this.f16078a;
        Object obj2 = uVar.set(i11, obj);
        this.f16080c = uVar.o();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f16081d;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > this.f16081d) {
            throw new IllegalArgumentException("fromIndex or toIndex are out of bounds".toString());
        }
        e();
        int i12 = this.f16079b;
        return new k0(this.f16078a, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return d9.i.v(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        e();
        d9.s sVar = new d9.s();
        sVar.f4950a = i10 - 1;
        return new j0(sVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d9.i.w(this, objArr);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        e();
        int i11 = this.f16079b + i10;
        u uVar = this.f16078a;
        Object objRemove = uVar.remove(i11);
        this.f16081d--;
        this.f16080c = uVar.o();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        e();
        int i11 = this.f16079b + i10;
        u uVar = this.f16078a;
        uVar.add(i11, obj);
        this.f16081d++;
        this.f16080c = uVar.o();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f16081d, collection);
    }
}
