package k9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Iterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f10651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f10652b;

    public o(h hVar) {
        this.f10652b = hVar;
        this.f10651a = ((i) hVar.f10645c).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10651a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f10652b.f10644b.invoke(this.f10651a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
