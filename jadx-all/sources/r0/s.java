package r0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class s implements Iterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f13333a = r.f13328e.f13332d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13335c;

    public final void a(int i10, int i11, Object[] objArr) {
        this.f13333a = objArr;
        this.f13334b = i10;
        this.f13335c = i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13335c < this.f13334b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
