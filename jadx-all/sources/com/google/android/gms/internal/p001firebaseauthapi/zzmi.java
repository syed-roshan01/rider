package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzmi<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    public final zzmi<E, O> zza(E e4, O o10) {
        this.zza.put(e4, o10);
        this.zzb.put(o10, e4);
        return this;
    }

    private zzmi() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzmf<E, O> zza() {
        return new zzmf<>(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb));
    }
}
