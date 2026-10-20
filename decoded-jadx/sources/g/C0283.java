package g;

import android.content.Context;
import com.auto.accept.service.C0072;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.annotations.concurrent.C0126;
import d1.C0214;
import d5.a1;
import d7.t;
import g2.c0;
import h0.C0299;
import h0.v0;
import i.C0316;
import java.io.ByteArrayOutputStream;
import k0.a3;
import k0.b5;
import k0.i0;
import k0.i3;
import k0.m1;
import k0.m4;
import k6.d7;
import k6.p7;
import k6.s5;
import k6.u7;
import k6.w4;
import l0.C0340;
import l9.i;
import m0.m;
import m2.l;
import m7.C0356;
import n.C0361;
import o1.C0367;
import q2.C0384;
import w5.C0462;
import x4.C0469;
import y1.r;
import y1.u;

/* JADX INFO: renamed from: g.۟ۦۥۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0283 {

    /* JADX INFO: renamed from: ۟ۡۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int f428 = -414;

    /* JADX INFO: renamed from: ۟۠ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static long m5457(Object obj) {
        if (C0109.m2116() < 0) {
            return ((i0) obj).I;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static m4 m5458(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, Object obj, int i10) {
        if (C0072.m1556() >= 0) {
            return m1.d(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, (m) obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۨ۠, reason: not valid java name and contains not printable characters */
    public static w4 m5459(Object obj) {
        if (C0469.m9143() >= 0) {
            return ((d7) obj).f9982e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static u m5460() {
        if (C0112.m2176() > 0) {
            return r.f16840y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۨ, reason: not valid java name and contains not printable characters */
    public static int m5461(Object obj) {
        if (C0384.m7527() <= 0) {
            return ((b5) obj).f8765v;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۤ, reason: not valid java name and contains not printable characters */
    public static a3 m5462(Object obj) {
        if (C0116.m2247() >= 0) {
            return ((a1) obj).f4396d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m5463(String str) {
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

    /* JADX INFO: renamed from: ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m5464(Object obj) {
        if (C0299.m5752() <= 0) {
            return ((i3) obj).f9040q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۨۦ, reason: not valid java name and contains not printable characters */
    public static c0 m5465() {
        if (C0356.m6984() > 0) {
            return c0.f6517d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m5466(Object obj) {
        if (C0214.m4096() >= 0) {
            return ((zzfc.zzd) obj).zzp();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5467(Object obj) {
        if (C0340.m6681() >= 0) {
            return u7.Q((Context) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۤۢۨ, reason: contains not printable characters */
    public static int m5468() {
        return (-840) ^ C0367.f638;
    }

    /* JADX INFO: renamed from: ۥۥۥۨ, reason: contains not printable characters */
    public static void m5469(Object obj, Object obj2, Object obj3) {
        if (C0126.m2434() > 0) {
            ((p7) obj).j((String) obj2, (s5) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۦ۟ۧ, reason: contains not printable characters */
    public static l m5470() {
        if (C0361.m7097() < 0) {
            return l.f11816b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨۧ, reason: contains not printable characters */
    public static void m5472(Object obj, Object obj2, int i10) {
        if (C0469.m9143() >= 0) {
            t.l((v0) obj, (m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۦۦۦ, reason: contains not printable characters */
    public static int m5473(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۡۥۨ, reason: not valid java name and contains not printable characters */
    public static CharSequence m5474(Object obj) {
        if (C0462.m9013() < 0) {
            return i.o1((CharSequence) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static d5.l m5475() {
        if (C0316.m6120() <= 0) {
            return d5.l.G;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۧ, reason: contains not printable characters */
    public static String m5471(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
