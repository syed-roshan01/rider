package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import l.q;

/* JADX INFO: loaded from: classes.dex */
final class zzlc implements zzbp {
    private static final byte[] zza = new byte[0];
    private final zzli zzb;
    private final zzlg zzc;
    private final zzld zzd;
    private final zzla zze;
    private final int zzf;
    private final byte[] zzg;

    private zzlc(zzli zzliVar, zzlg zzlgVar, zzld zzldVar, zzla zzlaVar, int i10, zzxr zzxrVar) {
        this.zzb = zzliVar;
        this.zzc = zzlgVar;
        this.zzd = zzldVar;
        this.zze = zzlaVar;
        this.zzf = i10;
        this.zzg = zzxrVar.zzb();
    }

    public static zzlc zza(zzut zzutVar) throws GeneralSecurityException {
        int i10;
        zzli zzliVarZza;
        if (!zzutVar.zzf()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        }
        if (!zzutVar.zzd().zzg()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        if (zzutVar.zze().zze()) {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
        zzus zzusVarZzb = zzutVar.zzd().zzb();
        zzlg zzlgVarZzc = zzlh.zzc(zzusVarZzb);
        zzld zzldVarZzb = zzlh.zzb(zzusVarZzb);
        zzla zzlaVarZza = zzlh.zza(zzusVarZzb);
        zzum zzumVarZzc = zzusVarZzb.zzc();
        int i11 = zzlb.zza[zzumVarZzc.ordinal()];
        if (i11 == 1) {
            i10 = 32;
        } else if (i11 == 2) {
            i10 = 65;
        } else if (i11 == 3) {
            i10 = 97;
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException(q.x("Unable to determine KEM-encoding length for ", zzumVarZzc.name()));
            }
            i10 = 133;
        }
        int i12 = zzlf.zza[zzutVar.zzd().zzb().zzc().ordinal()];
        if (i12 == 1) {
            zzliVarZza = zzlw.zza(zzutVar.zze().zzg());
        } else {
            if (i12 != 2 && i12 != 3 && i12 != 4) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            zzliVarZza = zzlu.zza(zzutVar.zze().zzg(), zzutVar.zzd().zzf().zzg(), zzlq.zzc(zzutVar.zzd().zzb().zzc()));
        }
        return new zzlc(zzliVarZza, zzlgVarZzc, zzldVarZzb, zzlaVarZza, i10, zzxr.zza(new byte[0]));
    }

    private final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.zzf;
        if (length < i10) {
            throw new GeneralSecurityException("Ciphertext is too short.");
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        return zzkz.zza(bArrCopyOf, this.zzb, this.zzc, this.zzd, this.zze, bArr3).zza(Arrays.copyOfRange(bArr, this.zzf, bArr.length), zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbp
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzg;
        if (bArr3.length == 0) {
            return zzb(bArr, bArr2);
        }
        if (zzpg.zza(bArr3, bArr)) {
            return zzb(Arrays.copyOfRange(bArr, this.zzg.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
    }
}
