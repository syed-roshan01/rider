package r0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j extends r8.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f13321a;

    public j(f fVar) {
        this.f13321a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f13321a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f13321a.containsKey(obj);
    }

    @Override // r8.i
    public final int e() {
        f fVar = this.f13321a;
        fVar.getClass();
        return fVar.f13314f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        s[] sVarArr = new s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            sVarArr[i10] = new u();
        }
        return new k(this.f13321a, sVarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f13321a;
        if (!fVar.containsKey(obj)) {
            return false;
        }
        fVar.remove(obj);
        return true;
    }
}
