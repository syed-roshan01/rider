package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class zzaky {
    private static final zzaky zza = new zzaky();
    private final ConcurrentMap<Class<?>, zzalc<?>> zzc = new ConcurrentHashMap();
    private final zzalf zzb = new zzajy();

    private zzaky() {
    }

    public static zzaky zza() {
        return zza;
    }

    public final <T> zzalc<T> zza(Class<T> cls) {
        zzajc.zza(cls, "messageType");
        zzalc<T> zzalcVar = (zzalc) this.zzc.get(cls);
        if (zzalcVar != null) {
            return zzalcVar;
        }
        zzalc<T> zzalcVarZza = this.zzb.zza(cls);
        zzajc.zza(cls, "messageType");
        zzajc.zza(zzalcVarZza, "schema");
        zzalc<T> zzalcVar2 = (zzalc) this.zzc.putIfAbsent(cls, zzalcVarZza);
        return zzalcVar2 != null ? zzalcVar2 : zzalcVarZza;
    }

    public final <T> zzalc<T> zza(T t10) {
        return zza((Class) t10.getClass());
    }
}
