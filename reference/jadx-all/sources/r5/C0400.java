package r5;

import a2.C0005;
import android.content.SharedPreferences;
import android.support.v4.graphics.drawable.C0016;
import c1.C0061;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.emulators.C0140;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.reporting.C0190;
import d5.x0;
import d7.C0220;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.migration.C0239;
import dagger.hilt.migration.C0255;
import f5.v;
import java.io.ByteArrayOutputStream;
import java.util.Comparator;
import java.util.List;
import k.C0332;
import k0.i2;
import k0.i3;
import k0.m4;
import k6.c7;
import k6.p4;
import m3.C0353;
import m9.e0;
import n7.C0365;
import o1.z;
import t0.C0419;

/* JADX INFO: renamed from: r5.۟ۤۨۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0400 {

    /* JADX INFO: renamed from: ۠ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static int f670 = 2;

    /* JADX INFO: renamed from: ۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static long m7812() {
        if (C0239.m4587() <= 0) {
            return l0.c.I;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Object m7814(Object obj, Object obj2) {
        if (C0061.m1161() <= 0) {
            return ((v) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static String m7815(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7816(float f10, float f11) {
        if (C0185.m3538() >= 0) {
            return m2.e.a(f10, f11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7817(Object obj) {
        if (C0332.m6408() < 0) {
            return ((i3) obj).f9033c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static long m7818(Object obj) {
        if (C0220.m4237() > 0) {
            return ((m4) obj).L;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7819(Object obj) {
        if (C0088.m1874() >= 0) {
            return ((zzfi.zzj) obj).zzat();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object m7820(Object obj, Object obj2, Object obj3) {
        if (C0016.m315() > 0) {
            return e0.q((z) obj, (c9.e) obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m7821(Object obj) {
        if (C0005.m104() >= 0) {
            return ((x0) obj).f4843d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۧۤ, reason: not valid java name and contains not printable characters */
    public static int m7822(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m7823(Object obj, Object obj2) {
        if (C0231.m4440() > 0) {
            r8.m.z0((List) obj, (Comparator) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m7824(Object obj, Object obj2) {
        if (C0419.m8221() >= 0) {
            ((SharedPreferences) obj).registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static p4 m7825(Object obj) {
        if (C0076.m1655() >= 0) {
            return ((c7) obj).f9944g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۢۥ, reason: not valid java name and contains not printable characters */
    public static int m7826(Object obj) {
        if (C0365.m7147() < 0) {
            return ((i2) obj).f9023a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۢۧۤ, reason: not valid java name and contains not printable characters */
    public static a5.z m7827(Object obj) {
        if (C0353.m6904() < 0) {
            return ((MainViewModel) obj).f3085d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۥ۟, reason: contains not printable characters */
    public static int m7828() {
        return 1003 ^ C0140.f166;
    }

    /* JADX INFO: renamed from: ۦۣۤۤ, reason: contains not printable characters */
    public static boolean m7829(int i10, int i11, int i12, Object obj, Object obj2, boolean z10) {
        if (C0255.m4866() <= 0) {
            return l9.i.Y0(i10, i11, i12, (String) obj, (String) obj2, z10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static int m7830(Object obj) {
        if (C0190.m3639() > 0) {
            return ((zzew.zzf) obj).zza();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static String m7813(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
