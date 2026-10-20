package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;

/* JADX INFO: loaded from: classes.dex */
final class zzaay extends zzacw<Void, zzl> {
    private final zzyf zzy;

    public zzaay(EmailAuthCredential emailAuthCredential, String str) {
        super(2);
        if (emailAuthCredential == null) {
            throw new NullPointerException("Credential cannot be null");
        }
        this.zzy = new zzyf(emailAuthCredential, str);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final String zza() {
        return "reauthenticateWithEmailLink";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacw
    public final void zzb() {
        zzaf zzafVarZza = zzaag.zza(this.zzc, this.zzk);
        if (!this.zzd.getUid().equalsIgnoreCase(zzafVarZza.getUid())) {
            zza(new Status(FirebaseError.ERROR_USER_MISMATCH, null));
        } else {
            ((zzl) this.zze).zza(this.zzj, zzafVarZza);
            zzb(null);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzb);
    }
}
