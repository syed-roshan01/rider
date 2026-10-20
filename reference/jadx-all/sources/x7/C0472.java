package x7;

import a2.C0005;
import android.os.SystemClock;
import android.support.v4.app.C0015;
import android.view.View;
import b7.C0053;
import c9.c;
import c9.e;
import com.google.android.gms.common.api.internal.C0083;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.messaging.C0191;
import d4.C0218;
import d9.i;
import dagger.hilt.components.C0244;
import e2.C0262;
import f5.z;
import java.io.ByteArrayOutputStream;
import k0.a2;
import k0.p1;
import k4.C0337;
import k6.d4;
import k6.f4;
import k6.f5;
import k6.g4;
import k6.n7;
import k6.u7;
import k6.v;
import l2.p;
import m0.m;
import m0.q;
import m0.s;
import o4.C0370;
import s8.C0417;
import u4.C0436;
import v.y0;
import w2.C0459;
import y.t0;
import y0.o;
import z.C0481;
import z.g0;

/* JADX INFO: renamed from: x7.۟۟ۦۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0472 {

    /* JADX INFO: renamed from: ۟ۦۣۢۥ, reason: not valid java name and contains not printable characters */
    public static int f742 = 124;

    /* JADX INFO: renamed from: ۟ۢۡۤۡ, reason: not valid java name and contains not printable characters */
    public static f4 m9169(Object obj) {
        if (C0459.m8930() >= 0) {
            return ((d4) obj).f9969k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static String m9170(Object obj) {
        if (C0436.m8516() >= 0) {
            return ((v) obj).f10433c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟۠, reason: not valid java name and contains not printable characters */
    public static String m9171(Object obj) {
        if (C0218.m4144() > 0) {
            return d4.u((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۧۥ, reason: not valid java name and contains not printable characters */
    public static int m9172(Object obj) {
        if (C0154.m2958() <= 0) {
            return ((a2) obj).f8714a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۟۠, reason: not valid java name and contains not printable characters */
    public static void m9173(Object obj) {
        if (C0142.m2725() >= 0) {
            ((q) obj).v();
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static float m9174(Object obj) {
        if (C0337.m6515() < 0) {
            return ((k0.d4) obj).f8836a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۤ, reason: not valid java name and contains not printable characters */
    public static long m9175(Object obj) {
        if (C0459.m8930() >= 0) {
            return ((n7) obj).f10239d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۨ, reason: not valid java name and contains not printable characters */
    public static void m9176(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, Object obj5, Object obj6, boolean z11, Object obj7, Object obj8, int i10, int i11) {
        if (C0191.m3643() >= 0) {
            i.d((o) obj, (g0) obj2, (t0) obj3, z10, (y.i) obj4, (y0.b) obj5, (y0) obj6, z11, (c) obj7, (m) obj8, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static long m9177(Object obj) {
        if (C0481.m9354() < 0) {
            return ((g4) obj).f10061c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۡۦۣ, reason: not valid java name and contains not printable characters */
    public static int m9179(Object obj) {
        if (C0136.m2627() > 0) {
            return ((z) obj).f6347e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦۧ۟, reason: not valid java name and contains not printable characters */
    public static void m9180(Object obj, int i10) {
        if (C0417.m8173() < 0) {
            ((View) obj).setBackgroundColor(i10);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static String m9181(String str) {
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

    /* JADX INFO: renamed from: ۣۢۤۤ, reason: not valid java name and contains not printable characters */
    public static void m9182(long j10) {
        if (C0370.m7254() >= 0) {
            SystemClock.sleep(j10);
        }
    }

    /* JADX INFO: renamed from: ۣۥۧۡ, reason: not valid java name and contains not printable characters */
    public static float m9183(Object obj) {
        if (C0083.m1779() > 0) {
            return ((p) obj).f11221b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۨۢ, reason: not valid java name and contains not printable characters */
    public static int m9184(Object obj) {
        if (C0053.m1029() <= 0) {
            return ((p1) obj).H;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static u7 m9185(Object obj) {
        if (C0173.m3314() > 0) {
            return ((f5) obj).f10035l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۟۟, reason: contains not printable characters */
    public static int m9186(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۥۨۨ, reason: contains not printable characters */
    public static y3.c[] m9187(Object obj) {
        if (C0005.m104() >= 0) {
            return ((y3.b) obj).f16883g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۡ۟, reason: not valid java name and contains not printable characters */
    public static String m9188(Object obj) {
        if (C0015.m294() < 0) {
            return ((k6.o) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۢ۟, reason: not valid java name and contains not printable characters */
    public static void m9189(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0262.m4991() > 0) {
            s.c(obj, obj2, (e) obj3, (m) obj4);
        }
    }

    /* JADX INFO: renamed from: ۨۨۦۦ, reason: not valid java name and contains not printable characters */
    public static int m9190() {
        return (-22) ^ C0244.f323;
    }

    /* JADX INFO: renamed from: ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static String m9178(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
