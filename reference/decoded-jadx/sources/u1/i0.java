package u1;

import android.app.Activity;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.ActivityScope;
import com.google.firebase.firestore.core.FirestoreClient;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15114c;

    public /* synthetic */ i0(int i10, Object obj, Object obj2) {
        this.f15112a = i10;
        this.f15113b = obj;
        this.f15114c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f15112a;
        int i11 = 0;
        Object obj = this.f15114c;
        Object obj2 = this.f15113b;
        switch (i10) {
            case 0:
                j0.a((p0) obj2, (LongSparseArray) obj);
                return;
            case 1:
                ((t2.b) obj2).e((Typeface) obj);
                return;
            case 2:
            default:
                ((FirestoreClient) obj2).lambda$new$1((User) obj);
                return;
            case 3:
                n3.j jVar = (n3.j) obj;
                n3.b bVar = n3.c.f12142a;
                d7.a.m(jVar, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + ((String) obj2), jVar);
                throw jVar;
            case 4:
                Context context = (Context) obj;
                ((ProfileInstallerInitializer) obj2).getClass();
                (Build.VERSION.SDK_INT >= 28 ? y3.h.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new y3.f(context, i11), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 5:
                int i12 = JobInfoSchedulerService.f3131a;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
            case 6:
                ActivityScope.lambda$onActivityStopCallOnce$0((Activity) obj2, (Runnable) obj);
                return;
            case 7:
                ActivityScope.lambda$onFragmentActivityStopCallOnce$1((androidx.fragment.app.g0) obj2, (Runnable) obj);
                return;
            case 8:
                ((FirestoreClient) obj2).lambda$waitForPendingWrites$17((TaskCompletionSource) obj);
                return;
            case 9:
                ((FirestoreClient) obj2).lambda$configureFieldIndexes$21((List) obj);
                return;
        }
    }
}
