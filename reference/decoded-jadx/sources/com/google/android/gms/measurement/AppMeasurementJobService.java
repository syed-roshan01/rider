package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Parcelable;
import j.a;
import k6.d4;
import k6.e7;
import k6.f5;
import k6.p7;
import l.h;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f3406a;

    @Override // k6.e7
    public final void a(Intent intent) {
    }

    @Override // k6.e7
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final a c() {
        if (this.f3406a == null) {
            this.f3406a = new a(this, 4);
        }
        return this.f3406a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d4 d4Var = f5.a(c().f8194a, null, null).f10032i;
        f5.d(d4Var);
        d4Var.f9972n.b("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d4 d4Var = f5.a(c().f8194a, null, null).f10032i;
        f5.d(d4Var);
        d4Var.f9972n.b("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        a aVarC = c();
        if (intent == null) {
            aVarC.f().f9964f.b("onRebind called with null intent");
            return;
        }
        aVarC.getClass();
        aVarC.f().f9972n.c("onRebind called. action", intent.getAction());
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a aVarC = c();
        d4 d4Var = f5.a(aVarC.f8194a, null, null).f10032i;
        f5.d(d4Var);
        String string = jobParameters.getExtras().getString("action");
        d4Var.f9972n.c("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        y2.a aVar = new y2.a((Object) aVarC, (Object) d4Var, (Parcelable) jobParameters, 16);
        p7 p7VarE = p7.e(aVarC.f8194a);
        p7VarE.zzl().u(new h(p7VarE, aVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        a aVarC = c();
        if (intent == null) {
            aVarC.f().f9964f.b("onUnbind called with null intent");
            return true;
        }
        aVarC.getClass();
        aVarC.f().f9972n.c("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @Override // k6.e7
    public final boolean zza(int i10) {
        throw new UnsupportedOperationException();
    }
}
