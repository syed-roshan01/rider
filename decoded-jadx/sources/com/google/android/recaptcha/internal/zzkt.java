package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzkt {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzll zzc;
    private static final zzll zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzll zzllVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzllVar = (zzll) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzllVar;
        zzd = new zzln();
    }

    public static void zzA(int i10, List list, zzmd zzmdVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzu(i10, list, z10);
    }

    public static void zzB(int i10, List list, zzmd zzmdVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzy(i10, list, z10);
    }

    public static void zzC(int i10, List list, zzmd zzmdVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzA(i10, list, z10);
    }

    public static void zzD(int i10, List list, zzmd zzmdVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzC(i10, list, z10);
    }

    public static void zzE(int i10, List list, zzmd zzmdVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzE(i10, list, z10);
    }

    public static void zzF(int i10, List list, zzmd zzmdVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzJ(i10, list, z10);
    }

    public static void zzG(int i10, List list, zzmd zzmdVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzL(i10, list, z10);
    }

    public static boolean zzH(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int iZzu;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            iZzu = 0;
            while (i10 < size) {
                iZzu += zzhh.zzu(zziuVar.zze(i10));
                i10++;
            }
        } else {
            iZzu = 0;
            while (i10 < size) {
                iZzu += zzhh.zzu(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzu;
    }

    public static int zzb(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhh.zzy(i10 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhh.zzy(i10 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int iZzu;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            iZzu = 0;
            while (i10 < size) {
                iZzu += zzhh.zzu(zziuVar.zze(i10));
                i10++;
            }
        } else {
            iZzu = 0;
            while (i10 < size) {
                iZzu += zzhh.zzu(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzu;
    }

    public static int zzg(List list) {
        int iZzz;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjt) {
            zzjt zzjtVar = (zzjt) list;
            iZzz = 0;
            while (i10 < size) {
                iZzz += zzhh.zzz(zzjtVar.zze(i10));
                i10++;
            }
        } else {
            iZzz = 0;
            while (i10 < size) {
                iZzz += zzhh.zzz(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzz;
    }

    public static int zzh(int i10, Object obj, zzkr zzkrVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof zzjk)) {
            return zzhh.zzy(i11) + zzhh.zzw((zzke) obj, zzkrVar);
        }
        int i12 = zzhh.zzb;
        int iZza = ((zzjk) obj).zza();
        return zzhh.zzy(i11) + zzhh.zzy(iZza) + iZza;
    }

    public static int zzi(List list) {
        int iZzy;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            iZzy = 0;
            while (i10 < size) {
                int iZze = zziuVar.zze(i10);
                iZzy += zzhh.zzy((iZze >> 31) ^ (iZze + iZze));
                i10++;
            }
        } else {
            iZzy = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzy += zzhh.zzy((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iZzy;
    }

    public static int zzj(List list) {
        int iZzz;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjt) {
            zzjt zzjtVar = (zzjt) list;
            iZzz = 0;
            while (i10 < size) {
                long jZze = zzjtVar.zze(i10);
                iZzz += zzhh.zzz((jZze >> 63) ^ (jZze + jZze));
                i10++;
            }
        } else {
            iZzz = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzz += zzhh.zzz((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iZzz;
    }

    public static int zzk(List list) {
        int iZzy;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            iZzy = 0;
            while (i10 < size) {
                iZzy += zzhh.zzy(zziuVar.zze(i10));
                i10++;
            }
        } else {
            iZzy = 0;
            while (i10 < size) {
                iZzy += zzhh.zzy(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzy;
    }

    public static int zzl(List list) {
        int iZzz;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjt) {
            zzjt zzjtVar = (zzjt) list;
            iZzz = 0;
            while (i10 < size) {
                iZzz += zzhh.zzz(zzjtVar.zze(i10));
                i10++;
            }
        } else {
            iZzz = 0;
            while (i10 < size) {
                iZzz += zzhh.zzz(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzz;
    }

    public static zzll zzm() {
        return zzc;
    }

    public static zzll zzn() {
        return zzd;
    }

    public static Object zzo(Object obj, int i10, List list, zzix zzixVar, Object obj2, zzll zzllVar) {
        if (zzixVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = ((Integer) list.get(i12)).intValue();
                if (zzixVar.zza(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    obj2 = zzp(obj, i10, iIntValue, obj2, zzllVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzixVar.zza(iIntValue2)) {
                    obj2 = zzp(obj, i10, iIntValue2, obj2, zzllVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzp(Object obj, int i10, int i11, Object obj2, zzll zzllVar) {
        if (obj2 == null) {
            obj2 = zzllVar.zzc(obj);
        }
        zzllVar.zzl(obj2, i10, i11);
        return obj2;
    }

    public static void zzq(zzif zzifVar, Object obj, Object obj2) {
        zzij zzijVarZzb = zzifVar.zzb(obj2);
        if (zzijVarZzb.zza.isEmpty()) {
            return;
        }
        zzifVar.zzc(obj).zzh(zzijVarZzb);
    }

    public static void zzr(zzll zzllVar, Object obj, Object obj2) {
        zzllVar.zzo(obj, zzllVar.zze(zzllVar.zzd(obj), zzllVar.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzit.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzt(int i10, List list, zzmd zzmdVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzc(i10, list, z10);
    }

    public static void zzu(int i10, List list, zzmd zzmdVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzg(i10, list, z10);
    }

    public static void zzv(int i10, List list, zzmd zzmdVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzj(i10, list, z10);
    }

    public static void zzw(int i10, List list, zzmd zzmdVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzl(i10, list, z10);
    }

    public static void zzx(int i10, List list, zzmd zzmdVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzn(i10, list, z10);
    }

    public static void zzy(int i10, List list, zzmd zzmdVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzp(i10, list, z10);
    }

    public static void zzz(int i10, List list, zzmd zzmdVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzmdVar.zzs(i10, list, z10);
    }
}
