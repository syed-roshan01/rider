package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
final class zzu implements com.google.firebase.auth.internal.zzav {
    private final /* synthetic */ FirebaseUser zza;
    private final /* synthetic */ FirebaseAuth zzb;

    public zzu(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        this.zza = firebaseUser;
        this.zzb = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzau
    public final void zza(Status status) {
        int i10 = status.f3150b;
        if (i10 == 17011 || i10 == 17021 || i10 == 17005) {
            this.zzb.signOut();
        }
    }

    @Override // com.google.firebase.auth.internal.zzav
    public final void zza() {
        if (this.zzb.zzf == null || !this.zzb.zzf.getUid().equalsIgnoreCase(this.zza.getUid())) {
            return;
        }
        this.zzb.zzh();
    }
}
