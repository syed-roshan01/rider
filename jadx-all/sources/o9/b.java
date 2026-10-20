package o9;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m9.i2;

/* JADX INFO: loaded from: classes.dex */
public final class b implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12672a = e.f12702p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m9.l f12673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f12674c;

    public b(c cVar) {
        this.f12674c = cVar;
    }

    @Override // m9.i2
    public final void a(r9.t tVar, int i10) throws IllegalAccessException, InvocationTargetException {
        m9.l lVar = this.f12673b;
        if (lVar != null) {
            lVar.a(tVar, i10);
        }
    }

    public final Object b(w8.c cVar) throws Throwable {
        k kVar;
        m9.l lVar;
        Boolean bool;
        k kVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f12680o;
        c cVar2 = this.f12674c;
        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar2);
        while (true) {
            cVar2.getClass();
            if (cVar2.w(c.f12675c.get(cVar2), true)) {
                this.f12672a = e.f12698l;
                Throwable thQ = cVar2.q();
                if (thQ == null) {
                    return Boolean.FALSE;
                }
                int i10 = r9.u.f13729a;
                throw thQ;
            }
            long andIncrement = c.f12676d.getAndIncrement(cVar2);
            long j10 = e.f12688b;
            long j11 = andIncrement / j10;
            int i11 = (int) (andIncrement % j10);
            if (kVar3.f13728c != j11) {
                k kVarP = cVar2.p(j11, kVar3);
                if (kVarP == null) {
                    continue;
                } else {
                    kVar = kVarP;
                }
            } else {
                kVar = kVar3;
            }
            Object objE = cVar2.E(kVar, i11, andIncrement, null);
            i3.u uVar = e.f12699m;
            if (objE == uVar) {
                throw new IllegalStateException("unreachable".toString());
            }
            i3.u uVar2 = e.f12701o;
            if (objE == uVar2) {
                if (andIncrement < cVar2.u()) {
                    kVar.a();
                }
                kVar3 = kVar;
            } else {
                if (objE != e.f12700n) {
                    kVar.a();
                    this.f12672a = objE;
                    return Boolean.TRUE;
                }
                c cVar3 = this.f12674c;
                m9.l lVarW = d7.a.w(d7.t.b0(cVar));
                try {
                    this.f12673b = lVarW;
                    lVar = lVarW;
                    try {
                        Object objE2 = cVar3.E(kVar, i11, andIncrement, this);
                        if (objE2 != uVar) {
                            b.g gVarF = null;
                            u8.j jVar = lVar.f11962e;
                            c9.c cVar4 = cVar3.f12685b;
                            if (objE2 == uVar2) {
                                if (andIncrement < cVar3.u()) {
                                    kVar.a();
                                }
                                k kVar4 = (k) c.f12680o.get(cVar3);
                                while (true) {
                                    if (cVar3.w(c.f12675c.get(cVar3), true)) {
                                        m9.l lVar2 = this.f12673b;
                                        d7.a.j(lVar2);
                                        this.f12673b = null;
                                        this.f12672a = e.f12698l;
                                        Throwable thQ2 = cVar2.q();
                                        if (thQ2 != null) {
                                            lVar2.resumeWith(d7.t.N(thQ2));
                                            break;
                                        }
                                        lVar2.resumeWith(Boolean.FALSE);
                                        break;
                                    }
                                    long andIncrement2 = c.f12676d.getAndIncrement(cVar3);
                                    long j12 = e.f12688b;
                                    long j13 = andIncrement2 / j12;
                                    int i12 = (int) (andIncrement2 % j12);
                                    if (kVar4.f13728c != j13) {
                                        k kVarP2 = cVar3.p(j13, kVar4);
                                        if (kVarP2 != null) {
                                            kVar2 = kVarP2;
                                        }
                                    } else {
                                        kVar2 = kVar4;
                                    }
                                    c9.c cVar5 = cVar4;
                                    Object objE3 = cVar3.E(kVar2, i12, andIncrement2, this);
                                    if (objE3 == e.f12699m) {
                                        a(kVar2, i12);
                                        break;
                                    }
                                    if (objE3 == e.f12701o) {
                                        if (andIncrement2 < cVar3.u()) {
                                            kVar2.a();
                                        }
                                        cVar4 = cVar5;
                                        kVar4 = kVar2;
                                    } else {
                                        if (objE3 == e.f12700n) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        kVar2.a();
                                        this.f12672a = objE3;
                                        this.f12673b = null;
                                        bool = Boolean.TRUE;
                                        if (cVar5 != null) {
                                            gVarF = d7.a.f(cVar5, objE3, jVar);
                                        }
                                    }
                                }
                            } else {
                                kVar.a();
                                this.f12672a = objE2;
                                this.f12673b = null;
                                bool = Boolean.TRUE;
                                if (cVar4 != null) {
                                    gVarF = d7.a.f(cVar4, objE2, jVar);
                                }
                            }
                            lVar.o(gVarF, bool);
                            break;
                        }
                        a(kVar, i11);
                        Object objS = lVar.s();
                        v8.a aVar = v8.a.f15963a;
                        return objS;
                    } catch (Throwable th) {
                        th = th;
                        lVar.C();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    lVar = lVarW;
                }
            }
        }
    }

    public final Object c() throws Throwable {
        Object obj = this.f12672a;
        i3.u uVar = e.f12702p;
        if (obj == uVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
        this.f12672a = uVar;
        if (obj != e.f12698l) {
            return obj;
        }
        Throwable thS = this.f12674c.s();
        int i10 = r9.u.f13729a;
        throw thS;
    }
}
