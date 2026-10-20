package g0;

import a2.a0;
import a2.c0;
import a2.z;
import e1.r;
import java.util.List;
import q8.l;

/* JADX INFO: loaded from: classes.dex */
public final class g extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f6471b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i10) {
        super(1);
        this.f6470a = i10;
        this.f6471b = hVar;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10 = this.f6470a;
        a0 a0Var = null;
        h hVar = this.f6471b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                a0 a0Var2 = hVar.H0().f6445n;
                if (a0Var2 != null) {
                    z zVar = a0Var2.f893a;
                    a0 a0Var3 = new a0(new z(zVar.f1052a, c0.e(0, 16777214, r.f5065g, 0L, 0L, 0L, hVar.f6473v, null, null, null, null), zVar.f1054c, zVar.f1055d, zVar.f1056e, zVar.f1057f, zVar.f1058g, zVar.f1059h, zVar.f1060i, zVar.f1061j), a0Var2.f894b, a0Var2.f895c);
                    list.add(a0Var3);
                    a0Var = a0Var3;
                }
                return Boolean.valueOf(a0Var != null);
            case 1:
                a2.e eVar = (a2.e) obj;
                f fVarJ0 = hVar.J0();
                if (fVarJ0 == null) {
                    f fVar = new f(hVar.f6472u, eVar);
                    d dVar = new d(eVar, hVar.f6473v, hVar.f6474w, hVar.f6476y, hVar.f6477z, hVar.A, hVar.B, hVar.C);
                    dVar.c(hVar.H0().f6442k);
                    fVar.f6469d = dVar;
                    hVar.H.setValue(fVar);
                } else if (!d7.a.d(eVar, fVarJ0.f6467b)) {
                    fVarJ0.f6467b = eVar;
                    d dVar2 = fVarJ0.f6469d;
                    if (dVar2 != null) {
                        c0 c0Var = hVar.f6473v;
                        f2.d dVar3 = hVar.f6474w;
                        int i11 = hVar.f6476y;
                        boolean z10 = hVar.f6477z;
                        int i12 = hVar.A;
                        int i13 = hVar.B;
                        List list2 = hVar.C;
                        dVar2.f6432a = eVar;
                        dVar2.f6433b = c0Var;
                        dVar2.f6434c = dVar3;
                        dVar2.f6435d = i11;
                        dVar2.f6436e = z10;
                        dVar2.f6437f = i12;
                        dVar2.f6438g = i13;
                        dVar2.f6439h = list2;
                        dVar2.f6443l = null;
                        dVar2.f6445n = null;
                        dVar2.f6447p = -1;
                        dVar2.f6446o = -1;
                        l lVar = l.f13235a;
                    }
                }
                t1.g.u(hVar);
                return Boolean.TRUE;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (hVar.J0() == null) {
                    return Boolean.FALSE;
                }
                f fVarJ1 = hVar.J0();
                if (fVarJ1 != null) {
                    fVarJ1.f6468c = zBooleanValue;
                }
                t1.g.u(hVar);
                t1.g.t(hVar);
                t1.g.s(hVar);
                return Boolean.TRUE;
        }
    }
}
