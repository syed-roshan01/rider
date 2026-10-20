package ja;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class w extends r8.d implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j[] f8576a;

    public w(j[] jVarArr) {
        this.f8576a = jVarArr;
    }

    @Override // r8.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof j) {
            return super.contains((j) obj);
        }
        return false;
    }

    @Override // r8.a
    public final int e() {
        return this.f8576a.length;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f8576a[i10];
    }

    @Override // r8.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof j) {
            return super.indexOf((j) obj);
        }
        return -1;
    }

    @Override // r8.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof j) {
            return super.lastIndexOf((j) obj);
        }
        return -1;
    }
}
