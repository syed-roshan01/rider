package com.google.android.gms.internal.p001firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes.dex */
public final class zzwn {
    public static int zza(EllipticCurve ellipticCurve) {
        return (zzmd.zza(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    private static void zzb(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            if (zzmd.zza(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e4) {
            throw new GeneralSecurityException(e4);
        }
    }

    private static BigInteger zza(BigInteger bigInteger, boolean z10, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerZza = zzmd.zza(ellipticCurve);
        BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(bigIntegerZza);
        if (bigIntegerZza.signum() == 1) {
            BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerZza);
            BigInteger bigIntegerAdd = BigInteger.ZERO;
            if (!bigIntegerMod2.equals(bigIntegerAdd)) {
                if (bigIntegerZza.testBit(0) && bigIntegerZza.testBit(1)) {
                    bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerZza.add(BigInteger.ONE).shiftRight(2), bigIntegerZza);
                } else if (!bigIntegerZza.testBit(0) || bigIntegerZza.testBit(1)) {
                    bigIntegerAdd = null;
                } else {
                    bigIntegerAdd = BigInteger.ONE;
                    BigInteger bigIntegerShiftRight = bigIntegerZza.subtract(bigIntegerAdd).shiftRight(1);
                    int i10 = 0;
                    while (true) {
                        BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerZza);
                        if (!bigIntegerMod3.equals(BigInteger.ZERO)) {
                            BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerZza);
                            BigInteger bigIntegerMod4 = BigInteger.ONE;
                            if (!bigIntegerModPow.add(bigIntegerMod4).equals(bigIntegerZza)) {
                                if (bigIntegerModPow.equals(bigIntegerMod4)) {
                                    bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod4);
                                    i10++;
                                    if (i10 == 128 && !bigIntegerZza.isProbablePrime(80)) {
                                        throw new InvalidAlgorithmParameterException("p is not prime");
                                    }
                                } else {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            } else {
                                BigInteger bigIntegerShiftRight2 = bigIntegerZza.add(bigIntegerMod4).shiftRight(1);
                                BigInteger bigIntegerMod5 = bigIntegerAdd;
                                for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                                    BigInteger bigIntegerMultiply = bigIntegerMod5.multiply(bigIntegerMod4);
                                    bigIntegerMod5 = bigIntegerMod5.multiply(bigIntegerMod5).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerZza).multiply(bigIntegerMod3)).mod(bigIntegerZza);
                                    BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerZza);
                                    if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                        BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerZza);
                                        bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerZza);
                                        bigIntegerMod5 = bigIntegerMod7;
                                    } else {
                                        bigIntegerMod4 = bigIntegerMod6;
                                    }
                                }
                                bigIntegerAdd = bigIntegerMod5;
                            }
                        }
                    }
                }
                if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerZza).compareTo(bigIntegerMod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
            }
            return z10 != bigIntegerAdd.testBit(0) ? bigIntegerZza.subtract(bigIntegerAdd).mod(bigIntegerZza) : bigIntegerAdd;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    public static ECPrivateKey zza(zzwq zzwqVar, byte[] bArr) throws NoSuchAlgorithmException {
        return (ECPrivateKey) zzwr.zze.zza("EC").generatePrivate(new ECPrivateKeySpec(zzmb.zza(bArr), zza(zzwqVar)));
    }

    public static ECPublicKey zza(zzwq zzwqVar, zzwp zzwpVar, byte[] bArr) {
        return zza(zza(zzwqVar), zzwpVar, bArr);
    }

    public static ECPublicKey zza(ECParameterSpec eCParameterSpec, zzwp zzwpVar, byte[] bArr) {
        return (ECPublicKey) zzwr.zze.zza("EC").generatePublic(new ECPublicKeySpec(zza(eCParameterSpec.getCurve(), zzwpVar, bArr), eCParameterSpec));
    }

    public static ECParameterSpec zza(zzwq zzwqVar) throws NoSuchAlgorithmException {
        int iOrdinal = zzwqVar.ordinal();
        if (iOrdinal == 0) {
            return zzmd.zza;
        }
        if (iOrdinal == 1) {
            return zzmd.zzb;
        }
        if (iOrdinal == 2) {
            return zzmd.zzc;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(String.valueOf(zzwqVar)));
    }

    public static ECPoint zza(EllipticCurve ellipticCurve, zzwp zzwpVar, byte[] bArr) throws GeneralSecurityException {
        int iZza = zza(ellipticCurve);
        int iOrdinal = zzwpVar.ordinal();
        boolean z10 = false;
        if (iOrdinal == 0) {
            if (bArr.length == (iZza * 2) + 1) {
                if (bArr[0] == 4) {
                    int i10 = iZza + 1;
                    ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i10)), new BigInteger(1, Arrays.copyOfRange(bArr, i10, bArr.length)));
                    zzmd.zza(eCPoint, ellipticCurve);
                    return eCPoint;
                }
                throw new GeneralSecurityException("invalid point format");
            }
            throw new GeneralSecurityException("invalid point size");
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                if (bArr.length == iZza * 2) {
                    ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, iZza)), new BigInteger(1, Arrays.copyOfRange(bArr, iZza, bArr.length)));
                    zzmd.zza(eCPoint2, ellipticCurve);
                    return eCPoint2;
                }
                throw new GeneralSecurityException("invalid point size");
            }
            throw new GeneralSecurityException("invalid format:".concat(String.valueOf(zzwpVar)));
        }
        BigInteger bigIntegerZza = zzmd.zza(ellipticCurve);
        if (bArr.length == iZza + 1) {
            byte b10 = bArr[0];
            if (b10 != 2) {
                if (b10 != 3) {
                    throw new GeneralSecurityException("invalid format");
                }
                z10 = true;
            }
            BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
            if (bigInteger.signum() != -1 && bigInteger.compareTo(bigIntegerZza) < 0) {
                return new ECPoint(bigInteger, zza(bigInteger, z10, ellipticCurve));
            }
            throw new GeneralSecurityException("x is out of range");
        }
        throw new GeneralSecurityException("compressed point has wrong length");
    }

    public static void zza(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        zzb(eCPublicKey, eCPrivateKey);
        zzmd.zza(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    public static byte[] zza(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        zzb(eCPublicKey, eCPrivateKey);
        return zza(eCPrivateKey, eCPublicKey.getW());
    }

    private static byte[] zza(ECPrivateKey eCPrivateKey, ECPoint eCPoint) throws GeneralSecurityException {
        zzmd.zza(eCPoint, eCPrivateKey.getParams().getCurve());
        PublicKey publicKeyGeneratePublic = zzwr.zze.zza("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCPrivateKey.getParams()));
        KeyAgreement keyAgreementZza = zzwr.zzc.zza("ECDH");
        keyAgreementZza.init(eCPrivateKey);
        try {
            keyAgreementZza.doPhase(publicKeyGeneratePublic, true);
            byte[] bArrGenerateSecret = keyAgreementZza.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
            if (bigInteger.signum() != -1 && bigInteger.compareTo(zzmd.zza(curve)) < 0) {
                zza(bigInteger, true, curve);
                return bArrGenerateSecret;
            }
            throw new GeneralSecurityException("shared secret is out of range");
        } catch (IllegalStateException e4) {
            throw new GeneralSecurityException(e4);
        }
    }
}
