package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzacb extends zzacw<Void, Void> {
    private final zzyg zzy;

    public zzacb(String str, String str2, ActionCodeSettings actionCodeSettings) {
        super(6);
        a.u(str);
        a.u(str2);
        a.x(actionCodeSettings);
        this.zzy = new zzyg(str, str2, actionCodeSettings);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final String zza() {
        return "verifyBeforeUpdateEmail";
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
