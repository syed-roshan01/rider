package r8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends z6.a {
    public static Object B0(Object obj, Map map) {
        d7.a.m(map, "<this>");
        if (map instanceof u) {
            return ((u) map).g();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap C0(q8.f... fVarArr) {
        HashMap map = new HashMap(z6.a.T(fVarArr.length));
        E0(map, fVarArr);
        return map;
    }

    public static Map D0(q8.f... fVarArr) {
        if (fVarArr.length <= 0) {
            return s.f13662a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z6.a.T(fVarArr.length));
        E0(linkedHashMap, fVarArr);
        return linkedHashMap;
    }

    public static final void E0(HashMap map, q8.f[] fVarArr) {
        for (q8.f fVar : fVarArr) {
            map.put(fVar.f13225a, fVar.f13226b);
        }
    }

    public static Map F0(ArrayList arrayList) {
        s sVar = s.f13662a;
        int size = arrayList.size();
        if (size == 0) {
            return sVar;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(z6.a.T(arrayList.size()));
            H0(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        q8.f fVar = (q8.f) arrayList.get(0);
        d7.a.m(fVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(fVar.f13225a, fVar.f13226b);
        d7.a.l(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map G0(Map map) {
        d7.a.m(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? I0(map) : z6.a.o0(map);
        }
        return s.f13662a;
    }

    public static final void H0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q8.f fVar = (q8.f) it.next();
            linkedHashMap.put(fVar.f13225a, fVar.f13226b);
        }
    }

    public static LinkedHashMap I0(Map map) {
        d7.a.m(map, "<this>");
        return new LinkedHashMap(map);
    }
}
