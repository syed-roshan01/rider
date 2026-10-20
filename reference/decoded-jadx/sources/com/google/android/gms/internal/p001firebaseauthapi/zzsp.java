package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzsp extends zzaja<zzsp, zza> implements zzakm {
    private static final zzsp zzc;
    private static volatile zzakx<zzsp> zzd;
    private int zze;
    private zzss zzf;
    private int zzg;

    public static final class zza extends zzaja.zzb<zzsp, zza> implements zzakm {
        private zza() {
            super(zzsp.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzsp) this.zza).zza(i10);
            return this;
        }

        public /* synthetic */ zza(zzsq zzsqVar) {
            this();
        }

        public final zza zza(zzss zzssVar) {
            zzh();
            ((zzsp) this.zza).zza(zzssVar);
            return this;
        }
    }

    static {
        zzsp zzspVar = new zzsp();
        zzc = zzspVar;
        zzaja.zza((Class<zzsp>) zzsp.class, zzspVar);
    }

    private zzsp() {
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzss zzd() {
        zzss zzssVar = this.zzf;
        return zzssVar == null ? zzss.zzd() : zzssVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzg = i10;
    }

    public static zzsp zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzsp) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzsq zzsqVar = null;
        switch (zzsq.zza[i10 - 1]) {
            case 1:
                return new zzsp();
            case 2:
                return new zza(zzsqVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzsp> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzsp.class) {
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
    public final void zza(zzss zzssVar) {
        zzssVar.getClass();
        this.zzf = zzssVar;
        this.zze |= 1;
    }
}
