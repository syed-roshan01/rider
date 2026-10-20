package n1;

import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.abt.C0112;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import d5.y0;
import d9.C0225;
import e7.C0264;
import ja.C0330;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.m2;
import k6.f5;
import k6.l4;
import k6.w4;
import l2.C0341;
import l3.C0342;
import m0.g1;
import r9.C0405;
import w6.C0464;
import z2.C0484;

/* JADX INFO: renamed from: n1.۟۠۟ۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0362 {

    /* JADX INFO: renamed from: ۟۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static int f633 = 126;

    /* JADX INFO: renamed from: ۟۟ۦ۟۠, reason: not valid java name and contains not printable characters */
    public static String m7098(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۥۥۡ, reason: not valid java name and contains not printable characters */
    public static int m7099() {
        return 600 ^ C0132.f158;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7100(Object obj) {
        if (C0484.m9436() <= 0) {
            return ((l4) obj).f10184q;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۨۤۥ, reason: not valid java name and contains not printable characters */
    public static byte m7101(Object obj) {
        if (C0225.m4339() <= 0) {
            return ((Byte) obj).byteValue();
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static int m7102(Object obj) {
        if (C0342.m6720() > 0) {
            return ((y0) obj).f4858a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static long m7103() {
        if (C0102.m2007() > 0) {
            return e5.a.g();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object m7104(Object obj) {
        if (C0330.m6374() >= 0) {
            return ((w4) obj).f10455b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static g1 m7105(Object obj) {
        if (C0112.m2176() >= 0) {
            return ((d5.h) obj).f4537d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨ, reason: not valid java name and contains not printable characters */
    public static List m7106(Object obj) {
        if (C0264.m5062() < 0) {
            return ((m2) obj).f9210d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۤۡ, reason: contains not printable characters */
    public static double m7107(Object obj) {
        return C0341.m6699() < 0 ? ((Float) obj).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۥۧۦۣ, reason: contains not printable characters */
    public static e6.c m7108(Object obj) {
        if (C0405.m7952() < 0) {
            return ((f5) obj).f10037n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۢ۠, reason: contains not printable characters */
    public static int m7109(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۥۥۧ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m7111(Object obj, int i10) {
        if (C0464.m9059() <= 0) {
            return ((zzfi.zzj.zza) obj).zzc(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۡ۟, reason: contains not printable characters */
    public static String m7110(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
