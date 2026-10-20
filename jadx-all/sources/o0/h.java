package o0;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class h implements ListIterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12340b;

    public h(int i10, List list) {
        this.f12339a = list;
        this.f12340b = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f12339a.add(this.f12340b, obj);
        this.f12340b++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12340b < this.f12339a.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12340b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i10 = this.f12340b;
        this.f12340b = i10 + 1;
        return this.f12339a.get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12340b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i10 = this.f12340b - 1;
        this.f12340b = i10;
        return this.f12339a.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12340b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i10 = this.f12340b - 1;
        this.f12340b = i10;
        this.f12339a.remove(i10);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f12339a.set(this.f12340b, obj);
    }
}
