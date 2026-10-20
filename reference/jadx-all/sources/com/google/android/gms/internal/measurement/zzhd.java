package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhd;
import com.google.android.gms.internal.measurement.zzhf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzhd<MessageType extends zzhd<MessageType, BuilderType>, BuilderType extends zzhf<MessageType, BuilderType>> implements zzkj {
    protected int zza = 0;

    public int zza(zzlb zzlbVar) {
        int iZzbt = zzbt();
        if (iZzbt != -1) {
            return iZzbt;
        }
        int iZza = zzlbVar.zza(this);
        zzc(iZza);
        return iZza;
    }

    public int zzbt() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final zzhm zzbu() {
        try {
            zzhv zzhvVarZzc = zzhm.zzc(zzbw());
            zza(zzhvVarZzc.zzb());
            return zzhvVarZzc.zza();
        } catch (IOException e4) {
            throw new RuntimeException(q.k("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e4);
        }
    }

    public final byte[] zzbv() {
        try {
            byte[] bArr = new byte[zzbw()];
            zzig zzigVarZzb = zzig.zzb(bArr);
            zza(zzigVarZzb);
            zzigVarZzb.zzb();
            return bArr;
        } catch (IOException e4) {
            throw new RuntimeException(q.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e4);
        }
    }

    public void zzc(int i10) {
        throw new UnsupportedOperationException();
    }

    public static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zziz.zza(iterable);
        if (iterable instanceof zzjp) {
            List<?> listZzb = ((zzjp) iterable).zzb();
            zzjp zzjpVar = (zzjp) list;
            int size = list.size();
            for (Object obj : listZzb) {
                if (obj == null) {
                    String strH = q.h("Element at index ", zzjpVar.size() - size, " is null.");
                    for (int size2 = zzjpVar.size() - 1; size2 >= size; size2--) {
                        zzjpVar.remove(size2);
                    }
                    throw new NullPointerException(strH);
                }
                if (obj instanceof zzhm) {
                    zzjpVar.zza((zzhm) obj);
                } else {
                    zzjpVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzkv) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (T t10 : iterable) {
            if (t10 == null) {
                String strH2 = q.h("Element at index ", list.size() - size3, " is null.");
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(strH2);
            }
            list.add(t10);
        }
    }
}
