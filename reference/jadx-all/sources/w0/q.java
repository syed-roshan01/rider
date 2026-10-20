package w0;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(x xVar, int i10) {
        super(xVar);
        this.f16119b = i10;
    }

    private boolean e(Collection collection) {
        p0.f fVar;
        int i10;
        boolean z10;
        i iVarI;
        Collection<Map.Entry> collection2 = collection;
        int iT = z6.a.T(f9.a.y0(collection2));
        if (iT < 16) {
            iT = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iT);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        x xVar = this.f16120a;
        boolean z11 = false;
        do {
            synchronized (y.f16132a) {
                w wVar = xVar.f16128a;
                d7.a.k(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                w wVar2 = (w) p.h(wVar);
                fVar = wVar2.f16126c;
                i10 = wVar2.f16127d;
            }
            d7.a.j(fVar);
            p0.e eVarBuilder = fVar.builder();
            Object it = xVar.f16129b.iterator();
            while (true) {
                z10 = true;
                if (!((f0) it).hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) ((e0) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !d7.a.d(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    eVarBuilder.remove(entry2.getKey());
                    z11 = true;
                }
            }
            p0.f fVarBuild = eVarBuilder.build();
            if (d7.a.d(fVarBuild, fVar)) {
                break;
            }
            w wVar3 = xVar.f16128a;
            d7.a.k(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                w wVar4 = (w) p.u(wVar3, xVar, iVarI);
                synchronized (y.f16132a) {
                    int i11 = wVar4.f16127d;
                    if (i11 == i10) {
                        wVar4.f16126c = fVarBuild;
                        wVar4.f16127d = i11 + 1;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.l(iVarI, xVar);
        } while (!z10);
        return z11;
    }

    private boolean i(Collection collection) {
        p0.f fVar;
        int i10;
        boolean z10;
        i iVarI;
        Set setA1 = r8.p.a1(collection);
        x xVar = this.f16120a;
        boolean z11 = false;
        do {
            synchronized (y.f16132a) {
                w wVar = xVar.f16128a;
                d7.a.k(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                w wVar2 = (w) p.h(wVar);
                fVar = wVar2.f16126c;
                i10 = wVar2.f16127d;
            }
            d7.a.j(fVar);
            p0.e eVarBuilder = fVar.builder();
            Object it = xVar.f16129b.iterator();
            while (true) {
                z10 = true;
                if (!((f0) it).hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) ((e0) it).next();
                if (!setA1.contains(entry.getKey())) {
                    eVarBuilder.remove(entry.getKey());
                    z11 = true;
                }
            }
            p0.f fVarBuild = eVarBuilder.build();
            if (d7.a.d(fVarBuild, fVar)) {
                break;
            }
            w wVar3 = xVar.f16128a;
            d7.a.k(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                w wVar4 = (w) p.u(wVar3, xVar, iVarI);
                synchronized (y.f16132a) {
                    int i11 = wVar4.f16127d;
                    if (i11 == i10) {
                        wVar4.f16126c = fVarBuild;
                        wVar4.f16127d = i11 + 1;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.l(iVarI, xVar);
        } while (!z10);
        return z11;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i10 = this.f16119b;
        switch (i10) {
            case 0:
                y.a();
                throw null;
            case 1:
                switch (i10) {
                    case 1:
                        y.a();
                        throw null;
                    default:
                        y.a();
                        throw null;
                }
            default:
                switch (i10) {
                    case 1:
                        y.a();
                        throw null;
                    default:
                        y.a();
                        throw null;
                }
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i10 = this.f16119b;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        y.a();
                        throw null;
                    case 1:
                        y.a();
                        throw null;
                    default:
                        y.a();
                        throw null;
                }
            case 1:
                switch (i10) {
                    case 0:
                        y.a();
                        throw null;
                    case 1:
                        y.a();
                        throw null;
                    default:
                        y.a();
                        throw null;
                }
            default:
                switch (i10) {
                    case 0:
                        y.a();
                        throw null;
                    case 1:
                        y.a();
                        throw null;
                    default:
                        y.a();
                        throw null;
                }
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i10 = this.f16119b;
        x xVar = this.f16120a;
        switch (i10) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof e9.a) && !(obj instanceof e9.c))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return d7.a.d(xVar.get(entry.getKey()), entry.getValue());
            case 1:
                return xVar.containsKey(obj);
            default:
                return xVar.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i10 = this.f16119b;
        x xVar = this.f16120a;
        switch (i10) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!xVar.containsKey(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!xVar.containsValue(it3.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f16119b;
        x xVar = this.f16120a;
        switch (i10) {
            case 0:
                return new e0(xVar, ((p0.c) xVar.a().f16126c.entrySet()).iterator(), 0);
            case 1:
                return new e0(xVar, ((p0.c) xVar.a().f16126c.entrySet()).iterator(), 1);
            default:
                return new e0(xVar, ((p0.c) xVar.a().f16126c.entrySet()).iterator(), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v8 java.lang.Object, still in use, count: 2, list:
          (r4v8 java.lang.Object) from 0x002e: PHI (r4 I:??) = (r4v3 java.lang.Object), (r4v8 java.lang.Object) binds: [B:10:0x002d, B:30:0x002e] A[DONT_GENERATE, DONT_INLINE]
          (r4v8 java.lang.Object) from 0x0020: CHECK_CAST (java.util.Map$Entry) (r4v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f16119b
            r1 = 0
            r2 = 1
            w0.x r3 = r6.f16120a
            switch(r0) {
                case 0: goto L43;
                case 1: goto L3b;
                default: goto L9;
            }
        L9:
            w0.q r0 = r3.f16129b
            java.util.Iterator r0 = r0.iterator()
        Lf:
            r4 = r0
            w0.f0 r4 = (w0.f0) r4
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L2d
            r4 = r0
            w0.e0 r4 = (w0.e0) r4
            java.lang.Object r4 = r4.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            boolean r5 = d7.a.d(r5, r7)
            if (r5 == 0) goto Lf
            goto L2e
        L2d:
            r4 = 0
        L2e:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            if (r4 == 0) goto L3a
            java.lang.Object r7 = r4.getKey()
            r3.remove(r7)
            r1 = r2
        L3a:
            return r1
        L3b:
            java.lang.Object r7 = r3.remove(r7)
            if (r7 == 0) goto L42
            r1 = r2
        L42:
            return r1
        L43:
            boolean r0 = r7 instanceof java.util.Map.Entry
            if (r0 == 0) goto L5c
            boolean r0 = r7 instanceof e9.a
            if (r0 == 0) goto L4f
            boolean r0 = r7 instanceof e9.c
            if (r0 == 0) goto L5c
        L4f:
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getKey()
            java.lang.Object r7 = r3.remove(r7)
            if (r7 == 0) goto L5c
            r1 = r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.q.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        p0.f fVar;
        int i10;
        i iVarI;
        boolean z10;
        switch (this.f16119b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z11 = false;
                    while (it.hasNext()) {
                        if (this.f16120a.remove(((Map.Entry) it.next()).getKey()) != null || z11) {
                            z11 = true;
                        }
                    }
                    return z11;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z12 = false;
                    while (it2.hasNext()) {
                        if (this.f16120a.remove(it2.next()) != null || z12) {
                            z12 = true;
                        }
                    }
                    return z12;
                }
            default:
                Set setA1 = r8.p.a1(collection);
                x xVar = this.f16120a;
                boolean z13 = false;
                do {
                    synchronized (y.f16132a) {
                        w wVar = xVar.f16128a;
                        d7.a.k(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        w wVar2 = (w) p.h(wVar);
                        fVar = wVar2.f16126c;
                        i10 = wVar2.f16127d;
                    }
                    d7.a.j(fVar);
                    p0.e eVarBuilder = fVar.builder();
                    Object it3 = xVar.f16129b.iterator();
                    while (((f0) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((e0) it3).next();
                        if (setA1.contains(entry.getValue())) {
                            eVarBuilder.remove(entry.getKey());
                            z13 = true;
                        }
                    }
                    p0.f fVarBuild = eVarBuilder.build();
                    if (!d7.a.d(fVarBuild, fVar)) {
                        w wVar3 = xVar.f16128a;
                        d7.a.k(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (p.f16109b) {
                            iVarI = p.i();
                            w wVar4 = (w) p.u(wVar3, xVar, iVarI);
                            synchronized (y.f16132a) {
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
                        p.l(iVarI, xVar);
                    }
                    return z13;
                } while (!z10);
                return z13;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        p0.f fVar;
        int i10;
        boolean z10;
        i iVarI;
        switch (this.f16119b) {
            case 0:
                return e(collection);
            case 1:
                return i(collection);
            default:
                Set setA1 = r8.p.a1(collection);
                x xVar = this.f16120a;
                boolean z11 = false;
                do {
                    synchronized (y.f16132a) {
                        w wVar = xVar.f16128a;
                        d7.a.k(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        w wVar2 = (w) p.h(wVar);
                        fVar = wVar2.f16126c;
                        i10 = wVar2.f16127d;
                    }
                    d7.a.j(fVar);
                    p0.e eVarBuilder = fVar.builder();
                    Object it = xVar.f16129b.iterator();
                    while (true) {
                        z10 = true;
                        if (!((f0) it).hasNext()) {
                            p0.f fVarBuild = eVarBuilder.build();
                            if (!d7.a.d(fVarBuild, fVar)) {
                                w wVar3 = xVar.f16128a;
                                d7.a.k(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                                synchronized (p.f16109b) {
                                    iVarI = p.i();
                                    w wVar4 = (w) p.u(wVar3, xVar, iVarI);
                                    synchronized (y.f16132a) {
                                        int i11 = wVar4.f16127d;
                                        if (i11 == i10) {
                                            wVar4.f16126c = fVarBuild;
                                            wVar4.f16127d = i11 + 1;
                                        } else {
                                            z10 = false;
                                        }
                                        break;
                                    }
                                }
                                p.l(iVarI, xVar);
                            }
                            return z11;
                        }
                        Map.Entry entry = (Map.Entry) ((e0) it).next();
                        if (!setA1.contains(entry.getValue())) {
                            eVarBuilder.remove(entry.getKey());
                            z11 = true;
                        }
                    }
                } while (!z10);
                return z11;
        }
    }
}
