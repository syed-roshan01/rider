package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzao;
import l.q;

/* JADX INFO: loaded from: classes.dex */
final class zzzn implements zzadm<zzagi> {
    private final /* synthetic */ zzagf zza;
    private final /* synthetic */ zzacf zzb;

    public zzzn(zzyl zzylVar, zzagf zzagfVar, zzacf zzacfVar) {
        this.zza = zzagfVar;
        this.zzb = zzacfVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zzb.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzagi zzagiVar) {
        zzagi zzagiVar2 = zzagiVar;
        zzagf zzagfVar = this.zza;
        if (zzagfVar instanceof zzagj) {
            this.zzb.zzb(zzagiVar2.zza());
        } else {
            if (zzagfVar instanceof zzagl) {
                this.zzb.zza(zzagiVar2);
                return;
            }
            throw new IllegalArgumentException(q.k("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was ", this.zza.getClass().getName(), "."));
        }
    }
}
