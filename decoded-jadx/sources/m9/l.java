package m9;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class l extends l0 implements k, w8.d, i2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f11958f = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decisionAndIndex");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11959n = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11960o = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u8.e f11961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u8.j f11962e;

    public l(int i10, u8.e eVar) {
        super(i10);
        this.f11961d = eVar;
        this.f11962e = eVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = b.f11905a;
    }

    public static void A(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object E(v1 v1Var, Object obj, int i10, c9.c cVar) {
        if ((obj instanceof u) || !z6.a.O(i10)) {
            return obj;
        }
        if (cVar != null || (v1Var instanceof j)) {
            return new t(obj, v1Var instanceof j ? (j) v1Var : null, cVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public String B() {
        return "CancellableContinuation";
    }

    public final void C() throws IllegalAccessException, InvocationTargetException {
        u8.e eVar = this.f11961d;
        Throwable th = null;
        r9.h hVar = eVar instanceof r9.h ? (r9.h) eVar : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r9.h.f13701o;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                i3.u uVar = r9.a.f13691d;
                if (obj != uVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(hVar, uVar, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(hVar) == uVar);
            }
            if (th == null) {
                return;
            }
            p();
            l(th);
        }
    }

    public final void D(Object obj, int i10, c9.c cVar) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11959n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof v1)) {
                if (obj2 instanceof m) {
                    m mVar = (m) obj2;
                    mVar.getClass();
                    if (m.f11968c.compareAndSet(mVar, 0, 1)) {
                        if (cVar != null) {
                            m(cVar, mVar.f12005a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objE = E((v1) obj2, obj, i10, cVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                    if (!z()) {
                        p();
                    }
                    q(i10);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final i3.u F(Object obj, c9.c cVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11959n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z10 = obj2 instanceof v1;
            i3.u uVar = e0.f11924a;
            if (!z10) {
                boolean z11 = obj2 instanceof t;
                return null;
            }
            Object objE = E((v1) obj2, obj, this.f11963c, cVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                    if (!z()) {
                        p();
                    }
                    return uVar;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // m9.i2
    public final void a(r9.t tVar, int i10) throws IllegalAccessException, InvocationTargetException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f11958f;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        y(tVar);
    }

    @Override // m9.k
    public final boolean b() {
        return f11959n.get(this) instanceof v1;
    }

    @Override // m9.l0
    public final void c(Object obj, CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11959n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof v1) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof u) {
                return;
            }
            if (!(obj2 instanceof t)) {
                t tVar = new t(obj2, (j) null, (c9.c) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            t tVar2 = (t) obj2;
            if (!(!(tVar2.f12001e != null))) {
                throw new IllegalStateException("Must be called at most once".toString());
            }
            t tVarA = t.a(tVar2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVarA)) {
                    j jVar = tVar2.f11998b;
                    if (jVar != null) {
                        j(jVar, cancellationException);
                    }
                    c9.c cVar = tVar2.f11999c;
                    if (cVar != null) {
                        m(cVar, cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // m9.k
    public final void d(z zVar) throws IllegalAccessException, InvocationTargetException {
        q8.l lVar = q8.l.f13235a;
        u8.e eVar = this.f11961d;
        r9.h hVar = eVar instanceof r9.h ? (r9.h) eVar : null;
        D(lVar, (hVar != null ? hVar.f13702d : null) == zVar ? 4 : this.f11963c, null);
    }

    @Override // m9.l0
    public final u8.e e() {
        return this.f11961d;
    }

    @Override // m9.l0
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // m9.l0
    public final Object g(Object obj) {
        return obj instanceof t ? ((t) obj).f11997a : obj;
    }

    @Override // w8.d
    public final w8.d getCallerFrame() {
        u8.e eVar = this.f11961d;
        if (eVar instanceof w8.d) {
            return (w8.d) eVar;
        }
        return null;
    }

    @Override // u8.e
    public final u8.j getContext() {
        return this.f11962e;
    }

    @Override // m9.l0
    public final Object i() {
        return f11959n.get(this);
    }

    public final void j(j jVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            jVar.a(th);
        } catch (Throwable th2) {
            h6.g.n0(this.f11962e, new androidx.fragment.app.a0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // m9.k
    public final i3.u k(Object obj, c9.c cVar) {
        return F(obj, cVar);
    }

    @Override // m9.k
    public final boolean l(Throwable th) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11959n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof v1)) {
                return false;
            }
            m mVar = new m(this, th, (obj instanceof j) || (obj instanceof r9.t));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                    v1 v1Var = (v1) obj;
                    if (v1Var instanceof j) {
                        j((j) obj, th);
                    } else if (v1Var instanceof r9.t) {
                        n((r9.t) obj, th);
                    }
                    if (!z()) {
                        p();
                    }
                    q(this.f11963c);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final void m(c9.c cVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            cVar.invoke(th);
        } catch (Throwable th2) {
            h6.g.n0(this.f11962e, new androidx.fragment.app.a0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(r9.t tVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        u8.j jVar = this.f11962e;
        int i10 = f11958f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            tVar.g(i10, jVar);
        } catch (Throwable th2) {
            h6.g.n0(jVar, new androidx.fragment.app.a0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // m9.k
    public final void o(c9.c cVar, Object obj) throws IllegalAccessException, InvocationTargetException {
        D(obj, this.f11963c, cVar);
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11960o;
        o0 o0Var = (o0) atomicReferenceFieldUpdater.get(this);
        if (o0Var == null) {
            return;
        }
        o0Var.a();
        atomicReferenceFieldUpdater.set(this, u1.f12007a);
    }

    public final void q(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f11958f;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                boolean z10 = i10 == 4;
                u8.e eVar = this.f11961d;
                if (z10 || !(eVar instanceof r9.h) || z6.a.O(i10) != z6.a.O(this.f11963c)) {
                    z6.a.c0(this, eVar, z10);
                    return;
                }
                z zVar = ((r9.h) eVar).f13702d;
                u8.j context = eVar.getContext();
                if (zVar.d0()) {
                    zVar.c0(context, this);
                    return;
                }
                w0 w0VarA = a2.a();
                if (w0VarA.j0()) {
                    w0VarA.g0(this);
                    return;
                }
                w0VarA.i0(true);
                try {
                    z6.a.c0(this, eVar, true);
                    do {
                    } while (w0VarA.l0());
                } catch (Throwable th) {
                    try {
                        h(th, null);
                    } finally {
                        w0VarA.f0(true);
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    public Throwable r(p1 p1Var) {
        return p1Var.H();
    }

    @Override // u8.e
    public final void resumeWith(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thA = q8.h.a(obj);
        if (thA != null) {
            obj = new u(thA, false);
        }
        D(obj, this.f11963c, null);
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        boolean z10 = z();
        do {
            atomicIntegerFieldUpdater = f11958f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                if (z10) {
                    C();
                }
                Object obj = f11959n.get(this);
                if (obj instanceof u) {
                    throw ((u) obj).f12005a;
                }
                if (z6.a.O(this.f11963c)) {
                    f1 f1Var = (f1) this.f11962e.f(a0.f11902b);
                    if (f1Var != null && !f1Var.b()) {
                        CancellationException cancellationExceptionH = ((p1) f1Var).H();
                        c(obj, cancellationExceptionH);
                        throw cancellationExceptionH;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((o0) f11960o.get(this)) == null) {
            u();
        }
        if (z10) {
            C();
        }
        return v8.a.f15963a;
    }

    public final void t() {
        o0 o0VarU = u();
        if (o0VarU != null && (!(f11959n.get(this) instanceof v1))) {
            o0VarU.a();
            f11960o.set(this, u1.f12007a);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(B());
        sb.append('(');
        sb.append(e0.M(this.f11961d));
        sb.append("){");
        Object obj = f11959n.get(this);
        if (obj instanceof v1) {
            str = "Active";
        } else {
            str = obj instanceof m ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(e0.z(this));
        return sb.toString();
    }

    public final o0 u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        f1 f1Var = (f1) this.f11962e.f(a0.f11902b);
        if (f1Var == null) {
            return null;
        }
        o0 o0VarN = z6.a.N(f1Var, true, new n(this), 2);
        do {
            atomicReferenceFieldUpdater = f11960o;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, o0VarN)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return o0VarN;
    }

    public final void v(c9.c cVar) {
        y(cVar instanceof j ? (j) cVar : new i(cVar, 2));
    }

    @Override // m9.k
    public final i3.u w(Throwable th) {
        return F(new u(th, false), null);
    }

    @Override // m9.k
    public final void x(Object obj) {
        q(this.f11963c);
    }

    public final void y(Object obj) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11959n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            if ((obj2 instanceof j) || (obj2 instanceof r9.t)) {
                A(obj, obj2);
                throw null;
            }
            boolean z10 = obj2 instanceof u;
            if (z10) {
                u uVar = (u) obj2;
                uVar.getClass();
                if (!u.f12004b.compareAndSet(uVar, 0, 1)) {
                    A(obj, obj2);
                    throw null;
                }
                if (obj2 instanceof m) {
                    if (!z10) {
                        uVar = null;
                    }
                    Throwable th = uVar != null ? uVar.f12005a : null;
                    if (obj instanceof j) {
                        j((j) obj, th);
                        return;
                    } else {
                        d7.a.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        n((r9.t) obj, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj2 instanceof t)) {
                if (obj instanceof r9.t) {
                    return;
                }
                d7.a.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                t tVar = new t(obj2, (j) obj, (c9.c) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            t tVar2 = (t) obj2;
            if (tVar2.f11998b != null) {
                A(obj, obj2);
                throw null;
            }
            if (obj instanceof r9.t) {
                return;
            }
            d7.a.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            j jVar = (j) obj;
            Throwable th2 = tVar2.f12001e;
            if (th2 != null) {
                j(jVar, th2);
                return;
            }
            t tVarA = t.a(tVar2, jVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                }
            }
            return;
        }
    }

    public final boolean z() {
        if (this.f11963c == 2) {
            u8.e eVar = this.f11961d;
            d7.a.k(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (r9.h.f13701o.get((r9.h) eVar) != null) {
                return true;
            }
        }
        return false;
    }
}
