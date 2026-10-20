package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzam;
import com.google.firebase.auth.internal.zzl;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzabr extends zzacw<Void, zzl> {
    private final String zzaa;
    private final long zzab;
    private final boolean zzac;
    private final boolean zzad;
    private final String zzae;
    private final String zzaf;
    private final boolean zzag;
    private final String zzy;
    private final String zzz;

    public zzabr(zzam zzamVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12) {
        super(8);
        a.x(zzamVar);
        a.u(str);
        String strZzb = zzamVar.zzb();
        a.u(strZzb);
        this.zzy = strZzb;
        this.zzz = str;
        this.zzaa = str2;
        this.zzab = j10;
        this.zzac = z10;
        this.zzad = z11;
        this.zzae = str3;
        this.zzaf = str4;
        this.zzag = z12;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacw
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzae, this.zzaf, this.zzag, this.zzb);
    }
}
