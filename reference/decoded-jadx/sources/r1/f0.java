package r1;

import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import m0.k2;
import m0.o3;
import t1.w1;
import u1.z3;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements m0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.a f13359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0.u f13360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k1 f13361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13363e;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13372u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13373v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f13364f = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f13365n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a0 f13366o = new a0(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f13367p = new y(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap f13368q = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j1 f13369r = new j1();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f13370s = new LinkedHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o0.i f13371t = new o0.i(new Object[16]);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f13374w = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public f0(androidx.compose.ui.node.a aVar, k1 k1Var) {
        this.f13359a = aVar;
        this.f13361c = k1Var;
    }

    public static k2 i(k2 k2Var, androidx.compose.ui.node.a aVar, boolean z10, m0.u uVar, u0.b bVar) {
        if (k2Var == null || ((m0.x) k2Var).f11748z) {
            ViewGroup.LayoutParams layoutParams = z3.f15392a;
            w1 w1Var = new w1(aVar);
            Object obj = m0.y.f11761a;
            k2Var = new m0.x(uVar, w1Var);
        }
        if (z10) {
            m0.x xVar = (m0.x) k2Var;
            m0.q qVar = xVar.f11747y;
            qVar.f11654y = 100;
            qVar.f11653x = true;
            xVar.o(bVar);
            if (qVar.E || qVar.f11654y != 100) {
                throw new IllegalArgumentException("Cannot disable reuse from root if it was caused by other groups".toString());
            }
            qVar.f11654y = -1;
            qVar.f11653x = false;
        } else {
            ((m0.x) k2Var).o(bVar);
        }
        return k2Var;
    }

    @Override // m0.j
    public final void a() {
        f(false);
    }

    @Override // m0.j
    public final void b() {
        androidx.compose.ui.node.a aVar = this.f13359a;
        aVar.f1746r = true;
        HashMap map = this.f13364f;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            k2 k2Var = ((x) it.next()).f13419c;
            if (k2Var != null) {
                ((m0.x) k2Var).a();
            }
        }
        aVar.K();
        aVar.f1746r = false;
        map.clear();
        this.f13365n.clear();
        this.f13373v = 0;
        this.f13372u = 0;
        this.f13368q.clear();
        e();
    }

    @Override // m0.j
    public final void c() {
        f(true);
    }

    public final void d(int i10) {
        this.f13372u = 0;
        androidx.compose.ui.node.a aVar = this.f13359a;
        int size = (aVar.o().size() - this.f13373v) - 1;
        if (i10 <= size) {
            j1 j1Var = this.f13369r;
            j1Var.clear();
            HashMap map = this.f13364f;
            Set set = j1Var.f13390a;
            if (i10 <= size) {
                int i11 = i10;
                while (true) {
                    Object obj = map.get((androidx.compose.ui.node.a) aVar.o().get(i11));
                    d7.a.j(obj);
                    set.add(((x) obj).f13417a);
                    if (i11 == size) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f13361c.b(j1Var);
            w0.i iVarC = k0.y0.c();
            try {
                w0.i iVarJ = iVarC.j();
                boolean z10 = false;
                while (size >= i10) {
                    try {
                        androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) aVar.o().get(size);
                        Object obj2 = map.get(aVar2);
                        d7.a.j(obj2);
                        x xVar = (x) obj2;
                        Object obj3 = xVar.f13417a;
                        if (set.contains(obj3)) {
                            this.f13372u++;
                            if (((Boolean) xVar.f13422f.getValue()).booleanValue()) {
                                t1.n0 n0Var = aVar2.D;
                                n0Var.f14508o.f14483r = 3;
                                t1.k0 k0Var = n0Var.f14509p;
                                if (k0Var != null) {
                                    k0Var.f14466p = 3;
                                }
                                xVar.f13422f.setValue(Boolean.FALSE);
                                z10 = true;
                            }
                        } else {
                            aVar.f1746r = true;
                            map.remove(aVar2);
                            k2 k2Var = xVar.f13419c;
                            if (k2Var != null) {
                                ((m0.x) k2Var).a();
                            }
                            aVar.L(size, 1);
                            aVar.f1746r = false;
                        }
                        this.f13365n.remove(obj3);
                        size--;
                    } catch (Throwable th) {
                        w0.i.p(iVarJ);
                        throw th;
                    }
                }
                w0.i.p(iVarJ);
                iVarC.c();
                if (z10) {
                    k0.y0.g();
                }
            } catch (Throwable th2) {
                iVarC.c();
                throw th2;
            }
        }
        e();
    }

    public final void e() {
        int size = this.f13359a.o().size();
        HashMap map = this.f13364f;
        if (map.size() != size) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + map.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((size - this.f13372u) - this.f13373v < 0) {
            StringBuilder sbQ = a7.a.q("Incorrect state. Total children ", size, ". Reusable children ");
            sbQ.append(this.f13372u);
            sbQ.append(". Precomposed children ");
            sbQ.append(this.f13373v);
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        HashMap map2 = this.f13368q;
        if (map2.size() == this.f13373v) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f13373v + ". Map size " + map2.size()).toString());
    }

    public final void f(boolean z10) {
        this.f13373v = 0;
        this.f13368q.clear();
        androidx.compose.ui.node.a aVar = this.f13359a;
        int size = aVar.o().size();
        if (this.f13372u != size) {
            this.f13372u = size;
            w0.i iVarC = k0.y0.c();
            try {
                w0.i iVarJ = iVarC.j();
                for (int i10 = 0; i10 < size; i10++) {
                    try {
                        androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) aVar.o().get(i10);
                        x xVar = (x) this.f13364f.get(aVar2);
                        if (xVar != null && ((Boolean) xVar.f13422f.getValue()).booleanValue()) {
                            t1.n0 n0Var = aVar2.D;
                            n0Var.f14508o.f14483r = 3;
                            t1.k0 k0Var = n0Var.f14509p;
                            if (k0Var != null) {
                                k0Var.f14466p = 3;
                            }
                            if (z10) {
                                k2 k2Var = xVar.f13419c;
                                if (k2Var != null) {
                                    ((m0.x) k2Var).p();
                                }
                                xVar.f13422f = d7.t.g0(Boolean.FALSE, o3.f11621a);
                            } else {
                                xVar.f13422f.setValue(Boolean.FALSE);
                            }
                            xVar.f13417a = e1.f13358a;
                        }
                    } catch (Throwable th) {
                        w0.i.p(iVarJ);
                        throw th;
                    }
                }
                w0.i.p(iVarJ);
                iVarC.c();
                this.f13365n.clear();
            } catch (Throwable th2) {
                iVarC.c();
                throw th2;
            }
        }
        e();
    }

    public final f1 g(Object obj, c9.e eVar) {
        androidx.compose.ui.node.a aVar = this.f13359a;
        if (!aVar.C()) {
            return new d0();
        }
        e();
        if (!this.f13365n.containsKey(obj)) {
            this.f13370s.remove(obj);
            HashMap map = this.f13368q;
            Object objJ = map.get(obj);
            if (objJ == null) {
                objJ = j(obj);
                if (objJ != null) {
                    int iIndexOf = aVar.o().indexOf(objJ);
                    int size = aVar.o().size();
                    aVar.f1746r = true;
                    aVar.G(iIndexOf, size, 1);
                    aVar.f1746r = false;
                    this.f13373v++;
                } else {
                    int size2 = aVar.o().size();
                    androidx.compose.ui.node.a aVar2 = new androidx.compose.ui.node.a(true, 2);
                    aVar.f1746r = true;
                    aVar.v(size2, aVar2);
                    aVar.f1746r = false;
                    this.f13373v++;
                    objJ = aVar2;
                }
                map.put(obj, objJ);
            }
            h((androidx.compose.ui.node.a) objJ, obj, eVar);
        }
        return new e0(this, obj);
    }

    public final void h(androidx.compose.ui.node.a aVar, Object obj, c9.e eVar) {
        boolean z10;
        HashMap map = this.f13364f;
        Object obj2 = map.get(aVar);
        Object obj3 = obj2;
        if (obj2 == null) {
            u0.b bVar = j.f13389a;
            x xVar = new x();
            xVar.f13417a = obj;
            xVar.f13418b = bVar;
            xVar.f13419c = null;
            xVar.f13422f = d7.t.g0(Boolean.TRUE, o3.f11621a);
            map.put(aVar, xVar);
            obj3 = xVar;
        }
        x xVar2 = (x) obj3;
        k2 k2Var = xVar2.f13419c;
        if (k2Var != null) {
            m0.x xVar3 = (m0.x) k2Var;
            synchronized (xVar3.f11733d) {
                z10 = xVar3.f11742t.f12327c > 0;
            }
        } else {
            z10 = true;
        }
        if (xVar2.f13418b != eVar || z10 || xVar2.f13420d) {
            xVar2.f13418b = eVar;
            w0.i iVarC = k0.y0.c();
            try {
                w0.i iVarJ = iVarC.j();
                try {
                    androidx.compose.ui.node.a aVar2 = this.f13359a;
                    aVar2.f1746r = true;
                    c9.e eVar2 = xVar2.f13418b;
                    k2 k2Var2 = xVar2.f13419c;
                    m0.u uVar = this.f13360b;
                    if (uVar == null) {
                        throw new IllegalStateException("parent composition reference not set".toString());
                    }
                    xVar2.f13419c = i(k2Var2, aVar, xVar2.f13421e, uVar, new u0.b(-1750409193, new v.n0(9, xVar2, eVar2), true));
                    xVar2.f13421e = false;
                    aVar2.f1746r = false;
                    w0.i.p(iVarJ);
                    iVarC.c();
                    xVar2.f13420d = false;
                } catch (Throwable th) {
                    w0.i.p(iVarJ);
                    throw th;
                }
            } catch (Throwable th2) {
                iVarC.c();
                throw th2;
            }
        }
    }

    public final androidx.compose.ui.node.a j(Object obj) {
        HashMap map;
        int i10;
        if (this.f13372u == 0) {
            return null;
        }
        androidx.compose.ui.node.a aVar = this.f13359a;
        int size = aVar.o().size() - this.f13373v;
        int i11 = size - this.f13372u;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            map = this.f13364f;
            if (i13 < i11) {
                i10 = -1;
                break;
            }
            Object obj2 = map.get((androidx.compose.ui.node.a) aVar.o().get(i13));
            d7.a.j(obj2);
            if (d7.a.d(((x) obj2).f13417a, obj)) {
                i10 = i13;
                break;
            }
            i13--;
        }
        if (i10 == -1) {
            while (true) {
                if (i12 < i11) {
                    i13 = i12;
                    break;
                }
                Object obj3 = map.get((androidx.compose.ui.node.a) aVar.o().get(i12));
                d7.a.j(obj3);
                x xVar = (x) obj3;
                Object obj4 = xVar.f13417a;
                if (obj4 == e1.f13358a || this.f13361c.a(obj, obj4)) {
                    xVar.f13417a = obj;
                    i13 = i12;
                    i10 = i13;
                    break;
                }
                i12--;
            }
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            aVar.f1746r = true;
            aVar.G(i13, i11, 1);
            aVar.f1746r = false;
        }
        this.f13372u--;
        androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) aVar.o().get(i11);
        Object obj5 = map.get(aVar2);
        d7.a.j(obj5);
        x xVar2 = (x) obj5;
        xVar2.f13422f = d7.t.g0(Boolean.TRUE, o3.f11621a);
        xVar2.f13421e = true;
        xVar2.f13420d = true;
        return aVar2;
    }
}
