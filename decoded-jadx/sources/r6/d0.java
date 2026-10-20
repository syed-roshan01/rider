package r6;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient s f13526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient p f13527e;

    public d0(s sVar, e0 e0Var) {
        this.f13526d = sVar;
        this.f13527e = e0Var;
    }

    @Override // r6.l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f13526d.get(obj) != null;
    }

    @Override // r6.l
    public final int e(Object[] objArr) {
        return this.f13527e.e(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f13527e.listIterator(0);
    }

    @Override // r6.l
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((f0) this.f13526d).f13540f;
    }
}
