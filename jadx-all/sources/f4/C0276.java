package f4;

import android.content.SharedPreferences;
import c4.C0065;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.emulators.C0141;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.messaging.reporting.C0190;
import d5.a1;
import d5.g2;
import f0.c2;
import g.C0285;
import g9.C0295;
import java.io.ByteArrayOutputStream;
import k.C0332;
import k6.m5;
import k6.o4;
import k6.t4;
import l8.C0347;
import u.C0429;
import x7.C0473;
import y.C0475;
import y6.C0478;

/* JADX INFO: renamed from: f4.ۡۥۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0276 {

    /* JADX INFO: renamed from: ۧۥۧۥ, reason: not valid java name and contains not printable characters */
    public static int f391 = 987;

    /* JADX INFO: renamed from: ۟۠ۨۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5293(Object obj) {
        if (C0347.m6774() >= 0) {
            return ((a5.j) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5294(Object obj, Object obj2) {
        if (C0295.m5663() >= 0) {
            return ((t4) obj).G((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥ۠, reason: not valid java name and contains not printable characters */
    public static u8.e m5295(Object obj, Object obj2, Object obj3) {
        if (C0429.m8409() < 0) {
            return ((a1) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static r1.s m5296(Object obj) {
        if (C0141.m2714() < 0) {
            return ((c2) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5297(Object obj) {
        if (C0189.m3621() > 0) {
            return ((zzfi.zzn) obj).zzj();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m5298(Object obj) {
        if (C0183.m3510() > 0) {
            return ((o4) obj).f10254b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ۟, reason: not valid java name and contains not printable characters */
    public static long m5299() {
        if (C0285.m5483() > 0) {
            return l0.c.f11009a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۥۣۦ, reason: not valid java name and contains not printable characters */
    public static Object m5300(Object obj) {
        if (C0065.m1257() < 0) {
            return ((m5) obj).f10207d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۦ۟, reason: contains not printable characters */
    public static l.h m5302(Object obj) {
        if (C0473.m9193() < 0) {
            return ((k6.n) obj).f10215b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۟ۨ, reason: contains not printable characters */
    public static String m5303() {
        if (C0475.m9246() <= 0) {
            return "first_open_count";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤۨ, reason: contains not printable characters */
    public static String m5304(String str) {
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

    /* JADX INFO: renamed from: ۥۥۥۧ, reason: contains not printable characters */
    public static float m5305() {
        if (C0190.m3639() > 0) {
            return l0.h.f11061f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۡۧ, reason: contains not printable characters */
    public static SharedPreferences.Editor m5306(Object obj, Object obj2, int i10) {
        if (C0332.m6408() <= 0) {
            return ((SharedPreferences.Editor) obj).putInt((String) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m5307(Object obj, int i10, Object obj2) {
        if (C0090.m1920() > 0) {
            ((y3.d) obj).k(i10, obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۧۢ, reason: not valid java name and contains not printable characters */
    public static int m5308() {
        return 679 ^ C0478.f751;
    }

    /* JADX INFO: renamed from: ۨۥۥۣ, reason: not valid java name and contains not printable characters */
    public static c9.a m5309(Object obj) {
        if (C0188.m3594() >= 0) {
            return ((g2) obj).f4532d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۧ, reason: not valid java name and contains not printable characters */
    public static int m5310(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤۡۢ, reason: not valid java name and contains not printable characters */
    public static String m5301(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
