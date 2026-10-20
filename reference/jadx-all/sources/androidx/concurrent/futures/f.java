package androidx.concurrent.futures;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1776e;

    public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f1772a = atomicReferenceFieldUpdater;
        this.f1773b = atomicReferenceFieldUpdater2;
        this.f1774c = atomicReferenceFieldUpdater3;
        this.f1775d = atomicReferenceFieldUpdater4;
        this.f1776e = atomicReferenceFieldUpdater5;
    }

    @Override // androidx.concurrent.futures.a
    public final boolean a(j jVar, e eVar, e eVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1775d;
            if (atomicReferenceFieldUpdater.compareAndSet(jVar, eVar, eVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(jVar) == eVar);
        return false;
    }

    @Override // androidx.concurrent.futures.a
    public final boolean b(j jVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1776e;
            if (atomicReferenceFieldUpdater.compareAndSet(jVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(jVar) == obj);
        return false;
    }

    @Override // androidx.concurrent.futures.a
    public final boolean c(j jVar, i iVar, i iVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1774c;
            if (atomicReferenceFieldUpdater.compareAndSet(jVar, iVar, iVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(jVar) == iVar);
        return false;
    }

    @Override // androidx.concurrent.futures.a
    public final void d(i iVar, i iVar2) {
        this.f1773b.lazySet(iVar, iVar2);
    }

    @Override // androidx.concurrent.futures.a
    public final void e(i iVar, Thread thread) {
        this.f1772a.lazySet(iVar, thread);
    }
}
