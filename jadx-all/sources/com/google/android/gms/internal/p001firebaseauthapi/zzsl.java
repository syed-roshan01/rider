package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzsl extends zzaja<zzsl, zza> implements zzakm {
    private static final zzsl zzc;
    private static volatile zzakx<zzsl> zzd;
    private int zze;

    public static final class zza extends zzaja.zzb<zzsl, zza> implements zzakm {
        private zza() {
            super(zzsl.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzsl) this.zza).zza(i10);
            return this;
        }

        public /* synthetic */ zza(zzsm zzsmVar) {
            this();
        }
    }

    static {
        zzsl zzslVar = new zzsl();
        zzc = zzslVar;
        zzaja.zza((Class<zzsl>) zzsl.class, zzslVar);
    }

    private zzsl() {
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static zzsl zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzsm zzsmVar = null;
        switch (zzsm.zza[i10 - 1]) {
            case 1:
                return new zzsl();
            case 2:
                return new zza(zzsmVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzsl> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzsl.class) {
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
}
