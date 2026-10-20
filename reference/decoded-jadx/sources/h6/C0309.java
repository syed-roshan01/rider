package h6;

import a5.f0;
import a7.C0008;
import android.os.Parcel;
import android.support.v4.graphics.drawable.C0016;
import c1.C0059;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.iid.C0170;
import com.google.firebase.remoteconfig.interop.C0196;
import d1.C0212;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import dagger.hilt.android.migration.C0239;
import f0.c0;
import f0.u1;
import f5.e0;
import f5.q;
import g2.a0;
import g2.s;
import ga.C0295;
import h7.C0311;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import k0.l;
import k0.q3;
import k0.t3;
import k6.o;
import k6.s6;
import k6.x;
import k6.x3;
import l3.C0342;
import m0.g1;
import m0.m;
import n8.C0365;
import p7.C0378;
import p9.z;
import q6.C0386;
import r.C0392;
import u2.C0433;
import v.l1;
import w1.C0455;
import y.u0;

/* JADX INFO: renamed from: h6.ۧۧۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0309 {

    /* JADX INFO: renamed from: ۠۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static int f457 = -410;

    /* JADX INFO: renamed from: ۣ۟۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static long m5966() {
        if (C0170.m3247() <= 0) {
            return m2.i.f11807b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۦۢ۠, reason: not valid java name and contains not printable characters */
    public static int m5967(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m5968(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i11 = 0; i11 < length; i11++) {
            byteArray[i11] = (byte) (byteArray[i11] ^ str2.charAt(i11 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static g1 m5969(Object obj) {
        if (C0342.m6720() >= 0) {
            return ((d5.e) obj).f4458b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5970(Object obj, Object obj2) {
        if (C0100.m1959() < 0) {
            return ((o) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m5971() {
        return 95 ^ C0365.f636;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static long m5972(Object obj) {
        if (C0230.m4440() >= 0) {
            return ((a0) obj).f6510b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۦ, reason: not valid java name and contains not printable characters */
    public static void m5973(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        if (C0119.m2289() >= 0) {
            y3.e.c((String) obj, (String) obj2, (c9.a) obj3, (m) obj4, i10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static String m5974() {
        if (C0212.m4051() > 0) {
            return "Choose language and tap Save below";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m5975(Object obj, boolean z10) {
        if (C0239.m4596() > 0) {
            zzbw.zza((Parcel) obj, z10);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟, reason: not valid java name and contains not printable characters */
    public static u0 m5977(float f10) {
        if (C0008.m169() < 0) {
            return androidx.compose.foundation.layout.a.b(f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۥۧ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m5978(Object obj) {
        if (C0311.m6027() <= 0) {
            return ((q) obj).f6312b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۧ۟, reason: not valid java name and contains not printable characters */
    public static void m5979(Object obj, Object obj2) {
        if (C0196.m3762() <= 0) {
            ((s6) obj).v((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟۠, reason: not valid java name and contains not printable characters */
    public static long m5980(Object obj) {
        if (C0129.m2492() > 0) {
            return ((k6.e) obj).f9994o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m5981(Object obj) {
        if (C0118.m2274() < 0) {
            return ((f0) obj).f1254b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۥۣ, reason: not valid java name and contains not printable characters */
    public static String m5982() {
        if (C0295.m5679() > 0) {
            return "monitoring_ride_apps";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static l1 m5983(Object obj) {
        if (C0148.m2838() < 0) {
            return ((u1) obj).f5966b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۦ, reason: not valid java name and contains not printable characters */
    public static z m5984(Object obj) {
        if (C0016.m315() > 0) {
            return ((MainViewModel) obj).A0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5985(Object obj) {
        if (C0115.m2227() < 0) {
            return ((d5.z) obj).f4871a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۦۦ, reason: not valid java name and contains not printable characters */
    public static Object m5986(Object obj, Object obj2) {
        if (C0059.m1117() < 0) {
            return ((e0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۢ۠, reason: contains not printable characters */
    public static q3 m5987(Object obj) {
        if (C0102.m2007() > 0) {
            return ((t3) obj).f9491d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ۟۠, reason: contains not printable characters */
    public static long m5988(Object obj) {
        if (C0455.m8885() <= 0) {
            return ((q3) obj).f9403j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣۧۦ, reason: contains not printable characters */
    public static x3 m5989() {
        if (C0378.m7420() > 0) {
            return x.i0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨۥ, reason: contains not printable characters */
    public static s m5990(Object obj) {
        if (C0386.m7564() > 0) {
            return ((c0) obj).f5628a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۥۢ, reason: contains not printable characters */
    public static byte[] m5991(Object obj, int i10, int i11) {
        if (C0090.m1920() >= 0) {
            return o1.s.e0((FileInputStream) obj, i10, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨۢ, reason: not valid java name and contains not printable characters */
    public static String m5992() {
        if (C0116.m2247() > 0) {
            return "anti_detection_title";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۡ۠, reason: not valid java name and contains not printable characters */
    public static Object m5993(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5) {
        if (C0392.m7675() < 0) {
            return ((a4.q) obj).m((String) obj2, (String) obj3, (String) obj4, z10, (u8.e) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟۠, reason: not valid java name and contains not printable characters */
    public static int m5994(Object obj) {
        if (C0433.m8481() > 0) {
            return ((l) obj).f9135x;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨ۟, reason: not valid java name and contains not printable characters */
    public static String m5976(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
