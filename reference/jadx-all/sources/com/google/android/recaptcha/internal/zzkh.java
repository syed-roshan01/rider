package com.google.android.recaptcha.internal;

import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o7.i2;
import sun.misc.Unsafe;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
final class zzkh<T> implements zzkr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzlv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzke zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzjs zzm;
    private final zzll zzn;
    private final zzif zzo;
    private final zzkk zzp;
    private final zzjz zzq;

    private zzkh(int[] iArr, Object[] objArr, int i10, int i11, zzke zzkeVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzkk zzkkVar, zzjs zzjsVar, zzll zzllVar, zzif zzifVar, zzjz zzjzVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzkeVar instanceof zzit;
        boolean z11 = false;
        if (zzifVar != null && zzifVar.zzj(zzkeVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i13;
        this.zzl = i14;
        this.zzp = zzkkVar;
        this.zzm = zzjsVar;
        this.zzn = zzllVar;
        this.zzo = zzifVar;
        this.zzg = zzkeVar;
        this.zzq = zzjzVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzkr zzkrVarZzx = zzx(i10);
        int iZzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzkrVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzkrVarZzx.zze();
        if (object != null) {
            zzkrVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzkr zzkrVarZzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzkrVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzkrVarZzx.zze();
        if (object != null) {
            zzkrVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbC = k1.c("Field ", str, " for ", name, " not found. Known fields are ");
            sbC.append(string);
            throw new RuntimeException(sbC.toString());
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (zzN(obj2, i10)) {
            int iZzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzkr zzkrVarZzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (zzQ(object)) {
                    Object objZze = zzkrVarZzx.zze();
                    zzkrVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object objZze2 = zzkrVarZzx.zze();
                zzkrVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzkrVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzR(obj2, i11, i10)) {
            int iZzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzkr zzkrVarZzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (zzQ(object)) {
                    Object objZze = zzkrVarZzx.zze();
                    zzkrVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object objZze2 = zzkrVarZzx.zze();
                zzkrVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzkrVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i10, zzkq zzkqVar) {
        long j10 = i10 & 1048575;
        if (zzM(i10)) {
            zzlv.zzs(obj, j10, zzkqVar.zzs());
        } else if (this.zzi) {
            zzlv.zzs(obj, j10, zzkqVar.zzr());
        } else {
            zzlv.zzs(obj, j10, zzkqVar.zzp());
        }
    }

    private final void zzH(Object obj, int i10) {
        int iZzr = zzr(i10);
        long j10 = 1048575 & iZzr;
        if (j10 == 1048575) {
            return;
        }
        zzlv.zzq(obj, j10, (1 << (iZzr >>> 20)) | zzlv.zzc(obj, j10));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzlv.zzq(obj, zzr(i11) & 1048575, i10);
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzN(obj, i10) == zzN(obj2, i10);
    }

    private static boolean zzM(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int iZzr = zzr(i10);
        long j10 = iZzr & 1048575;
        if (j10 != 1048575) {
            return (zzlv.zzc(obj, j10) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i10);
        long j11 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzlv.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzlv.zzb(obj, j11)) != 0;
            case 2:
                return zzlv.zzd(obj, j11) != 0;
            case 3:
                return zzlv.zzd(obj, j11) != 0;
            case 4:
                return zzlv.zzc(obj, j11) != 0;
            case 5:
                return zzlv.zzd(obj, j11) != 0;
            case 6:
                return zzlv.zzc(obj, j11) != 0;
            case 7:
                return zzlv.zzw(obj, j11);
            case 8:
                Object objZzf = zzlv.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzgw) {
                    return !zzgw.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzlv.zzf(obj, j11) != null;
            case 10:
                return !zzgw.zzb.equals(zzlv.zzf(obj, j11));
            case 11:
                return zzlv.zzc(obj, j11) != 0;
            case 12:
                return zzlv.zzc(obj, j11) != 0;
            case 13:
                return zzlv.zzc(obj, j11) != 0;
            case Code.UNAVAILABLE /* 14 */:
                return zzlv.zzd(obj, j11) != 0;
            case 15:
                return zzlv.zzc(obj, j11) != 0;
            case Code.UNAUTHENTICATED /* 16 */:
                return zzlv.zzd(obj, j11) != 0;
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return zzlv.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzN(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzP(Object obj, int i10, zzkr zzkrVar) {
        return zzkrVar.zzl(zzlv.zzf(obj, i10 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzit) {
            return ((zzit) obj).zzG();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzlv.zzc(obj, (long) (zzr(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzlv.zzf(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzmd zzmdVar) {
        if (obj instanceof String) {
            zzmdVar.zzG(i10, (String) obj);
        } else {
            zzmdVar.zzd(i10, (zzgw) obj);
        }
    }

    public static zzlm zzd(Object obj) {
        zzit zzitVar = (zzit) obj;
        zzlm zzlmVar = zzitVar.zzc;
        if (zzlmVar != zzlm.zzc()) {
            return zzlmVar;
        }
        zzlm zzlmVarZzf = zzlm.zzf();
        zzitVar.zzc = zzlmVarZzf;
        return zzlmVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0266  */
    /* JADX WARN: Code duplicated, block: B:127:0x026b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0281  */
    /* JADX WARN: Code duplicated, block: B:131:0x0284  */
    public static zzkh zzm(Class cls, zzkb zzkbVar, zzkk zzkkVar, zzjs zzjsVar, zzll zzllVar, zzif zzifVar, zzjz zzjzVar) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        int iObjectFieldOffset;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset2;
        Field fieldZzC;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field fieldZzC2;
        int i34;
        Object obj2;
        Field fieldZzC3;
        int i35;
        char cCharAt10;
        int i36;
        char cCharAt11;
        int i37;
        char cCharAt12;
        int i38;
        char cCharAt13;
        if (!(zzkbVar instanceof zzkp)) {
            throw null;
        }
        zzkp zzkpVar = (zzkp) zzkbVar;
        String strZzd = zzkpVar.zzd();
        int length = strZzd.length();
        char c10 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i10 = i39 + 1;
                if (strZzd.charAt(i39) < 55296) {
                    break;
                }
                i39 = i10;
            }
        } else {
            i10 = 1;
        }
        int i40 = i10 + 1;
        int iCharAt3 = strZzd.charAt(i10);
        if (iCharAt3 >= 55296) {
            int i41 = iCharAt3 & 8191;
            int i42 = 13;
            while (true) {
                i38 = i40 + 1;
                cCharAt13 = strZzd.charAt(i40);
                if (cCharAt13 < 55296) {
                    break;
                }
                i41 |= (cCharAt13 & 8191) << i42;
                i42 += 13;
                i40 = i38;
            }
            iCharAt3 = i41 | (cCharAt13 << i42);
            i40 = i38;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i12 = 0;
            i15 = 0;
            i11 = 0;
            i13 = 0;
            iArr = zza;
            i14 = 0;
        } else {
            int i43 = i40 + 1;
            int iCharAt4 = strZzd.charAt(i40);
            if (iCharAt4 >= 55296) {
                int i44 = iCharAt4 & 8191;
                int i45 = 13;
                while (true) {
                    i23 = i43 + 1;
                    cCharAt8 = strZzd.charAt(i43);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i23;
                }
                iCharAt4 = i44 | (cCharAt8 << i45);
                i43 = i23;
            }
            int i46 = i43 + 1;
            int iCharAt5 = strZzd.charAt(i43);
            if (iCharAt5 >= 55296) {
                int i47 = iCharAt5 & 8191;
                int i48 = 13;
                while (true) {
                    i22 = i46 + 1;
                    cCharAt7 = strZzd.charAt(i46);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i22;
                }
                iCharAt5 = i47 | (cCharAt7 << i48);
                i46 = i22;
            }
            int i49 = i46 + 1;
            int iCharAt6 = strZzd.charAt(i46);
            if (iCharAt6 >= 55296) {
                int i50 = iCharAt6 & 8191;
                int i51 = 13;
                while (true) {
                    i21 = i49 + 1;
                    cCharAt6 = strZzd.charAt(i49);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i21;
                }
                iCharAt6 = i50 | (cCharAt6 << i51);
                i49 = i21;
            }
            int i52 = i49 + 1;
            int iCharAt7 = strZzd.charAt(i49);
            if (iCharAt7 >= 55296) {
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i20 = i52 + 1;
                    cCharAt5 = strZzd.charAt(i52);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i20;
                }
                iCharAt7 = i53 | (cCharAt5 << i54);
                i52 = i20;
            }
            int i55 = i52 + 1;
            iCharAt = strZzd.charAt(i52);
            if (iCharAt >= 55296) {
                int i56 = iCharAt & 8191;
                int i57 = 13;
                while (true) {
                    i19 = i55 + 1;
                    cCharAt4 = strZzd.charAt(i55);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i19;
                }
                iCharAt = i56 | (cCharAt4 << i57);
                i55 = i19;
            }
            int i58 = i55 + 1;
            iCharAt2 = strZzd.charAt(i55);
            if (iCharAt2 >= 55296) {
                int i59 = iCharAt2 & 8191;
                int i60 = 13;
                while (true) {
                    i18 = i58 + 1;
                    cCharAt3 = strZzd.charAt(i58);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt3 & 8191) << i60;
                    i60 += 13;
                    i58 = i18;
                }
                iCharAt2 = i59 | (cCharAt3 << i60);
                i58 = i18;
            }
            int i61 = i58 + 1;
            int iCharAt8 = strZzd.charAt(i58);
            if (iCharAt8 >= 55296) {
                int i62 = iCharAt8 & 8191;
                int i63 = 13;
                while (true) {
                    i17 = i61 + 1;
                    cCharAt2 = strZzd.charAt(i61);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt2 & 8191) << i63;
                    i63 += 13;
                    i61 = i17;
                }
                iCharAt8 = i62 | (cCharAt2 << i63);
                i61 = i17;
            }
            int i64 = i61 + 1;
            int iCharAt9 = strZzd.charAt(i61);
            if (iCharAt9 >= 55296) {
                int i65 = iCharAt9 & 8191;
                int i66 = 13;
                while (true) {
                    i16 = i64 + 1;
                    cCharAt = strZzd.charAt(i64);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i65 |= (cCharAt & 8191) << i66;
                    i66 += 13;
                    i64 = i16;
                }
                iCharAt9 = i65 | (cCharAt << i66);
                i64 = i16;
            }
            i11 = iCharAt4 + iCharAt4 + iCharAt5;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i12 = iCharAt6;
            i13 = iCharAt9;
            i14 = iCharAt4;
            i15 = iCharAt7;
            i40 = i64;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzkpVar.zze();
        Class<?> cls2 = zzkpVar.zza().getClass();
        int i67 = i13 + iCharAt2;
        int i68 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[i68];
        int i69 = 0;
        int i70 = 0;
        int i71 = i13;
        int i72 = i67;
        while (i40 < length) {
            int i73 = i40 + 1;
            int iCharAt10 = strZzd.charAt(i40);
            if (iCharAt10 >= c10) {
                int i74 = iCharAt10 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i37 = i75 + 1;
                    cCharAt12 = strZzd.charAt(i75);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i74 |= (cCharAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i37;
                }
                iCharAt10 = i74 | (cCharAt12 << i76);
                i24 = i37;
            } else {
                i24 = i73;
            }
            int i77 = i24 + 1;
            int iCharAt11 = strZzd.charAt(i24);
            if (iCharAt11 >= c10) {
                int i78 = iCharAt11 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i36 = i79 + 1;
                    cCharAt11 = strZzd.charAt(i79);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i78 |= (cCharAt11 & 8191) << i80;
                    i80 += 13;
                    i79 = i36;
                }
                iCharAt11 = i78 | (cCharAt11 << i80);
                i25 = i36;
            } else {
                i25 = i77;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i69] = i70;
                i69++;
            }
            int i81 = iCharAt11 & 255;
            int i82 = iCharAt11 & 2048;
            int i83 = length;
            if (i81 >= 51) {
                int i84 = i25 + 1;
                int iCharAt12 = strZzd.charAt(i25);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i85 = 13;
                    int i86 = iCharAt12 & 8191;
                    int i87 = i84;
                    while (true) {
                        i35 = i87 + 1;
                        cCharAt10 = strZzd.charAt(i87);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i86 |= (cCharAt10 & 8191) << i85;
                        i85 += 13;
                        i87 = i35;
                        c11 = 55296;
                    }
                    iCharAt12 = i86 | (cCharAt10 << i85);
                    i31 = i35;
                } else {
                    i31 = i84;
                }
                int i88 = i31;
                int i89 = i81 - 51;
                if (i89 == 9 || i89 == 17) {
                    i32 = i11 + 1;
                    int i90 = i70 / 3;
                    objArr[i90 + i90 + 1] = objArrZze[i11];
                } else {
                    if (i89 == 12) {
                        if (zzkpVar.zzc() == 1 || i82 != 0) {
                            i32 = i11 + 1;
                            int i91 = i70 / 3;
                            objArr[i91 + i91 + 1] = objArrZze[i11];
                        } else {
                            i82 = 0;
                        }
                    }
                    i33 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i33];
                    if (obj instanceof Field) {
                        fieldZzC2 = (Field) obj;
                    } else {
                        fieldZzC2 = zzC(cls2, (String) obj);
                        objArrZze[i33] = fieldZzC2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC2);
                    i34 = i33 + 1;
                    obj2 = objArrZze[i34];
                    if (obj2 instanceof Field) {
                        fieldZzC3 = (Field) obj2;
                    } else {
                        fieldZzC3 = zzC(cls2, (String) obj2);
                        objArrZze[i34] = fieldZzC3;
                    }
                    zzkpVar = zzkpVar;
                    strZzd = strZzd;
                    i28 = i11;
                    i26 = i88;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC3);
                    i27 = 0;
                }
                i11 = i32;
                i33 = iCharAt12 + iCharAt12;
                obj = objArrZze[i33];
                if (obj instanceof Field) {
                    fieldZzC2 = (Field) obj;
                } else {
                    fieldZzC2 = zzC(cls2, (String) obj);
                    objArrZze[i33] = fieldZzC2;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC2);
                i34 = i33 + 1;
                obj2 = objArrZze[i34];
                if (obj2 instanceof Field) {
                    fieldZzC3 = (Field) obj2;
                } else {
                    fieldZzC3 = zzC(cls2, (String) obj2);
                    objArrZze[i34] = fieldZzC3;
                }
                zzkpVar = zzkpVar;
                strZzd = strZzd;
                i28 = i11;
                i26 = i88;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC3);
                i27 = 0;
            } else {
                int i92 = i11 + 1;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i11]);
                if (i81 == 9 || i81 == 17) {
                    zzkpVar = zzkpVar;
                    int i93 = i70 / 3;
                    objArr[i93 + i93 + 1] = fieldZzC4.getType();
                } else {
                    if (i81 == 27) {
                        i29 = 1;
                        i30 = i11 + 2;
                    } else if (i81 == 49) {
                        i30 = i11 + 2;
                        i29 = 1;
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        zzkpVar = zzkpVar;
                        if (zzkpVar.zzc() == 1 || i82 != 0) {
                            i30 = i11 + 2;
                            int i94 = i70 / 3;
                            objArr[i94 + i94 + 1] = objArrZze[i92];
                            i92 = i30;
                        } else {
                            i82 = 0;
                        }
                    } else {
                        if (i81 == 50) {
                            int i95 = i11 + 2;
                            int i96 = i71 + 1;
                            iArr[i71] = i70;
                            int i97 = i70 / 3;
                            int i98 = i97 + i97;
                            objArr[i98] = objArrZze[i92];
                            if (i82 != 0) {
                                i92 = i11 + 3;
                                objArr[i98 + 1] = objArrZze[i95];
                                i71 = i96;
                            } else {
                                i92 = i95;
                                i71 = i96;
                                i82 = 0;
                            }
                        }
                        zzkpVar = zzkpVar;
                    }
                    int i99 = i70 / 3;
                    objArr[i99 + i99 + i29] = objArrZze[i92];
                    i92 = i30;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzC4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) == 0 || i81 > 17) {
                    i26 = i25;
                    i27 = 0;
                } else {
                    int i100 = i25 + 1;
                    int iCharAt13 = strZzd.charAt(i25);
                    if (iCharAt13 >= 55296) {
                        int i101 = iCharAt13 & 8191;
                        int i102 = 13;
                        while (true) {
                            i26 = i100 + 1;
                            cCharAt9 = strZzd.charAt(i100);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i101 |= (cCharAt9 & 8191) << i102;
                            i102 += 13;
                            i100 = i26;
                        }
                        iCharAt13 = i101 | (cCharAt9 << i102);
                    } else {
                        i26 = i100;
                    }
                    int i103 = (iCharAt13 / 32) + i14 + i14;
                    Object obj3 = objArrZze[i103];
                    if (obj3 instanceof Field) {
                        fieldZzC = (Field) obj3;
                    } else {
                        fieldZzC = zzC(cls2, (String) obj3);
                        objArrZze[i103] = fieldZzC;
                    }
                    i27 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC);
                }
                if (i81 >= 18 && i81 <= 49) {
                    iArr[i72] = iObjectFieldOffset3;
                    i72++;
                }
                i28 = i92;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i104 = i70 + 1;
            iArr2[i70] = iCharAt10;
            int i105 = i70 + 2;
            iArr2[i104] = iObjectFieldOffset2 | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i82 != 0 ? Integer.MIN_VALUE : 0) | (i81 << 20);
            i70 += 3;
            iArr2[i105] = (i27 << 20) | iObjectFieldOffset;
            i11 = i28;
            i40 = i26;
            length = i83;
            zzkpVar = zzkpVar;
            strZzd = strZzd;
            i15 = i15;
            i12 = i12;
            c10 = 55296;
        }
        zzkp zzkpVar2 = zzkpVar;
        return new zzkh(iArr2, objArr, i12, i15, zzkpVar2.zza(), zzkpVar2.zzc(), false, iArr, i13, i67, zzkkVar, zzjsVar, zzllVar, zzifVar, zzjzVar);
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzlv.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzlv.zzf(obj, j10)).floatValue();
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzlv.zzf(obj, j10)).intValue();
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzs(i10, 0);
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j10) {
        return ((Long) zzlv.zzf(obj, j10)).longValue();
    }

    private final zzix zzw(int i10) {
        int i11 = i10 / 3;
        return (zzix) this.zzd[i11 + i11 + 1];
    }

    private final zzkr zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzkr zzkrVar = (zzkr) objArr[i12];
        if (zzkrVar != null) {
            return zzkrVar;
        }
        zzkr zzkrVarZzb = zzkn.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzkrVarZzb;
        return zzkrVarZzb;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzll zzllVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object objZzf = zzlv.zzf(obj, zzu(i10) & 1048575);
        if (objZzf == null || zzw(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21961. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.google.android.recaptcha.internal.zzkr
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 2196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zza(java.lang.Object):int");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int iZzc;
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < this.zzc.length; i14 += 3) {
            int iZzu = zzu(i14);
            int[] iArr = this.zzc;
            int i15 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i16 = iArr[i14];
            long j10 = i15;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzlv.zza(obj, j10));
                    byte[] bArr = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 1:
                    i11 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzlv.zzb(obj, j10));
                    i13 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j10);
                    byte[] bArr2 = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j10);
                    byte[] bArr3 = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iZzc = zzlv.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j10);
                    byte[] bArr4 = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iZzc = zzlv.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 7:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzjc.zza(zzlv.zzw(obj, j10));
                    i13 = iFloatToIntBits + i11;
                    break;
                case 8:
                    i11 = i13 * 53;
                    iFloatToIntBits = ((String) zzlv.zzf(obj, j10)).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 9:
                    i12 = i13 * 53;
                    Object objZzf = zzlv.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i13 = i12 + iHashCode;
                    break;
                case 10:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzlv.zzf(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iZzc = zzlv.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iZzc = zzlv.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iZzc = zzlv.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j10);
                    byte[] bArr5 = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iZzc = zzlv.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j10);
                    byte[] bArr6 = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i12 = i13 * 53;
                    Object objZzf2 = zzlv.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i13 = i12 + iHashCode;
                    break;
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzlv.zzf(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzlv.zzf(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 51:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j10));
                        byte[] bArr7 = zzjc.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                    }
                    break;
                case 52:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j10));
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case 53:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr8 = zzjc.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                    }
                    break;
                case 54:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr9 = zzjc.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                    }
                    break;
                case 56:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr10 = zzjc.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                    }
                    break;
                case 57:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                    }
                    break;
                case 58:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzjc.zza(zzS(obj, j10));
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case 59:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = ((String) zzlv.zzf(obj, j10)).hashCode();
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzlv.zzf(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case 61:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzlv.zzf(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case 62:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                    }
                    break;
                case 63:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                    }
                    break;
                case 64:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                    }
                    break;
                case 65:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr11 = zzjc.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                    }
                    break;
                case 66:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                    }
                    break;
                case 67:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr12 = zzjc.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                    }
                    break;
                case 68:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzlv.zzf(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
            }
        }
        int iHashCode2 = this.zzn.zzd(obj).hashCode() + (i13 * 53);
        return this.zzh ? (iHashCode2 * 53) + this.zzo.zzb(obj).zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:375:0x0882 A[PHI: r7 r8 r9 r10 r11 r12
  0x0882: PHI (r7v27 int) = (r7v11 int), (r7v12 int), (r7v13 int), (r7v19 int), (r7v28 int) binds: [B:369:0x0859, B:354:0x0803, B:338:0x07b3, B:264:0x0658, B:146:0x043b] A[DONT_GENERATE, DONT_INLINE]
  0x0882: PHI (r8v97 int) = (r8v58 int), (r8v59 int), (r8v60 int), (r8v84 int), (r8v98 int) binds: [B:369:0x0859, B:354:0x0803, B:338:0x07b3, B:264:0x0658, B:146:0x043b] A[DONT_GENERATE, DONT_INLINE]
  0x0882: PHI (r9v98 int) = (r9v69 int), (r9v70 int), (r9v71 int), (r9v88 int), (r9v99 int) binds: [B:369:0x0859, B:354:0x0803, B:338:0x07b3, B:264:0x0658, B:146:0x043b] A[DONT_GENERATE, DONT_INLINE]
  0x0882: PHI (r10v66 boolean) = (r10v51 boolean), (r10v52 boolean), (r10v53 boolean), (r10v56 boolean), (r10v67 boolean) binds: [B:369:0x0859, B:354:0x0803, B:338:0x07b3, B:264:0x0658, B:146:0x043b] A[DONT_GENERATE, DONT_INLINE]
  0x0882: PHI (r11v72 int) = (r11v51 int), (r11v52 int), (r11v53 int), (r11v63 int), (r11v73 int) binds: [B:369:0x0859, B:354:0x0803, B:338:0x07b3, B:264:0x0658, B:146:0x043b] A[DONT_GENERATE, DONT_INLINE]
  0x0882: PHI (r12v71 sun.misc.Unsafe) = 
  (r12v60 sun.misc.Unsafe)
  (r12v61 sun.misc.Unsafe)
  (r12v62 sun.misc.Unsafe)
  (r12v65 sun.misc.Unsafe)
  (r12v72 sun.misc.Unsafe)
 binds: [B:369:0x0859, B:354:0x0803, B:338:0x07b3, B:264:0x0658, B:146:0x043b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:463:0x0b35 A[PHI: r0 r5 r12 r22 r30
  0x0b35: PHI (r0v101 int) = (r0v70 int), (r0v71 int), (r0v72 int), (r0v73 int), (r0v75 int), (r0v88 int), (r0v102 int) binds: [B:461:0x0b1d, B:458:0x0afa, B:455:0x0ada, B:452:0x0abb, B:448:0x0a9a, B:403:0x0967, B:392:0x0906] A[DONT_GENERATE, DONT_INLINE]
  0x0b35: PHI (r5v55 com.google.android.recaptcha.internal.zzgj) = 
  (r5v38 com.google.android.recaptcha.internal.zzgj)
  (r5v39 com.google.android.recaptcha.internal.zzgj)
  (r5v40 com.google.android.recaptcha.internal.zzgj)
  (r5v41 com.google.android.recaptcha.internal.zzgj)
  (r5v43 com.google.android.recaptcha.internal.zzgj)
  (r5v50 com.google.android.recaptcha.internal.zzgj)
  (r5v56 com.google.android.recaptcha.internal.zzgj)
 binds: [B:461:0x0b1d, B:458:0x0afa, B:455:0x0ada, B:452:0x0abb, B:448:0x0a9a, B:403:0x0967, B:392:0x0906] A[DONT_GENERATE, DONT_INLINE]
  0x0b35: PHI (r12v58 int) = (r12v35 int), (r12v36 int), (r12v37 int), (r12v38 int), (r12v40 int), (r12v49 int), (r12v59 int) binds: [B:461:0x0b1d, B:458:0x0afa, B:455:0x0ada, B:452:0x0abb, B:448:0x0a9a, B:403:0x0967, B:392:0x0906] A[DONT_GENERATE, DONT_INLINE]
  0x0b35: PHI (r22v44 int) = (r22v28 int), (r22v29 int), (r22v30 int), (r22v31 int), (r22v33 int), (r22v39 int), (r22v45 int) binds: [B:461:0x0b1d, B:458:0x0afa, B:455:0x0ada, B:452:0x0abb, B:448:0x0a9a, B:403:0x0967, B:392:0x0906] A[DONT_GENERATE, DONT_INLINE]
  0x0b35: PHI (r30v27 sun.misc.Unsafe) = 
  (r30v5 sun.misc.Unsafe)
  (r30v6 sun.misc.Unsafe)
  (r30v7 sun.misc.Unsafe)
  (r30v8 sun.misc.Unsafe)
  (r30v10 sun.misc.Unsafe)
  (r30v19 sun.misc.Unsafe)
  (r30v28 sun.misc.Unsafe)
 binds: [B:461:0x0b1d, B:458:0x0afa, B:455:0x0ada, B:452:0x0abb, B:448:0x0a9a, B:403:0x0967, B:392:0x0906] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:561:0x0885 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0b38 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x0b48 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x0898 A[SYNTHETIC] */
    public final int zzc(Object obj, byte[] bArr, int i10, int i11, int i12, zzgj zzgjVar) throws zzje {
        Unsafe unsafe;
        int i13;
        int i14;
        int i15;
        int i16;
        zzgj zzgjVar2;
        int iZzl;
        int iZzh;
        zzgj zzgjVar3;
        zzie zzieVar;
        int i17;
        Object obj2;
        int i18;
        Unsafe unsafe2;
        int i19;
        int i20;
        boolean z10;
        zzgj zzgjVar4;
        int i21;
        int i22;
        int iZzl2;
        int i23;
        int i24;
        int i25;
        zzgj zzgjVar5;
        int i26;
        Unsafe unsafe3;
        int i27;
        int i28;
        int i29;
        int iZzl3;
        int iZzl4;
        zzgj zzgjVar6;
        int i30;
        int iZza;
        int i31;
        int i32;
        int i33;
        boolean z11;
        Unsafe unsafe4;
        int iZzi;
        int i34;
        int i35;
        int i36;
        boolean z12;
        Unsafe unsafe5;
        int iZzf;
        int i37;
        Object obj3;
        int iZzk;
        Object obj4 = obj;
        i11 = i11;
        i12 = i12;
        zzgj zzgjVar7 = zzgjVar;
        zzD(obj);
        Unsafe unsafe6 = zzb;
        int i38 = -1;
        int iZzm = i10;
        int i39 = -1;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 1048575;
        while (true) {
            if (iZzm < i11) {
                int i44 = iZzm + 1;
                int i45 = bArr[iZzm];
                if (i45 < 0) {
                    int iZzj = zzgk.zzj(i45, bArr, i44, zzgjVar7);
                    i14 = zzgjVar7.zza;
                    i44 = iZzj;
                } else {
                    i14 = i45;
                }
                int i46 = i14 >>> 3;
                int iZzs = i46 > i39 ? (i46 < this.zze || i46 > this.zzf) ? i38 : zzs(i46, i40 / 3) : zzq(i46);
                Object objValueOf = null;
                if (iZzs != i38) {
                    int i47 = i14 & 7;
                    int[] iArr = this.zzc;
                    int i48 = iArr[iZzs + 1];
                    int iZzt = zzt(i48);
                    int i49 = i44;
                    int i50 = i14;
                    long j10 = i48 & 1048575;
                    if (iZzt <= 17) {
                        int i51 = iArr[iZzs + 2];
                        int i52 = 1 << (i51 >>> 20);
                        int i53 = i51 & 1048575;
                        if (i53 != i43) {
                            if (i43 != 1048575) {
                                unsafe6.putInt(obj4, i43, i42);
                            }
                            i18 = i53;
                            i42 = i53 == 1048575 ? 0 : unsafe6.getInt(obj4, i53);
                        } else {
                            i18 = i43;
                        }
                        switch (iZzt) {
                            case 0:
                                unsafe2 = unsafe6;
                                i19 = iZzs;
                                i20 = i49;
                                z10 = true;
                                i15 = -1;
                                zzgjVar4 = zzgjVar;
                                i21 = i46;
                                i22 = i50;
                                if (i47 == 1) {
                                    iZzh = i20 + 8;
                                    i42 |= i52;
                                    zzlv.zzo(obj4, j10, Double.longBitsToDouble(zzgk.zzp(bArr, i20)));
                                    i12 = i12;
                                    i41 = i22;
                                    zzgjVar7 = zzgjVar4;
                                    i40 = i19;
                                    unsafe6 = unsafe2;
                                    i43 = i18;
                                    i38 = i15;
                                    i39 = i21;
                                    iZzm = iZzh;
                                }
                                i13 = i12;
                                zzgjVar2 = zzgjVar4;
                                iZzl = i20;
                                i40 = i19;
                                unsafe = unsafe2;
                                i43 = i18;
                                i16 = i21;
                                i41 = i22;
                                break;
                            case 1:
                                unsafe2 = unsafe6;
                                i19 = iZzs;
                                i20 = i49;
                                i15 = -1;
                                zzgjVar4 = zzgjVar;
                                i21 = i46;
                                i22 = i50;
                                if (i47 == 5) {
                                    iZzh = i20 + 4;
                                    i42 |= i52;
                                    zzlv.zzp(obj4, j10, Float.intBitsToFloat(zzgk.zzb(bArr, i20)));
                                    i12 = i12;
                                    i41 = i22;
                                    zzgjVar7 = zzgjVar4;
                                    i40 = i19;
                                    unsafe6 = unsafe2;
                                    i43 = i18;
                                    i38 = i15;
                                    i39 = i21;
                                    iZzm = iZzh;
                                }
                                z10 = true;
                                i13 = i12;
                                zzgjVar2 = zzgjVar4;
                                iZzl = i20;
                                i40 = i19;
                                unsafe = unsafe2;
                                i43 = i18;
                                i16 = i21;
                                i41 = i22;
                                break;
                            case 2:
                            case 3:
                                unsafe2 = unsafe6;
                                i19 = iZzs;
                                i20 = i49;
                                i15 = -1;
                                zzgjVar4 = zzgjVar;
                                i21 = i46;
                                i22 = i50;
                                if (i47 == 0) {
                                    i42 |= i52;
                                    iZzl2 = zzgk.zzl(bArr, i20, zzgjVar4);
                                    unsafe2.putLong(obj, j10, zzgjVar4.zzb);
                                    i11 = i11;
                                    i12 = i12;
                                    i41 = i22;
                                    iZzm = iZzl2;
                                    zzgjVar7 = zzgjVar4;
                                    i40 = i19;
                                    unsafe6 = unsafe2;
                                    i43 = i18;
                                    i38 = i15;
                                    i39 = i21;
                                } else {
                                    z10 = true;
                                    i13 = i12;
                                    zzgjVar2 = zzgjVar4;
                                    iZzl = i20;
                                    i40 = i19;
                                    unsafe = unsafe2;
                                    i43 = i18;
                                    i16 = i21;
                                    i41 = i22;
                                }
                                break;
                            case 4:
                            case 11:
                                unsafe2 = unsafe6;
                                i19 = iZzs;
                                i20 = i49;
                                i15 = -1;
                                zzgjVar4 = zzgjVar;
                                i21 = i46;
                                i22 = i50;
                                if (i47 == 0) {
                                    i42 |= i52;
                                    iZzh = zzgk.zzi(bArr, i20, zzgjVar4);
                                    unsafe2.putInt(obj4, j10, zzgjVar4.zza);
                                    i12 = i12;
                                    i41 = i22;
                                    zzgjVar7 = zzgjVar4;
                                    i40 = i19;
                                    unsafe6 = unsafe2;
                                    i43 = i18;
                                    i38 = i15;
                                    i39 = i21;
                                    iZzm = iZzh;
                                }
                                z10 = true;
                                i13 = i12;
                                zzgjVar2 = zzgjVar4;
                                iZzl = i20;
                                i40 = i19;
                                unsafe = unsafe2;
                                i43 = i18;
                                i16 = i21;
                                i41 = i22;
                                break;
                            case 5:
                            case Code.UNAVAILABLE /* 14 */:
                                unsafe2 = unsafe6;
                                i19 = iZzs;
                                i20 = i49;
                                z10 = true;
                                i15 = -1;
                                zzgjVar4 = zzgjVar;
                                i21 = i46;
                                i22 = i50;
                                if (i47 == 1) {
                                    iZzl2 = i20 + 8;
                                    i42 |= i52;
                                    unsafe2.putLong(obj, j10, zzgk.zzp(bArr, i20));
                                    i11 = i11;
                                    i12 = i12;
                                    i41 = i22;
                                    iZzm = iZzl2;
                                    zzgjVar7 = zzgjVar4;
                                    i40 = i19;
                                    unsafe6 = unsafe2;
                                    i43 = i18;
                                    i38 = i15;
                                    i39 = i21;
                                } else {
                                    i13 = i12;
                                    zzgjVar2 = zzgjVar4;
                                    iZzl = i20;
                                    i40 = i19;
                                    unsafe = unsafe2;
                                    i43 = i18;
                                    i16 = i21;
                                    i41 = i22;
                                }
                                break;
                            case 6:
                            case 13:
                                unsafe2 = unsafe6;
                                i19 = iZzs;
                                i20 = i49;
                                i15 = -1;
                                zzgjVar4 = zzgjVar;
                                i21 = i46;
                                i22 = i50;
                                if (i47 == 5) {
                                    iZzh = i20 + 4;
                                    i42 |= i52;
                                    unsafe2.putInt(obj4, j10, zzgk.zzb(bArr, i20));
                                    i12 = i12;
                                    i41 = i22;
                                    zzgjVar7 = zzgjVar4;
                                    i40 = i19;
                                    unsafe6 = unsafe2;
                                    i43 = i18;
                                    i38 = i15;
                                    i39 = i21;
                                    iZzm = iZzh;
                                }
                                z10 = true;
                                i13 = i12;
                                zzgjVar2 = zzgjVar4;
                                iZzl = i20;
                                i40 = i19;
                                unsafe = unsafe2;
                                i43 = i18;
                                i16 = i21;
                                i41 = i22;
                                break;
                            case 7:
                                unsafe2 = unsafe6;
                                i19 = iZzs;
                                i20 = i49;
                                i15 = -1;
                                zzgjVar4 = zzgjVar;
                                i21 = i46;
                                i22 = i50;
                                if (i47 == 0) {
                                    i42 |= i52;
                                    iZzh = zzgk.zzl(bArr, i20, zzgjVar4);
                                    zzlv.zzm(obj4, j10, zzgjVar4.zzb != 0);
                                    i12 = i12;
                                    i41 = i22;
                                    zzgjVar7 = zzgjVar4;
                                    i40 = i19;
                                    unsafe6 = unsafe2;
                                    i43 = i18;
                                    i38 = i15;
                                    i39 = i21;
                                    iZzm = iZzh;
                                }
                                z10 = true;
                                i13 = i12;
                                zzgjVar2 = zzgjVar4;
                                iZzl = i20;
                                i40 = i19;
                                unsafe = unsafe2;
                                i43 = i18;
                                i16 = i21;
                                i41 = i22;
                                break;
                            case 8:
                                unsafe2 = unsafe6;
                                i19 = iZzs;
                                i20 = i49;
                                i15 = -1;
                                zzgjVar4 = zzgjVar;
                                i21 = i46;
                                i22 = i50;
                                if (i47 == 2) {
                                    if (zzM(i48)) {
                                        iZzh = zzgk.zzi(bArr, i20, zzgjVar4);
                                        int i54 = zzgjVar4.zza;
                                        if (i54 < 0) {
                                            throw zzje.zzf();
                                        }
                                        int i55 = i42 | i52;
                                        if (i54 == 0) {
                                            zzgjVar4.zzc = "";
                                        } else {
                                            zzgjVar4.zzc = zzma.zzd(bArr, iZzh, i54);
                                            iZzh += i54;
                                        }
                                        i42 = i55;
                                    } else {
                                        i42 |= i52;
                                        iZzh = zzgk.zzg(bArr, i20, zzgjVar4);
                                    }
                                    unsafe2.putObject(obj4, j10, zzgjVar4.zzc);
                                    i12 = i12;
                                    i41 = i22;
                                    zzgjVar7 = zzgjVar4;
                                    i40 = i19;
                                    unsafe6 = unsafe2;
                                    i43 = i18;
                                    i38 = i15;
                                    i39 = i21;
                                    iZzm = iZzh;
                                }
                                z10 = true;
                                i13 = i12;
                                zzgjVar2 = zzgjVar4;
                                iZzl = i20;
                                i40 = i19;
                                unsafe = unsafe2;
                                i43 = i18;
                                i16 = i21;
                                i41 = i22;
                                break;
                            case 9:
                                unsafe2 = unsafe6;
                                i19 = iZzs;
                                i23 = i50;
                                i20 = i49;
                                i15 = -1;
                                zzgjVar4 = zzgjVar;
                                i21 = i46;
                                if (i47 == 2) {
                                    i42 |= i52;
                                    Object objZzA = zzA(obj4, i19);
                                    i11 = i11;
                                    int iZzn = zzgk.zzn(objZzA, zzx(i19), bArr, i20, i11, zzgjVar);
                                    zzJ(obj4, i19, objZzA);
                                    iZzm = iZzn;
                                    i41 = i23;
                                    zzgjVar7 = zzgjVar4;
                                    i40 = i19;
                                    unsafe6 = unsafe2;
                                    i43 = i18;
                                    i38 = i15;
                                    i39 = i21;
                                } else {
                                    i22 = i23;
                                    z10 = true;
                                    i13 = i12;
                                    zzgjVar2 = zzgjVar4;
                                    iZzl = i20;
                                    i40 = i19;
                                    unsafe = unsafe2;
                                    i43 = i18;
                                    i16 = i21;
                                    i41 = i22;
                                }
                                break;
                            case 10:
                                unsafe2 = unsafe6;
                                i19 = iZzs;
                                i23 = i50;
                                i20 = i49;
                                i15 = -1;
                                zzgjVar4 = zzgjVar;
                                i21 = i46;
                                if (i47 == 2) {
                                    i42 |= i52;
                                    iZzm = zzgk.zza(bArr, i20, zzgjVar4);
                                    unsafe2.putObject(obj4, j10, zzgjVar4.zzc);
                                    i11 = i11;
                                    i41 = i23;
                                    zzgjVar7 = zzgjVar4;
                                    i40 = i19;
                                    unsafe6 = unsafe2;
                                    i43 = i18;
                                    i38 = i15;
                                    i39 = i21;
                                } else {
                                    i22 = i23;
                                    z10 = true;
                                    i13 = i12;
                                    zzgjVar2 = zzgjVar4;
                                    iZzl = i20;
                                    i40 = i19;
                                    unsafe = unsafe2;
                                    i43 = i18;
                                    i16 = i21;
                                    i41 = i22;
                                }
                                break;
                            case 12:
                                unsafe2 = unsafe6;
                                i19 = iZzs;
                                i24 = i50;
                                i20 = i49;
                                i15 = -1;
                                zzgjVar4 = zzgjVar;
                                i21 = i46;
                                if (i47 == 0) {
                                    iZzm = zzgk.zzi(bArr, i20, zzgjVar4);
                                    int i56 = zzgjVar4.zza;
                                    zzix zzixVarZzw = zzw(i19);
                                    if ((Integer.MIN_VALUE & i48) == 0 || zzixVarZzw == null || zzixVarZzw.zza(i56)) {
                                        i23 = i24;
                                        i42 |= i52;
                                        unsafe2.putInt(obj4, j10, i56);
                                    } else {
                                        i23 = i24;
                                        zzd(obj).zzj(i23, Long.valueOf(i56));
                                    }
                                    i11 = i11;
                                    i41 = i23;
                                    zzgjVar7 = zzgjVar4;
                                    i40 = i19;
                                    unsafe6 = unsafe2;
                                    i43 = i18;
                                    i38 = i15;
                                    i39 = i21;
                                } else {
                                    i22 = i24;
                                    z10 = true;
                                    i13 = i12;
                                    zzgjVar2 = zzgjVar4;
                                    iZzl = i20;
                                    i40 = i19;
                                    unsafe = unsafe2;
                                    i43 = i18;
                                    i16 = i21;
                                    i41 = i22;
                                }
                                break;
                            case 15:
                                unsafe2 = unsafe6;
                                i19 = iZzs;
                                i24 = i50;
                                i20 = i49;
                                i15 = -1;
                                zzgjVar4 = zzgjVar;
                                i21 = i46;
                                if (i47 == 0) {
                                    i42 |= i52;
                                    iZzm = zzgk.zzi(bArr, i20, zzgjVar4);
                                    unsafe2.putInt(obj4, j10, zzhc.zzF(zzgjVar4.zza));
                                    zzgjVar7 = zzgjVar4;
                                    i40 = i19;
                                    unsafe6 = unsafe2;
                                    i43 = i18;
                                    i38 = i15;
                                    i39 = i21;
                                    i41 = i24;
                                } else {
                                    i22 = i24;
                                    z10 = true;
                                    i13 = i12;
                                    zzgjVar2 = zzgjVar4;
                                    iZzl = i20;
                                    i40 = i19;
                                    unsafe = unsafe2;
                                    i43 = i18;
                                    i16 = i21;
                                    i41 = i22;
                                }
                                break;
                            case Code.UNAUTHENTICATED /* 16 */:
                                i19 = iZzs;
                                i24 = i50;
                                if (i47 == 0) {
                                    i42 |= i52;
                                    iZzm = zzgk.zzl(bArr, i49, zzgjVar);
                                    i15 = -1;
                                    i21 = i46;
                                    unsafe2 = unsafe6;
                                    unsafe6.putLong(obj, j10, zzhc.zzG(zzgjVar.zzb));
                                    zzgjVar7 = zzgjVar;
                                    i40 = i19;
                                    unsafe6 = unsafe2;
                                    i43 = i18;
                                    i38 = i15;
                                    i39 = i21;
                                    i41 = i24;
                                } else {
                                    zzgjVar4 = zzgjVar;
                                    unsafe2 = unsafe6;
                                    i21 = i46;
                                    i20 = i49;
                                    i15 = -1;
                                    i22 = i24;
                                    z10 = true;
                                    i13 = i12;
                                    zzgjVar2 = zzgjVar4;
                                    iZzl = i20;
                                    i40 = i19;
                                    unsafe = unsafe2;
                                    i43 = i18;
                                    i16 = i21;
                                    i41 = i22;
                                }
                                break;
                            default:
                                if (i47 == 3) {
                                    Object objZzA2 = zzA(obj4, iZzs);
                                    iZzm = zzgk.zzm(objZzA2, zzx(iZzs), bArr, i49, i11, (i46 << 3) | 4, zzgjVar);
                                    zzJ(obj4, iZzs, objZzA2);
                                    zzgjVar7 = zzgjVar;
                                    i42 |= i52;
                                    i39 = i46;
                                    i40 = iZzs;
                                    i43 = i18;
                                    i41 = i50;
                                    i38 = -1;
                                    i12 = i12;
                                } else {
                                    unsafe2 = unsafe6;
                                    i19 = iZzs;
                                    i20 = i49;
                                    z10 = true;
                                    i15 = -1;
                                    zzgjVar4 = zzgjVar;
                                    i21 = i46;
                                    i22 = i50;
                                    i13 = i12;
                                    zzgjVar2 = zzgjVar4;
                                    iZzl = i20;
                                    i40 = i19;
                                    unsafe = unsafe2;
                                    i43 = i18;
                                    i16 = i21;
                                    i41 = i22;
                                }
                                break;
                        }
                    } else {
                        int i57 = i43;
                        i15 = -1;
                        Unsafe unsafe7 = unsafe6;
                        zzgj zzgjVar8 = zzgjVar7;
                        if (iZzt != 27) {
                            i25 = i42;
                            zzgjVar5 = zzgjVar8;
                            if (iZzt <= 49) {
                                long j11 = i48;
                                Unsafe unsafe8 = zzb;
                                zzjb zzjbVar = (zzjb) unsafe8.getObject(obj4, j10);
                                if (!zzjbVar.zzc()) {
                                    int size = zzjbVar.size();
                                    zzjb zzjbVarZzd = zzjbVar.zzd(size != 0 ? size + size : 10);
                                    unsafe8.putObject(obj4, j10, zzjbVarZzd);
                                    zzjbVar = zzjbVarZzd;
                                }
                                switch (iZzt) {
                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    case 35:
                                        i31 = i11;
                                        i32 = iZzs;
                                        i33 = i49;
                                        i41 = i50;
                                        z11 = true;
                                        unsafe4 = unsafe7;
                                        if (i47 == 2) {
                                            zzhy zzhyVar = (zzhy) zzjbVar;
                                            iZzi = zzgk.zzi(bArr, i33, zzgjVar5);
                                            int i58 = zzgjVar5.zza + iZzi;
                                            while (iZzi < i58) {
                                                zzhyVar.zze(Double.longBitsToDouble(zzgk.zzp(bArr, iZzi)));
                                                iZzi += 8;
                                            }
                                            if (iZzi != i58) {
                                                throw zzje.zzj();
                                            }
                                        } else if (i47 == 1) {
                                            iZzi = i33 + 8;
                                            zzhy zzhyVar2 = (zzhy) zzjbVar;
                                            zzhyVar2.zze(Double.longBitsToDouble(zzgk.zzp(bArr, i33)));
                                            while (iZzi < i31) {
                                                int iZzi2 = zzgk.zzi(bArr, iZzi, zzgjVar5);
                                                if (i41 == zzgjVar5.zza) {
                                                    zzhyVar2.zze(Double.longBitsToDouble(zzgk.zzp(bArr, iZzi2)));
                                                    iZzi = iZzi2 + 8;
                                                }
                                            }
                                        } else {
                                            iZzi = i33;
                                        }
                                        if (iZzi != i33) {
                                            zzgjVar5 = zzgjVar5;
                                            i12 = i12;
                                            iZzm = iZzi;
                                            i11 = i31;
                                            i40 = i32;
                                            unsafe6 = unsafe4;
                                            zzgjVar7 = zzgjVar5;
                                            i43 = i57;
                                            i38 = -1;
                                            i39 = i46;
                                            i42 = i25;
                                            obj4 = obj;
                                        } else {
                                            zzgjVar5 = zzgjVar5;
                                            obj4 = obj;
                                            iZzl = iZzi;
                                            unsafe = unsafe4;
                                            zzgjVar2 = zzgjVar5;
                                            i43 = i57;
                                            i16 = i46;
                                            i42 = i25;
                                            i40 = i32;
                                            i13 = i12;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        i31 = i11;
                                        i32 = iZzs;
                                        i33 = i49;
                                        i41 = i50;
                                        z11 = true;
                                        unsafe4 = unsafe7;
                                        if (i47 == 2) {
                                            zzil zzilVar = (zzil) zzjbVar;
                                            iZzi = zzgk.zzi(bArr, i33, zzgjVar5);
                                            int i59 = zzgjVar5.zza + iZzi;
                                            while (iZzi < i59) {
                                                zzilVar.zze(Float.intBitsToFloat(zzgk.zzb(bArr, iZzi)));
                                                iZzi += 4;
                                            }
                                            if (iZzi != i59) {
                                                throw zzje.zzj();
                                            }
                                        } else if (i47 == 5) {
                                            iZzi = i33 + 4;
                                            zzil zzilVar2 = (zzil) zzjbVar;
                                            zzilVar2.zze(Float.intBitsToFloat(zzgk.zzb(bArr, i33)));
                                            while (iZzi < i31) {
                                                int iZzi3 = zzgk.zzi(bArr, iZzi, zzgjVar5);
                                                if (i41 == zzgjVar5.zza) {
                                                    zzilVar2.zze(Float.intBitsToFloat(zzgk.zzb(bArr, iZzi3)));
                                                    iZzi = iZzi3 + 4;
                                                }
                                            }
                                        } else {
                                            iZzi = i33;
                                        }
                                        if (iZzi != i33) {
                                            zzgjVar5 = zzgjVar5;
                                            i12 = i12;
                                            iZzm = iZzi;
                                            i11 = i31;
                                            i40 = i32;
                                            unsafe6 = unsafe4;
                                            zzgjVar7 = zzgjVar5;
                                            i43 = i57;
                                            i38 = -1;
                                            i39 = i46;
                                            i42 = i25;
                                            obj4 = obj;
                                        } else {
                                            zzgjVar5 = zzgjVar5;
                                            obj4 = obj;
                                            iZzl = iZzi;
                                            unsafe = unsafe4;
                                            zzgjVar2 = zzgjVar5;
                                            i43 = i57;
                                            i16 = i46;
                                            i42 = i25;
                                            i40 = i32;
                                            i13 = i12;
                                        }
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                                    case 21:
                                    case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                    case 38:
                                        i31 = i11;
                                        i32 = iZzs;
                                        i33 = i49;
                                        i41 = i50;
                                        z11 = true;
                                        unsafe4 = unsafe7;
                                        if (i47 == 2) {
                                            zzjt zzjtVar = (zzjt) zzjbVar;
                                            iZzi = zzgk.zzi(bArr, i33, zzgjVar5);
                                            int i60 = zzgjVar5.zza + iZzi;
                                            while (iZzi < i60) {
                                                iZzi = zzgk.zzl(bArr, iZzi, zzgjVar5);
                                                zzjtVar.zzg(zzgjVar5.zzb);
                                            }
                                            if (iZzi != i60) {
                                                throw zzje.zzj();
                                            }
                                        } else if (i47 == 0) {
                                            zzjt zzjtVar2 = (zzjt) zzjbVar;
                                            iZzi = zzgk.zzl(bArr, i33, zzgjVar5);
                                            zzjtVar2.zzg(zzgjVar5.zzb);
                                            while (iZzi < i31) {
                                                int iZzi4 = zzgk.zzi(bArr, iZzi, zzgjVar5);
                                                if (i41 == zzgjVar5.zza) {
                                                    iZzi = zzgk.zzl(bArr, iZzi4, zzgjVar5);
                                                    zzjtVar2.zzg(zzgjVar5.zzb);
                                                }
                                            }
                                        } else {
                                            iZzi = i33;
                                        }
                                        if (iZzi != i33) {
                                            zzgjVar5 = zzgjVar5;
                                            i12 = i12;
                                            iZzm = iZzi;
                                            i11 = i31;
                                            i40 = i32;
                                            unsafe6 = unsafe4;
                                            zzgjVar7 = zzgjVar5;
                                            i43 = i57;
                                            i38 = -1;
                                            i39 = i46;
                                            i42 = i25;
                                            obj4 = obj;
                                        } else {
                                            zzgjVar5 = zzgjVar5;
                                            obj4 = obj;
                                            iZzl = iZzi;
                                            unsafe = unsafe4;
                                            zzgjVar2 = zzgjVar5;
                                            i43 = i57;
                                            i16 = i46;
                                            i42 = i25;
                                            i40 = i32;
                                            i13 = i12;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i31 = i11;
                                        i34 = iZzs;
                                        i35 = i49;
                                        i36 = i50;
                                        z12 = true;
                                        unsafe5 = unsafe7;
                                        if (i47 == 2) {
                                            iZzf = zzgk.zzf(bArr, i35, zzjbVar, zzgjVar5);
                                            unsafe4 = unsafe5;
                                            iZzi = iZzf;
                                            i41 = i36;
                                            i33 = i35;
                                            i32 = i34;
                                            z11 = z12;
                                        } else if (i47 == 0) {
                                            unsafe4 = unsafe5;
                                            i41 = i36;
                                            i33 = i35;
                                            i32 = i34;
                                            z11 = true;
                                            iZzi = zzgk.zzk(i36, bArr, i35, i11, zzjbVar, zzgjVar);
                                        } else {
                                            unsafe4 = unsafe5;
                                            i41 = i36;
                                            i33 = i35;
                                            i32 = i34;
                                            z11 = z12;
                                            iZzi = i33;
                                        }
                                        if (iZzi != i33) {
                                            zzgjVar5 = zzgjVar5;
                                            i12 = i12;
                                            iZzm = iZzi;
                                            i11 = i31;
                                            i40 = i32;
                                            unsafe6 = unsafe4;
                                            zzgjVar7 = zzgjVar5;
                                            i43 = i57;
                                            i38 = -1;
                                            i39 = i46;
                                            i42 = i25;
                                            obj4 = obj;
                                        } else {
                                            zzgjVar5 = zzgjVar5;
                                            obj4 = obj;
                                            iZzl = iZzi;
                                            unsafe = unsafe4;
                                            zzgjVar2 = zzgjVar5;
                                            i43 = i57;
                                            i16 = i46;
                                            i42 = i25;
                                            i40 = i32;
                                            i13 = i12;
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i31 = i11;
                                        i34 = iZzs;
                                        i35 = i49;
                                        i36 = i50;
                                        z12 = true;
                                        unsafe5 = unsafe7;
                                        if (i47 != 2) {
                                            if (i47 == 1) {
                                                i37 = i35 + 8;
                                                zzjt zzjtVar3 = (zzjt) zzjbVar;
                                                zzjtVar3.zzg(zzgk.zzp(bArr, i35));
                                                while (i37 < i31) {
                                                    int iZzi5 = zzgk.zzi(bArr, i37, zzgjVar5);
                                                    if (i36 != zzgjVar5.zza) {
                                                        unsafe4 = unsafe5;
                                                        i33 = i35;
                                                        i32 = i34;
                                                        z11 = z12;
                                                        iZzi = i37;
                                                        i41 = i36;
                                                        if (iZzi != i33) {
                                                            zzgjVar5 = zzgjVar5;
                                                            i12 = i12;
                                                            iZzm = iZzi;
                                                            i11 = i31;
                                                            i40 = i32;
                                                            unsafe6 = unsafe4;
                                                            zzgjVar7 = zzgjVar5;
                                                            i43 = i57;
                                                            i38 = -1;
                                                            i39 = i46;
                                                            i42 = i25;
                                                            obj4 = obj;
                                                        } else {
                                                            zzgjVar5 = zzgjVar5;
                                                            obj4 = obj;
                                                            iZzl = iZzi;
                                                            unsafe = unsafe4;
                                                            zzgjVar2 = zzgjVar5;
                                                            i43 = i57;
                                                            i16 = i46;
                                                            i42 = i25;
                                                            i40 = i32;
                                                            i13 = i12;
                                                        }
                                                    } else {
                                                        zzjtVar3.zzg(zzgk.zzp(bArr, iZzi5));
                                                        i37 = iZzi5 + 8;
                                                    }
                                                    break;
                                                }
                                                unsafe4 = unsafe5;
                                                i33 = i35;
                                                i32 = i34;
                                                z11 = z12;
                                                iZzi = i37;
                                                i41 = i36;
                                                if (iZzi != i33) {
                                                    zzgjVar5 = zzgjVar5;
                                                    i12 = i12;
                                                    iZzm = iZzi;
                                                    i11 = i31;
                                                    i40 = i32;
                                                    unsafe6 = unsafe4;
                                                    zzgjVar7 = zzgjVar5;
                                                    i43 = i57;
                                                    i38 = -1;
                                                    i39 = i46;
                                                    i42 = i25;
                                                    obj4 = obj;
                                                } else {
                                                    zzgjVar5 = zzgjVar5;
                                                    obj4 = obj;
                                                    iZzl = iZzi;
                                                    unsafe = unsafe4;
                                                    zzgjVar2 = zzgjVar5;
                                                    i43 = i57;
                                                    i16 = i46;
                                                    i42 = i25;
                                                    i40 = i32;
                                                    i13 = i12;
                                                }
                                            }
                                            unsafe4 = unsafe5;
                                            i41 = i36;
                                            i33 = i35;
                                            i32 = i34;
                                            z11 = z12;
                                            iZzi = i33;
                                            if (iZzi != i33) {
                                                zzgjVar5 = zzgjVar5;
                                                i12 = i12;
                                                iZzm = iZzi;
                                                i11 = i31;
                                                i40 = i32;
                                                unsafe6 = unsafe4;
                                                zzgjVar7 = zzgjVar5;
                                                i43 = i57;
                                                i38 = -1;
                                                i39 = i46;
                                                i42 = i25;
                                                obj4 = obj;
                                            } else {
                                                zzgjVar5 = zzgjVar5;
                                                obj4 = obj;
                                                iZzl = iZzi;
                                                unsafe = unsafe4;
                                                zzgjVar2 = zzgjVar5;
                                                i43 = i57;
                                                i16 = i46;
                                                i42 = i25;
                                                i40 = i32;
                                                i13 = i12;
                                            }
                                            break;
                                        } else {
                                            zzjt zzjtVar4 = (zzjt) zzjbVar;
                                            iZzf = zzgk.zzi(bArr, i35, zzgjVar5);
                                            int i61 = zzgjVar5.zza + iZzf;
                                            while (iZzf < i61) {
                                                zzjtVar4.zzg(zzgk.zzp(bArr, iZzf));
                                                iZzf += 8;
                                            }
                                            if (iZzf != i61) {
                                                throw zzje.zzj();
                                            }
                                            unsafe4 = unsafe5;
                                            iZzi = iZzf;
                                            i41 = i36;
                                            i33 = i35;
                                            i32 = i34;
                                            z11 = z12;
                                            if (iZzi != i33) {
                                                zzgjVar5 = zzgjVar5;
                                                i12 = i12;
                                                iZzm = iZzi;
                                                i11 = i31;
                                                i40 = i32;
                                                unsafe6 = unsafe4;
                                                zzgjVar7 = zzgjVar5;
                                                i43 = i57;
                                                i38 = -1;
                                                i39 = i46;
                                                i42 = i25;
                                                obj4 = obj;
                                            } else {
                                                zzgjVar5 = zzgjVar5;
                                                obj4 = obj;
                                                iZzl = iZzi;
                                                unsafe = unsafe4;
                                                zzgjVar2 = zzgjVar5;
                                                i43 = i57;
                                                i16 = i46;
                                                i42 = i25;
                                                i40 = i32;
                                                i13 = i12;
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        i31 = i11;
                                        i34 = iZzs;
                                        i35 = i49;
                                        i36 = i50;
                                        z12 = true;
                                        unsafe5 = unsafe7;
                                        if (i47 != 2) {
                                            if (i47 == 5) {
                                                i37 = i35 + 4;
                                                zziu zziuVar = (zziu) zzjbVar;
                                                zziuVar.zzg(zzgk.zzb(bArr, i35));
                                                while (i37 < i31) {
                                                    int iZzi6 = zzgk.zzi(bArr, i37, zzgjVar5);
                                                    if (i36 != zzgjVar5.zza) {
                                                        unsafe4 = unsafe5;
                                                        i33 = i35;
                                                        i32 = i34;
                                                        z11 = z12;
                                                        iZzi = i37;
                                                        i41 = i36;
                                                        if (iZzi != i33) {
                                                            zzgjVar5 = zzgjVar5;
                                                            i12 = i12;
                                                            iZzm = iZzi;
                                                            i11 = i31;
                                                            i40 = i32;
                                                            unsafe6 = unsafe4;
                                                            zzgjVar7 = zzgjVar5;
                                                            i43 = i57;
                                                            i38 = -1;
                                                            i39 = i46;
                                                            i42 = i25;
                                                            obj4 = obj;
                                                        } else {
                                                            zzgjVar5 = zzgjVar5;
                                                            obj4 = obj;
                                                            iZzl = iZzi;
                                                            unsafe = unsafe4;
                                                            zzgjVar2 = zzgjVar5;
                                                            i43 = i57;
                                                            i16 = i46;
                                                            i42 = i25;
                                                            i40 = i32;
                                                            i13 = i12;
                                                        }
                                                    } else {
                                                        zziuVar.zzg(zzgk.zzb(bArr, iZzi6));
                                                        i37 = iZzi6 + 4;
                                                    }
                                                    break;
                                                }
                                                unsafe4 = unsafe5;
                                                i33 = i35;
                                                i32 = i34;
                                                z11 = z12;
                                                iZzi = i37;
                                                i41 = i36;
                                                if (iZzi != i33) {
                                                    zzgjVar5 = zzgjVar5;
                                                    i12 = i12;
                                                    iZzm = iZzi;
                                                    i11 = i31;
                                                    i40 = i32;
                                                    unsafe6 = unsafe4;
                                                    zzgjVar7 = zzgjVar5;
                                                    i43 = i57;
                                                    i38 = -1;
                                                    i39 = i46;
                                                    i42 = i25;
                                                    obj4 = obj;
                                                } else {
                                                    zzgjVar5 = zzgjVar5;
                                                    obj4 = obj;
                                                    iZzl = iZzi;
                                                    unsafe = unsafe4;
                                                    zzgjVar2 = zzgjVar5;
                                                    i43 = i57;
                                                    i16 = i46;
                                                    i42 = i25;
                                                    i40 = i32;
                                                    i13 = i12;
                                                }
                                            }
                                            unsafe4 = unsafe5;
                                            i41 = i36;
                                            i33 = i35;
                                            i32 = i34;
                                            z11 = z12;
                                            iZzi = i33;
                                            if (iZzi != i33) {
                                                zzgjVar5 = zzgjVar5;
                                                i12 = i12;
                                                iZzm = iZzi;
                                                i11 = i31;
                                                i40 = i32;
                                                unsafe6 = unsafe4;
                                                zzgjVar7 = zzgjVar5;
                                                i43 = i57;
                                                i38 = -1;
                                                i39 = i46;
                                                i42 = i25;
                                                obj4 = obj;
                                            } else {
                                                zzgjVar5 = zzgjVar5;
                                                obj4 = obj;
                                                iZzl = iZzi;
                                                unsafe = unsafe4;
                                                zzgjVar2 = zzgjVar5;
                                                i43 = i57;
                                                i16 = i46;
                                                i42 = i25;
                                                i40 = i32;
                                                i13 = i12;
                                            }
                                            break;
                                        } else {
                                            zziu zziuVar2 = (zziu) zzjbVar;
                                            iZzf = zzgk.zzi(bArr, i35, zzgjVar5);
                                            int i62 = zzgjVar5.zza + iZzf;
                                            while (iZzf < i62) {
                                                zziuVar2.zzg(zzgk.zzb(bArr, iZzf));
                                                iZzf += 4;
                                            }
                                            if (iZzf != i62) {
                                                throw zzje.zzj();
                                            }
                                            unsafe4 = unsafe5;
                                            iZzi = iZzf;
                                            i41 = i36;
                                            i33 = i35;
                                            i32 = i34;
                                            z11 = z12;
                                            if (iZzi != i33) {
                                                zzgjVar5 = zzgjVar5;
                                                i12 = i12;
                                                iZzm = iZzi;
                                                i11 = i31;
                                                i40 = i32;
                                                unsafe6 = unsafe4;
                                                zzgjVar7 = zzgjVar5;
                                                i43 = i57;
                                                i38 = -1;
                                                i39 = i46;
                                                i42 = i25;
                                                obj4 = obj;
                                            } else {
                                                zzgjVar5 = zzgjVar5;
                                                obj4 = obj;
                                                iZzl = iZzi;
                                                unsafe = unsafe4;
                                                zzgjVar2 = zzgjVar5;
                                                i43 = i57;
                                                i16 = i46;
                                                i42 = i25;
                                                i40 = i32;
                                                i13 = i12;
                                            }
                                        }
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                                    case 42:
                                        i31 = i11;
                                        i34 = iZzs;
                                        i35 = i49;
                                        i36 = i50;
                                        z12 = true;
                                        unsafe5 = unsafe7;
                                        if (i47 != 2) {
                                            if (i47 == 0) {
                                                zzgl zzglVar = (zzgl) zzjbVar;
                                                iZzf = zzgk.zzl(bArr, i35, zzgjVar5);
                                                zzglVar.zze(zzgjVar5.zzb != 0);
                                                while (iZzf < i31) {
                                                    int iZzi7 = zzgk.zzi(bArr, iZzf, zzgjVar5);
                                                    if (i36 == zzgjVar5.zza) {
                                                        iZzf = zzgk.zzl(bArr, iZzi7, zzgjVar5);
                                                        zzglVar.zze(zzgjVar5.zzb != 0);
                                                    }
                                                }
                                            }
                                            unsafe4 = unsafe5;
                                            i41 = i36;
                                            i33 = i35;
                                            i32 = i34;
                                            z11 = z12;
                                            iZzi = i33;
                                            if (iZzi != i33) {
                                                zzgjVar5 = zzgjVar5;
                                                i12 = i12;
                                                iZzm = iZzi;
                                                i11 = i31;
                                                i40 = i32;
                                                unsafe6 = unsafe4;
                                                zzgjVar7 = zzgjVar5;
                                                i43 = i57;
                                                i38 = -1;
                                                i39 = i46;
                                                i42 = i25;
                                                obj4 = obj;
                                            } else {
                                                zzgjVar5 = zzgjVar5;
                                                obj4 = obj;
                                                iZzl = iZzi;
                                                unsafe = unsafe4;
                                                zzgjVar2 = zzgjVar5;
                                                i43 = i57;
                                                i16 = i46;
                                                i42 = i25;
                                                i40 = i32;
                                                i13 = i12;
                                            }
                                        } else {
                                            zzgl zzglVar2 = (zzgl) zzjbVar;
                                            iZzf = zzgk.zzi(bArr, i35, zzgjVar5);
                                            int i63 = zzgjVar5.zza + iZzf;
                                            while (iZzf < i63) {
                                                iZzf = zzgk.zzl(bArr, iZzf, zzgjVar5);
                                                zzglVar2.zze(zzgjVar5.zzb != 0);
                                            }
                                            if (iZzf != i63) {
                                                throw zzje.zzj();
                                            }
                                        }
                                        unsafe4 = unsafe5;
                                        iZzi = iZzf;
                                        i41 = i36;
                                        i33 = i35;
                                        i32 = i34;
                                        z11 = z12;
                                        if (iZzi != i33) {
                                            zzgjVar5 = zzgjVar5;
                                            i12 = i12;
                                            iZzm = iZzi;
                                            i11 = i31;
                                            i40 = i32;
                                            unsafe6 = unsafe4;
                                            zzgjVar7 = zzgjVar5;
                                            i43 = i57;
                                            i38 = -1;
                                            i39 = i46;
                                            i42 = i25;
                                            obj4 = obj;
                                        } else {
                                            zzgjVar5 = zzgjVar5;
                                            obj4 = obj;
                                            iZzl = iZzi;
                                            unsafe = unsafe4;
                                            zzgjVar2 = zzgjVar5;
                                            i43 = i57;
                                            i16 = i46;
                                            i42 = i25;
                                            i40 = i32;
                                            i13 = i12;
                                        }
                                        break;
                                    case 26:
                                        i31 = i11;
                                        i34 = iZzs;
                                        i35 = i49;
                                        i36 = i50;
                                        z12 = true;
                                        unsafe5 = unsafe7;
                                        if (i47 == 2) {
                                            if ((j11 & 536870912) == 0) {
                                                iZzf = zzgk.zzi(bArr, i35, zzgjVar5);
                                                int i64 = zzgjVar5.zza;
                                                if (i64 < 0) {
                                                    throw zzje.zzf();
                                                }
                                                if (i64 == 0) {
                                                    obj3 = "";
                                                    zzjbVar.add(obj3);
                                                } else {
                                                    obj3 = r5;
                                                    zzjbVar.add(new String(bArr, iZzf, i64, zzjc.zzb));
                                                    iZzf += i64;
                                                }
                                                while (iZzf < i31) {
                                                    int iZzi8 = zzgk.zzi(bArr, iZzf, zzgjVar5);
                                                    if (i36 == zzgjVar5.zza) {
                                                        iZzf = zzgk.zzi(bArr, iZzi8, zzgjVar5);
                                                        int i65 = zzgjVar5.zza;
                                                        if (i65 < 0) {
                                                            throw zzje.zzf();
                                                        }
                                                        if (i65 == 0) {
                                                            zzjbVar.add(obj3);
                                                        } else {
                                                            zzjbVar.add(new String(bArr, iZzf, i65, zzjc.zzb));
                                                            iZzf += i65;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iZzf = zzgk.zzi(bArr, i35, zzgjVar5);
                                                int i66 = zzgjVar5.zza;
                                                if (i66 < 0) {
                                                    throw zzje.zzf();
                                                }
                                                if (i66 == 0) {
                                                    zzjbVar.add(r5);
                                                } else {
                                                    int i67 = iZzf + i66;
                                                    if (!zzma.zzf(bArr, iZzf, i67)) {
                                                        throw zzje.zzd();
                                                    }
                                                    zzjbVar.add(new String(bArr, iZzf, i66, zzjc.zzb));
                                                    iZzf = i67;
                                                }
                                                while (iZzf < i31) {
                                                    int iZzi9 = zzgk.zzi(bArr, iZzf, zzgjVar5);
                                                    if (i36 == zzgjVar5.zza) {
                                                        iZzf = zzgk.zzi(bArr, iZzi9, zzgjVar5);
                                                        int i68 = zzgjVar5.zza;
                                                        if (i68 < 0) {
                                                            throw zzje.zzf();
                                                        }
                                                        if (i68 == 0) {
                                                            zzjbVar.add(r5);
                                                        } else {
                                                            int i69 = iZzf + i68;
                                                            if (!zzma.zzf(bArr, iZzf, i69)) {
                                                                throw zzje.zzd();
                                                            }
                                                            zzjbVar.add(new String(bArr, iZzf, i68, zzjc.zzb));
                                                            iZzf = i69;
                                                        }
                                                    }
                                                }
                                            }
                                            unsafe4 = unsafe5;
                                            iZzi = iZzf;
                                            i41 = i36;
                                            i33 = i35;
                                            i32 = i34;
                                            z11 = z12;
                                            if (iZzi != i33) {
                                                zzgjVar5 = zzgjVar5;
                                                i12 = i12;
                                                iZzm = iZzi;
                                                i11 = i31;
                                                i40 = i32;
                                                unsafe6 = unsafe4;
                                                zzgjVar7 = zzgjVar5;
                                                i43 = i57;
                                                i38 = -1;
                                                i39 = i46;
                                                i42 = i25;
                                                obj4 = obj;
                                            } else {
                                                zzgjVar5 = zzgjVar5;
                                                obj4 = obj;
                                                iZzl = iZzi;
                                                unsafe = unsafe4;
                                                zzgjVar2 = zzgjVar5;
                                                i43 = i57;
                                                i16 = i46;
                                                i42 = i25;
                                                i40 = i32;
                                                i13 = i12;
                                            }
                                        }
                                        unsafe4 = unsafe5;
                                        i41 = i36;
                                        i33 = i35;
                                        i32 = i34;
                                        z11 = z12;
                                        iZzi = i33;
                                        if (iZzi != i33) {
                                            zzgjVar5 = zzgjVar5;
                                            i12 = i12;
                                            iZzm = iZzi;
                                            i11 = i31;
                                            i40 = i32;
                                            unsafe6 = unsafe4;
                                            zzgjVar7 = zzgjVar5;
                                            i43 = i57;
                                            i38 = -1;
                                            i39 = i46;
                                            i42 = i25;
                                            obj4 = obj;
                                        } else {
                                            zzgjVar5 = zzgjVar5;
                                            obj4 = obj;
                                            iZzl = iZzi;
                                            unsafe = unsafe4;
                                            zzgjVar2 = zzgjVar5;
                                            i43 = i57;
                                            i16 = i46;
                                            i42 = i25;
                                            i40 = i32;
                                            i13 = i12;
                                        }
                                        break;
                                    case 27:
                                        i31 = i11;
                                        if (i47 == 2) {
                                            int iZze = zzgk.zze(zzx(iZzs), i50, bArr, i49, i11, zzjbVar, zzgjVar);
                                            unsafe4 = unsafe7;
                                            i41 = i50;
                                            i32 = iZzs;
                                            z11 = true;
                                            iZzi = iZze;
                                            i33 = i49;
                                        } else {
                                            i32 = iZzs;
                                            i33 = i49;
                                            i41 = i50;
                                            z11 = true;
                                            unsafe4 = unsafe7;
                                            iZzi = i33;
                                        }
                                        if (iZzi != i33) {
                                            zzgjVar5 = zzgjVar5;
                                            i12 = i12;
                                            iZzm = iZzi;
                                            i11 = i31;
                                            i40 = i32;
                                            unsafe6 = unsafe4;
                                            zzgjVar7 = zzgjVar5;
                                            i43 = i57;
                                            i38 = -1;
                                            i39 = i46;
                                            i42 = i25;
                                            obj4 = obj;
                                        } else {
                                            zzgjVar5 = zzgjVar5;
                                            obj4 = obj;
                                            iZzl = iZzi;
                                            unsafe = unsafe4;
                                            zzgjVar2 = zzgjVar5;
                                            i43 = i57;
                                            i16 = i46;
                                            i42 = i25;
                                            i40 = i32;
                                            i13 = i12;
                                        }
                                        break;
                                    case 28:
                                        i31 = i11;
                                        if (i47 == 2) {
                                            iZzi = zzgk.zzi(bArr, i49, zzgjVar5);
                                            int i70 = zzgjVar5.zza;
                                            if (i70 < 0) {
                                                throw zzje.zzf();
                                            }
                                            if (i70 > bArr.length - iZzi) {
                                                throw zzje.zzj();
                                            }
                                            if (i70 == 0) {
                                                zzjbVar.add(zzgw.zzb);
                                            } else {
                                                zzjbVar.add(zzgw.zzm(bArr, iZzi, i70));
                                                iZzi += i70;
                                            }
                                            while (iZzi < i31) {
                                                int iZzi10 = zzgk.zzi(bArr, iZzi, zzgjVar5);
                                                if (i50 != zzgjVar5.zza) {
                                                    i32 = iZzs;
                                                    i33 = i49;
                                                    i41 = i50;
                                                    z11 = true;
                                                    unsafe4 = unsafe7;
                                                    if (iZzi != i33) {
                                                        zzgjVar5 = zzgjVar5;
                                                        i12 = i12;
                                                        iZzm = iZzi;
                                                        i11 = i31;
                                                        i40 = i32;
                                                        unsafe6 = unsafe4;
                                                        zzgjVar7 = zzgjVar5;
                                                        i43 = i57;
                                                        i38 = -1;
                                                        i39 = i46;
                                                        i42 = i25;
                                                        obj4 = obj;
                                                    } else {
                                                        zzgjVar5 = zzgjVar5;
                                                        obj4 = obj;
                                                        iZzl = iZzi;
                                                        unsafe = unsafe4;
                                                        zzgjVar2 = zzgjVar5;
                                                        i43 = i57;
                                                        i16 = i46;
                                                        i42 = i25;
                                                        i40 = i32;
                                                        i13 = i12;
                                                    }
                                                    break;
                                                } else {
                                                    iZzi = zzgk.zzi(bArr, iZzi10, zzgjVar5);
                                                    int i71 = zzgjVar5.zza;
                                                    if (i71 < 0) {
                                                        throw zzje.zzf();
                                                    }
                                                    if (i71 > bArr.length - iZzi) {
                                                        throw zzje.zzj();
                                                    }
                                                    if (i71 == 0) {
                                                        zzjbVar.add(zzgw.zzb);
                                                    } else {
                                                        zzjbVar.add(zzgw.zzm(bArr, iZzi, i71));
                                                        iZzi += i71;
                                                    }
                                                }
                                            }
                                            i32 = iZzs;
                                            i33 = i49;
                                            i41 = i50;
                                            z11 = true;
                                            unsafe4 = unsafe7;
                                            if (iZzi != i33) {
                                                zzgjVar5 = zzgjVar5;
                                                i12 = i12;
                                                iZzm = iZzi;
                                                i11 = i31;
                                                i40 = i32;
                                                unsafe6 = unsafe4;
                                                zzgjVar7 = zzgjVar5;
                                                i43 = i57;
                                                i38 = -1;
                                                i39 = i46;
                                                i42 = i25;
                                                obj4 = obj;
                                            } else {
                                                zzgjVar5 = zzgjVar5;
                                                obj4 = obj;
                                                iZzl = iZzi;
                                                unsafe = unsafe4;
                                                zzgjVar2 = zzgjVar5;
                                                i43 = i57;
                                                i16 = i46;
                                                i42 = i25;
                                                i40 = i32;
                                                i13 = i12;
                                            }
                                        }
                                        i32 = iZzs;
                                        i33 = i49;
                                        i41 = i50;
                                        z11 = true;
                                        unsafe4 = unsafe7;
                                        iZzi = i33;
                                        if (iZzi != i33) {
                                            zzgjVar5 = zzgjVar5;
                                            i12 = i12;
                                            iZzm = iZzi;
                                            i11 = i31;
                                            i40 = i32;
                                            unsafe6 = unsafe4;
                                            zzgjVar7 = zzgjVar5;
                                            i43 = i57;
                                            i38 = -1;
                                            i39 = i46;
                                            i42 = i25;
                                            obj4 = obj;
                                        } else {
                                            zzgjVar5 = zzgjVar5;
                                            obj4 = obj;
                                            iZzl = iZzi;
                                            unsafe = unsafe4;
                                            zzgjVar2 = zzgjVar5;
                                            i43 = i57;
                                            i16 = i46;
                                            i42 = i25;
                                            i40 = i32;
                                            i13 = i12;
                                        }
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                    case 44:
                                        i31 = i11;
                                        if (i47 != 2) {
                                            if (i47 == 0) {
                                                iZzk = zzgk.zzk(i50, bArr, i49, i11, zzjbVar, zzgjVar);
                                            }
                                            i32 = iZzs;
                                            i33 = i49;
                                            i41 = i50;
                                            z11 = true;
                                            unsafe4 = unsafe7;
                                            iZzi = i33;
                                            if (iZzi != i33) {
                                                zzgjVar5 = zzgjVar5;
                                                i12 = i12;
                                                iZzm = iZzi;
                                                i11 = i31;
                                                i40 = i32;
                                                unsafe6 = unsafe4;
                                                zzgjVar7 = zzgjVar5;
                                                i43 = i57;
                                                i38 = -1;
                                                i39 = i46;
                                                i42 = i25;
                                                obj4 = obj;
                                            } else {
                                                zzgjVar5 = zzgjVar5;
                                                obj4 = obj;
                                                iZzl = iZzi;
                                                unsafe = unsafe4;
                                                zzgjVar2 = zzgjVar5;
                                                i43 = i57;
                                                i16 = i46;
                                                i42 = i25;
                                                i40 = i32;
                                                i13 = i12;
                                            }
                                        } else {
                                            iZzk = zzgk.zzf(bArr, i49, zzjbVar, zzgjVar5);
                                        }
                                        int i72 = iZzk;
                                        zzkt.zzo(obj, i46, zzjbVar, zzw(iZzs), null, this.zzn);
                                        iZzi = i72;
                                        i32 = iZzs;
                                        i33 = i49;
                                        i41 = i50;
                                        z11 = true;
                                        unsafe4 = unsafe7;
                                        if (iZzi != i33) {
                                            zzgjVar5 = zzgjVar5;
                                            i12 = i12;
                                            iZzm = iZzi;
                                            i11 = i31;
                                            i40 = i32;
                                            unsafe6 = unsafe4;
                                            zzgjVar7 = zzgjVar5;
                                            i43 = i57;
                                            i38 = -1;
                                            i39 = i46;
                                            i42 = i25;
                                            obj4 = obj;
                                        } else {
                                            zzgjVar5 = zzgjVar5;
                                            obj4 = obj;
                                            iZzl = iZzi;
                                            unsafe = unsafe4;
                                            zzgjVar2 = zzgjVar5;
                                            i43 = i57;
                                            i16 = i46;
                                            i42 = i25;
                                            i40 = i32;
                                            i13 = i12;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i31 = i11;
                                        if (i47 != 2) {
                                            if (i47 == 0) {
                                                zziu zziuVar3 = (zziu) zzjbVar;
                                                iZzi = zzgk.zzi(bArr, i49, zzgjVar5);
                                                zziuVar3.zzg(zzhc.zzF(zzgjVar5.zza));
                                                while (iZzi < i31) {
                                                    int iZzi11 = zzgk.zzi(bArr, iZzi, zzgjVar5);
                                                    if (i50 == zzgjVar5.zza) {
                                                        iZzi = zzgk.zzi(bArr, iZzi11, zzgjVar5);
                                                        zziuVar3.zzg(zzhc.zzF(zzgjVar5.zza));
                                                    }
                                                }
                                            }
                                            i32 = iZzs;
                                            i33 = i49;
                                            i41 = i50;
                                            z11 = true;
                                            unsafe4 = unsafe7;
                                            iZzi = i33;
                                            if (iZzi != i33) {
                                                zzgjVar5 = zzgjVar5;
                                                i12 = i12;
                                                iZzm = iZzi;
                                                i11 = i31;
                                                i40 = i32;
                                                unsafe6 = unsafe4;
                                                zzgjVar7 = zzgjVar5;
                                                i43 = i57;
                                                i38 = -1;
                                                i39 = i46;
                                                i42 = i25;
                                                obj4 = obj;
                                            } else {
                                                zzgjVar5 = zzgjVar5;
                                                obj4 = obj;
                                                iZzl = iZzi;
                                                unsafe = unsafe4;
                                                zzgjVar2 = zzgjVar5;
                                                i43 = i57;
                                                i16 = i46;
                                                i42 = i25;
                                                i40 = i32;
                                                i13 = i12;
                                            }
                                        } else {
                                            zziu zziuVar4 = (zziu) zzjbVar;
                                            iZzi = zzgk.zzi(bArr, i49, zzgjVar5);
                                            int i73 = zzgjVar5.zza + iZzi;
                                            while (iZzi < i73) {
                                                iZzi = zzgk.zzi(bArr, iZzi, zzgjVar5);
                                                zziuVar4.zzg(zzhc.zzF(zzgjVar5.zza));
                                            }
                                            if (iZzi != i73) {
                                                throw zzje.zzj();
                                            }
                                        }
                                        i32 = iZzs;
                                        i33 = i49;
                                        i41 = i50;
                                        z11 = true;
                                        unsafe4 = unsafe7;
                                        if (iZzi != i33) {
                                            zzgjVar5 = zzgjVar5;
                                            i12 = i12;
                                            iZzm = iZzi;
                                            i11 = i31;
                                            i40 = i32;
                                            unsafe6 = unsafe4;
                                            zzgjVar7 = zzgjVar5;
                                            i43 = i57;
                                            i38 = -1;
                                            i39 = i46;
                                            i42 = i25;
                                            obj4 = obj;
                                        } else {
                                            zzgjVar5 = zzgjVar5;
                                            obj4 = obj;
                                            iZzl = iZzi;
                                            unsafe = unsafe4;
                                            zzgjVar2 = zzgjVar5;
                                            i43 = i57;
                                            i16 = i46;
                                            i42 = i25;
                                            i40 = i32;
                                            i13 = i12;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i31 = i11;
                                        if (i47 != 2) {
                                            if (i47 == 0) {
                                                zzjt zzjtVar5 = (zzjt) zzjbVar;
                                                iZzi = zzgk.zzl(bArr, i49, zzgjVar5);
                                                zzjtVar5.zzg(zzhc.zzG(zzgjVar5.zzb));
                                                while (iZzi < i31) {
                                                    int iZzi12 = zzgk.zzi(bArr, iZzi, zzgjVar5);
                                                    if (i50 == zzgjVar5.zza) {
                                                        iZzi = zzgk.zzl(bArr, iZzi12, zzgjVar5);
                                                        zzjtVar5.zzg(zzhc.zzG(zzgjVar5.zzb));
                                                    }
                                                }
                                            }
                                            i32 = iZzs;
                                            i33 = i49;
                                            i41 = i50;
                                            z11 = true;
                                            unsafe4 = unsafe7;
                                            iZzi = i33;
                                            if (iZzi != i33) {
                                                zzgjVar5 = zzgjVar5;
                                                i12 = i12;
                                                iZzm = iZzi;
                                                i11 = i31;
                                                i40 = i32;
                                                unsafe6 = unsafe4;
                                                zzgjVar7 = zzgjVar5;
                                                i43 = i57;
                                                i38 = -1;
                                                i39 = i46;
                                                i42 = i25;
                                                obj4 = obj;
                                            } else {
                                                zzgjVar5 = zzgjVar5;
                                                obj4 = obj;
                                                iZzl = iZzi;
                                                unsafe = unsafe4;
                                                zzgjVar2 = zzgjVar5;
                                                i43 = i57;
                                                i16 = i46;
                                                i42 = i25;
                                                i40 = i32;
                                                i13 = i12;
                                            }
                                        } else {
                                            zzjt zzjtVar6 = (zzjt) zzjbVar;
                                            iZzi = zzgk.zzi(bArr, i49, zzgjVar5);
                                            int i74 = zzgjVar5.zza + iZzi;
                                            while (iZzi < i74) {
                                                iZzi = zzgk.zzl(bArr, iZzi, zzgjVar5);
                                                zzjtVar6.zzg(zzhc.zzG(zzgjVar5.zzb));
                                            }
                                            if (iZzi != i74) {
                                                throw zzje.zzj();
                                            }
                                        }
                                        i32 = iZzs;
                                        i33 = i49;
                                        i41 = i50;
                                        z11 = true;
                                        unsafe4 = unsafe7;
                                        if (iZzi != i33) {
                                            zzgjVar5 = zzgjVar5;
                                            i12 = i12;
                                            iZzm = iZzi;
                                            i11 = i31;
                                            i40 = i32;
                                            unsafe6 = unsafe4;
                                            zzgjVar7 = zzgjVar5;
                                            i43 = i57;
                                            i38 = -1;
                                            i39 = i46;
                                            i42 = i25;
                                            obj4 = obj;
                                        } else {
                                            zzgjVar5 = zzgjVar5;
                                            obj4 = obj;
                                            iZzl = iZzi;
                                            unsafe = unsafe4;
                                            zzgjVar2 = zzgjVar5;
                                            i43 = i57;
                                            i16 = i46;
                                            i42 = i25;
                                            i40 = i32;
                                            i13 = i12;
                                        }
                                        break;
                                    default:
                                        if (i47 == 3) {
                                            int i75 = (i50 & (-8)) | 4;
                                            zzkr zzkrVarZzx = zzx(iZzs);
                                            iZzi = zzgk.zzc(zzkrVarZzx, bArr, i49, i11, i75, zzgjVar);
                                            zzjbVar.add(zzgjVar5.zzc);
                                            for (int i76 = i11; iZzi < i76; i76 = i76) {
                                                int iZzi13 = zzgk.zzi(bArr, iZzi, zzgjVar5);
                                                if (i50 != zzgjVar5.zza) {
                                                    i31 = i76;
                                                    i32 = iZzs;
                                                    i33 = i49;
                                                    i41 = i50;
                                                    z11 = true;
                                                    unsafe4 = unsafe7;
                                                    if (iZzi != i33) {
                                                        zzgjVar5 = zzgjVar5;
                                                        i12 = i12;
                                                        iZzm = iZzi;
                                                        i11 = i31;
                                                        i40 = i32;
                                                        unsafe6 = unsafe4;
                                                        zzgjVar7 = zzgjVar5;
                                                        i43 = i57;
                                                        i38 = -1;
                                                        i39 = i46;
                                                        i42 = i25;
                                                        obj4 = obj;
                                                    } else {
                                                        zzgjVar5 = zzgjVar5;
                                                        obj4 = obj;
                                                        iZzl = iZzi;
                                                        unsafe = unsafe4;
                                                        zzgjVar2 = zzgjVar5;
                                                        i43 = i57;
                                                        i16 = i46;
                                                        i42 = i25;
                                                        i40 = i32;
                                                        i13 = i12;
                                                    }
                                                } else {
                                                    iZzi = zzgk.zzc(zzkrVarZzx, bArr, iZzi13, i11, i75, zzgjVar);
                                                    zzjbVar.add(zzgjVar5.zzc);
                                                }
                                                break;
                                            }
                                            i31 = i76;
                                            i32 = iZzs;
                                            i33 = i49;
                                            i41 = i50;
                                            z11 = true;
                                            unsafe4 = unsafe7;
                                            if (iZzi != i33) {
                                                zzgjVar5 = zzgjVar5;
                                                i12 = i12;
                                                iZzm = iZzi;
                                                i11 = i31;
                                                i40 = i32;
                                                unsafe6 = unsafe4;
                                                zzgjVar7 = zzgjVar5;
                                                i43 = i57;
                                                i38 = -1;
                                                i39 = i46;
                                                i42 = i25;
                                                obj4 = obj;
                                            } else {
                                                zzgjVar5 = zzgjVar5;
                                                obj4 = obj;
                                                iZzl = iZzi;
                                                unsafe = unsafe4;
                                                zzgjVar2 = zzgjVar5;
                                                i43 = i57;
                                                i16 = i46;
                                                i42 = i25;
                                                i40 = i32;
                                                i13 = i12;
                                            }
                                        } else {
                                            i31 = i11;
                                            i32 = iZzs;
                                            i33 = i49;
                                            i41 = i50;
                                            z11 = true;
                                            unsafe4 = unsafe7;
                                            iZzi = i33;
                                            if (iZzi != i33) {
                                                zzgjVar5 = zzgjVar5;
                                                i12 = i12;
                                                iZzm = iZzi;
                                                i11 = i31;
                                                i40 = i32;
                                                unsafe6 = unsafe4;
                                                zzgjVar7 = zzgjVar5;
                                                i43 = i57;
                                                i38 = -1;
                                                i39 = i46;
                                                i42 = i25;
                                                obj4 = obj;
                                            } else {
                                                zzgjVar5 = zzgjVar5;
                                                obj4 = obj;
                                                iZzl = iZzi;
                                                unsafe = unsafe4;
                                                zzgjVar2 = zzgjVar5;
                                                i43 = i57;
                                                i16 = i46;
                                                i42 = i25;
                                                i40 = i32;
                                                i13 = i12;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                i26 = i49;
                                i41 = i50;
                                unsafe3 = unsafe7;
                                i27 = iZzs;
                                if (iZzt != 50) {
                                    obj4 = obj;
                                    Unsafe unsafe9 = zzb;
                                    long j12 = iArr[i27 + 2] & 1048575;
                                    switch (iZzt) {
                                        case 51:
                                            unsafe = unsafe3;
                                            i16 = i46;
                                            i28 = i26;
                                            i29 = i27;
                                            zzgjVar2 = zzgjVar5;
                                            if (i47 == 1) {
                                                iZzl3 = i28 + 8;
                                                unsafe9.putObject(obj4, j10, Double.valueOf(Double.longBitsToDouble(zzgk.zzp(bArr, i28))));
                                                unsafe9.putInt(obj4, j12, i16);
                                                iZzm = iZzl3;
                                            } else {
                                                iZzm = i28;
                                            }
                                            if (iZzm != i28) {
                                                i39 = i16;
                                                zzgjVar7 = zzgjVar2;
                                                i43 = i57;
                                                i38 = -1;
                                                i40 = i29;
                                                i42 = i25;
                                                unsafe6 = unsafe;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                iZzl = iZzm;
                                                i43 = i57;
                                                i40 = i29;
                                                i42 = i25;
                                            }
                                            break;
                                        case 52:
                                            unsafe = unsafe3;
                                            i16 = i46;
                                            i28 = i26;
                                            i29 = i27;
                                            zzgjVar2 = zzgjVar5;
                                            if (i47 == 5) {
                                                iZzl3 = i28 + 4;
                                                unsafe9.putObject(obj4, j10, Float.valueOf(Float.intBitsToFloat(zzgk.zzb(bArr, i28))));
                                                unsafe9.putInt(obj4, j12, i16);
                                                iZzm = iZzl3;
                                            } else {
                                                iZzm = i28;
                                            }
                                            if (iZzm != i28) {
                                                i39 = i16;
                                                zzgjVar7 = zzgjVar2;
                                                i43 = i57;
                                                i38 = -1;
                                                i40 = i29;
                                                i42 = i25;
                                                unsafe6 = unsafe;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                iZzl = iZzm;
                                                i43 = i57;
                                                i40 = i29;
                                                i42 = i25;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            unsafe = unsafe3;
                                            i16 = i46;
                                            i28 = i26;
                                            i29 = i27;
                                            zzgjVar2 = zzgjVar5;
                                            if (i47 == 0) {
                                                iZzl3 = zzgk.zzl(bArr, i28, zzgjVar2);
                                                unsafe9.putObject(obj4, j10, Long.valueOf(zzgjVar2.zzb));
                                                unsafe9.putInt(obj4, j12, i16);
                                                iZzm = iZzl3;
                                            } else {
                                                iZzm = i28;
                                            }
                                            if (iZzm != i28) {
                                                i39 = i16;
                                                zzgjVar7 = zzgjVar2;
                                                i43 = i57;
                                                i38 = -1;
                                                i40 = i29;
                                                i42 = i25;
                                                unsafe6 = unsafe;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                iZzl = iZzm;
                                                i43 = i57;
                                                i40 = i29;
                                                i42 = i25;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                        case 62:
                                            unsafe = unsafe3;
                                            i16 = i46;
                                            i28 = i26;
                                            i29 = i27;
                                            zzgjVar2 = zzgjVar5;
                                            if (i47 == 0) {
                                                iZzl3 = zzgk.zzi(bArr, i28, zzgjVar2);
                                                unsafe9.putObject(obj4, j10, Integer.valueOf(zzgjVar2.zza));
                                                unsafe9.putInt(obj4, j12, i16);
                                                iZzm = iZzl3;
                                            } else {
                                                iZzm = i28;
                                            }
                                            if (iZzm != i28) {
                                                i39 = i16;
                                                zzgjVar7 = zzgjVar2;
                                                i43 = i57;
                                                i38 = -1;
                                                i40 = i29;
                                                i42 = i25;
                                                unsafe6 = unsafe;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                iZzl = iZzm;
                                                i43 = i57;
                                                i40 = i29;
                                                i42 = i25;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            unsafe = unsafe3;
                                            i16 = i46;
                                            i28 = i26;
                                            i29 = i27;
                                            zzgjVar2 = zzgjVar5;
                                            if (i47 == 1) {
                                                iZzl3 = i28 + 8;
                                                unsafe9.putObject(obj4, j10, Long.valueOf(zzgk.zzp(bArr, i28)));
                                                unsafe9.putInt(obj4, j12, i16);
                                                iZzm = iZzl3;
                                            } else {
                                                iZzm = i28;
                                            }
                                            if (iZzm != i28) {
                                                i39 = i16;
                                                zzgjVar7 = zzgjVar2;
                                                i43 = i57;
                                                i38 = -1;
                                                i40 = i29;
                                                i42 = i25;
                                                unsafe6 = unsafe;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                iZzl = iZzm;
                                                i43 = i57;
                                                i40 = i29;
                                                i42 = i25;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            unsafe = unsafe3;
                                            i16 = i46;
                                            i28 = i26;
                                            i29 = i27;
                                            zzgjVar2 = zzgjVar5;
                                            if (i47 == 5) {
                                                iZzl4 = i28 + 4;
                                                unsafe9.putObject(obj4, j10, Integer.valueOf(zzgk.zzb(bArr, i28)));
                                                unsafe9.putInt(obj4, j12, i16);
                                                iZzm = iZzl4;
                                                if (iZzm != i28) {
                                                    i39 = i16;
                                                    zzgjVar7 = zzgjVar2;
                                                    i43 = i57;
                                                    i38 = -1;
                                                    i40 = i29;
                                                    i42 = i25;
                                                    unsafe6 = unsafe;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    iZzl = iZzm;
                                                    i43 = i57;
                                                    i40 = i29;
                                                    i42 = i25;
                                                }
                                            }
                                            iZzm = i28;
                                            if (iZzm != i28) {
                                                i39 = i16;
                                                zzgjVar7 = zzgjVar2;
                                                i43 = i57;
                                                i38 = -1;
                                                i40 = i29;
                                                i42 = i25;
                                                unsafe6 = unsafe;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                iZzl = iZzm;
                                                i43 = i57;
                                                i40 = i29;
                                                i42 = i25;
                                            }
                                            break;
                                        case 58:
                                            unsafe = unsafe3;
                                            i16 = i46;
                                            i28 = i26;
                                            i29 = i27;
                                            zzgjVar2 = zzgjVar5;
                                            if (i47 == 0) {
                                                iZzl4 = zzgk.zzl(bArr, i28, zzgjVar2);
                                                unsafe9.putObject(obj4, j10, Boolean.valueOf(zzgjVar2.zzb != 0));
                                                unsafe9.putInt(obj4, j12, i16);
                                                iZzm = iZzl4;
                                                if (iZzm != i28) {
                                                    i39 = i16;
                                                    zzgjVar7 = zzgjVar2;
                                                    i43 = i57;
                                                    i38 = -1;
                                                    i40 = i29;
                                                    i42 = i25;
                                                    unsafe6 = unsafe;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    iZzl = iZzm;
                                                    i43 = i57;
                                                    i40 = i29;
                                                    i42 = i25;
                                                }
                                            }
                                            iZzm = i28;
                                            if (iZzm != i28) {
                                                i39 = i16;
                                                zzgjVar7 = zzgjVar2;
                                                i43 = i57;
                                                i38 = -1;
                                                i40 = i29;
                                                i42 = i25;
                                                unsafe6 = unsafe;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                iZzl = iZzm;
                                                i43 = i57;
                                                i40 = i29;
                                                i42 = i25;
                                            }
                                            break;
                                        case 59:
                                            unsafe = unsafe3;
                                            i16 = i46;
                                            i28 = i26;
                                            i29 = i27;
                                            zzgjVar2 = zzgjVar5;
                                            if (i47 == 2) {
                                                iZzl4 = zzgk.zzi(bArr, i28, zzgjVar2);
                                                int i77 = zzgjVar2.zza;
                                                if (i77 == 0) {
                                                    unsafe9.putObject(obj4, j10, "");
                                                } else {
                                                    int i78 = iZzl4 + i77;
                                                    if ((i48 & 536870912) != 0 && !zzma.zzf(bArr, iZzl4, i78)) {
                                                        throw zzje.zzd();
                                                    }
                                                    unsafe9.putObject(obj4, j10, new String(bArr, iZzl4, i77, zzjc.zzb));
                                                    iZzl4 = i78;
                                                }
                                                unsafe9.putInt(obj4, j12, i16);
                                                iZzm = iZzl4;
                                                if (iZzm != i28) {
                                                    i39 = i16;
                                                    zzgjVar7 = zzgjVar2;
                                                    i43 = i57;
                                                    i38 = -1;
                                                    i40 = i29;
                                                    i42 = i25;
                                                    unsafe6 = unsafe;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    iZzl = iZzm;
                                                    i43 = i57;
                                                    i40 = i29;
                                                    i42 = i25;
                                                }
                                            }
                                            iZzm = i28;
                                            if (iZzm != i28) {
                                                i39 = i16;
                                                zzgjVar7 = zzgjVar2;
                                                i43 = i57;
                                                i38 = -1;
                                                i40 = i29;
                                                i42 = i25;
                                                unsafe6 = unsafe;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                iZzl = iZzm;
                                                i43 = i57;
                                                i40 = i29;
                                                i42 = i25;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                                            unsafe = unsafe3;
                                            zzgjVar6 = zzgjVar5;
                                            i30 = i46;
                                            i28 = i26;
                                            if (i47 == 2) {
                                                Object objZzB = zzB(obj4, i30, i27);
                                                int iZzn2 = zzgk.zzn(objZzB, zzx(i27), bArr, i28, i11, zzgjVar);
                                                zzK(obj4, i30, i27, objZzB);
                                                iZzm = iZzn2;
                                                zzgjVar2 = zzgjVar6;
                                                i16 = i30;
                                                i29 = i27;
                                                if (iZzm != i28) {
                                                    i39 = i16;
                                                    zzgjVar7 = zzgjVar2;
                                                    i43 = i57;
                                                    i38 = -1;
                                                    i40 = i29;
                                                    i42 = i25;
                                                    unsafe6 = unsafe;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    iZzl = iZzm;
                                                    i43 = i57;
                                                    i40 = i29;
                                                    i42 = i25;
                                                }
                                            }
                                            i29 = i27;
                                            zzgjVar2 = zzgjVar6;
                                            i16 = i30;
                                            iZzm = i28;
                                            if (iZzm != i28) {
                                                i39 = i16;
                                                zzgjVar7 = zzgjVar2;
                                                i43 = i57;
                                                i38 = -1;
                                                i40 = i29;
                                                i42 = i25;
                                                unsafe6 = unsafe;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                iZzl = iZzm;
                                                i43 = i57;
                                                i40 = i29;
                                                i42 = i25;
                                            }
                                            break;
                                        case 61:
                                            unsafe = unsafe3;
                                            zzgjVar6 = zzgjVar5;
                                            i30 = i46;
                                            i28 = i26;
                                            if (i47 == 2) {
                                                iZza = zzgk.zza(bArr, i28, zzgjVar6);
                                                unsafe9.putObject(obj4, j10, zzgjVar6.zzc);
                                                unsafe9.putInt(obj4, j12, i30);
                                                iZzm = iZza;
                                                i29 = i27;
                                                zzgjVar2 = zzgjVar6;
                                                i16 = i30;
                                                if (iZzm != i28) {
                                                    i39 = i16;
                                                    zzgjVar7 = zzgjVar2;
                                                    i43 = i57;
                                                    i38 = -1;
                                                    i40 = i29;
                                                    i42 = i25;
                                                    unsafe6 = unsafe;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    iZzl = iZzm;
                                                    i43 = i57;
                                                    i40 = i29;
                                                    i42 = i25;
                                                }
                                            }
                                            i29 = i27;
                                            zzgjVar2 = zzgjVar6;
                                            i16 = i30;
                                            iZzm = i28;
                                            if (iZzm != i28) {
                                                i39 = i16;
                                                zzgjVar7 = zzgjVar2;
                                                i43 = i57;
                                                i38 = -1;
                                                i40 = i29;
                                                i42 = i25;
                                                unsafe6 = unsafe;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                iZzl = iZzm;
                                                i43 = i57;
                                                i40 = i29;
                                                i42 = i25;
                                            }
                                            break;
                                        case 63:
                                            unsafe = unsafe3;
                                            zzgjVar6 = zzgjVar5;
                                            i30 = i46;
                                            i28 = i26;
                                            if (i47 == 0) {
                                                iZza = zzgk.zzi(bArr, i28, zzgjVar6);
                                                int i79 = zzgjVar6.zza;
                                                zzix zzixVarZzw2 = zzw(i27);
                                                if (zzixVarZzw2 == null || zzixVarZzw2.zza(i79)) {
                                                    unsafe9.putObject(obj4, j10, Integer.valueOf(i79));
                                                    unsafe9.putInt(obj4, j12, i30);
                                                } else {
                                                    zzd(obj).zzj(i41, Long.valueOf(i79));
                                                }
                                                iZzm = iZza;
                                                i29 = i27;
                                                zzgjVar2 = zzgjVar6;
                                                i16 = i30;
                                                if (iZzm != i28) {
                                                    i39 = i16;
                                                    zzgjVar7 = zzgjVar2;
                                                    i43 = i57;
                                                    i38 = -1;
                                                    i40 = i29;
                                                    i42 = i25;
                                                    unsafe6 = unsafe;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    iZzl = iZzm;
                                                    i43 = i57;
                                                    i40 = i29;
                                                    i42 = i25;
                                                }
                                            }
                                            i29 = i27;
                                            zzgjVar2 = zzgjVar6;
                                            i16 = i30;
                                            iZzm = i28;
                                            if (iZzm != i28) {
                                                i39 = i16;
                                                zzgjVar7 = zzgjVar2;
                                                i43 = i57;
                                                i38 = -1;
                                                i40 = i29;
                                                i42 = i25;
                                                unsafe6 = unsafe;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                iZzl = iZzm;
                                                i43 = i57;
                                                i40 = i29;
                                                i42 = i25;
                                            }
                                            break;
                                        case 66:
                                            unsafe = unsafe3;
                                            zzgjVar6 = zzgjVar5;
                                            i30 = i46;
                                            i28 = i26;
                                            if (i47 == 0) {
                                                iZza = zzgk.zzi(bArr, i28, zzgjVar6);
                                                unsafe9.putObject(obj4, j10, Integer.valueOf(zzhc.zzF(zzgjVar6.zza)));
                                                unsafe9.putInt(obj4, j12, i30);
                                                iZzm = iZza;
                                                i29 = i27;
                                                zzgjVar2 = zzgjVar6;
                                                i16 = i30;
                                                if (iZzm != i28) {
                                                    i39 = i16;
                                                    zzgjVar7 = zzgjVar2;
                                                    i43 = i57;
                                                    i38 = -1;
                                                    i40 = i29;
                                                    i42 = i25;
                                                    unsafe6 = unsafe;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    iZzl = iZzm;
                                                    i43 = i57;
                                                    i40 = i29;
                                                    i42 = i25;
                                                }
                                            }
                                            i29 = i27;
                                            zzgjVar2 = zzgjVar6;
                                            i16 = i30;
                                            iZzm = i28;
                                            if (iZzm != i28) {
                                                i39 = i16;
                                                zzgjVar7 = zzgjVar2;
                                                i43 = i57;
                                                i38 = -1;
                                                i40 = i29;
                                                i42 = i25;
                                                unsafe6 = unsafe;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                iZzl = iZzm;
                                                i43 = i57;
                                                i40 = i29;
                                                i42 = i25;
                                            }
                                            break;
                                        case 67:
                                            unsafe = unsafe3;
                                            zzgjVar6 = zzgjVar5;
                                            i30 = i46;
                                            i28 = i26;
                                            if (i47 == 0) {
                                                iZza = zzgk.zzl(bArr, i28, zzgjVar6);
                                                unsafe9.putObject(obj4, j10, Long.valueOf(zzhc.zzG(zzgjVar6.zzb)));
                                                unsafe9.putInt(obj4, j12, i30);
                                                iZzm = iZza;
                                                i29 = i27;
                                                zzgjVar2 = zzgjVar6;
                                                i16 = i30;
                                                if (iZzm != i28) {
                                                    i39 = i16;
                                                    zzgjVar7 = zzgjVar2;
                                                    i43 = i57;
                                                    i38 = -1;
                                                    i40 = i29;
                                                    i42 = i25;
                                                    unsafe6 = unsafe;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    iZzl = iZzm;
                                                    i43 = i57;
                                                    i40 = i29;
                                                    i42 = i25;
                                                }
                                            }
                                            i29 = i27;
                                            zzgjVar2 = zzgjVar6;
                                            i16 = i30;
                                            iZzm = i28;
                                            if (iZzm != i28) {
                                                i39 = i16;
                                                zzgjVar7 = zzgjVar2;
                                                i43 = i57;
                                                i38 = -1;
                                                i40 = i29;
                                                i42 = i25;
                                                unsafe6 = unsafe;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                iZzl = iZzm;
                                                i43 = i57;
                                                i40 = i29;
                                                i42 = i25;
                                            }
                                            break;
                                        case 68:
                                            if (i47 == 3) {
                                                i30 = i46;
                                                Object objZzB2 = zzB(obj4, i30, i27);
                                                unsafe = unsafe3;
                                                zzgjVar6 = zzgjVar5;
                                                iZzm = zzgk.zzm(objZzB2, zzx(i27), bArr, i26, i11, (i41 & (-8)) | 4, zzgjVar);
                                                zzK(obj4, i30, i27, objZzB2);
                                                i28 = i26;
                                                i41 = i41;
                                                i29 = i27;
                                                zzgjVar2 = zzgjVar6;
                                                i16 = i30;
                                                if (iZzm != i28) {
                                                    i39 = i16;
                                                    zzgjVar7 = zzgjVar2;
                                                    i43 = i57;
                                                    i38 = -1;
                                                    i40 = i29;
                                                    i42 = i25;
                                                    unsafe6 = unsafe;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    iZzl = iZzm;
                                                    i43 = i57;
                                                    i40 = i29;
                                                    i42 = i25;
                                                }
                                                break;
                                            }
                                        default:
                                            unsafe = unsafe3;
                                            i16 = i46;
                                            i28 = i26;
                                            i29 = i27;
                                            zzgjVar2 = zzgjVar5;
                                            iZzm = i28;
                                            if (iZzm != i28) {
                                                i39 = i16;
                                                zzgjVar7 = zzgjVar2;
                                                i43 = i57;
                                                i38 = -1;
                                                i40 = i29;
                                                i42 = i25;
                                                unsafe6 = unsafe;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                iZzl = iZzm;
                                                i43 = i57;
                                                i40 = i29;
                                                i42 = i25;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i47 == 2) {
                                        Unsafe unsafe10 = zzb;
                                        Object objZzz = zzz(i27);
                                        Object object = unsafe10.getObject(obj, j10);
                                        if (zzjz.zza(object)) {
                                            zzjy zzjyVarZzb = zzjy.zza().zzb();
                                            zzjz.zzb(zzjyVarZzb, object);
                                            unsafe10.putObject(obj, j10, zzjyVarZzb);
                                        }
                                        throw null;
                                    }
                                    obj4 = obj;
                                    i13 = i12;
                                    i40 = i27;
                                    iZzl = i26;
                                    unsafe = unsafe3;
                                    zzgjVar2 = zzgjVar5;
                                    i43 = i57;
                                    i16 = i46;
                                    i42 = i25;
                                }
                            }
                        } else if (i47 == 2) {
                            zzjb zzjbVarZzd2 = (zzjb) unsafe7.getObject(obj4, j10);
                            if (!zzjbVarZzd2.zzc()) {
                                int size2 = zzjbVarZzd2.size();
                                zzjbVarZzd2 = zzjbVarZzd2.zzd(size2 != 0 ? size2 + size2 : 10);
                                unsafe7.putObject(obj4, j10, zzjbVarZzd2);
                            }
                            zzgjVar7 = zzgjVar8;
                            iZzm = zzgk.zze(zzx(iZzs), i50, bArr, i49, i11, zzjbVarZzd2, zzgjVar);
                            i11 = i11;
                            i12 = i12;
                            i41 = i50;
                            i40 = iZzs;
                            i43 = i57;
                            i38 = -1;
                            i39 = i46;
                            i42 = i42;
                            unsafe6 = unsafe7;
                        } else {
                            i25 = i42;
                            i26 = i49;
                            i27 = iZzs;
                            unsafe3 = unsafe7;
                            i41 = i50;
                            zzgjVar5 = zzgjVar8;
                            i13 = i12;
                            i40 = i27;
                            iZzl = i26;
                            unsafe = unsafe3;
                            zzgjVar2 = zzgjVar5;
                            i43 = i57;
                            i16 = i46;
                            i42 = i25;
                        }
                    }
                } else {
                    i15 = i38;
                    unsafe = unsafe6;
                    i13 = i12;
                    i16 = i46;
                    i40 = 0;
                    zzgjVar2 = zzgjVar7;
                    iZzl = i44;
                    i41 = i14;
                }
                if (i41 != i13 || i13 == 0) {
                    if (this.zzh && (zzieVar = zzgjVar2.zzd) != zzie.zza) {
                        zzir zzirVarZza = zzieVar.zza(this.zzg, i16);
                        if (zzirVarZza != null) {
                            zzgjVar3 = zzgjVar2;
                            zzip zzipVar = (zzip) obj4;
                            zzipVar.zzi();
                            zzij zzijVar = zzipVar.zzb;
                            zzmb zzmbVar = zzirVarZza.zzb.zzb;
                            if (zzmbVar == zzmb.zzn) {
                                zzgk.zzi(bArr, iZzl, zzgjVar3);
                                throw null;
                            }
                            switch (zzmbVar.ordinal()) {
                                case 0:
                                    i17 = iZzl + 8;
                                    objValueOf = Double.valueOf(Double.longBitsToDouble(zzgk.zzp(bArr, iZzl)));
                                    iZzl = i17;
                                    obj2 = objValueOf;
                                    zzijVar.zzi(zzirVarZza.zzb, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 1:
                                    i17 = iZzl + 4;
                                    objValueOf = Float.valueOf(Float.intBitsToFloat(zzgk.zzb(bArr, iZzl)));
                                    iZzl = i17;
                                    obj2 = objValueOf;
                                    zzijVar.zzi(zzirVarZza.zzb, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 2:
                                case 3:
                                    iZzl = zzgk.zzl(bArr, iZzl, zzgjVar3);
                                    objValueOf = Long.valueOf(zzgjVar3.zzb);
                                    obj2 = objValueOf;
                                    zzijVar.zzi(zzirVarZza.zzb, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 4:
                                case 12:
                                    iZzl = zzgk.zzi(bArr, iZzl, zzgjVar3);
                                    objValueOf = Integer.valueOf(zzgjVar3.zza);
                                    obj2 = objValueOf;
                                    zzijVar.zzi(zzirVarZza.zzb, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 5:
                                case 15:
                                    i17 = iZzl + 8;
                                    objValueOf = Long.valueOf(zzgk.zzp(bArr, iZzl));
                                    iZzl = i17;
                                    obj2 = objValueOf;
                                    zzijVar.zzi(zzirVarZza.zzb, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 6:
                                case Code.UNAVAILABLE /* 14 */:
                                    i17 = iZzl + 4;
                                    objValueOf = Integer.valueOf(zzgk.zzb(bArr, iZzl));
                                    iZzl = i17;
                                    obj2 = objValueOf;
                                    zzijVar.zzi(zzirVarZza.zzb, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 7:
                                    iZzl = zzgk.zzl(bArr, iZzl, zzgjVar3);
                                    objValueOf = Boolean.valueOf(zzgjVar3.zzb != 0);
                                    obj2 = objValueOf;
                                    zzijVar.zzi(zzirVarZza.zzb, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 8:
                                    iZzl = zzgk.zzg(bArr, iZzl, zzgjVar3);
                                    obj2 = zzgjVar3.zzc;
                                    zzijVar.zzi(zzirVarZza.zzb, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 9:
                                    int i80 = zzkn.zza;
                                    throw null;
                                case 10:
                                    int i81 = zzkn.zza;
                                    throw null;
                                case 11:
                                    iZzl = zzgk.zza(bArr, iZzl, zzgjVar3);
                                    obj2 = zzgjVar3.zzc;
                                    zzijVar.zzi(zzirVarZza.zzb, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 13:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case Code.UNAUTHENTICATED /* 16 */:
                                    iZzl = zzgk.zzi(bArr, iZzl, zzgjVar3);
                                    objValueOf = Integer.valueOf(zzhc.zzF(zzgjVar3.zza));
                                    obj2 = objValueOf;
                                    zzijVar.zzi(zzirVarZza.zzb, obj2);
                                    iZzh = iZzl;
                                    break;
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    iZzl = zzgk.zzl(bArr, iZzl, zzgjVar3);
                                    objValueOf = Long.valueOf(zzhc.zzG(zzgjVar3.zzb));
                                    obj2 = objValueOf;
                                    zzijVar.zzi(zzirVarZza.zzb, obj2);
                                    iZzh = iZzl;
                                    break;
                                default:
                                    obj2 = objValueOf;
                                    zzijVar.zzi(zzirVarZza.zzb, obj2);
                                    iZzh = iZzl;
                                    break;
                            }
                        } else {
                            zzgjVar3 = zzgjVar2;
                            iZzh = zzgk.zzh(i41, bArr, iZzl, i11, zzd(obj), zzgjVar);
                        }
                    } else {
                        zzgjVar3 = zzgjVar2;
                        iZzh = zzgk.zzh(i41, bArr, iZzl, i11, zzd(obj), zzgjVar);
                    }
                    i12 = i13;
                    zzgjVar7 = zzgjVar3;
                    i38 = i15;
                    unsafe6 = unsafe;
                    i39 = i16;
                    iZzm = iZzh;
                } else {
                    iZzm = iZzl;
                }
            } else {
                unsafe = unsafe6;
                i13 = i12;
            }
        }
        if (i43 != 1048575) {
            unsafe.putInt(obj4, i43, i42);
        }
        for (int i82 = this.zzk; i82 < this.zzl; i82++) {
            zzy(obj, this.zzj[i82], null, this.zzn, obj);
        }
        if (i13 == 0) {
            if (iZzm != i11) {
                throw zzje.zzg();
            }
        } else if (iZzm > i11 || i41 != i13) {
            throw zzje.zzg();
        }
        return iZzm;
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final Object zze() {
        return ((zzit) this.zzg).zzs();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzit) {
                zzit zzitVar = (zzit) obj;
                zzitVar.zzE(Integer.MAX_VALUE);
                zzitVar.zza = 0;
                zzitVar.zzC();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iZzu = zzu(i10);
                int i11 = 1048575 & iZzu;
                int iZzt = zzt(iZzu);
                long j10 = i11;
                if (iZzt != 9) {
                    if (iZzt != 60 && iZzt != 68) {
                        switch (iZzt) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zzN(obj, i10)) {
                                    zzx(i10).zzf(zzb.getObject(obj, j10));
                                }
                                break;
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            case 19:
                            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzm.zzb(obj, j10);
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzjy) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (zzR(obj, this.zzc[i10], i10)) {
                        zzx(i10).zzf(zzb.getObject(obj, j10));
                    }
                } else if (zzN(obj, i10)) {
                    zzx(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zzf(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzu = zzu(i10);
            int i11 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i10)) {
                        zzlv.zzo(obj, j10, zzlv.zza(obj2, j10));
                        zzH(obj, i10);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i10)) {
                        zzlv.zzp(obj, j10, zzlv.zzb(obj2, j10));
                        zzH(obj, i10);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i10)) {
                        zzlv.zzr(obj, j10, zzlv.zzd(obj2, j10));
                        zzH(obj, i10);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i10)) {
                        zzlv.zzr(obj, j10, zzlv.zzd(obj2, j10));
                        zzH(obj, i10);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j10, zzlv.zzc(obj2, j10));
                        zzH(obj, i10);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i10)) {
                        zzlv.zzr(obj, j10, zzlv.zzd(obj2, j10));
                        zzH(obj, i10);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j10, zzlv.zzc(obj2, j10));
                        zzH(obj, i10);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i10)) {
                        zzlv.zzm(obj, j10, zzlv.zzw(obj2, j10));
                        zzH(obj, i10);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i10)) {
                        zzlv.zzs(obj, j10, zzlv.zzf(obj2, j10));
                        zzH(obj, i10);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (zzN(obj2, i10)) {
                        zzlv.zzs(obj, j10, zzlv.zzf(obj2, j10));
                        zzH(obj, i10);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j10, zzlv.zzc(obj2, j10));
                        zzH(obj, i10);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j10, zzlv.zzc(obj2, j10));
                        zzH(obj, i10);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j10, zzlv.zzc(obj2, j10));
                        zzH(obj, i10);
                    }
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    if (zzN(obj2, i10)) {
                        zzlv.zzr(obj, j10, zzlv.zzd(obj2, j10));
                        zzH(obj, i10);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j10, zzlv.zzc(obj2, j10));
                        zzH(obj, i10);
                    }
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    if (zzN(obj2, i10)) {
                        zzlv.zzr(obj, j10, zzlv.zzd(obj2, j10));
                        zzH(obj, i10);
                    }
                    break;
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    zzE(obj, obj2, i10);
                    break;
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzc(obj, obj2, j10);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    int i13 = zzkt.zza;
                    zzlv.zzs(obj, j10, zzjz.zzb(zzlv.zzf(obj, j10), zzlv.zzf(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i12, i10)) {
                        zzlv.zzs(obj, j10, zzlv.zzf(obj2, j10));
                        zzI(obj, i12, i10);
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                    zzF(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i12, i10)) {
                        zzlv.zzs(obj, j10, zzlv.zzf(obj2, j10));
                        zzI(obj, i12, i10);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i10);
                    break;
            }
        }
        zzkt.zzr(this.zzn, obj, obj2);
        if (this.zzh) {
            zzkt.zzq(this.zzo, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0621 A[Catch: all -> 0x00fc, TryCatch #7 {all -> 0x00fc, blocks: (B:57:0x00da, B:164:0x061c, B:166:0x0621, B:167:0x0626, B:108:0x02df, B:110:0x02e8, B:111:0x02f8, B:112:0x0308, B:113:0x0318, B:114:0x0328, B:115:0x0338, B:116:0x0348, B:117:0x0358, B:118:0x0369, B:119:0x037a, B:120:0x038b, B:121:0x039c, B:122:0x03ad, B:123:0x03be, B:124:0x03da, B:125:0x03eb, B:126:0x03fc, B:127:0x0411, B:129:0x041a, B:130:0x042c, B:131:0x043e, B:132:0x044f, B:133:0x0460, B:134:0x0471, B:135:0x0482, B:136:0x0493, B:137:0x04a4, B:138:0x04b5, B:139:0x04c6, B:140:0x04db, B:141:0x04ed, B:142:0x04ff, B:143:0x0511, B:144:0x0523, B:146:0x0530, B:149:0x0537, B:150:0x053d, B:151:0x0548, B:152:0x055a, B:153:0x056c, B:154:0x0581, B:155:0x058c, B:156:0x059e, B:157:0x05b0, B:158:0x05c2, B:159:0x05d4, B:160:0x05e6, B:161:0x05f8, B:162:0x060a), top: B:187:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0632 A[LOOP:2: B:170:0x062e->B:172:0x0632, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x0646  */
    /* JADX WARN: Code duplicated, block: B:179:0x0651 A[LOOP:3: B:177:0x064d->B:179:0x0651, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:181:0x0665  */
    /* JADX WARN: Code duplicated, block: B:208:0x062c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzh(Object obj, zzkq zzkqVar, zzie zzieVar) throws Throwable {
        zzll zzllVar;
        int i10;
        Object obj2;
        zzie zzieVar2;
        zzif zzifVar;
        int i11;
        Object obj3 = obj;
        zzie zzieVar3 = zzieVar;
        zzieVar.getClass();
        zzD(obj);
        zzll zzllVar2 = this.zzn;
        zzif zzifVar2 = this.zzo;
        zzij zzijVar = null;
        Object objZzc = null;
        while (true) {
            try {
                int iZzc = zzkqVar.zzc();
                int iZzq = zzq(iZzc);
                if (iZzq >= 0) {
                    obj2 = objZzc;
                    zzllVar = zzllVar2;
                    obj3 = obj3;
                    try {
                        int iZzu = zzu(iZzq);
                        try {
                            switch (zzt(iZzu)) {
                                case 0:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzlv.zzo(obj3, iZzu & 1048575, zzkqVar.zza());
                                    zzH(obj3, iZzq);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 1:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzlv.zzp(obj3, iZzu & 1048575, zzkqVar.zzb());
                                    zzH(obj3, iZzq);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 2:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzlv.zzr(obj3, iZzu & 1048575, zzkqVar.zzl());
                                    zzH(obj3, iZzq);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 3:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzlv.zzr(obj3, iZzu & 1048575, zzkqVar.zzo());
                                    zzH(obj3, iZzq);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 4:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzlv.zzq(obj3, iZzu & 1048575, zzkqVar.zzg());
                                    zzH(obj3, iZzq);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 5:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzlv.zzr(obj3, iZzu & 1048575, zzkqVar.zzk());
                                    zzH(obj3, iZzq);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 6:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzlv.zzq(obj3, iZzu & 1048575, zzkqVar.zzf());
                                    zzH(obj3, iZzq);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 7:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzlv.zzm(obj3, iZzu & 1048575, zzkqVar.zzN());
                                    zzH(obj3, iZzq);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 8:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzG(obj3, iZzu, zzkqVar);
                                    zzH(obj3, iZzq);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 9:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzke zzkeVar = (zzke) zzA(obj3, iZzq);
                                    zzkqVar.zzu(zzkeVar, zzx(iZzq), zzieVar2);
                                    zzJ(obj3, iZzq, zzkeVar);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 10:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzlv.zzs(obj3, iZzu & 1048575, zzkqVar.zzp());
                                    zzH(obj3, iZzq);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 11:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzlv.zzq(obj3, iZzu & 1048575, zzkqVar.zzj());
                                    zzH(obj3, iZzq);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 12:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    int iZze = zzkqVar.zze();
                                    zzix zzixVarZzw = zzw(iZzq);
                                    if (zzixVarZzw == null || zzixVarZzw.zza(iZze)) {
                                        zzlv.zzq(obj3, iZzu & 1048575, iZze);
                                        zzH(obj3, iZzq);
                                    } else {
                                        objZzc = zzkt.zzp(obj3, iZzc, iZze, objZzc, zzllVar);
                                    }
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 13:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzlv.zzq(obj3, iZzu & 1048575, zzkqVar.zzh());
                                    zzH(obj3, iZzq);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case Code.UNAVAILABLE /* 14 */:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzlv.zzr(obj3, iZzu & 1048575, zzkqVar.zzm());
                                    zzH(obj3, iZzq);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 15:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzlv.zzq(obj3, iZzu & 1048575, zzkqVar.zzi());
                                    zzH(obj3, iZzq);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case Code.UNAUTHENTICATED /* 16 */:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzlv.zzr(obj3, iZzu & 1048575, zzkqVar.zzn());
                                    zzH(obj3, iZzq);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzke zzkeVar2 = (zzke) zzA(obj3, iZzq);
                                    zzkqVar.zzt(zzkeVar2, zzx(iZzq), zzieVar2);
                                    zzJ(obj3, iZzq, zzkeVar2);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzx(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 19:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzB(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzE(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 21:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzM(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 22:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzD(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 23:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzA(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 24:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzz(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzv(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 26:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    if (zzM(iZzu)) {
                                        ((zzhd) zzkqVar).zzK(this.zzm.zza(obj3, iZzu & 1048575), true);
                                    } else {
                                        ((zzhd) zzkqVar).zzK(this.zzm.zza(obj3, iZzu & 1048575), false);
                                    }
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 27:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzF(this.zzm.zza(obj3, iZzu & 1048575), zzx(iZzq), zzieVar2);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 28:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzw(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 29:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzL(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    List listZza = this.zzm.zza(obj3, iZzu & 1048575);
                                    zzkqVar.zzy(listZza);
                                    objZzc = zzkt.zzo(obj, iZzc, listZza, zzw(iZzq), obj2, zzllVar);
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 31:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzG(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 32:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzH(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 33:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzI(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 34:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzJ(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 35:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzx(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 36:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzB(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzE(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 38:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzM(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 39:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzD(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 40:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzA(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 41:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzz(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 42:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzv(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 43:
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzkqVar.zzL(this.zzm.zza(obj3, iZzu & 1048575));
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 44:
                                    List listZza2 = this.zzm.zza(obj3, iZzu & 1048575);
                                    zzkqVar.zzy(listZza2);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    try {
                                        objZzc = zzkt.zzo(obj, iZzc, listZza2, zzw(iZzq), objZzc, zzllVar);
                                    } catch (zzjd unused) {
                                        zzllVar.zzs(zzkqVar);
                                        if (objZzc == null) {
                                            objZzc = zzllVar.zzc(obj3);
                                        }
                                        if (!zzllVar.zzr(objZzc, zzkqVar)) {
                                            for (i11 = this.zzk; i11 < this.zzl; i11++) {
                                                zzy(obj, this.zzj[i11], objZzc, zzllVar, obj);
                                            }
                                            if (objZzc != null) {
                                                zzllVar.zzn(obj3, objZzc);
                                            }
                                        }
                                    }
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    zzkqVar.zzG(this.zzm.zza(obj3, iZzu & 1048575));
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 46:
                                    zzkqVar.zzH(this.zzm.zza(obj3, iZzu & 1048575));
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 47:
                                    zzkqVar.zzI(this.zzm.zza(obj3, iZzu & 1048575));
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 48:
                                    zzkqVar.zzJ(this.zzm.zza(obj3, iZzu & 1048575));
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 49:
                                    zzkqVar.zzC(this.zzm.zza(obj3, iZzu & 1048575), zzx(iZzq), zzieVar3);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    Object objZzz = zzz(iZzq);
                                    long jZzu = zzu(iZzq) & 1048575;
                                    Object objZzf = zzlv.zzf(obj3, jZzu);
                                    if (objZzf == null) {
                                        objZzf = zzjy.zza().zzb();
                                        zzlv.zzs(obj3, jZzu, objZzf);
                                    } else if (zzjz.zza(objZzf)) {
                                        Object objZzb = zzjy.zza().zzb();
                                        zzjz.zzb(objZzb, objZzf);
                                        zzlv.zzs(obj3, jZzu, objZzb);
                                        objZzf = objZzb;
                                    }
                                    throw null;
                                case 51:
                                    zzlv.zzs(obj3, iZzu & 1048575, Double.valueOf(zzkqVar.zza()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 52:
                                    zzlv.zzs(obj3, iZzu & 1048575, Float.valueOf(zzkqVar.zzb()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 53:
                                    zzlv.zzs(obj3, iZzu & 1048575, Long.valueOf(zzkqVar.zzl()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 54:
                                    zzlv.zzs(obj3, iZzu & 1048575, Long.valueOf(zzkqVar.zzo()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                    zzlv.zzs(obj3, iZzu & 1048575, Integer.valueOf(zzkqVar.zzg()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 56:
                                    zzlv.zzs(obj3, iZzu & 1048575, Long.valueOf(zzkqVar.zzk()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 57:
                                    zzlv.zzs(obj3, iZzu & 1048575, Integer.valueOf(zzkqVar.zzf()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 58:
                                    zzlv.zzs(obj3, iZzu & 1048575, Boolean.valueOf(zzkqVar.zzN()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 59:
                                    zzG(obj3, iZzu, zzkqVar);
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                                    zzke zzkeVar3 = (zzke) zzB(obj3, iZzc, iZzq);
                                    zzkqVar.zzu(zzkeVar3, zzx(iZzq), zzieVar3);
                                    zzK(obj3, iZzc, iZzq, zzkeVar3);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 61:
                                    zzlv.zzs(obj3, iZzu & 1048575, zzkqVar.zzp());
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 62:
                                    zzlv.zzs(obj3, iZzu & 1048575, Integer.valueOf(zzkqVar.zzj()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 63:
                                    int iZze2 = zzkqVar.zze();
                                    zzix zzixVarZzw2 = zzw(iZzq);
                                    if (zzixVarZzw2 != null && !zzixVarZzw2.zza(iZze2)) {
                                        objZzc = zzkt.zzp(obj3, iZzc, iZze2, obj2, zzllVar);
                                        zzllVar2 = zzllVar;
                                    }
                                    zzlv.zzs(obj3, iZzu & 1048575, Integer.valueOf(iZze2));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 64:
                                    zzlv.zzs(obj3, iZzu & 1048575, Integer.valueOf(zzkqVar.zzh()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 65:
                                    zzlv.zzs(obj3, iZzu & 1048575, Long.valueOf(zzkqVar.zzm()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 66:
                                    zzlv.zzs(obj3, iZzu & 1048575, Integer.valueOf(zzkqVar.zzi()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 67:
                                    zzlv.zzs(obj3, iZzu & 1048575, Long.valueOf(zzkqVar.zzn()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                case 68:
                                    zzke zzkeVar4 = (zzke) zzB(obj3, iZzc, iZzq);
                                    zzkqVar.zzt(zzkeVar4, zzx(iZzq), zzieVar3);
                                    zzK(obj3, iZzc, iZzq, zzkeVar4);
                                    objZzc = obj2;
                                    zzifVar = zzifVar2;
                                    zzieVar2 = zzieVar3;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                    break;
                                default:
                                    objZzc = obj2 == null ? zzllVar.zzc(obj3) : obj2;
                                    try {
                                        try {
                                            if (!zzllVar.zzr(objZzc, zzkqVar)) {
                                                for (int i12 = this.zzk; i12 < this.zzl; i12++) {
                                                    zzy(obj, this.zzj[i12], objZzc, zzllVar, obj);
                                                }
                                            }
                                        } catch (zzjd unused2) {
                                            zzifVar = zzifVar2;
                                            zzieVar2 = zzieVar3;
                                            zzllVar.zzs(zzkqVar);
                                            if (objZzc == null) {
                                                objZzc = zzllVar.zzc(obj3);
                                            }
                                            if (!zzllVar.zzr(objZzc, zzkqVar)) {
                                                while (i11 < this.zzl) {
                                                    zzy(obj, this.zzj[i11], objZzc, zzllVar, obj);
                                                }
                                            }
                                            zzifVar2 = zzifVar;
                                            zzieVar3 = zzieVar2;
                                            zzllVar2 = zzllVar;
                                        }
                                        zzllVar2 = zzllVar;
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                    break;
                            }
                        } catch (zzjd unused3) {
                            objZzc = obj2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        objZzc = obj2;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    for (int i13 = this.zzk; i13 < this.zzl; i13++) {
                        zzy(obj, this.zzj[i13], objZzc, zzllVar2, obj);
                    }
                    zzllVar = zzllVar2;
                    obj3 = obj3;
                } else {
                    try {
                        Object objZzd = !this.zzh ? null : zzifVar2.zzd(zzieVar3, this.zzg, iZzc);
                        if (objZzd != null) {
                            zzij zzijVarZzc = zzijVar == null ? zzifVar2.zzc(obj3) : zzijVar;
                            obj2 = objZzc;
                            zzll zzllVar3 = zzllVar2;
                            Object obj4 = obj3;
                            try {
                                zzifVar2.zze(obj, zzkqVar, objZzd, zzieVar, zzijVarZzc, obj2, zzllVar3);
                                zzijVar = zzijVarZzc;
                                obj3 = obj4;
                                zzllVar2 = zzllVar3;
                                objZzc = obj2;
                            } catch (Throwable th3) {
                                th = th3;
                                obj3 = obj4;
                                zzllVar = zzllVar3;
                                objZzc = obj2;
                                for (i10 = this.zzk; i10 < this.zzl; i10++) {
                                    zzy(obj, this.zzj[i10], objZzc, zzllVar, obj);
                                }
                                if (objZzc != null) {
                                    zzllVar.zzn(obj3, objZzc);
                                }
                                throw th;
                            }
                        } else {
                            Object obj5 = objZzc;
                            zzll zzllVar4 = zzllVar2;
                            Object obj6 = obj3;
                            zzllVar4.zzs(zzkqVar);
                            objZzc = obj5 == null ? zzllVar4.zzc(obj6) : obj5;
                            try {
                                if (zzllVar4.zzr(objZzc, zzkqVar)) {
                                    obj3 = obj6;
                                    zzllVar2 = zzllVar4;
                                } else {
                                    int i14 = this.zzk;
                                    while (i14 < this.zzl) {
                                        zzll zzllVar5 = zzllVar4;
                                        zzy(obj, this.zzj[i14], objZzc, zzllVar5, obj);
                                        i14++;
                                        obj6 = obj6;
                                        zzllVar4 = zzllVar5;
                                    }
                                    obj3 = obj6;
                                    zzllVar = zzllVar4;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj3 = obj6;
                                zzllVar = zzllVar4;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        zzllVar = zzllVar2;
                        obj3 = obj3;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
            while (i10 < this.zzl) {
                zzy(obj, this.zzj[i10], objZzc, zzllVar, obj);
            }
            if (objZzc != null) {
                zzllVar.zzn(obj3, objZzc);
            }
            throw th;
        }
        if (objZzc != null) {
            zzllVar.zzn(obj3, objZzc);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgj zzgjVar) throws zzje {
        zzc(obj, bArr, i10, i11, 0, zzgjVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzj(Object obj, zzmd zzmdVar) {
        Map.Entry entry;
        Iterator it;
        int i10;
        Map.Entry entry2;
        int i11;
        boolean z10;
        boolean z11;
        if (this.zzh) {
            zzij zzijVarZzb = this.zzo.zzb(obj);
            if (zzijVarZzb.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzijVarZzb.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < iArr.length) {
            int iZzu = zzu(i14);
            int[] iArr2 = this.zzc;
            int iZzt = zzt(iZzu);
            int i15 = iArr2[i14];
            if (iZzt <= 17) {
                int i16 = iArr2[i14 + 2];
                int i17 = i16 & 1048575;
                if (i17 != i12) {
                    i13 = i17 == 1048575 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                } else {
                    entry = entry;
                }
                i11 = 1 << (i16 >>> 20);
                i10 = i13;
                entry2 = entry;
            } else {
                i10 = i13;
                entry2 = entry;
                i11 = 0;
            }
            int i18 = i12;
            while (entry2 != null && this.zzo.zza(entry2) <= i15) {
                this.zzo.zzi(zzmdVar, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j10 = iZzu & 1048575;
            switch (iZzt) {
                case 0:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzf(i15, zzlv.zza(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 1:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzo(i15, zzlv.zzb(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 2:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzt(i15, unsafe.getLong(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 3:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzK(i15, unsafe.getLong(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 4:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzr(i15, unsafe.getInt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 5:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzm(i15, unsafe.getLong(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 6:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzk(i15, unsafe.getInt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 7:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzb(i15, zzlv.zzw(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 8:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzT(i15, unsafe.getObject(obj, j10), zzmdVar);
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 9:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzv(i15, unsafe.getObject(obj, j10), zzx(i14));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 10:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzd(i15, (zzgw) unsafe.getObject(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 11:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzI(i15, unsafe.getInt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 12:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzi(i15, unsafe.getInt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 13:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzx(i15, unsafe.getInt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzz(i15, unsafe.getLong(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 15:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzB(i15, unsafe.getInt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzD(i15, unsafe.getLong(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i14, i18, i10, i11)) {
                        zzmdVar.zzq(i15, unsafe.getObject(obj, j10), zzx(i14));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    z10 = false;
                    zzkt.zzu(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 19:
                    z10 = false;
                    zzkt.zzy(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                    z10 = false;
                    zzkt.zzA(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 21:
                    z10 = false;
                    zzkt.zzG(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 22:
                    z10 = false;
                    zzkt.zzz(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 23:
                    z10 = false;
                    zzkt.zzx(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 24:
                    z10 = false;
                    zzkt.zzw(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                    z10 = false;
                    zzkt.zzt(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 26:
                    int i19 = this.zzc[i14];
                    List list = (List) unsafe.getObject(obj, j10);
                    int i20 = zzkt.zza;
                    if (list != null && !list.isEmpty()) {
                        zzmdVar.zzH(i19, list);
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 27:
                    int i21 = this.zzc[i14];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    zzkr zzkrVarZzx = zzx(i14);
                    int i22 = zzkt.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i23 = 0; i23 < list2.size(); i23++) {
                            ((zzhi) zzmdVar).zzv(i21, list2.get(i23), zzkrVarZzx);
                        }
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 28:
                    int i24 = this.zzc[i14];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i25 = zzkt.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzmdVar.zze(i24, list3);
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 29:
                    z11 = false;
                    zzkt.zzF(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                    z11 = false;
                    zzkt.zzv(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 31:
                    z11 = false;
                    zzkt.zzB(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 32:
                    z11 = false;
                    zzkt.zzC(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 33:
                    z11 = false;
                    zzkt.zzD(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 34:
                    z11 = false;
                    zzkt.zzE(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 35:
                    zzkt.zzu(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 36:
                    zzkt.zzy(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                    zzkt.zzA(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 38:
                    zzkt.zzG(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 39:
                    zzkt.zzz(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 40:
                    zzkt.zzx(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 41:
                    zzkt.zzw(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 42:
                    zzkt.zzt(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 43:
                    zzkt.zzF(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 44:
                    zzkt.zzv(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    zzkt.zzB(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 46:
                    zzkt.zzC(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 47:
                    zzkt.zzD(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 48:
                    zzkt.zzE(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzmdVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 49:
                    int i26 = this.zzc[i14];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    zzkr zzkrVarZzx2 = zzx(i14);
                    int i27 = zzkt.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i28 = 0; i28 < list4.size(); i28++) {
                            ((zzhi) zzmdVar).zzq(i26, list4.get(i28), zzkrVarZzx2);
                        }
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    if (unsafe.getObject(obj, j10) != null) {
                        throw null;
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 51:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzf(i15, zzn(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 52:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzo(i15, zzo(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 53:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzt(i15, zzv(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 54:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzK(i15, zzv(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzr(i15, zzp(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 56:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzm(i15, zzv(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 57:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzk(i15, zzp(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 58:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzb(i15, zzS(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 59:
                    if (zzR(obj, i15, i14)) {
                        zzT(i15, unsafe.getObject(obj, j10), zzmdVar);
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzv(i15, unsafe.getObject(obj, j10), zzx(i14));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 61:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzd(i15, (zzgw) unsafe.getObject(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 62:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzI(i15, zzp(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 63:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzi(i15, zzp(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 64:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzx(i15, zzp(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 65:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzz(i15, zzv(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 66:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzB(i15, zzp(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 67:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzD(i15, zzv(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 68:
                    if (zzR(obj, i15, i14)) {
                        zzmdVar.zzq(i15, unsafe.getObject(obj, j10), zzx(i14));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                default:
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
            }
        }
        Iterator it2 = it;
        while (entry != null) {
            this.zzo.zzi(zzmdVar, entry);
            entry = it2.hasNext() ? (Map.Entry) it2.next() : null;
        }
        zzll zzllVar = this.zzn;
        zzllVar.zzq(zzllVar.zzd(obj), zzmdVar);
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzH;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzu = zzu(i10);
            long j10 = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i10) || Double.doubleToLongBits(zzlv.zza(obj, j10)) != Double.doubleToLongBits(zzlv.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i10) || Float.floatToIntBits(zzlv.zzb(obj, j10)) != Float.floatToIntBits(zzlv.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i10) || zzlv.zzd(obj, j10) != zzlv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i10) || zzlv.zzd(obj, j10) != zzlv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i10) || zzlv.zzc(obj, j10) != zzlv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i10) || zzlv.zzd(obj, j10) != zzlv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i10) || zzlv.zzc(obj, j10) != zzlv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i10) || zzlv.zzw(obj, j10) != zzlv.zzw(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i10) || !zzkt.zzH(zzlv.zzf(obj, j10), zzlv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i10) || !zzkt.zzH(zzlv.zzf(obj, j10), zzlv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i10) || !zzkt.zzH(zzlv.zzf(obj, j10), zzlv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i10) || zzlv.zzc(obj, j10) != zzlv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i10) || zzlv.zzc(obj, j10) != zzlv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i10) || zzlv.zzc(obj, j10) != zzlv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    if (!zzL(obj, obj2, i10) || zzlv.zzd(obj, j10) != zzlv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i10) || zzlv.zzc(obj, j10) != zzlv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    if (!zzL(obj, obj2, i10) || zzlv.zzd(obj, j10) != zzlv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (!zzL(obj, obj2, i10) || !zzkt.zzH(zzlv.zzf(obj, j10), zzlv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzH = zzkt.zzH(zzlv.zzf(obj, j10), zzlv.zzf(obj2, j10));
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    zZzH = zzkt.zzH(zzlv.zzf(obj, j10), zzlv.zzf(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzr = zzr(i10) & 1048575;
                    if (zzlv.zzc(obj, jZzr) != zzlv.zzc(obj2, jZzr) || !zzkt.zzH(zzlv.zzf(obj, j10), zzlv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzH) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0 A[LOOP:1: B:45:0x00af->B:50:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzkr
    public final boolean zzl(Object obj) {
        int i10;
        int i11;
        List list;
        zzkr zzkrVarZzx;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i16 = iArr[i14];
            int i17 = iArr2[i16];
            int iZzu = zzu(i16);
            int i18 = this.zzc[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = zzb.getInt(obj, i19);
                }
                i11 = i13;
                i10 = i19;
            } else {
                i10 = i15;
                i11 = i13;
            }
            if ((268435456 & iZzu) != 0 && !zzO(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzO(obj, i16, i10, i11, i20) && !zzP(obj, iZzu, zzx(i16))) {
                    return false;
                }
            } else if (iZzt == 27) {
                list = (List) zzlv.zzf(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzkrVarZzx = zzx(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzkrVarZzx.zzl(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj, i17, i16) && !zzP(obj, iZzu, zzx(i16))) {
                    return false;
                }
            } else if (iZzt == 49) {
                list = (List) zzlv.zzf(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    zzkrVarZzx = zzx(i16);
                    while (i12 < list.size()) {
                        if (!zzkrVarZzx.zzl(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzt == 50 && !((zzjy) zzlv.zzf(obj, iZzu & 1048575)).isEmpty()) {
                throw null;
            }
            i14++;
            i15 = i10;
            i13 = i11;
        }
        return !this.zzh || this.zzo.zzb(obj).zzk();
    }
}
