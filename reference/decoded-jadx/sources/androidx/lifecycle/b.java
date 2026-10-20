package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2109a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f2110b;

    public b(HashMap map) {
        this.f2110b = map;
        for (Map.Entry entry : map.entrySet()) {
            p pVar = (p) entry.getValue();
            List arrayList = (List) this.f2109a.get(pVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f2109a.put(pVar, arrayList);
            }
            arrayList.add((c) entry.getKey());
        }
    }

    public static void a(List list, w wVar, p pVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                cVar.getClass();
                try {
                    int i10 = cVar.f2115a;
                    Method method = cVar.f2116b;
                    if (i10 == 0) {
                        method.invoke(obj, new Object[0]);
                    } else if (i10 == 1) {
                        method.invoke(obj, wVar);
                    } else if (i10 == 2) {
                        method.invoke(obj, wVar, pVar);
                    }
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException(e4);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Failed to call observer method", e10.getCause());
                }
            }
        }
    }
}
