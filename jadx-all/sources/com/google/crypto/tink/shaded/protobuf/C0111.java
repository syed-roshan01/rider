package com.google.crypto.tink.shaded.protobuf;

import aa.C0012;
import android.graphics.Rect;
import androidx.compose.ui.platform.C0038;
import androidx.preference.C0044;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.components.C0135;
import com.google.firebase.installations.interop.C0173;
import dagger.hilt.android.migration.C0239;
import e2.C0261;
import g5.C0292;
import i6.C0320;
import java.io.ByteArrayOutputStream;
import k6.a5;
import k6.x7;
import k6.y3;
import m0.o3;
import n1.C0363;
import p8.C0380;
import q5.C0386;
import w5.C0464;
import y9.C0479;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.ۨۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0111 {

    /* JADX INFO: renamed from: ۟ۢۧۧۡ, reason: not valid java name and contains not printable characters */
    public static int f137 = -769;

    /* JADX INFO: renamed from: ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static o3 m2137() {
        if (C0044.m860() > 0) {
            return o3.f11621a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۨۥ, reason: not valid java name and contains not printable characters */
    public static Object m2139(Object obj) {
        if (C0038.m750() < 0) {
            return ((d5.i1) obj).f4577c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m2140(Object obj) {
        if (C0261.m4984() > 0) {
            return ((d5.z1) obj).f4875b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static void m2141(Object obj, Object obj2) {
        if (C0386.m7546() >= 0) {
            ((y3) obj).n((x7) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۡۨ, reason: not valid java name and contains not printable characters */
    public static c9.e m2142(Object obj) {
        if (C0464.m9033() >= 0) {
            return ((k0.l1) obj).f9157f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m2143() {
        return (-958) ^ C0135.f161;
    }

    /* JADX INFO: renamed from: ۠ۥۤ۟, reason: not valid java name and contains not printable characters */
    public static s.h0 m2144() {
        if (C0012.m226() > 0) {
            return s.h0.f13785c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡۡ, reason: not valid java name and contains not printable characters */
    public static int m2145(Object obj) {
        if (C0292.m5605() < 0) {
            return ((Rect) obj).centerX();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۧۡ, reason: not valid java name and contains not printable characters */
    public static int m2146(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۡ۟۠, reason: not valid java name and contains not printable characters */
    public static String m2147() {
        if (C0173.m3314() >= 0) {
            return "onboarding_title";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۧ, reason: not valid java name and contains not printable characters */
    public static Object m2148(Object obj, Object obj2) {
        if (C0320.m6181() > 0) {
            return ((f5.k) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۡۨ, reason: contains not printable characters */
    public static void m2149(Object obj, Object obj2) {
        if (C0380.m7433() >= 0) {
            ((y3) obj).f((x7) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۡ۟ۥ, reason: contains not printable characters */
    public static long m2150(Object obj) {
        if (C0479.m9326() <= 0) {
            return ((l2.q) obj).f11223a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۤۧۤ, reason: contains not printable characters */
    public static String m2151(String str) {
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
        int length = byteArray.length;
        int length2 = str2.length();
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m2152() {
        if (C0363.m7099() <= 0) {
            return "Error selecting expired configs";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۧ, reason: not valid java name and contains not printable characters */
    public static void m2153(Object obj, long j10) {
        if (C0239.m4587() <= 0) {
            ((a5) obj).E(j10);
        }
    }

    /* JADX INFO: renamed from: ۧۧۤۢ, reason: not valid java name and contains not printable characters */
    public static long m2154() {
        if (C0106.m2067() >= 0) {
            return l0.c.f11031w;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۥۤۡ, reason: not valid java name and contains not printable characters */
    public static String m2155(double d10) {
        if (C0114.m2205() <= 0) {
            return String.valueOf(d10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۧۧ, reason: not valid java name and contains not printable characters */
    public static String m2138(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
