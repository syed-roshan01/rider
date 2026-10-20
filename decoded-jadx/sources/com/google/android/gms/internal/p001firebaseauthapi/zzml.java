package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzakk;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
class zzml<PrimitiveT, KeyProtoT extends zzakk> implements zzbt<PrimitiveT> {
    private final zznb<KeyProtoT> zza;
    private final Class<PrimitiveT> zzb;

    public zzml(zznb<KeyProtoT> zznbVar, Class<PrimitiveT> cls) {
        if (!zznbVar.zzg().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zznbVar.toString(), cls.getName()));
        }
        this.zza = zznbVar;
        this.zzb = cls;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbt
    public final Class<PrimitiveT> zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbt
    public final PrimitiveT zzb(zzahm zzahmVar) throws GeneralSecurityException {
        try {
            zzakk zzakkVarZza = this.zza.zza(zzahmVar);
            if (Void.class.equals(this.zzb)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            this.zza.zzb(zzakkVarZza);
            return (PrimitiveT) this.zza.zza(zzakkVarZza, this.zzb);
        } catch (zzajj e4) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zzf().getName()), e4);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbt
    public final zzux zza(zzahm zzahmVar) throws GeneralSecurityException {
        try {
            return (zzux) ((zzaja) zzux.zza().zza(this.zza.zzd()).zza(new zzmo(this.zza.zzb()).zza(zzahmVar).zzi()).zza(this.zza.zzc()).zzf());
        } catch (zzajj e4) {
            throw new GeneralSecurityException("Unexpected proto", e4);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbt
    public final String zzb() {
        return this.zza.zzd();
    }
}
