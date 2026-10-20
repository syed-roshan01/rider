package com.google.firebase.appcheck.interop;

import a0.C0003;
import a2.c0;
import a8.C0010;
import android.content.ContentValues;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.remote.C0165;
import d5.k0;
import d5.y;
import f0.d2;
import f0.h1;
import f0.x1;
import g5.C0291;
import h3.C0302;
import h4.C0305;
import h6.g;
import i1.f;
import j8.a;
import java.io.ByteArrayOutputStream;
import k0.d4;
import k6.k;
import k6.v6;
import l0.u;
import okhttp3.internal.publicsuffix.C0372;
import q9.C0391;
import r6.C0401;
import r6.C0402;
import u8.e;
import v.f2;
import v8.C0450;
import v9.C0451;

/* JADX INFO: renamed from: com.google.firebase.appcheck.interop.۟ۥۢ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0129 {

    /* JADX INFO: renamed from: ۣۨۢۦ, reason: not valid java name and contains not printable characters */
    public static int f155 = 752;

    /* JADX INFO: renamed from: ۣ۟۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static e m2484(Object obj, Object obj2, Object obj3) {
        if (C0165.m3154() <= 0) {
            return ((h1) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static a m2485() {
        if (C0402.m7897() > 0) {
            return a.INTERNAL_ERROR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۡ, reason: not valid java name and contains not printable characters */
    public static f m2486() {
        if (C0451.m8793() <= 0) {
            return g.c0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m2488(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static String m2489(Object obj) {
        if (C0372.m7309() <= 0) {
            return ((y) obj).f4852b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static String m2490(Object obj, Object obj2, Object obj3) {
        if (C0089.m1902() < 0) {
            return a7.a.n((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۣ۟, reason: not valid java name and contains not printable characters */
    public static String m2491(String str) {
        String string = "";
        int i10 = 0;
        String str2 = "";
        while (i10 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i10)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i10).toString();
            i10++;
            str2 = string2;
        }
        while (string.length() > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i11 = 0; i11 < str.length(); i11 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i11)) << 4) | string.indexOf(str.charAt(i11 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m2492() {
        return (-878) ^ C0291.f439;
    }

    /* JADX INFO: renamed from: ۦۥۢ, reason: contains not printable characters */
    public static c0 m2493() {
        if (C0003.m70() >= 0) {
            return u.f11177b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۣۢ, reason: contains not printable characters */
    public static Object m2494(Object obj) {
        if (C0305.m5904() >= 0) {
            return ((v6) obj).f10444e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۧۢ, reason: contains not printable characters */
    public static boolean m2495(Object obj) {
        if (C0010.m199() >= 0) {
            return ((zzfc.zzd) obj).zzs();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۧۨ, reason: contains not printable characters */
    public static long m2496(Object obj, long j10) {
        if (C0391.m7657() >= 0) {
            return ((d2) obj).d(j10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۨۨۤ, reason: contains not printable characters */
    public static f2 m2497(Object obj) {
        if (C0302.m5836() >= 0) {
            return ((x1) obj).f5999a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2498(Object obj) {
        if (C0141.m2714() <= 0) {
            return ((k0) obj).f4599b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m2499(Object obj, Object obj2) {
        if (C0450.m8792() < 0) {
            k.F((ContentValues) obj, obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۦۦ۟, reason: not valid java name and contains not printable characters */
    public static float m2500(Object obj) {
        if (C0401.m7881() < 0) {
            return ((d4) obj).f8838c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m2487(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
