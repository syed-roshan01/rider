package s;

import android.app.Activity;
import com.auto.accept.data.model.SupportedApp;
import f0.k1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k0.e1;
import m0.a2;
import m0.g2;
import m9.f1;
import m9.p1;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13792b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, int i10) {
        super(2);
        this.f13791a = i10;
        this.f13792b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Set set) {
        Collection collectionP0;
        m9.k kVarU = null;
        switch (this.f13791a) {
            case 6:
                g2 g2Var = (g2) this.f13792b;
                synchronized (g2Var.f11520b) {
                    try {
                        if (((a2) g2Var.f11536r.getValue()).compareTo(a2.f11451e) >= 0) {
                            if (set instanceof o0.d) {
                                o0.d dVar = (o0.d) set;
                                Object[] objArr = dVar.f12333b;
                                int i10 = dVar.f12332a;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    Object obj = objArr[i11];
                                    d7.a.k(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    if (!(obj instanceof w0.h0) || ((w0.h0) obj).b(1)) {
                                        g2Var.f11525g.add(obj);
                                    }
                                }
                            } else {
                                for (Object obj2 : set) {
                                    if (!(obj2 instanceof w0.h0) || ((w0.h0) obj2).b(1)) {
                                        g2Var.f11525g.add(obj2);
                                    }
                                }
                            }
                            kVarU = g2Var.u();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (kVarU != null) {
                    kVarU.resumeWith(q8.l.f13235a);
                    return;
                }
                return;
            case 7:
                Set set2 = set;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    return;
                }
                for (Object obj3 : set2) {
                    if (!(obj3 instanceof w0.h0) || ((w0.h0) obj3).b(4)) {
                        ((o9.g) this.f13792b).n(set);
                        return;
                    }
                }
                return;
            default:
                w0.a0 a0Var = (w0.a0) this.f13792b;
                while (true) {
                    AtomicReference atomicReference = a0Var.f16023b;
                    Object obj4 = atomicReference.get();
                    if (obj4 == null) {
                        collectionP0 = set;
                    } else if (obj4 instanceof Set) {
                        collectionP0 = d7.t.e0(obj4, set);
                    } else {
                        if (!(obj4 instanceof List)) {
                            m0.s.g("Unexpected notification");
                            throw null;
                        }
                        collectionP0 = r8.p.P0(d7.t.d0(set), (Collection) obj4);
                    }
                    do {
                        if (atomicReference.compareAndSet(obj4, collectionP0)) {
                            if (w0.a0.a(a0Var)) {
                                a0Var.f16022a.invoke(new t.l0(a0Var, 17));
                                return;
                            }
                            return;
                        }
                    } while (atomicReference.get() == obj4);
                }
                break;
        }
    }

    public final void b(m0.m mVar, int i10) {
        int i11 = this.f13791a;
        Object obj = this.f13792b;
        switch (i11) {
            case 10:
                if ((i10 & 11) == 2) {
                    m0.q qVar = (m0.q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                    }
                }
                ((u1.a) obj).a(mVar, 8);
                break;
            case 11:
                if ((i10 & 11) == 2) {
                    m0.q qVar2 = (m0.q) mVar;
                    if (qVar2.G()) {
                        qVar2.U();
                    }
                }
                m9.e0.j(new c5.i((Activity) obj, 0), null, false, null, null, null, null, null, null, c5.c.f2975g, mVar, 805306368, 510);
                break;
            default:
                if ((i10 & 11) == 2) {
                    m0.q qVar3 = (m0.q) mVar;
                    if (qVar3.G()) {
                        qVar3.U();
                    }
                }
                i1.f fVarB = z6.a.f17310k;
                if (fVarB == null) {
                    i1.e eVar = new i1.e("Filled.OpenInNew", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i12 = i1.h0.f7832a;
                    e1.n0 n0Var = new e1.n0(e1.r.f5060b);
                    k.f fVar = new k.f(7);
                    fVar.D(19.0f, 19.0f);
                    fVar.z(5.0f);
                    fVar.J(5.0f);
                    fVar.A(7.0f);
                    fVar.J(3.0f);
                    fVar.z(5.0f);
                    fVar.v(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    fVar.K(14.0f);
                    fVar.v(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                    fVar.A(14.0f);
                    fVar.v(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    fVar.K(-7.0f);
                    fVar.A(-2.0f);
                    fVar.K(7.0f);
                    fVar.p();
                    fVar.D(14.0f, 3.0f);
                    fVar.K(2.0f);
                    fVar.A(3.59f);
                    fVar.C(-9.83f, 9.83f);
                    fVar.C(1.41f, 1.41f);
                    fVar.B(19.0f, 6.41f);
                    fVar.J(10.0f);
                    fVar.A(2.0f);
                    fVar.J(3.0f);
                    fVar.A(-7.0f);
                    fVar.p();
                    i1.e.a(eVar, (ArrayList) fVar.f8599b, n0Var);
                    fVarB = eVar.b();
                    z6.a.f17310k = fVarB;
                }
                e1.b(fVarB, l.q.x("Open ", ((SupportedApp) obj).getName()), null, e5.a.f5125a, mVar, 0, 4);
                break;
        }
    }

    public final long d(long j10, m2.l lVar) {
        int i10 = this.f13791a;
        Object obj = this.f13792b;
        switch (i10) {
            case 1:
                return i1.b.c(0, ((y0.f) ((y0.c) obj)).a(0, (int) (j10 & 4294967295L)));
            case 2:
                return ((y0.g) ((y0.d) obj)).a(0L, j10, lVar);
            default:
                return i1.b.c(((y0.e) ((y0.b) obj)).a(0, (int) (j10 >> 32), lVar), 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x004d, please report this as an issue */
    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f13791a;
        boolean z10 = false;
        f1 f1Var = null;
        Object obj3 = this.f13792b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) obj;
                j0 j0Var2 = (j0) obj2;
                j0 j0Var3 = j0.f13803c;
                if (j0Var == j0Var3 && j0Var2 == j0Var3 && !((r0) obj3).f13861a.f13756c) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 1:
                return new m2.i(d(((m2.k) obj).f11814a, (m2.l) obj2));
            case 2:
                return new m2.i(d(((m2.k) obj).f11814a, (m2.l) obj2));
            case 3:
                return new m2.i(d(((m2.k) obj).f11814a, (m2.l) obj2));
            case 4:
                ((Number) obj2).longValue();
                a7.a.w(obj3);
                m0.p0 p0Var = h0.n0.f7431a;
                return null;
            case 5:
                ((k1) obj3).h(((d1.c) obj2).f4330a);
                return lVar;
            case 6:
                a((Set) obj);
                return lVar;
            case 7:
                a((Set) obj);
                return lVar;
            case 8:
                a((Set) obj);
                return lVar;
            case 9:
                y0.o oVar = (y0.o) obj;
                y0.o oVarG = (y0.m) obj2;
                if (oVarG instanceof y0.j) {
                    c9.f fVar = ((y0.j) oVarG).f16727c;
                    d7.a.k(fVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    z6.a.f(3, fVar);
                    m0.m mVar = (m0.m) obj3;
                    oVarG = m9.e0.G(mVar, (y0.o) fVar.e(y0.l.f16729b, mVar, 0));
                }
                return oVar.j(oVarG);
            case 10:
                b((m0.m) obj, ((Number) obj2).intValue());
                return lVar;
            case 11:
                b((m0.m) obj, ((Number) obj2).intValue());
                return lVar;
            case 12:
                b((m0.m) obj, ((Number) obj2).intValue());
                return lVar;
            default:
                int iIntValue = ((Number) obj).intValue();
                u8.h hVar = (u8.h) obj2;
                u8.i key = hVar.getKey();
                u8.h hVarF = ((q9.u) obj3).f13286b.f(key);
                if (key != m9.a0.f11902b) {
                    return Integer.valueOf(hVar != hVarF ? Integer.MIN_VALUE : iIntValue + 1);
                }
                f1 f1Var2 = (f1) hVarF;
                f1 parent = (f1) hVar;
                while (parent != null) {
                    if (parent == f1Var2 || !(parent instanceof r9.s)) {
                        f1Var = parent;
                        if (f1Var == f1Var2) {
                            if (f1Var2 != null) {
                                iIntValue++;
                            }
                            return Integer.valueOf(iIntValue);
                        }
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + f1Var + ", expected child of " + f1Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    m9.o oVar2 = (m9.o) p1.f11990b.get((p1) parent);
                    parent = oVar2 != null ? oVar2.getParent() : null;
                }
                if (f1Var == f1Var2) {
                    if (f1Var2 != null) {
                        iIntValue++;
                    }
                    return Integer.valueOf(iIntValue);
                }
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + f1Var + ", expected child of " + f1Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
    }
}
