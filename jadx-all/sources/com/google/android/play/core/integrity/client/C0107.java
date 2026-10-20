package com.google.android.play.core.integrity.client;

import android.os.IBinder;
import c1.C0061;
import com.auto.accept.data.model.SupportedApp;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.bundle.C0150;
import d1.c;
import f5.i;
import g5.C0292;
import h7.C0311;
import i4.a;
import j2.C0324;
import j3.C0326;
import j4.C0327;
import j5.C0328;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import k0.h4;
import k0.i4;
import k0.m4;
import k0.v2;
import k6.d;
import k6.l5;
import l3.C0343;
import n7.C0364;
import n8.C0366;
import p9.q0;
import s2.C0412;
import u8.e;
import y6.C0477;
import z.C0481;
import z3.C0488;
import z4.b;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.client.۟ۢ۟۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0107 {

    /* JADX INFO: renamed from: ۣ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static int f133 = -728;

    /* JADX INFO: renamed from: ۟۟ۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m2071(Object obj) {
        if (C0061.m1161() < 0) {
            return ((i) obj).f6274b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static String m2072(String str) {
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

    /* JADX INFO: renamed from: ۟۠۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2073(Object obj) {
        if (C0142.m2725() > 0) {
            return ((d) obj).g();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۢۥ, reason: not valid java name and contains not printable characters */
    public static int m2075() {
        return (-571) ^ C0343.f613;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m2076(Object obj) {
        if (C0292.m5605() < 0) {
            return ((h4) obj).f8982a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۦۡ۠, reason: not valid java name and contains not printable characters */
    public static int m2077(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static float m2078(long j10) {
        if (C0150.m2892() <= 0) {
            return c.e(j10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۡ, reason: not valid java name and contains not printable characters */
    public static q0 m2079(Object obj) {
        if (C0364.m7127() < 0) {
            return ((MainViewModel) obj).f3094h0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۨۥ, reason: not valid java name and contains not printable characters */
    public static a m2080() {
        if (C0327.m6304() <= 0) {
            return a.f8016a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۨۨ, reason: not valid java name and contains not printable characters */
    public static zzby m2081(Object obj) {
        if (C0074.m1607() <= 0) {
            return zzcb.zza((IBinder) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟۟, reason: not valid java name and contains not printable characters */
    public static int m2082(Object obj) {
        if (C0481.m9354() <= 0) {
            return ((v2) obj).f9551a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static List m2083(Object obj) {
        if (C0324.m6259() < 0) {
            return ((i4) obj).f9042a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۤۦ, reason: not valid java name and contains not printable characters */
    public static List m2084(Object obj) {
        if (C0412.m8066() <= 0) {
            return ((SupportedApp.Companion) obj).getALL_APPS();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨ۟, reason: not valid java name and contains not printable characters */
    public static void m2085(Object obj, Object obj2) {
        if (C0366.m7172() > 0) {
            ((b) obj).b((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static int m2086(Object obj) {
        if (C0328.m6319() < 0) {
            return ((zzfi.zzd) obj).zza();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۦۣ۠, reason: contains not printable characters */
    public static long m2087(Object obj) {
        if (C0326.m6295() > 0) {
            return ((m4) obj).H;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۦ۠ۨ, reason: contains not printable characters */
    public static Object m2088(Object obj) {
        if (C0488.m9496() < 0) {
            return ((l5) obj).f10194c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۢۥ, reason: not valid java name and contains not printable characters */
    public static Iterator m2089(Object obj) {
        if (C0311.m5997() > 0) {
            return ((List) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۧۧ, reason: not valid java name and contains not printable characters */
    public static void m2090(Object obj, Object obj2) {
        if (C0477.m9298() <= 0) {
            ((e) obj).resumeWith(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static String m2074(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
