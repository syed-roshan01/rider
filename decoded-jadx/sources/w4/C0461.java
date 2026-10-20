package w4;

import androidx.compose.foundation.layout.C0023;
import androidx.core.app.C0040;
import c0.C0057;
import c7.C0068;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.remoteconfiginterop.C0203;
import f0.c2;
import f0.x;
import g.C0283;
import h4.C0305;
import java.io.ByteArrayOutputStream;
import k6.c5;
import k6.d4;
import k6.h6;
import k6.h7;
import k6.l5;
import k6.s5;
import k6.x3;
import m0.q2;
import n.C0361;
import p0.C0373;
import r7.C0404;
import v6.C0446;
import v9.C0452;

/* JADX INFO: renamed from: w4.ۥۧۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0461 {

    /* JADX INFO: renamed from: ۣۣ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static int f732 = 861;

    /* JADX INFO: renamed from: ۟ۡۧۧۦ, reason: not valid java name and contains not printable characters */
    public static String m8978(String str) {
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

    /* JADX INFO: renamed from: ۟ۤ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m8979() {
        if (C0373.m7322() < 0) {
            return zzne.zzas();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m8980(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۤ, reason: not valid java name and contains not printable characters */
    public static int m8981(Object obj) {
        if (C0106.m2067() >= 0) {
            return ((l5) obj).f10192a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m8982(Object obj) {
        if (C0361.m7097() < 0) {
            ((c5) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۥ, reason: not valid java name and contains not printable characters */
    public static byte m8983(Object obj) {
        if (C0203.m3894() >= 0) {
            return ((ja.i) obj).readByte();
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8985(Object obj) {
        if (C0305.m5904() >= 0) {
            return ((com.google.android.gms.common.internal.f) obj).isConnected();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۦۧ۠, reason: not valid java name and contains not printable characters */
    public static Object[] m8986(Object obj) {
        if (C0283.m5468() > 0) {
            return ((q2) obj).f11667c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۡۥ, reason: not valid java name and contains not printable characters */
    public static s5 m8987(Object obj) {
        if (C0057.m1090() < 0) {
            return ((h6) obj).f10084a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static long m8988(Object obj) {
        if (C0023.m461() >= 0) {
            return ((o8.c) obj).f12666b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤۤۤ, reason: not valid java name and contains not printable characters */
    public static c2 m8989(Object obj) {
        if (C0068.m1322() > 0) {
            return ((x) obj).f5989a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۡ, reason: contains not printable characters */
    public static String m8990(Object obj) {
        if (C0404.m7934() > 0) {
            return ((d4) obj).f9963e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۢۧ, reason: contains not printable characters */
    public static x3 m8991() {
        if (C0040.m792() >= 0) {
            return k6.x.D;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۥۢ, reason: contains not printable characters */
    public static zzfi.zzn.zza m8992(Object obj, double d10) {
        if (C0446.m8696() > 0) {
            return ((zzfi.zzn.zza) obj).zza(d10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۧۥ, reason: not valid java name and contains not printable characters */
    public static int m8993() {
        return (-143) ^ C0148.f173;
    }

    /* JADX INFO: renamed from: ۣۧۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8994(Object obj, boolean z10, boolean z11, long j10) {
        if (C0452.m8825() >= 0) {
            return ((h7) obj).a(z10, z11, j10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۥۧۥ, reason: not valid java name and contains not printable characters */
    public static String m8984(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
