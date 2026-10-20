package u;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14989a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14993e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c9.a aVar, boolean z10, e1.y yVar, e1.l lVar) {
        super(1);
        this.f14993e = aVar;
        this.f14990b = z10;
        this.f14991c = yVar;
        this.f14992d = lVar;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f14989a;
        Object obj2 = this.f14991c;
        Object obj3 = this.f14992d;
        Object obj4 = this.f14993e;
        switch (i10) {
            case 1:
                r1.w0 w0Var = (r1.w0) obj;
                List list = (List) obj2;
                z.x xVar = (z.x) obj3;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    z.x xVar2 = (z.x) list.get(i11);
                    if (xVar2 != xVar) {
                        xVar2.b(w0Var);
                    }
                }
                if (xVar != null) {
                    xVar.b(w0Var);
                }
                ((m0.g1) obj4).getValue();
                break;
            default:
                t1.i0 i0Var = (t1.i0) ((g1.e) obj);
                i0Var.a();
                if (((Boolean) ((c9.a) obj4).invoke()).booleanValue()) {
                    if (this.f14990b) {
                        g1.c cVar = i0Var.f14447a;
                        long jO = cVar.O();
                        g1.b bVar = cVar.f6497b;
                        long jB = bVar.b();
                        bVar.a().j();
                        bVar.f6494a.b(-1.0f, 1.0f, jO);
                        g1.g.l0(i0Var, (e1.y) obj2, (e1.l) obj3);
                        bVar.a().h();
                        bVar.c(jB);
                    } else {
                        g1.g.l0(i0Var, (e1.y) obj2, (e1.l) obj3);
                    }
                }
                break;
        }
        return lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ArrayList arrayList, z.x xVar, boolean z10, m0.g1 g1Var) {
        super(1);
        this.f14991c = arrayList;
        this.f14992d = xVar;
        this.f14990b = z10;
        this.f14993e = g1Var;
    }
}
