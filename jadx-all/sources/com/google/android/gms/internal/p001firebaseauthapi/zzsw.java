package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzsw extends zzaja<zzsw, zza> implements zzakm {
    private static final zzsw zzc;
    private static volatile zzakx<zzsw> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzaja.zzb<zzsw, zza> implements zzakm {
        private zza() {
            super(zzsw.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzsw) this.zza).zza(i10);
            return this;
        }

        public /* synthetic */ zza(zzsv zzsvVar) {
            this();
        }
    }

    static {
        zzsw zzswVar = new zzsw();
        zzc = zzswVar;
        zzaja.zza((Class<zzsw>) zzsw.class, zzswVar);
    }

    private zzsw() {
    }

    public static zza zzc() {
        return zzc.zzl();
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zze = i10;
    }

    public static zzsw zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzsw) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzsv zzsvVar = null;
        switch (zzsv.zza[i10 - 1]) {
            case 1:
                return new zzsw();
            case 2:
                return new zza(zzsvVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzsw> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzsw.class) {
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
