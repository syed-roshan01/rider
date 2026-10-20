package v0;

import d7.t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import r8.v;

/* JADX INFO: loaded from: classes.dex */
public final class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.c f15875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f15876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f15877c;

    public n(Map map, c9.c cVar) {
        this.f15875a = cVar;
        this.f15876b = map != null ? v.I0(map) : new LinkedHashMap();
        this.f15877c = new LinkedHashMap();
    }

    @Override // v0.l
    public final boolean a(Object obj) {
        return ((Boolean) this.f15875a.invoke(obj)).booleanValue();
    }

    @Override // v0.l
    public final Map b() {
        LinkedHashMap linkedHashMapI0 = v.I0(this.f15876b);
        for (Map.Entry entry : this.f15877c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object objInvoke = ((c9.a) list.get(0)).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!a(objInvoke)) {
                        throw new IllegalStateException("item can't be saved".toString());
                    }
                    linkedHashMapI0.put(str, t.D(objInvoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object objInvoke2 = ((c9.a) list.get(i10)).invoke();
                    if (objInvoke2 != null && !a(objInvoke2)) {
                        throw new IllegalStateException("item can't be saved".toString());
                    }
                    arrayList.add(objInvoke2);
                }
                linkedHashMapI0.put(str, arrayList);
            }
        }
        return linkedHashMapI0;
    }

    @Override // v0.l
    public final Object c(String str) {
        LinkedHashMap linkedHashMap = this.f15876b;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // v0.l
    public final m e(String str, c cVar) {
        if (!(!l9.i.R0(str))) {
            throw new IllegalArgumentException("Registered key is empty or blank".toString());
        }
        LinkedHashMap linkedHashMap = this.f15877c;
        Object arrayList = linkedHashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(str, arrayList);
        }
        ((List) arrayList).add(cVar);
        return new m(this, str, cVar);
    }
}
