package q0;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f13050c;

    public d(Object[] objArr, int i10, int i11) {
        super(i10, i11);
        this.f13050c = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13046a;
        this.f13046a = i10 + 1;
        return this.f13050c[i10];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13046a - 1;
        this.f13046a = i10;
        return this.f13050c[i10];
    }
}
