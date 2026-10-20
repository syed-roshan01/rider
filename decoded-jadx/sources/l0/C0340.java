package l0;

import a2.C0005;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.firebase.components.C0135;
import com.google.firebase.ktx.C0179;
import com.google.firebase.messaging.ktx.C0186;
import com.google.gson.internal.bind.C0207;
import g3.C0288;
import j2.C0323;
import j3.C0325;
import java.io.ByteArrayOutputStream;
import k0.h2;
import k0.o4;
import k0.w3;
import k6.x;
import k6.x3;
import l2.C0341;
import la.C0348;
import y9.C0478;

/* JADX INFO: renamed from: l0.ۤ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0340 {

    /* JADX INFO: renamed from: ۡۥۦۨ, reason: not valid java name and contains not printable characters */
    public static int f611 = -262;

    /* JADX INFO: renamed from: ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static Object m6672(Object obj) {
        if (C0341.m6699() < 0) {
            return ((o4) obj).f9325c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static int m6673(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۥ, reason: not valid java name and contains not printable characters */
    public static String m6674() {
        if (C0323.m6259() <= 0) {
            return "safelisted_events";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠۠, reason: not valid java name and contains not printable characters */
    public static StringBuilder m6676(Object obj, long j10) {
        if (C0075.m1631() <= 0) {
            return ((StringBuilder) obj).append(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static d5.m m6677() {
        if (C0186.m3548() <= 0) {
            return d5.m.f4661q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static String m6678(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۢۡۨ, reason: not valid java name and contains not printable characters */
    public static long m6679() {
        if (C0348.m6818() < 0) {
            return c.f11024p;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static c9.f m6680(Object obj) {
        if (C0179.m3417() >= 0) {
            return ((h2) obj).f8978q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m6681() {
        return (-651) ^ C0207.f231;
    }

    /* JADX INFO: renamed from: ۡۡۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6682(Object obj) {
        if (C0478.m9326() <= 0) {
            return ((w3) obj).f9613b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۨۨ, reason: not valid java name and contains not printable characters */
    public static i1.f m6683() {
        if (C0005.m104() >= 0) {
            return h6.g.d0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m6684() {
        if (C0288.m5547() > 0) {
            return "settings";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠۠, reason: not valid java name and contains not printable characters */
    public static String m6685() {
        if (C0325.m6295() > 0) {
            return "Shizuku Engine Status";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static x3 m6686() {
        if (C0135.m2608() <= 0) {
            return x.U;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m6675(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
