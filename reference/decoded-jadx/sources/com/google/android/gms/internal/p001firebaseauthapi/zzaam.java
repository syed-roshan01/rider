package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.SignInMethodQueryResult;
import com.google.firebase.auth.internal.zzar;
import com.google.firebase.auth.internal.zzl;
import f6.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzaam extends zzacw<SignInMethodQueryResult, zzl> {
    private final String zzy;
    private final String zzz;

    public zzaam(String str, String str2) {
        super(3);
        a.v("email cannot be null or empty", str);
        this.zzy = str;
        this.zzz = str2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacw
    public final void zzb() {
        List<String> listZzh;
        if (this.zzl.zza() == null) {
            listZzh = zzaq.zzh();
        } else {
            List<String> listZza = this.zzl.zza();
            a.x(listZza);
            listZzh = listZza;
        }
        zzb(new zzar(listZzh));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zze(this.zzy, this.zzz, this.zzb);
    }
}
