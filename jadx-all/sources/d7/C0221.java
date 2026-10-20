package d7;

import a2.z;
import android.net.Uri;
import b7.C0053;
import com.auto.accept.data.model.AppConfig;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.emulators.C0140;
import com.google.firebase.messaging.C0192;
import d9.C0227;
import dagger.hilt.C0256;
import dagger.hilt.android.internal.migration.C0233;
import e2.C0263;
import f0.C0273;
import g0.C0286;
import g7.C0293;
import ia.C0323;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import javax.net.ssl.SSLSocket;
import k0.m0;
import k6.r5;
import k7.C0338;
import m0.l3;
import m0.q2;
import q0.C0382;
import s0.C0410;
import u8.C0439;
import w6.C0465;
import x2.C0468;
import y6.C0477;

/* JADX INFO: renamed from: d7.ۢۧۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0221 {

    /* JADX INFO: renamed from: ۟ۢۧۤۦ, reason: not valid java name and contains not printable characters */
    public static int f300 = -125;

    /* JADX INFO: renamed from: ۟۟۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static void m4240(Object obj, int i10) {
        if (C0468.m9101() < 0) {
            ((q2) obj).N(i10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static int m4241(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static String m4242(Object obj, Object obj2, Object obj3) {
        if (C0192.m3659() >= 0) {
            return l.q.k((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۤۦ, reason: not valid java name and contains not printable characters */
    public static m0 m4243() {
        if (C0286.m5504() >= 0) {
            return m0.f9199p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static String m4244(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static void m4245(Object obj, Object obj2, int i10) {
        if (C0323.m6244() >= 0) {
            y.p.a((y0.o) obj, (m0.m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static m0 m4246() {
        if (C0477.m9298() <= 0) {
            return m0.f9198o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦۧ, reason: not valid java name and contains not printable characters */
    public static void m4247(Object obj, Object obj2) {
        if (C0227.m4372() <= 0) {
            ((SSLSocket) obj).setEnabledCipherSuites((String[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۢۢ, reason: not valid java name and contains not printable characters */
    public static r5 m4248() {
        if (C0273.m5249() < 0) {
            return r5.f10343d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۠۠, reason: not valid java name and contains not printable characters */
    public static int m4249(Object obj) {
        if (C0293.m5634() < 0) {
            return ((ja.i) obj).y();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Object m4250(Object obj, Object obj2, Object obj3) {
        if (C0338.m6638() <= 0) {
            return ((a5.j) obj).i((String) obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۨۤ, reason: not valid java name and contains not printable characters */
    public static t0.b m4251() {
        if (C0136.m2627() >= 0) {
            return t0.b.f14367a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m4252(Object obj) {
        if (C0256.m4876() < 0) {
            return ((Uri) obj).getPath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦۣ, reason: not valid java name and contains not printable characters */
    public static void m4253(Object obj) {
        if (C0053.m1029() < 0) {
            ((OutputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۢۡۡۦ, reason: not valid java name and contains not printable characters */
    public static String m4254(Object obj) {
        if (C0410.m8037() < 0) {
            return ((AppConfig) obj).getUpdatePageUrl();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۤۧ, reason: not valid java name and contains not printable characters */
    public static l3 m4255(Object obj) {
        if (C0439.m8564() >= 0) {
            return ((d5.e) obj).f4457a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int m4256() {
        if (C0465.m9059() <= 0) {
            return l0.h.f11058c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۧ, reason: not valid java name and contains not printable characters */
    public static g2.s m4257(Object obj) {
        if (C0140.m2699() > 0) {
            return ((f0.u) obj).f5963y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۦۢ, reason: contains not printable characters */
    public static int m4258(Object obj) {
        if (C0233.m4482() > 0) {
            return ((z7.b) obj).f17322b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۨۧ, reason: not valid java name and contains not printable characters */
    public static f2.d m4260(Object obj) {
        if (C0382.m7481() > 0) {
            return ((z) obj).f1060i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static int m4261() {
        return 458 ^ C0263.f342;
    }

    /* JADX INFO: renamed from: ۧۡۢ۠, reason: not valid java name and contains not printable characters */
    public static String m4259(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
