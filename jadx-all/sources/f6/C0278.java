package f6;

import a2.e;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.node.C0037;
import c1.C0061;
import com.google.android.gms.internal.measurement.zzpa;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.reporting.C0189;
import com.google.protobuf.v;
import d4.C0218;
import d5.k2;
import d5.m;
import d5.v0;
import d5.x;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.lifecycle.C0237;
import f0.a0;
import f0.c2;
import f0.j;
import f0.q0;
import f4.C0276;
import f4.C0277;
import h.C0298;
import h8.C0314;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import k0.j2;
import k6.f5;
import k6.h;
import k6.p6;
import l2.C0342;
import m0.g1;
import m0.l3;
import m1.C0351;
import r2.C0398;
import s1.i;
import s2.C0412;
import s3.C0413;
import u3.C0435;
import v0.C0441;
import w2.C0457;
import w2.C0458;
import y.i1;
import y.l1;
import y0.o;

/* JADX INFO: renamed from: f6.ۣۣۣۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0278 {

    /* JADX INFO: renamed from: ۟۠ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static int f422 = -434;

    /* JADX INFO: renamed from: ۟۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static void m5358(Object obj, long j10) {
        if (C0151.m2903() > 0) {
            ((v) obj).K0(j10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static FirebaseUser m5359(Object obj) {
        if (C0276.m5308() >= 0) {
            return ((FirebaseAuth) obj).getCurrentUser();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۤۦ, reason: not valid java name and contains not printable characters */
    public static void m5360(Object obj, int i10, Object obj2) {
        if (C0412.m8066() < 0) {
            ((NotificationManager) obj).notify(i10, (Notification) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m5361() {
        return (-145) ^ C0185.f209;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static i m5362() {
        if (C0398.m7764() < 0) {
            return l1.f16628a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static m m5363() {
        if (C0435.m8498() < 0) {
            return m.f4653b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۣ, reason: not valid java name and contains not printable characters */
    public static long m5364() {
        if (C0218.m4144() >= 0) {
            return zzpa.zzb();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۠, reason: not valid java name and contains not printable characters */
    public static PackageInfo m5365(Object obj, int i10, Object obj2) {
        if (C0298.m5722() >= 0) {
            return ((j.a) obj).d(i10, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۡ۟, reason: not valid java name and contains not printable characters */
    public static g5.a m5366(Object obj) {
        if (C0441.m8597() > 0) {
            return ((d5.l1) obj).f4651b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣ۟, reason: not valid java name and contains not printable characters */
    public static g1 m5367(Object obj) {
        if (C0234.m4495() < 0) {
            return ((x) obj).f4835d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m5368(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۦۤۥ, reason: not valid java name and contains not printable characters */
    public static String m5369(Object obj) {
        if (C0458.m8901() < 0) {
            return ((e) obj).f918a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m5370(Object obj) {
        if (C0413.m8089() < 0) {
            return ((q0) obj).f5858a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۥۣ, reason: not valid java name and contains not printable characters */
    public static i1 m5372(Object obj) {
        if (C0237.m4549() <= 0) {
            return ((j2) obj).f9071n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5373(char c10) {
        if (C0457.m8890() >= 0) {
            return Character.isDigit(c10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۧۡ, reason: not valid java name and contains not printable characters */
    public static l3 m5374(Object obj) {
        if (C0277.m5315() < 0) {
            return ((v0) obj).f4805p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۨۨ, reason: not valid java name and contains not printable characters */
    public static o m5375(Object obj) {
        if (C0037.m733() > 0) {
            return c.m((o) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m5376(String str) {
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

    /* JADX INFO: renamed from: ۤۡۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m5377(Object obj, Object obj2) {
        if (C0189.m3621() > 0) {
            return ((HashMap) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۨ, reason: not valid java name and contains not printable characters */
    public static c2 m5378(Object obj) {
        if (C0061.m1161() < 0) {
            return ((a0) obj).f5590c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5379(Object obj) {
        if (C0143.m2751() >= 0) {
            return ((p6) obj).f10284k;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۧۦ, reason: contains not printable characters */
    public static l3 m5380(Object obj) {
        if (C0314.m6072() < 0) {
            return ((k2) obj).f4620p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۡ۟, reason: contains not printable characters */
    public static void m5381(Object obj, Object obj2) {
        if (C0298.m5722() > 0) {
            ((SharedPreferences) obj).unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۡۢ, reason: not valid java name and contains not printable characters */
    public static h m5382(Object obj) {
        if (C0351.m6878() <= 0) {
            return ((f5) obj).f10029f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۢۤ, reason: not valid java name and contains not printable characters */
    public static void m5383(Object obj, Object obj2) {
        if (C0342.m6699() <= 0) {
            ((ConnectivityManager) obj).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۦۢۧ, reason: not valid java name and contains not printable characters */
    public static int m5384(Object obj) {
        if (C0218.m4144() >= 0) {
            return ((j) obj).f5792a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m5371(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
