package w1;

import b.C0049;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.measurement.C0184;
import dagger.hilt.internal.C0254;
import fa.C0281;
import java.io.ByteArrayOutputStream;
import k0.f5;
import k0.k1;
import k6.p6;
import k6.q6;
import k6.x;
import k6.x3;
import k7.C0338;
import m0.m3;
import z.C0482;

/* JADX INFO: renamed from: w1.ۦۣۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0456 {

    /* JADX INFO: renamed from: ۟ۥۣ۠۟, reason: not valid java name and contains not printable characters */
    public static int f726 = 560;

    /* JADX INFO: renamed from: ۣ۟۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static Boolean m8876() {
        if (C0254.m4844() > 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static int m8877(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۧۥۣ, reason: not valid java name and contains not printable characters */
    public static m3 m8878() {
        if (C0338.m6638() < 0) {
            return f5.f8933a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static x3 m8880() {
        if (C0184.m3517() >= 0) {
            return x.H0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8881(Object obj) {
        if (C0482.m9373() < 0) {
            return ((k1) obj).f9094b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۢۧ۟, reason: not valid java name and contains not printable characters */
    public static q6 m8882(Object obj) {
        if (C0152.m2931() > 0) {
            return ((p6) obj).f10277d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static float m8883(float f10, float f11) {
        if (C0049.m945() >= 0) {
            return z6.a.m(f10, f11);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۠ۨۥۡ, reason: not valid java name and contains not printable characters */
    public static String m8884(String str) {
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

    /* JADX INFO: renamed from: ۨۦۥۨ, reason: not valid java name and contains not printable characters */
    public static int m8885() {
        return 381 ^ C0281.f425;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static String m8879(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
