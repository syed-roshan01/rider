package c5;

import com.auto.accept.ui.viewmodel.MainViewModel;
import k0.t0;
import m9.e0;

/* JADX INFO: loaded from: classes.dex */
public final class u extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f3019b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(MainViewModel mainViewModel, int i10) {
        super(2);
        this.f3018a = i10;
        this.f3019b = mainViewModel;
    }

    public final void a(m0.m mVar, int i10) {
        int i11 = this.f3018a;
        MainViewModel mainViewModel = this.f3019b;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    m0.q qVar = (m0.q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                    }
                }
                e0.j(new j(mainViewModel, 5), null, false, null, null, null, null, null, null, c.f2971c, mVar, 805306368, 510);
                break;
            default:
                if ((i10 & 11) == 2) {
                    m0.q qVar2 = (m0.q) mVar;
                    if (qVar2.G()) {
                        qVar2.U();
                    }
                }
                k0.x.b(d5.q.f4724a, null, null, d7.t.K(mVar, -1320267605, new s.h(mainViewModel, 9)), null, t0.j(e5.a.f5131g, mVar), mVar, 3078, 86);
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f3018a) {
            case 0:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            default:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
        }
        return lVar;
    }
}
