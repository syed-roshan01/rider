package u1;

import android.graphics.Rect;
import android.graphics.Region;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1.d f15247a = new d1.d(0.0f, 0.0f, 10.0f, 10.0f);

    public static final boolean a(y1.o oVar) {
        return o1.s.J(oVar.h(), y1.r.f16824i) == null;
    }

    public static final r2 b(int i10, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((r2) arrayList.get(i11)).f15250a == i10) {
                return (r2) arrayList.get(i11);
            }
        }
        return null;
    }

    public static final String c(int i10) {
        if (y1.g.a(i10, 0)) {
            return "android.widget.Button";
        }
        if (y1.g.a(i10, 1)) {
            return "android.widget.CheckBox";
        }
        if (y1.g.a(i10, 3)) {
            return "android.widget.RadioButton";
        }
        if (y1.g.a(i10, 5)) {
            return "android.widget.ImageView";
        }
        if (y1.g.a(i10, 6)) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static final androidx.compose.ui.node.a d(androidx.compose.ui.node.a aVar, s sVar) {
        for (androidx.compose.ui.node.a aVarQ = aVar.q(); aVarQ != null; aVarQ = aVarQ.q()) {
            if (((Boolean) sVar.invoke(aVarQ)).booleanValue()) {
                return aVarQ;
            }
        }
        return null;
    }

    public static final void e(Region region, y1.o oVar, LinkedHashMap linkedHashMap, y1.o oVar2, Region region2) {
        androidx.compose.ui.node.a aVar;
        t1.n nVarK;
        boolean zD = oVar2.f16797c.D();
        androidx.compose.ui.node.a aVar2 = oVar2.f16797c;
        boolean z10 = (zD && aVar2.C()) ? false : true;
        boolean zIsEmpty = region.isEmpty();
        int i10 = oVar.f16801g;
        int i11 = oVar2.f16801g;
        if (!zIsEmpty || i11 == i10) {
            if (!z10 || oVar2.f16799e) {
                y1.j jVar = oVar2.f16798d;
                boolean z11 = jVar.f16787b;
                t1.n nVar = oVar2.f16795a;
                if (z11 && (nVarK = o1.s.K(aVar2)) != null) {
                    nVar = nVarK;
                }
                y0.n nVar2 = ((y0.n) nVar).f16730a;
                Object obj = jVar.f16786a.get(y1.i.f16762b);
                if (obj == null) {
                    obj = null;
                }
                boolean z12 = obj != null;
                boolean z13 = nVar2.f16730a.f16742t;
                d1.d dVar = d1.d.f4331e;
                if (z13) {
                    if (z12) {
                        t1.c1 c1VarX = t1.g.x(nVar2, 8);
                        if (c1VarX.K0().f16742t) {
                            r1.s sVarD = androidx.compose.ui.layout.a.d(c1VarX);
                            d1.b bVar = c1VarX.C;
                            if (bVar == null) {
                                bVar = new d1.b();
                                bVar.f4322a = 0.0f;
                                bVar.f4323b = 0.0f;
                                bVar.f4324c = 0.0f;
                                bVar.f4325d = 0.0f;
                                c1VarX.C = bVar;
                            }
                            long jA0 = c1VarX.A0(c1VarX.J0());
                            bVar.f4322a = -d1.f.d(jA0);
                            bVar.f4323b = -d1.f.b(jA0);
                            bVar.f4324c = d1.f.d(jA0) + c1VarX.b0();
                            bVar.f4325d = d1.f.b(jA0) + c1VarX.a0();
                            while (true) {
                                if (c1VarX == sVarD) {
                                    dVar = new d1.d(bVar.f4322a, bVar.f4323b, bVar.f4324c, bVar.f4325d);
                                    break;
                                }
                                c1VarX.W0(bVar, false, true);
                                if (bVar.b()) {
                                    break;
                                }
                                c1VarX = c1VarX.f14397r;
                                d7.a.j(c1VarX);
                            }
                        }
                    } else {
                        t1.c1 c1VarX2 = t1.g.x(nVar2, 8);
                        dVar = androidx.compose.ui.layout.a.d(c1VarX2).b(c1VarX2, true);
                    }
                }
                int iP0 = d7.t.p0(dVar.f4332a);
                int iP1 = d7.t.p0(dVar.f4333b);
                int iP2 = d7.t.p0(dVar.f4334c);
                int iP3 = d7.t.p0(dVar.f4335d);
                region2.set(iP0, iP1, iP2, iP3);
                if (i11 == i10) {
                    i11 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (oVar2.f16799e) {
                        y1.o oVarI = oVar2.i();
                        d1.d dVarE = (oVarI == null || (aVar = oVarI.f16797c) == null || !aVar.D()) ? f15247a : oVarI.e();
                        linkedHashMap.put(Integer.valueOf(i11), new s2(oVar2, new Rect(d7.t.p0(dVarE.f4332a), d7.t.p0(dVarE.f4333b), d7.t.p0(dVarE.f4334c), d7.t.p0(dVarE.f4335d))));
                        return;
                    } else {
                        if (i11 == -1) {
                            linkedHashMap.put(Integer.valueOf(i11), new s2(oVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                linkedHashMap.put(Integer.valueOf(i11), new s2(oVar2, region2.getBounds()));
                List listG = oVar2.g(false, true);
                for (int size = listG.size() - 1; -1 < size; size--) {
                    e(region, oVar, linkedHashMap, (y1.o) listG.get(size), region2);
                }
                if (g(oVar2)) {
                    region.op(iP0, iP1, iP2, iP3, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final boolean f(androidx.compose.ui.node.a aVar, androidx.compose.ui.node.a aVar2) {
        androidx.compose.ui.node.a aVarQ = aVar2.q();
        if (aVarQ == null) {
            return false;
        }
        return d7.a.d(aVarQ, aVar) || f(aVar, aVarQ);
    }

    public static final boolean g(y1.o oVar) {
        y1.j jVar = oVar.f16798d;
        if (!jVar.f16787b) {
            Set setKeySet = jVar.f16786a.keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    if (((y1.u) it.next()).f16846c) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final void h(j1 j1Var, int i10) {
        Object next;
        Iterator<T> it = j1Var.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((androidx.compose.ui.node.a) ((Map.Entry) next).getKey()).f1737b != i10);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            a7.a.w(entry.getValue());
        }
    }
}
