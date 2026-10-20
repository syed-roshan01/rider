package e0;

import androidx.compose.ui.graphics.C0032;
import b7.C0054;
import c0.C0056;
import c3.C0063;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.annotations.concurrent.C0124;
import dagger.hilt.android.components.C0229;
import dagger.hilt.components.C0243;
import dagger.hilt.internal.C0252;
import f0.s;
import f0.s0;
import h0.v0;
import java.io.ByteArrayOutputStream;
import k0.m3;
import k0.u;
import k0.x0;
import k6.g5;
import k6.p6;
import k6.q6;
import k6.w4;
import k6.x;
import k6.x3;
import la.C0348;
import u.k1;
import u1.C0431;
import w0.p;
import x.k;
import y.i;
import z1.C0483;
import z2.C0484;
import z3.C0486;

/* JADX INFO: renamed from: e0.ۦۣ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0256 {

    /* JADX INFO: renamed from: ۤۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int f336 = -856;

    /* JADX INFO: renamed from: ۟۟۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m4891() {
        if (C0486.m9464() > 0) {
            return "history";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۥۤ, reason: not valid java name and contains not printable characters */
    public static v0 m4892(Object obj) {
        if (C0484.m9436() < 0) {
            return ((s) obj).f5882a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static q6 m4893(Object obj) {
        if (C0054.m1047() > 0) {
            return ((p6) obj).f10282i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static int m4894(Object obj) {
        if (C0252.m4832() < 0) {
            return ((w4) obj).f10454a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static String m4895(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢۢۦ, reason: not valid java name and contains not printable characters */
    public static Object m4896(Object obj, float f10, Object obj2, Object obj3, Object obj4) {
        if (C0483.m9403() > 0) {
            return x0.a((t.d) obj, f10, (k) obj2, (k) obj3, (u8.e) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۡۧ, reason: not valid java name and contains not printable characters */
    public static int m4897(Object obj) {
        if (C0229.m4421() <= 0) {
            return ((s0) obj).f5892c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4898(Object obj) {
        if (C0056.m1077() < 0) {
            return ((g5) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۡ, reason: not valid java name and contains not printable characters */
    public static i m4899(Object obj) {
        if (C0063.m1217() > 0) {
            return ((u) obj).f9513o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m4900(Object obj) {
        if (C0032.m620() < 0) {
            return p.e((c9.c) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۤ, reason: not valid java name and contains not printable characters */
    public static int m4901() {
        return (-351) ^ C0348.f619;
    }

    /* JADX INFO: renamed from: ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static x3 m4902() {
        if (C0431.m8447() < 0) {
            return x.Q0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۡ۟, reason: not valid java name and contains not printable characters */
    public static float m4903(long j10) {
        if (C0243.m4678() > 0) {
            return d1.c.d(j10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۠ۥۤۧ, reason: not valid java name and contains not printable characters */
    public static Object m4904(Object obj, Object obj2) {
        if (C0124.m2386() > 0) {
            return ((m3) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟۠۟, reason: not valid java name and contains not printable characters */
    public static long m4905(int i10) {
        if (C0119.m2289() >= 0) {
            return k1.a(i10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦ۠ۦۡ, reason: contains not printable characters */
    public static int m4906(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۡۤ۟, reason: not valid java name and contains not printable characters */
    public static int m4908(Object obj) {
        if (C0100.m1959() < 0) {
            return ((z4.f) obj).f17232b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۨۤ, reason: not valid java name and contains not printable characters */
    public static String m4907(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
