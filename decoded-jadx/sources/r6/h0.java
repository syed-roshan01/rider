package r6;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends v {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h0 f13552n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient p f13553f;

    static {
        m mVar = p.f13572b;
        f13552n = new h0(a0.f13516e, y.f13589a);
    }

    public h0(p pVar, Comparator comparator) {
        super(comparator);
        this.f13553f = pVar;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iV = v(obj, true);
        p pVar = this.f13553f;
        if (iV == pVar.size()) {
            return null;
        }
        return pVar.get(iV);
    }

    @Override // r6.l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.f13553f, obj, this.f13585d) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof x) {
            collection = ((x) collection).f();
        }
        Comparator comparator = this.f13585d;
        if (!z6.a.M(collection, comparator) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        m mVarListIterator = this.f13553f.listIterator(0);
        Iterator it = collection.iterator();
        if (!mVarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = mVarListIterator.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!mVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = mVarListIterator.next();
                } else if (iCompare == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f13553f.q().listIterator(0);
    }

    @Override // r6.l
    public final int e(Object[] objArr) {
        return this.f13553f.e(objArr);
    }

    @Override // r6.t, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        p pVar = this.f13553f;
        if (pVar.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f13585d;
        if (!z6.a.M(set, comparator)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            m mVarListIterator = pVar.listIterator(0);
            while (mVarListIterator.hasNext()) {
                Object next = mVarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || comparator.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f13553f.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iU = u(obj, true) - 1;
        if (iU == -1) {
            return null;
        }
        return this.f13553f.get(iU);
    }

    @Override // r6.l
    public final Object[] g() {
        return this.f13553f.g();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iV = v(obj, false);
        p pVar = this.f13553f;
        if (iV == pVar.size()) {
            return null;
        }
        return pVar.get(iV);
    }

    @Override // r6.l
    public final int i() {
        return this.f13553f.i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        return this.f13553f.listIterator(0);
    }

    @Override // r6.l
    public final int k() {
        return this.f13553f.k();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        p pVar = this.f13553f;
        return pVar.get(pVar.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iU = u(obj, false) - 1;
        if (iU == -1) {
            return null;
        }
        return this.f13553f.get(iU);
    }

    @Override // r6.l
    public final boolean n() {
        return this.f13553f.n();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13553f.size();
    }

    public final h0 t(int i10, int i11) {
        p pVar = this.f13553f;
        if (i10 == 0 && i11 == pVar.size()) {
            return this;
        }
        Comparator comparator = this.f13585d;
        return i10 < i11 ? new h0(pVar.subList(i10, i11), comparator) : v.r(comparator);
    }

    public final int u(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f13553f, obj, this.f13585d);
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int v(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f13553f, obj, this.f13585d);
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }
}
