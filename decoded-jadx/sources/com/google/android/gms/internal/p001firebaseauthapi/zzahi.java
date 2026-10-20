package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzahi {
    public static double zza(byte[] bArr, int i10) {
        return Double.longBitsToDouble(zzd(bArr, i10));
    }

    public static float zzb(byte[] bArr, int i10) {
        return Float.intBitsToFloat(zzc(bArr, i10));
    }

    public static int zzc(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int zzd(byte[] bArr, int i10, zzahl zzahlVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzahlVar.zzb = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        zzahlVar.zzb = j11;
        return i12;
    }

    public static int zza(byte[] bArr, int i10, zzahl zzahlVar) {
        int iZzc = zzc(bArr, i10, zzahlVar);
        int i11 = zzahlVar.zza;
        if (i11 < 0) {
            throw zzajj.zzf();
        }
        if (i11 > bArr.length - iZzc) {
            throw zzajj.zzi();
        }
        if (i11 == 0) {
            zzahlVar.zzc = zzahm.zza;
            return iZzc;
        }
        zzahlVar.zzc = zzahm.zza(bArr, iZzc, i11);
        return iZzc + i11;
    }

    public static int zzb(byte[] bArr, int i10, zzahl zzahlVar) {
        int iZzc = zzc(bArr, i10, zzahlVar);
        int i11 = zzahlVar.zza;
        if (i11 < 0) {
            throw zzajj.zzf();
        }
        if (i11 == 0) {
            zzahlVar.zzc = "";
            return iZzc;
        }
        zzahlVar.zzc = zzaml.zzb(bArr, iZzc, i11);
        return iZzc + i11;
    }

    public static int zzc(byte[] bArr, int i10, zzahl zzahlVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zza(b10, bArr, i11, zzahlVar);
        }
        zzahlVar.zza = b10;
        return i11;
    }

    public static long zzd(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int zza(zzalc zzalcVar, byte[] bArr, int i10, int i11, int i12, zzahl zzahlVar) {
        Object objZza = zzalcVar.zza();
        int iZza = zza(objZza, zzalcVar, bArr, i10, i11, i12, zzahlVar);
        zzalcVar.zzc(objZza);
        zzahlVar.zzc = objZza;
        return iZza;
    }

    public static int zza(zzalc zzalcVar, byte[] bArr, int i10, int i11, zzahl zzahlVar) {
        Object objZza = zzalcVar.zza();
        int iZza = zza(objZza, zzalcVar, bArr, i10, i11, zzahlVar);
        zzalcVar.zzc(objZza);
        zzahlVar.zzc = objZza;
        return iZza;
    }

    public static int zza(zzalc<?> zzalcVar, int i10, byte[] bArr, int i11, int i12, zzajg<?> zzajgVar, zzahl zzahlVar) {
        int iZza = zza(zzalcVar, bArr, i11, i12, zzahlVar);
        zzajgVar.add(zzahlVar.zzc);
        while (iZza < i12) {
            int iZzc = zzc(bArr, iZza, zzahlVar);
            if (i10 != zzahlVar.zza) {
                break;
            }
            iZza = zza(zzalcVar, bArr, iZzc, i12, zzahlVar);
            zzajgVar.add(zzahlVar.zzc);
        }
        return iZza;
    }

    public static int zza(byte[] bArr, int i10, zzajg<?> zzajgVar, zzahl zzahlVar) {
        zzajd zzajdVar = (zzajd) zzajgVar;
        int iZzc = zzc(bArr, i10, zzahlVar);
        int i11 = zzahlVar.zza + iZzc;
        while (iZzc < i11) {
            iZzc = zzc(bArr, iZzc, zzahlVar);
            zzajdVar.zzc(zzahlVar.zza);
        }
        if (iZzc == i11) {
            return iZzc;
        }
        throw zzajj.zzi();
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzame zzameVar, zzahl zzahlVar) {
        if ((i10 >>> 3) == 0) {
            throw zzajj.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzd = zzd(bArr, i11, zzahlVar);
            zzameVar.zza(i10, Long.valueOf(zzahlVar.zzb));
            return iZzd;
        }
        if (i13 == 1) {
            zzameVar.zza(i10, Long.valueOf(zzd(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzc = zzc(bArr, i11, zzahlVar);
            int i14 = zzahlVar.zza;
            if (i14 >= 0) {
                if (i14 > bArr.length - iZzc) {
                    throw zzajj.zzi();
                }
                if (i14 == 0) {
                    zzameVar.zza(i10, zzahm.zza);
                } else {
                    zzameVar.zza(i10, zzahm.zza(bArr, iZzc, i14));
                }
                return iZzc + i14;
            }
            throw zzajj.zzf();
        }
        if (i13 != 3) {
            if (i13 == 5) {
                zzameVar.zza(i10, Integer.valueOf(zzc(bArr, i11)));
                return i11 + 4;
            }
            throw zzajj.zzc();
        }
        zzame zzameVarZzd = zzame.zzd();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (i11 < i12) {
            int iZzc2 = zzc(bArr, i11, zzahlVar);
            int i17 = zzahlVar.zza;
            i16 = i17;
            if (i17 == i15) {
                i11 = iZzc2;
                break;
            }
            int iZza = zza(i16, bArr, iZzc2, i12, zzameVarZzd, zzahlVar);
            i16 = i17;
            i11 = iZza;
        }
        if (i11 <= i12 && i16 == i15) {
            zzameVar.zza(i10, zzameVarZzd);
            return i11;
        }
        throw zzajj.zzg();
    }

    public static int zza(int i10, byte[] bArr, int i11, zzahl zzahlVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzahlVar.zza = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzahlVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzahlVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzahlVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzahlVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzajg<?> zzajgVar, zzahl zzahlVar) {
        zzajd zzajdVar = (zzajd) zzajgVar;
        int iZzc = zzc(bArr, i11, zzahlVar);
        zzajdVar.zzc(zzahlVar.zza);
        while (iZzc < i12) {
            int iZzc2 = zzc(bArr, iZzc, zzahlVar);
            if (i10 != zzahlVar.zza) {
                break;
            }
            iZzc = zzc(bArr, iZzc2, zzahlVar);
            zzajdVar.zzc(zzahlVar.zza);
        }
        return iZzc;
    }

    public static int zza(Object obj, zzalc zzalcVar, byte[] bArr, int i10, int i11, int i12, zzahl zzahlVar) {
        int iZza = ((zzako) zzalcVar).zza(obj, bArr, i10, i11, i12, zzahlVar);
        zzahlVar.zzc = obj;
        return iZza;
    }

    public static int zza(Object obj, zzalc zzalcVar, byte[] bArr, int i10, int i11, zzahl zzahlVar) {
        int iZza = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZza = zza(i12, bArr, iZza, zzahlVar);
            i12 = zzahlVar.zza;
        }
        int i13 = iZza;
        if (i12 >= 0 && i12 <= i11 - i13) {
            int i14 = i12 + i13;
            zzalcVar.zza(obj, bArr, i13, i14, zzahlVar);
            zzahlVar.zzc = obj;
            return i14;
        }
        throw zzajj.zzi();
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzahl zzahlVar) {
        if ((i10 >>> 3) == 0) {
            throw zzajj.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzd(bArr, i11, zzahlVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzc(bArr, i11, zzahlVar) + zzahlVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzajj.zzc();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzc(bArr, i11, zzahlVar);
            i15 = zzahlVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zza(i15, bArr, i11, i12, zzahlVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzajj.zzg();
        }
        return i11;
    }
}
