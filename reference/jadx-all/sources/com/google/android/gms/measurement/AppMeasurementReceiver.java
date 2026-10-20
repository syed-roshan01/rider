package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.google.firebase.firestore.util.ExponentialBackoff;
import k.f;
import k6.d4;
import k6.f5;
import k6.s4;
import p3.a;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends a implements s4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f3407c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f3407c == null) {
            this.f3407c = new f(this);
        }
        f fVar = this.f3407c;
        fVar.getClass();
        d4 d4Var = f5.a(context, null, null).f10032i;
        f5.d(d4Var);
        if (intent == null) {
            d4Var.f9967i.b("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        d4Var.f9972n.c("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                d4Var.f9967i.b("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        d4Var.f9972n.b("Starting wakeful intent.");
        ((AppMeasurementReceiver) ((s4) fVar.f8599b)).getClass();
        SparseArray sparseArray = a.f12763a;
        synchronized (sparseArray) {
            try {
                int i10 = a.f12764b;
                int i11 = i10 + 1;
                a.f12764b = i11;
                if (i11 <= 0) {
                    a.f12764b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i10);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(ExponentialBackoff.DEFAULT_BACKOFF_MAX_DELAY_MS);
                sparseArray.put(i10, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
