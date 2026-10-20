package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzaiu;
import com.google.firebase.remoteconfig.internal.Code;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
final class zzais<T extends zzaiu<T>> {
    private static final zzais zzb = new zzais(true);
    final zzalh<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzais() {
        this.zza = zzalh.zza(16);
    }

    public static int zza(zzamo zzamoVar, int i10, Object obj) {
        int iZzg = zzaii.zzg(i10);
        if (zzamoVar == zzamo.zzj) {
            zzajc.zza((zzakk) obj);
            iZzg <<= 1;
        }
        return iZzg + zza(zzamoVar, obj);
    }

    public static <T extends zzaiu<T>> zzais<T> zzb() {
        return zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        zzais zzaisVar = new zzais();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry<K, Object> entryZzb = this.zza.zzb(i10);
            zzaisVar.zzb((zzaiu) entryZzb.getKey(), entryZzb.getValue());
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzaisVar.zzb((zzaiu) entry.getKey(), entry.getValue());
        }
        zzaisVar.zzd = this.zzd;
        return zzaisVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzais) {
            return this.zza.equals(((zzais) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        return this.zzd ? new zzajp(this.zza.zzd().iterator()) : this.zza.zzd().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zzd ? new zzajp(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry<K, Object> entryZzb = this.zza.zzb(i10);
            if (entryZzb.getValue() instanceof zzaja) {
                ((zzaja) entryZzb.getValue()).zzs();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            if (!zzc(this.zza.zzb(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzc((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzajk;
        if (key.zze()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objZza = zza((zzaiu) key);
            if (objZza == null) {
                objZza = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objZza).add(zza(it.next()));
            }
            this.zza.put(key, objZza);
            return;
        }
        if (key.zzc() != zzamy.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(key, zza(value));
            return;
        }
        Object objZza2 = zza((zzaiu) key);
        if (objZza2 == null) {
            this.zza.put(key, zza(value));
            if (z10) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z10) {
            value = zzajk.zza();
        }
        this.zza.put(key, objZza2 instanceof zzakt ? key.zza((zzakt) objZza2, (zzakt) value) : key.zza(((zzakk) objZza2).zzq(), (zzakk) value).zzf());
    }

    private zzais(zzalh<T, Object> zzalhVar) {
        this.zza = zzalhVar;
        zze();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static void zzc(T t10, Object obj) {
        boolean z10;
        zzamo zzamoVarZzb = t10.zzb();
        zzajc.zza(obj);
        switch (zzaiv.zza[zzamoVarZzb.zzb().ordinal()]) {
            case 1:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.zza()), t10.zzb().zzb(), obj.getClass().getName()));
            case 2:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.zza()), t10.zzb().zzb(), obj.getClass().getName()));
            case 3:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.zza()), t10.zzb().zzb(), obj.getClass().getName()));
            case 4:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.zza()), t10.zzb().zzb(), obj.getClass().getName()));
            case 5:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.zza()), t10.zzb().zzb(), obj.getClass().getName()));
            case 6:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.zza()), t10.zzb().zzb(), obj.getClass().getName()));
            case 7:
                if ((obj instanceof zzahm) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.zza()), t10.zzb().zzb(), obj.getClass().getName()));
            case 8:
                if ((obj instanceof Integer) || (obj instanceof zzajf)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.zza()), t10.zzb().zzb(), obj.getClass().getName()));
            case 9:
                if ((obj instanceof zzakk) || (obj instanceof zzajk)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.zza()), t10.zzb().zzb(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.zza()), t10.zzb().zzb(), obj.getClass().getName()));
        }
    }

    private zzais(boolean z10) {
        this(zzalh.zza(0));
        zze();
    }

    private static int zza(zzamo zzamoVar, Object obj) {
        switch (zzaiv.zzb[zzamoVar.ordinal()]) {
            case 1:
                return zzaii.zza(((Double) obj).doubleValue());
            case 2:
                return zzaii.zza(((Float) obj).floatValue());
            case 3:
                return zzaii.zzb(((Long) obj).longValue());
            case 4:
                return zzaii.zze(((Long) obj).longValue());
            case 5:
                return zzaii.zzc(((Integer) obj).intValue());
            case 6:
                return zzaii.zza(((Long) obj).longValue());
            case 7:
                return zzaii.zzb(((Integer) obj).intValue());
            case 8:
                return zzaii.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzaii.zza((zzakk) obj);
            case 10:
                if (obj instanceof zzajk) {
                    return zzaii.zza((zzajk) obj);
                }
                return zzaii.zzb((zzakk) obj);
            case 11:
                if (obj instanceof zzahm) {
                    return zzaii.zza((zzahm) obj);
                }
                return zzaii.zza((String) obj);
            case 12:
                if (obj instanceof zzahm) {
                    return zzaii.zza((zzahm) obj);
                }
                return zzaii.zza((byte[]) obj);
            case 13:
                return zzaii.zzh(((Integer) obj).intValue());
            case Code.UNAVAILABLE /* 14 */:
                return zzaii.zze(((Integer) obj).intValue());
            case 15:
                return zzaii.zzc(((Long) obj).longValue());
            case Code.UNAUTHENTICATED /* 16 */:
                return zzaii.zzf(((Integer) obj).intValue());
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return zzaii.zzd(((Long) obj).longValue());
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                if (obj instanceof zzajf) {
                    return zzaii.zza(((zzajf) obj).zza());
                }
                return zzaii.zza(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static <T extends zzaiu<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzamy.MESSAGE) {
            return true;
        }
        if (key.zze()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!zzb(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return zzb(entry.getValue());
    }

    private final void zzb(T t10, Object obj) {
        if (t10.zze()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    zzc(t10, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzc(t10, obj);
        }
        if (obj instanceof zzajk) {
            this.zzd = true;
        }
        this.zza.put(t10, obj);
    }

    public static int zza(zzaiu<?> zzaiuVar, Object obj) {
        zzamo zzamoVarZzb = zzaiuVar.zzb();
        int iZza = zzaiuVar.zza();
        if (zzaiuVar.zze()) {
            List list = (List) obj;
            int iZza2 = 0;
            if (zzaiuVar.zzd()) {
                if (list.isEmpty()) {
                    return 0;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    iZza2 += zza(zzamoVarZzb, it.next());
                }
                return zzaii.zzh(iZza2) + zzaii.zzg(iZza) + iZza2;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                iZza2 += zza(zzamoVarZzb, iZza, it2.next());
            }
            return iZza2;
        }
        return zza(zzamoVarZzb, iZza, obj);
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzakm) {
            return ((zzakm) obj).zzu();
        }
        if (obj instanceof zzajk) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int zza() {
        int iZza = 0;
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            iZza += zza((Map.Entry) this.zza.zzb(i10));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            iZza += zza((Map.Entry) it.next());
        }
        return iZza;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzamy.MESSAGE && !key.zze() && !key.zzd()) {
            if (value instanceof zzajk) {
                return zzaii.zza(entry.getKey().zza(), (zzajk) value);
            }
            return zzaii.zza(entry.getKey().zza(), (zzakk) value);
        }
        return zza((zzaiu<?>) key, value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzakt) {
            return ((zzakt) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t10) {
        Object obj = this.zza.get(t10);
        if (!(obj instanceof zzajk)) {
            return obj;
        }
        return zzajk.zza();
    }

    public final void zza(zzais<T> zzaisVar) {
        for (int i10 = 0; i10 < zzaisVar.zza.zzb(); i10++) {
            zzb((Map.Entry) zzaisVar.zza.zzb(i10));
        }
        Iterator it = zzaisVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    public static void zza(zzaii zzaiiVar, zzamo zzamoVar, int i10, Object obj) {
        if (zzamoVar == zzamo.zzj) {
            zzakk zzakkVar = (zzakk) obj;
            zzajc.zza(zzakkVar);
            zzaiiVar.zzj(i10, 3);
            zzakkVar.zza(zzaiiVar);
            zzaiiVar.zzj(i10, 4);
        }
        zzaiiVar.zzj(i10, zzamoVar.zza());
        switch (zzaiv.zzb[zzamoVar.ordinal()]) {
            case 1:
                zzaiiVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzaiiVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzaiiVar.zzh(((Long) obj).longValue());
                break;
            case 4:
                zzaiiVar.zzh(((Long) obj).longValue());
                break;
            case 5:
                zzaiiVar.zzj(((Integer) obj).intValue());
                break;
            case 6:
                zzaiiVar.zzf(((Long) obj).longValue());
                break;
            case 7:
                zzaiiVar.zzi(((Integer) obj).intValue());
                break;
            case 8:
                zzaiiVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzakk) obj).zza(zzaiiVar);
                break;
            case 10:
                zzaiiVar.zzc((zzakk) obj);
                break;
            case 11:
                if (obj instanceof zzahm) {
                    zzaiiVar.zzb((zzahm) obj);
                } else {
                    zzaiiVar.zzb((String) obj);
                }
                break;
            case 12:
                if (obj instanceof zzahm) {
                    zzaiiVar.zzb((zzahm) obj);
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzaiiVar.zzb(bArr, 0, bArr.length);
                }
                break;
            case 13:
                zzaiiVar.zzl(((Integer) obj).intValue());
                break;
            case Code.UNAVAILABLE /* 14 */:
                zzaiiVar.zzi(((Integer) obj).intValue());
                break;
            case 15:
                zzaiiVar.zzf(((Long) obj).longValue());
                break;
            case Code.UNAUTHENTICATED /* 16 */:
                zzaiiVar.zzk(((Integer) obj).intValue());
                break;
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                zzaiiVar.zzg(((Long) obj).longValue());
                break;
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                if (obj instanceof zzajf) {
                    zzaiiVar.zzj(((zzajf) obj).zza());
                } else {
                    zzaiiVar.zzj(((Integer) obj).intValue());
                }
                break;
        }
    }
}
