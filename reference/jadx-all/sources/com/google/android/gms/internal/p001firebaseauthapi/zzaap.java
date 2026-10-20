package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.internal.zzl;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzaap extends zzacw<Void, zzl> {
    private final String zzaa;
    private final String zzab;
    private final MultiFactorAssertion zzy;
    private final String zzz;

    public zzaap(MultiFactorAssertion multiFactorAssertion, String str, String str2, String str3) {
        super(2);
        if (multiFactorAssertion == null) {
            throw new NullPointerException("null reference");
        }
        this.zzy = multiFactorAssertion;
        a.u(str);
        this.zzz = str;
        this.zzaa = str2;
        this.zzab = str3;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacw
    public final void zzb() {
        ((zzl) this.zze).zza(this.zzj, zzaag.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzz, this.zzaa, this.zzab, this.zzb);
    }
}
