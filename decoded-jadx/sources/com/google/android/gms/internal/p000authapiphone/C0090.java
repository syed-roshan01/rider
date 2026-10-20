package com.google.android.gms.internal.p000authapiphone;

import android.net.NetworkRequest;
import android.os.Parcel;
import androidx.compose.foundation.text.modifiers.C0025;
import b8.C0055;
import c1.C0061;
import ca.C0070;
import com.google.android.gms.measurement.internal.C0105;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.installations.C0177;
import com.google.firebase.measurement.C0184;
import com.google.firebase.remoteconfig.ktx.C0199;
import f0.s0;
import g2.i0;
import i.C0316;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.g0;
import k0.k3;
import k0.l;
import k0.m0;
import k0.o;
import k0.t0;
import k6.k;
import k6.k7;
import l0.r;
import m0.C0349;
import m0.m;
import n9.C0366;
import o8.C0371;
import v6.C0447;
import x7.C0471;
import x9.i;
import y.a1;
import y0.a;
import y0.e;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth-api-phone.۟ۢۦۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0090 {

    /* JADX INFO: renamed from: ۣۧۡۨ, reason: not valid java name and contains not printable characters */
    public static int f124 = 858;

    /* JADX INFO: renamed from: ۟۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static long m1917(Object obj, Object obj2) {
        if (C0447.m8732() <= 0) {
            return ((k) obj).v((String) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۨۥ۠, reason: not valid java name and contains not printable characters */
    public static float m1918() {
        if (C0316.m6120() <= 0) {
            return k3.f9116f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static i0 m1919(Object obj) {
        if (C0366.m7189() >= 0) {
            return ((s0) obj).f5893d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦ۠, reason: not valid java name and contains not printable characters */
    public static int m1920() {
        return 499 ^ C0471.f742;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static NetworkRequest.Builder m1921(Object obj, int i10) {
        if (C0184.m3517() >= 0) {
            return ((NetworkRequest.Builder) obj).addCapability(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static List m1923(Object obj) {
        if (C0105.m2045() >= 0) {
            return ((i) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static k m1924(Object obj) {
        if (C0112.m2176() > 0) {
            return ((k7) obj).n();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۡۨ, reason: not valid java name and contains not printable characters */
    public static g0 m1925(Object obj) {
        if (C0199.m3818() > 0) {
            return t0.h((k0.i0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۥ۠, reason: not valid java name and contains not printable characters */
    public static e m1926() {
        if (C0116.m2247() > 0) {
            return a.f16716p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۤۤ, reason: not valid java name and contains not printable characters */
    public static int m1927(long j10) {
        if (C0349.m6838() <= 0) {
            return m2.a.k(j10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۧۧ۟, reason: not valid java name and contains not printable characters */
    public static long m1928(Object obj) {
        if (C0061.m1161() < 0) {
            return ((l) obj).f9130s;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m1929(Object obj) {
        if (C0025.m495() > 0) {
            ((o) obj).m6428invoke();
        }
    }

    /* JADX INFO: renamed from: ۣۤۨۨ, reason: not valid java name and contains not printable characters */
    public static void m1930(Object obj, Object obj2) {
        if (C0371.m7283() > 0) {
            ((Parcel) obj).writeStringList((List) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۧۥۦ, reason: contains not printable characters */
    public static String[] m1931() {
        if (C0177.m3380() > 0) {
            return k.f10139j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۥۧ, reason: contains not printable characters */
    public static int m1932() {
        if (C0055.m1056() > 0) {
            return r.f11122c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۧۦۡ, reason: contains not printable characters */
    public static int m1933(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m1934(Object obj, Object obj2, Object obj3, int i10) {
        if (C0070.m1363() > 0) {
            ((m0) obj).b((a1) obj2, (m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۧۥۢۦ, reason: not valid java name and contains not printable characters */
    public static String m1935(String str) {
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
        for (int i11 = 0; i11 < str.length(); i11 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i11)) << 4) | string.indexOf(str.charAt(i11 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۦۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m1922(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
