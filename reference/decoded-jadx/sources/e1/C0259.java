package e1;

import android.os.Parcelable;
import c6.C0067;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.datatransport.cct.C0077;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfiginterop.C0203;
import d5.h1;
import d5.k2;
import dagger.hilt.android.C0240;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import e8.C0265;
import ea.C0267;
import f0.i1;
import f0.k1;
import h0.v0;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import k0.i2;
import k0.v4;
import k3.C0335;
import k6.a5;
import k6.c7;
import k6.p7;
import m0.g1;
import p0.C0374;
import q1.C0383;
import q9.C0391;
import u7.C0437;
import x4.C0468;

/* JADX INFO: renamed from: e1.ۦۣۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0259 {

    /* JADX INFO: renamed from: ۣۣ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static int f339 = -868;

    /* JADX INFO: renamed from: ۟۟ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static Parcelable.Creator m4944() {
        if (C0265.m5069() < 0) {
            return k6.e.CREATOR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static long m4945(Object obj) {
        if (C0075.m1631() < 0) {
            return ((k0.i0) obj).H;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m4946(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static c7 m4947(Object obj) {
        if (C0267.m5113() < 0) {
            return ((p7) obj).f10294i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static int m4948(Object obj) {
        if (C0335.m6500() <= 0) {
            return ((h1) obj).f4546e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤۨۧ, reason: not valid java name and contains not printable characters */
    public static g1 m4949(Object obj) {
        if (C0168.m3229() >= 0) {
            return ((k2) obj).f4617f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ۠, reason: not valid java name and contains not printable characters */
    public static c9.e m4950(Object obj) {
        if (C0201.m3855() < 0) {
            return ((i2) obj).f9025c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4952(Object obj) {
        if (C0108.m2101() < 0) {
            return ((v4) obj).f9575p;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static a2.c0 m4953(Object obj) {
        if (C0126.m2434() > 0) {
            return ((k0.p) obj).f9329d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡ, reason: not valid java name and contains not printable characters */
    public static int m4954(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۨۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4955(Object obj, Object obj2) {
        if (C0203.m3894() >= 0) {
            ((v0) obj).g((d1.c) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۦۡۨ, reason: not valid java name and contains not printable characters */
    public static String m4956() {
        if (C0077.m1663() <= 0) {
            return "Not updating daily counts, app is not known. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۢ۟, reason: not valid java name and contains not printable characters */
    public static void m4957(Object obj, boolean z10) {
        if (C0391.m7657() > 0) {
            ((HttpURLConnection) obj).setInstanceFollowRedirects(z10);
        }
    }

    /* JADX INFO: renamed from: ۣۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m4958(Object obj) {
        if (C0067.m1309() <= 0) {
            return ((f5.r) obj).f6318e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۥۨ, reason: not valid java name and contains not printable characters */
    public static int m4959() {
        return (-8) ^ C0468.f739;
    }

    /* JADX INFO: renamed from: ۤۤۢۤ, reason: not valid java name and contains not printable characters */
    public static void m4960(Object obj) {
        if (C0437.m8543() >= 0) {
            ((k1) obj).d();
        }
    }

    /* JADX INFO: renamed from: ۥۣۤ۟, reason: contains not printable characters */
    public static long m4961() {
        if (C0383.m7523() <= 0) {
            return i1.f5764j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣ, reason: contains not printable characters */
    public static int m4962(Object obj) {
        if (C0374.m7350() <= 0) {
            return ((d5.f) obj).f4480d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨۢۦ, reason: contains not printable characters */
    public static String m4963(Object obj) {
        if (C0240.m4609() > 0) {
            return ((a5) obj).f9877l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡ۟, reason: not valid java name and contains not printable characters */
    public static String m4964(Object obj) {
        if (C0231.m4453() <= 0) {
            return t7.c.b((Constructor) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥۧ, reason: not valid java name and contains not printable characters */
    public static String m4951(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
