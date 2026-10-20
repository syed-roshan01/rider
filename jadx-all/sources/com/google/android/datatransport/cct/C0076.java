package com.google.android.datatransport.cct;

import a0.C0003;
import com.auto.accept.data.model.AppConfig;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zznw;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.ktx.C0179;
import com.google.gson.internal.sql.C0208;
import d9.C0224;
import e6.c;
import fa.C0280;
import h0.h;
import java.io.ByteArrayOutputStream;
import java.util.List;
import l0.d;
import r1.x0;
import r7.C0405;
import s0.a;
import s7.C0416;
import x2.C0468;

/* JADX INFO: renamed from: com.google.android.datatransport.cct.۟۟ۧۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0076 {

    /* JADX INFO: renamed from: ۟ۦ۟۟, reason: not valid java name and contains not printable characters */
    public static int f110 = 711;

    /* JADX INFO: renamed from: ۟۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static String m1645(String str) {
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
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static c m1646() {
        if (C0082.m1758() >= 0) {
            return c.f5143a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m1647(Object obj) {
        if (C0468.m9101() <= 0) {
            return ((x0) obj).f13423a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦۡ, reason: not valid java name and contains not printable characters */
    public static int m1648(Object obj) {
        if (C0151.m2903() > 0) {
            return ((zzfi.zzl) obj).zza();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1649() {
        if (C0416.m8144() >= 0) {
            return zznw.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static zzfi.zzg.zza m1650(Object obj) {
        if (C0208.m3984() <= 0) {
            return ((zzfi.zzg.zza) obj).zze();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static Object m1651(Object obj) {
        if (C0179.m3417() > 0) {
            return ((a) obj).f13896a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۡ۠, reason: not valid java name and contains not printable characters */
    public static int m1652(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣۡۢ, reason: not valid java name and contains not printable characters */
    public static Integer m1653(Object obj) {
        if (C0224.m4304() < 0) {
            return ((h) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1654(Object obj) {
        if (C0280.m5406() < 0) {
            return ((zzfi.zzb) obj).zzg();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۧ, reason: contains not printable characters */
    public static int m1655() {
        return (-342) ^ C0003.f881;
    }

    /* JADX INFO: renamed from: ۥۦۢۤ, reason: contains not printable characters */
    public static List m1656(Object obj) {
        if (C0129.m2492() > 0) {
            return ((AppConfig) obj).getBlockedPackages();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠۠۠, reason: not valid java name and contains not printable characters */
    public static int m1658() {
        if (C0405.m7934() > 0) {
            return d.f11039e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۦۤۡ, reason: contains not printable characters */
    public static String m1657(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
