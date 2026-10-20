package c5;

import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.remoteconfig.internal.Code;
import p9.q0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f2990b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(MainViewModel mainViewModel, int i10) {
        super(0);
        this.f2989a = i10;
        this.f2990b = mainViewModel;
    }

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        q8.l lVar = q8.l.f13235a;
        switch (this.f2989a) {
            case 0:
                m1290invoke();
                break;
            case 1:
                m1290invoke();
                break;
            case 2:
                m1290invoke();
                break;
            case 3:
                m1290invoke();
                break;
            case 4:
                m1290invoke();
                break;
            case 5:
                m1290invoke();
                break;
            case 6:
                m1290invoke();
                break;
            case 7:
                m1290invoke();
                break;
            case 8:
                m1290invoke();
                break;
            case 9:
                m1290invoke();
                break;
            case 10:
                m1290invoke();
                break;
            case 11:
                m1290invoke();
                break;
            case 12:
                m1290invoke();
                break;
            case 13:
                m1290invoke();
                break;
            case Code.UNAVAILABLE /* 14 */:
                m1290invoke();
                break;
            case 15:
                m1290invoke();
                break;
            default:
                m1290invoke();
                break;
        }
        return lVar;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m1290invoke() {
        r8.r rVar = r8.r.f13661a;
        int i10 = this.f2989a;
        MainViewModel mainViewModel = this.f2990b;
        switch (i10) {
            case 0:
                mainViewModel.G.i(Boolean.FALSE);
                break;
            case 1:
                mainViewModel.V.i(Boolean.FALSE);
                break;
            case 2:
                mainViewModel.G0.i(Boolean.FALSE);
                break;
            case 3:
                mainViewModel.D0.f17236a.edit().remove("history_json").apply();
                mainViewModel.E0.i(rVar);
                break;
            case 4:
                mainViewModel.I0.i(Boolean.FALSE);
                break;
            case 5:
                mainViewModel.I0.i(Boolean.FALSE);
                break;
            case 6:
                mainViewModel.s();
                break;
            case 7:
                mainViewModel.s();
                break;
            case 8:
                mainViewModel.getClass();
                z6.a.Q(o1.s.R(mainViewModel), null, 0, new f5.v(mainViewModel, null), 3);
                break;
            case 9:
                mainViewModel.getClass();
                z6.a.Q(o1.s.R(mainViewModel), null, 0, new f5.x(mainViewModel, null), 3);
                break;
            case 10:
                mainViewModel.s();
                break;
            case 11:
                mainViewModel.D0.f17236a.edit().remove("history_json").apply();
                mainViewModel.E0.i(rVar);
                break;
            case 12:
                mainViewModel.f3081b.f17209c.edit().putInt("accepted_count", 0).putInt("skipped_count", 0).putInt("today_earnings", 0).putInt("last_detected_fare", 0).apply();
                break;
            case 13:
                q0 q0Var = mainViewModel.A;
                q0Var.i(Boolean.valueOf(!((Boolean) q0Var.getValue()).booleanValue()));
                break;
            case Code.UNAVAILABLE /* 14 */:
                mainViewModel.s();
                break;
            case 15:
                q0 q0Var2 = mainViewModel.A;
                q0Var2.i(Boolean.valueOf(!((Boolean) q0Var2.getValue()).booleanValue()));
                break;
            default:
                mainViewModel.s();
                break;
        }
    }
}
