package r0;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m extends r8.j implements p0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f13323a;

    public m(d dVar) {
        this.f13323a = dVar;
    }

    @Override // r8.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        Object key = entry.getKey();
        d dVar = this.f13323a;
        Object obj2 = dVar.get(key);
        if (obj2 != null) {
            return d7.a.d(obj2, entry.getValue());
        }
        return entry.getValue() == null && dVar.containsKey(entry.getKey());
    }

    @Override // r8.a
    public final int e() {
        d dVar = this.f13323a;
        dVar.getClass();
        return dVar.f13305b;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        r rVar = this.f13323a.f13304a;
        s[] sVarArr = new s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            sVarArr[i10] = new t();
        }
        return new n(rVar, sVarArr);
    }
}
