package t0;

import a5.j;
import androidx.compose.ui.draw.C0027;
import androidx.lifecycle.C0043;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.tasks.C0103;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.messaging.reporting.C0189;
import d5.s;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import f0.d0;
import f0.p;
import g3.C0289;
import h4.C0305;
import i.C0316;
import j3.C0326;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Type;
import k0.m4;
import k0.s4;
import k0.x1;
import k6.k;
import k6.p7;
import k6.r7;
import k6.t4;
import l.q;
import m0.l3;
import q4.h;
import q6.C0389;
import r2.C0398;
import s7.C0415;
import u8.e;
import u9.d;
import x8.C0474;
import y6.C0477;

/* JADX INFO: renamed from: t0.ۣ۟۠ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0419 {

    /* JADX INFO: renamed from: ۣ۟ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static int f689 = 229;

    /* JADX INFO: renamed from: ۣ۟۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static r7 m8211(Object obj) {
        if (C0232.m4453() <= 0) {
            return ((p7) obj).f10292g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۠۠, reason: not valid java name and contains not printable characters */
    public static int m8212(Object obj) {
        if (C0103.m2022() > 0) {
            return ((p) obj).f5841a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۧۨ, reason: not valid java name and contains not printable characters */
    public static String m8213() {
        if (C0135.m2608() < 0) {
            return "বাংলা";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static Object m8214(Object obj) {
        if (C0316.m6111() > 0) {
            return ((l3) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m8215(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0326.m6295() > 0) {
            return ((s4) obj).e(obj2, obj3, obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8216(Object obj) {
        if (C0027.m541() >= 0) {
            return ((zzfi.zzg) obj).zzm();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨۧۥ, reason: not valid java name and contains not printable characters */
    public static int m8217(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static h m8218(Object obj) {
        if (C0156.m2976() >= 0) {
            return ((t4) obj).f10386j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static String[] m8219() {
        if (C0305.m5882() <= 0) {
            return k.f10144o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m8220(Object obj) {
        if (C0122.m2355() > 0) {
            return ((x1) obj).f9644n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤۦۦ, reason: not valid java name and contains not printable characters */
    public static int m8221() {
        return (-122) ^ C0189.f213;
    }

    /* JADX INFO: renamed from: ۟ۦۡۦ, reason: not valid java name and contains not printable characters */
    public static u0.b m8222() {
        if (C0389.m7600() < 0) {
            return s.f4767k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۨ, reason: not valid java name and contains not printable characters */
    public static String m8223(String str) {
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

    /* JADX INFO: renamed from: ۣ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object m8224(Object obj, Object obj2, Object obj3) {
        if (C0477.m9298() < 0) {
            return ((d) obj).c(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۧۤ, reason: not valid java name and contains not printable characters */
    public static Type m8225(Object obj) {
        if (C0043.m833() >= 0) {
            return ((u7.a) obj).f15426b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۡ۟, reason: not valid java name and contains not printable characters */
    public static j m8226(Object obj) {
        if (C0107.m2075() <= 0) {
            return ((a5.e) obj).f1248b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦ, reason: contains not printable characters */
    public static String m8227() {
        if (C0289.m5547() > 0) {
            return "Dashboard";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۥ, reason: contains not printable characters */
    public static long m8228(Object obj) {
        if (C0474.m9210() <= 0) {
            return ((m4) obj).f9236p;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۢۢۥ, reason: contains not printable characters */
    public static long m8229() {
        if (C0085.m1825() >= 0) {
            return zzne.zzq();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m8231(Object obj, Object obj2) {
        if (C0415.m8130() <= 0) {
            return q.j((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m8232(Object obj) {
        if (C0398.m7764() < 0) {
            return ((d0) obj).f5662c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m8230(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
