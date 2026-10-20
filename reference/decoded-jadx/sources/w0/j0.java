package w0;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements ListIterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9.s f16075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f16076b;

    public j0(d9.s sVar, k0 k0Var) {
        this.f16075a = sVar;
        this.f16076b = k0Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        Object obj2 = v.f16125a;
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f16075a.f4950a < this.f16076b.f16081d - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f16075a.f4950a >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        d9.s sVar = this.f16075a;
        int i10 = sVar.f4950a + 1;
        k0 k0Var = this.f16076b;
        v.a(i10, k0Var.f16081d);
        sVar.f4950a = i10;
        return k0Var.get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f16075a.f4950a + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        d9.s sVar = this.f16075a;
        int i10 = sVar.f4950a;
        k0 k0Var = this.f16076b;
        v.a(i10, k0Var.f16081d);
        sVar.f4950a = i10 - 1;
        return k0Var.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f16075a.f4950a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        Object obj = v.f16125a;
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        Object obj2 = v.f16125a;
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }
}
