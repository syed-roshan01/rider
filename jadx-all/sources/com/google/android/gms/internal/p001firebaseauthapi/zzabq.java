package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzam;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzabq extends zzacw<zzagi, Void> {
    private final zzagl zzy;

    public zzabq(zzam zzamVar, String str) {
        super(12);
        a.x(zzamVar);
        String strZzb = zzamVar.zzb();
        a.u(strZzb);
        this.zzy = zzagl.zza(strZzb, str);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacw
    public final void zzb() {
        zzb(this.zzv);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzb);
    }
}
