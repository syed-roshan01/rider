package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzrz extends zzaja<zzrz, zza> implements zzakm {
    private static final zzrz zzc;
    private static volatile zzakx<zzrz> zzd;
    private int zze;
    private int zzf;
    private zzsc zzg;

    public static final class zza extends zzaja.zzb<zzrz, zza> implements zzakm {
        private zza() {
            super(zzrz.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzrz) this.zza).zza(i10);
            return this;
        }

        public /* synthetic */ zza(zzsa zzsaVar) {
            this();
        }

        public final zza zza(zzsc zzscVar) {
            zzh();
            ((zzrz) this.zza).zza(zzscVar);
            return this;
        }
    }

    static {
        zzrz zzrzVar = new zzrz();
        zzc = zzrzVar;
        zzaja.zza((Class<zzrz>) zzrz.class, zzrzVar);
    }

    private zzrz() {
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsc zzd() {
        zzsc zzscVar = this.zzg;
        return zzscVar == null ? zzsc.zzd() : zzscVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }

    public static zzrz zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzrz) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzsa zzsaVar = null;
        switch (zzsa.zza[i10 - 1]) {
            case 1:
                return new zzrz();
            case 2:
                return new zza(zzsaVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzrz> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzrz.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzaja.zza<>(zzc);
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return zzaVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsc zzscVar) {
        zzscVar.getClass();
        this.zzg = zzscVar;
        this.zze |= 1;
    }
}
