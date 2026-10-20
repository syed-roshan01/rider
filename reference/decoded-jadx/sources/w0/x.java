package w0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class x implements g0, Map, e9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f16128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f16129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f16130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f16131d;

    public x() {
        r0.d dVar = r0.d.f13303c;
        d7.a.k(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        this.f16128a = new w(dVar);
        this.f16129b = new q(this, 0);
        this.f16130c = new q(this, 1);
        this.f16131d = new q(this, 2);
    }

    public final w a() {
        w wVar = this.f16128a;
        d7.a.k(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (w) p.r(wVar, this);
    }

    @Override // java.util.Map
    public final void clear() {
        i iVarI;
        w wVar = this.f16128a;
        d7.a.k(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        w wVar2 = (w) p.h(wVar);
        r0.d dVar = r0.d.f13303c;
        d7.a.k(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        if (dVar != wVar2.f16126c) {
            w wVar3 = this.f16128a;
            d7.a.k(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                w wVar4 = (w) p.u(wVar3, this, iVarI);
                synchronized (y.f16132a) {
                    wVar4.f16126c = dVar;
                    wVar4.f16127d++;
                }
            }
            p.l(iVarI, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return a().f16126c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return a().f16126c.containsValue(obj);
    }

    @Override // w0.g0
    public final i0 e() {
        return this.f16128a;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f16129b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return a().f16126c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return a().f16126c.isEmpty();
    }

    @Override // w0.g0
    public final void k(i0 i0Var) {
        this.f16128a = (w) i0Var;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f16130c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        p0.f fVar;
        int i10;
        Object objPut;
        i iVarI;
        boolean z10;
        do {
            Object obj3 = y.f16132a;
            synchronized (obj3) {
                w wVar = this.f16128a;
                d7.a.k(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                w wVar2 = (w) p.h(wVar);
                fVar = wVar2.f16126c;
                i10 = wVar2.f16127d;
            }
            d7.a.j(fVar);
            p0.e eVarBuilder = fVar.builder();
            objPut = eVarBuilder.put(obj, obj2);
            p0.f fVarBuild = eVarBuilder.build();
            if (d7.a.d(fVarBuild, fVar)) {
                break;
            }
            w wVar3 = this.f16128a;
            d7.a.k(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                w wVar4 = (w) p.u(wVar3, this, iVarI);
                synchronized (obj3) {
                    int i11 = wVar4.f16127d;
                    if (i11 == i10) {
                        wVar4.f16126c = fVarBuild;
                        wVar4.f16127d = i11 + 1;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.l(iVarI, this);
        } while (!z10);
        return objPut;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void putAll(Map map) {
        p0.f fVar;
        int i10;
        i iVarI;
        boolean z10;
        do {
            Object obj = y.f16132a;
            synchronized (obj) {
                w wVar = this.f16128a;
                d7.a.k(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                w wVar2 = (w) p.h(wVar);
                fVar = wVar2.f16126c;
                i10 = wVar2.f16127d;
            }
            d7.a.j(fVar);
            p0.e eVarBuilder = fVar.builder();
            eVarBuilder.putAll(map);
            p0.f fVarBuild = eVarBuilder.build();
            if (d7.a.d(fVarBuild, fVar)) {
                return;
            }
            w wVar3 = this.f16128a;
            d7.a.k(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                w wVar4 = (w) p.u(wVar3, this, iVarI);
                synchronized (obj) {
                    try {
                        int i11 = wVar4.f16127d;
                        if (i11 == i10) {
                            wVar4.f16126c = fVarBuild;
                            wVar4.f16127d = i11 + 1;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            p.l(iVarI, this);
        } while (!z10);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        p0.f fVar;
        int i10;
        Object objRemove;
        i iVarI;
        boolean z10;
        do {
            Object obj2 = y.f16132a;
            synchronized (obj2) {
                w wVar = this.f16128a;
                d7.a.k(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                w wVar2 = (w) p.h(wVar);
                fVar = wVar2.f16126c;
                i10 = wVar2.f16127d;
            }
            d7.a.j(fVar);
            p0.e eVarBuilder = fVar.builder();
            objRemove = eVarBuilder.remove(obj);
            p0.f fVarBuild = eVarBuilder.build();
            if (d7.a.d(fVarBuild, fVar)) {
                break;
            }
            w wVar3 = this.f16128a;
            d7.a.k(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                w wVar4 = (w) p.u(wVar3, this, iVarI);
                synchronized (obj2) {
                    int i11 = wVar4.f16127d;
                    if (i11 == i10) {
                        wVar4.f16126c = fVarBuild;
                        wVar4.f16127d = i11 + 1;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.l(iVarI, this);
        } while (!z10);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return a().f16126c.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f16131d;
    }
}
