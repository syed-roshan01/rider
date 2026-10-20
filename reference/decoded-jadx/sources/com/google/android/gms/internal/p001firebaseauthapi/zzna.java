package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzakk;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzna<KeyFormatProtoT extends zzakk, KeyProtoT extends zzakk> {
    private final Class<KeyFormatProtoT> zza;

    public zzna(Class<KeyFormatProtoT> cls) {
        this.zza = cls;
    }

    public abstract KeyFormatProtoT zza(zzahm zzahmVar);

    public abstract KeyProtoT zza(KeyFormatProtoT keyformatprotot);

    public abstract void zzb(KeyFormatProtoT keyformatprotot);
}
