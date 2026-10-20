package l6;

import androidx.compose.ui.node.C0037;
import c9.e;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.measurement.C0181;
import d5.c0;
import d5.n0;
import dagger.hilt.codegen.C0241;
import dagger.hilt.internal.C0253;
import f0.x;
import g.C0282;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import k0.b;
import k0.f4;
import k0.y;
import k4.C0336;
import k6.f;
import k6.f5;
import k6.v6;
import m0.l3;
import m0.m;
import m9.d0;
import n8.C0365;
import r2.C0396;
import y0.o;
import y9.C0479;

/* JADX INFO: renamed from: l6.ۥۦۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0343 {

    /* JADX INFO: renamed from: ۣۡۧۧ, reason: not valid java name and contains not printable characters */
    public static int f614 = 415;

    /* JADX INFO: renamed from: ۣ۟۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static e m6726(Object obj) {
        if (C0253.m4844() > 0) {
            return ((b) obj).f8724b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۤۦ, reason: not valid java name and contains not printable characters */
    public static void m6727(Object obj, Object obj2, float f10, long j10, Object obj3, int i10, int i11) {
        if (C0365.m7172() >= 0) {
            ((f4) obj).a((o) obj2, f10, j10, (m) obj3, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6728(Object obj) {
        if (C0282.m5446() > 0) {
            return ((f) obj).z();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static List m6729(Object obj, int i10, int i11) {
        if (C0072.m1556() >= 0) {
            return ((ArrayList) obj).subList(i10, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static long m6730(Object obj) {
        if (C0396.m7755() > 0) {
            return ((zzfi.zzj) obj).zzr();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static String m6731(String str) {
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

    /* JADX INFO: renamed from: ۣ۟۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static List m6732(Object obj) {
        if (C0241.m4629() <= 0) {
            return ((c0) obj).f4428b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۢ, reason: not valid java name and contains not printable characters */
    public static int m6733(Object obj) {
        if (C0178.m3402() > 0) {
            return ((v6) obj).f10440a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡۤۦ, reason: not valid java name and contains not printable characters */
    public static int m6734(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static f5 m6735() {
        if (C0083.m1779() >= 0) {
            return f5.I;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۤ, reason: not valid java name and contains not printable characters */
    public static long m6736(Object obj) {
        if (C0241.m4629() <= 0) {
            return ((y) obj).f9661b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۤۨ, reason: not valid java name and contains not printable characters */
    public static l3 m6737(Object obj) {
        if (C0181.m3452() < 0) {
            return ((n0) obj).f4698o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۠۠, reason: not valid java name and contains not printable characters */
    public static int m6738() {
        return (-531) ^ C0075.f109;
    }

    /* JADX INFO: renamed from: ۦۨ۟ۨ, reason: contains not printable characters */
    public static d0 m6739(Object obj) {
        if (C0123.m2379() > 0) {
            return ((x) obj).f5997p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static int m6740(Object obj) {
        if (C0479.m9346() >= 0) {
            return ((Enum) obj).ordinal();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
    public static float m6741(long j10) {
        if (C0336.m6515() <= 0) {
            return d1.f.d(j10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۦۥ۟, reason: not valid java name and contains not printable characters */
    public static float m6743(Object obj) {
        if (C0037.m733() >= 0) {
            return ((k0.c0) obj).f8776c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۧۨۤۧ, reason: not valid java name and contains not printable characters */
    public static String m6742(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
