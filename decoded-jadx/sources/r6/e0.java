package r6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f13530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f13531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f13532e;

    public e0(Object[] objArr, int i10, int i11) {
        this.f13530c = objArr;
        this.f13531d = i10;
        this.f13532e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        y3.e.I(i10, this.f13532e);
        Object obj = this.f13530c[(i10 * 2) + this.f13531d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // r6.l
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13532e;
    }
}
