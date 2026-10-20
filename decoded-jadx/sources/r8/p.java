package r8;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends n {
    public static boolean D0(Iterable iterable, Object obj) {
        int iIndexOf;
        d7.a.m(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            int i10 = 0;
            for (Object obj2 : iterable) {
                if (i10 < 0) {
                    d7.t.u0();
                    throw null;
                }
                if (d7.a.d(obj, obj2)) {
                    iIndexOf = i10;
                } else {
                    i10++;
                }
            }
            return false;
        }
        iIndexOf = ((List) iterable).indexOf(obj);
        return iIndexOf >= 0;
    }

    public static Object E0(Iterable iterable) {
        d7.a.m(iterable, "<this>");
        if (iterable instanceof List) {
            return F0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object F0(List list) {
        d7.a.m(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object G0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object H0(List list) {
        d7.a.m(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void I0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, c9.c cVar) {
        d7.a.m(iterable, "<this>");
        d7.a.m(charSequence, "separator");
        d7.a.m(charSequence2, "prefix");
        d7.a.m(charSequence3, "postfix");
        d7.a.m(charSequence4, "truncated");
        sb.append(charSequence2);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                sb.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            } else {
                z6.a.b(sb, obj, cVar);
            }
        }
        if (i10 >= 0 && i11 > i10) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String K0(Iterable iterable, String str, String str2, String str3, c9.c cVar, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i10 & 2) != 0 ? "" : str2;
        String str6 = (i10 & 4) != 0 ? "" : str3;
        int i11 = (i10 & 8) != 0 ? -1 : 0;
        CharSequence charSequence = (i10 & 16) != 0 ? "..." : null;
        c9.c cVar2 = (i10 & 32) != 0 ? null : cVar;
        d7.a.m(iterable, "<this>");
        d7.a.m(str4, "separator");
        d7.a.m(str5, "prefix");
        d7.a.m(str6, "postfix");
        d7.a.m(charSequence, "truncated");
        StringBuilder sb = new StringBuilder();
        I0(iterable, sb, str4, str5, str6, i11, charSequence, cVar2);
        String string = sb.toString();
        d7.a.l(string, "toString(...)");
        return string;
    }

    public static Object L0(List list) {
        d7.a.m(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(d7.t.Y(list));
    }

    public static Object M0(List list) {
        d7.a.m(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Double N0(Iterable iterable) {
        d7.a.m(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static ArrayList O0(Iterable iterable, q8.a aVar) {
        d7.a.m(iterable, "<this>");
        ArrayList arrayList = new ArrayList(f9.a.y0(iterable));
        boolean z10 = false;
        for (Object obj : iterable) {
            boolean z11 = true;
            if (!z10 && d7.a.d(obj, aVar)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList P0(Iterable iterable, Collection collection) {
        d7.a.m(collection, "<this>");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            n.A0(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList Q0(Collection collection, Object obj) {
        d7.a.m(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List R0(Iterable iterable, t1.p pVar) {
        d7.a.m(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listZ0 = Z0(iterable);
            m.z0(listZ0, pVar);
            return listZ0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return W0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        d7.a.m(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, pVar);
        }
        return b9.b.E(array);
    }

    public static List S0(Iterable iterable, int i10) {
        d7.a.m(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(l.q.h("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return r.f13661a;
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return W0(iterable);
            }
            if (i10 == 1) {
                return d7.t.d0(E0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return d7.t.j0(arrayList);
    }

    public static byte[] T0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = ((Number) it.next()).byteValue();
            i10++;
        }
        return bArr;
    }

    public static final void U0(Iterable iterable, AbstractCollection abstractCollection) {
        d7.a.m(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] V0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List W0(Iterable iterable) {
        d7.a.m(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return d7.t.j0(Z0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return r.f13661a;
        }
        if (size != 1) {
            return Y0(collection);
        }
        return d7.t.d0(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static long[] X0(Collection collection) {
        d7.a.m(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Number) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public static ArrayList Y0(Collection collection) {
        d7.a.m(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List Z0(Iterable iterable) {
        d7.a.m(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Y0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        U0(iterable, arrayList);
        return arrayList;
    }

    public static Set a1(Iterable iterable) {
        d7.a.m(iterable, "<this>");
        boolean z10 = iterable instanceof Collection;
        t tVar = t.f13663a;
        if (!z10) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            U0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return tVar;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set setSingleton = Collections.singleton(linkedHashSet.iterator().next());
            d7.a.l(setSingleton, "singleton(...)");
            return setSingleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return tVar;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(z6.a.T(collection.size()));
            U0(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set setSingleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        d7.a.l(setSingleton2, "singleton(...)");
        return setSingleton2;
    }
}
