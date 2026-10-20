package o0;

import d7.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class f implements List, e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f12335a;

    public f(i iVar) {
        this.f12335a = iVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f12335a.c(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        i iVar = this.f12335a;
        return iVar.e(iVar.f12343c, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f12335a.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12335a.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        i iVar = this.f12335a;
        iVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!iVar.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        t.o(i10, this);
        return this.f12335a.f12341a[i10];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f12335a.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f12335a.k();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new h(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        i iVar = this.f12335a;
        int i10 = iVar.f12343c;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = iVar.f12341a;
            while (!d7.a.d(obj, objArr[i11])) {
                i11--;
                if (i11 < 0) {
                }
            }
            return i11;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new h(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f12335a.m(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        i iVar = this.f12335a;
        iVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = iVar.f12343c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            iVar.m(it.next());
        }
        return i10 != iVar.f12343c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        i iVar = this.f12335a;
        int i10 = iVar.f12343c;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!collection.contains(iVar.f12341a[i11])) {
                iVar.n(i11);
            }
        }
        return i10 != iVar.f12343c;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        t.o(i10, this);
        return this.f12335a.p(i10, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f12335a.f12343c;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        t.p(i10, i11, this);
        return new g(i10, i11, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return d9.i.v(this);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f12335a.b(i10, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new h(i10, this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        t.o(i10, this);
        return this.f12335a.n(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d9.i.w(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return this.f12335a.e(i10, collection);
    }
}
