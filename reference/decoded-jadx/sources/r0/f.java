package r0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f extends r8.h implements p0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f13309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t0.b f13310b = new t0.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f13311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13314f;

    public f(d dVar) {
        this.f13309a = dVar;
        this.f13311c = dVar.f13304a;
        dVar.getClass();
        this.f13314f = dVar.f13305b;
    }

    @Override // p0.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d build() {
        r rVar = this.f13311c;
        d dVar = this.f13309a;
        if (rVar != dVar.f13304a) {
            this.f13310b = new t0.b();
            dVar = new d(this.f13311c, this.f13314f);
        }
        this.f13309a = dVar;
        return dVar;
    }

    public final void b(int i10) {
        this.f13314f = i10;
        this.f13313e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f13311c = r.f13328e;
        b(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f13311c.d(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f13311c.g(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f13312d = null;
        this.f13311c = this.f13311c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f13312d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        d dVarBuild = null;
        d dVar = map instanceof d ? (d) map : null;
        if (dVar == null) {
            f fVar = map instanceof f ? (f) map : null;
            if (fVar != null) {
                dVarBuild = fVar.build();
            }
        } else {
            dVarBuild = dVar;
        }
        if (dVarBuild == null) {
            super.putAll(map);
            return;
        }
        t0.a aVar = new t0.a();
        aVar.f14366a = 0;
        int i10 = this.f13314f;
        r rVar = this.f13311c;
        r rVar2 = dVarBuild.f13304a;
        d7.a.k(rVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f13311c = rVar.m(rVar2, 0, aVar, this);
        int i11 = (dVarBuild.f13305b + i10) - aVar.f14366a;
        if (i10 != i11) {
            b(i11);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f13312d = null;
        r rVarN = this.f13311c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (rVarN == null) {
            rVarN = r.f13328e;
        }
        this.f13311c = rVarN;
        return this.f13312d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i10 = this.f13314f;
        r rVarO = this.f13311c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (rVarO == null) {
            rVarO = r.f13328e;
        }
        this.f13311c = rVarO;
        return i10 != this.f13314f;
    }
}
