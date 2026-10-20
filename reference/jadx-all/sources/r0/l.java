package r0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l extends r8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f13322a;

    public l(f fVar) {
        this.f13322a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f13322a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13322a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        s[] sVarArr = new s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            sVarArr[i10] = new w();
        }
        return new k(this.f13322a, sVarArr);
    }
}
