package r6;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f13564d;

    public i0(Object obj) {
        this.f13564d = obj;
    }

    @Override // r6.l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f13564d.equals(obj);
    }

    @Override // r6.l
    public final int e(Object[] objArr) {
        objArr[0] = this.f13564d;
        return 1;
    }

    @Override // r6.t, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13564d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new w(this.f13564d);
    }

    @Override // r6.l
    public final boolean n() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f13564d.toString() + ']';
    }
}
