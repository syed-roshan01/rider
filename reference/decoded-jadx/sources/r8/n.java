package r8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends m {
    public static void A0(Iterable iterable, Collection collection) {
        d7.a.m(collection, "<this>");
        d7.a.m(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final boolean B0(Iterable iterable, c9.c cVar) {
        Iterator it = iterable.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (((Boolean) cVar.invoke(it.next())).booleanValue()) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static void C0(ArrayList arrayList, c9.c cVar) {
        int iY;
        d7.a.m(arrayList, "<this>");
        int i10 = 0;
        i9.f it = new i9.g(0, d7.t.Y(arrayList), 1).iterator();
        while (it.f8188c) {
            int iB = it.b();
            Object obj = arrayList.get(iB);
            if (!((Boolean) cVar.invoke(obj)).booleanValue()) {
                if (i10 != iB) {
                    arrayList.set(i10, obj);
                }
                i10++;
            }
        }
        if (i10 >= arrayList.size() || i10 > (iY = d7.t.Y(arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(iY);
            if (iY == i10) {
                return;
            } else {
                iY--;
            }
        }
    }
}
