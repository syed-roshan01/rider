package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
public final class zzqm extends zzqs {
    private final int zza;
    private final int zzb;
    private final zzc zzc;
    private final zzb zzd;

    public static final class zza {
        private Integer zza;
        private Integer zzb;
        private zzb zzc;
        private zzc zzd;

        public final zza zza(zzb zzbVar) {
            this.zzc = zzbVar;
            return this;
        }

        public final zza zzb(int i10) {
            this.zzb = Integer.valueOf(i10);
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zzc.zzd;
        }

        public final zza zza(zzc zzcVar) {
            this.zzd = zzcVar;
            return this;
        }

        public final zza zza(int i10) {
            this.zza = Integer.valueOf(i10);
            return this;
        }

        public final zzqm zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.zzc == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.zzd != null) {
                if (num.intValue() >= 16) {
                    int iIntValue = this.zzb.intValue();
                    zzb zzbVar = this.zzc;
                    if (iIntValue >= 10) {
                        if (zzbVar == zzb.zza) {
                            if (iIntValue > 20) {
                                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(iIntValue)));
                            }
                        } else if (zzbVar == zzb.zzb) {
                            if (iIntValue > 28) {
                                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(iIntValue)));
                            }
                        } else if (zzbVar == zzb.zzc) {
                            if (iIntValue > 32) {
                                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(iIntValue)));
                            }
                        } else if (zzbVar == zzb.zzd) {
                            if (iIntValue > 48) {
                                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(iIntValue)));
                            }
                        } else {
                            if (zzbVar != zzb.zze) {
                                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                            }
                            if (iIntValue > 64) {
                                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(iIntValue)));
                            }
                        }
                        return new zzqm(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc);
                    }
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(iIntValue)));
                }
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
            }
            throw new GeneralSecurityException("variant is not set");
        }
    }

    public static final class zzb {
        public static final zzb zza = new zzb("SHA1");
        public static final zzb zzb = new zzb("SHA224");
        public static final zzb zzc = new zzb("SHA256");
        public static final zzb zzd = new zzb("SHA384");
        public static final zzb zze = new zzb("SHA512");
        private final String zzf;

        private zzb(String str) {
            this.zzf = str;
        }

        public final String toString() {
            return this.zzf;
        }
    }

    public static final class zzc {
        public static final zzc zza = new zzc("TINK");
        public static final zzc zzb = new zzc("CRUNCHY");
        public static final zzc zzc = new zzc("LEGACY");
        public static final zzc zzd = new zzc("NO_PREFIX");
        private final String zze;

        private zzc(String str) {
            this.zze = str;
        }

        public final String toString() {
            return this.zze;
        }
    }

    public static zza zzd() {
        return new zza();
    }

    private final int zzg() {
        zzc zzcVar = this.zzc;
        if (zzcVar == zzc.zzd) {
            return this.zzb;
        }
        if (zzcVar != zzc.zza && zzcVar != zzc.zzb && zzcVar != zzc.zzc) {
            throw new IllegalStateException("Unknown variant");
        }
        int i10 = this.zzb;
        return i10 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqm)) {
            return false;
        }
        zzqm zzqmVar = (zzqm) obj;
        return zzqmVar.zza == this.zza && zzqmVar.zzg() == zzg() && zzqmVar.zzc == this.zzc && zzqmVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzqm.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(this.zzd);
        int i10 = this.zzb;
        int i11 = this.zza;
        StringBuilder sbC = k1.c("HMAC Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2, ", ");
        sbC.append(i10);
        sbC.append("-byte tags, and ");
        sbC.append(i11);
        sbC.append("-byte key)");
        return sbC.toString();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzci
    public final boolean zza() {
        return this.zzc != zzc.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzb zze() {
        return this.zzd;
    }

    public final zzc zzf() {
        return this.zzc;
    }

    private zzqm(int i10, int i11, zzc zzcVar, zzb zzbVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzcVar;
        this.zzd = zzbVar;
    }
}
