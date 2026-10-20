package e2;

import a2.b0;
import android.content.ContentValues;
import android.view.KeyCharacterMap;
import b1.d;
import c1.C0058;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.heartbeatinfo.C0167;
import d5.k;
import d5.z1;
import d7.t;
import d9.s;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.modules.C0235;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.C0253;
import dagger.hilt.internal.generatesrootinput.C0251;
import e1.y;
import f0.a2;
import f4.C0277;
import g.C0283;
import h.C0298;
import i1.f;
import j5.C0328;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import k0.g;
import k0.m4;
import k0.s3;
import k0.y1;
import k6.a5;
import k6.f5;
import k6.x5;
import k6.y5;
import k8.C0339;
import m0.m;
import o5.C0371;
import o7.d0;
import p3.C0376;
import r1.l0;
import u8.e;
import v0.C0442;
import x4.C0469;
import y.v;
import z3.C0486;

/* JADX INFO: renamed from: e2.ۨۥۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0264 {

    /* JADX INFO: renamed from: ۟۠ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static int f343 = 536;

    /* JADX INFO: renamed from: ۟۟, reason: not valid java name and contains not printable characters */
    public static e m5022(Object obj, Object obj2, Object obj3) {
        if (C0058.m1106() >= 0) {
            return ((z1) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static void m5023(Object obj, Object obj2, Object obj3) {
        if (C0122.m2355() >= 0) {
            ((ContentValues) obj).put((String) obj2, (Integer) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static Object m5024(Object obj) {
        if (C0229.m4402() >= 0) {
            return ((k) obj).f4597d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۥ۠, reason: not valid java name and contains not printable characters */
    public static int m5025(int i10, int i11) {
        if (C0339.m6645() <= 0) {
            return KeyCharacterMap.getDeadChar(i10, i11);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۤۦۢ, reason: not valid java name and contains not printable characters */
    public static String m5026(String str) {
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

    /* JADX INFO: renamed from: ۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m5028(Object obj) {
        if (C0235.m4512() > 0) {
            return ((s3) obj).f9456o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static y m5029(Object obj, float f10) {
        if (C0114.m2205() <= 0) {
            return t.O((d) obj, f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۥ, reason: not valid java name and contains not printable characters */
    public static long m5030(Object obj) {
        if (C0167.m3200() >= 0) {
            return ((m4) obj).f9221a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۨۧۦ, reason: not valid java name and contains not printable characters */
    public static k0.t m5031() {
        if (C0118.m2274() <= 0) {
            return k0.t.f9468n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static String m5032(Object obj) {
        if (C0283.m5446() >= 0) {
            return ((zzdd) obj).zzd;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟۠, reason: not valid java name and contains not printable characters */
    public static int m5033() {
        return (-626) ^ C0469.f739;
    }

    /* JADX INFO: renamed from: ۡۤۡۧ, reason: not valid java name and contains not printable characters */
    public static int m5034(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۦۨۡ, reason: not valid java name and contains not printable characters */
    public static void m5035(Object obj, Object obj2, Object obj3, float f10, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (C0328.m6319() < 0) {
            g.f((ArrayList) obj, (s) obj2, (l0) obj3, f10, (ArrayList) obj4, (ArrayList) obj5, (s) obj6, (ArrayList) obj7, (s) obj8, (s) obj9);
        }
    }

    /* JADX INFO: renamed from: ۣۡۦۡ, reason: not valid java name and contains not printable characters */
    public static int m5036(Object obj) {
        if (C0277.m5315() < 0) {
            return ((zzfi.zzj) obj).zzc();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m5037(Object obj) {
        if (C0251.m4793() >= 0) {
            return ((a5) obj).N();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5038(long j10, long j11) {
        if (C0253.m4832() <= 0) {
            return b0.a(j10, j11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۢ, reason: not valid java name and contains not printable characters */
    public static f5 m5039(Object obj) {
        if (C0486.m9449() <= 0) {
            return ((AppMeasurementDynamiteService) obj).f3409a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۧۢ, reason: contains not printable characters */
    public static f m5040() {
        if (C0371.m7269() > 0) {
            return d0.f12590s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۦۣ, reason: contains not printable characters */
    public static long m5041(Object obj) {
        if (C0104.m2034() <= 0) {
            return ((zzfi.zzj) obj).zzn();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣ۠۟, reason: contains not printable characters */
    public static long m5042(Object obj) {
        if (C0244.m4678() > 0) {
            return ((y1) obj).f9665a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m5043(Object obj, Object obj2, Object obj3, int i10) {
        if (C0339.m6645() <= 0) {
            ((d5.b) obj).a((v) obj2, (m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۧۤۥۡ, reason: not valid java name and contains not printable characters */
    public static a2 m5044(Object obj) {
        if (C0442.m8612() >= 0) {
            return ((f0.t) obj).f5904e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static zzfi.zze.zza m5045(Object obj, Object obj2) {
        if (C0116.m2247() > 0) {
            return ((zzfi.zze.zza) obj).zza((Iterable<? extends zzfi.zzg>) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5046(Object obj) {
        if (C0298.m5722() >= 0) {
            return ((y5) obj).f10571f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۨ۟۟, reason: not valid java name and contains not printable characters */
    public static x5 m5047() {
        if (C0376.m7362() >= 0) {
            return x5.f10535a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m5027(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
