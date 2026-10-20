package r6;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f13569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f13570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f13571e;

    public o(p pVar, int i10, int i11) {
        this.f13571e = pVar;
        this.f13569c = i10;
        this.f13570d = i11;
    }

    @Override // r6.l
    public final Object[] g() {
        return this.f13571e.g();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        y3.e.I(i10, this.f13570d);
        return this.f13571e.get(i10 + this.f13569c);
    }

    @Override // r6.l
    public final int i() {
        return this.f13571e.k() + this.f13569c + this.f13570d;
    }

    @Override // r6.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // r6.l
    public final int k() {
        return this.f13571e.k() + this.f13569c;
    }

    @Override // r6.p, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // r6.l
    public final boolean n() {
        return true;
    }

    @Override // r6.p, java.util.List
    /* JADX INFO: renamed from: r */
    public final p subList(int i10, int i11) {
        y3.e.L(i10, i11, this.f13570d);
        int i12 = this.f13569c;
        return this.f13571e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13570d;
    }

    @Override // r6.p, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
