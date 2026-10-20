package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.internal.zzl;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzabj extends zzacw<Void, zzl> {
    private final zzya zzy;
    private final String zzz;

    public zzabj(String str, ActionCodeSettings actionCodeSettings, String str2, String str3, String str4) {
        super(4);
        a.v("email cannot be null or empty", str);
        this.zzy = new zzya(str, actionCodeSettings, str2, str3);
        this.zzz = str4;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final String zza() {
        return this.zzz;
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
