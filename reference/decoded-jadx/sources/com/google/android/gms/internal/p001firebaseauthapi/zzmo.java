package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzakk;

/* JADX INFO: loaded from: classes.dex */
final class zzmo<KeyFormatProtoT extends zzakk, KeyProtoT extends zzakk> {
    private final zzna<KeyFormatProtoT, KeyProtoT> zza;

    public zzmo(zzna<KeyFormatProtoT, KeyProtoT> zznaVar) {
        this.zza = zznaVar;
    }

    public final KeyProtoT zza(zzahm zzahmVar) {
        zzakk zzakkVarZza = this.zza.zza(zzahmVar);
        this.zza.zzb(zzakkVarZza);
        return (KeyProtoT) this.zza.zza(zzakkVarZza);
    }
}
