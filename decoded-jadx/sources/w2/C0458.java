package w2;

import a2.C0004;
import a2.c0;
import android.accessibilityservice.AccessibilityService;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.compose.ui.input.pointer.C0034;
import androidx.lifecycle.C0043;
import c1.C0058;
import com.auto.accept.data.model.UserProfile;
import com.google.firebase.C0205;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.measurement.C0184;
import f0.o1;
import f0.p1;
import f2.d;
import g2.s;
import g3.C0288;
import g5.C0291;
import i1.f;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import k0.b3;
import k0.f0;
import k0.v4;
import k6.o4;
import k6.p2;
import m0.m;
import o7.d0;
import s8.C0416;
import v.C0439;
import w5.C0463;
import x4.C0468;
import y.C0474;
import z7.C0489;

/* JADX INFO: renamed from: w2.ۧۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0458 {

    /* JADX INFO: renamed from: ۟۟ۦۨۥ, reason: not valid java name and contains not printable characters */
    public static int f729 = -311;

    /* JADX INFO: renamed from: ۟۟ۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m8917(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8918(Object obj) {
        if (C0116.m2247() > 0) {
            return ((String) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m8919(Object obj) {
        if (C0416.m8173() <= 0) {
            return ((v4) obj).f9580u;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static ApplicationInfo m8920(Object obj) {
        if (C0165.m3154() <= 0) {
            return ((Context) obj).getApplicationInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۡۤ, reason: not valid java name and contains not printable characters */
    public static long m8921(Object obj) {
        if (C0489.m9528() > 0) {
            return ((UserProfile) obj).getPlanExpiry();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۤۧۦ, reason: not valid java name and contains not printable characters */
    public static f m8922() {
        if (C0205.m3914() >= 0) {
            return d0.f12580i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۦ, reason: not valid java name and contains not printable characters */
    public static int m8923(Object obj, int i10, int i11) {
        if (C0463.m9033() > 0) {
            return a7.a.i((String) obj, i10, i11);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static c9.f m8924(Object obj) {
        if (C0184.m3517() >= 0) {
            return ((f0) obj).f8910r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۦۧ, reason: not valid java name and contains not printable characters */
    public static String m8925(Object obj) {
        if (C0136.m2627() > 0) {
            return ((o4) obj).f10255c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۢۨ, reason: not valid java name and contains not printable characters */
    public static List m8926(Object obj) {
        if (C0034.m667() >= 0) {
            return ((AccessibilityService) obj).getWindows();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static s m8927(Object obj) {
        if (C0288.m5547() >= 0) {
            return ((p1) obj).f5852g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static String m8928() {
        if (C0291.m5605() < 0) {
            return "subscription";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۥ۠, reason: not valid java name and contains not printable characters */
    public static void m8929(Object obj, Object obj2, int i10) {
        if (C0004.m76() <= 0) {
            ((b3) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۣۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m8930() {
        return 891 ^ C0043.f63;
    }

    /* JADX INFO: renamed from: ۢۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m8931() {
        if (C0114.m2205() <= 0) {
            return "Shizuku app is installed but service is stopped. Open Shizuku to start it.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۢ, reason: not valid java name and contains not printable characters */
    public static String m8932(String str) {
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

    /* JADX INFO: renamed from: ۦۢ۟۠, reason: contains not printable characters */
    public static long m8933(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        if (C0439.m8582() <= 0) {
            return o1.a((c0) obj, (m2.b) obj2, (d) obj3, (String) obj4, i10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۡۢۥ, reason: not valid java name and contains not printable characters */
    public static String m8934() {
        if (C0468.m9123() <= 0) {
            return "admob_app_id";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۨۡ, reason: not valid java name and contains not printable characters */
    public static Object m8936(Object obj, Object obj2) {
        if (C0058.m1106() > 0) {
            return ((ConcurrentHashMap) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۡۨ, reason: not valid java name and contains not printable characters */
    public static void m8937(Object obj) {
        if (C0474.m9246() <= 0) {
            ((p2) obj).s();
        }
    }

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static String m8935(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
