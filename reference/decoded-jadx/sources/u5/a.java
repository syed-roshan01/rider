package u5;

import android.util.SparseArray;
import i5.d;
import java.util.HashMap;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f15415a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f15416b;

    static {
        HashMap map = new HashMap();
        f15416b = map;
        map.put(d.f8066a, 0);
        map.put(d.f8067b, 1);
        map.put(d.f8068c, 2);
        for (d dVar : map.keySet()) {
            f15415a.append(((Integer) f15416b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f15416b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f15415a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(q.g("Unknown Priority for value ", i10));
    }
}
