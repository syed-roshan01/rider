package s8;

import androidx.compose.foundation.C0026;
import androidx.compose.ui.draw.C0028;
import c6.C0067;
import com.google.firebase.abt.C0113;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.remoteconfig.C0200;
import d1.d;
import d5.a2;
import d5.m;
import d9.C0227;
import dagger.hilt.android.lifecycle.C0238;
import dagger.hilt.internal.definecomponent.C0250;
import e2.C0263;
import e2.C0264;
import f0.n;
import f0.r;
import f6.C0278;
import fa.C0282;
import g2.s;
import j3.C0326;
import java.io.ByteArrayOutputStream;
import java.io.File;
import k0.l1;
import k0.m0;
import k0.m4;
import k0.w1;
import k6.u7;
import k6.x;
import k6.x3;
import k6.x7;
import l0.c;
import o4.C0370;
import u8.C0439;
import x.l;
import y.a1;
import y3.e;
import y6.C0478;

/* JADX INFO: renamed from: s8.۟ۥۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0417 {

    /* JADX INFO: renamed from: ۟ۥۣۤ۟, reason: not valid java name and contains not printable characters */
    public static int f687 = -672;

    /* JADX INFO: renamed from: ۟۟ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m8171() {
        if (C0250.m4779() <= 0) {
            return "मराठी";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m8172(Object obj) {
        if (C0200.m3841() < 0) {
            return ((x7) obj).B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟, reason: not valid java name and contains not printable characters */
    public static int m8173() {
        return (-154) ^ C0478.f751;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static x3 m8174() {
        if (C0326.m6295() >= 0) {
            return x.P;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m8175(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8176(Object obj) {
        if (C0278.m5361() < 0) {
            return e.b0((File) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m8177() {
        if (C0263.m5016() < 0) {
            return "last_exempt_from_sampling";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۨ, reason: not valid java name and contains not printable characters */
    public static long m8178(Object obj) {
        if (C0282.m5443() < 0) {
            return ((w1) obj).f9600a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡۦ, reason: not valid java name and contains not printable characters */
    public static void m8179(Object obj, Object obj2, Object obj3, int i10) {
        if (C0129.m2492() >= 0) {
            ((m) obj).b((a1) obj2, (m0.m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡۨۡ, reason: not valid java name and contains not printable characters */
    public static long m8180() {
        if (C0238.m4583() >= 0) {
            return c.f11029u;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static int m8181(Object obj) {
        if (C0439.m8564() >= 0) {
            return ((String) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤۦۥ, reason: not valid java name and contains not printable characters */
    public static l m8182(Object obj) {
        if (C0067.m1309() <= 0) {
            return ((l1) obj).f9166v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۠۟, reason: not valid java name and contains not printable characters */
    public static d m8183() {
        if (C0227.m4372() < 0) {
            return d.f4331e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۧ, reason: not valid java name and contains not printable characters */
    public static String m8184(Object obj) {
        if (C0264.m5033() <= 0) {
            return ((a2) obj).f4398a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static s m8185(Object obj) {
        if (C0028.m557() > 0) {
            return ((r) obj).f5865d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤ۟, reason: not valid java name and contains not printable characters */
    public static long m8186(Object obj) {
        if (C0113.m2182() < 0) {
            return ((m4) obj).f9230j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۦۧۤ, reason: contains not printable characters */
    public static int m8187(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8188(Object obj, Object obj2, Object obj3) {
        if (C0156.m2976() > 0) {
            return ((u7) obj).U((String) obj2, (String) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static s m8189(Object obj) {
        if (C0026.m508() > 0) {
            return ((n) obj).f5822e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۤۡ, reason: not valid java name and contains not printable characters */
    public static m0 m8190() {
        if (C0370.m7254() >= 0) {
            return m0.f9195e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m8170(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
