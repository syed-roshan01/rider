package com.google.firebase.internal.api;

import c9.a;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.messaging.reporting.C0187;
import com.google.protobuf.v;
import d5.k2;
import d5.v0;
import f0.q0;
import h.C0299;
import j2.C0325;
import ja.C0331;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import k0.i0;
import k0.t3;
import k0.y;
import k6.k4;
import k6.p7;
import k6.w4;
import k6.x7;
import l8.C0346;
import m0.g1;
import m0.l3;
import m0.m;
import n8.C0366;
import p9.z;
import v6.C0448;
import v9.C0453;
import w6.C0465;
import w9.C0466;
import x.l;
import x5.C0471;
import x7.C0472;
import y3.e;
import z.C0481;

/* JADX INFO: renamed from: com.google.firebase.internal.api.۟ۧۧ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0178 {

    /* JADX INFO: renamed from: ۟۠ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static int f202 = 155;

    /* JADX INFO: renamed from: ۟۠۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m3386(String str) {
        String string = "";
        int i10 = 0;
        String str2 = "";
        while (i10 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i10)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i10).toString();
            i10++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i11 = 0; i11 < length; i11++) {
            byteArray[i11] = (byte) (byteArray[i11] ^ str2.charAt(i11 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟۠ۥۡۧ, reason: not valid java name and contains not printable characters */
    public static int m3387(Object obj) {
        if (C0187.m3565() >= 0) {
            return ((q0) obj).f5859b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static w4 m3388(Object obj) {
        if (C0366.m7172() >= 0) {
            return ((v) obj).f4250c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m3389(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        if (C0481.m9354() <= 0) {
            e.v((String) obj, (String) obj2, (a) obj3, (m) obj4, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static l3 m3390(Object obj) {
        if (C0346.m6759() < 0) {
            return ((v0) obj).f4800d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static g1 m3391(Object obj) {
        if (C0325.m6278() <= 0) {
            return ((k2) obj).f4624t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۨ, reason: not valid java name and contains not printable characters */
    public static y m3392(Object obj) {
        if (C0331.m6374() > 0) {
            return ((i0) obj).K;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static Map m3393(Object obj) {
        if (C0466.m9068() < 0) {
            return ((d5.i0) obj).f4571q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static Boolean m3394(Object obj) {
        if (C0448.m8732() <= 0) {
            return ((x7) obj).f10560y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۥۦ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m3396(Object obj, int i10) {
        if (C0299.m5742() >= 0) {
            return ((zzfi.zzj.zza) obj).zzd(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۦ, reason: not valid java name and contains not printable characters */
    public static p7 m3397(Object obj) {
        if (C0465.m9059() < 0) {
            return ((k4) obj).f10151a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۧۨ, reason: not valid java name and contains not printable characters */
    public static zzew.zzd.zzb m3398() {
        if (C0115.m2227() <= 0) {
            return zzew.zzd.zzb.LESS_THAN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟۠, reason: not valid java name and contains not printable characters */
    public static int m3399(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static l m3400(Object obj) {
        if (C0137.m2646() <= 0) {
            return ((t3) obj).f9494n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static z m3401(Object obj) {
        if (C0471.m9151() >= 0) {
            return ((MainViewModel) obj).F0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۤ۟, reason: contains not printable characters */
    public static int m3402() {
        return 504 ^ C0472.f742;
    }

    /* JADX INFO: renamed from: ۧۢۡ, reason: not valid java name and contains not printable characters */
    public static long m3403(Object obj) {
        if (C0453.m8825() > 0) {
            return ((y) obj).f9662c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۢۥۣ, reason: not valid java name and contains not printable characters */
    public static String m3395(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
