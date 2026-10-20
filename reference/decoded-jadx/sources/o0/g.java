package o0;

import d7.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class g implements List, e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12338c;

    public g(int i10, int i11, List list) {
        this.f12336a = list;
        this.f12337b = i10;
        this.f12338c = i11;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10 = this.f12338c;
        this.f12338c = i10 + 1;
        this.f12336a.add(i10, obj);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        this.f12336a.addAll(i10 + this.f12337b, collection);
        this.f12338c = collection.size() + this.f12338c;
        return collection.size() > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10 = this.f12338c - 1;
        int i11 = this.f12337b;
        if (i11 <= i10) {
            while (true) {
                this.f12336a.remove(i10);
                if (i10 == i11) {
                    break;
                } else {
                    i10--;
                }
            }
        }
        this.f12338c = i11;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i10 = this.f12338c;
        for (int i11 = this.f12337b; i11 < i10; i11++) {
            if (d7.a.d(this.f12336a.get(i11), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        t.o(i10, this);
        return this.f12336a.get(i10 + this.f12337b);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i10 = this.f12338c;
        int i11 = this.f12337b;
        for (int i12 = i11; i12 < i10; i12++) {
            if (d7.a.d(this.f12336a.get(i12), obj)) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f12338c == this.f12337b;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new h(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i10 = this.f12338c - 1;
        int i11 = this.f12337b;
        if (i11 > i10) {
            return -1;
        }
        while (!d7.a.d(this.f12336a.get(i10), obj)) {
            if (i10 == i11) {
                return -1;
            }
            i10--;
        }
        return i10 - i11;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new h(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10 = this.f12338c;
        for (int i11 = this.f12337b; i11 < i10; i11++) {
            List list = this.f12336a;
            if (d7.a.d(list.get(i11), obj)) {
                list.remove(i11);
                this.f12338c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10 = this.f12338c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i10 != this.f12338c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10 = this.f12338c;
        int i11 = i10 - 1;
        int i12 = this.f12337b;
        if (i12 <= i11) {
            while (true) {
                List list = this.f12336a;
                if (!collection.contains(list.get(i11))) {
                    list.remove(i11);
                    this.f12338c--;
                }
                if (i11 == i12) {
                    break;
                }
                i11--;
            }
        }
        return i10 != this.f12338c;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        t.o(i10, this);
        return this.f12336a.set(i10 + this.f12337b, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f12338c - this.f12337b;
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
        this.f12336a.add(i10 + this.f12337b, obj);
        this.f12338c++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new h(i10, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d9.i.w(this, objArr);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        t.o(i10, this);
        Object objRemove = this.f12336a.remove(i10 + this.f12337b);
        this.f12338c--;
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f12336a.addAll(this.f12338c, collection);
        this.f12338c = collection.size() + this.f12338c;
        return collection.size() > 0;
    }
}
