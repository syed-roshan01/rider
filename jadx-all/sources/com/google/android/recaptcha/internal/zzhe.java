package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzhe extends zzhh {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzhe(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i11;
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzb(byte b10) throws zzhf {
        try {
            byte[] bArr = this.zzc;
            int i10 = this.zze;
            this.zze = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzhf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e4);
        }
    }

    public final void zzc(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i11);
            this.zze += i11;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzhf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i11)), e4);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzd(int i10, boolean z10) throws zzhf {
        zzq(i10 << 3);
        zzb(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zze(int i10, zzgw zzgwVar) {
        zzq((i10 << 3) | 2);
        zzq(zzgwVar.zzd());
        zzgwVar.zzi(this);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzf(int i10, int i11) throws zzhf {
        zzq((i10 << 3) | 5);
        zzg(i11);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzg(int i10) throws zzhf {
        try {
            byte[] bArr = this.zzc;
            int i11 = this.zze;
            bArr[i11] = (byte) (i10 & 255);
            bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
            bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
            this.zze = i11 + 4;
            bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzhf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e4);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzh(int i10, long j10) throws zzhf {
        zzq((i10 << 3) | 1);
        zzi(j10);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzi(long j10) throws zzhf {
        try {
            byte[] bArr = this.zzc;
            int i10 = this.zze;
            bArr[i10] = (byte) (((int) j10) & 255);
            bArr[i10 + 1] = (byte) (((int) (j10 >> 8)) & 255);
            bArr[i10 + 2] = (byte) (((int) (j10 >> 16)) & 255);
            bArr[i10 + 3] = (byte) (((int) (j10 >> 24)) & 255);
            bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
            bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
            bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
            this.zze = i10 + 8;
            bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzhf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e4);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzj(int i10, int i11) throws zzhf {
        zzq(i10 << 3);
        zzk(i11);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzk(int i10) throws zzhf {
        if (i10 >= 0) {
            zzq(i10);
        } else {
            zzs(i10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzl(byte[] bArr, int i10, int i11) {
        zzc(bArr, 0, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzm(int i10, String str) throws zzhf {
        zzq((i10 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws zzhf {
        int i10 = this.zze;
        try {
            int iZzy = zzhh.zzy(str.length() * 3);
            int iZzy2 = zzhh.zzy(str.length());
            if (iZzy2 != iZzy) {
                zzq(zzma.zzc(str));
                byte[] bArr = this.zzc;
                int i11 = this.zze;
                this.zze = zzma.zzb(str, bArr, i11, this.zzd - i11);
                return;
            }
            int i12 = i10 + iZzy2;
            this.zze = i12;
            int iZzb = zzma.zzb(str, this.zzc, i12, this.zzd - i12);
            this.zze = i10;
            zzq((iZzb - i10) - iZzy2);
            this.zze = iZzb;
        } catch (zzlz e4) {
            this.zze = i10;
            zzC(str, e4);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzhf(e10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzo(int i10, int i11) {
        zzq((i10 << 3) | i11);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzp(int i10, int i11) {
        zzq(i10 << 3);
        zzq(i11);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzq(int i10) {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzc;
                int i11 = this.zze;
                this.zze = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzhf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e4);
            }
        }
        byte[] bArr2 = this.zzc;
        int i12 = this.zze;
        this.zze = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzr(int i10, long j10) throws zzhf {
        zzq(i10 << 3);
        zzs(j10);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzs(long j10) throws zzhf {
        if (!zzhh.zzd || this.zzd - this.zze < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzc;
                    int i10 = this.zze;
                    this.zze = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new zzhf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e4);
                }
            }
            byte[] bArr2 = this.zzc;
            int i11 = this.zze;
            this.zze = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while (true) {
            int i12 = (int) j10;
            if ((j10 & (-128)) == 0) {
                byte[] bArr3 = this.zzc;
                int i13 = this.zze;
                this.zze = i13 + 1;
                zzlv.zzn(bArr3, i13, (byte) i12);
                return;
            }
            byte[] bArr4 = this.zzc;
            int i14 = this.zze;
            this.zze = i14 + 1;
            zzlv.zzn(bArr4, i14, (byte) ((i12 & 127) | 128));
            j10 >>>= 7;
        }
    }
}
