package r8;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f13649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13651c;

    public c(d dVar, int i10, int i11) {
        d7.a.m(dVar, "list");
        this.f13649a = dVar;
        this.f13650b = i10;
        q8.k.d(i10, i11, dVar.e());
        this.f13651c = i11 - i10;
    }

    @Override // r8.a
    public final int e() {
        return this.f13651c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f13651c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(l.q.i("index: ", i10, ", size: ", i11));
        }
        return this.f13649a.get(this.f13650b + i10);
    }
}
