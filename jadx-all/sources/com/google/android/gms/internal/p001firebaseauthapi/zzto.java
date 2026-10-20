package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzto extends zzaja<zzto, zza> implements zzakm {
    private static final zzto zzc;
    private static volatile zzakx<zzto> zzd;
    private int zze;
    private zztp zzf;

    public static final class zza extends zzaja.zzb<zzto, zza> implements zzakm {
        private zza() {
            super(zzto.zzc);
        }

        public final zza zza(zztp zztpVar) {
            zzh();
            ((zzto) this.zza).zza(zztpVar);
            return this;
        }

        public /* synthetic */ zza(zztn zztnVar) {
            this();
        }
    }

    static {
        zzto zztoVar = new zzto();
        zzc = zztoVar;
        zzaja.zza((Class<zzto>) zzto.class, zztoVar);
    }

    private zzto() {
    }

    public static zza zza() {
        return zzc.zzl();
    }

    public final zztp zzc() {
        zztp zztpVar = this.zzf;
        return zztpVar == null ? zztp.zze() : zztpVar;
    }

    public static zzto zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzto) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zztn zztnVar = null;
        switch (zztn.zza[i10 - 1]) {
            case 1:
                return new zzto();
            case 2:
                return new zza(zztnVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzto> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzto.class) {
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
    public final void zza(zztp zztpVar) {
        zztpVar.getClass();
        this.zzf = zztpVar;
        this.zze |= 1;
    }
}
