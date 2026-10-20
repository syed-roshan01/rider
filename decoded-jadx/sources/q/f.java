package q;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f extends z implements Map {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f12987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f12988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f12989f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(f fVar) {
        super(0);
        if (fVar != null) {
            int i10 = fVar.f13045c;
            b(this.f13045c + i10);
            if (this.f13045c != 0) {
                for (int i11 = 0; i11 < i10; i11++) {
                    put(fVar.f(i11), fVar.j(i11));
                }
            } else if (i10 > 0) {
                b9.b.G(0, 0, i10, fVar.f13043a, this.f13043a);
                b9.b.H(0, 0, i10 << 1, fVar.f13044b, this.f13044b);
                this.f13045c = i10;
            }
        }
    }

    @Override // q.z, java.util.Map
    public final boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // q.z, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        a aVar = this.f12987d;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(0, this);
        this.f12987d = aVar2;
        return aVar2;
    }

    @Override // q.z, java.util.Map
    public final Object get(Object obj) {
        return super.get(obj);
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.f12988e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f12988e = cVar2;
        return cVar2;
    }

    public final boolean l(Collection collection) {
        int i10 = this.f13045c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i10 != this.f13045c;
    }

    public final boolean m(Collection collection) {
        int i10 = this.f13045c;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (!collection.contains(f(i11))) {
                h(i11);
            }
        }
        return i10 != this.f13045c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f13045c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // q.z, java.util.Map
    public final Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.f12989f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f12989f = eVar2;
        return eVar2;
    }
}
