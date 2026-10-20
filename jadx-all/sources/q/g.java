package q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Collection, Set, e9.b, e9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f12990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f12991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12992c;

    public g(int i10) {
        this.f12990a = r.a.f13295a;
        this.f12991b = r.a.f13297c;
        if (i10 > 0) {
            d0.h(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int iM;
        int i11 = this.f12992c;
        if (obj == null) {
            iM = d0.M(this, null, 0);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iM = d0.M(this, obj, iHashCode);
        }
        if (iM >= 0) {
            return false;
        }
        int i12 = ~iM;
        int[] iArr = this.f12990a;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f12991b;
            d0.h(this, i13);
            if (i11 != this.f12992c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f12990a;
            if (!(iArr2.length == 0)) {
                b9.b.K(iArr, iArr2, iArr.length, 6);
                b9.b.L(objArr, this.f12991b, 0, objArr.length, 6);
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f12990a;
            int i14 = i12 + 1;
            b9.b.G(i14, i12, i11, iArr3, iArr3);
            Object[] objArr2 = this.f12991b;
            b9.b.H(i14, i12, i11, objArr2, objArr2);
        }
        int i15 = this.f12992c;
        if (i11 == i15) {
            int[] iArr4 = this.f12990a;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f12991b[i12] = obj;
                this.f12992c = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        d7.a.m(collection, "elements");
        int size = collection.size() + this.f12992c;
        int i10 = this.f12992c;
        int[] iArr = this.f12990a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f12991b;
            d0.h(this, size);
            int i11 = this.f12992c;
            if (i11 > 0) {
                b9.b.K(iArr, this.f12990a, i11, 6);
                b9.b.L(objArr, this.f12991b, 0, this.f12992c, 6);
            }
        }
        if (this.f12992c != i10) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f12992c != 0) {
            this.f12990a = r.a.f13295a;
            this.f12991b = r.a.f13297c;
            this.f12992c = 0;
        }
        if (this.f12992c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? d0.M(this, null, 0) : d0.M(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        d7.a.m(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object e(int i10) {
        int i11 = this.f12992c;
        Object[] objArr = this.f12991b;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
        } else {
            int i12 = i11 - 1;
            int[] iArr = this.f12990a;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    b9.b.G(i10, i13, i11, iArr, iArr);
                    Object[] objArr2 = this.f12991b;
                    b9.b.H(i10, i13, i11, objArr2, objArr2);
                }
                this.f12991b[i12] = null;
            } else {
                d0.h(this, i11 > 8 ? i11 + (i11 >> 1) : 8);
                if (i10 > 0) {
                    b9.b.K(iArr, this.f12990a, i10, 6);
                    b9.b.L(objArr, this.f12991b, 0, i10, 6);
                }
                if (i10 < i12) {
                    int i14 = i10 + 1;
                    b9.b.G(i10, i14, i11, iArr, this.f12990a);
                    b9.b.H(i10, i14, i11, objArr, this.f12991b);
                }
            }
            if (i11 != this.f12992c) {
                throw new ConcurrentModificationException();
            }
            this.f12992c = i12;
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f12992c == ((Set) obj).size()) {
            try {
                int i10 = this.f12992c;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (((Set) obj).contains(this.f12991b[i11])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f12990a;
        int i10 = this.f12992c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f12992c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM = obj == null ? d0.M(this, null, 0) : d0.M(this, obj, obj.hashCode());
        if (iM < 0) {
            return false;
        }
        e(iM);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        d7.a.m(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        d7.a.m(collection, "elements");
        boolean z10 = false;
        for (int i10 = this.f12992c - 1; -1 < i10; i10--) {
            if (!r8.p.D0(collection, this.f12991b[i10])) {
                e(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f12992c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        d7.a.m(objArr, "array");
        int i10 = this.f12992c;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        } else if (objArr.length > i10) {
            objArr[i10] = null;
        }
        b9.b.H(0, 0, this.f12992c, this.f12991b, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12992c * 14);
        sb.append('{');
        int i10 = this.f12992c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object obj = this.f12991b[i11];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        d7.a.l(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public g() {
        this(0);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return b9.b.N(0, this.f12992c, this.f12991b);
    }
}
