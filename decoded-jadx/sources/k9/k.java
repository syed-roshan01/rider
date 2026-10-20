package k9;

import d7.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r8.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends l {
    public static Object G0(f fVar) {
        e eVar = new e(fVar);
        if (eVar.hasNext()) {
            return eVar.next();
        }
        return null;
    }

    public static f H0(i iVar, c9.c cVar) {
        return new f(new h(iVar, cVar));
    }

    public static List I0(i iVar) {
        Iterator it = iVar.iterator();
        if (!it.hasNext()) {
            return r.f13661a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return t.d0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
