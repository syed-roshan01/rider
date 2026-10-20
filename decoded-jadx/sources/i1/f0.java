package i1;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Iterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f7799a;

    public f0(g0 g0Var) {
        this.f7799a = g0Var.f7812q.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7799a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (i0) this.f7799a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
