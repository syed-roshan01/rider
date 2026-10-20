package q;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class n {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final r.b lock;
    private final r.c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public n(int i10) {
        this.maxSize = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.map = new r.c();
        this.lock = new r.b();
    }

    public final int a(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public Object create(Object obj) {
        d7.a.m(obj, "key");
        return null;
    }

    public final int createCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.createCount;
        }
        return i10;
    }

    public void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        d7.a.m(obj, "key");
        d7.a.m(obj2, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.evictionCount;
        }
        return i10;
    }

    public final Object get(Object obj) {
        Object objPut;
        d7.a.m(obj, "key");
        synchronized (this.lock) {
            r.c cVar = this.map;
            cVar.getClass();
            Object obj2 = cVar.f13298a.get(obj);
            if (obj2 != null) {
                this.hitCount++;
                return obj2;
            }
            this.missCount++;
            Object objCreate = create(obj);
            if (objCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    r.c cVar2 = this.map;
                    cVar2.getClass();
                    objPut = cVar2.f13298a.put(obj, objCreate);
                    if (objPut != null) {
                        r.c cVar3 = this.map;
                        cVar3.getClass();
                        cVar3.f13298a.put(obj, objPut);
                    } else {
                        this.size += a(obj, objCreate);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                entryRemoved(false, obj, objCreate, objPut);
                return objPut;
            }
            trimToSize(this.maxSize);
            return objCreate;
        }
    }

    public final int hitCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.hitCount;
        }
        return i10;
    }

    public final int maxSize() {
        int i10;
        synchronized (this.lock) {
            i10 = this.maxSize;
        }
        return i10;
    }

    public final int missCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.missCount;
        }
        return i10;
    }

    public final Object put(Object obj, Object obj2) {
        Object objPut;
        d7.a.m(obj, "key");
        d7.a.m(obj2, FirebaseAnalytics.Param.VALUE);
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(obj, obj2);
            r.c cVar = this.map;
            cVar.getClass();
            objPut = cVar.f13298a.put(obj, obj2);
            if (objPut != null) {
                this.size -= a(obj, objPut);
            }
        }
        if (objPut != null) {
            entryRemoved(false, obj, objPut, obj2);
        }
        trimToSize(this.maxSize);
        return objPut;
    }

    public final int putCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.putCount;
        }
        return i10;
    }

    public final Object remove(Object obj) {
        Object objRemove;
        d7.a.m(obj, "key");
        synchronized (this.lock) {
            r.c cVar = this.map;
            cVar.getClass();
            objRemove = cVar.f13298a.remove(obj);
            if (objRemove != null) {
                this.size -= a(obj, objRemove);
            }
        }
        if (objRemove != null) {
            entryRemoved(false, obj, objRemove, null);
        }
        return objRemove;
    }

    public void resize(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        synchronized (this.lock) {
            this.maxSize = i10;
        }
        trimToSize(i10);
    }

    public final int size() {
        int i10;
        synchronized (this.lock) {
            i10 = this.size;
        }
        return i10;
    }

    public int sizeOf(Object obj, Object obj2) {
        d7.a.m(obj, "key");
        d7.a.m(obj2, FirebaseAnalytics.Param.VALUE);
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            Set<Map.Entry> setEntrySet = this.map.f13298a.entrySet();
            d7.a.l(setEntrySet, "map.entries");
            for (Map.Entry entry : setEntrySet) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i10 = this.hitCount;
                int i11 = this.missCount + i10;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public void trimToSize(int i10) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (this.size < 0 || (this.map.f13298a.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size > i10 && !this.map.f13298a.isEmpty()) {
                        Set setEntrySet = this.map.f13298a.entrySet();
                        d7.a.l(setEntrySet, "map.entries");
                        Map.Entry entry = (Map.Entry) r8.p.G0(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        r.c cVar = this.map;
                        cVar.getClass();
                        d7.a.m(key, "key");
                        cVar.f13298a.remove(key);
                        this.size -= a(key, value);
                        this.evictionCount++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!".toString());
    }
}
