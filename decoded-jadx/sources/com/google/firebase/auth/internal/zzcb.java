package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.internal.p001firebaseauthapi.zzafm;
import com.google.firebase.FirebaseApp;

/* JADX INFO: loaded from: classes.dex */
public final class zzcb {
    private volatile int zza;
    private final zzaq zzb;
    private volatile boolean zzc;

    public zzcb(FirebaseApp firebaseApp) {
        this(firebaseApp.getApplicationContext(), new zzaq(firebaseApp));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzb() {
        return this.zza > 0 && !this.zzc;
    }

    private zzcb(Context context, zzaq zzaqVar) {
        this.zzc = false;
        this.zza = 0;
        this.zzb = zzaqVar;
        c.b((Application) context.getApplicationContext());
        c.f3165e.a(new zzca(this));
    }

    public final void zza() {
        this.zzb.zzb();
    }

    public final void zza(int i10) {
        if (i10 > 0 && this.zza == 0) {
            this.zza = i10;
            if (zzb()) {
                this.zzb.zzc();
            }
        } else if (i10 == 0 && this.zza != 0) {
            this.zzb.zzb();
        }
        this.zza = i10;
    }

    public final void zza(zzafm zzafmVar) {
        if (zzafmVar == null) {
            return;
        }
        long jZza = zzafmVar.zza();
        if (jZza <= 0) {
            jZza = 3600;
        }
        long jZzb = (jZza * 1000) + zzafmVar.zzb();
        zzaq zzaqVar = this.zzb;
        zzaqVar.zza = jZzb;
        zzaqVar.zzb = -1L;
        if (zzb()) {
            this.zzb.zzc();
        }
    }
}
