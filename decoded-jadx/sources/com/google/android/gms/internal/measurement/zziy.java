package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class zziy implements zzkk {
    private static final zziy zza = new zziy();

    private zziy() {
    }

    public static zziy zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkk
    public final boolean zzb(Class<?> cls) {
        return zzix.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zzkk
    public final zzkh zza(Class<?> cls) {
        if (!zzix.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzkh) zzix.zza(cls.asSubclass(zzix.class)).zza(zzix.zze.zzc, (Object) null, (Object) null);
        } catch (Exception e4) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
        }
    }
}
