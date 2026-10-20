package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzti extends zzaja<zzti, zza> implements zzakm {
    private static final zzti zzc;
    private static volatile zzakx<zzti> zzd;

    public static final class zza extends zzaja.zzb<zzti, zza> implements zzakm {
        private zza() {
            super(zzti.zzc);
        }

        public /* synthetic */ zza(zzth zzthVar) {
            this();
        }
    }

    static {
        zzti zztiVar = new zzti();
        zzc = zztiVar;
        zzaja.zza((Class<zzti>) zzti.class, zztiVar);
    }

    private zzti() {
    }

    public static zzti zzb() {
        return zzc;
    }

    public static zzti zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzti) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzth zzthVar = null;
        switch (zzth.zza[i10 - 1]) {
            case 1:
                return new zzti();
            case 2:
                return new zza(zzthVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzc;
            case 5:
                zzakx<zzti> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzti.class) {
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
