package c5;

import k0.c5;
import k0.e1;
import y.a1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d9.j implements c9.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2959b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f2960c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f2961d = new a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f2962e = new a(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f2963f = new a(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2964a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(3);
        this.f2964a = i10;
    }

    public final void a(a1 a1Var, m0.m mVar, int i10) {
        switch (this.f2964a) {
            case 0:
                d7.a.m(a1Var, "$this$Button");
                if ((i10 & 81) == 16) {
                    m0.q qVar = (m0.q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                    }
                }
                i1.f fVarS = f6.a.S();
                long j10 = e5.a.f5134j;
                e1.b(fVarS, null, null, j10, mVar, 3120, 4);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.k(y0.l.f16729b, 8), mVar);
                c5.b("Retry", null, j10, o1.s.N(16), null, f2.l.f6118f, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mVar, 200070, 0, 131026);
                break;
            case 1:
                d7.a.m(a1Var, "$this$OutlinedButton");
                if ((i10 & 81) == 16) {
                    m0.q qVar2 = (m0.q) mVar;
                    if (qVar2.G()) {
                        qVar2.U();
                    }
                }
                c5.b("Exit App", null, e5.a.f5138n, o1.s.N(15), null, f2.l.f6117e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mVar, 200070, 0, 131026);
                break;
            case 2:
                d7.a.m(a1Var, "$this$TextButton");
                if ((i10 & 81) == 16) {
                    m0.q qVar3 = (m0.q) mVar;
                    if (qVar3.G()) {
                        qVar3.U();
                    }
                }
                c5.b("OK", null, e5.a.f5125a, 0L, null, f2.l.f6118f, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mVar, 196998, 0, 131034);
                break;
            case 3:
                d7.a.m(a1Var, "$this$TextButton");
                if ((i10 & 81) == 16) {
                    m0.q qVar4 = (m0.q) mVar;
                    if (qVar4.G()) {
                        qVar4.U();
                    }
                }
                c5.b("\u1f5d1 Uninstall", null, e5.a.f5138n, 0L, null, f2.l.f6118f, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mVar, 196998, 0, 131034);
                break;
            default:
                d7.a.m(a1Var, "$this$TextButton");
                if ((i10 & 81) == 16) {
                    m0.q qVar5 = (m0.q) mVar;
                    if (qVar5.G()) {
                        qVar5.U();
                    }
                }
                c5.b("Exit App", null, e5.a.f5137m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mVar, 390, 0, 131066);
                break;
        }
    }

    @Override // c9.f
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f2964a) {
            case 0:
                a((a1) obj, (m0.m) obj2, ((Number) obj3).intValue());
                break;
            case 1:
                a((a1) obj, (m0.m) obj2, ((Number) obj3).intValue());
                break;
            case 2:
                a((a1) obj, (m0.m) obj2, ((Number) obj3).intValue());
                break;
            case 3:
                a((a1) obj, (m0.m) obj2, ((Number) obj3).intValue());
                break;
            default:
                a((a1) obj, (m0.m) obj2, ((Number) obj3).intValue());
                break;
        }
        return lVar;
    }
}
