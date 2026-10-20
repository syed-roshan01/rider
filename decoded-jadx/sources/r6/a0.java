package r6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f13516e = new a0(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f13517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f13518d;

    public a0(Object[] objArr, int i10) {
        this.f13517c = objArr;
        this.f13518d = i10;
    }

    @Override // r6.p, r6.l
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f13517c;
        int i10 = this.f13518d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // r6.l
    public final Object[] g() {
        return this.f13517c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        y3.e.I(i10, this.f13518d);
        Object obj = this.f13517c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // r6.l
    public final int i() {
        return this.f13518d;
    }

    @Override // r6.l
    public final int k() {
        return 0;
    }

    @Override // r6.l
    public final boolean n() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13518d;
    }
}
