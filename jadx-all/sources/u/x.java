package u;

import com.auto.accept.ui.viewmodel.MainViewModel;
import java.util.Arrays;
import java.util.Map;
import k0.c4;
import k0.c5;

/* JADX INFO: loaded from: classes.dex */
public final class x extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14975d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, int i10, Object obj2, int i11) {
        super(2);
        this.f14972a = i11;
        this.f14974c = obj;
        this.f14973b = i10;
        this.f14975d = obj2;
    }

    public final void a(m0.m mVar, int i10) {
        int i11 = this.f14972a;
        int i12 = this.f14973b;
        Object obj = this.f14975d;
        Object obj2 = this.f14974c;
        switch (i11) {
            case 0:
                androidx.compose.foundation.a.b((y0.o) obj2, (c9.c) obj, mVar, m0.s.m(i12 | 1));
                break;
            case 1:
                if ((i10 & 11) == 2) {
                    m0.q qVar = (m0.q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                    }
                }
                ((a0.s) obj2).e(i12, obj, mVar, 64);
                break;
            case 2:
                c4.d((c9.e) obj2, (c9.e) obj, mVar, m0.s.m(i12 | 1));
                break;
            case 3:
                c5.a((a2.c0) obj2, (c9.e) obj, mVar, m0.s.m(i12 | 1));
                break;
            case 4:
                m0.v1[] v1VarArr = (m0.v1[]) obj2;
                f6.a.c((m0.v1[]) Arrays.copyOf(v1VarArr, v1VarArr.length), (c9.e) obj, mVar, m0.s.m(i12 | 1));
                break;
            case 5:
                f6.a.b((m0.v1) obj2, (c9.e) obj, mVar, m0.s.m(i12 | 1));
                break;
            case 6:
                ((u0.b) obj2).d(obj, mVar, m0.s.m(i12) | 1);
                break;
            case 7:
                u1.y0.a((u1.w) obj2, (c9.e) obj, mVar, m0.s.m(i12 | 1));
                break;
            case 8:
                y3.e.j((c9.a) obj2, (c9.a) obj, mVar, m0.s.m(i12 | 1));
                break;
            case 9:
                f6.a.e((MainViewModel) obj2, (String) obj, mVar, m0.s.m(i12 | 1));
                break;
            case 10:
                d5.o1.a((MainViewModel) obj2, (Map) obj, mVar, m0.s.m(i12 | 1));
                break;
            case 11:
                if ((i10 & 11) == 2) {
                    m0.q qVar2 = (m0.q) mVar;
                    if (qVar2.G()) {
                        qVar2.U();
                    }
                }
                b0.h0 h0Var = (b0.h0) obj2;
                c5.b((String) obj, null, h0Var.f2397e.f2318b.d() == i12 ? e5.a.f5125a : e5.a.f5137m, o1.s.N(11), null, h0Var.f2397e.f2318b.d() == i12 ? f2.l.f6118f : f2.l.f6116d, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mVar, 3072, 0, 131026);
                break;
            default:
                d5.o1.h((String) obj2, (String) obj, mVar, m0.s.m(i12 | 1));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f14972a) {
            case 0:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 1:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 2:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 3:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 4:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 5:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 6:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 7:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 8:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 9:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 10:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 11:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            default:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
        }
        return lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, Object obj2, int i10, int i11) {
        super(2);
        this.f14972a = i11;
        this.f14974c = obj;
        this.f14975d = obj2;
        this.f14973b = i10;
    }
}
