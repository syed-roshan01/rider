package r6;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient p f13568c;

    public n(p pVar) {
        this.f13568c = pVar;
    }

    @Override // r6.p, r6.l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f13568c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        p pVar = this.f13568c;
        y3.e.I(i10, pVar.size());
        return pVar.get((pVar.size() - 1) - i10);
    }

    @Override // r6.p, java.util.List
    public final int indexOf(Object obj) {
        p pVar = this.f13568c;
        int iLastIndexOf = pVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (pVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // r6.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // r6.p, java.util.List
    public final int lastIndexOf(Object obj) {
        p pVar = this.f13568c;
        int iIndexOf = pVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (pVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // r6.p, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // r6.l
    public final boolean n() {
        return this.f13568c.n();
    }

    @Override // r6.p
    public final p q() {
        return this.f13568c;
    }

    @Override // r6.p, java.util.List
    /* JADX INFO: renamed from: r */
    public final p subList(int i10, int i11) {
        p pVar = this.f13568c;
        y3.e.L(i10, i11, pVar.size());
        return pVar.subList(pVar.size() - i11, pVar.size() - i10).q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13568c.size();
    }

    @Override // r6.p, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
