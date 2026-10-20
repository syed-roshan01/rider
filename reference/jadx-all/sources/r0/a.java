package r0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends r8.i {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!((entry instanceof Object ? entry : null) instanceof Map.Entry)) {
            return false;
        }
        Object key = entry.getKey();
        f fVar = ((h) this).f13319a;
        Object obj2 = fVar.get(key);
        if (obj2 != null) {
            return d7.a.d(obj2, entry.getValue());
        }
        return entry.getValue() == null && fVar.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if ((entry instanceof Object ? entry : null) instanceof Map.Entry) {
            return ((h) this).f13319a.remove(entry.getKey(), entry.getValue());
        }
        return false;
    }
}
