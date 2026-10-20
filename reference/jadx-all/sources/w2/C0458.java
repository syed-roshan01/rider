package w2;

import android.content.Context;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.platforminfo.C0193;
import d5.f1;
import dagger.hilt.internal.C0253;
import f4.C0275;
import g7.C0293;
import h1.C0301;
import h6.g;
import i1.f;
import j4.C0327;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import k0.m4;
import k6.c7;
import k6.g6;
import k6.s6;
import k6.x7;
import k6.y3;
import m0.g1;
import m0.y2;
import m2.l;
import n.C0361;
import n1.C0363;
import p0.C0375;
import r7.C0404;
import z8.C0492;

/* JADX INFO: renamed from: w2.ۤ۠ۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0458 {

    /* JADX INFO: renamed from: ۠ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static int f728 = 321;

    /* JADX INFO: renamed from: ۣ۟۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m8901() {
        return (-507) ^ C0361.f631;
    }

    /* JADX INFO: renamed from: ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static f m8902() {
        if (C0327.m6304() <= 0) {
            return g.k0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static Context m8903(Object obj) {
        if (C0157.m2999() > 0) {
            return ((y3.f) obj).f16910b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m8904(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Object m8905(Object obj) {
        if (C0301.m5773() <= 0) {
            return ((g6) obj).f10068e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۦ, reason: not valid java name and contains not printable characters */
    public static int m8906(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۥۡۤ, reason: not valid java name and contains not printable characters */
    public static long m8907(Object obj) {
        if (C0144.m2767() > 0) {
            return ((m4) obj).N;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۦۢ۠, reason: not valid java name and contains not printable characters */
    public static void m8908(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0293.m5634() <= 0) {
            ((s6) obj).y((y3) obj2, (a6.a) obj3, (x7) obj4);
        }
    }

    /* JADX INFO: renamed from: ۠۟۟۟, reason: not valid java name and contains not printable characters */
    public static Object m8909(Object obj) {
        if (C0153.m2938() <= 0) {
            return ((y2) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۣۡ, reason: not valid java name and contains not printable characters */
    public static HashMap m8910(Object obj) {
        if (C0193.m3691() < 0) {
            return ((c7) obj).f9941d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۤۨ, reason: not valid java name and contains not printable characters */
    public static g1 m8911(Object obj) {
        if (C0375.m7350() < 0) {
            return ((d5.g1) obj).f4528y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m8912(Object obj, double d10) {
        if (C0492.m9566() >= 0) {
            return ((StringBuilder) obj).append(d10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۦۣ, reason: contains not printable characters */
    public static boolean m8913(Object obj) {
        if (C0253.m4832() <= 0) {
            return ((f1) obj).f4484a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥۢۨ, reason: contains not printable characters */
    public static l m8914(Object obj) {
        if (C0404.m7911() < 0) {
            return ((g1.g) obj).getLayoutDirection();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۦۥ, reason: contains not printable characters */
    public static void m8915(Object obj, long j10) throws InterruptedException {
        if (C0363.m7099() <= 0) {
            obj.wait(j10);
        }
    }

    /* JADX INFO: renamed from: ۨۢۡۥ, reason: not valid java name and contains not printable characters */
    public static String m8916() {
        if (C0275.m5286() < 0) {
            return "shizuku_permission_desc";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static String m8900(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
