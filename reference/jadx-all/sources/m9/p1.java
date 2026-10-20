package m9;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class p1 implements f1, q, w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11989a = AtomicReferenceFieldUpdater.newUpdater(p1.class, Object.class, "_state");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11990b = AtomicReferenceFieldUpdater.newUpdater(p1.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public p1(boolean z10) {
        this._state = z10 ? e0.f11933j : e0.f11932i;
    }

    public static p a0(r9.j jVar) {
        while (jVar.l()) {
            r9.j jVarH = jVar.h();
            if (jVarH == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r9.j.f13713b;
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (r9.j) obj;
                    if (!jVar.l()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = jVarH;
            }
        }
        while (true) {
            jVar = jVar.k();
            if (!jVar.l()) {
                if (jVar instanceof p) {
                    return (p) jVar;
                }
                if (jVar instanceof t1) {
                    return null;
                }
            }
        }
    }

    public static String g0(Object obj) {
        if (!(obj instanceof m1)) {
            if (obj instanceof b1) {
                return ((b1) obj).b() ? "Active" : "New";
            }
            return obj instanceof u ? "Cancelled" : "Completed";
        }
        m1 m1Var = (m1) obj;
        if (m1Var.d()) {
            return "Cancelling";
        }
        return m1Var.e() ? "Completing" : "Active";
    }

    public void A(CancellationException cancellationException) {
        z(cancellationException);
    }

    public final boolean B(Throwable th) {
        if (V()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        o oVar = (o) f11990b.get(this);
        if (oVar == null || oVar == u1.f12007a) {
            return z10;
        }
        return oVar.d(th) || z10;
    }

    public String C() {
        return "Job was cancelled";
    }

    public boolean D(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return z(th) && K();
    }

    public final void E(b1 b1Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11990b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        if (oVar != null) {
            oVar.a();
            atomicReferenceFieldUpdater.set(this, u1.f12007a);
        }
        androidx.fragment.app.a0 a0Var = null;
        u uVar = obj instanceof u ? (u) obj : null;
        Throwable th = uVar != null ? uVar.f12005a : null;
        if (b1Var instanceof j1) {
            try {
                ((j1) b1Var).n(th);
                return;
            } catch (Throwable th2) {
                R(new androidx.fragment.app.a0("Exception in completion handler " + b1Var + " for " + this, th2));
                return;
            }
        }
        t1 t1VarF = b1Var.f();
        if (t1VarF != null) {
            Object objJ = t1VarF.j();
            d7.a.k(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (r9.j jVarK = (r9.j) objJ; !d7.a.d(jVarK, t1VarF); jVarK = jVarK.k()) {
                if (jVarK instanceof j1) {
                    j1 j1Var = (j1) jVarK;
                    try {
                        j1Var.n(th);
                    } catch (Throwable th3) {
                        if (a0Var != null) {
                            d7.a.c(a0Var, th3);
                        } else {
                            a0Var = new androidx.fragment.app.a0("Exception in completion handler " + j1Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (a0Var != null) {
                R(a0Var);
            }
        }
    }

    public final Throwable F(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        p1 p1Var = (p1) ((w1) obj);
        Object objN = p1Var.N();
        if (objN instanceof m1) {
            thC = ((m1) objN).c();
        } else if (objN instanceof u) {
            thC = ((u) objN).f12005a;
        } else {
            if (objN instanceof b1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objN).toString());
            }
            thC = null;
        }
        CancellationException g1Var = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (g1Var == null) {
            g1Var = new g1("Parent job is ".concat(g0(objN)), thC, p1Var);
        }
        return g1Var;
    }

    public final Object G(m1 m1Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thJ;
        u uVar = obj instanceof u ? (u) obj : null;
        Throwable th = uVar != null ? uVar.f12005a : null;
        synchronized (m1Var) {
            m1Var.d();
            ArrayList<Throwable> arrayListG = m1Var.g(th);
            thJ = J(m1Var, arrayListG);
            if (thJ != null && arrayListG.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                for (Throwable th2 : arrayListG) {
                    if (th2 != thJ && th2 != thJ && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        d7.a.c(thJ, th2);
                    }
                }
            }
        }
        if (thJ != null && thJ != th) {
            obj = new u(thJ, false);
        }
        if (thJ != null && (B(thJ) || Q(thJ))) {
            d7.a.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            u.f12004b.compareAndSet((u) obj, 0, 1);
        }
        c0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11989a;
        Object c1Var = obj instanceof b1 ? new c1((b1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, m1Var, c1Var) && atomicReferenceFieldUpdater.get(this) == m1Var) {
        }
        E(m1Var, obj);
        return obj;
    }

    public final CancellationException H() {
        CancellationException cancellationException;
        Object objN = N();
        if (!(objN instanceof m1)) {
            if (objN instanceof b1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objN instanceof u)) {
                return new g1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((u) objN).f12005a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new g1(C(), th, this) : cancellationException;
        }
        Throwable thC = ((m1) objN).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = C();
        }
        return new g1(strConcat, thC, this);
    }

    public final Object I() throws Throwable {
        Object objN = N();
        if (!(!(objN instanceof b1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objN instanceof u) {
            throw ((u) objN).f12005a;
        }
        return e0.N(objN);
    }

    public final Throwable J(m1 m1Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (m1Var.d()) {
                return new g1(C(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!(((Throwable) next) instanceof CancellationException)));
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof d2) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof d2)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean K() {
        return true;
    }

    public boolean L() {
        return this instanceof s;
    }

    public final t1 M(b1 b1Var) {
        t1 t1VarF = b1Var.f();
        if (t1VarF != null) {
            return t1VarF;
        }
        if (b1Var instanceof q0) {
            return new t1();
        }
        if (b1Var instanceof j1) {
            e0((j1) b1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + b1Var).toString());
    }

    public final Object N() {
        while (true) {
            Object obj = f11989a.get(this);
            if (!(obj instanceof r9.p)) {
                return obj;
            }
            ((r9.p) obj).a(this);
        }
    }

    @Override // u8.j
    public final u8.j O(u8.j jVar) {
        d7.a.m(jVar, "context");
        return d7.a.A(this, jVar);
    }

    public boolean Q(Throwable th) {
        return false;
    }

    public void R(androidx.fragment.app.a0 a0Var) {
        throw a0Var;
    }

    public final void S(f1 f1Var) {
        int iF0;
        u1 u1Var = u1.f12007a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11990b;
        if (f1Var == null) {
            atomicReferenceFieldUpdater.set(this, u1Var);
            return;
        }
        p1 p1Var = (p1) f1Var;
        do {
            iF0 = p1Var.f0(p1Var.N());
            if (iF0 == 0) {
                break;
            }
        } while (iF0 != 1);
        o oVar = (o) z6.a.N(p1Var, true, new p(this), 2);
        atomicReferenceFieldUpdater.set(this, oVar);
        if (!(N() instanceof b1)) {
            oVar.a();
            atomicReferenceFieldUpdater.set(this, u1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:97:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00c2 A[SYNTHETIC] */
    public final o0 U(boolean z10, boolean z11, c9.c cVar) {
        j1 p0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable thC;
        if (z10) {
            p0Var = cVar instanceof h1 ? (h1) cVar : null;
            if (p0Var == null) {
                p0Var = new e1(cVar);
            }
        } else {
            p0Var = cVar instanceof j1 ? (j1) cVar : null;
            if (p0Var == null) {
                p0Var = new p0(cVar, 1);
            }
        }
        p0Var.f11954d = this;
        while (true) {
            Object objN = N();
            if (objN instanceof q0) {
                q0 q0Var = (q0) objN;
                if (q0Var.f11991a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11989a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, objN, p0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != objN) {
                        }
                    }
                    return p0Var;
                }
                t1 t1Var = new t1();
                Object a1Var = q0Var.f11991a ? t1Var : new a1(t1Var);
                do {
                    atomicReferenceFieldUpdater = f11989a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, q0Var, a1Var)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == q0Var);
            } else {
                if (!(objN instanceof b1)) {
                    if (z11) {
                        u uVar = objN instanceof u ? (u) objN : null;
                        cVar.invoke(uVar != null ? uVar.f12005a : null);
                    }
                    return u1.f12007a;
                }
                t1 t1VarF = ((b1) objN).f();
                if (t1VarF == null) {
                    d7.a.k(objN, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    e0((j1) objN);
                } else {
                    o0 o0Var = u1.f12007a;
                    if (z10 && (objN instanceof m1)) {
                        synchronized (objN) {
                            try {
                                thC = ((m1) objN).c();
                                if (thC == null || ((cVar instanceof p) && !((m1) objN).e())) {
                                    if (s(objN, t1VarF, p0Var)) {
                                        if (thC == null) {
                                            return p0Var;
                                        }
                                        o0Var = p0Var;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thC != null) {
                            if (z11) {
                                cVar.invoke(thC);
                            }
                            return o0Var;
                        }
                        if (s(objN, t1VarF, p0Var)) {
                            return p0Var;
                        }
                    } else {
                        thC = null;
                        if (thC != null) {
                            if (z11) {
                                cVar.invoke(thC);
                            }
                            return o0Var;
                        }
                        if (s(objN, t1VarF, p0Var)) {
                            return p0Var;
                        }
                    }
                }
            }
        }
    }

    public boolean V() {
        return this instanceof g;
    }

    public final Object W(u8.e eVar) {
        Object objN;
        q8.l lVar;
        do {
            objN = N();
            boolean z10 = objN instanceof b1;
            lVar = q8.l.f13235a;
            if (!z10) {
                h6.g.S(eVar.getContext());
                return lVar;
            }
        } while (f0(objN) < 0);
        l lVar2 = new l(1, d7.t.b0(eVar));
        lVar2.t();
        lVar2.v(new i(U(false, true, new p0(lVar2, 3)), 1));
        Object objS = lVar2.s();
        v8.a aVar = v8.a.f15963a;
        if (objS != aVar) {
            objS = lVar;
        }
        return objS == aVar ? objS : lVar;
    }

    public final boolean X(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objH0;
        do {
            objH0 = h0(N(), obj);
            if (objH0 == e0.f11927d) {
                return false;
            }
            if (objH0 == e0.f11928e) {
                return true;
            }
        } while (objH0 == e0.f11929f);
        t(objH0);
        return true;
    }

    public final Object Y(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objH0;
        do {
            objH0 = h0(N(), obj);
            if (objH0 == e0.f11927d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                u uVar = obj instanceof u ? (u) obj : null;
                throw new IllegalStateException(str, uVar != null ? uVar.f12005a : null);
            }
        } while (objH0 == e0.f11929f);
        return objH0;
    }

    public String Z() {
        return getClass().getSimpleName();
    }

    @Override // m9.f1
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new g1(C(), null, this);
        }
        A(cancellationException);
    }

    @Override // m9.f1
    public boolean b() {
        Object objN = N();
        return (objN instanceof b1) && ((b1) objN).b();
    }

    public final void b0(t1 t1Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Object objJ = t1Var.j();
        d7.a.k(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        androidx.fragment.app.a0 a0Var = null;
        for (r9.j jVarK = (r9.j) objJ; !d7.a.d(jVarK, t1Var); jVarK = jVarK.k()) {
            if (jVarK instanceof h1) {
                j1 j1Var = (j1) jVarK;
                try {
                    j1Var.n(th);
                } catch (Throwable th2) {
                    if (a0Var != null) {
                        d7.a.c(a0Var, th2);
                    } else {
                        a0Var = new androidx.fragment.app.a0("Exception in completion handler " + j1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (a0Var != null) {
            R(a0Var);
        }
        B(th);
    }

    public void c0(Object obj) {
    }

    public void d0() {
    }

    @Override // u8.j
    public final Object e(Object obj, c9.e eVar) {
        return eVar.invoke(obj, this);
    }

    public final void e0(j1 j1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        t1 t1Var = new t1();
        j1Var.getClass();
        r9.j.f13713b.lazySet(t1Var, j1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = r9.j.f13712a;
        atomicReferenceFieldUpdater2.lazySet(t1Var, j1Var);
        loop0: while (j1Var.j() == j1Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(j1Var, j1Var, t1Var)) {
                    t1Var.i(j1Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(j1Var) == j1Var);
        }
        r9.j jVarK = j1Var.k();
        do {
            atomicReferenceFieldUpdater = f11989a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, j1Var, jVarK)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == j1Var);
    }

    @Override // u8.j
    public final u8.h f(u8.i iVar) {
        return z6.a.D(this, iVar);
    }

    public final int f0(Object obj) {
        boolean z10 = obj instanceof q0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11989a;
        if (z10) {
            if (((q0) obj).f11991a) {
                return 0;
            }
            q0 q0Var = e0.f11933j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, q0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            d0();
            return 1;
        }
        if (!(obj instanceof a1)) {
            return 0;
        }
        t1 t1Var = ((a1) obj).f11903a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, t1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        d0();
        return 1;
    }

    public Object g() {
        return I();
    }

    @Override // u8.h
    public final u8.i getKey() {
        return a0.f11902b;
    }

    public final Object h0(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof b1)) {
            return e0.f11927d;
        }
        if (((obj instanceof q0) || (obj instanceof j1)) && !(obj instanceof p) && !(obj2 instanceof u)) {
            b1 b1Var = (b1) obj;
            Object c1Var = obj2 instanceof b1 ? new c1((b1) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f11989a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, b1Var, c1Var)) {
                    c0(obj2);
                    E(b1Var, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == b1Var);
            return e0.f11929f;
        }
        b1 b1Var2 = (b1) obj;
        t1 t1VarM = M(b1Var2);
        if (t1VarM == null) {
            return e0.f11929f;
        }
        p pVarA0 = null;
        m1 m1Var = b1Var2 instanceof m1 ? (m1) b1Var2 : null;
        if (m1Var == null) {
            m1Var = new m1(t1VarM, null);
        }
        synchronized (m1Var) {
            if (m1Var.e()) {
                return e0.f11927d;
            }
            m1.f11971b.set(m1Var, 1);
            if (m1Var != b1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11989a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, b1Var2, m1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != b1Var2) {
                        return e0.f11929f;
                    }
                }
            }
            boolean zD = m1Var.d();
            u uVar = obj2 instanceof u ? (u) obj2 : null;
            if (uVar != null) {
                m1Var.a(uVar.f12005a);
            }
            Throwable thC = m1Var.c();
            if (!Boolean.valueOf(!zD).booleanValue()) {
                thC = null;
            }
            if (thC != null) {
                b0(t1VarM, thC);
            }
            p pVar = b1Var2 instanceof p ? (p) b1Var2 : null;
            if (pVar == null) {
                t1 t1VarF = b1Var2.f();
                if (t1VarF != null) {
                    pVarA0 = a0(t1VarF);
                }
            } else {
                pVarA0 = pVar;
            }
            if (pVarA0 != null) {
                while (z6.a.N(pVarA0.f11986e, false, new l1(this, m1Var, pVarA0, obj2), 1) == u1.f12007a) {
                    pVarA0 = a0(pVarA0);
                    if (pVarA0 == null) {
                    }
                }
                return e0.f11928e;
            }
            return G(m1Var, obj2);
        }
    }

    public final boolean s(Object obj, t1 t1Var, j1 j1Var) {
        char c10;
        n1 n1Var = new n1(j1Var, this, obj);
        do {
            r9.j jVarH = t1Var.h();
            if (jVarH == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r9.j.f13713b;
                Object obj2 = atomicReferenceFieldUpdater.get(t1Var);
                while (true) {
                    jVarH = (r9.j) obj2;
                    if (!jVarH.l()) {
                        break;
                    }
                    obj2 = atomicReferenceFieldUpdater.get(jVarH);
                }
            }
            r9.j.f13713b.lazySet(j1Var, jVarH);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = r9.j.f13712a;
            atomicReferenceFieldUpdater2.lazySet(j1Var, t1Var);
            n1Var.f11978c = t1Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(jVarH, t1Var, n1Var)) {
                    if (n1Var.a(jVarH) != null) {
                        c10 = 2;
                        break;
                    }
                    c10 = 1;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(jVarH) != t1Var) {
                    c10 = 0;
                    break;
                }
            }
            if (c10 == 1) {
                return true;
            }
        } while (c10 != 2);
        return false;
    }

    public void t(Object obj) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Z() + '{' + g0(N()) + '}');
        sb.append('@');
        sb.append(e0.z(this));
        return sb.toString();
    }

    @Override // u8.j
    public final u8.j u(u8.i iVar) {
        return z6.a.V(this, iVar);
    }

    public void v(Object obj) {
        t(obj);
    }

    public final Object y(u8.e eVar) throws Throwable {
        Object objN;
        do {
            objN = N();
            if (!(objN instanceof b1)) {
                if (objN instanceof u) {
                    throw ((u) objN).f12005a;
                }
                return e0.N(objN);
            }
        } while (f0(objN) < 0);
        k1 k1Var = new k1(d7.t.b0(eVar), this);
        k1Var.t();
        k1Var.v(new i(U(false, true, new p0(k1Var, 2)), 1));
        Object objS = k1Var.s();
        v8.a aVar = v8.a.f15963a;
        return objS;
    }

    public final boolean z(Object obj) {
        i3.u uVar;
        Object objH0 = e0.f11927d;
        if (L()) {
            do {
                Object objN = N();
                if (!(objN instanceof b1) || ((objN instanceof m1) && ((m1) objN).e())) {
                    objH0 = e0.f11927d;
                    break;
                }
                objH0 = h0(objN, new u(F(obj), false));
            } while (objH0 == e0.f11929f);
            if (objH0 == e0.f11928e) {
                return true;
            }
        }
        if (objH0 == e0.f11927d) {
            Throwable thF = null;
            loop1: while (true) {
                Object objN2 = N();
                if (objN2 instanceof m1) {
                    synchronized (objN2) {
                        try {
                            if (m1.f11973d.get((m1) objN2) == e0.f11931h) {
                                uVar = e0.f11930g;
                            } else {
                                boolean zD = ((m1) objN2).d();
                                if (thF == null) {
                                    thF = F(obj);
                                }
                                ((m1) objN2).a(thF);
                                Throwable thC = zD ^ true ? ((m1) objN2).c() : null;
                                if (thC != null) {
                                    b0(((m1) objN2).f11974a, thC);
                                }
                                uVar = e0.f11927d;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else if (objN2 instanceof b1) {
                    if (thF == null) {
                        thF = F(obj);
                    }
                    b1 b1Var = (b1) objN2;
                    if (b1Var.b()) {
                        t1 t1VarM = M(b1Var);
                        if (t1VarM == null) {
                            continue;
                        } else {
                            m1 m1Var = new m1(t1VarM, thF);
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11989a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, b1Var, m1Var)) {
                                    b0(t1VarM, thF);
                                    uVar = e0.f11927d;
                                } else if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                                }
                            }
                        }
                    } else {
                        Object objH1 = h0(objN2, new u(thF, false));
                        if (objH1 == e0.f11927d) {
                            throw new IllegalStateException(("Cannot happen in " + objN2).toString());
                        }
                        if (objH1 != e0.f11929f) {
                            objH0 = objH1;
                            break;
                        }
                    }
                } else {
                    uVar = e0.f11930g;
                }
                objH0 = uVar;
                break;
            }
        }
        if (objH0 != e0.f11927d && objH0 != e0.f11928e) {
            if (objH0 == e0.f11930g) {
                return false;
            }
            t(objH0);
        }
        return true;
    }
}
