package b5;

import android.os.Process;
import com.auto.accept.service.RideAcceptorService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2728a;

    public /* synthetic */ j(int i10) {
        this.f2728a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2728a) {
            case 0:
                RideAcceptorService.m1533();
                break;
            case 1:
                Process.killProcess(Process.myPid());
                break;
            case 2:
                Process.killProcess(Process.myPid());
                break;
            case 3:
                Process.killProcess(Process.myPid());
                break;
            case 4:
                Process.killProcess(Process.myPid());
                break;
            default:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.f3130a;
                break;
        }
    }
}
