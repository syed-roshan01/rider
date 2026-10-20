package com.google.firebase.auth.ktx;

import a.C0000;
import a5.w;
import android.os.BaseBundle;
import android.os.PowerManager;
import androidx.compose.ui.graphics.a;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.components.C0135;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.messaging.reporting.C0188;
import d5.e1;
import d5.j;
import d8.C0221;
import e6.c;
import i6.C0319;
import j6.C0328;
import java.io.ByteArrayOutputStream;
import k0.e4;
import k0.f4;
import k0.s1;
import k6.h7;
import k6.o;
import k6.r7;
import k6.t4;
import q.f;
import q2.C0384;
import q6.C0387;
import s0.C0410;
import w2.C0456;
import w5.C0463;
import w9.C0465;

/* JADX INFO: renamed from: com.google.firebase.auth.ktx.۟ۢۥۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0132 {

    /* JADX INFO: renamed from: ۟ۦۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int f158 = -215;

    /* JADX INFO: renamed from: ۟۠ۥۤۦ, reason: not valid java name and contains not printable characters */
    public static String m2539(String str) {
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
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m2540(Object obj) {
        if (C0319.m6181() > 0) {
            ((PowerManager.WakeLock) obj).release();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m2541() {
        if (C0000.m12() <= 0) {
            return "Error querying user property. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۥۡ, reason: not valid java name and contains not printable characters */
    public static f m2542(Object obj) {
        if (C0188.m3594() > 0) {
            return ((t4) obj).f10380d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۢۧ, reason: not valid java name and contains not printable characters */
    public static int m2543() {
        return (-132) ^ C0328.f476;
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۦ, reason: not valid java name and contains not printable characters */
    public static String m2544(Object obj, Object obj2) {
        if (C0144.m2767() >= 0) {
            return ((r7) obj).y((zzfi.zzi) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static Object m2545(Object obj, Object obj2) {
        if (C0387.m7585() > 0) {
            return ((w) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m2546(Object obj) {
        if (C0463.m9033() >= 0) {
            return ((j) obj).f4581a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static long m2547(Object obj) {
        if (C0221.m4264() >= 0) {
            return ((c) obj).a();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static int m2548(Object obj) {
        if (C0465.m9068() <= 0) {
            return ((o) obj).f10242a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤۨۢ, reason: not valid java name and contains not printable characters */
    public static String m2549(Object obj, Object obj2) {
        if (C0456.m8890() > 0) {
            return ((BaseBundle) obj).getString((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۡ۟, reason: not valid java name and contains not printable characters */
    public static f4 m2550(Object obj) {
        if (C0173.m3314() > 0) {
            return ((e4) obj).f8874a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۤۤ, reason: not valid java name and contains not printable characters */
    public static int m2551(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣۣۡ, reason: not valid java name and contains not printable characters */
    public static long m2552(Object obj) {
        if (C0384.m7527() <= 0) {
            return ((h7) obj).f10091b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static float m2553() {
        if (C0135.m2608() <= 0) {
            return s1.f9446b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۧۢۢ, reason: not valid java name and contains not printable characters */
    public static int m2554(Object obj) {
        if (C0156.m2976() > 0) {
            return ((e1) obj).f4471a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥۦۢ, reason: contains not printable characters */
    public static long m2555(long j10, long j11) {
        if (C0410.m8063() > 0) {
            return a.j(j10, j11);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m2538(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
