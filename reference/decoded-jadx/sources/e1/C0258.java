package e1;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import androidx.compose.ui.graphics.C0031;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.remoteconfiginterop.C0202;
import d1.C0212;
import d5.a2;
import dagger.hilt.components.C0243;
import h4.C0304;
import j2.C0324;
import java.io.ByteArrayOutputStream;
import k0.i2;
import k0.m4;
import k6.s6;
import k6.t6;
import m0.g1;
import t2.C0420;
import u8.C0438;
import y.t0;
import y6.C0477;

/* JADX INFO: renamed from: e1.۟ۢ۟ۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0258 {

    /* JADX INFO: renamed from: ۨ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static int f338 = 740;

    /* JADX INFO: renamed from: ۣ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static void m4928(Object obj, Object obj2) {
        if (C0129.m2492() > 0) {
            ((AccessibilityService) obj).setServiceInfo((AccessibilityServiceInfo) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m4929(Object obj, long j10) {
        if (C0420.m8263() >= 0) {
            ((k6.n) obj).b(j10);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static l2.r m4930(Object obj) {
        if (C0153.m2938() < 0) {
            return ((a2.p) obj).f965i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۨ۟, reason: not valid java name and contains not printable characters */
    public static String m4931(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢۥ۟, reason: not valid java name and contains not printable characters */
    public static float m4932(Object obj, Object obj2) {
        if (C0324.m6278() < 0) {
            return androidx.compose.foundation.layout.a.e((t0) obj, (m2.l) obj2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static g2.i0 m4933(Object obj) {
        if (C0202.m3868() >= 0) {
            return ((f0.e0) obj).f5674a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static c9.e m4934(Object obj) {
        if (C0120.m2311() <= 0) {
            return ((i2) obj).f9029n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۥۨ, reason: not valid java name and contains not printable characters */
    public static int m4935(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Object m4936(Object obj) {
        if (C0477.m9312() <= 0) {
            return ((f5.g0) obj).f6262d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static g1 m4937(Object obj) {
        if (C0438.m8564() > 0) {
            return ((a2) obj).f4401d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۨۥ, reason: not valid java name and contains not printable characters */
    public static y0.o m4938(Object obj) {
        if (C0212.m4051() >= 0) {
            return ((f0.t) obj).f5907o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۥۨ, reason: not valid java name and contains not printable characters */
    public static int m4939() {
        return (-792) ^ C0243.f323;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static long m4940(Object obj) {
        if (C0304.m5882() <= 0) {
            return ((m4) obj).f9229i;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢ۟۟, reason: not valid java name and contains not printable characters */
    public static s6 m4941(Object obj) {
        if (C0031.m598() >= 0) {
            return ((t6) obj).f10402f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۥۣ, reason: contains not printable characters */
    public static String m4942(Object obj, Object obj2, Object obj3) {
        if (C0151.m2903() >= 0) {
            return a7.a.p((StringBuilder) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۥ, reason: contains not printable characters */
    public static String m4943(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
