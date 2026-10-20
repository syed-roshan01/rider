package c6;

import android.os.Bundle;
import b.C0049;
import c0.C0056;
import c1.C0060;
import c7.C0068;
import com.auto.accept.data.model.AppConfig;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.tracing.C0204;
import d1.C0211;
import d5.c0;
import d5.s0;
import e0.e;
import f0.z;
import g.C0284;
import h0.v0;
import i.C0315;
import i3.a0;
import java.io.ByteArrayOutputStream;
import k0.b1;
import k0.d4;
import k0.g0;
import k0.p2;
import k0.t0;
import k0.t1;
import k4.C0336;
import l.t;
import m0.m;
import m0.q2;
import m5.C0354;
import n9.C0366;
import r1.x0;
import v0.C0440;
import w1.C0455;
import w4.C0459;
import z2.C0484;
import z4.d;

/* JADX INFO: renamed from: c6.۟ۧۧ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0067 {

    /* JADX INFO: renamed from: ۟ۧ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static int f87 = -808;

    /* JADX INFO: renamed from: ۟۟۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static x0 m1293(Object obj) {
        if (C0162.m3105() > 0) {
            return ((t1) obj).f9480o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۦۨ, reason: not valid java name and contains not printable characters */
    public static String m1294(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۢۡۡ, reason: not valid java name and contains not printable characters */
    public static float m1295(Object obj) {
        if (C0130.m2511() >= 0) {
            return ((d4) obj).f8837b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢۨۦ۟, reason: not valid java name and contains not printable characters */
    public static int m1296(Object obj) {
        if (C0211.m4046() >= 0) {
            return ((s0) obj).f4770c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1297(Object obj) {
        if (C0336.m6515() < 0) {
            return ((c0) obj).f4430d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦۢ, reason: not valid java name and contains not printable characters */
    public static long m1298(Object obj) {
        if (C0088.m1874() >= 0) {
            return ((b1) obj).f8728a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡۦ, reason: not valid java name and contains not printable characters */
    public static g0 m1299(long j10, Object obj, int i10) {
        if (C0056.m1077() < 0) {
            return t0.d(j10, (m) obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۥ, reason: not valid java name and contains not printable characters */
    public static String m1300(Object obj) {
        if (C0315.m6111() >= 0) {
            return ((AppConfig) obj).getMaintenanceMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۧۡ, reason: not valid java name and contains not printable characters */
    public static void m1301(Object obj) {
        if (C0049.m945() > 0) {
            ((z) obj).m5213invoke();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static p9.z m1302(Object obj) {
        if (C0459.m8951() <= 0) {
            return ((d) obj).f17222w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m1303(Object obj) {
        if (C0354.m6953() <= 0) {
            return ((zzfc.zzc.zza) obj).zzc();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۧۨۥ, reason: not valid java name and contains not printable characters */
    public static String m1304() {
        if (C0440.m8597() >= 0) {
            return "Database error querying filters. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۧۧ, reason: not valid java name and contains not printable characters */
    public static String m1305(Object obj) {
        if (C0204.m3905() < 0) {
            return ((zzew.zzd) obj).zzd();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۨۨ, reason: not valid java name and contains not printable characters */
    public static int m1306(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static e m1307() {
        if (C0068.m1322() > 0) {
            return p2.f9353a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۣ۟, reason: not valid java name and contains not printable characters */
    public static int m1309() {
        return (-270) ^ C0085.f119;
    }

    /* JADX INFO: renamed from: ۥۢۨۨ, reason: contains not printable characters */
    public static m0.s0 m1310(Object obj, int i10) {
        if (C0284.m5483() > 0) {
            return ((q2) obj).H(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢۦ, reason: contains not printable characters */
    public static p9.z m1311(Object obj) {
        if (C0366.m7189() >= 0) {
            return ((MainViewModel) obj).f3114s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۥۤ, reason: contains not printable characters */
    public static String m1312() {
        if (C0484.m9436() < 0) {
            return "(2)Read invalid user property value, ignoring it";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠۠, reason: not valid java name and contains not printable characters */
    public static Bundle m1313(Object obj) {
        if (C0455.m8885() <= 0) {
            return ((a0) obj).h();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢ, reason: not valid java name and contains not printable characters */
    public static void m1314(Object obj, Object obj2, Object obj3, Object obj4, long j10) {
        if (C0060.m1148() >= 0) {
            ((t) obj).e((String) obj2, (String) obj3, (Bundle) obj4, j10);
        }
    }

    /* JADX INFO: renamed from: ۣۨۨۧ, reason: not valid java name and contains not printable characters */
    public static void m1315(Object obj) {
        if (C0116.m2247() >= 0) {
            ((v0) obj).f();
        }
    }

    /* JADX INFO: renamed from: ۢۦۡۡ, reason: not valid java name and contains not printable characters */
    public static String m1308(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
