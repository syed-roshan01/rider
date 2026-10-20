package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zzmp implements zzmn.zza {
    private final /* synthetic */ zznb zza;

    public zzmp(zznb zznbVar) {
        this.zza = zznbVar;
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.zzmn.zza
    public final <Q> zzbt<Q> zza(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzml(this.zza, cls);
        } catch (IllegalArgumentException e4) {
            throw new GeneralSecurityException("Primitive type not supported", e4);
        }
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.zzmn.zza
    public final Class<?> zzb() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.zzmn.zza
    public final Set<Class<?>> zzc() {
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.zzmn.zza
    public final zzbt<?> zza() {
        zznb zznbVar = this.zza;
        return new zzml(zznbVar, zznbVar.zze());
    }
}
