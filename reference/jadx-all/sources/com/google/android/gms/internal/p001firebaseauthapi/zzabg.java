package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.internal.zzl;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzabg extends zzacw<Void, zzl> {
    private final zzyb zzy;

    public zzabg(String str, ActionCodeSettings actionCodeSettings) {
        super(6);
        a.v("token cannot be null or empty", str);
        this.zzy = new zzyb(str, actionCodeSettings);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final String zza() {
        return "sendEmailVerification";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacw
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzb);
    }
}
