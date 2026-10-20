package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzakk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class zznb<KeyProtoT extends zzakk> {
    private final Class<KeyProtoT> zza;
    private final Map<Class<?>, zzoi<?, KeyProtoT>> zzb;
    private final Class<?> zzc;

    @SafeVarargs
    public zznb(Class<KeyProtoT> cls, zzoi<?, KeyProtoT>... zzoiVarArr) {
        this.zza = cls;
        HashMap map = new HashMap();
        for (zzoi<?, KeyProtoT> zzoiVar : zzoiVarArr) {
            if (map.containsKey(zzoiVar.zza())) {
                throw new IllegalArgumentException(q.x("KeyTypeManager constructed with duplicate factories for primitive ", zzoiVar.zza().getCanonicalName()));
            }
            map.put(zzoiVar.zza(), zzoiVar);
        }
        if (zzoiVarArr.length > 0) {
            this.zzc = zzoiVarArr[0].zza();
        } else {
            this.zzc = Void.class;
        }
        this.zzb = Collections.unmodifiableMap(map);
    }

    public abstract KeyProtoT zza(zzahm zzahmVar);

    public abstract zzic.zza zza();

    public final <P> P zza(KeyProtoT keyprotot, Class<P> cls) {
        zzoi<?, KeyProtoT> zzoiVar = this.zzb.get(cls);
        if (zzoiVar != null) {
            return (P) zzoiVar.zza(keyprotot);
        }
        throw new IllegalArgumentException(q.k("Requested primitive class ", cls.getCanonicalName(), " not supported."));
    }

    public zzna<?, KeyProtoT> zzb() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract void zzb(KeyProtoT keyprotot);

    public abstract zzux.zzb zzc();

    public abstract String zzd();

    public final Class<?> zze() {
        return this.zzc;
    }

    public final Class<KeyProtoT> zzf() {
        return this.zza;
    }

    public final Set<Class<?>> zzg() {
        return this.zzb.keySet();
    }
}
