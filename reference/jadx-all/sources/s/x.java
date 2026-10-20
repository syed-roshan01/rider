package s;

import d5.i1;
import d5.w1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f13888b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i10, List list) {
        super(1);
        this.f13887a = i10;
        this.f13888b = list;
    }

    public final void a(r1.w0 w0Var) {
        int i10 = this.f13887a;
        List list = this.f13888b;
        switch (i10) {
            case 0:
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    r1.x0 x0Var = (r1.x0) list.get(i11);
                    w0Var.getClass();
                    r1.w0.c(x0Var, 0, 0, 0.0f);
                }
                break;
            case 1:
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    r1.x0 x0Var2 = (r1.x0) list.get(i12);
                    w0Var.getClass();
                    r1.w0.c(x0Var2, 0, 0, 0.0f);
                }
                break;
            case 2:
            default:
                int iY = d7.t.Y(list);
                if (iY >= 0) {
                    int i13 = 0;
                    while (true) {
                        r1.w0.g(w0Var, (r1.x0) list.get(i13), 0, 0);
                        if (i13 != iY) {
                            i13++;
                        }
                    }
                }
                break;
            case 3:
                int size3 = list.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    r1.w0.h(w0Var, (r1.x0) list.get(i14), 0, 0);
                }
                break;
            case 4:
                int size4 = list.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    r1.w0.g(w0Var, (r1.x0) list.get(i15), 0, 0);
                }
                break;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f13887a;
        List list = this.f13888b;
        switch (i10) {
            case 0:
                a((r1.w0) obj);
                break;
            case 1:
                a((r1.w0) obj);
                break;
            case 2:
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((c9.c) list.get(i11)).invoke(obj);
                }
                break;
            case 3:
                a((r1.w0) obj);
                break;
            case 4:
                a((r1.w0) obj);
                break;
            case 5:
                a((r1.w0) obj);
                break;
            default:
                z.y yVar = (z.y) obj;
                d7.a.m(yVar, "$this$LazyColumn");
                w1 w1Var = w1.f4831a;
                int i12 = 1;
                ((z.g) yVar).f17043u.a(list.size(), new z.f(new i1(i12, w1Var, list), new u0.b(-632812321, new i2.c(list, i12), true)));
                break;
        }
        return lVar;
    }
}
