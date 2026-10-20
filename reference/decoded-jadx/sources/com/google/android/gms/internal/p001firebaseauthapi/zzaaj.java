package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzl;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzaaj extends zzacw<Void, zzl> {
    private final String zzy;
    private final String zzz;

    public zzaaj(String str, String str2) {
        super(7);
        a.v("code cannot be null or empty", str);
        this.zzy = str;
        this.zzz = str2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final String zza() {
        return "applyActionCode";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacw
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzz, this.zzb);
    }
}
