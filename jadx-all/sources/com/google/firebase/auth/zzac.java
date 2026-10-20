package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzaag;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth.zza;
import com.google.firebase.auth.FirebaseAuth.zzb;
import com.google.firebase.auth.internal.zzbo;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzac extends zzbo<AuthResult> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ FirebaseUser zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ FirebaseAuth zzf;

    public zzac(FirebaseAuth firebaseAuth, String str, boolean z10, FirebaseUser firebaseUser, String str2, String str3) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = firebaseUser;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<AuthResult> zza(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Logging in as " + this.zza + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + this.zza);
        }
        if (!this.zzb) {
            return this.zzf.zze.zzb(this.zzf.zza, this.zza, this.zzd, this.zze, str, this.zzf.new zzb());
        }
        zzaag zzaagVar = this.zzf.zze;
        FirebaseApp firebaseApp = this.zzf.zza;
        FirebaseUser firebaseUser = this.zzc;
        a.x(firebaseUser);
        return zzaagVar.zzb(firebaseApp, firebaseUser, this.zza, this.zzd, this.zze, str, this.zzf.new zza());
    }
}
