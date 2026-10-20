package w0;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class r implements Set, e9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f16120a;

    public r(x xVar) {
        this.f16120a = xVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f16120a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f16120a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f16120a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return d9.i.v(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d9.i.w(this, objArr);
    }
}
