package v0;

import a5.s;
import android.content.pm.PackageInfo;
import b.C0049;
import c3.C0063;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.measurement.zznp;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.ktx.C0179;
import com.google.firebase.messaging.ktx.C0186;
import d5.f2;
import dagger.hilt.android.internal.modules.C0234;
import f0.C0273;
import f0.t;
import f0.x;
import f5.d0;
import g2.a0;
import h4.C0305;
import i6.C0320;
import j6.C0329;
import java.io.ByteArrayOutputStream;
import k4.C0337;
import k6.g4;
import k6.j4;
import k6.p7;
import k6.t7;
import k6.u7;
import r2.C0398;
import z.C0481;

/* JADX INFO: renamed from: v0.ۣۣۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0444 {

    /* JADX INFO: renamed from: ۟ۧۦۧ۟, reason: not valid java name and contains not printable characters */
    public static int f714 = -812;

    /* JADX INFO: renamed from: ۟۠ۧۨ۟, reason: not valid java name and contains not printable characters */
    public static u8.e m8646(Object obj, Object obj2, Object obj3) {
        if (C0063.m1217() >= 0) {
            return ((s) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۤۨ, reason: not valid java name and contains not printable characters */
    public static u8.e m8647(Object obj, Object obj2, Object obj3) {
        if (C0305.m5882() <= 0) {
            return ((d0) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۤۡ, reason: not valid java name and contains not printable characters */
    public static a0 m8648(Object obj) {
        if (C0398.m7764() < 0) {
            return ((t) obj).f5905f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۡ۠, reason: not valid java name and contains not printable characters */
    public static j4 m8649(Object obj) {
        if (C0049.m945() > 0) {
            return ((p7) obj).f10287b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static String m8650(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۣۤۢ, reason: not valid java name and contains not printable characters */
    public static String m8651(Object obj) {
        if (C0329.m6350() > 0) {
            return ((PackageInfo) obj).versionName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static String m8652(Object obj) {
        if (C0273.m5249() < 0) {
            return ((t7) obj).f10408f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static g5.c m8653() {
        if (C0179.m3417() > 0) {
            return g5.c.f6618a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۤۢ, reason: not valid java name and contains not printable characters */
    public static int m8654() {
        return (-37) ^ C0320.f467;
    }

    /* JADX INFO: renamed from: ۡ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static void m8655(Object obj, Object obj2, int i10) {
        if (C0186.m3548() < 0) {
            ((u7) obj).M((g4) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۡۢۦ۠, reason: not valid java name and contains not printable characters */
    public static String m8656() {
        if (C0481.m9354() <= 0) {
            return "Error storing event filter. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8657() {
        if (C0125.m2408() >= 0) {
            return zznp.zzf();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8658(Object obj) {
        if (C0337.m6515() < 0) {
            return ((x) obj).f5991c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۤۢ, reason: not valid java name and contains not printable characters */
    public static int m8660(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥ۟ۨۨ, reason: contains not printable characters */
    public static String m8661() {
        if (C0234.m4495() <= 0) {
            return "unmatched_first_open_without_ad_id";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۨۦ, reason: contains not printable characters */
    public static boolean m8662(Object obj) {
        if (C0085.m1825() >= 0) {
            return ((f2) obj).f4492a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m8659(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
