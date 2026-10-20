package m0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p2 implements Iterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q2 f11629c;

    public p2(int i10, int i11, q2 q2Var) {
        this.f11628b = i11;
        this.f11629c = q2Var;
        this.f11627a = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11627a < this.f11628b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            return null;
        }
        q2 q2Var = this.f11629c;
        Object[] objArr = q2Var.f11667c;
        int i10 = this.f11627a;
        this.f11627a = i10 + 1;
        return objArr[q2Var.g(i10)];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
