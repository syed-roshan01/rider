package h5;

import a2.c0;
import a5.v;
import android.content.Context;
import androidx.compose.ui.graphics.C0030;
import androidx.compose.ui.layout.C0036;
import androidx.core.app.C0040;
import androidx.fragment.app.C0042;
import c1.C0061;
import com.google.android.gms.internal.measurement.zznd;
import d5.j1;
import dagger.hilt.android.lifecycle.C0237;
import f0.C0272;
import g2.C0286;
import i4.C0317;
import ja.C0330;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import k0.e5;
import k0.g4;
import k6.f;
import k6.o;
import k6.r7;
import l.q;
import n8.C0365;
import p7.n;
import s0.C0410;
import y.C0474;
import z4.d;

/* JADX INFO: renamed from: h5.ۧ۟ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0308 {

    /* JADX INFO: renamed from: ۨۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int f456 = -238;

    /* JADX INFO: renamed from: ۟۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m5950(Object obj) {
        if (C0474.m9246() < 0) {
            return ((g4) obj).f8957a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m5951(Object obj) {
        if (C0042.m820() > 0) {
            return ((o) obj).f10245d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۧۦ, reason: not valid java name and contains not printable characters */
    public static n m5952(Object obj) {
        if (C0237.m4583() >= 0) {
            return ((d) obj).f17210d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۦۥ, reason: not valid java name and contains not printable characters */
    public static void m5953(Object obj, int i10, Object obj2, Object obj3, Object obj4) {
        if (C0317.m6144() <= 0) {
            q.t((StringBuilder) obj, i10, (String) obj2, (String) obj3, (String) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m5954(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m5955(Object obj) {
        if (C0036.m698() < 0) {
            return ((v) obj).f1315c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨۨۧ, reason: not valid java name and contains not printable characters */
    public static long m5956(Object obj, Object obj2) {
        if (C0030.m575() >= 0) {
            return ((r7) obj).t((byte[]) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static c0 m5957(Object obj) {
        if (C0272.m5249() < 0) {
            return ((e5) obj).f8880a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5958() {
        if (C0410.m8063() >= 0) {
            return zznd.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۠ۤۥ, reason: contains not printable characters */
    public static void m5960(Object obj) {
        if (C0365.m7172() > 0) {
            ((m0.q) obj).W();
        }
    }

    /* JADX INFO: renamed from: ۥۣۥۣ, reason: contains not printable characters */
    public static Boolean m5961(Object obj) {
        if (C0330.m6374() >= 0) {
            return ((f) obj).f10013b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۟ۢ, reason: contains not printable characters */
    public static int m5962() {
        return 151 ^ C0286.f431;
    }

    /* JADX INFO: renamed from: ۦۦۧ, reason: contains not printable characters */
    public static void m5963(Object obj) throws IOException {
        if (C0061.m1161() < 0) {
            ((BufferedInputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static Context m5964(Object obj) {
        if (C0040.m792() > 0) {
            return ((j1) obj).f4589b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۧۦ, reason: not valid java name and contains not printable characters */
    public static int m5965(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m5959(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
