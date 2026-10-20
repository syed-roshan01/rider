package g0;

import a2.a0;
import a2.c0;
import a2.z;
import e1.r;
import java.util.List;
import m2.l;
import o1.s;

/* JADX INFO: loaded from: classes.dex */
public final class j extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f6483b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i10) {
        super(1);
        this.f6482a = i10;
        this.f6483b = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d9  */
    @Override // c9.c
    public final Object invoke(Object obj) {
        m2.b bVar;
        a0 a0Var;
        int i10 = this.f6482a;
        a0 a0Var2 = null;
        k kVar = this.f6483b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                e eVarG0 = kVar.G0();
                c0 c0VarE = c0.e(0, 16777214, r.f5065g, 0L, 0L, 0L, kVar.f6485v, null, null, null, null);
                l lVar = eVarG0.f6462o;
                if (lVar == null || (bVar = eVarG0.f6456i) == null) {
                    a0Var = null;
                } else {
                    a2.e eVar = new a2.e(eVarG0.f6448a, null, 6);
                    if (eVarG0.f6457j == null || eVarG0.f6461n == null) {
                        a0Var = null;
                    } else {
                        long jB = m2.a.b(eVarG0.f6463p, 0, 0, 0, 0, 10);
                        r8.r rVar = r8.r.f13661a;
                        int i11 = eVarG0.f6453f;
                        boolean z10 = eVarG0.f6452e;
                        int i12 = eVarG0.f6451d;
                        f2.d dVar = eVarG0.f6450c;
                        a0Var = new a0(new z(eVar, c0VarE, rVar, i11, z10, i12, bVar, lVar, dVar, jB), new a2.i(new a2.k(eVar, c0VarE, rVar, bVar, dVar), jB, eVarG0.f6453f, h6.g.T(eVarG0.f6451d, 2)), eVarG0.f6459l);
                    }
                }
                if (a0Var != null) {
                    list.add(a0Var);
                    a0Var2 = a0Var;
                }
                return Boolean.valueOf(a0Var2 != null);
            case 1:
                String str = ((a2.e) obj).f918a;
                i iVarI0 = kVar.I0();
                if (iVarI0 == null) {
                    i iVar = new i(kVar.f6484u, str);
                    e eVar2 = new e(str, kVar.f6485v, kVar.f6486w, kVar.f6487x, kVar.f6488y, kVar.f6489z, kVar.A);
                    eVar2.c(kVar.G0().f6456i);
                    iVar.f6481d = eVar2;
                    kVar.E.setValue(iVar);
                } else if (!d7.a.d(str, iVarI0.f6479b)) {
                    iVarI0.f6479b = str;
                    e eVar3 = iVarI0.f6481d;
                    if (eVar3 != null) {
                        c0 c0Var = kVar.f6485v;
                        f2.d dVar2 = kVar.f6486w;
                        int i13 = kVar.f6487x;
                        boolean z11 = kVar.f6488y;
                        int i14 = kVar.f6489z;
                        int i15 = kVar.A;
                        eVar3.f6448a = str;
                        eVar3.f6449b = c0Var;
                        eVar3.f6450c = dVar2;
                        eVar3.f6451d = i13;
                        eVar3.f6452e = z11;
                        eVar3.f6453f = i14;
                        eVar3.f6454g = i15;
                        eVar3.f6457j = null;
                        eVar3.f6461n = null;
                        eVar3.f6462o = null;
                        eVar3.f6464q = -1;
                        eVar3.f6465r = -1;
                        eVar3.f6463p = l2.l.d(0, 0);
                        eVar3.f6459l = s.e(0, 0);
                        eVar3.f6458k = false;
                        q8.l lVar2 = q8.l.f13235a;
                    }
                }
                t1.g.u(kVar);
                return Boolean.TRUE;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (kVar.I0() == null) {
                    return Boolean.FALSE;
                }
                i iVarI1 = kVar.I0();
                if (iVarI1 != null) {
                    iVarI1.f6480c = zBooleanValue;
                }
                t1.g.u(kVar);
                t1.g.t(kVar);
                t1.g.s(kVar);
                return Boolean.TRUE;
        }
    }
}
