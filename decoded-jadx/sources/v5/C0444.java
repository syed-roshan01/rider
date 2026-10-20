package v5;

import b4.C0052;
import c0.C0056;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.C0205;
import com.google.firebase.abt.C0112;
import com.google.gson.internal.sql.C0208;
import dagger.hilt.android.internal.modules.C0233;
import f0.C0272;
import f0.x;
import h6.C0309;
import i1.f;
import j2.C0323;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.q3;
import k6.a5;
import k6.f5;
import k6.j7;
import k6.p7;
import k6.q5;
import k6.z4;
import o7.d0;
import t9.C0427;

/* JADX INFO: renamed from: v5.ۥۧ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0444 {

    /* JADX INFO: renamed from: ۠۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static int f715 = -856;

    /* JADX INFO: renamed from: ۟۟ۦ۠۠, reason: not valid java name and contains not printable characters */
    public static String m8663(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m8664(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۟۠۟, reason: not valid java name and contains not printable characters */
    public static z4 m8666(Object obj) {
        if (C0427.m8371() <= 0) {
            return ((f5) obj).f10033j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static int m8667(Object obj) {
        if (C0205.m3914() > 0) {
            return ((zzfi.zzj) obj).zzg();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static long m8668(Object obj) {
        if (C0309.m5971() <= 0) {
            return ((q3) obj).f9401h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۧۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8669(Object obj) {
        if (C0233.m4495() <= 0) {
            return ((p7) obj).f10298m;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۤ, reason: not valid java name and contains not printable characters */
    public static q5 m8670() {
        if (C0052.m1013() >= 0) {
            return q5.f10321c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static j7 m8671(Object obj) {
        if (C0208.m3984() <= 0) {
            return ((p7) obj).f10290e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m8672(Object obj, Object obj2) {
        if (C0056.m1077() < 0) {
            ((a5) obj).c((List) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m8673() {
        return 536 ^ C0272.f388;
    }

    /* JADX INFO: renamed from: ۥۤۧۤ, reason: contains not printable characters */
    public static f m8674() {
        if (C0323.m6259() <= 0) {
            return d0.f12581j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8675(Object obj) {
        if (C0112.m2176() >= 0) {
            return ((x) obj).f5992d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠۠, reason: not valid java name and contains not printable characters */
    public static String m8665(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
