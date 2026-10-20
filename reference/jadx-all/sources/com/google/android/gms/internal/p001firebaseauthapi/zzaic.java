package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import l.q;

/* JADX INFO: loaded from: classes.dex */
final class zzaic extends zzaib {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzaif zzm;

    private final void zzaa() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = this.zzk + i10;
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
        if (this.zzi == this.zzg) {
            zzg(1);
        }
        byte[] bArr = this.zzf;
        int i10 = this.zzi;
        this.zzi = i10 + 1;
        return bArr[i10];
    }

    private final int zzw() throws zzajj {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            zzg(4);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    private final int zzx() {
        int i10;
        int i11 = this.zzi;
        int i12 = this.zzg;
        if (i12 != i11) {
            byte[] bArr = this.zzf;
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
            zzg(8);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
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
            byte[] bArr = this.zzf;
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
        return this.zzk + this.zzi;
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
            this.zzj = 0;
            return 0;
        }
        int iZzx = zzx();
        this.zzj = iZzx;
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

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final zzahm zzq() throws IOException {
        int iZzx = zzx();
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (iZzx <= i10 - i11 && iZzx > 0) {
            zzahm zzahmVarZza = zzahm.zza(this.zzf, i11, iZzx);
            this.zzi += iZzx;
            return zzahmVarZza;
        }
        if (iZzx == 0) {
            return zzahm.zza;
        }
        byte[] bArrZzj = zzj(iZzx);
        if (bArrZzj != null) {
            return zzahm.zza(bArrZzj);
        }
        int i12 = this.zzi;
        int i13 = this.zzg;
        int length = i13 - i12;
        this.zzk += i13;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzf = zzf(iZzx - length);
        byte[] bArr = new byte[iZzx];
        System.arraycopy(this.zzf, i12, bArr, 0, length);
        for (byte[] bArr2 : listZzf) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return zzahm.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final String zzr() throws zzajj {
        int iZzx = zzx();
        if (iZzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzx <= i10 - i11) {
                String str = new String(this.zzf, i11, iZzx, zzajc.zza);
                this.zzi += iZzx;
                return str;
            }
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx > this.zzg) {
            return new String(zza(iZzx, false), zzajc.zza);
        }
        zzg(iZzx);
        String str2 = new String(this.zzf, this.zzi, iZzx, zzajc.zza);
        this.zzi += iZzx;
        return str2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final String zzs() throws IOException {
        byte[] bArrZza;
        int iZzx = zzx();
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (iZzx <= i11 - i10 && iZzx > 0) {
            bArrZza = this.zzf;
            this.zzi = i10 + iZzx;
        } else {
            if (iZzx == 0) {
                return "";
            }
            i10 = 0;
            if (iZzx <= i11) {
                zzg(iZzx);
                bArrZza = this.zzf;
                this.zzi = iZzx;
            } else {
                bArrZza = zza(iZzx, false);
            }
        }
        return zzaml.zzb(bArrZza, i10, iZzx);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final boolean zzt() {
        return this.zzi == this.zzg && !zzi(1);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final boolean zzu() {
        return zzz() != 0;
    }

    private zzaic(InputStream inputStream, int i10) {
        super();
        this.zzl = Integer.MAX_VALUE;
        this.zzm = null;
        zzajc.zza(inputStream, "input");
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private static int zza(InputStream inputStream) throws zzajj {
        try {
            return inputStream.available();
        } catch (zzajj e4) {
            e4.zzj();
            throw e4;
        }
    }

    private final List<byte[]> zzf(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.zze.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw zzajj.zzi();
                }
                this.zzk += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzg(int i10) throws zzajj {
        if (zzi(i10)) {
            return;
        }
        if (i10 <= (this.zzc - this.zzk) - this.zzi) {
            throw zzajj.zzi();
        }
        throw zzajj.zzh();
    }

    private final void zzh(int i10) throws zzajj {
        int i11 = this.zzg;
        int i12 = this.zzi;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.zzi = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw zzajj.zzf();
        }
        int i13 = this.zzk;
        int i14 = i13 + i12 + i10;
        int i15 = this.zzl;
        if (i14 > i15) {
            zzh((i15 - i13) - i12);
            throw zzajj.zzi();
        }
        this.zzk = i13 + i12;
        int i16 = i11 - i12;
        this.zzg = 0;
        this.zzi = 0;
        while (i16 < i10) {
            try {
                long j10 = i10 - i16;
                long jZza = zza(this.zze, j10);
                if (jZza >= 0 && jZza <= j10) {
                    if (jZza == 0) {
                        break;
                    } else {
                        i16 += (int) jZza;
                    }
                } else {
                    throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jZza + "\nThe InputStream implementation is buggy.");
                }
            } finally {
                this.zzk += i16;
                zzaa();
            }
        }
        if (i16 >= i10) {
            return;
        }
        int i17 = this.zzg;
        int i18 = i17 - this.zzi;
        this.zzi = i17;
        zzg(1);
        while (true) {
            int i19 = i10 - i18;
            int i20 = this.zzg;
            if (i19 <= i20) {
                this.zzi = i19;
                return;
            } else {
                i18 += i20;
                this.zzi = i20;
                zzg(1);
            }
        }
    }

    private final byte[] zzj(int i10) throws zzajj {
        if (i10 == 0) {
            return zzajc.zzb;
        }
        if (i10 < 0) {
            throw zzajj.zzf();
        }
        int i11 = this.zzk;
        int i12 = this.zzi;
        int i13 = i11 + i12 + i10;
        if (i13 - this.zzc > 0) {
            throw zzajj.zzh();
        }
        int i14 = this.zzl;
        if (i13 > i14) {
            zzh((i14 - i11) - i12);
            throw zzajj.zzi();
        }
        int i15 = this.zzg - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096 && i16 > zza(this.zze)) {
            return null;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i15);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i15 < i10) {
            int iZza = zza(this.zze, bArr, i15, i10 - i15);
            if (iZza == -1) {
                throw zzajj.zzi();
            }
            this.zzk += iZza;
            i15 += iZza;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final void zzb(int i10) throws zzajj {
        if (this.zzj != i10) {
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
                byte[] bArr = this.zzf;
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
            zzh(8);
            return true;
        }
        if (i11 == 2) {
            zzh(zzx());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw zzajj.zza();
            }
            zzh(4);
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

    private final boolean zzi(int i10) throws zzajj {
        do {
            int i11 = this.zzi;
            int i12 = i11 + i10;
            int i13 = this.zzg;
            if (i12 <= i13) {
                throw new IllegalStateException(q.h("refillBuffer() called when ", i10, " bytes were already available in buffer"));
            }
            int i14 = this.zzc;
            int i15 = this.zzk;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.zzl) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.zzf;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.zzk += i11;
                this.zzg -= i11;
                this.zzi = 0;
            }
            InputStream inputStream = this.zze;
            byte[] bArr2 = this.zzf;
            int i16 = this.zzg;
            int iZza = zza(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.zzc - this.zzk) - i16));
            if (iZza == 0 || iZza < -1 || iZza > this.zzf.length) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + iZza + "\nThe InputStream implementation is buggy.");
            }
            if (iZza <= 0) {
                return false;
            }
            this.zzg += iZza;
            zzaa();
        } while (this.zzg < i10);
        return true;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaib
    public final int zza(int i10) throws zzajj {
        if (i10 < 0) {
            throw zzajj.zzf();
        }
        int i11 = this.zzk + this.zzi + i10;
        int i12 = this.zzl;
        if (i11 <= i12) {
            this.zzl = i11;
            zzaa();
            return i12;
        }
        throw zzajj.zzi();
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i10, int i11) throws zzajj {
        try {
            return inputStream.read(bArr, i10, i11);
        } catch (zzajj e4) {
            e4.zzj();
            throw e4;
        }
    }

    private static long zza(InputStream inputStream, long j10) throws zzajj {
        try {
            return inputStream.skip(j10);
        } catch (zzajj e4) {
            e4.zzj();
            throw e4;
        }
    }

    private final byte[] zza(int i10, boolean z10) throws IOException {
        byte[] bArrZzj = zzj(i10);
        if (bArrZzj != null) {
            return bArrZzj;
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int length = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzf = zzf(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, i11, bArr, 0, length);
        for (byte[] bArr2 : listZzf) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }
}
