package q5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import b0.l0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;
import r5.m;

/* JADX INFO: loaded from: classes.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r5.d f13157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f13158c;

    public c(Context context, r5.d dVar, a aVar) {
        this.f13156a = context;
        this.f13157b = dVar;
        this.f13158c = aVar;
    }

    public final void a(l5.j jVar, int i10, boolean z10) {
        Context context = this.f13156a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(jVar.f11348a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        i5.d dVar = jVar.f11350c;
        adler32.update(byteBufferAllocate.putInt(u5.a.a(dVar)).array());
        byte[] bArr = jVar.f11349b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i11 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i11 < i10) {
                        break;
                    }
                    y3.e.Z("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", jVar);
                    return;
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseA = ((m) this.f13157b).a();
        String strValueOf = String.valueOf(u5.a.a(dVar));
        String str = jVar.f11348a;
        long jLongValue = ((Long) m.q(sQLiteDatabaseA.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf}), new l0(15))).longValue();
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        a aVar = this.f13158c;
        builder.setMinimumLatency(aVar.a(dVar, jLongValue, i10));
        Set set = ((b) aVar.f13152b.get(dVar)).f13155c;
        if (set.contains(d.f13159a)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(d.f13161c)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(d.f13160b)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", str);
        persistableBundle.putInt("priority", u5.a.a(dVar));
        if (bArr != null) {
            persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {jVar, Integer.valueOf(value), Long.valueOf(aVar.a(dVar, jLongValue, i10)), Long.valueOf(jLongValue), Integer.valueOf(i10)};
        String strConcat = "TRuntime.".concat("JobInfoScheduler");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}
