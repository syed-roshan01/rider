package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class g implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f12038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f12039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f12040c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12041d = 0;

    public c e(Object obj) {
        c cVar = this.f12038a;
        while (cVar != null && !cVar.f12029a.equals(obj)) {
            cVar = cVar.f12031c;
        }
        return cVar;
    }

    public final boolean equals(Object obj) {
        e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f12041d != gVar.f12041d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = gVar.iterator();
        while (true) {
            eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (eVar.hasNext() || ((e) it2).hasNext()) ? false : true;
    }

    public Object g(Object obj) {
        c cVarE = e(obj);
        if (cVarE == null) {
            return null;
        }
        this.f12041d--;
        WeakHashMap weakHashMap = this.f12040c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(cVarE);
            }
        }
        c cVar = cVarE.f12032d;
        if (cVar != null) {
            cVar.f12031c = cVarE.f12031c;
        } else {
            this.f12038a = cVarE.f12031c;
        }
        c cVar2 = cVarE.f12031c;
        if (cVar2 != null) {
            cVar2.f12032d = cVar;
        } else {
            this.f12039b = cVar;
        }
        cVarE.f12031c = null;
        cVarE.f12032d = null;
        return cVarE.f12030b;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f12038a, this.f12039b, 0);
        this.f12040c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
