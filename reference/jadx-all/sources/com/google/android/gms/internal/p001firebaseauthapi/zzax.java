package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzax<K, V> extends zzau<K, V> {
    private static final zzau<Object, Object> zza = new zzax(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    private zzax(Object obj, Object[] objArr, int i10) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0037->B:21:0x004d], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0062->B:31:0x0079], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0088->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzau, java.util.Map
    public final V get(Object obj) {
        V v10;
        Object obj2 = this.zzb;
        Object[] objArr = this.zzc;
        int i10 = this.zzd;
        if (obj == null) {
            v10 = null;
        } else if (i10 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj)) {
                v10 = (V) objArr[1];
                Objects.requireNonNull(v10);
            } else {
                v10 = null;
            }
        } else if (obj2 == null) {
            v10 = null;
        } else if (obj2 instanceof byte[]) {
            byte[] bArr = (byte[]) obj2;
            int length = bArr.length - 1;
            int iZza = zzam.zza(obj.hashCode());
            while (true) {
                int i11 = iZza & length;
                int i12 = bArr[i11] & 255;
                if (i12 == 255) {
                    break;
                }
                if (obj.equals(objArr[i12])) {
                    v10 = (V) objArr[i12 ^ 1];
                } else {
                    iZza = i11 + 1;
                }
            }
            v10 = null;
        } else if (obj2 instanceof short[]) {
            short[] sArr = (short[]) obj2;
            int length2 = sArr.length - 1;
            int iZza2 = zzam.zza(obj.hashCode());
            while (true) {
                int i13 = iZza2 & length2;
                int i14 = sArr[i13] & 65535;
                if (i14 == 65535) {
                    break;
                }
                if (obj.equals(objArr[i14])) {
                    v10 = (V) objArr[i14 ^ 1];
                } else {
                    iZza2 = i13 + 1;
                }
            }
            v10 = null;
        } else {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length - 1;
            int iZza3 = zzam.zza(obj.hashCode());
            while (true) {
                int i15 = iZza3 & length3;
                int i16 = iArr[i15];
                if (i16 == -1) {
                    break;
                }
                if (obj.equals(objArr[i16])) {
                    v10 = (V) objArr[i16 ^ 1];
                } else {
                    iZza3 = i15 + 1;
                }
            }
            v10 = null;
        }
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzau
    public final zzal<V> zza() {
        return new zzbb(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzau
    public final zzav<Map.Entry<K, V>> zzb() {
        return new zzba(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzau
    public final zzav<K> zzc() {
        return new zzbc(this, new zzbb(this.zzc, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzau
    public final boolean zzd() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x012e A[PHI: r4
  0x012e: PHI (r4v3 ??) = (r4v2 ??), (r4v4 short[]) binds: [B:75:0x018c, B:58:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public static <K, V> zzax<K, V> zza(int i10, Object[] objArr, zzat<K, V> zzatVar) {
        int iHighestOneBit;
        short[] sArr;
        int i11 = i10;
        Object[] objArrCopyOf = objArr;
        if (i11 == 0) {
            return (zzax) zza;
        }
        zzaw zzawVar = null;
        ?? r10 = 0;
        zzaw zzawVar2 = null;
        zzaw zzawVar3 = null;
        if (i11 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzaj.zza(obj, obj2);
            return new zzax<>(null, objArrCopyOf, 1);
        }
        zzz.zzb(i11, objArrCopyOf.length >> 1);
        int iMax = Math.max(i11, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
        } else {
            iHighestOneBit = 1073741824;
            if (!(iMax < 1073741824)) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i11 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            zzaj.zza(obj3, obj4);
        } else {
            int i12 = iHighestOneBit - 1;
            byte b10 = -1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    int i15 = i14 * 2;
                    int i16 = i13 * 2;
                    Object obj5 = objArrCopyOf[i15];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArrCopyOf[i15 ^ 1];
                    Objects.requireNonNull(obj6);
                    zzaj.zza(obj5, obj6);
                    int iZza = zzam.zza(obj5.hashCode());
                    while (true) {
                        int i17 = iZza & i12;
                        int i18 = bArr[i17] & 255;
                        if (i18 == 255) {
                            bArr[i17] = (byte) i16;
                            if (i13 < i14) {
                                objArrCopyOf[i16] = obj5;
                                objArrCopyOf[i16 ^ 1] = obj6;
                            }
                            i13++;
                            break;
                        }
                        if (obj5.equals(objArrCopyOf[i18 == true ? 1 : 0])) {
                            int i19 = ~i18;
                            Object obj7 = objArrCopyOf[i19 == true ? 1 : 0];
                            Objects.requireNonNull(obj7);
                            zzawVar2 = new zzaw(obj5, obj6, obj7);
                            objArrCopyOf[i19 == true ? 1 : 0] = obj6;
                            break;
                        }
                        iZza = i17 + 1;
                    }
                }
                r10 = i13 == i11 ? bArr : new Object[]{bArr, Integer.valueOf(i13), zzawVar2};
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i20 = 0;
                for (int i21 = 0; i21 < i11; i21++) {
                    int i22 = i21 * 2;
                    int i23 = i20 * 2;
                    Object obj8 = objArrCopyOf[i22];
                    Objects.requireNonNull(obj8);
                    Object obj9 = objArrCopyOf[i22 ^ 1];
                    Objects.requireNonNull(obj9);
                    zzaj.zza(obj8, obj9);
                    int iZza2 = zzam.zza(obj8.hashCode());
                    while (true) {
                        int i24 = iZza2 & i12;
                        int i25 = sArr[i24] & 65535;
                        if (i25 == 65535) {
                            sArr[i24] = (short) i23;
                            if (i20 < i21) {
                                objArrCopyOf[i23] = obj8;
                                objArrCopyOf[i23 ^ 1] = obj9;
                            }
                            i20++;
                            break;
                        }
                        if (obj8.equals(objArrCopyOf[i25 == true ? 1 : 0])) {
                            int i26 = ~i25;
                            Object obj10 = objArrCopyOf[i26 == true ? 1 : 0];
                            Objects.requireNonNull(obj10);
                            zzawVar3 = new zzaw(obj8, obj9, obj10);
                            objArrCopyOf[i26 == true ? 1 : 0] = obj9;
                            break;
                        }
                        iZza2 = i24 + 1;
                    }
                }
                if (i20 == i11) {
                    r10 = sArr;
                } else {
                    r10 = new Object[]{sArr, Integer.valueOf(i20), zzawVar3};
                }
            } else {
                sArr = new int[iHighestOneBit];
                Arrays.fill((int[]) sArr, -1);
                int i27 = 0;
                int i28 = 0;
                while (i27 < i11) {
                    int i29 = i27 * 2;
                    int i30 = i28 * 2;
                    Object obj11 = objArrCopyOf[i29];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArrCopyOf[i29 ^ 1];
                    Objects.requireNonNull(obj12);
                    zzaj.zza(obj11, obj12);
                    int iZza3 = zzam.zza(obj11.hashCode());
                    while (true) {
                        int i31 = iZza3 & i12;
                        ?? r15 = sArr[i31];
                        if (r15 == b10) {
                            sArr[i31] = i30;
                            if (i28 < i27) {
                                objArrCopyOf[i30] = obj11;
                                objArrCopyOf[i30 ^ 1] = obj12;
                            }
                            i28++;
                            break;
                        }
                        if (obj11.equals(objArrCopyOf[r15])) {
                            int i32 = r15 ^ 1;
                            Object obj13 = objArrCopyOf[i32 == true ? 1 : 0];
                            Objects.requireNonNull(obj13);
                            zzawVar = new zzaw(obj11, obj12, obj13);
                            objArrCopyOf[i32 == true ? 1 : 0] = obj12;
                            break;
                        }
                        iZza3 = i31 + 1;
                        b10 = -1;
                    }
                    i27++;
                    b10 = -1;
                }
                if (i28 == i11) {
                    r10 = sArr;
                } else {
                    r10 = new Object[]{sArr, Integer.valueOf(i28), zzawVar};
                }
            }
        }
        boolean z10 = r10 instanceof Object[];
        ?? r11 = r10;
        if (z10) {
            Object[] objArr2 = (Object[]) r10;
            zzaw zzawVar4 = (zzaw) objArr2[2];
            if (zzatVar == null) {
                throw zzawVar4.zza();
            }
            zzatVar.zza = zzawVar4;
            Object obj14 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue << 1);
            r11 = obj14;
            i11 = iIntValue;
        }
        return new zzax<>(r11, objArrCopyOf, i11);
    }
}
