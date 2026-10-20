package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzame {
    private static final zzame zza = new zzame(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzame() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzame zzc() {
        return zza;
    }

    public static zzame zzd() {
        return new zzame();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzame)) {
            return false;
        }
        zzame zzameVar = (zzame) obj;
        int i10 = this.zzb;
        if (i10 == zzameVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzameVar.zzc;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzameVar.zzd;
            int i12 = this.zzb;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int zza() {
        int iZze;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZza = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iZze = zzaii.zze(i13, ((Long) this.zzd[i11]).longValue());
            } else if (i14 == 1) {
                iZze = zzaii.zza(i13, ((Long) this.zzd[i11]).longValue());
            } else if (i14 != 2) {
                if (i14 == 3) {
                    iZza = ((zzame) this.zzd[i11]).zza() + (zzaii.zzg(i13) << 1) + iZza;
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(zzajj.zza());
                    }
                    iZze = zzaii.zzb(i13, ((Integer) this.zzd[i11]).intValue());
                }
            } else {
                iZze = zzaii.zza(i13, (zzahm) this.zzd[i11]);
            }
            iZza = iZze + iZza;
        }
        this.zze = iZza;
        return iZza;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzb = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            iZzb += zzaii.zzb(this.zzc[i11] >>> 3, (zzahm) this.zzd[i11]);
        }
        this.zze = iZzb;
        return iZzb;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzame(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public final void zzb(zzanb zzanbVar) {
        if (this.zzb == 0) {
            return;
        }
        if (zzanbVar.zza() == zzana.zza) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                zza(this.zzc[i10], this.zzd[i10], zzanbVar);
            }
            return;
        }
        for (int i11 = this.zzb - 1; i11 >= 0; i11--) {
            zza(this.zzc[i11], this.zzd[i11], zzanbVar);
        }
    }

    public final zzame zza(zzame zzameVar) {
        if (zzameVar.equals(zza)) {
            return this;
        }
        zzf();
        int i10 = this.zzb + zzameVar.zzb;
        zza(i10);
        System.arraycopy(zzameVar.zzc, 0, this.zzc, this.zzb, zzameVar.zzb);
        System.arraycopy(zzameVar.zzd, 0, this.zzd, this.zzb, zzameVar.zzb);
        this.zzb = i10;
        return this;
    }

    public static zzame zza(zzame zzameVar, zzame zzameVar2) {
        int i10 = zzameVar.zzb + zzameVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzameVar.zzc, i10);
        System.arraycopy(zzameVar2.zzc, 0, iArrCopyOf, zzameVar.zzb, zzameVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzameVar.zzd, i10);
        System.arraycopy(zzameVar2.zzd, 0, objArrCopyOf, zzameVar.zzb, zzameVar2.zzb);
        return new zzame(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zza(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final void zza(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzakp.zza(sb, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zza(int i10, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zza(zzanb zzanbVar) {
        if (zzanbVar.zza() == zzana.zzb) {
            for (int i10 = this.zzb - 1; i10 >= 0; i10--) {
                zzanbVar.zza(this.zzc[i10] >>> 3, this.zzd[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzanbVar.zza(this.zzc[i11] >>> 3, this.zzd[i11]);
        }
    }

    private static void zza(int i10, Object obj, zzanb zzanbVar) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            zzanbVar.zzb(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 1) {
            zzanbVar.zza(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 2) {
            zzanbVar.zza(i11, (zzahm) obj);
            return;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                zzanbVar.zzb(i11, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzajj.zza());
        }
        if (zzanbVar.zza() == zzana.zza) {
            zzanbVar.zzb(i11);
            ((zzame) obj).zzb(zzanbVar);
            zzanbVar.zza(i11);
        } else {
            zzanbVar.zza(i11);
            ((zzame) obj).zzb(zzanbVar);
            zzanbVar.zzb(i11);
        }
    }
}
