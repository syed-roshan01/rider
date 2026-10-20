package m1;

import a2.C0005;
import android.content.Context;
import androidx.compose.ui.graphics.C0032;
import androidx.lifecycle.C0043;
import c1.C0061;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.ktx.C0180;
import d4.C0218;
import d5.b2;
import d5.m0;
import d5.o0;
import dagger.hilt.internal.generatesrootinput.C0251;
import ea.C0269;
import f4.C0276;
import g2.C0288;
import g4.C0290;
import i6.C0320;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.regex.Matcher;
import k0.c3;
import k3.C0336;
import k6.h;
import k6.p5;
import k6.p7;
import k6.t5;
import k6.u;
import l8.C0347;
import m0.l3;
import m0.q2;
import q6.l;
import r2.C0398;
import t8.C0427;
import u.C0429;
import w.C0454;

/* JADX INFO: renamed from: m1.ۣۡ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0352 {

    /* JADX INFO: renamed from: ۥۦۨۤ, reason: contains not printable characters */
    public static int f622 = 534;

    /* JADX INFO: renamed from: ۟۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m6879(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static int m6880(Object obj) {
        if (C0269.m5123() > 0) {
            return ((Collection) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m6882(String str) {
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

    /* JADX INFO: renamed from: ۟ۥ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static h m6883() {
        if (C0032.m620() <= 0) {
            return h.f10074a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۢ۠, reason: not valid java name and contains not printable characters */
    public static String m6884(Object obj) {
        if (C0290.m5580() < 0) {
            return ((f5.c) obj).f6238a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۨۥ, reason: not valid java name and contains not printable characters */
    public static int m6885() {
        return 194 ^ C0043.f63;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۤ, reason: not valid java name and contains not printable characters */
    public static void m6886(Object obj) {
        if (C0276.m5308() >= 0) {
            ((l) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۠ۦۡۤ, reason: not valid java name and contains not printable characters */
    public static String[] m6887() {
        if (C0251.m4793() > 0) {
            return t5.f10395e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m6888(Object obj, Object obj2) {
        if (C0005.m104() > 0) {
            return ((o0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۥ, reason: not valid java name and contains not printable characters */
    public static int[] m6889(Object obj) {
        if (C0398.m7764() <= 0) {
            return ((q2) obj).f11666b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۢ۠, reason: not valid java name and contains not printable characters */
    public static long m6890(Object obj) {
        if (C0454.m8831() <= 0) {
            return ((zzfi.zzj) obj).zzo();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۡۦ, reason: not valid java name and contains not printable characters */
    public static String m6891(Object obj, int i10) {
        if (C0061.m1161() <= 0) {
            return ((Matcher) obj).group(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m6892(Object obj) {
        if (C0347.m6774() > 0) {
            return ((zzfi.zzj) obj).zzad();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠۟, reason: not valid java name and contains not printable characters */
    public static String m6893() {
        if (C0347.m6774() > 0) {
            return "com.google.android.gms.measurement.AppMeasurementJobService";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m6894(Object obj) {
        if (C0336.m6500() <= 0) {
            return ((u) obj).f10411b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۢۦ, reason: contains not printable characters */
    public static l3 m6895(Object obj) {
        if (C0320.m6181() >= 0) {
            return ((b2) obj).f4424p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۥۧ, reason: contains not printable characters */
    public static u0.b m6896() {
        if (C0218.m4144() > 0) {
            return k0.o0.f9285b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۨ, reason: contains not printable characters */
    public static int m6897(Object obj) {
        if (C0288.m5529() > 0) {
            return ((c3) obj).f8799o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۨۢ, reason: contains not printable characters */
    public static HashMap m6898(Object obj) {
        if (C0180.m3448() >= 0) {
            return ((p7) obj).B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨۦ, reason: contains not printable characters */
    public static Context m6899(Object obj) {
        if (C0427.m8356() <= 0) {
            return ((p5) obj).zza();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۦ, reason: not valid java name and contains not printable characters */
    public static int m6900(Object obj) {
        if (C0429.m8409() <= 0) {
            return ((m0) obj).f4673b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۨۢۢ, reason: not valid java name and contains not printable characters */
    public static String m6881(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
