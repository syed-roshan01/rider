package o2;

import a2.c0;
import android.os.ext.SdkExtensions;
import b7.C0053;
import com.google.android.gms.common.C0087;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.components.C0134;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.remoteconfiginterop.C0203;
import d8.C0221;
import d9.C0223;
import dagger.hilt.internal.aggregatedroot.C0246;
import f0.e2;
import f0.j1;
import f0.x;
import g.C0282;
import g2.a0;
import h4.C0305;
import j9.C0329;
import java.io.ByteArrayOutputStream;
import k0.e5;
import k0.l3;
import k6.k5;
import k6.w4;
import k6.z7;
import l3.C0342;
import n.C0360;
import o7.d0;
import o8.C0371;
import r1.i0;
import r6.C0401;
import w2.C0458;
import x4.C0468;
import x8.C0473;

/* JADX INFO: renamed from: o2.۟ۤۨۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0368 {

    /* JADX INFO: renamed from: ۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int f639 = -228;

    /* JADX INFO: renamed from: ۟۠ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static int m7216(Object obj) {
        if (C0458.m8930() >= 0) {
            return ((zzfi.zzj.zza) obj).zza();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۨۦۡ, reason: not valid java name and contains not printable characters */
    public static int m7217(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۦ, reason: not valid java name and contains not printable characters */
    public static String m7219(Object obj) {
        if (C0053.m1029() < 0) {
            return ((k5) obj).f10155b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۢ۟, reason: not valid java name and contains not printable characters */
    public static f2.d m7220(Object obj) {
        if (C0371.m7283() > 0) {
            return ((j1) obj).f5804h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠۠, reason: not valid java name and contains not printable characters */
    public static c0 m7221(Object obj) {
        if (C0282.m5446() > 0) {
            return ((e5) obj).f8894o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۡۢ, reason: not valid java name and contains not printable characters */
    public static int m7222(Object obj) {
        if (C0223.m4304() <= 0) {
            return ((e2) obj).f5690d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۤ, reason: not valid java name and contains not printable characters */
    public static int m7223() {
        if (C0134.m2587() < 0) {
            return SdkExtensions.getExtensionVersion(1000000);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static g2.s m7224(Object obj) {
        if (C0203.m3894() >= 0) {
            return ((x) obj).f5995n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦ۠, reason: not valid java name and contains not printable characters */
    public static void m7225(int i10, int i11) {
        if (C0360.m7073() <= 0) {
            d0.v(i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۣ۠۠, reason: not valid java name and contains not printable characters */
    public static int m7226(Object obj) {
        if (C0221.m4264() >= 0) {
            return ((k6.b) obj).f9903a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۠۟, reason: not valid java name and contains not printable characters */
    public static int m7227(Object obj) {
        if (C0473.m9210() <= 0) {
            return ((d5.u) obj).f4785a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static void m7228(Object obj, long j10, boolean z10) {
        if (C0468.m9123() < 0) {
            ((w4) obj).X(j10, z10);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static String m7229(String str) {
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

    /* JADX INFO: renamed from: ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static z7 m7230(Object obj) {
        if (C0083.m1779() > 0) {
            return ((k6.c) obj).f9924h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۡ۟, reason: not valid java name and contains not printable characters */
    public static a0 m7231(Object obj) {
        if (C0305.m5904() >= 0) {
            return ((f0.s) obj).f5887f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۦۧ, reason: contains not printable characters */
    public static boolean m7232(Object obj) {
        if (C0246.m4717() < 0) {
            return ((DocumentSnapshot) obj).exists();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠۠ۧ, reason: contains not printable characters */
    public static Boolean m7233(Object obj, Object obj2) {
        if (C0305.m5904() >= 0) {
            return ((DocumentSnapshot) obj).getBoolean((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۦۧ, reason: contains not printable characters */
    public static int m7234() {
        return 4 ^ C0087.f121;
    }

    /* JADX INFO: renamed from: ۦۧۧۦ, reason: contains not printable characters */
    public static l3 m7235() {
        if (C0342.m6720() >= 0) {
            return l3.f9183a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۢۨ, reason: not valid java name and contains not printable characters */
    public static y0.o m7236(Object obj) {
        if (C0329.m6367() > 0) {
            return androidx.compose.ui.input.key.a.c((c9.c) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static m9.d0 m7237(Object obj) {
        if (C0158.m3012() >= 0) {
            return ((m0.d0) obj).f11474a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object m7238(Object obj) {
        if (C0401.m7881() < 0) {
            return androidx.compose.ui.layout.a.e((i0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m7218(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
