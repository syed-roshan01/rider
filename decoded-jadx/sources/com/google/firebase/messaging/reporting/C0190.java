package com.google.firebase.messaging.reporting;

import a.C0002;
import android.content.res.Resources;
import androidx.compose.ui.node.C0037;
import c9.e;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.tracing.C0204;
import d1.C0214;
import d5.f0;
import d5.i;
import d5.k2;
import d5.n0;
import f.C0269;
import g.C0282;
import java.io.ByteArrayOutputStream;
import k0.i3;
import k0.l2;
import k0.v4;
import k6.j5;
import k6.r7;
import l.q;
import l9.C0347;
import m0.l3;
import o5.C0370;
import v6.C0446;
import w5.C0462;

/* JADX INFO: renamed from: com.google.firebase.messaging.reporting.ۦۦۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0190 {

    /* JADX INFO: renamed from: ۟ۢۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int f214 = -37;

    /* JADX INFO: renamed from: ۟۟۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3624(Object obj) {
        if (C0002.m46() <= 0) {
            return ((i) obj).f4552a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static int m3625(Object obj) {
        if (C0037.m733() > 0) {
            return ((k2) obj).f4622r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static int m3626(Object obj) {
        if (C0120.m2311() <= 0) {
            return ((l2) obj).f9182s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static String m3627(String str) {
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

    /* JADX INFO: renamed from: ۟ۢ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static e m3628(Object obj) {
        if (C0282.m5446() >= 0) {
            return ((v4) obj).f9577r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۢۡ, reason: not valid java name and contains not printable characters */
    public static int m3629(float f10, int i10, int i11) {
        if (C0347.m6808() <= 0) {
            return q.a(f10, i10, i11);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡۡۢ, reason: not valid java name and contains not printable characters */
    public static int m3631(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0204.m3905() < 0) {
            return ((Resources) obj).getIdentifier((String) obj2, (String) obj3, (String) obj4);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۢۢۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m3632(Object obj, Object obj2) {
        if (C0269.m5152() > 0) {
            return ((r7) obj).T((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۢ, reason: not valid java name and contains not printable characters */
    public static int m3633(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static long m3634(Object obj) {
        if (C0370.m7269() > 0) {
            return ((i3) obj).f9035e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۦۣۤ, reason: not valid java name and contains not printable characters */
    public static String m3635(Object obj, Object obj2) {
        if (C0446.m8696() >= 0) {
            return String.format((String) obj, (Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static l3 m3636(Object obj) {
        if (C0214.m4096() > 0) {
            return ((n0) obj).f4691a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m3637(Object obj) {
        if (C0462.m9013() < 0) {
            return ((j5) obj).f10125f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static l3 m3638(Object obj) {
        if (C0214.m4096() >= 0) {
            return ((f0) obj).f4483c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۤۦ, reason: not valid java name and contains not printable characters */
    public static int m3639() {
        return (-788) ^ C0186.f210;
    }

    /* JADX INFO: renamed from: ۧۡۦۧ, reason: not valid java name and contains not printable characters */
    public static String m3640() {
        if (C0112.m2176() > 0) {
            return "SELECT COUNT(1) FROM conditional_properties WHERE app_id=?";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۨ۠, reason: not valid java name and contains not printable characters */
    public static String m3630(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
