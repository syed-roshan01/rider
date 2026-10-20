package c5;

import com.auto.accept.ui.MainActivity;
import com.auto.accept.ui.viewmodel.MainViewModel;

/* JADX INFO: loaded from: classes.dex */
public final class g extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2984b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(MainActivity mainActivity, int i10) {
        super(2);
        this.f2983a = i10;
        this.f2984b = mainActivity;
    }

    public final void a(m0.m mVar, int i10) {
        int i11 = this.f2983a;
        MainActivity mainActivity = this.f2984b;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    m0.q qVar = (m0.q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                    }
                }
                int i12 = MainActivity.f3077n;
                y3.e.a((MainViewModel) mainActivity.f3078e.getValue(), mVar, 8);
                break;
            default:
                if ((i10 & 11) == 2) {
                    m0.q qVar2 = (m0.q) mVar;
                    if (qVar2.G()) {
                        qVar2.U();
                    }
                }
                e5.b.a(d7.t.K(mVar, 1538481313, new g(mainActivity, 0)), mVar, 6);
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f2983a) {
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
