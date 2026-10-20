package r6;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f13519c;

    public b0(c0 c0Var) {
        this.f13519c = c0Var;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        c0 c0Var = this.f13519c;
        y3.e.I(i10, c0Var.f13523n);
        int i11 = i10 * 2;
        int i12 = c0Var.f13522f;
        Object[] objArr = c0Var.f13521e;
        Object obj = objArr[i11 + i12];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + (i12 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // r6.l
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13519c.f13523n;
    }
}
