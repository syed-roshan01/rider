package s0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import r0.d;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f13902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f13903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13904c;

    public c(Object obj, d dVar) {
        this.f13902a = obj;
        this.f13903b = dVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13904c < this.f13903b.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.f13902a;
        this.f13904c++;
        Object obj2 = this.f13903b.get(obj);
        if (obj2 != null) {
            this.f13902a = ((a) obj2).f13897b;
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
