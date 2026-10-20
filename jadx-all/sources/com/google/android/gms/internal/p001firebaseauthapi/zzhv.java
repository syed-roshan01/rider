package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzhv {
    private static long zza(byte[] bArr, int i10, int i11) {
        return (zza(bArr, i10) >> i11) & 67108863;
    }

    private static long zza(byte[] bArr, int i10) {
        return ((long) (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16))) & 4294967295L;
    }

    private static void zza(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long jZza = zza(bArr, 0, 0) & 67108863;
            long jZza2 = zza(bArr, 3, 2) & 67108611;
            long jZza3 = zza(bArr, 6, 4) & 67092735;
            long jZza4 = zza(bArr, 9, 6) & 66076671;
            long jZza5 = zza(bArr, 12, 8) & 1048575;
            long j10 = jZza2 * 5;
            long j11 = jZza3 * 5;
            long j12 = jZza4 * 5;
            long j13 = jZza5 * 5;
            int i10 = 17;
            byte[] bArr3 = new byte[17];
            long j14 = 0;
            int i11 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            while (i11 < bArr2.length) {
                int iMin = Math.min(16, bArr2.length - i11);
                System.arraycopy(bArr2, i11, bArr3, 0, iMin);
                bArr3[iMin] = 1;
                if (iMin != 16) {
                    Arrays.fill(bArr3, iMin + 1, i10, (byte) 0);
                }
                long jZza6 = j18 + zza(bArr3, 0, 0);
                long jZza7 = j14 + zza(bArr3, 3, 2);
                long jZza8 = j15 + zza(bArr3, 6, 4);
                long jZza9 = j16 + zza(bArr3, 9, 6);
                long jZza10 = j17 + (zza(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
                long j19 = (jZza10 * j10) + (jZza9 * j11) + (jZza8 * j12) + (jZza7 * j13) + (jZza6 * jZza);
                long j20 = (jZza10 * j11) + (jZza9 * j12) + (jZza8 * j13) + (jZza7 * jZza) + (jZza6 * jZza2);
                long j21 = (jZza10 * j12) + (jZza9 * j13) + (jZza8 * jZza) + (jZza7 * jZza2) + (jZza6 * jZza3);
                long j22 = (jZza10 * j13) + (jZza9 * jZza) + (jZza8 * jZza2) + (jZza7 * jZza3) + (jZza6 * jZza4);
                long j23 = jZza9 * jZza2;
                long j24 = jZza10 * jZza;
                long j25 = j20 + (j19 >> 26);
                long j26 = j21 + (j25 >> 26);
                long j27 = j22 + (j26 >> 26);
                long j28 = j24 + j23 + (jZza8 * jZza3) + (jZza7 * jZza4) + (jZza6 * jZza5) + (j27 >> 26);
                long j29 = j28 >> 26;
                j17 = j28 & 67108863;
                long j30 = (j29 * 5) + (j19 & 67108863);
                i11 += 16;
                j15 = j26 & 67108863;
                j16 = j27 & 67108863;
                i10 = 17;
                j18 = j30 & 67108863;
                j14 = (j25 & 67108863) + (j30 >> 26);
            }
            long j31 = j15 + (j14 >> 26);
            long j32 = j31 & 67108863;
            long j33 = j16 + (j31 >> 26);
            long j34 = j33 & 67108863;
            long j35 = j17 + (j33 >> 26);
            long j36 = j35 & 67108863;
            long j37 = ((j35 >> 26) * 5) + j18;
            long j38 = j37 >> 26;
            long j39 = j37 & 67108863;
            long j40 = (j14 & 67108863) + j38;
            long j41 = j39 + 5;
            long j42 = j41 & 67108863;
            long j43 = (j41 >> 26) + j40;
            long j44 = j32 + (j43 >> 26);
            long j45 = j34 + (j44 >> 26);
            long j46 = (j36 + (j45 >> 26)) - 67108864;
            long j47 = j46 >> 63;
            long j48 = j39 & j47;
            long j49 = j40 & j47;
            long j50 = j32 & j47;
            long j51 = j34 & j47;
            long j52 = j36 & j47;
            long j53 = ~j47;
            long j54 = j49 | (j43 & 67108863 & j53);
            long j55 = j50 | (j44 & 67108863 & j53);
            long j56 = j51 | (j45 & 67108863 & j53);
            long j57 = (j48 | (j42 & j53) | (j54 << 26)) & 4294967295L;
            long j58 = ((j54 >> 6) | (j55 << 20)) & 4294967295L;
            long j59 = ((j55 >> 12) | (j56 << 14)) & 4294967295L;
            long j60 = ((j56 >> 18) | ((j52 | (j46 & j53)) << 8)) & 4294967295L;
            long jZza11 = j57 + zza(bArr, 16);
            long j61 = jZza11 & 4294967295L;
            long jZza12 = j58 + zza(bArr, 20) + (jZza11 >> 32);
            long j62 = jZza12 & 4294967295L;
            long jZza13 = j59 + zza(bArr, 24) + (jZza12 >> 32);
            long j63 = jZza13 & 4294967295L;
            long jZza14 = (j60 + zza(bArr, 28) + (jZza13 >> 32)) & 4294967295L;
            byte[] bArr4 = new byte[16];
            zza(bArr4, j61, 0);
            zza(bArr4, j62, 4);
            zza(bArr4, j63, 8);
            zza(bArr4, jZza14, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
