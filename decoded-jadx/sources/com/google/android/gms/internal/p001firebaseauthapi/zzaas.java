package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzz;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzaas extends zzacw<AuthResult, zzl> {
    private final EmailAuthCredential zzy;
    private final String zzz;

    public zzaas(EmailAuthCredential emailAuthCredential, String str) {
        super(2);
        if (emailAuthCredential == null) {
            throw new NullPointerException("credential cannot be null");
        }
        this.zzy = emailAuthCredential;
        a.v("email cannot be null", emailAuthCredential.zzc());
        a.v("password cannot be null", emailAuthCredential.zzd());
        this.zzz = str;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final String zza() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacw
    public final void zzb() {
        zzaf zzafVarZza = zzaag.zza(this.zzc, this.zzk);
        ((zzl) this.zze).zza(this.zzj, zzafVarZza);
        zzb(new zzz(zzafVarZza));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        String strZzc = this.zzy.zzc();
        String strZzd = this.zzy.zzd();
        a.u(strZzd);
        zzaceVar.zza(strZzc, strZzd, this.zzd.zze(), this.zzd.getTenantId(), this.zzz, this.zzb);
    }
}
