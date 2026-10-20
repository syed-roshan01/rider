package com.google.android.gms.internal.p001firebaseauthapi;

import android.util.Log;
import c6.a;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
final class zzady extends zzacf {
    private final String zza;
    private final /* synthetic */ zzadt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzady(zzadt zzadtVar, zzacf zzacfVar, String str) {
        super(zzacfVar);
        this.zzb = zzadtVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacf
    public final void zza(Status status) {
        zzadt.zza.b("SMS verification code request failed: " + e.l0(status.f3150b) + " " + status.f3151c, new Object[0]);
        zzaea zzaeaVar = (zzaea) this.zzb.zzd.get(this.zza);
        if (zzaeaVar == null) {
            return;
        }
        Iterator<zzacf> it = zzaeaVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(status);
        }
        this.zzb.zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacf
    public final void zzb(String str) {
        a aVar = zzadt.zza;
        Object[] objArr = new Object[0];
        if (aVar.f3025c <= 3) {
            Log.d(aVar.f3023a, aVar.c("onCodeSent", objArr));
        }
        zzaea zzaeaVar = (zzaea) this.zzb.zzd.get(this.zza);
        if (zzaeaVar == null) {
            return;
        }
        Iterator<zzacf> it = zzaeaVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zzb(str);
        }
        zzaeaVar.zzg = true;
        zzaeaVar.zzd = str;
        if (zzaeaVar.zza <= 0) {
            this.zzb.zzb(this.zza);
        } else if (!zzaeaVar.zzc) {
            this.zzb.zze(this.zza);
        } else {
            if (zzah.zzc(zzaeaVar.zze)) {
                return;
            }
            zzadt.zza(this.zzb, this.zza);
        }
    }
}
