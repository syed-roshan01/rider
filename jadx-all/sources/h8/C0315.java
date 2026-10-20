package h8;

import a.C0000;
import androidx.compose.foundation.layout.C0021;
import c7.C0069;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.concurrent.C0137;
import d5.l1;
import d5.p1;
import dagger.hilt.android.C0241;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.internal.C0253;
import dagger.hilt.internal.processedrootsentinel.C0252;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import k0.f0;
import k0.p3;
import k0.y3;
import k6.a5;
import la.C0349;
import m0.p0;
import q1.C0384;
import q6.C0389;
import r4.C0399;
import s0.C0410;
import t2.C0421;
import u.C0429;
import w.C0454;
import w4.C0460;
import y.j1;
import y.t0;

/* JADX INFO: renamed from: h8.۟ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0315 {

    /* JADX INFO: renamed from: ۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f462 = 258;

    /* JADX INFO: renamed from: ۟۟۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m6076() {
        if (C0384.m7523() <= 0) {
            return "main_event";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static g9.a m6077() {
        if (C0389.m7600() < 0) {
            return g9.d.f7314b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static int m6079() {
        return 729 ^ C0021.f41;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static t0 m6080(Object obj) {
        if (C0410.m8037() <= 0) {
            return ((f0) obj).f8908p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m6081(Object obj) {
        if (C0399.m7797() <= 0) {
            return ((l1) obj).f4650a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Locale m6082() {
        if (C0000.m12() < 0) {
            return Locale.ENGLISH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۡۦ, reason: not valid java name and contains not printable characters */
    public static void m6083(Object obj, boolean z10, boolean z11, Object obj2, Object obj3, int i10) {
        if (C0241.m4609() >= 0) {
            y3.e.r((p1) obj, z10, z11, (c9.a) obj2, (m0.m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static List m6084(Object obj, int i10, int i11) {
        if (C0421.m8263() >= 0) {
            return ((List) obj).subList(i10, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۥۣ, reason: not valid java name and contains not printable characters */
    public static y3.d m6085(Object obj) {
        if (C0252.m4811() < 0) {
            return ((y3.b) obj).f16878b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m6086(String str) {
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

    /* JADX INFO: renamed from: ۡۡۡۦ, reason: not valid java name and contains not printable characters */
    public static long m6087() {
        if (C0253.m4832() < 0) {
            return e5.a.f5138n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۢۢ۟, reason: not valid java name and contains not printable characters */
    public static y3.c[] m6088(Object obj, Object obj2, Object obj3) {
        if (C0130.m2511() > 0) {
            return y3.e.y0((FileInputStream) obj, (byte[]) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۢ, reason: not valid java name and contains not printable characters */
    public static float m6089(Object obj) {
        if (C0454.m8831() <= 0) {
            return ((a2.a) obj).b();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۧ۠۠, reason: not valid java name and contains not printable characters */
    public static void m6090(Object obj, Object obj2, int i10) {
        if (C0460.m8951() <= 0) {
            ((y3) obj).a((m0.m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۤۨۨۤ, reason: not valid java name and contains not printable characters */
    public static String m6091() {
        if (C0399.m7797() <= 0) {
            return "debug.firebase.analytics.app";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۦۧ, reason: contains not printable characters */
    public static String m6092(Object obj) {
        if (C0137.m2646() < 0) {
            return ((a5) obj).f9875j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۦۥ, reason: contains not printable characters */
    public static int m6093(int i10, int i11, int i12) {
        if (C0231.m4440() > 0) {
            return z6.a.r(i10, i11, i12);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۡۥ, reason: not valid java name and contains not printable characters */
    public static int m6094(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۧۦۥ, reason: not valid java name and contains not printable characters */
    public static WeakHashMap m6095() {
        if (C0349.m6818() <= 0) {
            return j1.f16584u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static p0 m6096() {
        if (C0069.m1332() < 0) {
            return p3.f9358a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۦۧ, reason: not valid java name and contains not printable characters */
    public static Object m6097(Object obj) {
        if (C0429.m8409() < 0) {
            return ((Map.Entry) obj).getKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۢۦ, reason: not valid java name and contains not printable characters */
    public static String m6078(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
