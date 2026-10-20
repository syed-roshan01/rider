package androidx.compose.ui.draw;

import a2.x;
import a2.z;
import a8.C0010;
import aa.C0012;
import android.media.ToneGenerator;
import android.support.v4.app.C0014;
import android.view.Choreographer;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.measurement.internal.C0105;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.measurement.C0184;
import d1.C0214;
import d5.k1;
import d8.C0221;
import d9.q;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.internal.processedrootsentinel.C0251;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;
import k0.i3;
import k0.x3;
import k6.d4;
import k6.h4;
import k6.k;
import k6.n6;
import k6.o5;
import k6.p7;
import l2.p;
import m3.C0352;
import o2.C0368;
import p8.C0379;
import s2.C0411;
import t0.C0418;
import u4.C0435;
import w0.C0454;

/* JADX INFO: renamed from: androidx.compose.ui.draw.ۣ۟ۨۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0027 {

    /* JADX INFO: renamed from: ۟ۧ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static int f47 = 813;

    /* JADX INFO: renamed from: ۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static String m521(Object obj) {
        if (C0411.m8066() < 0) {
            return ((n6) obj).f10232d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m522(Object obj) {
        if (C0251.m4811() <= 0) {
            return ((o5) obj).o();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static List m523(Object obj, int i10, int i11, Object obj2) {
        if (C0184.m3517() >= 0) {
            return ((k) obj).A(i10, i11, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m524(Object obj, Object obj2, int i10, Object obj3) {
        if (C0231.m4453() < 0) {
            return ((k) obj).N((String) obj2, i10, (zzew.zzb) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static void m525(Object obj) {
        if (C0105.m2045() >= 0) {
            ((ToneGenerator) obj).release();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m526(Object obj) {
        if (C0012.m226() > 0) {
            return ((z) obj).f1056e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m528(Object obj, Object obj2) {
        if (C0418.m8221() >= 0) {
            ((Choreographer) obj).postFrameCallback((Choreographer.FrameCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟۟, reason: not valid java name and contains not printable characters */
    public static String m529() {
        if (C0454.m8861() <= 0) {
            return "service_active";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۥ۟, reason: not valid java name and contains not printable characters */
    public static String m530(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static p m531(Object obj) {
        if (C0221.m4264() > 0) {
            return ((x) obj).f1040j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۦ۠, reason: not valid java name and contains not printable characters */
    public static int m532(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡ۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m533() {
        if (C0435.m8516() > 0) {
            return "Shizuku Permission Required \u26a0";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static int m534(Object obj) {
        if (C0010.m199() >= 0) {
            return ((k1) obj).f4608a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۧۦ, reason: not valid java name and contains not printable characters */
    public static h4 m535(Object obj) {
        if (C0368.m7234() >= 0) {
            return d4.r((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۥ, reason: not valid java name and contains not printable characters */
    public static long m536(Object obj) {
        if (C0133.m2559() >= 0) {
            return ((i3) obj).f9037n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m537(Object obj) {
        if (C0368.m7234() > 0) {
            return ((p7) obj).w();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۢۡ۟, reason: contains not printable characters */
    public static boolean m538(Object obj) {
        if (C0214.m4096() >= 0) {
            return ((q) obj).f4948a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠ۢۡ, reason: contains not printable characters */
    public static int m539(Object obj) {
        if (C0379.m7433() > 0) {
            return ((x3) obj).f9655p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥۤ۟, reason: contains not printable characters */
    public static Object[] m540(Object obj, int i10, Object obj2) {
        if (C0352.m6904() <= 0) {
            return Arrays.copyOf((Object[]) obj, i10, (Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨ۟۠, reason: not valid java name and contains not printable characters */
    public static int m541() {
        return 887 ^ C0014.f34;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧۤ, reason: not valid java name and contains not printable characters */
    public static String m527(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
