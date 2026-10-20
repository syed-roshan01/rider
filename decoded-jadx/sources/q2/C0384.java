package q2;

import a2.C0004;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.core.content.C0041;
import androidx.preference.C0044;
import b1.C0050;
import c1.C0058;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.measurement.zzps;
import com.google.firebase.platforminfo.C0193;
import com.google.protobuf.h2;
import d2.C0215;
import dagger.hilt.codegen.C0242;
import dagger.hilt.migration.C0254;
import ea.C0267;
import h3.C0303;
import java.io.ByteArrayOutputStream;
import java.io.File;
import k0.q1;
import k0.z1;
import k6.u7;
import k6.x7;
import l8.C0345;
import m0.x1;
import r6.C0401;

/* JADX INFO: renamed from: q2.ۣ۟ۢۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0384 {

    /* JADX INFO: renamed from: ۟۟ۧۢۨ, reason: not valid java name and contains not printable characters */
    public static int f655 = 599;

    /* JADX INFO: renamed from: ۟۠ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static NetworkCapabilities m7525(Object obj, Object obj2) {
        if (C0303.m5859() <= 0) {
            return ((ConnectivityManager) obj).getNetworkCapabilities((Network) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static float m7526(Object obj) {
        if (C0345.m6759() <= 0) {
            return ((k0.w) obj).f9589o;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m7527() {
        return 428 ^ C0401.f672;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7528(Object obj) {
        if (C0050.m982() <= 0) {
            return ((x7) obj).f10550o;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۧۢۨ, reason: not valid java name and contains not printable characters */
    public static String m7529(Object obj) {
        if (C0254.m4866() < 0) {
            return ((a5.d0) obj).f1244f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۤ, reason: not valid java name and contains not printable characters */
    public static String m7530(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۧۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m7531() {
        if (C0215.m4108() < 0) {
            return zzps.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static x1 m7533(Object obj) {
        if (C0058.m1106() >= 0) {
            return ((m0.q) obj).x();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۨۥ, reason: not valid java name and contains not printable characters */
    public static y0.o m7534(Object obj) {
        if (C0004.m76() < 0) {
            return ((q1) obj).f9373a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static String m7535(Object obj, Object obj2) {
        if (C0254.m4866() <= 0) {
            return ((ByteArrayOutputStream) obj).toString((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m7536(Object obj) {
        if (C0044.m860() > 0) {
            return ((z1) obj).f9693e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧ۠۟, reason: not valid java name and contains not printable characters */
    public static int m7537(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥ۟ۦۨ, reason: contains not printable characters */
    public static a5.a0 m7538() {
        if (C0242.m4660() <= 0) {
            return a5.a0.f1219b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۟ۢ, reason: contains not printable characters */
    public static boolean m7539(Object obj, Object obj2, Object obj3) {
        if (C0087.m1852() > 0) {
            return ((u7) obj).g0((Context) obj2, (String) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۢ, reason: contains not printable characters */
    public static int[] m7540() {
        if (C0041.m812() > 0) {
            return h2.f4122p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m7541(long j10, long j11) {
        if (C0193.m3691() <= 0) {
            return m1.a.a(j10, j11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7542(Object obj) {
        if (C0267.m5113() < 0) {
            return ((File) obj).canWrite();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۥۡ, reason: not valid java name and contains not printable characters */
    public static String m7532(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
