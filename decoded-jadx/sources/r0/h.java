package r0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f13319a;

    public h(f fVar) {
        this.f13319a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f13319a.clear();
    }

    @Override // r8.i
    public final int e() {
        f fVar = this.f13319a;
        fVar.getClass();
        return fVar.f13314f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new i(this.f13319a);
    }
}
