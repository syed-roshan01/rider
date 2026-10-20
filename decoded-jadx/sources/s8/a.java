package s8;

import b9.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import l.q;
import q8.k;
import r8.g;
import w0.c0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f14062n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f14063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f14067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f14068f;

    static {
        a aVar = new a(0);
        aVar.f14066d = true;
        f14062n = aVar;
    }

    public a(Object[] objArr, int i10, int i11, boolean z10, a aVar, a aVar2) {
        this.f14063a = objArr;
        this.f14064b = i10;
        this.f14065c = i11;
        this.f14066d = z10;
        this.f14067e = aVar;
        this.f14068f = aVar2;
        if (aVar != null) {
            ((AbstractList) this).modCount = ((AbstractList) aVar).modCount;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        q();
        p();
        o(this.f14064b + this.f14065c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d7.a.m(collection, "elements");
        q();
        p();
        int size = collection.size();
        n(this.f14064b + this.f14065c, size, collection);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        q();
        p();
        t(this.f14064b, this.f14065c);
    }

    @Override // r8.g
    public final int e() {
        p();
        return this.f14065c;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        p();
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            Object[] objArr = this.f14063a;
            int i10 = this.f14065c;
            if (i10 != list.size()) {
                return false;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                if (!d7.a.d(objArr[this.f14064b + i11], list.get(i11))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        p();
        int i11 = this.f14065c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(q.i("index: ", i10, ", size: ", i11));
        }
        return this.f14063a[this.f14064b + i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        p();
        Object[] objArr = this.f14063a;
        int i10 = this.f14065c;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[this.f14064b + i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // r8.g
    public final Object i(int i10) {
        q();
        p();
        int i11 = this.f14065c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(q.i("index: ", i10, ", size: ", i11));
        }
        return s(this.f14064b + i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        p();
        for (int i10 = 0; i10 < this.f14065c; i10++) {
            if (d7.a.d(this.f14063a[this.f14064b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        p();
        return this.f14065c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        p();
        for (int i10 = this.f14065c - 1; i10 >= 0; i10--) {
            if (d7.a.d(this.f14063a[this.f14064b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void n(int i10, int i11, Collection collection) {
        ((AbstractList) this).modCount++;
        a aVar = this.f14067e;
        if (aVar != null) {
            aVar.n(i10, i11, collection);
            this.f14063a = aVar.f14063a;
            this.f14065c += i11;
        } else {
            r(i10, i11);
            Iterator it = collection.iterator();
            for (int i12 = 0; i12 < i11; i12++) {
                this.f14063a[i10 + i12] = it.next();
            }
        }
    }

    public final void o(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        a aVar = this.f14067e;
        if (aVar == null) {
            r(i10, 1);
            this.f14063a[i10] = obj;
        } else {
            aVar.o(i10, obj);
            this.f14063a = aVar.f14063a;
            this.f14065c++;
        }
    }

    public final void p() {
        a aVar = this.f14068f;
        if (aVar != null && ((AbstractList) aVar).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void q() {
        a aVar;
        if (this.f14066d || ((aVar = this.f14068f) != null && aVar.f14066d)) {
            throw new UnsupportedOperationException();
        }
    }

    public final void r(int i10, int i11) {
        int i12 = this.f14065c + i11;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f14063a;
        if (i12 > objArr.length) {
            int length = objArr.length;
            int i13 = length + (length >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            if (i13 - 2147483639 > 0) {
                i13 = i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i13);
            d7.a.l(objArrCopyOf, "copyOf(...)");
            this.f14063a = objArrCopyOf;
        }
        Object[] objArr2 = this.f14063a;
        b.H(i10 + i11, i10, this.f14064b + this.f14065c, objArr2, objArr2);
        this.f14065c += i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        q();
        p();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            i(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        d7.a.m(collection, "elements");
        q();
        p();
        return u(this.f14064b, this.f14065c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        d7.a.m(collection, "elements");
        q();
        p();
        return u(this.f14064b, this.f14065c, collection, true) > 0;
    }

    public final Object s(int i10) {
        ((AbstractList) this).modCount++;
        a aVar = this.f14067e;
        if (aVar != null) {
            Object objS = aVar.s(i10);
            this.f14065c--;
            return objS;
        }
        Object[] objArr = this.f14063a;
        Object obj = objArr[i10];
        int i11 = this.f14065c;
        int i12 = this.f14064b;
        b.H(i10, i10 + 1, i11 + i12, objArr, objArr);
        Object[] objArr2 = this.f14063a;
        int i13 = (i12 + this.f14065c) - 1;
        d7.a.m(objArr2, "<this>");
        objArr2[i13] = null;
        this.f14065c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        q();
        p();
        int i11 = this.f14065c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(q.i("index: ", i10, ", size: ", i11));
        }
        Object[] objArr = this.f14063a;
        int i12 = this.f14064b;
        Object obj2 = objArr[i12 + i10];
        objArr[i12 + i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        k.d(i10, i11, this.f14065c);
        Object[] objArr = this.f14063a;
        int i12 = this.f14064b + i10;
        int i13 = i11 - i10;
        boolean z10 = this.f14066d;
        a aVar = this.f14068f;
        return new a(objArr, i12, i13, z10, this, aVar == null ? this : aVar);
    }

    public final void t(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        a aVar = this.f14067e;
        if (aVar != null) {
            aVar.t(i10, i11);
        } else {
            Object[] objArr = this.f14063a;
            b.H(i10, i10 + i11, this.f14065c, objArr, objArr);
            Object[] objArr2 = this.f14063a;
            int i12 = this.f14065c;
            d7.a.m(objArr2, "<this>");
            for (int i13 = i12 - i11; i13 < i12; i13++) {
                objArr2[i13] = null;
            }
        }
        this.f14065c -= i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        d7.a.m(objArr, FirebaseAnalytics.Param.DESTINATION);
        p();
        int length = objArr.length;
        int i10 = this.f14065c;
        int i11 = this.f14064b;
        if (length < i10) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f14063a, i11, i10 + i11, objArr.getClass());
            d7.a.l(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        b.H(0, i11, i10 + i11, this.f14063a, objArr);
        int i12 = this.f14065c;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        p();
        Object[] objArr = this.f14063a;
        int i10 = this.f14065c;
        StringBuilder sb = new StringBuilder((i10 * 3) + 2);
        sb.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[this.f14064b + i11];
            if (obj == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        d7.a.l(string, "toString(...)");
        return string;
    }

    public final int u(int i10, int i11, Collection collection, boolean z10) {
        int iU;
        a aVar = this.f14067e;
        if (aVar != null) {
            iU = aVar.u(i10, i11, collection, z10);
        } else {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = i10 + i12;
                if (collection.contains(this.f14063a[i14]) == z10) {
                    Object[] objArr = this.f14063a;
                    i12++;
                    objArr[i13 + i10] = objArr[i14];
                    i13++;
                } else {
                    i12++;
                }
            }
            int i15 = i11 - i13;
            Object[] objArr2 = this.f14063a;
            b.H(i10 + i13, i11 + i10, this.f14065c, objArr2, objArr2);
            Object[] objArr3 = this.f14063a;
            int i16 = this.f14065c;
            d7.a.m(objArr3, "<this>");
            for (int i17 = i16 - i15; i17 < i16; i17++) {
                objArr3[i17] = null;
            }
            iU = i15;
        }
        if (iU > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f14065c -= iU;
        return iU;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        p();
        int i11 = this.f14065c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(q.i("index: ", i10, ", size: ", i11));
        }
        return new c0(this, i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i10) {
        this(new Object[i10], 0, 0, false, null, null);
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        q();
        p();
        int i11 = this.f14065c;
        if (i10 >= 0 && i10 <= i11) {
            o(this.f14064b + i10, obj);
            return;
        }
        throw new IndexOutOfBoundsException(q.i("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        d7.a.m(collection, "elements");
        q();
        p();
        int i11 = this.f14065c;
        if (i10 >= 0 && i10 <= i11) {
            int size = collection.size();
            n(this.f14064b + i10, size, collection);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(q.i("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        p();
        Object[] objArr = this.f14063a;
        int i10 = this.f14065c;
        int i11 = this.f14064b;
        return b.N(i11, i10 + i11, objArr);
    }
}
