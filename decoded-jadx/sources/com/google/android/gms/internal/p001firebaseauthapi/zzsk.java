package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzsk extends zzaja<zzsk, zza> implements zzakm {
    private static final zzsk zzc;
    private static volatile zzakx<zzsk> zzd;
    private int zze;
    private zzsl zzf;
    private int zzg;

    public static final class zza extends zzaja.zzb<zzsk, zza> implements zzakm {
        private zza() {
            super(zzsk.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzsk) this.zza).zza(i10);
            return this;
        }

        public /* synthetic */ zza(zzsj zzsjVar) {
            this();
        }

        public final zza zza(zzsl zzslVar) {
            zzh();
            ((zzsk) this.zza).zza(zzslVar);
            return this;
        }
    }

    static {
        zzsk zzskVar = new zzsk();
        zzc = zzskVar;
        zzaja.zza((Class<zzsk>) zzsk.class, zzskVar);
    }

    private zzsk() {
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static zzsk zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzsl zze() {
        zzsl zzslVar = this.zzf;
        return zzslVar == null ? zzsl.zzd() : zzslVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzg = i10;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzsj zzsjVar = null;
        switch (zzsj.zza[i10 - 1]) {
            case 1:
                return new zzsk();
            case 2:
                return new zza(zzsjVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzsk> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzsk.class) {
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
    public final void zza(zzsl zzslVar) {
        zzslVar.getClass();
        this.zzf = zzslVar;
        this.zze |= 1;
    }
}
