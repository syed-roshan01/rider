package dagger.hilt.android.components;

import c1.C0060;
import c9.e;
import c9.f;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.messaging.C0192;
import d5.b0;
import d5.k2;
import d7.a;
import d9.C0224;
import f5.e0;
import f5.g0;
import fa.C0281;
import g2.l0;
import java.io.ByteArrayOutputStream;
import k0.j4;
import k0.n2;
import k0.o1;
import k6.x;
import k6.x3;
import m0.l3;
import m0.m;
import p8.C0381;
import q0.C0382;
import u4.C0437;
import v9.C0453;
import y.i1;

/* JADX INFO: renamed from: dagger.hilt.android.components.۟ۦۦۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0229 {

    /* JADX INFO: renamed from: ۟۠ۦۢۥ, reason: not valid java name and contains not printable characters */
    public static int f308 = -572;

    /* JADX INFO: renamed from: ۟۠ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static l0 m4393(Object obj) {
        if (C0060.m1148() > 0) {
            return ((o1) obj).f9302v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Object m4394(Object obj) {
        if (C0281.m5432() >= 0) {
            return ((g0) obj).f6260b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static String m4395(String str) {
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

    /* JADX INFO: renamed from: ۟ۥ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4397(Object obj) {
        if (C0381.m7467() >= 0) {
            return ((b0) obj).f4405a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤ۠, reason: not valid java name and contains not printable characters */
    public static x3 m4398() {
        if (C0453.m8825() > 0) {
            return x.f10505r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4399(Object obj, Object obj2) {
        if (C0192.m3659() >= 0) {
            return a.d(obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static l3 m4400(Object obj) {
        if (C0382.m7481() >= 0) {
            return ((k2) obj).f4621q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m4401() {
        if (C0174.m3323() <= 0) {
            return "Loaded invalid null value from database";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static int m4402() {
        return (-264) ^ C0060.f80;
    }

    /* JADX INFO: renamed from: ۤۨۨ۟, reason: not valid java name and contains not printable characters */
    public static int m4403(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥ۟ۢۥ, reason: contains not printable characters */
    public static void m4404(int i10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11) {
        if (C0437.m8524() <= 0) {
            n2.c(i10, (e) obj, (f) obj2, (e) obj3, (e) obj4, (i1) obj5, (e) obj6, (m) obj7, i11);
        }
    }

    /* JADX INFO: renamed from: ۥۧ۟ۨ, reason: contains not printable characters */
    public static u8.e m4405(Object obj, Object obj2, Object obj3) {
        if (C0116.m2247() >= 0) {
            return ((e0) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static e m4406(Object obj) {
        if (C0224.m4304() < 0) {
            return ((j4) obj).f9078c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟۠, reason: not valid java name and contains not printable characters */
    public static String m4396(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
