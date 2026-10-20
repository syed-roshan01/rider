package e2;

import a4.q;
import java.util.HashMap;
import java.util.LinkedHashSet;
import r8.p;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f5082a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f5083b = new HashMap(0, 0.75f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f5084c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5087f;

    public final Object a(Object obj) {
        synchronized (this.f5082a) {
            Object obj2 = this.f5083b.get(obj);
            if (obj2 == null) {
                this.f5087f++;
                return null;
            }
            this.f5084c.remove(obj);
            this.f5084c.add(obj);
            this.f5086e++;
            return obj2;
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object objPut;
        Object objE0;
        Object obj3;
        if (obj == null || obj2 == null) {
            throw null;
        }
        synchronized (this.f5082a) {
            try {
                this.f5085d = d() + 1;
                objPut = this.f5083b.put(obj, obj2);
                if (objPut != null) {
                    this.f5085d = d() - 1;
                }
                if (this.f5084c.contains(obj)) {
                    this.f5084c.remove(obj);
                }
                this.f5084c.add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        while (true) {
            synchronized (this.f5082a) {
                try {
                    if (d() >= 0 && (!this.f5083b.isEmpty() || d() == 0)) {
                        if (this.f5083b.isEmpty() != this.f5084c.isEmpty()) {
                            break;
                        }
                        if (d() <= 16 || this.f5083b.isEmpty()) {
                            objE0 = null;
                            obj3 = null;
                        } else {
                            objE0 = p.E0(this.f5084c);
                            obj3 = this.f5083b.get(objE0);
                            if (obj3 == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            HashMap map = this.f5083b;
                            z6.a.d(map);
                            map.remove(objE0);
                            z6.a.c(this.f5084c).remove(objE0);
                            int iD = d();
                            d7.a.j(objE0);
                            this.f5085d = iD - 1;
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (objE0 == null && obj3 == null) {
                return objPut;
            }
            d7.a.j(objE0);
            d7.a.j(obj3);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public final Object c(Object obj) {
        Object objRemove;
        obj.getClass();
        synchronized (this.f5082a) {
            objRemove = this.f5083b.remove(obj);
            this.f5084c.remove(obj);
            if (objRemove != null) {
                this.f5085d = d() - 1;
            }
        }
        return objRemove;
    }

    public final int d() {
        int i10;
        synchronized (this.f5082a) {
            i10 = this.f5085d;
        }
        return i10;
    }

    public final String toString() {
        String str;
        synchronized (this.f5082a) {
            try {
                int i10 = this.f5086e;
                int i11 = this.f5087f + i10;
                str = "LruCache[maxSize=16,hits=" + this.f5086e + ",misses=" + this.f5087f + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
