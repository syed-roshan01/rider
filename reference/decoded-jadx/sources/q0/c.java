package q0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends r8.d implements p0.d {
    @Override // java.util.Collection, java.util.List, p0.d
    public p0.d addAll(Collection collection) {
        f fVarBuilder = builder();
        fVarBuilder.addAll(collection);
        return fVarBuilder.k();
    }

    @Override // r8.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // r8.a, java.util.Collection, java.util.List
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

    @Override // r8.d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // r8.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // r8.d, java.util.List
    public final List subList(int i10, int i11) {
        return new p0.a(this, i10, i11);
    }
}
