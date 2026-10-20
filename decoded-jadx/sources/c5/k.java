package c5;

import com.auto.accept.ui.viewmodel.MainViewModel;
import d5.o1;

/* JADX INFO: loaded from: classes.dex */
public final class k extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f2992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(MainViewModel mainViewModel, int i10, int i11) {
        super(2);
        this.f2991a = i11;
        this.f2992b = mainViewModel;
        this.f2993c = i10;
    }

    public final void a(m0.m mVar, int i10) {
        int i11 = this.f2991a;
        MainViewModel mainViewModel = this.f2992b;
        int i12 = this.f2993c;
        switch (i11) {
            case 0:
                y3.e.a(mainViewModel, mVar, m0.s.m(i12 | 1));
                break;
            case 1:
                y3.e.a(mainViewModel, mVar, m0.s.m(i12 | 1));
                break;
            case 2:
                y3.e.a(mainViewModel, mVar, m0.s.m(i12 | 1));
                break;
            case 3:
                y3.e.a(mainViewModel, mVar, m0.s.m(i12 | 1));
                break;
            case 4:
                y3.e.b(mainViewModel, mVar, m0.s.m(i12 | 1));
                break;
            case 5:
                y3.e.z(mainViewModel, mVar, m0.s.m(i12 | 1));
                break;
            case 6:
                o1.e(mainViewModel, mVar, m0.s.m(i12 | 1));
                break;
            case 7:
                o1.f(mainViewModel, mVar, m0.s.m(i12 | 1));
                break;
            case 8:
                o1.f(mainViewModel, mVar, m0.s.m(i12 | 1));
                break;
            default:
                o1.k(mainViewModel, mVar, m0.s.m(i12 | 1));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f2991a) {
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
            default:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
        }
        return lVar;
    }
}
