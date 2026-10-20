package d1;

import androidx.appcompat.widget.C0020;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.stats.C0101;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.remote.C0164;
import d.C0211;
import d7.C0221;
import d7.t;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import k0.i3;
import k6.p7;
import k6.q;
import k6.q6;
import k6.r7;
import k6.x7;
import m0.m;
import m7.C0357;
import o7.d0;
import o9.r;
import q6.C0389;
import r2.C0396;
import t1.c1;
import t2.C0421;
import u1.C0432;
import x5.C0471;
import y0.o;

/* JADX INFO: renamed from: d1.۟۟ۥۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0212 {

    /* JADX INFO: renamed from: ۣ۟ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static int f235 = 554;

    /* JADX INFO: renamed from: ۟۟ۦۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4031(int i10, int i11) {
        if (C0086.m1846() >= 0) {
            return z6.a.z(i10, i11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static androidx.compose.ui.node.a m4032(Object obj) {
        if (C0357.m6984() > 0) {
            return ((c1) obj).f14395p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static long m4033(Object obj) {
        if (C0211.m4028() <= 0) {
            return ((x7) obj).f10561z;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m4034(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, Object obj5, int i10, int i11) {
        if (C0471.m9151() >= 0) {
            d0.a((String) obj, (String) obj2, (String) obj3, z10, (c9.a) obj4, (m) obj5, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۦ۠, reason: not valid java name and contains not printable characters */
    public static Object m4035(Object obj, Object obj2, Object obj3) {
        if (C0020.m399() <= 0) {
            return ((Map) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static r7 m4037(Object obj) {
        if (C0101.m1975() >= 0) {
            return ((p7) obj).L();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m4038(Object obj, Object obj2, Object obj3) {
        if (C0164.m3153() > 0) {
            return t.E((r) obj, (c9.a) obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m4039(Object obj, Object obj2, long j10, Object obj3) {
        if (C0421.m8263() > 0) {
            ((q) obj).v((String) obj2, j10, (q6) obj3);
        }
    }

    /* JADX INFO: renamed from: ۢۧۥۥ, reason: not valid java name and contains not printable characters */
    public static String m4040(String str) {
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

    /* JADX INFO: renamed from: ۣۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4041(Object obj, long j10) {
        if (C0432.m8447() <= 0) {
            return ((m0.q) obj).f(j10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠ۧۦ, reason: contains not printable characters */
    public static String m4042() {
        if (C0151.m2903() > 0) {
            return "action";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۧۡ, reason: not valid java name and contains not printable characters */
    public static o m4043(Object obj) {
        if (C0221.m4261() > 0) {
            return ((i3) obj).f9032b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡ۟, reason: not valid java name and contains not printable characters */
    public static void m4044(Object obj, Object obj2) {
        if (C0389.m7600() < 0) {
            y3.e.Q0((ByteArrayOutputStream) obj, (y3.c) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static int m4045(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۤۦ, reason: not valid java name and contains not printable characters */
    public static int m4046() {
        return 152 ^ C0396.f666;
    }

    /* JADX INFO: renamed from: ۟ۥۢۤۧ, reason: not valid java name and contains not printable characters */
    public static String m4036(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
