package o0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import r8.p;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Set, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f12333b = new Object[16];

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        int i11 = this.f12332a;
        Object[] objArr = this.f12333b;
        if (i11 > 0) {
            i10 = i(obj);
            if (i10 >= 0) {
                return false;
            }
        } else {
            i10 = -1;
        }
        int i12 = -(i10 + 1);
        if (i11 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            b9.b.H(i12 + 1, i12, i11, objArr, objArr2);
            b9.b.L(objArr, objArr2, 0, i12, 6);
            this.f12333b = objArr2;
        } else {
            b9.b.H(i12 + 1, i12, i11, objArr, objArr);
        }
        this.f12333b[i12] = obj;
        this.f12332a++;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        b9.b.Q(this.f12333b);
        this.f12332a = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return obj != null && i(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e(d dVar) {
        Object[] objArr;
        int i10;
        Object obj;
        if (dVar.isEmpty()) {
            return;
        }
        Object[] objArr2 = this.f12333b;
        Object[] objArr3 = dVar.f12333b;
        int i11 = this.f12332a;
        int i12 = dVar.f12332a;
        int i13 = i11 + i12;
        boolean z10 = objArr2.length < i13;
        boolean z11 = i11 == 0 || System.identityHashCode(objArr2[i11 + (-1)]) < System.identityHashCode(objArr3[0]);
        if (!z10 && z11) {
            b9.b.H(i11, 0, i12, objArr3, objArr2);
            this.f12332a += i12;
            return;
        }
        if (z10) {
            objArr = new Object[i11 > i12 ? i11 * 2 : i12 * 2];
        } else {
            objArr = objArr2;
        }
        int i14 = i11 - 1;
        int i15 = i12 - 1;
        int i16 = i13 - 1;
        while (true) {
            if (i14 < 0 && i15 < 0) {
                break;
            }
            if (i14 < 0) {
                i10 = i15 - 1;
                obj = objArr3[i15];
            } else if (i15 < 0) {
                i10 = i15;
                obj = objArr2[i14];
                i14--;
            } else {
                Object obj2 = objArr2[i14];
                Object obj3 = objArr3[i15];
                int iIdentityHashCode = System.identityHashCode(obj2);
                int iIdentityHashCode2 = System.identityHashCode(obj3);
                if (iIdentityHashCode > iIdentityHashCode2) {
                    i14--;
                } else {
                    if (iIdentityHashCode >= iIdentityHashCode2) {
                        if (obj2 == obj3) {
                            i14--;
                            i15--;
                        } else {
                            int i17 = i14 - 1;
                            while (true) {
                                if (i17 >= 0) {
                                    int i18 = i17 - 1;
                                    Object obj4 = objArr2[i17];
                                    if (System.identityHashCode(obj4) == iIdentityHashCode2) {
                                        if (obj3 == obj4) {
                                            i15--;
                                        } else {
                                            i17 = i18;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i10 = i15 - 1;
                    obj = obj3;
                }
                i10 = i15;
                obj = obj2;
            }
            objArr[i16] = obj;
            i15 = i10;
            i16--;
        }
        if (i16 >= 0) {
            b9.b.H(0, i16 + 1, i13, objArr, objArr);
        }
        int i19 = i13 - (i16 + 1);
        b9.b.O(i19, i13, objArr);
        this.f12333b = objArr;
        this.f12332a = i19;
    }

    public final int i(Object obj) {
        int i10 = this.f12332a - 1;
        int iIdentityHashCode = System.identityHashCode(obj);
        Object[] objArr = this.f12333b;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = objArr[i12];
            int iIdentityHashCode2 = System.identityHashCode(obj2);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i11 = i12 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    if (obj2 == obj) {
                        return i12;
                    }
                    Object[] objArr2 = this.f12333b;
                    int i13 = this.f12332a;
                    for (int i14 = i12 - 1; -1 < i14; i14--) {
                        Object obj3 = objArr2[i14];
                        if (obj3 == obj) {
                            return i14;
                        }
                        if (System.identityHashCode(obj3) != iIdentityHashCode) {
                            break;
                        }
                    }
                    for (int i15 = i12 + 1; i15 < i13; i15++) {
                        Object obj4 = objArr2[i15];
                        if (obj4 == obj) {
                            return i15;
                        }
                        if (System.identityHashCode(obj4) != iIdentityHashCode) {
                            return -(i15 + 1);
                        }
                    }
                    return -(i13 + 1);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f12332a == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this, 0);
    }

    public final boolean k() {
        return this.f12332a > 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        int i10 = i(obj);
        Object[] objArr = this.f12333b;
        int i11 = this.f12332a;
        if (i10 < 0) {
            return false;
        }
        int i12 = i11 - 1;
        if (i10 < i12) {
            b9.b.H(i10, i10 + 1, i11, objArr, objArr);
        }
        objArr[i12] = null;
        this.f12332a--;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12332a;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return d9.i.v(this);
    }

    public final String toString() {
        return p.K0(this, null, "[", "]", c.f12331a, 25);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d9.i.w(this, objArr);
    }
}
