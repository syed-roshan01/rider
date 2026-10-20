package com.google.firebase.messaging.ktx;

import android.graphics.Bitmap;
import androidx.lifecycle.C0043;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.heartbeatinfo.C0167;
import d5.l;
import d5.s;
import e1.n;
import f0.h;
import h7.C0311;
import j9.C0330;
import ja.C0331;
import java.io.ByteArrayOutputStream;
import k0.f;
import k0.m1;
import k6.t4;
import k6.v4;
import m2.a;
import m2.b;
import q0.C0383;
import r2.C0397;
import s3.C0413;
import w2.C0457;
import w6.C0465;
import y.C0475;
import y.i1;
import y3.c;

/* JADX INFO: renamed from: com.google.firebase.messaging.ktx.ۦۣۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0186 {

    /* JADX INFO: renamed from: ۟ۢۢۤۦ, reason: not valid java name and contains not printable characters */
    public static int f210 = -332;

    /* JADX INFO: renamed from: ۟۟۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static n m3546(Object obj) {
        if (C0475.m9246() <= 0) {
            return ((h) obj).f5718o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static long m3547(long j10, int i10, int i11, int i12, int i13, int i14) {
        if (C0089.m1902() < 0) {
            return a.b(j10, i10, i11, i12, i13, i14);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m3548() {
        return 667 ^ C0397.f667;
    }

    /* JADX INFO: renamed from: ۟۟ۨۥ۠, reason: not valid java name and contains not printable characters */
    public static float m3549(Object obj) {
        if (C0167.m3200() > 0) {
            return ((f) obj).f8897c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static m1 m3550() {
        if (C0413.m8089() < 0) {
            return m1.f9202a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۧۧ, reason: not valid java name and contains not printable characters */
    public static l m3551() {
        if (C0465.m9059() < 0) {
            return l.f4641y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m3552() {
        if (C0330.m6367() > 0) {
            return "last_bundle_end_timestamp";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۣ, reason: not valid java name and contains not printable characters */
    public static String m3553(Object obj) {
        if (C0311.m5997() > 0) {
            return ((StackTraceElement) obj).getClassName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡ۠, reason: not valid java name and contains not printable characters */
    public static long m3554() {
        if (C0081.m1735() > 0) {
            return zzne.zzv();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m3555(Object obj) {
        if (C0086.m1846() >= 0) {
            return ((zzfi.zzl) obj).zzc();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m3557(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۦۢ۟, reason: not valid java name and contains not printable characters */
    public static String m3558(String str) {
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

    /* JADX INFO: renamed from: ۢ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static int m3559(Object obj, Object obj2) {
        if (C0043.m833() > 0) {
            return ((i1) obj).b((b) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۡ۠۟, reason: not valid java name and contains not printable characters */
    public static Bitmap.Config m3560() {
        if (C0114.m2205() < 0) {
            return Bitmap.Config.ARGB_8888;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠, reason: not valid java name and contains not printable characters */
    public static t4 m3561(Object obj) {
        if (C0331.m6374() >= 0) {
            return ((v4) obj).f10439a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۥۥ, reason: contains not printable characters */
    public static int m3562(Object obj) {
        if (C0457.m8890() >= 0) {
            return ((c) obj).f16891g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨۦ, reason: contains not printable characters */
    public static u0.b m3563() {
        if (C0383.m7487() <= 0) {
            return s.f4763g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۧۨ, reason: not valid java name and contains not printable characters */
    public static String m3564(Object obj) {
        if (C0153.m2938() < 0) {
            return ((f5.l) obj).f6291d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣ۟, reason: not valid java name and contains not printable characters */
    public static String m3556(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
