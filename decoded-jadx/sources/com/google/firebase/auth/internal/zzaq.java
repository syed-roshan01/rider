package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.HandlerThread;
import c6.a;
import com.google.firebase.FirebaseApp;

/* JADX INFO: loaded from: classes.dex */
public final class zzaq {
    private static a zzc = new a("TokenRefresher", "FirebaseAuth:");
    volatile long zza;
    volatile long zzb;
    private final FirebaseApp zzd;
    private long zze;
    private HandlerThread zzf;
    private Handler zzg;
    private Runnable zzh;

    public zzaq(FirebaseApp firebaseApp) {
        zzc.d("Initializing TokenRefresher", new Object[0]);
        if (firebaseApp == null) {
            throw new NullPointerException("null reference");
        }
        this.zzd = firebaseApp;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzg = new com.google.android.gms.internal.p001firebaseauthapi.zzg(this.zzf.getLooper());
        this.zzh = new zzat(this, firebaseApp.getName());
        this.zze = 300000L;
    }

    public final void zzb() {
        this.zzg.removeCallbacks(this.zzh);
    }

    public final void zzc() {
        zzc.d(a7.a.l("Scheduling refresh for ", this.zza - this.zze), new Object[0]);
        zzb();
        this.zzb = Math.max((this.zza - System.currentTimeMillis()) - this.zze, 0L) / 1000;
        this.zzg.postDelayed(this.zzh, this.zzb * 1000);
    }

    public final void zzd() {
        long j10;
        int i10 = (int) this.zzb;
        if (i10 == 30 || i10 == 60 || i10 == 120 || i10 == 240 || i10 == 480) {
            j10 = 2 * this.zzb;
        } else {
            j10 = i10 != 960 ? 30L : 960L;
        }
        this.zzb = j10;
        this.zza = (this.zzb * 1000) + System.currentTimeMillis();
        zzc.d(a7.a.l("Scheduling refresh for ", this.zza), new Object[0]);
        this.zzg.postDelayed(this.zzh, this.zzb * 1000);
    }
}
