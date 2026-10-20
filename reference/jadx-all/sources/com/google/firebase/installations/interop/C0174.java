package com.google.firebase.installations.interop;

import android.support.v4.graphics.drawable.C0016;
import com.google.firebase.appcheck.interop.C0129;
import d5.y1;
import f0.z;
import f1.C0274;
import h0.v0;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import k6.a8;
import k6.c4;
import k6.d7;
import k6.q3;
import l8.C0347;
import m0.C0350;
import n7.C0365;
import o1.s;
import o5.C0371;
import q.f;
import rikka.shizuku.C0407;
import t9.C0428;
import w0.o;
import w4.C0462;
import x7.C0473;

/* JADX INFO: renamed from: com.google.firebase.installations.interop.ۧ۟ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0174 {

    /* JADX INFO: renamed from: ۣ۟ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static int f198 = -169;

    /* JADX INFO: renamed from: ۣ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static long m3315(int i10, int i11, int i12) {
        if (C0350.m6838() < 0) {
            return s.b(i10, i11, i12);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۨۡۢ, reason: not valid java name and contains not printable characters */
    public static o m3316() {
        if (C0016.m315() >= 0) {
            return o.f16105b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۤ۟, reason: not valid java name and contains not printable characters */
    public static v0 m3317(Object obj) {
        if (C0129.m2492() >= 0) {
            return ((z) obj).f6013b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۨ۠, reason: not valid java name and contains not printable characters */
    public static f m3318(Object obj) {
        if (C0407.m7977() < 0) {
            return ((a8) obj).f9901g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۨ, reason: not valid java name and contains not printable characters */
    public static List m3319(Object obj) {
        if (C0428.m8371() <= 0) {
            return ((y1) obj).f4865a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static String m3320(Object obj, Object obj2) {
        if (C0365.m7147() < 0) {
            return ((c4) obj).b((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static d7 m3321(Object obj) {
        if (C0347.m6774() > 0) {
            return ((q3) obj).r();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۧۨ, reason: not valid java name and contains not printable characters */
    public static int m3322(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۡۢ, reason: contains not printable characters */
    public static int m3323() {
        return (-610) ^ C0462.f732;
    }

    /* JADX INFO: renamed from: ۦۣۢۡ, reason: contains not printable characters */
    public static int m3325(Object obj) {
        if (C0371.m7269() > 0) {
            return ((k0.s) obj).f9442a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۢۤ, reason: contains not printable characters */
    public static boolean m3326(Object obj) {
        if (C0473.m9193() < 0) {
            return ((f0.y1) obj).f6010b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۤۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3327(Object obj) {
        if (C0274.m5273() <= 0) {
            return ((Iterator) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۤۧۦ, reason: not valid java name and contains not printable characters */
    public static String m3328(String str) {
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

    /* JADX INFO: renamed from: ۦۡۥۡ, reason: contains not printable characters */
    public static String m3324(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
