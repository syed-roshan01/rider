package com.google.firebase.analytics.ktx.ktxtesting;

import android.content.pm.ServiceInfo;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.firebase.messaging.reporting.C0190;
import d1.d;
import d9.C0225;
import ea.C0268;
import f0.t;
import g2.l0;
import h5.C0308;
import j2.C0324;
import j6.C0329;
import java.io.ByteArrayOutputStream;
import k0.c3;
import k0.c4;
import k0.i2;
import k0.l1;
import k0.v0;
import k6.f5;
import k6.n4;
import k6.q;
import k6.r5;
import k6.y5;
import k6.z3;
import la.C0349;
import m7.C0358;
import n7.C0365;
import org.json.JSONArray;
import org.json.JSONObject;
import q0.C0382;
import r1.i1;
import r1.k0;
import r1.x0;
import t3.C0425;
import u8.C0439;
import w5.C0464;
import y.C0475;
import z8.C0492;

/* JADX INFO: renamed from: com.google.firebase.analytics.ktx.ktxtesting.۟ۦۣۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0119 {

    /* JADX INFO: renamed from: ۣۣ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static int f145 = 897;

    /* JADX INFO: renamed from: ۟۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static String m2288(Object obj) {
        if (C0425.m8322() > 0) {
            return ((ServiceInfo) obj).packageName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m2289() {
        return (-208) ^ C0382.f652;
    }

    /* JADX INFO: renamed from: ۟۠ۦۥۤ, reason: not valid java name and contains not printable characters */
    public static zzcd m2290() {
        if (C0464.m9033() > 0) {
            return zzcd.zza();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2291(Object obj) {
        if (C0365.m7147() <= 0) {
            return ((n4) obj).f10223c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۡ, reason: not valid java name and contains not printable characters */
    public static float m2292() {
        if (C0324.m6259() <= 0) {
            return c4.f8802c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static x0 m2293(Object obj) {
        if (C0358.m7001() <= 0) {
            return ((c3) obj).f8794c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static q m2294(Object obj) {
        if (C0268.m5113() <= 0) {
            return ((f5) obj).i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static k0 m2295(Object obj, Object obj2, long j10) {
        if (C0308.m5935() >= 0) {
            return ((i2) obj).a((i1) obj2, j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨۢ, reason: not valid java name and contains not printable characters */
    public static String m2296(Object obj, Object obj2, Object obj3) {
        if (C0439.m8564() >= 0) {
            return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۡ, reason: not valid java name and contains not printable characters */
    public static float m2297(Object obj) {
        if (C0349.m6818() < 0) {
            return ((d) obj).f4334c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static String m2298(String str) {
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

    /* JADX INFO: renamed from: ۣۡۥ۟, reason: not valid java name and contains not printable characters */
    public static l0 m2299(Object obj) {
        if (C0492.m9566() >= 0) {
            return ((t) obj).f5906n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۤۢ, reason: not valid java name and contains not printable characters */
    public static int m2301(Object obj) {
        if (C0329.m6350() > 0) {
            return ((v0) obj).f9548f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m2302(Object obj) {
        if (C0086.m1846() > 0) {
            return ((l1) obj).f9164t;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۥ۠ۡ, reason: contains not printable characters */
    public static r5 m2303() {
        if (C0475.m9246() < 0) {
            return r5.f10344e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۨۧ, reason: not valid java name and contains not printable characters */
    public static JSONArray m2304(Object obj, Object obj2) {
        if (C0225.m4316() >= 0) {
            return ((JSONObject) obj).getJSONArray((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static long m2305(Object obj) {
        if (C0439.m8564() > 0) {
            return ((y5) obj).f10578m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m2306(Object obj) {
        if (C0190.m3639() >= 0) {
            return ((z3) obj).f10592d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۧۨ, reason: not valid java name and contains not printable characters */
    public static int m2307(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۤۢ۠, reason: not valid java name and contains not printable characters */
    public static String m2300(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
