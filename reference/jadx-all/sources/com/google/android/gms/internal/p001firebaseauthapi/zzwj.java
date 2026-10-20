package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzwj implements zzbp {
    private static final byte[] zza = new byte[0];
    private final ECPrivateKey zzb;
    private final zzwl zzc;
    private final String zzd;
    private final byte[] zze;
    private final zzwp zzf;
    private final zzwk zzg;
    private final byte[] zzh;

    public zzwj(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzwp zzwpVar, zzwk zzwkVar) {
        this(eCPrivateKey, bArr, str, zzwpVar, zzwkVar, new byte[0]);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
    private final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i10;
        EllipticCurve curve = this.zzb.getParams().getCurve();
        zzwp zzwpVar = this.zzf;
        int iZza = zzwn.zza(curve);
        int iOrdinal = zzwpVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new GeneralSecurityException("unknown EC point format");
                }
                i10 = iZza * 2;
            }
            if (bArr.length >= i10) {
                throw new GeneralSecurityException("ciphertext too short");
            }
            return this.zzg.zza(this.zzc.zza(Arrays.copyOfRange(bArr, 0, i10), this.zzd, this.zze, bArr2, this.zzg.zza(), this.zzf)).zza(Arrays.copyOfRange(bArr, i10, bArr.length), zza);
        }
        iZza *= 2;
        i10 = iZza + 1;
        if (bArr.length >= i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.zzg.zza(this.zzc.zza(Arrays.copyOfRange(bArr, 0, i10), this.zzd, this.zze, bArr2, this.zzg.zza(), this.zzf)).zza(Arrays.copyOfRange(bArr, i10, bArr.length), zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbp
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzh;
        if (bArr3.length == 0) {
            return zzb(bArr, bArr2);
        }
        if (zzpg.zza(bArr3, bArr)) {
            return zzb(Arrays.copyOfRange(bArr, this.zzh.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
    }

    private zzwj(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzwp zzwpVar, zzwk zzwkVar, byte[] bArr2) {
        this.zzb = eCPrivateKey;
        this.zzc = new zzwl(eCPrivateKey);
        this.zze = bArr;
        this.zzd = str;
        this.zzf = zzwpVar;
        this.zzg = zzwkVar;
        this.zzh = bArr2;
    }
}
