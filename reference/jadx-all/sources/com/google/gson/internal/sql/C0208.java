package com.google.gson.internal.sql;

import a.C0000;
import a5.s;
import c3.C0063;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.firebase.abt.C0113;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.installations.local.C0176;
import e0.C0257;
import e7.C0265;
import f0.k1;
import f0.n;
import f4.y;
import f5.z;
import g9.C0295;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k1.C0333;
import k6.p7;
import k6.t4;
import k6.x7;
import k6.z4;
import q1.C0384;
import s7.C0415;
import v9.C0452;
import w0.p;
import y0.o;
import z4.f;

/* JADX INFO: renamed from: com.google.gson.internal.sql.ۣ۟ۧۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0208 {

    /* JADX INFO: renamed from: ۟۠۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static int f232 = 354;

    /* JADX INFO: renamed from: ۣ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static int m3971(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static Object m3972(Object obj) {
        if (C0452.m8793() <= 0) {
            return ((z) obj).f6343a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۧ, reason: not valid java name and contains not printable characters */
    public static List m3973(Object obj) {
        if (C0000.m12() < 0) {
            return ((zzfc.zza) obj).zze();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static long m3974(Object obj) {
        if (C0063.m1217() > 0) {
            return ((f) obj).f17234d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۢۤۢ, reason: not valid java name and contains not printable characters */
    public static o m3975(Object obj, Object obj2) {
        if (C0415.m8130() < 0) {
            return androidx.compose.ui.layout.a.g((o) obj, (c9.f) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m3976() {
        if (C0384.m7523() <= 0) {
            return l0.d.f11037c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static void m3977(Object obj) {
        if (C0333.m6454() <= 0) {
            ((k1) obj).e();
        }
    }

    /* JADX INFO: renamed from: ۠ۦۦۢ, reason: not valid java name and contains not printable characters */
    public static q.f m3978(Object obj) {
        if (C0113.m2182() <= 0) {
            return ((t4) obj).f10382f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static z4 m3979(Object obj) {
        if (C0415.m8130() <= 0) {
            return ((y) obj).zzl();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۦ, reason: not valid java name and contains not printable characters */
    public static String m3980(Object obj) {
        if (C0176.m3367() < 0) {
            return ((s) obj).f1303d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3981(Object obj) {
        if (C0265.m5062() <= 0) {
            return p7.I((x7) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۥۥۥ, reason: not valid java name and contains not printable characters */
    public static String m3982(String str) {
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

    /* JADX INFO: renamed from: ۦۨۧۥ, reason: contains not printable characters */
    public static int m3984() {
        return 452 ^ C0295.f442;
    }

    /* JADX INFO: renamed from: ۧ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static g2.o m3985(Object obj) {
        if (C0257.m4901() <= 0) {
            return ((n) obj).f5821d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m3986() {
        if (C0176.m3367() <= 0) {
            return p.f16116i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static long m3987(Object obj) {
        if (C0080.m1729() <= 0) {
            return ((k0.e) obj).f8855s;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m3988(Object obj, int i10) {
        if (C0132.m2543() <= 0) {
            return ((g2.s) obj).a(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۧۡ, reason: contains not printable characters */
    public static String m3983(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
