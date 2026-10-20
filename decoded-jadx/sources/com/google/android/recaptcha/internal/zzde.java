package com.google.android.recaptcha.internal;

import b9.b;
import d7.a;
import d7.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r8.r;

/* JADX INFO: loaded from: classes.dex */
public final class zzde implements zzdd {
    public static final zzde zza = new zzde();

    private zzde() {
    }

    private static final List zzc(Object obj) {
        boolean z10 = obj instanceof byte[];
        r rVar = r.f13661a;
        int i10 = 0;
        if (z10) {
            byte[] bArr = (byte[]) obj;
            a.m(bArr, "<this>");
            int length = bArr.length;
            if (length == 0) {
                return rVar;
            }
            if (length == 1) {
                return t.d0(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i10 < length2) {
                arrayList.add(Byte.valueOf(bArr[i10]));
                i10++;
            }
            return arrayList;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            a.m(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 == 0) {
                return rVar;
            }
            if (length3 == 1) {
                return t.d0(Short.valueOf(sArr[0]));
            }
            ArrayList arrayList2 = new ArrayList(sArr.length);
            int length4 = sArr.length;
            while (i10 < length4) {
                arrayList2.add(Short.valueOf(sArr[i10]));
                i10++;
            }
            return arrayList2;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            a.m(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 != 0) {
                return length5 != 1 ? b.Y(iArr) : t.d0(Integer.valueOf(iArr[0]));
            }
            return rVar;
        }
        if (obj instanceof long[]) {
            return b.W((long[]) obj);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            a.m(fArr, "<this>");
            int length6 = fArr.length;
            if (length6 == 0) {
                return rVar;
            }
            if (length6 == 1) {
                return t.d0(Float.valueOf(fArr[0]));
            }
            ArrayList arrayList3 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i10 < length7) {
                arrayList3.add(Float.valueOf(fArr[i10]));
                i10++;
            }
            return arrayList3;
        }
        if (!(obj instanceof double[])) {
            return null;
        }
        double[] dArr = (double[]) obj;
        a.m(dArr, "<this>");
        int length8 = dArr.length;
        if (length8 == 0) {
            return rVar;
        }
        if (length8 == 1) {
            return t.d0(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList4 = new ArrayList(dArr.length);
        int length9 = dArr.length;
        while (i10 < length9) {
            arrayList4.add(Double.valueOf(dArr[i10]));
            i10++;
        }
        return arrayList4;
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        if (zzpqVarArr.length != 2) {
            throw new zzae(4, 3, null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzae(4, 5, null);
        }
        Object objZza2 = zzcjVar.zzc().zza(zzpqVarArr[1]);
        if (true != (objZza2 instanceof Object)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzae(4, 5, null);
        }
        zzcjVar.zzc().zzf(i10, zzb(objZza, objZza2));
    }

    public final Object zzb(Object obj, Object obj2) throws zzae {
        List listZzc = zzc(obj);
        List listZzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (listZzc2 != null) {
                ArrayList arrayList = new ArrayList(f9.a.y0(listZzc2));
                Iterator it = listZzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (listZzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(f9.a.y0(listZzc));
            Iterator it2 = listZzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (listZzc == null || listZzc2 == null) {
            throw new zzae(4, 5, null);
        }
        zzdc.zza(this, listZzc.size(), listZzc2.size());
        int size = listZzc.size();
        Double[] dArr = new Double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = Double.valueOf(Math.pow(((Number) listZzc.get(i10)).doubleValue(), ((Number) listZzc2.get(i10)).doubleValue()));
        }
        return dArr;
    }
}
