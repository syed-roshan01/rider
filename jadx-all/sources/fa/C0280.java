package fa;

import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.annotations.C0127;
import com.google.gson.internal.sql.C0208;
import f0.b1;
import f5.b0;
import g7.C0293;
import h5.C0308;
import j5.C0328;
import java.io.ByteArrayOutputStream;
import javax.net.ssl.SSLSocket;
import k.C0332;
import k0.i0;
import k0.m4;
import k0.p1;
import k6.a5;
import k6.c4;
import k6.g5;
import m1.C0351;
import p7.C0379;
import z3.C0486;

/* JADX INFO: renamed from: fa.ۢۤۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0280 {

    /* JADX INFO: renamed from: ۢ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f424 = -118;

    /* JADX INFO: renamed from: ۟۟۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static void m5400(Object obj, Object obj2) {
        if (C0328.m6319() <= 0) {
            ((SSLSocket) obj).setEnabledProtocols((String[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m5401(Object obj) {
        if (C0078.m1692() >= 0) {
            return ((a5) obj).f9882q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static g5 m5402(Object obj) {
        if (C0351.m6878() < 0) {
            return ((c4) obj).f9932a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m5403(Object obj) {
        if (C0080.m1729() < 0) {
            return ((q8.f) obj).f13226b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static long m5404(Object obj) {
        if (C0332.m6408() < 0) {
            return ((i0) obj).f9006j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static h1.c m5405(int i10, Object obj) {
        if (C0208.m3984() < 0) {
            return i1.b.B(i10, (m0.m) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۨ, reason: not valid java name and contains not printable characters */
    public static int m5406() {
        return (-387) ^ C0308.f455;
    }

    /* JADX INFO: renamed from: ۟ۦۥۢ۟, reason: not valid java name and contains not printable characters */
    public static int m5407(Object obj) {
        if (C0486.m9449() < 0) {
            return ((b0) obj).f6233b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m5408(Object obj) {
        if (C0073.m1597() > 0) {
            return ((d5.a) obj).f4383a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۦ, reason: not valid java name and contains not printable characters */
    public static String m5409(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i11 = 0; i11 < length; i11++) {
            byteArray[i11] = (byte) (byteArray[i11] ^ str2.charAt(i11 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m5410(Object obj) {
        if (C0091.m1940() <= 0) {
            return ((f5.l) obj).f6288a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۥۧ, reason: contains not printable characters */
    public static int m5411(int i10) {
        if (C0379.m7420() > 0) {
            return Integer.hashCode(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۤۥۢ, reason: not valid java name and contains not printable characters */
    public static int m5412(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۤۧۡ, reason: not valid java name and contains not printable characters */
    public static b1 m5413(Object obj) {
        if (C0293.m5634() <= 0) {
            return ((p1) obj).f9349w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static long m5415(Object obj) {
        if (C0127.m2448() > 0) {
            return ((m4) obj).f9227g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨۡۥ, reason: not valid java name and contains not printable characters */
    public static String m5414(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
