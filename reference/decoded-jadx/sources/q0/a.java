package q0;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements ListIterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13047b;

    public a(int i10, int i11) {
        this.f13046a = i10;
        this.f13047b = i11;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f13046a < this.f13047b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13046a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13046a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13046a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
