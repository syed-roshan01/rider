package q;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f13043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f13044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13045c;

    public z() {
        this(0);
    }

    public final int a(Object obj) {
        int i10 = this.f13045c * 2;
        Object[] objArr = this.f13044b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (d7.a.d(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i10) {
        int i11 = this.f13045c;
        int[] iArr = this.f13043a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            d7.a.l(iArrCopyOf, "copyOf(this, newSize)");
            this.f13043a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f13044b, i10 * 2);
            d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
            this.f13044b = objArrCopyOf;
        }
        if (this.f13045c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i10, Object obj) {
        int i11 = this.f13045c;
        if (i11 == 0) {
            return -1;
        }
        int iA = r.a.a(i11, i10, this.f13043a);
        if (iA < 0 || d7.a.d(obj, this.f13044b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f13043a[i12] == i10) {
            if (d7.a.d(obj, this.f13044b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f13043a[i13] == i10; i13--) {
            if (d7.a.d(obj, this.f13044b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final void clear() {
        if (this.f13045c > 0) {
            this.f13043a = r.a.f13295a;
            this.f13044b = r.a.f13297c;
            this.f13045c = 0;
        }
        if (this.f13045c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i10 = this.f13045c;
        if (i10 == 0) {
            return -1;
        }
        int iA = r.a.a(i10, 0, this.f13043a);
        if (iA < 0 || this.f13044b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f13043a[i11] == 0) {
            if (this.f13044b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f13043a[i12] == 0; i12--) {
            if (this.f13044b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof z) {
                int i10 = this.f13045c;
                if (i10 != ((z) obj).f13045c) {
                    return false;
                }
                z zVar = (z) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objF = f(i11);
                    Object objJ = j(i11);
                    Object obj2 = zVar.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !zVar.containsKey(objF)) {
                            return false;
                        }
                    } else if (!d7.a.d(objJ, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f13045c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f13045c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objF2 = f(i13);
                Object objJ2 = j(i13);
                Object obj3 = ((Map) obj).get(objF2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!d7.a.d(objJ2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i10) {
        if (i10 < 0 || i10 >= this.f13045c) {
            throw new IllegalArgumentException(l.q.g("Expected index to be within 0..size()-1, but was ", i10).toString());
        }
        return this.f13044b[i10 << 1];
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f13044b[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f13044b[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f13045c)) {
            throw new IllegalArgumentException(l.q.g("Expected index to be within 0..size()-1, but was ", i10).toString());
        }
        Object[] objArr = this.f13044b;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
        } else {
            int i13 = i11 - 1;
            int[] iArr = this.f13043a;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    b9.b.G(i10, i14, i11, iArr, iArr);
                    Object[] objArr2 = this.f13044b;
                    b9.b.H(i12, i14 << 1, i11 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f13044b;
                int i15 = i13 << 1;
                objArr3[i15] = null;
                objArr3[i15 + 1] = null;
            } else {
                int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
                int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
                d7.a.l(iArrCopyOf, "copyOf(this, newSize)");
                this.f13043a = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.f13044b, i16 << 1);
                d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
                this.f13044b = objArrCopyOf;
                if (i11 != this.f13045c) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    b9.b.G(0, 0, i10, iArr, this.f13043a);
                    b9.b.H(0, 0, i12, objArr, this.f13044b);
                }
                if (i10 < i13) {
                    int i17 = i10 + 1;
                    b9.b.G(i10, i17, i11, iArr, this.f13043a);
                    b9.b.H(i12, i17 << 1, i11 << 1, objArr, this.f13044b);
                }
            }
            if (i11 != this.f13045c) {
                throw new ConcurrentModificationException();
            }
            this.f13045c = i13;
        }
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f13043a;
        Object[] objArr = this.f13044b;
        int i10 = this.f13045c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.f13045c) {
            throw new IllegalArgumentException(l.q.g("Expected index to be within 0..size()-1, but was ", i10).toString());
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f13044b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f13045c <= 0;
    }

    public final Object j(int i10) {
        if (i10 < 0 || i10 >= this.f13045c) {
            throw new IllegalArgumentException(l.q.g("Expected index to be within 0..size()-1, but was ", i10).toString());
        }
        return this.f13044b[(i10 << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i10 = this.f13045c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.f13044b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iC;
        int[] iArr = this.f13043a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            d7.a.l(iArrCopyOf, "copyOf(this, newSize)");
            this.f13043a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f13044b, i13 << 1);
            d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
            this.f13044b = objArrCopyOf;
            if (i10 != this.f13045c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f13043a;
            int i14 = i12 + 1;
            b9.b.G(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f13044b;
            b9.b.H(i14 << 1, i12 << 1, this.f13045c << 1, objArr2, objArr2);
        }
        int i15 = this.f13045c;
        if (i10 == i15) {
            int[] iArr3 = this.f13043a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f13044b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f13045c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return i(iD, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f13045c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f13045c * 28);
        sb.append('{');
        int i10 = this.f13045c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object objF = f(i11);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i11);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        d7.a.l(string, "StringBuilder(capacity).\u2026builderAction).toString()");
        return string;
    }

    public z(int i10) {
        this.f13043a = i10 == 0 ? r.a.f13295a : new int[i10];
        this.f13044b = i10 == 0 ? r.a.f13297c : new Object[i10 << 1];
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !d7.a.d(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !d7.a.d(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }
}
