package h0;

import android.app.DownloadManager;
import android.database.Cursor;
import androidx.compose.ui.graphics.C0032;
import com.google.firebase.iid.C0171;
import com.google.firebase.messaging.reporting.C0189;
import dagger.hilt.internal.aggregatedroot.C0246;
import e1.C0257;
import f0.C0271;
import h.C0296;
import h1.C0300;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Locale;
import k0.m4;
import k0.q3;
import k6.a5;
import k6.d7;
import l0.C0339;
import m0.l3;
import m7.C0356;
import m7.C0357;
import r7.C0404;
import s0.C0410;
import u2.C0433;
import y6.C0476;

/* JADX INFO: renamed from: h0.۟ۥ۟ۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0299 {

    /* JADX INFO: renamed from: ۢ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static int f447 = 609;

    /* JADX INFO: renamed from: ۣ۟۟۟۠, reason: not valid java name and contains not printable characters */
    public static l.t m5751(Object obj) {
        if (C0171.m3272() < 0) {
            return ((d7) obj).f9984g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m5752() {
        return 642 ^ C0189.f213;
    }

    /* JADX INFO: renamed from: ۟ۤۥۧۧ, reason: not valid java name and contains not printable characters */
    public static String m5753() {
        if (C0404.m7934() > 0) {
            return "without_filter";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۦ, reason: not valid java name and contains not printable characters */
    public static Cursor m5754(Object obj, Object obj2) {
        if (C0357.m7001() < 0) {
            return ((DownloadManager) obj).query((DownloadManager.Query) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5755(Object obj) {
        if (C0433.m8481() >= 0) {
            return ((File) obj).exists();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m5756() {
        if (C0339.m6658() < 0) {
            return "\u0ba4\u0bae\u0bbf\u0bb4\u0bcd";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m5757(Object obj, boolean z10) {
        if (C0032.m620() <= 0) {
            ((a5) obj).k(z10);
        }
    }

    /* JADX INFO: renamed from: ۡۧۡۥ, reason: not valid java name and contains not printable characters */
    public static t.p0 m5758(Object obj, Object obj2, int i10) {
        if (C0271.m5222() <= 0) {
            return t.e.q((String) obj, (m0.m) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡ۠, reason: not valid java name and contains not printable characters */
    public static l3 m5759(Object obj) {
        if (C0476.m9298() < 0) {
            return ((d5.a) obj).f4385c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۤ۟, reason: not valid java name and contains not printable characters */
    public static int m5760(Object obj) {
        if (C0257.m4918() >= 0) {
            return ((f5.b0) obj).f6237f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۥۣ۟, reason: not valid java name and contains not printable characters */
    public static t8.a m5761() {
        if (C0300.m5773() <= 0) {
            return t8.a.f14668a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۧ, reason: not valid java name and contains not printable characters */
    public static long m5762(Object obj) {
        if (C0032.m620() <= 0) {
            return ((m4) obj).f9232l;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۢۤ۠, reason: not valid java name and contains not printable characters */
    public static long m5763(Object obj) {
        if (C0246.m4717() < 0) {
            return ((q3) obj).f9397d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۢ, reason: contains not printable characters */
    public static String m5764() {
        if (C0296.m5709() < 0) {
            return "app_id=? AND property_name=?";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۡ۠, reason: contains not printable characters */
    public static Locale m5765() {
        if (C0410.m8063() >= 0) {
            return Locale.ROOT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۢ, reason: not valid java name and contains not printable characters */
    public static v8.a m5766() {
        if (C0356.m6984() >= 0) {
            return v8.a.f15963a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۧ, reason: not valid java name and contains not printable characters */
    public static int m5768(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۨۥ۟, reason: not valid java name and contains not printable characters */
    public static String m5769(String str) {
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

    /* JADX INFO: renamed from: ۣۨ۟۠, reason: not valid java name and contains not printable characters */
    public static String m5767(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
