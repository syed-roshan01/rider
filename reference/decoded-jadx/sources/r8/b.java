package r8;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends o0.b implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f13648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i10) {
        super(dVar, 1);
        this.f13648d = dVar;
        int iE = dVar.e();
        if (i10 < 0 || i10 > iE) {
            throw new IndexOutOfBoundsException(l.q.i("index: ", i10, ", size: ", iE));
        }
        this.f12329b = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12329b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12329b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f12329b - 1;
        this.f12329b = i10;
        return this.f13648d.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12329b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
