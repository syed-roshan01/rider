package w0;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements ListIterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f16049e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c0(t1.v vVar, int i10, int i11) {
        this(vVar, (i11 & 1) != 0 ? 0 : i10, 0, (i11 & 4) != 0 ? vVar.f14564d : 0);
        this.f16045a = 1;
    }

    public final void a() {
        if (((AbstractList) ((s8.a) this.f16049e)).modCount != this.f16048d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        Object obj2 = this.f16049e;
        switch (this.f16045a) {
            case 0:
                b();
                u uVar = (u) obj2;
                uVar.add(this.f16046b + 1, obj);
                this.f16047c = -1;
                this.f16046b++;
                this.f16048d = uVar.o();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                a();
                s8.a aVar = (s8.a) obj2;
                int i10 = this.f16046b;
                this.f16046b = i10 + 1;
                aVar.add(i10, obj);
                this.f16047c = -1;
                this.f16048d = ((AbstractList) aVar).modCount;
                return;
        }
    }

    public final void b() {
        if (((u) this.f16049e).o() != this.f16048d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        Object obj = this.f16049e;
        switch (this.f16045a) {
            case 0:
                return this.f16046b < ((u) obj).size() - 1;
            case 1:
                return this.f16046b < this.f16048d;
            default:
                return this.f16046b < ((s8.a) obj).f14065c;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f16045a) {
            case 0:
                return this.f16046b >= 0;
            case 1:
                return this.f16046b > this.f16047c;
            default:
                return this.f16046b > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        Object obj = this.f16049e;
        switch (this.f16045a) {
            case 0:
                b();
                int i10 = this.f16046b + 1;
                this.f16047c = i10;
                u uVar = (u) obj;
                v.a(i10, uVar.size());
                Object obj2 = uVar.get(i10);
                this.f16046b = i10;
                return obj2;
            case 1:
                Object[] objArr = ((t1.v) obj).f14561a;
                int i11 = this.f16046b;
                this.f16046b = i11 + 1;
                Object obj3 = objArr[i11];
                d7.a.k(obj3, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (y0.n) obj3;
            default:
                a();
                int i12 = this.f16046b;
                s8.a aVar = (s8.a) obj;
                if (i12 >= aVar.f14065c) {
                    throw new NoSuchElementException();
                }
                this.f16046b = i12 + 1;
                this.f16047c = i12;
                return aVar.f14063a[aVar.f14064b + i12];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f16045a) {
            case 0:
                return this.f16046b + 1;
            case 1:
                return this.f16046b - this.f16047c;
            default:
                return this.f16046b;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        Object obj = this.f16049e;
        switch (this.f16045a) {
            case 0:
                b();
                u uVar = (u) obj;
                v.a(this.f16046b, uVar.size());
                int i10 = this.f16046b;
                this.f16047c = i10;
                Object obj2 = uVar.get(i10);
                this.f16046b--;
                return obj2;
            case 1:
                Object[] objArr = ((t1.v) obj).f14561a;
                int i11 = this.f16046b - 1;
                this.f16046b = i11;
                Object obj3 = objArr[i11];
                d7.a.k(obj3, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (y0.n) obj3;
            default:
                a();
                int i12 = this.f16046b;
                if (i12 <= 0) {
                    throw new NoSuchElementException();
                }
                int i13 = i12 - 1;
                this.f16046b = i13;
                this.f16047c = i13;
                s8.a aVar = (s8.a) obj;
                return aVar.f14063a[aVar.f14064b + i13];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f16045a) {
            case 0:
                return this.f16046b;
            case 1:
                return (this.f16046b - this.f16047c) - 1;
            default:
                return this.f16046b - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        Object obj = this.f16049e;
        switch (this.f16045a) {
            case 0:
                b();
                u uVar = (u) obj;
                uVar.remove(this.f16046b);
                this.f16046b--;
                this.f16047c = -1;
                this.f16048d = uVar.o();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                a();
                int i10 = this.f16047c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                s8.a aVar = (s8.a) obj;
                aVar.i(i10);
                this.f16046b = this.f16047c;
                this.f16047c = -1;
                this.f16048d = ((AbstractList) aVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        Object obj2 = this.f16049e;
        switch (this.f16045a) {
            case 0:
                b();
                int i10 = this.f16047c;
                if (i10 < 0) {
                    Object obj3 = v.f16125a;
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()".toString());
                }
                u uVar = (u) obj2;
                uVar.set(i10, obj);
                this.f16048d = uVar.o();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                a();
                int i11 = this.f16047c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                ((s8.a) obj2).set(i11, obj);
                return;
        }
    }

    public c0(t1.v vVar, int i10, int i11, int i12) {
        this.f16045a = 1;
        this.f16049e = vVar;
        this.f16046b = i10;
        this.f16047c = i11;
        this.f16048d = i12;
    }

    public c0(u uVar, int i10) {
        this.f16045a = 0;
        this.f16049e = uVar;
        this.f16046b = i10 - 1;
        this.f16047c = -1;
        this.f16048d = uVar.o();
    }

    public c0(s8.a aVar, int i10) {
        this.f16045a = 2;
        d7.a.m(aVar, "list");
        this.f16049e = aVar;
        this.f16046b = i10;
        this.f16047c = -1;
        this.f16048d = ((AbstractList) aVar).modCount;
    }
}
