package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzafm;

/* JADX INFO: loaded from: classes.dex */
final class zzaa implements com.google.firebase.auth.internal.zzau, com.google.firebase.auth.internal.zzl {
    private final /* synthetic */ FirebaseAuth zza;

    public zzaa(FirebaseAuth firebaseAuth) {
        this.zza = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzau
    public final void zza(Status status) {
        int i10 = status.f3150b;
        if (i10 == 17011 || i10 == 17021 || i10 == 17005) {
            this.zza.signOut();
        }
    }

    @Override // com.google.firebase.auth.internal.zzl
    public final void zza(zzafm zzafmVar, FirebaseUser firebaseUser) {
        this.zza.zza(firebaseUser, zzafmVar, true, true);
    }
}
