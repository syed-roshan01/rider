package r6;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements Map {
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return ((n8.h) this).f12273a.toString();
    }

    @Override // java.util.Map
    public final void clear() {
        ((n8.h) this).f12273a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return ((n8.h) this).f12273a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((n8.h) this).f12273a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((n8.h) this).f12273a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || ((n8.h) this).f12273a.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return ((n8.h) this).f12273a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return ((n8.h) this).f12273a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((n8.h) this).f12273a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return ((n8.h) this).f12273a.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return ((n8.h) this).f12273a.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        ((n8.h) this).f12273a.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return ((n8.h) this).f12273a.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return ((n8.h) this).f12273a.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return ((n8.h) this).f12273a.values();
    }
}
