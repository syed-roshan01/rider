package r8;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class l extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f13654d = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f13656b = f13654d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13657c;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d7.a.m(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        n(collection.size() + e());
        k(p(e() + this.f13655a), collection);
        return true;
    }

    public final void addLast(Object obj) {
        n(e() + 1);
        this.f13656b[p(e() + this.f13655a)] = obj;
        this.f13657c = e() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iP = p(this.f13657c + this.f13655a);
        int i10 = this.f13655a;
        if (i10 < iP) {
            b9.b.O(i10, iP, this.f13656b);
        } else if (!isEmpty()) {
            Object[] objArr = this.f13656b;
            b9.b.O(this.f13655a, objArr.length, objArr);
            b9.b.O(0, iP, this.f13656b);
        }
        this.f13655a = 0;
        this.f13657c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // r8.g
    public final int e() {
        return this.f13657c;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f13656b[this.f13655a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int iE = e();
        if (i10 < 0 || i10 >= iE) {
            throw new IndexOutOfBoundsException(l.q.i("index: ", i10, ", size: ", iE));
        }
        return this.f13656b[p(this.f13655a + i10)];
    }

    @Override // r8.g
    public final Object i(int i10) {
        int i11 = this.f13657c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(l.q.i("index: ", i10, ", size: ", i11));
        }
        if (i10 == d7.t.Y(this)) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            int iP = p(d7.t.Y(this) + this.f13655a);
            Object[] objArr = this.f13656b;
            Object obj = objArr[iP];
            objArr[iP] = null;
            this.f13657c--;
            return obj;
        }
        if (i10 == 0) {
            return removeFirst();
        }
        int iP2 = p(this.f13655a + i10);
        Object[] objArr2 = this.f13656b;
        Object obj2 = objArr2[iP2];
        if (i10 < (this.f13657c >> 1)) {
            int i12 = this.f13655a;
            if (iP2 >= i12) {
                b9.b.H(i12 + 1, i12, iP2, objArr2, objArr2);
            } else {
                b9.b.H(1, 0, iP2, objArr2, objArr2);
                Object[] objArr3 = this.f13656b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i13 = this.f13655a;
                b9.b.H(i13 + 1, i13, objArr3.length - 1, objArr3, objArr3);
            }
            Object[] objArr4 = this.f13656b;
            int i14 = this.f13655a;
            objArr4[i14] = null;
            this.f13655a = o(i14);
        } else {
            int iP3 = p(d7.t.Y(this) + this.f13655a);
            if (iP2 <= iP3) {
                Object[] objArr5 = this.f13656b;
                b9.b.H(iP2, iP2 + 1, iP3 + 1, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.f13656b;
                b9.b.H(iP2, iP2 + 1, objArr6.length, objArr6, objArr6);
                Object[] objArr7 = this.f13656b;
                objArr7[objArr7.length - 1] = objArr7[0];
                b9.b.H(0, 1, iP3 + 1, objArr7, objArr7);
            }
            this.f13656b[iP3] = null;
        }
        this.f13657c--;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int iP = p(e() + this.f13655a);
        int length = this.f13655a;
        if (length < iP) {
            while (length < iP) {
                if (d7.a.d(obj, this.f13656b[length])) {
                    i10 = this.f13655a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iP) {
            return -1;
        }
        int length2 = this.f13656b.length;
        while (length < length2) {
            if (d7.a.d(obj, this.f13656b[length])) {
                i10 = this.f13655a;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iP; i11++) {
            if (d7.a.d(obj, this.f13656b[i11])) {
                length = i11 + this.f13656b.length;
                i10 = this.f13655a;
            }
        }
        return -1;
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return e() == 0;
    }

    public final void k(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f13656b.length;
        while (i10 < length && it.hasNext()) {
            this.f13656b[i10] = it.next();
            i10++;
        }
        int i11 = this.f13655a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f13656b[i12] = it.next();
        }
        this.f13657c = collection.size() + e();
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f13656b[p(d7.t.Y(this) + this.f13655a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int iP = p(this.f13657c + this.f13655a);
        int i11 = this.f13655a;
        if (i11 < iP) {
            length = iP - 1;
            if (i11 <= length) {
                while (!d7.a.d(obj, this.f13656b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f13655a;
                return length - i10;
            }
            return -1;
        }
        if (i11 > iP) {
            for (int i12 = iP - 1; -1 < i12; i12--) {
                if (d7.a.d(obj, this.f13656b[i12])) {
                    length = i12 + this.f13656b.length;
                    i10 = this.f13655a;
                    return length - i10;
                }
            }
            Object[] objArr = this.f13656b;
            d7.a.m(objArr, "<this>");
            length = objArr.length - 1;
            int i13 = this.f13655a;
            if (i13 <= length) {
                while (!d7.a.d(obj, this.f13656b[length])) {
                    if (length != i13) {
                        length--;
                    }
                }
                i10 = this.f13655a;
                return length - i10;
            }
        }
        return -1;
    }

    public final void n(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f13656b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f13654d) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f13656b = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        b9.b.H(0, this.f13655a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f13656b;
        int length2 = objArr3.length;
        int i12 = this.f13655a;
        b9.b.H(length2 - i12, 0, i12, objArr3, objArr2);
        this.f13655a = 0;
        this.f13656b = objArr2;
    }

    public final int o(int i10) {
        Object[] objArr = this.f13656b;
        d7.a.m(objArr, "<this>");
        if (i10 == objArr.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final int p(int i10) {
        Object[] objArr = this.f13656b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        i(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iP;
        d7.a.m(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f13656b.length != 0) {
            int iP2 = p(this.f13657c + this.f13655a);
            int i10 = this.f13655a;
            if (i10 < iP2) {
                iP = i10;
                while (i10 < iP2) {
                    Object obj = this.f13656b[i10];
                    if (!collection.contains(obj)) {
                        this.f13656b[iP] = obj;
                        iP++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                b9.b.O(iP, iP2, this.f13656b);
            } else {
                int length = this.f13656b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f13656b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (!collection.contains(obj2)) {
                        this.f13656b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iP = p(i11);
                for (int i12 = 0; i12 < iP2; i12++) {
                    Object[] objArr2 = this.f13656b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (!collection.contains(obj3)) {
                        this.f13656b[iP] = obj3;
                        iP = o(iP);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                int length2 = iP - this.f13655a;
                if (length2 < 0) {
                    length2 += this.f13656b.length;
                }
                this.f13657c = length2;
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f13656b;
        int i10 = this.f13655a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f13655a = o(i10);
        this.f13657c = e() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iP;
        d7.a.m(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f13656b.length != 0) {
            int iP2 = p(this.f13657c + this.f13655a);
            int i10 = this.f13655a;
            if (i10 < iP2) {
                iP = i10;
                while (i10 < iP2) {
                    Object obj = this.f13656b[i10];
                    if (collection.contains(obj)) {
                        this.f13656b[iP] = obj;
                        iP++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                b9.b.O(iP, iP2, this.f13656b);
            } else {
                int length = this.f13656b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f13656b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (collection.contains(obj2)) {
                        this.f13656b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iP = p(i11);
                for (int i12 = 0; i12 < iP2; i12++) {
                    Object[] objArr2 = this.f13656b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (collection.contains(obj3)) {
                        this.f13656b[iP] = obj3;
                        iP = o(iP);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                int length2 = iP - this.f13655a;
                if (length2 < 0) {
                    length2 += this.f13656b.length;
                }
                this.f13657c = length2;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iE = e();
        if (i10 < 0 || i10 >= iE) {
            throw new IndexOutOfBoundsException(l.q.i("index: ", i10, ", size: ", iE));
        }
        int iP = p(this.f13655a + i10);
        Object[] objArr = this.f13656b;
        Object obj2 = objArr[iP];
        objArr[iP] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[e()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int length;
        int i11 = this.f13657c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(l.q.i("index: ", i10, ", size: ", i11));
        }
        if (i10 == i11) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            n(i11 + 1);
            int length2 = this.f13655a;
            if (length2 == 0) {
                Object[] objArr = this.f13656b;
                d7.a.m(objArr, "<this>");
                length2 = objArr.length;
            }
            int i12 = length2 - 1;
            this.f13655a = i12;
            this.f13656b[i12] = obj;
            this.f13657c++;
            return;
        }
        n(i11 + 1);
        int iP = p(this.f13655a + i10);
        int i13 = this.f13657c;
        if (i10 < ((i13 + 1) >> 1)) {
            if (iP == 0) {
                Object[] objArr2 = this.f13656b;
                d7.a.m(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = iP - 1;
            }
            int length3 = this.f13655a;
            if (length3 == 0) {
                Object[] objArr3 = this.f13656b;
                d7.a.m(objArr3, "<this>");
                length3 = objArr3.length;
            }
            int i14 = length3 - 1;
            int i15 = this.f13655a;
            if (length >= i15) {
                Object[] objArr4 = this.f13656b;
                objArr4[i14] = objArr4[i15];
                b9.b.H(i15, i15 + 1, length + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f13656b;
                b9.b.H(i15 - 1, i15, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f13656b;
                objArr6[objArr6.length - 1] = objArr6[0];
                b9.b.H(0, 1, length + 1, objArr6, objArr6);
            }
            this.f13656b[length] = obj;
            this.f13655a = i14;
        } else {
            int iP2 = p(i13 + this.f13655a);
            if (iP < iP2) {
                Object[] objArr7 = this.f13656b;
                b9.b.H(iP + 1, iP, iP2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f13656b;
                b9.b.H(1, 0, iP2, objArr8, objArr8);
                Object[] objArr9 = this.f13656b;
                objArr9[0] = objArr9[objArr9.length - 1];
                b9.b.H(iP + 1, iP, objArr9.length - 1, objArr9, objArr9);
            }
            this.f13656b[iP] = obj;
        }
        this.f13657c++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        d7.a.m(objArr, "array");
        int length = objArr.length;
        int i10 = this.f13657c;
        if (length < i10) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i10);
            d7.a.k(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iP = p(this.f13657c + this.f13655a);
        int i11 = this.f13655a;
        if (i11 < iP) {
            b9.b.L(this.f13656b, objArr, i11, iP, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f13656b;
            b9.b.H(0, this.f13655a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f13656b;
            b9.b.H(objArr3.length - this.f13655a, 0, iP, objArr3, objArr);
        }
        int i12 = this.f13657c;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        d7.a.m(collection, "elements");
        int i11 = this.f13657c;
        if (i10 >= 0 && i10 <= i11) {
            if (collection.isEmpty()) {
                return false;
            }
            int i12 = this.f13657c;
            if (i10 == i12) {
                return addAll(collection);
            }
            n(collection.size() + i12);
            int iP = p(this.f13657c + this.f13655a);
            int iP2 = p(this.f13655a + i10);
            int size = collection.size();
            if (i10 < ((this.f13657c + 1) >> 1)) {
                int i13 = this.f13655a;
                int length = i13 - size;
                if (iP2 < i13) {
                    Object[] objArr = this.f13656b;
                    b9.b.H(length, i13, objArr.length, objArr, objArr);
                    if (size >= iP2) {
                        Object[] objArr2 = this.f13656b;
                        b9.b.H(objArr2.length - size, 0, iP2, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f13656b;
                        b9.b.H(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f13656b;
                        b9.b.H(0, size, iP2, objArr4, objArr4);
                    }
                } else if (length >= 0) {
                    Object[] objArr5 = this.f13656b;
                    b9.b.H(length, i13, iP2, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f13656b;
                    length += objArr6.length;
                    int i14 = iP2 - i13;
                    int length2 = objArr6.length - length;
                    if (length2 >= i14) {
                        b9.b.H(length, i13, iP2, objArr6, objArr6);
                    } else {
                        b9.b.H(length, i13, i13 + length2, objArr6, objArr6);
                        Object[] objArr7 = this.f13656b;
                        b9.b.H(0, this.f13655a + length2, iP2, objArr7, objArr7);
                    }
                }
                this.f13655a = length;
                int length3 = iP2 - size;
                if (length3 < 0) {
                    length3 += this.f13656b.length;
                }
                k(length3, collection);
            } else {
                int i15 = iP2 + size;
                if (iP2 < iP) {
                    int i16 = size + iP;
                    Object[] objArr8 = this.f13656b;
                    if (i16 <= objArr8.length) {
                        b9.b.H(i15, iP2, iP, objArr8, objArr8);
                    } else if (i15 >= objArr8.length) {
                        b9.b.H(i15 - objArr8.length, iP2, iP, objArr8, objArr8);
                    } else {
                        int length4 = iP - (i16 - objArr8.length);
                        b9.b.H(0, length4, iP, objArr8, objArr8);
                        Object[] objArr9 = this.f13656b;
                        b9.b.H(i15, iP2, length4, objArr9, objArr9);
                    }
                } else {
                    Object[] objArr10 = this.f13656b;
                    b9.b.H(size, 0, iP, objArr10, objArr10);
                    Object[] objArr11 = this.f13656b;
                    if (i15 >= objArr11.length) {
                        b9.b.H(i15 - objArr11.length, iP2, objArr11.length, objArr11, objArr11);
                    } else {
                        b9.b.H(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                        Object[] objArr12 = this.f13656b;
                        b9.b.H(i15, iP2, objArr12.length - size, objArr12, objArr12);
                    }
                }
                k(iP2, collection);
            }
            return true;
        }
        throw new IndexOutOfBoundsException(l.q.i("index: ", i10, ", size: ", i11));
    }
}
