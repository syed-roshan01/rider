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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void putAll(java.util.Map r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = w0.y.f16132a
            monitor-enter(r0)
            w0.w r1 = r7.f16128a     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"
            d7.a.k(r1, r2)     // Catch: java.lang.Throwable -> L5c
            w0.i0 r1 = w0.p.h(r1)     // Catch: java.lang.Throwable -> L5c
            w0.w r1 = (w0.w) r1     // Catch: java.lang.Throwable -> L5c
            p0.f r2 = r1.f16126c     // Catch: java.lang.Throwable -> L5c
            int r1 = r1.f16127d     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r0)
            d7.a.j(r2)
            p0.e r3 = r2.builder()
            r3.putAll(r8)
            p0.f r3 = r3.build()
            boolean r2 = d7.a.d(r3, r2)
            if (r2 != 0) goto L5b
            w0.w r2 = r7.f16128a
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"
            d7.a.k(r2, r4)
            java.lang.Object r4 = w0.p.f16109b
            monitor-enter(r4)
            w0.i r5 = w0.p.i()     // Catch: java.lang.Throwable -> L55
            w0.i0 r2 = w0.p.u(r2, r7, r5)     // Catch: java.lang.Throwable -> L55
            w0.w r2 = (w0.w) r2     // Catch: java.lang.Throwable -> L55
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L55
            int r6 = r2.f16127d     // Catch: java.lang.Throwable -> L4a
            if (r6 != r1) goto L4c
            r2.f16126c = r3     // Catch: java.lang.Throwable -> L4a
            int r6 = r6 + 1
            r2.f16127d = r6     // Catch: java.lang.Throwable -> L4a
            r1 = 1
            goto L4d
        L4a:
            r8 = move-exception
            goto L57
        L4c:
            r1 = 0
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            monitor-exit(r4)
            w0.p.l(r5, r7)
            if (r1 == 0) goto L0
            goto L5b
        L55:
            r8 = move-exception
            goto L59
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            throw r8     // Catch: java.lang.Throwable -> L55
        L59:
            monitor-exit(r4)
            throw r8
        L5b:
            return
        L5c:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.x.putAll(java.util.Map):void");
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
