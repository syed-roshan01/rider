package s4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import r8.s;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Iterable, e9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f14037b = new o(s.f13662a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f14038a;

    public o(Map map) {
        this.f14038a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            if (d7.a.d(this.f14038a, ((o) obj).f14038a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14038a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f14038a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            a7.a.w(entry.getValue());
            arrayList.add(new q8.f(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f14038a + ')';
    }
}
