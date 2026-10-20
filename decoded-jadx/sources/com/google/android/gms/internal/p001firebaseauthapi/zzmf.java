package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzmf<E extends Enum<E>, O> {
    private final Map<E, O> zza;
    private final Map<O, E> zzb;

    public static <E extends Enum<E>, O> zzmi<E, O> zza() {
        return new zzmi<>();
    }

    private zzmf(Map<E, O> map, Map<O, E> map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final E zza(O o10) throws GeneralSecurityException {
        E e4 = this.zzb.get(o10);
        if (e4 != null) {
            return e4;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(o10)));
    }

    public final O zza(E e4) throws GeneralSecurityException {
        O o10 = this.zza.get(e4);
        if (o10 != null) {
            return o10;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(e4)));
    }
}
