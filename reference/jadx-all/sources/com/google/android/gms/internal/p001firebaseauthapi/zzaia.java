package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzaia extends zzaib {
    private final byte[] zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    private final void zzaa() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = i10 - this.zzj;
        int i12 = this.zzl;
        if (i11 <= i12) {
            this.zzh = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzh = i13;
        this.zzg = i10 - i13;
    }

    private final byte zzv() throws zzajj {
        int i10 = this.zzi;
        if (i10 == this.zzg) {
            throw zzajj.zzi();
        }
        byte[] bArr = this.zze;
        this.zzi = i10 + 1;
        return bArr[i10];
    }

    private final int zzw() throws zzajj {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            throw zzajj.zzi();
        }
        byte[] bArr = this.zze;
        this.zzi = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    private final int zzx() {
        int i10;
        int i11 = this.zzi;
        int i12 = this.zzg;
        if (i12 != i11) {
            byte[] bArr = this.zze;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzi = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.zzi = i14;
                return i10;
            }
        }
        return (int) zzm();
    }

    private final long zzy() throws zzajj {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            throw zzajj.zzi();
        }
        byte[] bArr = this.zze;
        this.zzi = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    private final long zzz() {
        long j10;
        long j11;
        long j12;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zze;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzi = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            long j13 = (-2080896) ^ i18;
                            i13 = i17;
                            j10 = j13;
                        } else {
                            long j14 = i18;
                            i13 = i10 + 5;
                            long j15 = j14 ^ (((long) bArr[i17]) << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                int i19 = i10 + 6;
                                long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j15 = j16 ^ (((long) bArr[i19]) << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i19 = i10 + 8;
                                        j16 = j15 ^ (((long) bArr[i13]) << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i20;
                                                }
                                            }
                                            j10 = j17;
                                        }
                                    }
                                }
                                j10 = j16 ^ j11;
                                i13 = i19;
                            }
                            j10 = j15 ^ j12;
                        }
                    }
                }
                this.zzi = i13;
                return j10;
            }
        }
        return zzm();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final double zza() {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final float zzb() {
        return Float.intBitsToFloat(zzw());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final int zzc() {
        return this.zzi - this.zzj;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final int zzd() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final int zze() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final int zzf() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final int zzg() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final int zzh() {
        return zzaib.zze(zzx());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final int zzi() throws zzajj {
        if (zzt()) {
            this.zzk = 0;
            return 0;
        }
        int iZzx = zzx();
        this.zzk = iZzx;
        if ((iZzx >>> 3) != 0) {
            return iZzx;
        }
        throw zzajj.zzc();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final int zzj() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final long zzk() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final long zzl() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final long zzm() throws zzajj {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bZzv = zzv();
            j10 |= ((long) (bZzv & 127)) << i10;
            if ((bZzv & 128) == 0) {
                return j10;
            }
        }
        throw zzajj.zze();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final long zzn() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final long zzo() {
        return zzaib.zza(zzz());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final long zzp() {
        return zzz();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final zzahm zzq() throws zzajj {
        byte[] bArrCopyOfRange;
        int iZzx = zzx();
        if (iZzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzx <= i10 - i11) {
                zzahm zzahmVarZza = zzahm.zza(this.zze, i11, iZzx);
                this.zzi += iZzx;
                return zzahmVarZza;
            }
        }
        if (iZzx == 0) {
            return zzahm.zza;
        }
        if (iZzx > 0) {
            int i12 = this.zzg;
            int i13 = this.zzi;
            if (iZzx <= i12 - i13) {
                int i14 = iZzx + i13;
                this.zzi = i14;
                bArrCopyOfRange = Arrays.copyOfRange(this.zze, i13, i14);
            } else {
                if (iZzx <= 0) {
                    throw zzajj.zzi();
                }
                if (iZzx == 0) {
                    throw zzajj.zzf();
                }
                bArrCopyOfRange = zzajc.zzb;
            }
        } else {
            if (iZzx <= 0) {
                throw zzajj.zzi();
            }
            if (iZzx == 0) {
                throw zzajj.zzf();
            }
            bArrCopyOfRange = zzajc.zzb;
        }
        return zzahm.zzb(bArrCopyOfRange);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final String zzr() throws zzajj {
        int iZzx = zzx();
        if (iZzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzx <= i10 - i11) {
                String str = new String(this.zze, i11, iZzx, zzajc.zza);
                this.zzi += iZzx;
                return str;
            }
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx < 0) {
            throw zzajj.zzf();
        }
        throw zzajj.zzi();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final String zzs() throws zzajj {
        int iZzx = zzx();
        if (iZzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzx <= i10 - i11) {
                String strZzb = zzaml.zzb(this.zze, i11, iZzx);
                this.zzi += iZzx;
                return strZzb;
            }
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx <= 0) {
            throw zzajj.zzf();
        }
        throw zzajj.zzi();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final boolean zzt() {
        return this.zzi == this.zzg;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final boolean zzu() {
        return zzz() != 0;
    }

    private zzaia(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.zzl = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzg = i11 + i10;
        this.zzi = i10;
        this.zzj = i10;
        this.zzf = z10;
    }

    private final void zzf(int i10) throws zzajj {
        if (i10 >= 0) {
            int i11 = this.zzg;
            int i12 = this.zzi;
            if (i10 <= i11 - i12) {
                this.zzi = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw zzajj.zzi();
        }
        throw zzajj.zzf();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final int zza(int i10) throws zzajj {
        if (i10 < 0) {
            throw zzajj.zzf();
        }
        int iZzc = i10 + zzc();
        if (iZzc < 0) {
            throw zzajj.zzg();
        }
        int i11 = this.zzl;
        if (iZzc > i11) {
            throw zzajj.zzi();
        }
        this.zzl = iZzc;
        zzaa();
        return i11;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final void zzb(int i10) throws zzajj {
        if (this.zzk != i10) {
            throw zzajj.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final void zzc(int i10) {
        this.zzl = i10;
        zzaa();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final boolean zzd(int i10) throws zzajj {
        int iZzi;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i12 < 10) {
                    if (zzv() < 0) {
                        i12++;
                    }
                }
                throw zzajj.zze();
            }
            while (i12 < 10) {
                byte[] bArr = this.zze;
                int i13 = this.zzi;
                this.zzi = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw zzajj.zze();
            return true;
        }
        if (i11 == 1) {
            zzf(8);
            return true;
        }
        if (i11 == 2) {
            zzf(zzx());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw zzajj.zza();
            }
            zzf(4);
            return true;
        }
        do {
            iZzi = zzi();
            if (iZzi == 0) {
                break;
            }
        } while (zzd(iZzi));
        zzb(((i10 >>> 3) << 3) | 4);
        return true;
    }
}
