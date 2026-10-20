package c5;

import android.util.Log;
import com.auto.accept.ui.viewmodel.MainViewModel;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements androidx.lifecycle.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3007b;

    public /* synthetic */ q(Object obj, int i10) {
        this.f3006a = i10;
        this.f3007b = obj;
    }

    @Override // androidx.lifecycle.u
    public final void onStateChanged(androidx.lifecycle.w wVar, androidx.lifecycle.p pVar) {
        int i10 = this.f3006a;
        Object obj = this.f3007b;
        switch (i10) {
            case 0:
                MainViewModel mainViewModel = (MainViewModel) obj;
                d7.a.m(mainViewModel, "$viewModel");
                if (pVar == androidx.lifecycle.p.ON_RESUME) {
                    Log.d("FREEZE_DEBUG", "\u23f1\ufe0f AutoAcceptNavigation ON_RESUME triggered");
                    mainViewModel.p();
                }
                break;
            case 1:
                MainViewModel mainViewModel2 = (MainViewModel) obj;
                d7.a.m(mainViewModel2, "$viewModel");
                if (pVar == androidx.lifecycle.p.ON_RESUME) {
                    Log.d("FREEZE_DEBUG", "\u23f1\ufe0f MainScreen ON_RESUME: checkPermissions + recheckUserStatus");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    mainViewModel2.e();
                    Log.d("FREEZE_DEBUG", "\u23f1\ufe0f MainScreen checkPermissions: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
                    mainViewModel2.q();
                    Log.d("FREEZE_DEBUG", "\u23f1\ufe0f MainScreen recheckUserStatus DISPATCHED: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
                }
                break;
            default:
                b4.e eVar = (b4.e) obj;
                d7.a.m(eVar, "this$0");
                if (pVar == androidx.lifecycle.p.ON_START) {
                    eVar.f2706f = true;
                } else if (pVar == androidx.lifecycle.p.ON_STOP) {
                    eVar.f2706f = false;
                }
                break;
        }
    }
}
