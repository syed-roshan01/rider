package q0;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13069c;

    public i(Object obj, int i10) {
        super(i10, 1);
        this.f13069c = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f13046a++;
        return this.f13069c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f13046a--;
        return this.f13069c;
    }
}
