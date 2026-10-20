package t1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class v implements List, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f14561a = new Object[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f14562b = new long[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14563c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14564d;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f14563c = -1;
        k();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof y0.n) && indexOf((y0.n) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((y0.n) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final long e() {
        long jA = g.a(Float.POSITIVE_INFINITY, false);
        int i10 = this.f14563c + 1;
        int iY = d7.t.Y(this);
        if (i10 <= iY) {
            while (true) {
                long j10 = this.f14562b[i10];
                if (g.o(j10, jA) < 0) {
                    jA = j10;
                }
                if (Float.intBitsToFloat((int) (jA >> 32)) < 0.0f && ((int) (4294967295L & jA)) != 0) {
                    return jA;
                }
                if (i10 != iY) {
                    i10++;
                }
            }
        }
        return jA;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object obj = this.f14561a[i10];
        d7.a.k(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (y0.n) obj;
    }

    public final void i(y0.n nVar, float f10, boolean z10, c9.a aVar) {
        int i10 = this.f14563c;
        int i11 = i10 + 1;
        this.f14563c = i11;
        Object[] objArr = this.f14561a;
        if (i11 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
            this.f14561a = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.f14562b, length);
            d7.a.l(jArrCopyOf, "copyOf(this, newSize)");
            this.f14562b = jArrCopyOf;
        }
        Object[] objArr2 = this.f14561a;
        int i12 = this.f14563c;
        objArr2[i12] = nVar;
        this.f14562b[i12] = g.a(f10, z10);
        k();
        aVar.invoke();
        this.f14563c = i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof y0.n)) {
            return -1;
        }
        y0.n nVar = (y0.n) obj;
        int iY = d7.t.Y(this);
        if (iY < 0) {
            return -1;
        }
        int i10 = 0;
        while (!d7.a.d(this.f14561a[i10], nVar)) {
            if (i10 == iY) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f14564d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new w0.c0(this, 0, 7);
    }

    public final void k() {
        int i10 = this.f14563c + 1;
        int iY = d7.t.Y(this);
        if (i10 <= iY) {
            while (true) {
                this.f14561a[i10] = null;
                if (i10 == iY) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f14564d = this.f14563c + 1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof y0.n)) {
            return -1;
        }
        y0.n nVar = (y0.n) obj;
        for (int iY = d7.t.Y(this); -1 < iY; iY--) {
            if (d7.a.d(this.f14561a[iY], nVar)) {
                return iY;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new w0.c0(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f14564d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        return new u(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return d9.i.v(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new w0.c0(this, i10, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d9.i.w(this, objArr);
    }
}
