package r6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends l implements Set {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f13582c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient p f13583b;

    public static int o(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            y3.e.G("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static t p(int i10, Object... objArr) {
        if (i10 == 0) {
            return g0.f13545q;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new i0(obj);
        }
        int iO = o(i10);
        Object[] objArr2 = new Object[iO];
        int i11 = iO - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(l.q.g("at index ", i14));
            }
            int iHashCode = obj2.hashCode();
            int iH0 = z6.a.h0(iHashCode);
            while (true) {
                int i15 = iH0 & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iH0++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new i0(obj4);
        }
        if (o(i13) < iO / 2) {
            return p(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new g0(i12, i11, i13, objArr, objArr2);
    }

    public static t q(Collection collection) {
        if ((collection instanceof t) && !(collection instanceof SortedSet)) {
            t tVar = (t) collection;
            if (!tVar.n()) {
                return tVar;
            }
        }
        Object[] array = collection.toArray();
        return p(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof t) && (this instanceof g0)) {
            t tVar = (t) obj;
            tVar.getClass();
            if ((tVar instanceof g0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }
}
