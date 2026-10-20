package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzale {
    private static final Class<?> zza = zzd();
    private static final zzamb<?, ?> zzb = zzc();
    private static final zzamb<?, ?> zzc = new zzamd();

    public static zzamb<?, ?> zza() {
        return zzb;
    }

    public static zzamb<?, ?> zzb() {
        return zzc;
    }

    public static int zzc(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaii.zzb(i10, 0) * size;
    }

    public static int zzd(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaii.zza(i10, 0L) * size;
    }

    public static int zze(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaii.zzg(i10) * size) + zze(list);
    }

    public static int zzf(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzaii.zzg(i10) * list.size()) + zzf(list);
    }

    public static int zzg(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaii.zzg(i10) * size) + zzg(list);
    }

    public static int zzh(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaii.zzg(i10) * size) + zzh(list);
    }

    public static int zzi(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaii.zzg(i10) * size) + zzi(list);
    }

    public static int zzj(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaii.zzg(i10) * size) + zzj(list);
    }

    public static void zzk(int i10, List<Integer> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzk(i10, list, z10);
    }

    public static void zzl(int i10, List<Long> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzl(i10, list, z10);
    }

    public static void zzm(int i10, List<Integer> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzm(i10, list, z10);
    }

    public static void zzn(int i10, List<Long> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzn(i10, list, z10);
    }

    public static int zza(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaii.zza(i10, true) * size;
    }

    public static int zzb(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaii.zzg(i10) * size) + zzb(list);
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    private static zzamb<?, ?> zzc() {
        try {
            Class<?> clsZze = zze();
            if (clsZze == null) {
                return null;
            }
            return (zzamb) clsZze.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int zze(List<Integer> list) {
        int iZzc;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            iZzc = 0;
            while (i10 < size) {
                iZzc += zzaii.zzc(zzajdVar.zzb(i10));
                i10++;
            }
        } else {
            iZzc = 0;
            while (i10 < size) {
                iZzc += zzaii.zzc(list.get(i10).intValue());
                i10++;
            }
        }
        return iZzc;
    }

    public static int zzf(List<Long> list) {
        int iZzb;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            iZzb = 0;
            while (i10 < size) {
                iZzb += zzaii.zzb(zzajzVar.zzb(i10));
                i10++;
            }
        } else {
            iZzb = 0;
            while (i10 < size) {
                iZzb += zzaii.zzb(list.get(i10).longValue());
                i10++;
            }
        }
        return iZzb;
    }

    public static int zzg(List<Integer> list) {
        int iZzf;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            iZzf = 0;
            while (i10 < size) {
                iZzf += zzaii.zzf(zzajdVar.zzb(i10));
                i10++;
            }
        } else {
            iZzf = 0;
            while (i10 < size) {
                iZzf += zzaii.zzf(list.get(i10).intValue());
                i10++;
            }
        }
        return iZzf;
    }

    public static int zzh(List<Long> list) {
        int iZzd;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            iZzd = 0;
            while (i10 < size) {
                iZzd += zzaii.zzd(zzajzVar.zzb(i10));
                i10++;
            }
        } else {
            iZzd = 0;
            while (i10 < size) {
                iZzd += zzaii.zzd(list.get(i10).longValue());
                i10++;
            }
        }
        return iZzd;
    }

    public static int zzi(List<Integer> list) {
        int iZzh;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            iZzh = 0;
            while (i10 < size) {
                iZzh += zzaii.zzh(zzajdVar.zzb(i10));
                i10++;
            }
        } else {
            iZzh = 0;
            while (i10 < size) {
                iZzh += zzaii.zzh(list.get(i10).intValue());
                i10++;
            }
        }
        return iZzh;
    }

    public static int zzj(List<Long> list) {
        int iZze;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            iZze = 0;
            while (i10 < size) {
                iZze += zzaii.zze(zzajzVar.zzb(i10));
                i10++;
            }
        } else {
            iZze = 0;
            while (i10 < size) {
                iZze += zzaii.zze(list.get(i10).longValue());
                i10++;
            }
        }
        return iZze;
    }

    public static int zza(int i10, List<zzahm> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzg = zzaii.zzg(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzg += zzaii.zza(list.get(i11));
        }
        return iZzg;
    }

    public static int zzb(List<Integer> list) {
        int iZza;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            iZza = 0;
            while (i10 < size) {
                iZza += zzaii.zza(zzajdVar.zzb(i10));
                i10++;
            }
        } else {
            iZza = 0;
            while (i10 < size) {
                iZza += zzaii.zza(list.get(i10).intValue());
                i10++;
            }
        }
        return iZza;
    }

    public static void zzd(int i10, List<Integer> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzd(i10, list, z10);
    }

    public static void zzc(int i10, List<Integer> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzc(i10, list, z10);
    }

    public static int zza(int i10, List<zzakk> list, zzalc zzalcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZza = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iZza += zzaii.zza(i10, list.get(i11), zzalcVar);
        }
        return iZza;
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzf(int i10, List<Float> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzf(i10, list, z10);
    }

    public static void zzg(int i10, List<Integer> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzg(i10, list, z10);
    }

    public static void zzh(int i10, List<Long> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzh(i10, list, z10);
    }

    public static void zzi(int i10, List<Integer> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzi(i10, list, z10);
    }

    public static void zzj(int i10, List<Long> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzj(i10, list, z10);
    }

    public static int zzb(int i10, List<?> list, zzalc zzalcVar) {
        int iZza;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzg = zzaii.zzg(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzajo) {
                iZza = zzaii.zza((zzajo) obj);
            } else {
                iZza = zzaii.zza((zzakk) obj, zzalcVar);
            }
            iZzg = iZza + iZzg;
        }
        return iZzg;
    }

    public static void zze(int i10, List<Long> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zze(i10, list, z10);
    }

    public static int zza(int i10, Object obj, zzalc zzalcVar) {
        if (obj instanceof zzajo) {
            return zzaii.zzb(i10, (zzajo) obj);
        }
        return zzaii.zzb(i10, (zzakk) obj, zzalcVar);
    }

    public static <UT, UB> UB zza(Object obj, int i10, List<Integer> list, zzajh zzajhVar, UB ub, zzamb<UT, UB> zzambVar) {
        if (zzajhVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = list.get(i12).intValue();
                if (zzajhVar.zza(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    ub = (UB) zza(obj, i10, iIntValue, ub, zzambVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!zzajhVar.zza(iIntValue2)) {
                    ub = (UB) zza(obj, i10, iIntValue2, ub, zzambVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static int zzb(int i10, List<?> list) {
        int iZza;
        int iZza2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzg = zzaii.zzg(i10) * size;
        if (list instanceof zzajq) {
            zzajq zzajqVar = (zzajq) list;
            while (i11 < size) {
                Object objZzb = zzajqVar.zzb(i11);
                if (objZzb instanceof zzahm) {
                    iZza2 = zzaii.zza((zzahm) objZzb);
                } else {
                    iZza2 = zzaii.zza((String) objZzb);
                }
                iZzg = iZza2 + iZzg;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzahm) {
                    iZza = zzaii.zza((zzahm) obj);
                } else {
                    iZza = zzaii.zza((String) obj);
                }
                iZzg = iZza + iZzg;
                i11++;
            }
        }
        return iZzg;
    }

    public static <UT, UB> UB zza(Object obj, int i10, int i11, UB ub, zzamb<UT, UB> zzambVar) {
        if (ub == null) {
            ub = zzambVar.zzc(obj);
        }
        zzambVar.zzb(ub, i10, i11);
        return ub;
    }

    public static <T, FT extends zzaiu<FT>> void zza(zzair<FT> zzairVar, T t10, T t11) {
        zzais<T> zzaisVarZza = zzairVar.zza(t11);
        if (zzaisVarZza.zza.isEmpty()) {
            return;
        }
        zzairVar.zzb(t10).zza((zzais) zzaisVarZza);
    }

    public static void zzb(int i10, List<Double> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzb(i10, list, z10);
    }

    public static void zzb(int i10, List<?> list, zzanb zzanbVar, zzalc zzalcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzb(i10, list, zzalcVar);
    }

    public static <T> void zza(zzakh zzakhVar, T t10, T t11, long j10) {
        zzamh.zza(t10, j10, zzakhVar.zza(zzamh.zze(t10, j10), zzamh.zze(t11, j10)));
    }

    public static void zzb(int i10, List<String> list, zzanb zzanbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzb(i10, list);
    }

    public static <T, UT, UB> void zza(zzamb<UT, UB> zzambVar, T t10, T t11) {
        zzambVar.zzc(t10, zzambVar.zza(zzambVar.zzd(t10), zzambVar.zzd(t11)));
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzaja.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i10, List<Boolean> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zza(i10, list, z10);
    }

    public static void zza(int i10, List<zzahm> list, zzanb zzanbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zza(i10, list);
    }

    public static void zza(int i10, List<?> list, zzanb zzanbVar, zzalc zzalcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zza(i10, list, zzalcVar);
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
