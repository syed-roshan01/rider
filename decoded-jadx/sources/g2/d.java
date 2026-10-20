package g2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f6519b = new d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f6520c = new d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f6521d = new d(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f6522e = new d(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f6523f = new d(5);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f6524n = new d(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6525a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f6525a = i10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f6525a) {
            case 0:
                float[] fArr = ((e1.a0) obj).f4989a;
                return lVar;
            case 1:
                float[] fArr2 = ((e1.a0) obj).f4989a;
                return lVar;
            case 2:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                v0.p pVar = a2.w.f1012a;
                Boolean bool = Boolean.FALSE;
                a2.e eVar = (d7.a.d(obj2, bool) || obj2 == null) ? null : (a2.e) pVar.f15880b.invoke(obj2);
                d7.a.j(eVar);
                Object obj3 = list.get(1);
                int i10 = a2.b0.f904c;
                a2.b0 b0Var = (d7.a.d(obj3, bool) || obj3 == null) ? null : (a2.b0) a2.w.f1024m.f15880b.invoke(obj3);
                d7.a.j(b0Var);
                return new a0(eVar, b0Var.f905a, (a2.b0) null);
            case 3:
                return lVar;
            case 4:
                int i11 = ((n) obj).f6582a;
                return lVar;
            case 5:
                return lVar;
            default:
                int i12 = ((n) obj).f6582a;
                return lVar;
        }
    }
}
