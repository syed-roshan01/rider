package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzaag;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth.zza;
import com.google.firebase.auth.FirebaseAuth.zzb;
import com.google.firebase.auth.internal.zzbo;
import com.google.firebase.auth.internal.zzcc;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzab extends zzbo<AuthResult> {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ FirebaseUser zzb;
    private final /* synthetic */ EmailAuthCredential zzc;
    private final /* synthetic */ FirebaseAuth zzd;

    public zzab(FirebaseAuth firebaseAuth, boolean z10, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.zza = z10;
        this.zzb = firebaseUser;
        this.zzc = emailAuthCredential;
        this.zzd = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<AuthResult> zza(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        if (!this.zza) {
            return this.zzd.zze.zza(this.zzd.zza, this.zzc, str, (com.google.firebase.auth.internal.zzl) this.zzd.new zzb());
        }
        zzaag zzaagVar = this.zzd.zze;
        FirebaseApp firebaseApp = this.zzd.zza;
        FirebaseUser firebaseUser = this.zzb;
        a.x(firebaseUser);
        return zzaagVar.zzb(firebaseApp, firebaseUser, this.zzc, str, (zzcc) this.zzd.new zza());
    }
}
