package d9;

import a2.c0;
import androidx.annotation.C0019;
import androidx.compose.ui.graphics.C0032;
import androidx.fragment.app.C0042;
import androidx.preference.C0044;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.inject.C0172;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import e0.C0256;
import f0.j1;
import f4.y;
import java.io.ByteArrayOutputStream;
import k0.j4;
import k6.e6;
import k6.f5;
import k6.h5;
import k6.t7;
import k6.u7;
import k6.x4;
import k6.x7;
import la.C0348;
import s0.C0409;
import v6.C0446;
import w0.C0454;
import w4.C0459;

/* JADX INFO: renamed from: d9.ۡۥۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0223 {

    /* JADX INFO: renamed from: ۟ۥۥ۟۟, reason: not valid java name and contains not printable characters */
    public static int f303 = -233;

    /* JADX INFO: renamed from: ۣ۟۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m4291(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4292(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0032.m620() < 0) {
            return u7.W((String) obj, (String) obj2, (String) obj3, (String) obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static float m4293() {
        if (C0166.m3170() < 0) {
            return l0.h.f11056a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static long m4294() {
        if (C0044.m860() > 0) {
            return zzne.zzk();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static c9.f m4295(Object obj) {
        if (C0256.m4901() <= 0) {
            return ((j4) obj).f9079d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m4296(Object obj, Object obj2, Object obj3) {
        if (C0230.m4440() >= 0) {
            ((h5) obj).o((t7) obj2, (x7) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m4297(Object obj, Object obj2) {
        if (C0446.m8696() > 0) {
            return ((c9.c) obj).invoke(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int[] m4298() {
        if (C0141.m2714() <= 0) {
            return x4.f10533a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۥۦ, reason: not valid java name and contains not printable characters */
    public static float m4299(Object obj) {
        if (C0459.m8951() <= 0) {
            return ((m2.b) obj).c();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۥۣۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4300(Object obj) {
        if (C0172.m3296() > 0) {
            return ((x9.i) obj).f16416a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4301(Object obj) {
        if (C0454.m8861() < 0) {
            return ((f5) obj).D;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۥۢۨ, reason: not valid java name and contains not printable characters */
    public static void m4302(Object obj) {
        if (C0042.m820() >= 0) {
            ((y) obj).l();
        }
    }

    /* JADX INFO: renamed from: ۦۥۣۧ, reason: contains not printable characters */
    public static int m4304() {
        return 795 ^ C0019.f39;
    }

    /* JADX INFO: renamed from: ۧ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static c0 m4305(Object obj) {
        if (C0161.m3081() <= 0) {
            return ((j1) obj).f5798b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m4306(Object obj, int i10) {
        if (C0348.m6818() < 0) {
            return ((StringBuilder) obj).appendCodePoint(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۧ, reason: not valid java name and contains not printable characters */
    public static String m4307(String str) {
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

    /* JADX INFO: renamed from: ۨۧۦ, reason: not valid java name and contains not printable characters */
    public static String m4308(Object obj) {
        if (C0409.m8037() <= 0) {
            return ((e6) obj).f10004a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۡۢ, reason: contains not printable characters */
    public static String m4303(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
