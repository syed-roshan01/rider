package ia;

import android.content.Intent;
import android.media.ToneGenerator;
import c4.C0064;
import c9.e;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.measurement.C0184;
import d5.k;
import e0.C0256;
import e8.c2;
import g2.a0;
import h0.v0;
import h8.n;
import java.io.ByteArrayOutputStream;
import java.net.URLConnection;
import k0.c3;
import k0.p1;
import k0.q1;
import k0.v3;
import k6.a5;
import k6.q5;
import k6.u7;
import m1.C0351;
import p9.z;
import q7.C0390;
import r1.x0;
import s3.C0412;
import s7.C0414;
import t1.C0419;
import t8.C0426;
import w2.C0458;
import x.m;
import x7.C0471;

/* JADX INFO: renamed from: ia.۟۠ۡۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0322 {

    /* JADX INFO: renamed from: ۟ۥۥۧۡ, reason: not valid java name and contains not printable characters */
    public static int f470 = 127;

    /* JADX INFO: renamed from: ۟۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6230(Object obj, int i10, int i11) {
        if (C0412.m8089() <= 0) {
            return ((ToneGenerator) obj).startTone(i10, i11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨۨۧ, reason: not valid java name and contains not printable characters */
    public static a0 m6231(Object obj) {
        if (C0471.m9190() <= 0) {
            return ((v0) obj).k();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static m m6232(Object obj) {
        if (C0163.m3132() > 0) {
            return ((v3) obj).f9564p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6233(Object obj) {
        if (C0064.m1243() > 0) {
            return ((a5) obj).f9881p;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static int m6234(Object obj) {
        if (C0184.m3517() >= 0) {
            return ((v3) obj).f9566r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۥۧۢ, reason: not valid java name and contains not printable characters */
    public static x0 m6235(Object obj) {
        if (C0414.m8130() < 0) {
            return ((c3) obj).f8792a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static q5 m6236() {
        if (C0426.m8356() < 0) {
            return q5.f10320b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m6237(String str) {
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

    /* JADX INFO: renamed from: ۣۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m6238(Object obj) {
        if (C0419.m8247() >= 0) {
            return ((k) obj).f4595b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦ۠, reason: not valid java name and contains not printable characters */
    public static z m6239(Object obj) {
        if (C0142.m2725() >= 0) {
            return ((MainViewModel) obj).f3092g0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int m6241(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static e m6242(Object obj) {
        if (C0471.m9190() <= 0) {
            return ((q1) obj).f9376d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢ۟, reason: not valid java name and contains not printable characters */
    public static c2 m6243(Object obj) {
        if (C0458.m8930() > 0) {
            return ((n) obj).f7693v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۠, reason: contains not printable characters */
    public static int m6244() {
        return 527 ^ C0351.f622;
    }

    /* JADX INFO: renamed from: ۦۥ۠ۢ, reason: contains not printable characters */
    public static void m6245(Object obj, boolean z10) {
        if (C0390.m7643() < 0) {
            ((URLConnection) obj).setDoOutput(z10);
        }
    }

    /* JADX INFO: renamed from: ۣۧۤۢ, reason: not valid java name and contains not printable characters */
    public static String m6246() {
        if (C0144.m2767() >= 0) {
            return "dev_options_guide";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6247(Object obj) {
        if (C0256.m4901() < 0) {
            return u7.R((Intent) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۡۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6248(Object obj) {
        if (C0131.m2522() >= 0) {
            return ((p1) obj).f9338e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m6240(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
