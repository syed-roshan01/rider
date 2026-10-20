package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
public final class zzmn {
    private static final Logger zza = Logger.getLogger(zzmn.class.getName());
    private static final zzmn zzb = new zzmn();
    private ConcurrentMap<String, zza> zzc = new ConcurrentHashMap();
    private ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();

    public interface zza {
        zzbt<?> zza();

        <P> zzbt<P> zza(Class<P> cls);

        Class<?> zzb();

        Set<Class<?>> zzc();
    }

    public static zzmn zza() {
        return zzb;
    }

    private final synchronized zza zzc(String str) {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.zzc.get(str);
    }

    public final boolean zzb(String str) {
        return this.zzd.get(str).booleanValue();
    }

    public final <P> zzbt<P> zza(String str, Class<P> cls) throws GeneralSecurityException {
        zza zzaVarZzc = zzc(str);
        if (zzaVarZzc.zzc().contains(cls)) {
            return zzaVarZzc.zza(cls);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzaVarZzc.zzb());
        Set<Class<?>> setZzc = zzaVarZzc.zzc();
        StringBuilder sb = new StringBuilder();
        boolean z10 = true;
        for (Class<?> cls2 : setZzc) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z10 = false;
        }
        String string = sb.toString();
        StringBuilder sbC = k1.c("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", supported primitives: ");
        sbC.append(string);
        throw new GeneralSecurityException(sbC.toString());
    }

    public final zzbt<?> zza(String str) {
        return zzc(str).zza();
    }

    private static <KeyProtoT extends zzakk> zza zza(zznb<KeyProtoT> zznbVar) {
        return new zzmp(zznbVar);
    }

    public final synchronized <KeyProtoT extends zzakk, PublicKeyProtoT extends zzakk> void zza(zzoq<KeyProtoT, PublicKeyProtoT> zzoqVar, zznb<PublicKeyProtoT> zznbVar, boolean z10) {
        zzic.zza zzaVarZza = zzoqVar.zza();
        zzic.zza zzaVarZza2 = zznbVar.zza();
        if (zzaVarZza.zza()) {
            if (zzaVarZza2.zza()) {
                zza((zza) new zzmr(zzoqVar, zznbVar), true, true);
                zza(zza(zznbVar), false, false);
            } else {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zznbVar.getClass()) + " as it is not FIPS compatible.");
            }
        } else {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzoqVar.getClass()) + " as it is not FIPS compatible.");
        }
    }

    public final synchronized <P> void zza(zzbt<P> zzbtVar, boolean z10) {
        zza((zzbt) zzbtVar, zzic.zza.zza, true);
    }

    public final synchronized <KeyProtoT extends zzakk> void zza(zznb<KeyProtoT> zznbVar, boolean z10) {
        if (zznbVar.zza().zza()) {
            zza(zza(zznbVar), false, true);
        } else {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zznbVar.getClass()) + " as it is not FIPS compatible.");
        }
    }

    private final synchronized void zza(zza zzaVar, boolean z10, boolean z11) {
        try {
            String strZzb = zzaVar.zza().zzb();
            if (z11 && this.zzd.containsKey(strZzb) && !this.zzd.get(strZzb).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + strZzb);
            }
            zza zzaVar2 = this.zzc.get(strZzb);
            if (zzaVar2 != null && !zzaVar2.zzb().equals(zzaVar.zzb())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type " + strZzb);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzb, zzaVar2.zzb().getName(), zzaVar.zzb().getName()));
            }
            if (!z10) {
                this.zzc.putIfAbsent(strZzb, zzaVar);
            } else {
                this.zzc.put(strZzb, zzaVar);
            }
            this.zzd.put(strZzb, Boolean.valueOf(z11));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized <P> void zza(zzbt<P> zzbtVar, zzic.zza zzaVar, boolean z10) {
        if (zzaVar.zza()) {
            zza((zza) new zzmq(zzbtVar), false, z10);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}
