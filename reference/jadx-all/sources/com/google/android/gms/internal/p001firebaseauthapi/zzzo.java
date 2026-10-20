package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzao;

/* JADX INFO: loaded from: classes.dex */
final class zzzo implements zzadm<zzaer> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    public zzzo(zzyl zzylVar, zzacf zzacfVar) {
        this.zza = zzacfVar;
        this.zzb = zzylVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zza.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzaer zzaerVar) {
        zzaer zzaerVar2 = zzaerVar;
        this.zzb.zza(new zzafm(zzaerVar2.zzb(), zzaerVar2.zza(), Long.valueOf(zzafo.zza(zzaerVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }
}
