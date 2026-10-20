package m5;

import a6.C0007;
import a8.C0009;
import androidx.annotation.C0019;
import c1.C0061;
import com.auto.accept.data.model.AppConfig;
import com.google.firebase.annotations.C0128;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.remoteconfig.interop.C0198;
import com.google.gson.internal.bind.C0207;
import d5.e1;
import d5.f1;
import d8.C0221;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import e1.C0259;
import f0.c2;
import f5.c0;
import h.C0297;
import h8.C0314;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Executor;
import k0.g3;
import k0.t;
import k6.s6;
import k6.w6;
import l0.p;
import m0.g1;
import m0.l3;
import m0.n1;
import o7.d0;
import p7.C0378;
import q7.C0390;
import u.i1;
import w0.i;
import x.m;
import y0.o;
import y1.v;
import y9.C0479;
import z2.C0484;

/* JADX INFO: renamed from: m5.ۣۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0355 {

    /* JADX INFO: renamed from: ۟ۥۧۡۧ, reason: not valid java name and contains not printable characters */
    public static int f626 = -114;

    /* JADX INFO: renamed from: ۟۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static int m6961(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m6962() {
        if (C0314.m6079() >= 0) {
            return ".none.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۥ, reason: not valid java name and contains not printable characters */
    public static long m6963(Object obj) {
        if (C0378.m7420() >= 0) {
            return ((f1) obj).f4490n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨۥ, reason: not valid java name and contains not printable characters */
    public static long m6964(Object obj) {
        if (C0019.m375() < 0) {
            return ((g3) obj).f8952o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۨۡۢ, reason: not valid java name and contains not printable characters */
    public static void m6965(Object obj, Object obj2, Object obj3) {
        if (C0297.m5722() >= 0) {
            ((u6.b) obj).addListener((Runnable) obj2, (Executor) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static l3 m6966(Object obj) {
        if (C0009.m177() >= 0) {
            return ((e1) obj).f4472b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static int m6967(Object obj) {
        if (C0128.m2475() <= 0) {
            return ((f0.h) obj).f5727x;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۠۟, reason: not valid java name and contains not printable characters */
    public static int m6968() {
        return (-811) ^ C0484.f758;
    }

    /* JADX INFO: renamed from: ۠۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static float m6969() {
        if (C0479.m9346() > 0) {
            return p.f11106a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static String m6970(String str) {
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

    /* JADX INFO: renamed from: ۡۦۤ۠, reason: not valid java name and contains not printable characters */
    public static String m6972(Object obj) {
        if (C0259.m4959() <= 0) {
            return ((AppConfig) obj).getDialogButtonText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static o m6973(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, Object obj5, int i10) {
        if (C0221.m4264() > 0) {
            return androidx.compose.foundation.a.j((o) obj, (m) obj2, (i1) obj3, z10, (y1.g) obj4, (c9.a) obj5, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۧۤ, reason: not valid java name and contains not printable characters */
    public static n1 m6974(Object obj) {
        if (C0198.m3800() > 0) {
            return ((c2) obj).f5646k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static void m6975(Object obj, Object obj2) {
        if (C0390.m7643() <= 0) {
            ((t) obj).b((v) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦ۠ۨۨ, reason: contains not printable characters */
    public static u0.b m6976(Object obj) {
        if (C0153.m2938() <= 0) {
            return androidx.compose.ui.layout.a.i((o) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static s6 m6977(Object obj) {
        if (C0007.m154() <= 0) {
            return ((w6) obj).f10469d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m6978(Object obj) {
        if (C0061.m1161() <= 0) {
            ((i) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6979() {
        if (C0230.m4440() > 0) {
            return d0.P();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۧۦۤ, reason: not valid java name and contains not printable characters */
    public static String m6980(Object obj) {
        if (C0230.m4440() > 0) {
            return ((c0) obj).f6242d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static g1 m6981(Object obj) {
        if (C0207.m3957() >= 0) {
            return ((d5.d0) obj).f4448c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static String m6971(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
