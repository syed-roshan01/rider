package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzig extends zzhn {
    private static final Logger zzb = Logger.getLogger(zzig.class.getName());
    private static final boolean zzc = zzmg.zzc();
    zzij zza;

    public static class zza extends zzig {
        private final byte[] zzb;
        private final int zzc;
        private final int zzd;
        private int zze;

        public zza(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i11) | i11) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)));
            }
            this.zzb = bArr;
            this.zzc = 0;
            this.zze = 0;
            this.zzd = i11;
        }

        private final void zzc(byte[] bArr, int i10, int i11) throws zzb {
            try {
                System.arraycopy(bArr, i10, this.zzb, this.zze, i11);
                this.zze += i11;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i11)), e4);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final int zza() {
            return this.zzd - this.zze;
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzb(byte[] bArr, int i10, int i11) throws zzb {
            zzc(i11);
            zzc(bArr, 0, i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzd(int i10, int i11) throws zzb {
            zzc(i10, 0);
            zzc(i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(byte b10) throws zzb {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zze;
                this.zze = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e4);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzb(int i10, int i11) throws zzb {
            zzc(i10, 0);
            zzb(i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzc(int i10, int i11) throws zzb {
            zzc((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(int i10, boolean z10) throws zzb {
            zzc(i10, 0);
            zza(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzb(int i10) throws zzb {
            if (i10 >= 0) {
                zzc(i10);
            } else {
                zzb(i10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzc(int i10) throws zzb {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i11 = this.zze;
                    this.zze = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e4);
                }
            }
            byte[] bArr2 = this.zzb;
            int i12 = this.zze;
            this.zze = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(int i10, zzhm zzhmVar) throws zzb {
            zzc(i10, 2);
            zza(zzhmVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzb(int i10, zzhm zzhmVar) throws zzb {
            zzc(1, 3);
            zzd(2, i10);
            zza(3, zzhmVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(zzhm zzhmVar) throws zzb {
            zzc(zzhmVar.zzb());
            zzhmVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(int i10, int i11) throws zzb {
            zzc(i10, 5);
            zza(i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzb(int i10, long j10) throws zzb {
            zzc(i10, 0);
            zzb(j10);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(int i10) throws zzb {
            try {
                byte[] bArr = this.zzb;
                int i11 = this.zze;
                bArr[i11] = (byte) i10;
                bArr[i11 + 1] = (byte) (i10 >> 8);
                bArr[i11 + 2] = (byte) (i10 >> 16);
                this.zze = i11 + 4;
                bArr[i11 + 3] = (byte) (i10 >>> 24);
            } catch (IndexOutOfBoundsException e4) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e4);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zzb(long j10) throws zzb {
            if (zzig.zzc && zza() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i10 = this.zze;
                    this.zze = i10 + 1;
                    zzmg.zza(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i11 = this.zze;
                this.zze = i11 + 1;
                zzmg.zza(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i12 = this.zze;
                    this.zze = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e4);
                }
            }
            byte[] bArr4 = this.zzb;
            int i13 = this.zze;
            this.zze = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(int i10, long j10) throws zzb {
            zzc(i10, 1);
            zza(j10);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(long j10) throws zzb {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zze;
                bArr[i10] = (byte) j10;
                bArr[i10 + 1] = (byte) (j10 >> 8);
                bArr[i10 + 2] = (byte) (j10 >> 16);
                bArr[i10 + 3] = (byte) (j10 >> 24);
                bArr[i10 + 4] = (byte) (j10 >> 32);
                bArr[i10 + 5] = (byte) (j10 >> 40);
                bArr[i10 + 6] = (byte) (j10 >> 48);
                this.zze = i10 + 8;
                bArr[i10 + 7] = (byte) (j10 >> 56);
            } catch (IndexOutOfBoundsException e4) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e4);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhn
        public final void zza(byte[] bArr, int i10, int i11) throws zzb {
            zzc(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(int i10, zzkj zzkjVar, zzlb zzlbVar) throws zzb {
            zzc(i10, 2);
            zzc(((zzhd) zzkjVar).zza(zzlbVar));
            zzlbVar.zza(zzkjVar, this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(zzkj zzkjVar) throws zzb {
            zzc(zzkjVar.zzbw());
            zzkjVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(int i10, zzkj zzkjVar) throws zzb {
            zzc(1, 3);
            zzd(2, i10);
            zzc(3, 2);
            zza(zzkjVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(int i10, String str) throws zzb {
            zzc(i10, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(String str) throws zzb {
            int i10 = this.zze;
            try {
                int iZzj = zzig.zzj(str.length() * 3);
                int iZzj2 = zzig.zzj(str.length());
                if (iZzj2 == iZzj) {
                    int i11 = i10 + iZzj2;
                    this.zze = i11;
                    int iZza = zzmh.zza(str, this.zzb, i11, zza());
                    this.zze = i10;
                    zzc((iZza - i10) - iZzj2);
                    this.zze = iZza;
                    return;
                }
                zzc(zzmh.zza(str));
                this.zze = zzmh.zza(str, this.zzb, this.zze, zza());
            } catch (zzmk e4) {
                this.zze = i10;
                zza(str, e4);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(e10);
            }
        }
    }

    public static int zza(double d10) {
        return 8;
    }

    public static int zzb(int i10, boolean z10) {
        return zzj(i10 << 3) + 1;
    }

    public static int zzc(long j10) {
        return 8;
    }

    public static int zzd(int i10) {
        return zzf(i10);
    }

    public static int zze(int i10) {
        return 4;
    }

    public static int zzf(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zzg(int i10) {
        return 4;
    }

    public static int zzh(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    private static long zzi(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int zzj(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    private static int zzl(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b10);

    public abstract void zza(int i10);

    public abstract void zza(int i10, int i11);

    public abstract void zza(int i10, long j10);

    public abstract void zza(int i10, zzhm zzhmVar);

    public abstract void zza(int i10, zzkj zzkjVar);

    public abstract void zza(int i10, zzkj zzkjVar, zzlb zzlbVar);

    public abstract void zza(int i10, String str);

    public abstract void zza(int i10, boolean z10);

    public abstract void zza(long j10);

    public abstract void zza(zzhm zzhmVar);

    public abstract void zza(zzkj zzkjVar);

    public abstract void zza(String str);

    public abstract void zzb(int i10);

    public abstract void zzb(int i10, int i11);

    public abstract void zzb(int i10, long j10);

    public abstract void zzb(int i10, zzhm zzhmVar);

    public abstract void zzb(long j10);

    public abstract void zzb(byte[] bArr, int i10, int i11);

    public abstract void zzc(int i10);

    public abstract void zzc(int i10, int i11);

    public abstract void zzd(int i10, int i11);

    public final void zzk(int i10, int i11) {
        zzd(i10, zzl(i11));
    }

    private zzig() {
    }

    public static int zza(float f10) {
        return 4;
    }

    public static int zzb(zzhm zzhmVar) {
        int iZzb = zzhmVar.zzb();
        return zzj(iZzb) + iZzb;
    }

    public static int zzd(int i10, long j10) {
        return zzg(j10) + zzj(i10 << 3);
    }

    public static int zze(long j10) {
        return 8;
    }

    public static int zzf(int i10) {
        if (i10 >= 0) {
            return zzj(i10);
        }
        return 10;
    }

    public static int zzg(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int zzh(int i10) {
        return zzj(zzl(i10));
    }

    public static int zzi(int i10, int i11) {
        return zzj(zzl(i11)) + zzj(i10 << 3);
    }

    public static int zzj(int i10, int i11) {
        return zzj(i11) + zzj(i10 << 3);
    }

    public final void zzk(int i10) {
        zzc(zzl(i10));
    }

    public static int zza(boolean z10) {
        return 1;
    }

    public static int zzc(int i10, zzhm zzhmVar) {
        int iZzj = zzj(i10 << 3);
        int iZzb = zzhmVar.zzb();
        return zzj(iZzb) + iZzb + iZzj;
    }

    public static int zze(int i10, int i11) {
        return zzf(i11) + zzj(i10 << 3);
    }

    public static int zzf(int i10, long j10) {
        return zzg(zzi(j10)) + zzj(i10 << 3);
    }

    public static int zzg(int i10, int i11) {
        return zzf(i11) + zzj(i10 << 3);
    }

    public final void zzh(int i10, long j10) {
        zzb(i10, zzi(j10));
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    @Deprecated
    public static int zzb(int i10, zzkj zzkjVar, zzlb zzlbVar) {
        return ((zzhd) zzkjVar).zza(zzlbVar) + (zzj(i10 << 3) << 1);
    }

    public static int zzd(long j10) {
        return zzg(j10);
    }

    public static int zzi(int i10) {
        return zzj(i10 << 3);
    }

    public final void zzh(long j10) {
        zzb(zzi(j10));
    }

    public static int zzd(int i10, zzhm zzhmVar) {
        return zzc(3, zzhmVar) + zzj(2, i10) + (zzj(8) << 1);
    }

    public static int zze(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zzf(long j10) {
        return zzg(zzi(j10));
    }

    public static int zzg(int i10, long j10) {
        return zzg(j10) + zzj(i10 << 3);
    }

    public static class zzb extends IOException {
        public zzb(String str, Throwable th) {
            super(q.x("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    public static int zza(int i10, double d10) {
        return zzj(i10 << 3) + 8;
    }

    @Deprecated
    public static int zzb(zzkj zzkjVar) {
        return zzkjVar.zzbw();
    }

    public static int zzc(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zza(int i10, float f10) {
        return zzj(i10 << 3) + 4;
    }

    public static int zzb(int i10, zzjn zzjnVar) {
        int iZzj = zzj(i10 << 3);
        int iZzb = zzjnVar.zzb();
        return zzj(iZzb) + iZzb + iZzj;
    }

    public static int zzc(int i10, zzkj zzkjVar, zzlb zzlbVar) {
        return zza(zzkjVar, zzlbVar) + zzj(i10 << 3);
    }

    public static int zza(int i10, zzjn zzjnVar) {
        return zzb(3, zzjnVar) + zzj(2, i10) + (zzj(8) << 1);
    }

    public static int zzc(zzkj zzkjVar) {
        int iZzbw = zzkjVar.zzbw();
        return zzj(iZzbw) + iZzbw;
    }

    public static int zzb(int i10, zzkj zzkjVar) {
        return zzc(zzkjVar) + zzj(24) + zzj(2, i10) + (zzj(8) << 1);
    }

    public static int zza(zzjn zzjnVar) {
        int iZzb = zzjnVar.zzb();
        return zzj(iZzb) + iZzb;
    }

    public static int zza(zzkj zzkjVar, zzlb zzlbVar) {
        int iZza = ((zzhd) zzkjVar).zza(zzlbVar);
        return zzj(iZza) + iZza;
    }

    public static int zzb(int i10, String str) {
        return zzb(str) + zzj(i10 << 3);
    }

    public final void zza(String str, zzmk zzmkVar) throws zzb {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmkVar);
        byte[] bytes = str.getBytes(zziz.zza);
        try {
            zzc(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzb(e4);
        }
    }

    public static int zzb(String str) {
        int length;
        try {
            length = zzmh.zza(str);
        } catch (zzmk unused) {
            length = str.getBytes(zziz.zza).length;
        }
        return zzj(length) + length;
    }

    public static zzig zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(boolean z10) {
        zza(z10 ? (byte) 1 : (byte) 0);
    }

    public final void zzb(int i10, double d10) {
        zza(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzb(double d10) {
        zza(Double.doubleToRawLongBits(d10));
    }

    public final void zzb(int i10, float f10) {
        zza(i10, Float.floatToRawIntBits(f10));
    }

    public final void zzb(float f10) {
        zza(Float.floatToRawIntBits(f10));
    }
}
