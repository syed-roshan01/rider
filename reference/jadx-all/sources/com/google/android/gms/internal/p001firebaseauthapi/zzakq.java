package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzakq<T> implements zzalc<T> {
    private final zzakk zza;
    private final zzamb<?, ?> zzb;
    private final boolean zzc;
    private final zzair<?> zzd;

    private zzakq(zzamb<?, ?> zzambVar, zzair<?> zzairVar, zzakk zzakkVar) {
        this.zzb = zzambVar;
        this.zzc = zzairVar.zza(zzakkVar);
        this.zzd = zzairVar;
        this.zza = zzakkVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final int zza(T t10) {
        zzamb<?, ?> zzambVar = this.zzb;
        int iZzb = zzambVar.zzb(zzambVar.zzd(t10));
        return this.zzc ? iZzb + this.zzd.zza(t10).zza() : iZzb;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final int zzb(T t10) {
        int iHashCode = this.zzb.zzd(t10).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zza(t10).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zzc(T t10) {
        this.zzb.zzf(t10);
        this.zzd.zzc(t10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final boolean zzd(T t10) {
        return this.zzd.zza(t10).zzg();
    }

    public static <T> zzakq<T> zza(zzamb<?, ?> zzambVar, zzair<?> zzairVar, zzakk zzakkVar) {
        return new zzakq<>(zzambVar, zzairVar, zzakkVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final boolean zzb(T t10, T t11) {
        if (!this.zzb.zzd(t10).equals(this.zzb.zzd(t11))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t10).equals(this.zzd.zza(t11));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final T zza() {
        zzakk zzakkVar = this.zza;
        if (zzakkVar instanceof zzaja) {
            return (T) ((zzaja) zzakkVar).zzn();
        }
        return (T) zzakkVar.zzp().zzg();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zza(T t10, T t11) {
        zzale.zza(this.zzb, t10, t11);
        if (this.zzc) {
            zzale.zza(this.zzd, t10, t11);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zza(T t10, zzald zzaldVar, zzaip zzaipVar) {
        boolean zZzt;
        zzamb<?, ?> zzambVar = this.zzb;
        zzair<?> zzairVar = this.zzd;
        Object objZzc = zzambVar.zzc(t10);
        zzais<T> zzaisVarZzb = zzairVar.zzb(t10);
        while (zzaldVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzaldVar.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZza = zzairVar.zza(zzaipVar, this.zza, iZzd >>> 3);
                        if (objZza != null) {
                            zzairVar.zza(zzaldVar, objZza, zzaipVar, zzaisVarZzb);
                        } else {
                            zZzt = zzambVar.zza(objZzc, zzaldVar);
                        }
                    } else {
                        zZzt = zzaldVar.zzt();
                    }
                    if (!zZzt) {
                        zzambVar.zzb(t10, objZzc);
                        return;
                    }
                } else {
                    Object objZza2 = null;
                    int iZzj = 0;
                    zzahm zzahmVarZzp = null;
                    while (zzaldVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzaldVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzaldVar.zzj();
                            objZza2 = zzairVar.zza(zzaipVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZza2 != null) {
                                zzairVar.zza(zzaldVar, objZza2, zzaipVar, zzaisVarZzb);
                            } else {
                                zzahmVarZzp = zzaldVar.zzp();
                            }
                        } else if (!zzaldVar.zzt()) {
                            break;
                        }
                    }
                    if (zzaldVar.zzd() != 12) {
                        throw zzajj.zzb();
                    }
                    if (zzahmVarZzp != null) {
                        if (objZza2 != null) {
                            zzairVar.zza(zzahmVarZzp, objZza2, zzaipVar, zzaisVarZzb);
                        } else {
                            zzambVar.zza(objZzc, iZzj, zzahmVarZzp);
                        }
                    }
                }
            } catch (Throwable th) {
                zzambVar.zzb(t10, objZzc);
                throw th;
            }
        }
        zzambVar.zzb(t10, objZzc);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099 A[EDGE_INSN: B:56:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:61:0x0053], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zza(T t10, byte[] bArr, int i10, int i11, zzahl zzahlVar) throws zzajj {
        zzaja zzajaVar = (zzaja) t10;
        zzame zzameVarZzd = zzajaVar.zzb;
        if (zzameVarZzd == zzame.zzc()) {
            zzameVarZzd = zzame.zzd();
            zzajaVar.zzb = zzameVarZzd;
        }
        ((zzaja.zzd) t10).zza();
        zzaja.zzf zzfVar = null;
        while (i10 < i11) {
            int iZzc = zzahi.zzc(bArr, i10, zzahlVar);
            int i12 = zzahlVar.zza;
            if (i12 == 11) {
                int i13 = 0;
                zzahm zzahmVar = null;
                while (iZzc < i11) {
                    iZzc = zzahi.zzc(bArr, iZzc, zzahlVar);
                    int i14 = zzahlVar.zza;
                    int i15 = i14 >>> 3;
                    int i16 = i14 & 7;
                    if (i15 == 2) {
                        if (i16 != 0) {
                            if (i14 != 12) {
                                break;
                                break;
                            }
                            iZzc = zzahi.zza(i14, bArr, iZzc, i11, zzahlVar);
                        } else {
                            iZzc = zzahi.zzc(bArr, iZzc, zzahlVar);
                            i13 = zzahlVar.zza;
                            zzfVar = (zzaja.zzf) this.zzd.zza(zzahlVar.zzd, this.zza, i13);
                        }
                    } else {
                        if (i15 == 3) {
                            if (zzfVar != null) {
                                zzaky.zza();
                                throw new NoSuchMethodError();
                            }
                            if (i16 == 2) {
                                iZzc = zzahi.zza(bArr, iZzc, zzahlVar);
                                zzahmVar = (zzahm) zzahlVar.zzc;
                            }
                        }
                        if (i14 != 12) {
                            break;
                        } else {
                            iZzc = zzahi.zza(i14, bArr, iZzc, i11, zzahlVar);
                        }
                    }
                }
                if (zzahmVar != null) {
                    zzameVarZzd.zza((i13 << 3) | 2, zzahmVar);
                }
                i10 = iZzc;
            } else if ((i12 & 7) == 2) {
                zzfVar = (zzaja.zzf) this.zzd.zza(zzahlVar.zzd, this.zza, i12 >>> 3);
                if (zzfVar == null) {
                    i10 = zzahi.zza(i12, bArr, iZzc, i11, zzameVarZzd, zzahlVar);
                } else {
                    zzaky.zza();
                    throw new NoSuchMethodError();
                }
            } else {
                i10 = zzahi.zza(i12, bArr, iZzc, i11, zzahlVar);
            }
        }
        if (i10 != i11) {
            throw zzajj.zzg();
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalc
    public final void zza(T t10, zzanb zzanbVar) {
        Iterator itZzd = this.zzd.zza(t10).zzd();
        while (itZzd.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzd.next();
            zzaiu zzaiuVar = (zzaiu) entry.getKey();
            if (zzaiuVar.zzc() == zzamy.MESSAGE && !zzaiuVar.zze() && !zzaiuVar.zzd()) {
                if (entry instanceof zzajn) {
                    zzanbVar.zza(zzaiuVar.zza(), (Object) ((zzajn) entry).zza().zzc());
                } else {
                    zzanbVar.zza(zzaiuVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzamb<?, ?> zzambVar = this.zzb;
        zzambVar.zza(zzambVar.zzd(t10), zzanbVar);
    }
}
