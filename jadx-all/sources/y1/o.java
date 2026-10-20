package y1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t1.c1;
import u.h1;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0.n f16795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.ui.node.a f16797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f16798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f16800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16801g;

    public o(y0.n nVar, boolean z10, androidx.compose.ui.node.a aVar, j jVar) {
        this.f16795a = nVar;
        this.f16796b = z10;
        this.f16797c = aVar;
        this.f16798d = jVar;
        this.f16801g = aVar.f1737b;
    }

    public final o a(g gVar, c9.c cVar) {
        j jVar = new j();
        jVar.f16787b = false;
        jVar.f16788c = false;
        cVar.invoke(jVar);
        o oVar = new o(new m(cVar), false, new androidx.compose.ui.node.a(this.f16801g + (gVar != null ? 1000000000 : 2000000000), true), jVar);
        oVar.f16799e = true;
        oVar.f16800f = this;
        return oVar;
    }

    public final void b(androidx.compose.ui.node.a aVar, ArrayList arrayList) {
        o0.i iVarS = aVar.s();
        int i10 = iVarS.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVarS.f12341a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if (aVar2.C()) {
                    if (aVar2.C.d(8)) {
                        arrayList.add(o1.s.f(aVar2, this.f16796b));
                    } else {
                        b(aVar2, arrayList);
                    }
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final c1 c() {
        if (this.f16799e) {
            o oVarI = i();
            if (oVarI != null) {
                return oVarI.c();
            }
            return null;
        }
        t1.n nVarK = o1.s.K(this.f16797c);
        if (nVarK == null) {
            nVarK = this.f16795a;
        }
        return t1.g.x(nVarK, 8);
    }

    public final void d(List list) {
        List listL = l(false);
        int size = listL.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) listL.get(i10);
            if (oVar.j()) {
                list.add(oVar);
            } else if (!oVar.f16798d.f16788c) {
                oVar.d(list);
            }
        }
    }

    public final d1.d e() {
        d1.d dVarB;
        c1 c1VarC = c();
        if (c1VarC != null) {
            if (!c1VarC.K0().f16742t) {
                c1VarC = null;
            }
            if (c1VarC != null && (dVarB = androidx.compose.ui.layout.a.d(c1VarC).b(c1VarC, true)) != null) {
                return dVarB;
            }
        }
        return d1.d.f4331e;
    }

    public final d1.d f() {
        c1 c1VarC = c();
        if (c1VarC != null) {
            if (!c1VarC.K0().f16742t) {
                c1VarC = null;
            }
            if (c1VarC != null) {
                return androidx.compose.ui.layout.a.c(c1VarC);
            }
        }
        return d1.d.f4331e;
    }

    public final List g(boolean z10, boolean z11) {
        if (!z10 && this.f16798d.f16788c) {
            return r8.r.f13661a;
        }
        if (!j()) {
            return l(z11);
        }
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        return arrayList;
    }

    public final j h() {
        boolean zJ = j();
        j jVar = this.f16798d;
        if (!zJ) {
            return jVar;
        }
        jVar.getClass();
        j jVar2 = new j();
        jVar2.f16787b = jVar.f16787b;
        jVar2.f16788c = jVar.f16788c;
        jVar2.f16786a.putAll(jVar.f16786a);
        k(jVar2);
        return jVar2;
    }

    public final o i() {
        o oVar = this.f16800f;
        if (oVar != null) {
            return oVar;
        }
        androidx.compose.ui.node.a aVar = this.f16797c;
        boolean z10 = this.f16796b;
        androidx.compose.ui.node.a aVarV = z10 ? o1.s.v(aVar, n.f16792c) : null;
        if (aVarV == null) {
            aVarV = o1.s.v(aVar, n.f16793d);
        }
        if (aVarV == null) {
            return null;
        }
        return o1.s.f(aVarV, z10);
    }

    public final boolean j() {
        return this.f16796b && this.f16798d.f16787b;
    }

    public final void k(j jVar) {
        if (this.f16798d.f16788c) {
            return;
        }
        List listL = l(false);
        int size = listL.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) listL.get(i10);
            if (!oVar.j()) {
                for (Map.Entry entry : oVar.f16798d.f16786a.entrySet()) {
                    u uVar = (u) entry.getKey();
                    Object value = entry.getValue();
                    LinkedHashMap linkedHashMap = jVar.f16786a;
                    Object obj = linkedHashMap.get(uVar);
                    d7.a.k(uVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                    Object objInvoke = uVar.f16845b.invoke(obj, value);
                    if (objInvoke != null) {
                        linkedHashMap.put(uVar, objInvoke);
                    }
                }
                oVar.k(jVar);
            }
        }
    }

    public final List l(boolean z10) {
        if (this.f16799e) {
            return r8.r.f13661a;
        }
        ArrayList arrayList = new ArrayList();
        b(this.f16797c, arrayList);
        if (z10) {
            u uVar = r.f16834s;
            j jVar = this.f16798d;
            g gVar = (g) o1.s.J(jVar, uVar);
            int i10 = 1;
            if (gVar != null && jVar.f16787b && (!arrayList.isEmpty())) {
                arrayList.add(a(gVar, new h1.b(gVar, 9)));
            }
            u uVar2 = r.f16816a;
            LinkedHashMap linkedHashMap = jVar.f16786a;
            if (linkedHashMap.containsKey(uVar2) && (!arrayList.isEmpty()) && jVar.f16787b) {
                Object obj = linkedHashMap.get(uVar2);
                if (obj == null) {
                    obj = null;
                }
                List list = (List) obj;
                String str = list != null ? (String) r8.p.H0(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new h1(str, i10)));
                }
            }
        }
        return arrayList;
    }
}
