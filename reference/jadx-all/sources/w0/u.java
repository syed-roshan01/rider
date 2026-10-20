package w0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class u implements g0, List, RandomAccess, e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f16124a = new t(q0.j.f13070b);

    /* JADX WARN: Bottom block not found for handler: all -> 0x0056 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean add(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = w0.v.f16125a
            monitor-enter(r0)
            w0.t r1 = r9.f16124a     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            d7.a.k(r1, r2)     // Catch: java.lang.Throwable -> L5c
            w0.i0 r1 = w0.p.h(r1)     // Catch: java.lang.Throwable -> L5c
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L5c
            int r2 = r1.f16122d     // Catch: java.lang.Throwable -> L5c
            p0.d r1 = r1.f16121c     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r0)
            d7.a.j(r1)
            p0.d r3 = r1.add(r10)
            boolean r1 = d7.a.d(r3, r1)
            r4 = 0
            if (r1 == 0) goto L24
            goto L55
        L24:
            w0.t r1 = r9.f16124a
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            d7.a.k(r1, r5)
            java.lang.Object r5 = w0.p.f16109b
            monitor-enter(r5)
            w0.i r6 = w0.p.i()     // Catch: java.lang.Throwable -> L56
            w0.i0 r1 = w0.p.u(r1, r9, r6)     // Catch: java.lang.Throwable -> L56
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L56
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L56
            int r7 = r1.f16122d     // Catch: java.lang.Throwable -> L4b
            r8 = 1
            if (r7 != r2) goto L4d
            r1.f16121c = r3     // Catch: java.lang.Throwable -> L4b
            int r2 = r1.f16123e     // Catch: java.lang.Throwable -> L4b
            int r2 = r2 + r8
            r1.f16123e = r2     // Catch: java.lang.Throwable -> L4b
            int r7 = r7 + 1
            r1.f16122d = r7     // Catch: java.lang.Throwable -> L4b
            r4 = r8
            goto L4d
        L4b:
            r10 = move-exception
            goto L58
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r5)
            w0.p.l(r6, r9)
            if (r4 == 0) goto L0
            r4 = r8
        L55:
            return r4
        L56:
            r10 = move-exception
            goto L5a
        L58:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r10     // Catch: java.lang.Throwable -> L56
        L5a:
            monitor-exit(r5)
            throw r10
        L5c:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.u.add(java.lang.Object):boolean");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return p(new u.k(i10, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        i iVarI;
        t tVar = this.f16124a;
        d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (p.f16109b) {
            iVarI = p.i();
            t tVar2 = (t) p.u(tVar, this, iVarI);
            synchronized (v.f16125a) {
                tVar2.f16121c = q0.j.f13070b;
                tVar2.f16122d++;
                tVar2.f16123e++;
            }
        }
        p.l(iVarI, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return n().f16121c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return n().f16121c.containsAll(collection);
    }

    @Override // w0.g0
    public final i0 e() {
        return this.f16124a;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return n().f16121c.get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return n().f16121c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return n().f16121c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // w0.g0
    public final void k(i0 i0Var) {
        i0Var.f16074b = this.f16124a;
        this.f16124a = (t) i0Var;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return n().f16121c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c0(this, 0);
    }

    public final t n() {
        t tVar = this.f16124a;
        d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (t) p.r(tVar, this);
    }

    public final int o() {
        t tVar = this.f16124a;
        d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((t) p.h(tVar)).f16123e;
    }

    public final boolean p(c9.c cVar) {
        int i10;
        p0.d dVar;
        Object objInvoke;
        i iVarI;
        boolean z10;
        do {
            Object obj = v.f16125a;
            synchronized (obj) {
                t tVar = this.f16124a;
                d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) p.h(tVar);
                i10 = tVar2.f16122d;
                dVar = tVar2.f16121c;
            }
            d7.a.j(dVar);
            q0.f fVarBuilder = dVar.builder();
            objInvoke = cVar.invoke(fVarBuilder);
            p0.d dVarK = fVarBuilder.k();
            if (d7.a.d(dVarK, dVar)) {
                break;
            }
            t tVar3 = this.f16124a;
            d7.a.k(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                t tVar4 = (t) p.u(tVar3, this, iVarI);
                synchronized (obj) {
                    int i11 = tVar4.f16122d;
                    if (i11 == i10) {
                        tVar4.f16121c = dVarK;
                        tVar4.f16122d = i11 + 1;
                        z10 = true;
                        tVar4.f16123e++;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.l(iVarI, this);
        } while (!z10);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        p0.d dVar;
        i iVarI;
        boolean z10;
        Object obj = get(i10);
        do {
            Object obj2 = v.f16125a;
            synchronized (obj2) {
                t tVar = this.f16124a;
                d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) p.h(tVar);
                i11 = tVar2.f16122d;
                dVar = tVar2.f16121c;
            }
            d7.a.j(dVar);
            p0.d dVarM = dVar.m(i10);
            if (d7.a.d(dVarM, dVar)) {
                break;
            }
            t tVar3 = this.f16124a;
            d7.a.k(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                t tVar4 = (t) p.u(tVar3, this, iVarI);
                synchronized (obj2) {
                    int i12 = tVar4.f16122d;
                    if (i12 == i11) {
                        tVar4.f16121c = dVarM;
                        z10 = true;
                        tVar4.f16123e++;
                        tVar4.f16122d = i12 + 1;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.l(iVarI, this);
        } while (!z10);
        return obj;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005e */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = w0.v.f16125a
            monitor-enter(r0)
            w0.t r1 = r9.f16124a     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            d7.a.k(r1, r2)     // Catch: java.lang.Throwable -> L64
            w0.i0 r1 = w0.p.h(r1)     // Catch: java.lang.Throwable -> L64
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L64
            int r2 = r1.f16122d     // Catch: java.lang.Throwable -> L64
            p0.d r1 = r1.f16121c     // Catch: java.lang.Throwable -> L64
            monitor-exit(r0)
            d7.a.j(r1)
            r3 = r1
            q0.c r3 = (q0.c) r3
            q0.b r4 = new q0.b
            r5 = 0
            r4.<init>(r5, r10)
            p0.d r3 = r3.h(r4)
            boolean r1 = d7.a.d(r3, r1)
            if (r1 == 0) goto L2c
            goto L5d
        L2c:
            w0.t r1 = r9.f16124a
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            d7.a.k(r1, r4)
            java.lang.Object r4 = w0.p.f16109b
            monitor-enter(r4)
            w0.i r6 = w0.p.i()     // Catch: java.lang.Throwable -> L5e
            w0.i0 r1 = w0.p.u(r1, r9, r6)     // Catch: java.lang.Throwable -> L5e
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L5e
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L5e
            int r7 = r1.f16122d     // Catch: java.lang.Throwable -> L53
            r8 = 1
            if (r7 != r2) goto L55
            r1.f16121c = r3     // Catch: java.lang.Throwable -> L53
            int r2 = r1.f16123e     // Catch: java.lang.Throwable -> L53
            int r2 = r2 + r8
            r1.f16123e = r2     // Catch: java.lang.Throwable -> L53
            int r7 = r7 + 1
            r1.f16122d = r7     // Catch: java.lang.Throwable -> L53
            r5 = r8
            goto L55
        L53:
            r10 = move-exception
            goto L60
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r4)
            w0.p.l(r6, r9)
            if (r5 == 0) goto L0
            r5 = r8
        L5d:
            return r5
        L5e:
            r10 = move-exception
            goto L62
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            throw r10     // Catch: java.lang.Throwable -> L5e
        L62:
            monitor-exit(r4)
            throw r10
        L64:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.u.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return p(new q0.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        int i11;
        p0.d dVar;
        i iVarI;
        boolean z10;
        Object obj2 = get(i10);
        do {
            Object obj3 = v.f16125a;
            synchronized (obj3) {
                t tVar = this.f16124a;
                d7.a.k(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) p.h(tVar);
                i11 = tVar2.f16122d;
                dVar = tVar2.f16121c;
            }
            d7.a.j(dVar);
            p0.d dVar2 = dVar.set(i10, obj);
            if (d7.a.d(dVar2, dVar)) {
                break;
            }
            t tVar3 = this.f16124a;
            d7.a.k(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f16109b) {
                iVarI = p.i();
                t tVar4 = (t) p.u(tVar3, this, iVarI);
                synchronized (obj3) {
                    int i12 = tVar4.f16122d;
                    if (i12 == i11) {
                        tVar4.f16121c = dVar2;
                        tVar4.f16122d = i12 + 1;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.l(iVarI, this);
        } while (!z10);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return n().f16121c.size();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > size()) {
            throw new IllegalArgumentException("fromIndex or toIndex are out of bounds".toString());
        }
        return new k0(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return d9.i.v(this);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0056 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean addAll(java.util.Collection r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = w0.v.f16125a
            monitor-enter(r0)
            w0.t r1 = r9.f16124a     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            d7.a.k(r1, r2)     // Catch: java.lang.Throwable -> L5c
            w0.i0 r1 = w0.p.h(r1)     // Catch: java.lang.Throwable -> L5c
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L5c
            int r2 = r1.f16122d     // Catch: java.lang.Throwable -> L5c
            p0.d r1 = r1.f16121c     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r0)
            d7.a.j(r1)
            p0.d r3 = r1.addAll(r10)
            boolean r1 = d7.a.d(r3, r1)
            r4 = 0
            if (r1 == 0) goto L24
            goto L55
        L24:
            w0.t r1 = r9.f16124a
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            d7.a.k(r1, r5)
            java.lang.Object r5 = w0.p.f16109b
            monitor-enter(r5)
            w0.i r6 = w0.p.i()     // Catch: java.lang.Throwable -> L56
            w0.i0 r1 = w0.p.u(r1, r9, r6)     // Catch: java.lang.Throwable -> L56
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L56
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L56
            int r7 = r1.f16122d     // Catch: java.lang.Throwable -> L4b
            r8 = 1
            if (r7 != r2) goto L4d
            r1.f16121c = r3     // Catch: java.lang.Throwable -> L4b
            int r2 = r1.f16123e     // Catch: java.lang.Throwable -> L4b
            int r2 = r2 + r8
            r1.f16123e = r2     // Catch: java.lang.Throwable -> L4b
            int r7 = r7 + 1
            r1.f16122d = r7     // Catch: java.lang.Throwable -> L4b
            r4 = r8
            goto L4d
        L4b:
            r10 = move-exception
            goto L58
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r5)
            w0.p.l(r6, r9)
            if (r4 == 0) goto L0
            r4 = r8
        L55:
            return r4
        L56:
            r10 = move-exception
            goto L5a
        L58:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r10     // Catch: java.lang.Throwable -> L56
        L5a:
            monitor-exit(r5)
            throw r10
        L5c:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.u.addAll(java.util.Collection):boolean");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new c0(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d9.i.w(this, objArr);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0054 */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void add(int r8, java.lang.Object r9) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = w0.v.f16125a
            monitor-enter(r0)
            w0.t r1 = r7.f16124a     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            d7.a.k(r1, r2)     // Catch: java.lang.Throwable -> L5a
            w0.i0 r1 = w0.p.h(r1)     // Catch: java.lang.Throwable -> L5a
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L5a
            int r2 = r1.f16122d     // Catch: java.lang.Throwable -> L5a
            p0.d r1 = r1.f16121c     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r0)
            d7.a.j(r1)
            p0.d r3 = r1.add(r8, r9)
            boolean r1 = d7.a.d(r3, r1)
            if (r1 == 0) goto L23
            goto L53
        L23:
            w0.t r1 = r7.f16124a
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            d7.a.k(r1, r4)
            java.lang.Object r4 = w0.p.f16109b
            monitor-enter(r4)
            w0.i r5 = w0.p.i()     // Catch: java.lang.Throwable -> L54
            w0.i0 r1 = w0.p.u(r1, r7, r5)     // Catch: java.lang.Throwable -> L54
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L54
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L54
            int r6 = r1.f16122d     // Catch: java.lang.Throwable -> L49
            if (r6 != r2) goto L4b
            r1.f16121c = r3     // Catch: java.lang.Throwable -> L49
            int r2 = r1.f16123e     // Catch: java.lang.Throwable -> L49
            r3 = 1
            int r2 = r2 + r3
            r1.f16123e = r2     // Catch: java.lang.Throwable -> L49
            int r6 = r6 + 1
            r1.f16122d = r6     // Catch: java.lang.Throwable -> L49
            goto L4c
        L49:
            r8 = move-exception
            goto L56
        L4b:
            r3 = 0
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r4)
            w0.p.l(r5, r7)
            if (r3 == 0) goto L0
        L53:
            return
        L54:
            r8 = move-exception
            goto L58
        L56:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            throw r8     // Catch: java.lang.Throwable -> L54
        L58:
            monitor-exit(r4)
            throw r8
        L5a:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.u.add(int, java.lang.Object):void");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0060 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = w0.v.f16125a
            monitor-enter(r0)
            w0.t r1 = r9.f16124a     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            d7.a.k(r1, r2)     // Catch: java.lang.Throwable -> L66
            w0.i0 r1 = w0.p.h(r1)     // Catch: java.lang.Throwable -> L66
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L66
            int r2 = r1.f16122d     // Catch: java.lang.Throwable -> L66
            p0.d r1 = r1.f16121c     // Catch: java.lang.Throwable -> L66
            monitor-exit(r0)
            d7.a.j(r1)
            r3 = r1
            q0.c r3 = (q0.c) r3
            int r4 = r3.indexOf(r10)
            r5 = -1
            if (r4 == r5) goto L26
            p0.d r3 = r3.m(r4)
        L26:
            boolean r1 = d7.a.d(r3, r1)
            r4 = 0
            if (r1 == 0) goto L2e
            goto L5f
        L2e:
            w0.t r1 = r9.f16124a
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            d7.a.k(r1, r5)
            java.lang.Object r5 = w0.p.f16109b
            monitor-enter(r5)
            w0.i r6 = w0.p.i()     // Catch: java.lang.Throwable -> L60
            w0.i0 r1 = w0.p.u(r1, r9, r6)     // Catch: java.lang.Throwable -> L60
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L60
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L60
            int r7 = r1.f16122d     // Catch: java.lang.Throwable -> L55
            r8 = 1
            if (r7 != r2) goto L57
            r1.f16121c = r3     // Catch: java.lang.Throwable -> L55
            int r2 = r1.f16123e     // Catch: java.lang.Throwable -> L55
            int r2 = r2 + r8
            r1.f16123e = r2     // Catch: java.lang.Throwable -> L55
            int r7 = r7 + 1
            r1.f16122d = r7     // Catch: java.lang.Throwable -> L55
            r4 = r8
            goto L57
        L55:
            r10 = move-exception
            goto L62
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r5)
            w0.p.l(r6, r9)
            if (r4 == 0) goto L0
            r4 = r8
        L5f:
            return r4
        L60:
            r10 = move-exception
            goto L64
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            throw r10     // Catch: java.lang.Throwable -> L60
        L64:
            monitor-exit(r5)
            throw r10
        L66:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.u.remove(java.lang.Object):boolean");
    }
}
