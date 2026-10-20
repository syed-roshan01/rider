package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import j.a;
import k6.d4;
import k6.e7;
import k6.f5;
import k6.h5;
import k6.p7;
import l.b0;
import l.h;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f3408a;

    @Override // k6.e7
    public final void a(Intent intent) {
        SparseArray sparseArray = p3.a.f12763a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = p3.a.f12763a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k6.e7
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final a c() {
        if (this.f3408a == null) {
            this.f3408a = new a(this, 4);
        }
        return this.f3408a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        a aVarC = c();
        if (intent == null) {
            aVarC.f().f9964f.b("onBind called with null intent");
            return null;
        }
        aVarC.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new h5(p7.e(aVarC.f8194a));
        }
        aVarC.f().f9967i.c("onBind received unknown action", action);
        return null;
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        a aVarC = c();
        d4 d4Var = f5.a(aVarC.f8194a, null, null).f10032i;
        f5.d(d4Var);
        if (intent == null) {
            d4Var.f9967i.b("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        d4Var.f9972n.d("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        b0 b0Var = new b0(aVarC, i11, d4Var, intent);
        p7 p7VarE = p7.e(aVarC.f8194a);
        p7VarE.zzl().u(new h(p7VarE, b0Var));
        return 2;
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
        return stopSelfResult(i10);
    }
}
