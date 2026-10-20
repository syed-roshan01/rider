package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzbu;
import com.google.android.gms.internal.p001firebaseauthapi.zzow;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzmx<KeyT extends zzbu, SerializationT extends zzow> {
    private final Class<KeyT> zza;
    private final Class<SerializationT> zzb;

    public abstract SerializationT zza(KeyT keyt, zzct zzctVar);

    public final Class<KeyT> zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zzmx(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static <KeyT extends zzbu, SerializationT extends zzow> zzmx<KeyT, SerializationT> zza(zzmz<KeyT, SerializationT> zzmzVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new zzmw(cls, cls2, zzmzVar);
    }
}
