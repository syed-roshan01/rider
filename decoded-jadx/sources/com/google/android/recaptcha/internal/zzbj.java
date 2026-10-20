package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import z6.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzbj extends TimerTask {
    final /* synthetic */ zzbm zza;

    public zzbj(zzbm zzbmVar) {
        this.zza = zzbmVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzbm zzbmVar = this.zza;
        a.Q(zzbmVar.zzd, null, 0, new zzbk(zzbmVar, null), 3);
    }
}
