package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import l.z2;
import l5.j;
import l5.u;
import q5.e;
import q5.i;
import u1.i0;
import u5.a;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3131a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        u.b(getApplicationContext());
        z2 z2VarA = j.a();
        z2VarA.L(string);
        z2VarA.N(a.b(i10));
        if (string2 != null) {
            z2VarA.f10984c = Base64.decode(string2, 0);
        }
        i iVar = u.a().f11373d;
        j jVarJ = z2VarA.j();
        i0 i0Var = new i0(5, this, jobParameters);
        iVar.getClass();
        iVar.f13182e.execute(new e(i11, 0, iVar, jVarJ, i0Var));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
