package m0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Iterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2 f11688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11691d;

    public r0(int i10, int i11, n2 n2Var) {
        this.f11688a = n2Var;
        this.f11689b = i11;
        this.f11690c = i10;
        this.f11691d = n2Var.f11602n;
        if (n2Var.f11601f) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11690c < this.f11689b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        n2 n2Var = this.f11688a;
        int i10 = n2Var.f11602n;
        int i11 = this.f11691d;
        if (i10 != i11) {
            throw new ConcurrentModificationException();
        }
        int i12 = this.f11690c;
        this.f11690c = d7.t.s(n2Var.f11596a, i12) + i12;
        return new o2(i12, i11, n2Var);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
