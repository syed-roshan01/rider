package n;

import com.google.firebase.messaging.C0192;
import d5.m;
import dagger.hilt.components.C0244;
import dagger.hilt.migration.C0254;
import f0.a1;
import f0.h;
import f4.C0276;
import java.io.ByteArrayOutputStream;
import k0.e2;
import k0.l;
import k0.p1;
import k0.x3;
import k6.e4;
import k6.z6;
import p8.C0379;
import r2.C0395;
import r7.C0404;
import u8.C0438;
import w1.C0455;
import y.v;
import y9.C0479;

/* JADX INFO: renamed from: n.۟۠ۥۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0360 {

    /* JADX INFO: renamed from: ۟ۥۧۤۧ, reason: not valid java name and contains not printable characters */
    public static int f631 = 738;

    /* JADX INFO: renamed from: ۟۟۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static int m7062(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static String m7063() {
        if (C0455.m8885() <= 0) {
            return "children_to_process";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m7064(Object obj) {
        if (C0404.m7934() > 0) {
            return ((f0.d) obj).f5658a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static float m7065() {
        if (C0244.m4685() >= 0) {
            return e2.f8864a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۦۦۦ, reason: not valid java name and contains not printable characters */
    public static a1 m7067(Object obj) {
        if (C0276.m5315() <= 0) {
            return ((p1) obj).f9350x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟۟۠, reason: not valid java name and contains not printable characters */
    public static void m7068(Object obj, Object obj2, Object obj3, int i10) {
        if (C0479.m9346() >= 0) {
            ((m) obj).a((v) obj2, (m0.m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۠ۨۧۨ, reason: not valid java name and contains not printable characters */
    public static e4 m7069(Object obj) {
        if (C0192.m3659() > 0) {
            return ((z6) obj).f10618b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۥ۠, reason: not valid java name and contains not printable characters */
    public static a1 m7070(Object obj) {
        if (C0254.m4866() < 0) {
            return ((h) obj).f5722s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m7071(Object obj) {
        if (C0254.m4866() < 0) {
            return ((l) obj).f9134w;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7072(Object obj) {
        if (C0379.m7433() >= 0) {
            return ((x3) obj).f9650d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۡۧ۠, reason: not valid java name and contains not printable characters */
    public static int m7073() {
        return (-326) ^ C0395.f666;
    }

    /* JADX INFO: renamed from: ۥ۠۟ۨ, reason: contains not printable characters */
    public static String m7074(String str) {
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

    /* JADX INFO: renamed from: ۣۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m7075(Object obj, Object obj2, int i10, int i11) {
        if (C0438.m8564() > 0) {
            ((ByteArrayOutputStream) obj).write((byte[]) obj2, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۤۨ, reason: not valid java name and contains not printable characters */
    public static String m7066(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
