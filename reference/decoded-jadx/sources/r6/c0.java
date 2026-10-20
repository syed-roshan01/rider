package r6;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient s f13520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f13521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f13522f = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient int f13523n;

    public c0(s sVar, Object[] objArr, int i10) {
        this.f13520d = sVar;
        this.f13521e = objArr;
        this.f13523n = i10;
    }

    @Override // r6.l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f13520d.get(key));
    }

    @Override // r6.l
    public final int e(Object[] objArr) {
        p pVarR = this.f13583b;
        if (pVarR == null) {
            pVarR = r();
            this.f13583b = pVarR;
        }
        return pVarR.e(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        p pVarR = this.f13583b;
        if (pVarR == null) {
            pVarR = r();
            this.f13583b = pVarR;
        }
        return pVarR.listIterator(0);
    }

    @Override // r6.l
    public final boolean n() {
        return true;
    }

    public final p r() {
        return new b0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13523n;
    }
}
