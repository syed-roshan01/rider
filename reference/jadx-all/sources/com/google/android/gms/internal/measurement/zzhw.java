package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import l.q;

/* JADX INFO: loaded from: classes.dex */
class zzhw extends zzhx {
    protected final byte[] zzb;

    public zzhw(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhm) || zzb() != ((zzhm) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzhw)) {
            return obj.equals(this);
        }
        zzhw zzhwVar = (zzhw) obj;
        int iZza = zza();
        int iZza2 = zzhwVar.zza();
        if (iZza == 0 || iZza2 == 0 || iZza == iZza2) {
            return zza(zzhwVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public byte zza(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public byte zzb(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final boolean zzd() {
        int iZze = zze();
        return zzmh.zzc(this.zzb, iZze, zzb() + iZze);
    }

    public int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final zzhm zza(int i10, int i11) {
        int iZza = zzhm.zza(0, i11, zzb());
        return iZza == 0 ? zzhm.zza : new zzhq(this.zzb, zze(), iZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final int zzb(int i10, int i11, int i12) {
        return zziz.zza(i10, this.zzb, zze(), i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final String zza(Charset charset) {
        return new String(this.zzb, zze(), zzb(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final void zza(zzhn zzhnVar) {
        zzhnVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.measurement.zzhx
    public final boolean zza(zzhm zzhmVar, int i10, int i11) {
        if (i11 <= zzhmVar.zzb()) {
            if (i11 <= zzhmVar.zzb()) {
                if (zzhmVar instanceof zzhw) {
                    zzhw zzhwVar = (zzhw) zzhmVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzhwVar.zzb;
                    int iZze = zze() + i11;
                    int iZze2 = zze();
                    int iZze3 = zzhwVar.zze();
                    while (iZze2 < iZze) {
                        if (bArr[iZze2] != bArr2[iZze3]) {
                            return false;
                        }
                        iZze2++;
                        iZze3++;
                    }
                    return true;
                }
                return zzhmVar.zza(0, i11).equals(zza(0, i11));
            }
            throw new IllegalArgumentException(q.i("Ran off end of other: 0, ", i11, ", ", zzhmVar.zzb()));
        }
        throw new IllegalArgumentException("Length too large: " + i11 + zzb());
    }
}
