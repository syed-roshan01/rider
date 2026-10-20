package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzui extends zzaja<zzui, zza> implements zzakm {
    private static final zzui zzc;
    private static volatile zzakx<zzui> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzaja.zzb<zzui, zza> implements zzakm {
        private zza() {
            super(zzui.zzc);
        }

        public final zza zza(zzuc zzucVar) {
            zzh();
            ((zzui) this.zza).zza(zzucVar);
            return this;
        }

        public /* synthetic */ zza(zzuh zzuhVar) {
            this();
        }

        public final zza zza(int i10) {
            zzh();
            ((zzui) this.zza).zza(i10);
            return this;
        }
    }

    static {
        zzui zzuiVar = new zzui();
        zzc = zzuiVar;
        zzaja.zza((Class<zzui>) zzui.class, zzuiVar);
    }

    private zzui() {
    }

    public static zza zzc() {
        return zzc.zzl();
    }

    public static zzui zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzuc zzb() {
        zzuc zzucVarZza = zzuc.zza(this.zze);
        return zzucVarZza == null ? zzuc.UNRECOGNIZED : zzucVarZza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzuh zzuhVar = null;
        switch (zzuh.zza[i10 - 1]) {
            case 1:
                return new zzui();
            case 2:
                return new zza(zzuhVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzui> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzui.class) {
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
    public final void zza(zzuc zzucVar) {
        this.zze = zzucVar.zza();
    }
}
