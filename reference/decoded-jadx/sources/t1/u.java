package t1;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class u implements List, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f14560c;

    public u(v vVar, int i10, int i11) {
        this.f14560c = vVar;
        this.f14558a = i10;
        this.f14559b = i11;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof y0.n) && indexOf((y0.n) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((y0.n) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object obj = this.f14560c.f14561a[i10 + this.f14558a];
        d7.a.k(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (y0.n) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof y0.n)) {
            return -1;
        }
        y0.n nVar = (y0.n) obj;
        int i10 = this.f14558a;
        int i11 = this.f14559b;
        if (i10 > i11) {
            return -1;
        }
        int i12 = i10;
        while (!d7.a.d(this.f14560c.f14561a[i12], nVar)) {
            if (i12 == i11) {
                return -1;
            }
            i12++;
        }
        return i12 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f14558a;
        return new w0.c0(this.f14560c, i10, i10, this.f14559b);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof y0.n)) {
            return -1;
        }
        y0.n nVar = (y0.n) obj;
        int i10 = this.f14559b;
        int i11 = this.f14558a;
        if (i11 > i10) {
            return -1;
        }
        while (!d7.a.d(this.f14560c.f14561a[i10], nVar)) {
            if (i10 == i11) {
                return -1;
            }
            i10--;
        }
        return i10 - i11;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i10 = this.f14558a;
        return new w0.c0(this.f14560c, i10, i10, this.f14559b);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f14559b - this.f14558a;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        int i12 = this.f14558a;
        return new u(this.f14560c, i10 + i12, i12 + i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return d9.i.v(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        int i11 = this.f14558a;
        int i12 = this.f14559b;
        return new w0.c0(this.f14560c, i10 + i11, i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d9.i.w(this, objArr);
    }
}
