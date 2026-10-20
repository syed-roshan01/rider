package com.google.android.recaptcha.internal;

import d7.a;
import java.util.Collection;
import r8.p;

/* JADX INFO: loaded from: classes.dex */
public final class zzcv implements zzdd {
    public static final zzcv zza = new zzcv();

    private zzcv() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        String strK0;
        String str;
        if (zzpqVarArr.length != 1) {
            throw new zzae(4, 3, null);
        }
        int i11 = 0;
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzae(4, 5, null);
        }
        if (objZza instanceof int[]) {
            int[] iArr = (int[]) objZza;
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int length = iArr.length;
            int i12 = 0;
            while (i11 < length) {
                int i13 = iArr[i11];
                i12++;
                if (i12 > 1) {
                    sb.append((CharSequence) ",");
                }
                sb.append((CharSequence) String.valueOf(i13));
                i11++;
            }
            sb.append((CharSequence) "]");
            strK0 = sb.toString();
            a.l(strK0, "toString(...)");
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, l9.a.f11393a);
            } else if (objZza instanceof long[]) {
                long[] jArr = (long[]) objZza;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) "[");
                int length2 = jArr.length;
                int i14 = 0;
                while (i11 < length2) {
                    long j10 = jArr[i11];
                    i14++;
                    if (i14 > 1) {
                        sb2.append((CharSequence) ",");
                    }
                    sb2.append((CharSequence) String.valueOf(j10));
                    i11++;
                }
                sb2.append((CharSequence) "]");
                strK0 = sb2.toString();
                a.l(strK0, "toString(...)");
            } else if (objZza instanceof short[]) {
                short[] sArr = (short[]) objZza;
                StringBuilder sb3 = new StringBuilder();
                sb3.append((CharSequence) "[");
                int length3 = sArr.length;
                int i15 = 0;
                while (i11 < length3) {
                    short s9 = sArr[i11];
                    i15++;
                    if (i15 > 1) {
                        sb3.append((CharSequence) ",");
                    }
                    sb3.append((CharSequence) String.valueOf((int) s9));
                    i11++;
                }
                sb3.append((CharSequence) "]");
                strK0 = sb3.toString();
                a.l(strK0, "toString(...)");
            } else if (objZza instanceof float[]) {
                float[] fArr = (float[]) objZza;
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) "[");
                int length4 = fArr.length;
                int i16 = 0;
                while (i11 < length4) {
                    float f10 = fArr[i11];
                    i16++;
                    if (i16 > 1) {
                        sb4.append((CharSequence) ",");
                    }
                    sb4.append((CharSequence) String.valueOf(f10));
                    i11++;
                }
                sb4.append((CharSequence) "]");
                strK0 = sb4.toString();
                a.l(strK0, "toString(...)");
            } else if (objZza instanceof double[]) {
                double[] dArr = (double[]) objZza;
                StringBuilder sb5 = new StringBuilder();
                sb5.append((CharSequence) "[");
                int length5 = dArr.length;
                int i17 = 0;
                while (i11 < length5) {
                    double d10 = dArr[i11];
                    i17++;
                    if (i17 > 1) {
                        sb5.append((CharSequence) ",");
                    }
                    sb5.append((CharSequence) String.valueOf(d10));
                    i11++;
                }
                sb5.append((CharSequence) "]");
                strK0 = sb5.toString();
                a.l(strK0, "toString(...)");
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                Object[] objArr = (Object[]) objZza;
                StringBuilder sb6 = new StringBuilder();
                sb6.append((CharSequence) "[");
                int length6 = objArr.length;
                int i18 = 0;
                while (i11 < length6) {
                    Object obj = objArr[i11];
                    i18++;
                    if (i18 > 1) {
                        sb6.append((CharSequence) ",");
                    }
                    z6.a.b(sb6, obj, null);
                    i11++;
                }
                sb6.append((CharSequence) "]");
                strK0 = sb6.toString();
                a.l(strK0, "toString(...)");
            } else {
                if (!(objZza instanceof Collection)) {
                    throw new zzae(4, 5, null);
                }
                strK0 = p.K0((Iterable) objZza, ",", "[", "]", null, 56);
            }
            strK0 = str;
        }
        zzcjVar.zzc().zzf(i10, strK0);
    }
}
