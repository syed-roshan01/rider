package r6;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class s implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient c0 f13579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient d0 f13580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient e0 f13581c;

    /* JADX WARN: Multi-variable type inference failed */
    public static s a(HashMap map) {
        if ((map instanceof s) && !(map instanceof SortedMap)) {
            return (s) map;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z10 = setEntrySet instanceof Collection;
        r rVar = new r(z10 ? setEntrySet.size() : 4);
        if (z10) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = rVar.f13576a;
            if (size > objArr.length) {
                rVar.f13576a = Arrays.copyOf(objArr, o7.d0.w(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            rVar.a(entry.getKey(), entry.getValue());
        }
        q qVar = rVar.f13578c;
        if (qVar != null) {
            throw qVar.a();
        }
        f0 f0VarB = f0.b(rVar.f13577b, rVar.f13576a, rVar);
        q qVar2 = rVar.f13578c;
        if (qVar2 == null) {
            return f0VarB;
        }
        throw qVar2.a();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        e0 e0Var = this.f13581c;
        if (e0Var == null) {
            f0 f0Var = (f0) this;
            e0 e0Var2 = new e0(f0Var.f13539e, 1, f0Var.f13540f);
            this.f13581c = e0Var2;
            e0Var = e0Var2;
        }
        return e0Var.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        c0 c0Var = this.f13579a;
        if (c0Var != null) {
            return c0Var;
        }
        f0 f0Var = (f0) this;
        c0 c0Var2 = new c0(f0Var, f0Var.f13539e, f0Var.f13540f);
        this.f13579a = c0Var2;
        return c0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        c0 c0Var = this.f13579a;
        if (c0Var == null) {
            f0 f0Var = (f0) this;
            c0 c0Var2 = new c0(f0Var, f0Var.f13539e, f0Var.f13540f);
            this.f13579a = c0Var2;
            c0Var = c0Var2;
        }
        Iterator it = c0Var.iterator();
        int i10 = 0;
        while (true) {
            a aVar = (a) it;
            if (!aVar.hasNext()) {
                return i10;
            }
            Object next = aVar.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((f0) this).f13540f == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        d0 d0Var = this.f13580b;
        if (d0Var != null) {
            return d0Var;
        }
        f0 f0Var = (f0) this;
        d0 d0Var2 = new d0(f0Var, new e0(f0Var.f13539e, 0, f0Var.f13540f));
        this.f13580b = d0Var2;
        return d0Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i10 = ((f0) this).f13540f;
        if (i10 < 0) {
            throw new IllegalArgumentException(l.q.g("size cannot be negative but was: ", i10));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824L));
        sb.append('{');
        boolean z10 = true;
        for (Map.Entry entry : (c0) entrySet()) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z10 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        e0 e0Var = this.f13581c;
        if (e0Var != null) {
            return e0Var;
        }
        f0 f0Var = (f0) this;
        e0 e0Var2 = new e0(f0Var.f13539e, 1, f0Var.f13540f);
        this.f13581c = e0Var2;
        return e0Var2;
    }
}
