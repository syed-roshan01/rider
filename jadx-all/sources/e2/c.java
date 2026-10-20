package e2;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f5088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f5089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5090c;

    public final int a(int i10, Object obj) {
        int i11 = this.f5090c;
        if (i11 == 0) {
            return -1;
        }
        int iA = a.a(i11, i10, this.f5088a);
        if (iA < 0 || d7.a.d(obj, this.f5089b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f5088a[i12] == i10) {
            if (d7.a.d(obj, this.f5089b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f5088a[i13] == i10; i13--) {
            if (d7.a.d(obj, this.f5089b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int b() {
        int i10 = this.f5090c;
        if (i10 == 0) {
            return -1;
        }
        int iA = a.a(i10, 0, this.f5088a);
        if (iA < 0 || this.f5089b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f5088a[i11] == 0) {
            if (this.f5089b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f5088a[i12] == 0; i12--) {
            if (this.f5089b[i12 << 1] == null) {
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
            if (!(obj instanceof c)) {
                if (!(obj instanceof Map) || this.f5090c != ((Map) obj).size()) {
                    return false;
                }
                int i10 = this.f5090c;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object[] objArr = this.f5089b;
                    int i12 = i11 << 1;
                    Object obj2 = objArr[i12];
                    Object obj3 = objArr[i12 + 1];
                    Object obj4 = ((Map) obj).get(obj2);
                    if (obj3 == null) {
                        if (obj4 != null || !((Map) obj).containsKey(obj2)) {
                            return false;
                        }
                    } else if (!d7.a.d(obj3, obj4)) {
                        return false;
                    }
                }
                return true;
            }
            c cVar = (c) obj;
            int i13 = this.f5090c;
            if (i13 != cVar.f5090c) {
                return false;
            }
            for (int i14 = 0; i14 < i13; i14++) {
                Object[] objArr2 = this.f5089b;
                int i15 = i14 << 1;
                Object obj5 = objArr2[i15];
                Object obj6 = objArr2[i15 + 1];
                int iB = obj5 == null ? cVar.b() : cVar.a(obj5.hashCode(), obj5);
                Object obj7 = iB >= 0 ? cVar.f5089b[(iB << 1) + 1] : null;
                if (obj6 == null) {
                    if (obj7 == null) {
                        if ((obj5 == null ? cVar.b() : cVar.a(obj5.hashCode(), obj5)) >= 0) {
                        }
                    }
                    return false;
                }
                if (!d7.a.d(obj6, obj7)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f5088a;
        Object[] objArr = this.f5089b;
        int i10 = this.f5090c;
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

    public final String toString() {
        int i10 = this.f5090c;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i10 * 28);
        sb.append('{');
        int i11 = this.f5090c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb.append(", ");
            }
            int i13 = i12 << 1;
            Object obj = this.f5089b[i13];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f5089b[i13 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
