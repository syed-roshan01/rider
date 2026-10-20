package x;

import java.util.ArrayList;
import java.util.List;
import m0.g1;

/* JADX INFO: loaded from: classes.dex */
public final class f implements p9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f16268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f16269c;

    public /* synthetic */ f(ArrayList arrayList, g1 g1Var, int i10) {
        this.f16267a = i10;
        this.f16268b = arrayList;
        this.f16269c = g1Var;
    }

    public final Object b(k kVar) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f16267a;
        g1 g1Var = this.f16269c;
        List list = this.f16268b;
        switch (i10) {
            case 0:
                if (kVar instanceof d) {
                    list.add(kVar);
                } else if (kVar instanceof e) {
                    list.remove(((e) kVar).f16266a);
                }
                g1Var.setValue(Boolean.valueOf(!list.isEmpty()));
                break;
            case 1:
                if (kVar instanceof h) {
                    list.add(kVar);
                } else if (kVar instanceof i) {
                    list.remove(((i) kVar).f16273a);
                }
                g1Var.setValue(Boolean.valueOf(!list.isEmpty()));
                break;
            default:
                if (kVar instanceof o) {
                    list.add(kVar);
                } else if (kVar instanceof p) {
                    list.remove(((p) kVar).f16280a);
                } else if (kVar instanceof n) {
                    list.remove(((n) kVar).f16278a);
                }
                g1Var.setValue(Boolean.valueOf(!list.isEmpty()));
                break;
        }
        return lVar;
    }

    @Override // p9.g
    public final /* bridge */ /* synthetic */ Object emit(Object obj, u8.e eVar) {
        int i10 = this.f16267a;
        q8.l lVar = q8.l.f13235a;
        switch (i10) {
            case 0:
                b((k) obj);
                break;
            case 1:
                b((k) obj);
                break;
            default:
                b((k) obj);
                break;
        }
        return lVar;
    }
}
