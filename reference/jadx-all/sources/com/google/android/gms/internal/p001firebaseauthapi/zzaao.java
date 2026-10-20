package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzz;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzaao extends zzacw<AuthResult, zzl> {
    private final String zzaa;
    private final MultiFactorAssertion zzy;
    private final String zzz;

    public zzaao(MultiFactorAssertion multiFactorAssertion, String str, String str2) {
        super(2);
        if (multiFactorAssertion == null) {
            throw new NullPointerException("null reference");
        }
        this.zzy = multiFactorAssertion;
        a.u(str);
        this.zzz = str;
        this.zzaa = str2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacw
    public final void zzb() {
        zzaf zzafVarZza = zzaag.zza(this.zzc, this.zzk);
        FirebaseUser firebaseUser = this.zzd;
        if (firebaseUser != null && !firebaseUser.getUid().equalsIgnoreCase(zzafVarZza.getUid())) {
            zza(new Status(FirebaseError.ERROR_USER_MISMATCH, null));
        } else {
            ((zzl) this.zze).zza(this.zzj, zzafVarZza);
            zzb(new zzz(zzafVarZza));
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzz, this.zzy, this.zzaa, this.zzb);
    }
}
