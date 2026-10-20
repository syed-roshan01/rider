package r1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements Collection, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f13390a = new LinkedHashSet();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f13390a.add(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f13390a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13390a.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f13390a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f13390a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f13390a.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f13390a.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f13390a.remove(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f13390a.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f13390a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return d9.i.v(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d9.i.w(this, objArr);
    }
}
