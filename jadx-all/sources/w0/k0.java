package w0;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements List, e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f16078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16081d;

    public k0(u uVar, int i10, int i11) {
        this.f16078a = uVar;
        this.f16079b = i10;
        this.f16080c = uVar.o();
        this.f16081d = i11 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        e();
        int i10 = this.f16079b + this.f16081d;
        u uVar = this.f16078a;
        uVar.add(i10, obj);
        this.f16081d++;
        this.f16080c = uVar.o();
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        e();
        int i11 = i10 + this.f16079b;
        u uVar = this.f16078a;
        boolean zAddAll = uVar.addAll(i11, collection);
        if (zAddAll) {
            this.f16081d = collection.size() + this.f16081d;
            this.f16080c = uVar.o();
        }
        return zAddAll;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0070 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void clear() {
        /*
            r11 = this;
            int r0 = r11.f16081d
            if (r0 <= 0) goto L84
            r11.e()
            w0.u r0 = r11.f16078a
            int r1 = r11.f16079b
            int r2 = r11.f16081d
            int r2 = r2 + r1
            r0.getClass()
        L11:
            java.lang.Object r3 = w0.v.f16125a
            monitor-enter(r3)
            w0.t r4 = r0.f16124a     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            d7.a.k(r4, r5)     // Catch: java.lang.Throwable -> L81
            w0.i0 r4 = w0.p.h(r4)     // Catch: java.lang.Throwable -> L81
            w0.t r4 = (w0.t) r4     // Catch: java.lang.Throwable -> L81
            int r5 = r4.f16122d     // Catch: java.lang.Throwable -> L81
            p0.d r4 = r4.f16121c     // Catch: java.lang.Throwable -> L81
            monitor-exit(r3)
            d7.a.j(r4)
            q0.f r6 = r4.builder()
            java.util.List r7 = r6.subList(r1, r2)
            r7.clear()
            p0.d r6 = r6.k()
            boolean r4 = d7.a.d(r6, r4)
            r7 = 0
            if (r4 != 0) goto L76
            w0.t r4 = r0.f16124a
            java.lang.String r8 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            d7.a.k(r4, r8)
            java.lang.Object r8 = w0.p.f16109b
            monitor-enter(r8)
            w0.i r9 = w0.p.i()     // Catch: java.lang.Throwable -> L70
            w0.i0 r4 = w0.p.u(r4, r0, r9)     // Catch: java.lang.Throwable -> L70
            w0.t r4 = (w0.t) r4     // Catch: java.lang.Throwable -> L70
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L70
            int r10 = r4.f16122d     // Catch: java.lang.Throwable -> L65
            if (r10 != r5) goto L67
            r4.f16121c = r6     // Catch: java.lang.Throwable -> L65
            int r10 = r10 + 1
            r4.f16122d = r10     // Catch: java.lang.Throwable -> L65
            int r5 = r4.f16123e     // Catch: java.lang.Throwable -> L65
            r6 = 1
            int r5 = r5 + r6
            r4.f16123e = r5     // Catch: java.lang.Throwable -> L65
            goto L68
        L65:
            r0 = move-exception
            goto L72
        L67:
            r6 = r7
        L68:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L70
            monitor-exit(r8)
            w0.p.l(r9, r0)
            if (r6 == 0) goto L11
            goto L76
        L70:
            r0 = move-exception
            goto L74
        L72:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L70
            throw r0     // Catch: java.lang.Throwable -> L70
        L74:
            monitor-exit(r8)
            throw r0
        L76:
            r11.f16081d = r7
            w0.u r0 = r11.f16078a
            int r0 = r0.o()
            r11.f16080c = r0
            goto L84
        L81:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.k0.clear():void");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e() {
        if (this.f16078a.o() != this.f16080c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        e();
        v.a(i10, this.f16081d);
        return this.f16078a.get(this.f16079b + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        e();
        int i10 = this.f16081d;
        int i11 = this.f16079b;
        Iterator it = z6.a.s0(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int iB = ((i9.f) it).b();
            if (d7.a.d(obj, this.f16078a.get(iB))) {
                return iB - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f16081d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e();
        int i10 = this.f16081d;
        int i11 = this.f16079b;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (d7.a.d(obj, this.f16078a.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x006e */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(java.util.Collection r14) {
        /*
            r13 = this;
            r13.e()
            w0.u r0 = r13.f16078a
            int r1 = r13.f16079b
            int r2 = r13.f16081d
            int r2 = r2 + r1
            int r3 = r0.size()
        Le:
            java.lang.Object r4 = w0.v.f16125a
            monitor-enter(r4)
            w0.t r5 = r0.f16124a     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            d7.a.k(r5, r6)     // Catch: java.lang.Throwable -> L8d
            w0.i0 r5 = w0.p.h(r5)     // Catch: java.lang.Throwable -> L8d
            w0.t r5 = (w0.t) r5     // Catch: java.lang.Throwable -> L8d
            int r6 = r5.f16122d     // Catch: java.lang.Throwable -> L8d
            p0.d r5 = r5.f16121c     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r4)
            d7.a.j(r5)
            q0.f r7 = r5.builder()
            java.util.List r8 = r7.subList(r1, r2)
            r8.retainAll(r14)
            p0.d r7 = r7.k()
            boolean r5 = d7.a.d(r7, r5)
            r8 = 1
            r9 = 0
            if (r5 != 0) goto L74
            w0.t r5 = r0.f16124a
            java.lang.String r10 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            d7.a.k(r5, r10)
            java.lang.Object r10 = w0.p.f16109b
            monitor-enter(r10)
            w0.i r11 = w0.p.i()     // Catch: java.lang.Throwable -> L6e
            w0.i0 r5 = w0.p.u(r5, r0, r11)     // Catch: java.lang.Throwable -> L6e
            w0.t r5 = (w0.t) r5     // Catch: java.lang.Throwable -> L6e
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L6e
            int r12 = r5.f16122d     // Catch: java.lang.Throwable -> L63
            if (r12 != r6) goto L65
            r5.f16121c = r7     // Catch: java.lang.Throwable -> L63
            int r12 = r12 + 1
            r5.f16122d = r12     // Catch: java.lang.Throwable -> L63
            int r6 = r5.f16123e     // Catch: java.lang.Throwable -> L63
            int r6 = r6 + r8
            r5.f16123e = r6     // Catch: java.lang.Throwable -> L63
            r5 = r8
            goto L66
        L63:
            r14 = move-exception
            goto L70
        L65:
            r5 = r9
        L66:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r10)
            w0.p.l(r11, r0)
            if (r5 == 0) goto Le
            goto L74
        L6e:
            r14 = move-exception
            goto L72
        L70:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6e
            throw r14     // Catch: java.lang.Throwable -> L6e
        L72:
            monitor-exit(r10)
            throw r14
        L74:
            int r14 = r0.size()
            int r3 = r3 - r14
            if (r3 <= 0) goto L88
            w0.u r14 = r13.f16078a
            int r14 = r14.o()
            r13.f16080c = r14
            int r14 = r13.f16081d
            int r14 = r14 - r3
            r13.f16081d = r14
        L88:
            if (r3 <= 0) goto L8b
            goto L8c
        L8b:
            r8 = r9
        L8c:
            return r8
        L8d:
            r14 = move-exception
            monitor-exit(r4)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.k0.retainAll(java.util.Collection):boolean");
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        v.a(i10, this.f16081d);
        e();
        int i11 = i10 + this.f16079b;
        u uVar = this.f16078a;
        Object obj2 = uVar.set(i11, obj);
        this.f16080c = uVar.o();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f16081d;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > this.f16081d) {
            throw new IllegalArgumentException("fromIndex or toIndex are out of bounds".toString());
        }
        e();
        int i12 = this.f16079b;
        return new k0(this.f16078a, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return d9.i.v(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        e();
        d9.s sVar = new d9.s();
        sVar.f4950a = i10 - 1;
        return new j0(sVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d9.i.w(this, objArr);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        e();
        int i11 = this.f16079b + i10;
        u uVar = this.f16078a;
        Object objRemove = uVar.remove(i11);
        this.f16081d--;
        this.f16080c = uVar.o();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        e();
        int i11 = this.f16079b + i10;
        u uVar = this.f16078a;
        uVar.add(i11, obj);
        this.f16081d++;
        this.f16080c = uVar.o();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f16081d, collection);
    }
}
